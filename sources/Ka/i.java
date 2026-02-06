package ka;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import ja.C3645a;
import ja.C3654j;
import ja.C3658n;
import ja.s;

public final class i extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f46030d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f46031e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f46032a;

    /* renamed from: b  reason: collision with root package name */
    private final b f46033b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46034c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private C3654j f46035a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f46036b;

        /* renamed from: c  reason: collision with root package name */
        private Error f46037c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f46038d;

        /* renamed from: e  reason: collision with root package name */
        private i f46039e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            boolean z10;
            C3645a.e(this.f46035a);
            this.f46035a.h(i10);
            SurfaceTexture g10 = this.f46035a.g();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f46039e = new i(this, g10, z10);
        }

        private void d() {
            C3645a.e(this.f46035a);
            this.f46035a.i();
        }

        public i a(int i10) {
            boolean z10;
            start();
            this.f46036b = new Handler(getLooper(), this);
            this.f46035a = new C3654j(this.f46036b);
            synchronized (this) {
                z10 = false;
                this.f46036b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f46039e == null && this.f46038d == null && this.f46037c == null) {
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
            RuntimeException runtimeException = this.f46038d;
            if (runtimeException == null) {
                Error error = this.f46037c;
                if (error == null) {
                    return (i) C3645a.e(this.f46039e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            C3645a.e(this.f46036b);
            this.f46036b.sendEmptyMessage(2);
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
                    s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f46038d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    try {
                        s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                        this.f46037c = e11;
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
        if (!C3658n.h(context)) {
            return 0;
        }
        if (C3658n.i()) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (i.class) {
            try {
                z10 = true;
                if (!f46031e) {
                    f46030d = a(context);
                    f46031e = true;
                }
                if (f46030d == 0) {
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

    public static i c(Context context, boolean z10) {
        boolean z11;
        int i10 = 0;
        if (!z10 || b(context)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3645a.f(z11);
        b bVar = new b();
        if (z10) {
            i10 = f46030d;
        }
        return bVar.a(i10);
    }

    public void release() {
        super.release();
        synchronized (this.f46033b) {
            try {
                if (!this.f46034c) {
                    this.f46033b.c();
                    this.f46034c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private i(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f46033b = bVar;
        this.f46032a = z10;
    }
}
