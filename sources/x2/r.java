package x2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import i2.C2076a;
import i2.L;
import i2.p;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final i f28359a = new i();

    /* renamed from: b  reason: collision with root package name */
    private final b f28360b;

    /* renamed from: c  reason: collision with root package name */
    private final c f28361c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28362d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f28363e;

    /* renamed from: f  reason: collision with root package name */
    private float f28364f;

    /* renamed from: g  reason: collision with root package name */
    private float f28365g;

    /* renamed from: h  reason: collision with root package name */
    private float f28366h;

    /* renamed from: i  reason: collision with root package name */
    private float f28367i;

    /* renamed from: j  reason: collision with root package name */
    private int f28368j;

    /* renamed from: k  reason: collision with root package name */
    private long f28369k;

    /* renamed from: l  reason: collision with root package name */
    private long f28370l;

    /* renamed from: m  reason: collision with root package name */
    private long f28371m;

    /* renamed from: n  reason: collision with root package name */
    private long f28372n;

    /* renamed from: o  reason: collision with root package name */
    private long f28373o;

    /* renamed from: p  reason: collision with root package name */
    private long f28374p;

    /* renamed from: q  reason: collision with root package name */
    private long f28375q;

    private static final class a {
        public static void a(Surface surface, float f10) {
            int i10;
            if (f10 == 0.0f) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            try {
                surface.setFrameRate(f10, i10);
            } catch (IllegalStateException e10) {
                p.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        private static final c f28378f = new c();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f28379a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f28380b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f28381c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f28382d;

        /* renamed from: e  reason: collision with root package name */
        private int f28383e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f28381c = handlerThread;
            handlerThread.start();
            Handler y10 = L.y(handlerThread.getLooper(), this);
            this.f28380b = y10;
            y10.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f28382d;
            if (choreographer != null) {
                int i10 = this.f28383e + 1;
                this.f28383e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f28382d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                p.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f28378f;
        }

        private void f() {
            Choreographer choreographer = this.f28382d;
            if (choreographer != null) {
                int i10 = this.f28383e - 1;
                this.f28383e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f28379a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f28380b.sendEmptyMessage(2);
        }

        public void doFrame(long j10) {
            this.f28379a = j10;
            ((Choreographer) C2076a.e(this.f28382d)).postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f28380b.sendEmptyMessage(3);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            } else if (i10 == 2) {
                b();
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public r(Context context) {
        c cVar;
        b f10 = f(context);
        this.f28360b = f10;
        if (f10 != null) {
            cVar = c.d();
        } else {
            cVar = null;
        }
        this.f28361c = cVar;
        this.f28369k = -9223372036854775807L;
        this.f28370l = -9223372036854775807L;
        this.f28364f = -1.0f;
        this.f28367i = 1.0f;
        this.f28368j = 0;
    }

    private static boolean c(long j10, long j11) {
        if (Math.abs(j10 - j11) <= 20000000) {
            return true;
        }
        return false;
    }

    private void d() {
        Surface surface;
        if (L.f22072a >= 30 && (surface = this.f28363e) != null && this.f28368j != Integer.MIN_VALUE && this.f28366h != 0.0f) {
            this.f28366h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j14;
            j14 = j12 + j14;
            j13 = j15;
        }
        if (j14 - j10 < j10 - j13) {
            return j14;
        }
        return j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f28371m = 0;
        this.f28374p = -1;
        this.f28372n = -1;
    }

    /* access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f28369k = refreshRate;
            this.f28370l = (refreshRate * 80) / 100;
            return;
        }
        p.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f28369k = -9223372036854775807L;
        this.f28370l = -9223372036854775807L;
    }

    private void q() {
        float f10;
        float f11;
        if (L.f22072a >= 30 && this.f28363e != null) {
            if (this.f28359a.e()) {
                f10 = this.f28359a.b();
            } else {
                f10 = this.f28364f;
            }
            float f12 = this.f28365g;
            if (f10 != f12) {
                int i10 = (f10 > -1.0f ? 1 : (f10 == -1.0f ? 0 : -1));
                if (i10 != 0 && f12 != -1.0f) {
                    if (!this.f28359a.e() || this.f28359a.d() < 5000000000L) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.02f;
                    }
                    if (Math.abs(f10 - this.f28365g) < f11) {
                        return;
                    }
                } else if (i10 == 0 && this.f28359a.c() < 30) {
                    return;
                }
                this.f28365g = f10;
                r(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(boolean r4) {
        /*
            r3 = this;
            int r0 = i2.L.f22072a
            r1 = 30
            if (r0 < r1) goto L_0x0030
            android.view.Surface r0 = r3.f28363e
            if (r0 == 0) goto L_0x0030
            int r1 = r3.f28368j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x0011
            goto L_0x0030
        L_0x0011:
            boolean r1 = r3.f28362d
            if (r1 == 0) goto L_0x0021
            float r1 = r3.f28365g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            float r2 = r3.f28367i
            float r1 = r1 * r2
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r4 != 0) goto L_0x002b
            float r4 = r3.f28366h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x002b
            return
        L_0x002b:
            r3.f28366h = r1
            x2.r.a.a(r0, r1)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.r.r(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f28374p
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            x2.i r0 = r10.f28359a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            x2.i r0 = r10.f28359a
            long r0 = r0.a()
            long r2 = r10.f28375q
            long r4 = r10.f28371m
            long r6 = r10.f28374p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f28367i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = c(r11, r2)
            if (r0 == 0) goto L_0x002c
            r4 = r2
            goto L_0x0030
        L_0x002c:
            r10.n()
        L_0x002f:
            r4 = r11
        L_0x0030:
            long r11 = r10.f28371m
            r10.f28372n = r11
            r10.f28373o = r4
            x2.r$c r11 = r10.f28361c
            if (r11 == 0) goto L_0x0057
            long r0 = r10.f28369k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            long r6 = r11.f28379a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004d
            return r4
        L_0x004d:
            long r8 = r10.f28369k
            long r11 = e(r4, r6, r8)
            long r0 = r10.f28370l
            long r11 = r11 - r0
            return r11
        L_0x0057:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.r.b(long):long");
    }

    public void g(float f10) {
        this.f28364f = f10;
        this.f28359a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f28372n;
        if (j11 != -1) {
            this.f28374p = j11;
            this.f28375q = this.f28373o;
        }
        this.f28371m++;
        this.f28359a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f28367i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f28362d = true;
        n();
        if (this.f28360b != null) {
            ((c) C2076a.e(this.f28361c)).a();
            this.f28360b.b();
        }
        r(false);
    }

    public void l() {
        this.f28362d = false;
        b bVar = this.f28360b;
        if (bVar != null) {
            bVar.c();
            ((c) C2076a.e(this.f28361c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof m) {
            surface = null;
        }
        if (this.f28363e != surface) {
            d();
            this.f28363e = surface;
            r(true);
        }
    }

    public void o(int i10) {
        if (this.f28368j != i10) {
            this.f28368j = i10;
            r(true);
        }
    }

    private final class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f28376a;

        public b(DisplayManager displayManager) {
            this.f28376a = displayManager;
        }

        private Display a() {
            return this.f28376a.getDisplay(0);
        }

        public void b() {
            this.f28376a.registerDisplayListener(this, L.z());
            r.this.p(a());
        }

        public void c() {
            this.f28376a.unregisterDisplayListener(this);
        }

        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                r.this.p(a());
            }
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayRemoved(int i10) {
        }
    }
}
