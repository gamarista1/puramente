package ka;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import ja.C3645a;
import ja.M;
import ja.s;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final e f46041a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final b f46042b;

    /* renamed from: c  reason: collision with root package name */
    private final e f46043c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46044d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f46045e;

    /* renamed from: f  reason: collision with root package name */
    private float f46046f;

    /* renamed from: g  reason: collision with root package name */
    private float f46047g;

    /* renamed from: h  reason: collision with root package name */
    private float f46048h;

    /* renamed from: i  reason: collision with root package name */
    private float f46049i;

    /* renamed from: j  reason: collision with root package name */
    private int f46050j;

    /* renamed from: k  reason: collision with root package name */
    private long f46051k;

    /* renamed from: l  reason: collision with root package name */
    private long f46052l;

    /* renamed from: m  reason: collision with root package name */
    private long f46053m;

    /* renamed from: n  reason: collision with root package name */
    private long f46054n;

    /* renamed from: o  reason: collision with root package name */
    private long f46055o;

    /* renamed from: p  reason: collision with root package name */
    private long f46056p;

    /* renamed from: q  reason: collision with root package name */
    private long f46057q;

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
                s.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void b(a aVar);
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        private static final e f46061f = new e();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f46062a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f46063b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f46064c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f46065d;

        /* renamed from: e  reason: collision with root package name */
        private int f46066e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f46064c = handlerThread;
            handlerThread.start();
            Handler v10 = M.v(handlerThread.getLooper(), this);
            this.f46063b = v10;
            v10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f46065d;
            if (choreographer != null) {
                int i10 = this.f46066e + 1;
                this.f46066e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f46065d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                s.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f46061f;
        }

        private void f() {
            Choreographer choreographer = this.f46065d;
            if (choreographer != null) {
                int i10 = this.f46066e - 1;
                this.f46066e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f46062a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f46063b.sendEmptyMessage(1);
        }

        public void doFrame(long j10) {
            this.f46062a = j10;
            ((Choreographer) C3645a.e(this.f46065d)).postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f46063b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public l(Context context) {
        e eVar;
        b f10 = f(context);
        this.f46042b = f10;
        if (f10 != null) {
            eVar = e.d();
        } else {
            eVar = null;
        }
        this.f46043c = eVar;
        this.f46051k = -9223372036854775807L;
        this.f46052l = -9223372036854775807L;
        this.f46046f = -1.0f;
        this.f46049i = 1.0f;
        this.f46050j = 0;
    }

    private static boolean c(long j10, long j11) {
        if (Math.abs(j10 - j11) <= 20000000) {
            return true;
        }
        return false;
    }

    private void d() {
        Surface surface;
        if (M.f44981a >= 30 && (surface = this.f46045e) != null && this.f46050j != Integer.MIN_VALUE && this.f46048h != 0.0f) {
            this.f46048h = 0.0f;
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

    private static b f(Context context) {
        b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (M.f44981a >= 17) {
            bVar = d.d(applicationContext);
        }
        if (bVar == null) {
            return c.c(applicationContext);
        }
        return bVar;
    }

    private void n() {
        this.f46053m = 0;
        this.f46056p = -1;
        this.f46054n = -1;
    }

    /* access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f46051k = refreshRate;
            this.f46052l = (refreshRate * 80) / 100;
            return;
        }
        s.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f46051k = -9223372036854775807L;
        this.f46052l = -9223372036854775807L;
    }

    private void q() {
        float f10;
        float f11;
        if (M.f44981a >= 30 && this.f46045e != null) {
            if (this.f46041a.e()) {
                f10 = this.f46041a.b();
            } else {
                f10 = this.f46046f;
            }
            float f12 = this.f46047g;
            if (f10 != f12) {
                int i10 = (f10 > -1.0f ? 1 : (f10 == -1.0f ? 0 : -1));
                if (i10 != 0 && f12 != -1.0f) {
                    if (!this.f46041a.e() || this.f46041a.d() < 5000000000L) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.02f;
                    }
                    if (Math.abs(f10 - this.f46047g) < f11) {
                        return;
                    }
                } else if (i10 == 0 && this.f46041a.c() < 30) {
                    return;
                }
                this.f46047g = f10;
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
            int r0 = ja.M.f44981a
            r1 = 30
            if (r0 < r1) goto L_0x0030
            android.view.Surface r0 = r3.f46045e
            if (r0 == 0) goto L_0x0030
            int r1 = r3.f46050j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x0011
            goto L_0x0030
        L_0x0011:
            boolean r1 = r3.f46044d
            if (r1 == 0) goto L_0x0021
            float r1 = r3.f46047g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            float r2 = r3.f46049i
            float r1 = r1 * r2
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r4 != 0) goto L_0x002b
            float r4 = r3.f46048h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x002b
            return
        L_0x002b:
            r3.f46048h = r1
            ka.l.a.a(r0, r1)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.l.r(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f46056p
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            ka.e r0 = r10.f46041a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            ka.e r0 = r10.f46041a
            long r0 = r0.a()
            long r2 = r10.f46057q
            long r4 = r10.f46053m
            long r6 = r10.f46056p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f46049i
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
            long r11 = r10.f46053m
            r10.f46054n = r11
            r10.f46055o = r4
            ka.l$e r11 = r10.f46043c
            if (r11 == 0) goto L_0x0057
            long r0 = r10.f46051k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            long r6 = r11.f46062a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004d
            return r4
        L_0x004d:
            long r8 = r10.f46051k
            long r11 = e(r4, r6, r8)
            long r0 = r10.f46052l
            long r11 = r11 - r0
            return r11
        L_0x0057:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.l.b(long):long");
    }

    public void g(float f10) {
        this.f46046f = f10;
        this.f46041a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f46054n;
        if (j11 != -1) {
            this.f46056p = j11;
            this.f46057q = this.f46055o;
        }
        this.f46053m++;
        this.f46041a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f46049i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f46044d = true;
        n();
        if (this.f46042b != null) {
            ((e) C3645a.e(this.f46043c)).a();
            this.f46042b.b(new k(this));
        }
        r(false);
    }

    public void l() {
        this.f46044d = false;
        b bVar = this.f46042b;
        if (bVar != null) {
            bVar.a();
            ((e) C3645a.e(this.f46043c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof i) {
            surface = null;
        }
        if (this.f46045e != surface) {
            d();
            this.f46045e = surface;
            r(true);
        }
    }

    public void o(int i10) {
        if (this.f46050j != i10) {
            this.f46050j = i10;
            r(true);
        }
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f46058a;

        private c(WindowManager windowManager) {
            this.f46058a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        public void b(b.a aVar) {
            aVar.a(this.f46058a.getDefaultDisplay());
        }

        public void a() {
        }
    }

    private static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f46059a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f46060b;

        private d(DisplayManager displayManager) {
            this.f46059a = displayManager;
        }

        private Display c() {
            return this.f46059a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        public void a() {
            this.f46059a.unregisterDisplayListener(this);
            this.f46060b = null;
        }

        public void b(b.a aVar) {
            this.f46060b = aVar;
            this.f46059a.registerDisplayListener(this, M.w());
            aVar.a(c());
        }

        public void onDisplayChanged(int i10) {
            b.a aVar = this.f46060b;
            if (aVar != null && i10 == 0) {
                aVar.a(c());
            }
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayRemoved(int i10) {
        }
    }
}
