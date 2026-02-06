package io.intercom.android.nexus;

import Gh.C5407h;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.intercom.twig.Twig;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.I;
import rh.J;

class NexusSocket {
    private static final I CLOSED_SOCKET = new I() {
        public void cancel() {
        }

        public boolean close(int i10, String str) {
            return false;
        }

        public long queueSize() {
            return 0;
        }

        public C request() {
            throw new NullPointerException("ClosedSocket has no request");
        }

        public boolean send(String str) {
            return false;
        }

        public boolean send(C5407h hVar) {
            return false;
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.1.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;
    private final C6703A client;
    private final long connectionTimeoutSeconds;
    private long lastReconnectAt = 0;
    /* access modifiers changed from: private */
    public final NexusListener listener;
    private int reconnectAttempts = 0;
    /* access modifiers changed from: private */
    public ScheduledFuture reconnectFuture;
    /* access modifiers changed from: private */
    public final boolean shouldSendPing;
    /* access modifiers changed from: private */
    public I socket = CLOSED_SOCKET;
    private final ScheduledExecutorService timeoutExecutor;
    private ScheduledFuture timeoutFuture;
    private final Runnable timeoutRunnable = new Runnable() {
        public void run() {
            NexusSocket.this.timedOut();
        }
    };
    /* access modifiers changed from: private */
    public final NexusTopicProvider topicProvider;
    /* access modifiers changed from: private */
    public final Twig twig;
    private final String url;
    private final J webSocketListener = new J() {
        private void parseJsonString(String str) {
            if (!str.isEmpty() && !str.equals(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) && !str.endsWith(f.f37531c)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("eventName");
                    if (!optString.isEmpty()) {
                        if (!optString.equals("ACK")) {
                            Twig access$200 = NexusSocket.this.twig;
                            access$200.internal("onMessage TEXT: " + str);
                            NexusSocket.this.listener.notifyEvent(new NexusEvent(jSONObject));
                            return;
                        }
                    }
                    Twig access$2002 = NexusSocket.this.twig;
                    access$2002.internal("onMessage ACK: " + str);
                } catch (JSONException e10) {
                    Twig access$2003 = NexusSocket.this.twig;
                    access$2003.internal("onMessage: json parse exception for message: '" + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + e10);
                }
            }
        }

        public void onClosed(I i10, int i11, String str) {
            if (i11 != NexusSocket.OK_CLIENT_DISCONNECT) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            Twig access$200 = NexusSocket.this.twig;
            access$200.internal("onClose code: " + i11 + " reason: " + str);
        }

        public void onClosing(I i10, int i11, String str) {
            Twig access$200 = NexusSocket.this.twig;
            access$200.internal("Server requested close:  " + i11 + " - '" + str + "'");
            i10.close(i11, str);
        }

        public void onFailure(I i10, Throwable th2, E e10) {
            if (NexusSocket.shouldReconnectFromFailure(e10)) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            Twig access$200 = NexusSocket.this.twig;
            access$200.internal("onFailure: " + th2.getMessage());
            NexusSocket.this.listener.onConnectFailed();
        }

        public void onMessage(I i10, String str) {
            NexusSocket.this.resetTimeout();
            parseJsonString(str);
        }

        public void onOpen(I i10, E e10) {
            Twig access$200 = NexusSocket.this.twig;
            access$200.internal("onOpen: " + e10.M());
            I unused = NexusSocket.this.socket = i10;
            NexusSocket.this.resetTimeout();
            List<String> topics = NexusSocket.this.topicProvider.getTopics();
            if (!topics.isEmpty()) {
                NexusSocket.this.fire(NexusEvent.getSubscribeEvent(topics).toStringEncodedJsonObject());
            }
            if (NexusSocket.this.shouldSendPing) {
                NexusSocket.this.fire(NexusEvent.getPingEvent().toStringEncodedJsonObject());
            }
            NexusSocket.this.listener.onConnect();
        }

        public void onMessage(I i10, C5407h hVar) {
            Twig access$200 = NexusSocket.this.twig;
            access$200.internal("Received bytes message " + hVar + ", resetting timeout");
            NexusSocket.this.resetTimeout();
        }
    };

    NexusSocket(String str, int i10, boolean z10, Twig twig2, ScheduledExecutorService scheduledExecutorService, C6703A a10, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = str;
        this.connectionTimeoutSeconds = (long) i10;
        this.shouldSendPing = z10;
        this.twig = twig2;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.client = a10;
        this.timeoutExecutor = scheduledExecutorService;
    }

    static long calculateReconnectTimerInSeconds(int i10) {
        int min = (int) Math.min(Math.pow(2.0d, (double) i10), 900.0d);
        return (long) (min + new Random().nextInt(min + 1));
    }

    private void modifyReconnectAttempts() {
        if (System.currentTimeMillis() - this.lastReconnectAt > TimeUnit.SECONDS.toMillis(900) * 2) {
            this.twig.d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            this.twig.d("incrementing reconnection attempts", new Object[0]);
            this.reconnectAttempts++;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    public void scheduleReconnect() {
        if (this.reconnectFuture == null) {
            modifyReconnectAttempts();
            long calculateReconnectTimerInSeconds = calculateReconnectTimerInSeconds(this.reconnectAttempts);
            Twig twig2 = this.twig;
            twig2.internal("Scheduling reconnect in: " + calculateReconnectTimerInSeconds + " for attempt: " + this.reconnectAttempts);
            this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable() {
                public void run() {
                    NexusSocket.this.connect();
                    ScheduledFuture unused = NexusSocket.this.reconnectFuture = null;
                }
            }, calculateReconnectTimerInSeconds, TimeUnit.SECONDS);
        }
    }

    static boolean shouldReconnectFromFailure(E e10) {
        if (e10 == null) {
            return true;
        }
        int o10 = e10.o();
        if (o10 < 500 || o10 > 599) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    /* access modifiers changed from: private */
    public void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            scheduleReconnect();
        } else {
            disconnect(N_TIMEOUT_DISCONNECT, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    /* access modifiers changed from: package-private */
    public void connect() {
        this.twig.d("connecting to a socket...", new Object[0]);
        C.a aVar = new C.a();
        this.client.C(aVar.l(this.url + HEADER).b(), this.webSocketListener);
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public void disconnect() {
        disconnect(OK_CLIENT_DISCONNECT, "Disconnect called by client");
    }

    /* access modifiers changed from: package-private */
    public void fire(String str) {
        if (!str.isEmpty()) {
            try {
                Twig twig2 = this.twig;
                twig2.internal("firing: " + str);
                this.socket.send(str);
            } catch (IllegalStateException e10) {
                Twig twig3 = this.twig;
                twig3.internal("Error when firing '" + str + "': " + e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isConnected() {
        if (this.socket != CLOSED_SOCKET) {
            return true;
        }
        return false;
    }

    private void disconnect(int i10, String str) {
        if (!this.socket.close(i10, str)) {
            this.twig.internal("Could not close socket while disconnecting, it may be already closed");
        }
    }
}
