package x2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import i2.C2076a;
import i2.C2084i;
import i2.C2086k;
import i2.p;

public final class m extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f28335d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f28336e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28337a;

    /* renamed from: b  reason: collision with root package name */
    private final b f28338b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28339c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private C2084i f28340a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f28341b;

        /* renamed from: c  reason: collision with root package name */
        private Error f28342c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f28343d;

        /* renamed from: e  reason: collision with root package name */
        private m f28344e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            boolean z10;
            C2076a.e(this.f28340a);
            this.f28340a.h(i10);
            SurfaceTexture g10 = this.f28340a.g();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f28344e = new m(this, g10, z10);
        }

        private void d() {
            C2076a.e(this.f28340a);
            this.f28340a.i();
        }

        public m a(int i10) {
            boolean z10;
            start();
            this.f28341b = new Handler(getLooper(), this);
            this.f28340a = new C2084i(this.f28341b);
            synchronized (this) {
                z10 = false;
                this.f28341b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f28344e == null && this.f28343d == null && this.f28342c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f28343d;
            if (runtimeException == null) {
                Error error = this.f28342c;
                if (error == null) {
                    return (m) C2076a.e(this.f28344e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            C2076a.e(this.f28341b);
            this.f28341b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f28343d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (C2086k.a e11) {
                    p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f28343d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    try {
                        p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                        this.f28342c = e12;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notify();
                            throw th2;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
                quit();
                return true;
            }
        }
    }

    private static int a(Context context) {
        if (!C2086k.i(context)) {
            return 0;
        }
        if (C2086k.j()) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (m.class) {
            try {
                z10 = true;
                if (!f28336e) {
                    f28335d = a(context);
                    f28336e = true;
                }
                if (f28335d == 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return z10;
    }

    public static m c(Context context, boolean z10) {
        boolean z11;
        int i10 = 0;
        if (!z10 || b(context)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.g(z11);
        b bVar = new b();
        if (z10) {
            i10 = f28335d;
        }
        return bVar.a(i10);
    }

    public void release() {
        super.release();
        synchronized (this.f28338b) {
            try {
                if (!this.f28339c) {
                    this.f28338b.c();
                    this.f28339c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private m(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f28338b = bVar;
        this.f28337a = z10;
    }
}
