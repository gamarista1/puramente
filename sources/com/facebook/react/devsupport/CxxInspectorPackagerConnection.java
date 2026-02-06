package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import rh.C;
import rh.C6703A;
import rh.E;
import rh.I;
import rh.J;

class CxxInspectorPackagerConnection implements N {
    @B7.a
    private final HybridData mHybridData;

    private static class DelegateImpl {

        /* renamed from: a  reason: collision with root package name */
        private final C6703A f40652a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f40653b;

        class a extends J {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebSocketDelegate f40654a;

            /* renamed from: com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl$a$a  reason: collision with other inner class name */
            class C0638a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Throwable f40656a;

                C0638a(Throwable th2) {
                    this.f40656a = th2;
                }

                public void run() {
                    String message = this.f40656a.getMessage();
                    WebSocketDelegate webSocketDelegate = a.this.f40654a;
                    if (message == null) {
                        message = "<Unknown error>";
                    }
                    webSocketDelegate.didFailWithError((Integer) null, message);
                    a.this.f40654a.close();
                }
            }

            class b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f40658a;

                b(String str) {
                    this.f40658a = str;
                }

                public void run() {
                    a.this.f40654a.didReceiveMessage(this.f40658a);
                }
            }

            class c implements Runnable {
                c() {
                }

                public void run() {
                    a.this.f40654a.didClose();
                    a.this.f40654a.close();
                }
            }

            a(WebSocketDelegate webSocketDelegate) {
                this.f40654a = webSocketDelegate;
            }

            public void onClosed(I i10, int i11, String str) {
                DelegateImpl.this.scheduleCallback(new c(), 0);
            }

            public void onFailure(I i10, Throwable th2, E e10) {
                DelegateImpl.this.scheduleCallback(new C0638a(th2), 0);
            }

            public void onMessage(I i10, String str) {
                DelegateImpl.this.scheduleCallback(new b(str), 0);
            }
        }

        class b implements a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ I f40661a;

            b(I i10) {
                this.f40661a = i10;
            }

            public void close() {
                this.f40661a.close(1000, "End of session");
            }
        }

        @B7.a
        public a connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            return new b(this.f40652a.C(new C.a().l(str).b(), new a(webSocketDelegate)));
        }

        @B7.a
        public void scheduleCallback(Runnable runnable, long j10) {
            this.f40653b.postDelayed(runnable, j10);
        }

        private DelegateImpl() {
            C6703A.a aVar = new C6703A.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f40652a = aVar.f(10, timeUnit).W(10, timeUnit).S(0, TimeUnit.MINUTES).c();
            this.f40653b = new Handler(Looper.getMainLooper());
        }
    }

    @B7.a
    private static class WebSocketDelegate implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final HybridData f40663a;

        @B7.a
        private WebSocketDelegate(HybridData hybridData) {
            this.f40663a = hybridData;
        }

        public void close() {
            this.f40663a.resetNative();
        }

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);
    }

    private interface a extends Closeable {
    }

    static {
        J.a();
    }

    public CxxInspectorPackagerConnection(String str, String str2, String str3) {
        this.mHybridData = initHybrid(str, str2, str3, new DelegateImpl());
    }

    private static native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    public native void closeQuietly();

    public native void connect();

    public native void sendEventToAllConnections(String str);
}
