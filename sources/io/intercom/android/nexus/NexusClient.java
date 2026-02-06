package io.intercom.android.nexus;

import com.intercom.twig.Twig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import rh.C6703A;

public class NexusClient implements NexusTopicProvider {
    private ScheduledExecutorService backgroundTaskExecutor;
    private final C6703A client;
    private final NexusEventPropagator eventPropagator;
    private ScheduledFuture future;
    private long heartbeatInterval;
    private final List<NexusSocket> sockets;
    private final List<String> topics;
    private final Twig twig;

    private static class NexusThreadFactory implements ThreadFactory {
        private final ThreadFactory defaultFactory;
        private int threadCount;

        private NexusThreadFactory() {
            this.defaultFactory = Executors.defaultThreadFactory();
            this.threadCount = 0;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.defaultFactory.newThread(runnable);
            this.threadCount++;
            newThread.setName("IntercomNexus-" + this.threadCount);
            return newThread;
        }
    }

    public NexusClient(Twig twig2) {
        this(twig2, defaultOkHttpClientBuilder().c());
    }

    public static C6703A.a defaultOkHttpClientBuilder() {
        C6703A.a aVar = new C6703A.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVar.S(130, timeUnit).W(130, timeUnit).f(20, timeUnit);
    }

    /* access modifiers changed from: private */
    public void schedulePing() {
        if (this.heartbeatInterval > 0) {
            this.future = this.backgroundTaskExecutor.schedule(new Runnable() {
                public void run() {
                    NexusClient.this.fire(NexusEvent.getPingEvent());
                    NexusClient.this.schedulePing();
                }
            }, this.heartbeatInterval, TimeUnit.SECONDS);
        }
    }

    private void subscribeToTopics(List<String> list) {
        if (!list.isEmpty()) {
            fire(NexusEvent.getSubscribeEvent(list));
        }
    }

    private void unSubscribeFromTopics(List<String> list) {
        if (!list.isEmpty()) {
            fire(NexusEvent.getUnsubscribeEvent(list));
        }
    }

    public void addEventListener(NexusListener nexusListener) {
        this.eventPropagator.addListener(nexusListener);
    }

    public synchronized void addTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        subscribeToTopics(arrayList);
        this.topics.addAll(arrayList);
    }

    public synchronized void clearTopics() {
        unSubscribeFromTopics(this.topics);
        this.topics.clear();
    }

    public void connect(NexusConfig nexusConfig, boolean z10) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.e("No endpoints present", new Object[0]);
            return;
        }
        if (this.backgroundTaskExecutor == null) {
            this.backgroundTaskExecutor = Executors.newScheduledThreadPool(nexusConfig.getEndpoints().size() + 1, new NexusThreadFactory());
        }
        for (String nexusSocket : nexusConfig.getEndpoints()) {
            this.twig.i("Adding socket", new Object[0]);
            NexusSocket nexusSocket2 = new NexusSocket(nexusSocket, nexusConfig.getConnectionTimeout(), z10, this.twig, this.backgroundTaskExecutor, this.client, this.eventPropagator, this);
            nexusSocket2.connect();
            this.sockets.add(nexusSocket2);
        }
        this.heartbeatInterval = (long) nexusConfig.getPresenceHeartbeatInterval();
        if (z10) {
            schedulePing();
        }
    }

    public synchronized void disconnect() {
        try {
            if (!this.sockets.isEmpty()) {
                for (NexusSocket disconnect : this.sockets) {
                    this.twig.i("disconnecting socket", new Object[0]);
                    disconnect.disconnect();
                }
                this.sockets.clear();
                this.twig.i("client disconnected", new Object[0]);
            }
            ScheduledFuture scheduledFuture = this.future;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void fire(NexusEvent nexusEvent) {
        this.eventPropagator.cacheEvent(nexusEvent);
        String stringEncodedJsonObject = nexusEvent.toStringEncodedJsonObject();
        if (!stringEncodedJsonObject.isEmpty()) {
            for (NexusSocket fire : this.sockets) {
                fire.fire(stringEncodedJsonObject);
            }
        }
    }

    public synchronized List<String> getTopics() {
        return this.topics;
    }

    public synchronized boolean isConnected() {
        for (NexusSocket isConnected : this.sockets) {
            if (isConnected.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void localUpdate(NexusEvent nexusEvent) {
        this.eventPropagator.notifyEvent(nexusEvent);
    }

    public void removeEventListener(NexusListener nexusListener) {
        this.eventPropagator.removeListener(nexusListener);
    }

    public synchronized void removeTopics(List<String> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (this.topics.contains(next)) {
                    arrayList.add(next);
                }
            }
            unSubscribeFromTopics(arrayList);
            this.topics.removeAll(arrayList);
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void setTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        ArrayList arrayList2 = new ArrayList(this.topics);
        arrayList2.removeAll(list);
        subscribeToTopics(arrayList);
        unSubscribeFromTopics(arrayList2);
        this.topics.clear();
        this.topics.addAll(list);
    }

    public NexusClient(Twig twig2, C6703A a10) {
        this(twig2, a10, new NexusEventPropagator(twig2));
    }

    NexusClient(Twig twig2, C6703A a10, NexusEventPropagator nexusEventPropagator) {
        this.sockets = new ArrayList();
        this.topics = new ArrayList();
        this.twig = twig2;
        this.eventPropagator = nexusEventPropagator;
        this.client = a10;
    }
}
