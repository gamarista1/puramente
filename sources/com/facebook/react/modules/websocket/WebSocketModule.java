package com.facebook.react.modules.websocket;

import Gh.C5407h;
import com.adjust.sdk.network.ErrorCodes;
import com.amazon.a.a.o.b.f;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.e;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.I;
import rh.J;

@Q7.a(name = "WebSocketModule")
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    private static c customClientBuilder;
    /* access modifiers changed from: private */
    public final Map<Integer, b> mContentHandlers = new ConcurrentHashMap();
    private e mCookieHandler;
    /* access modifiers changed from: private */
    public final Map<Integer, I> mWebSocketConnections = new ConcurrentHashMap();

    public interface b {
        void a(String str, WritableMap writableMap);

        void b(C5407h hVar, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieHandler = new e(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list == null) {
                return null;
            }
            if (list.isEmpty()) {
                return null;
            }
            return (String) list.get(0);
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[Catch:{ URISyntaxException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[Catch:{ URISyntaxException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[Catch:{ URISyntaxException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ URISyntaxException -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDefaultOrigin(java.lang.String r11) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00b8 }
            r1.<init>(r11)     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r2 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x00b8 }
            int r3 = r2.hashCode()     // Catch:{ URISyntaxException -> 0x00b8 }
            r4 = 3804(0xedc, float:5.33E-42)
            r5 = 1
            r6 = 2
            java.lang.String r7 = "http"
            r8 = 3
            java.lang.String r9 = "https"
            r10 = -1
            if (r3 == r4) goto L_0x0045
            r4 = 118039(0x1cd17, float:1.65408E-40)
            if (r3 == r4) goto L_0x003b
            r4 = 3213448(0x310888, float:4.503E-39)
            if (r3 == r4) goto L_0x0033
            r4 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r3 == r4) goto L_0x002b
            goto L_0x004f
        L_0x002b:
            boolean r2 = r2.equals(r9)     // Catch:{ URISyntaxException -> 0x00b8 }
            if (r2 == 0) goto L_0x004f
            r2 = r8
            goto L_0x0050
        L_0x0033:
            boolean r2 = r2.equals(r7)     // Catch:{ URISyntaxException -> 0x00b8 }
            if (r2 == 0) goto L_0x004f
            r2 = r6
            goto L_0x0050
        L_0x003b:
            java.lang.String r3 = "wss"
            boolean r2 = r2.equals(r3)     // Catch:{ URISyntaxException -> 0x00b8 }
            if (r2 == 0) goto L_0x004f
            r2 = 0
            goto L_0x0050
        L_0x0045:
            java.lang.String r3 = "ws"
            boolean r2 = r2.equals(r3)     // Catch:{ URISyntaxException -> 0x00b8 }
            if (r2 == 0) goto L_0x004f
            r2 = r5
            goto L_0x0050
        L_0x004f:
            r2 = r10
        L_0x0050:
            if (r2 == 0) goto L_0x007d
            if (r2 == r5) goto L_0x006d
            if (r2 == r6) goto L_0x0059
            if (r2 == r8) goto L_0x0059
            goto L_0x008c
        L_0x0059:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r0 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x00b8 }
            goto L_0x008c
        L_0x006d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.append(r7)     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x00b8 }
            goto L_0x008c
        L_0x007d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x00b8 }
            r2.append(r9)     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x00b8 }
        L_0x008c:
            int r2 = r1.getPort()     // Catch:{ URISyntaxException -> 0x00b8 }
            if (r2 == r10) goto L_0x00a9
            java.lang.String r2 = "%s://%s:%s"
            java.lang.String r3 = r1.getHost()     // Catch:{ URISyntaxException -> 0x00b8 }
            int r1 = r1.getPort()     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r1}     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r11 = java.lang.String.format(r2, r0)     // Catch:{ URISyntaxException -> 0x00b8 }
            goto L_0x00b7
        L_0x00a9:
            java.lang.String r2 = "%s://%s"
            java.lang.String r1 = r1.getHost()     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ URISyntaxException -> 0x00b8 }
            java.lang.String r11 = java.lang.String.format(r2, r0)     // Catch:{ URISyntaxException -> 0x00b8 }
        L_0x00b7:
            return r11
        L_0x00b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to set "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " as default origin header"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public void notifyWebSocketFailed(int i10, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i10);
        createMap.putString(MetricTracker.Object.MESSAGE, str);
        sendEvent("websocketFailed", createMap);
    }

    /* access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    public static void setCustomClientBuilder(c cVar) {
    }

    public void addListener(String str) {
    }

    public void close(double d10, String str, double d11) {
        int i10 = (int) d11;
        I i11 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (i11 != null) {
            try {
                i11.close((int) d10, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i10));
                this.mContentHandlers.remove(Integer.valueOf(i10));
            } catch (Exception e10) {
                U5.a.n("ReactNative", "Could not close WebSocket connection for id " + i10, e10);
            }
        }
    }

    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d10) {
        boolean z10;
        int i10 = (int) d10;
        C6703A.a aVar = new C6703A.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C6703A.a S10 = aVar.f(10, timeUnit).W(10, timeUnit).S(0, TimeUnit.MINUTES);
        applyCustomBuilder(S10);
        C6703A c10 = S10.c();
        C.a l10 = new C.a().k(Integer.valueOf(i10)).l(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            l10.a("Cookie", cookie);
        }
        if (readableMap == null || !readableMap.hasKey("headers") || !readableMap.getType("headers").equals(ReadableType.Map)) {
            z10 = false;
        } else {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z10 = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase("origin")) {
                        z10 = true;
                    }
                    l10.a(nextKey, map.getString(nextKey));
                } else {
                    U5.a.I("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        }
        if (!z10) {
            l10.a("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                String trim = readableArray.getString(i11).trim();
                if (!trim.isEmpty() && !trim.contains(f.f37529a)) {
                    sb2.append(trim);
                    sb2.append(f.f37529a);
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                l10.a("Sec-WebSocket-Protocol", sb2.toString());
            }
        }
        c10.C(l10.b(), new a(i10));
        c10.q().c().shutdown();
    }

    public void invalidate() {
        for (I close : this.mWebSocketConnections.values()) {
            close.close(ErrorCodes.SERVER_RETRY_IN, (String) null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    public void ping(double d10) {
        int i10 = (int) d10;
        I i11 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (i11 == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString(MetricTracker.Object.MESSAGE, "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            i11.send(C5407h.f63296e);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    public void removeListeners(double d10) {
    }

    public void send(String str, double d10) {
        int i10 = (int) d10;
        I i11 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (i11 == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString(MetricTracker.Object.MESSAGE, "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            i11.send(str);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    public void sendBinary(String str, double d10) {
        int i10 = (int) d10;
        I i11 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (i11 == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString(MetricTracker.Object.MESSAGE, "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            i11.send(C5407h.c(str));
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    public void setContentHandler(int i10, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i10), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i10));
        }
    }

    class a extends J {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41128a;

        a(int i10) {
            this.f41128a = i10;
        }

        public void onClosed(I i10, int i11, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f41128a);
            createMap.putInt("code", i11);
            createMap.putString("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", createMap);
        }

        public void onClosing(I i10, int i11, String str) {
            i10.close(i11, str);
        }

        public void onFailure(I i10, Throwable th2, E e10) {
            WebSocketModule.this.notifyWebSocketFailed(this.f41128a, th2.getMessage());
        }

        public void onMessage(I i10, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f41128a);
            createMap.putString("type", AttributeType.TEXT);
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f41128a));
            if (bVar != null) {
                bVar.a(str, createMap);
            } else {
                createMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        public void onOpen(I i10, E e10) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f41128a), i10);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f41128a);
            createMap.putString("protocol", e10.y("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", createMap);
        }

        public void onMessage(I i10, C5407h hVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f41128a);
            createMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f41128a));
            if (bVar != null) {
                bVar.b(hVar, createMap);
            } else {
                createMap.putString("data", hVar.a());
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }
    }

    public void sendBinary(C5407h hVar, int i10) {
        I i11 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (i11 == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString(MetricTracker.Object.MESSAGE, "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            i11.send(hVar);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    private static void applyCustomBuilder(C6703A.a aVar) {
    }
}
