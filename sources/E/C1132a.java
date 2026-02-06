package E;

import Y.T0;
import a0.C1538b;
import android.view.Choreographer;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: E.a  reason: case insensitive filesystem */
public final class C1132a implements Q, T0, Runnable, Choreographer.FrameCallback {

    /* renamed from: g  reason: collision with root package name */
    public static final C0022a f1592g = new C0022a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f1593h = 8;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static long f1594i;

    /* renamed from: a  reason: collision with root package name */
    private final View f1595a;

    /* renamed from: b  reason: collision with root package name */
    private final C1538b f1596b = new C1538b(new O[16], 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f1597c;

    /* renamed from: d  reason: collision with root package name */
    private final Choreographer f1598d = Choreographer.getInstance();

    /* renamed from: e  reason: collision with root package name */
    private boolean f1599e;

    /* renamed from: f  reason: collision with root package name */
    private long f1600f;

    /* renamed from: E.a$a  reason: collision with other inner class name */
    public static final class C0022a {
        public /* synthetic */ C0022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (r5 >= 30.0f) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = E.C1132a.f1594i
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x002c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L_0x0021
                if (r0 == 0) goto L_0x0021
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = 1114636288(0x42700000, float:60.0)
            L_0x0023:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                E.C1132a.f1594i = r0
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E.C1132a.C0022a.b(android.view.View):void");
        }

        private C0022a() {
        }
    }

    /* renamed from: E.a$b */
    public static final class b implements P {

        /* renamed from: a  reason: collision with root package name */
        private final long f1601a;

        public b(long j10) {
            this.f1601a = j10;
        }

        public long a() {
            return Math.max(0, this.f1601a - System.nanoTime());
        }
    }

    public C1132a(View view) {
        this.f1595a = view;
        f1592g.b(view);
    }

    public void a(O o10) {
        this.f1596b.b(o10);
        if (!this.f1597c) {
            this.f1597c = true;
            this.f1595a.post(this);
        }
    }

    public void b() {
        this.f1599e = true;
    }

    public void d() {
        this.f1599e = false;
        this.f1595a.removeCallbacks(this);
        this.f1598d.removeFrameCallback(this);
    }

    public void doFrame(long j10) {
        if (this.f1599e) {
            this.f1600f = j10;
            this.f1595a.post(this);
        }
    }

    public void run() {
        if (this.f1596b.s() || !this.f1597c || !this.f1599e || this.f1595a.getWindowVisibility() != 0) {
            this.f1597c = false;
            return;
        }
        b bVar = new b(this.f1600f + f1594i);
        boolean z10 = false;
        while (this.f1596b.t() && !z10) {
            if (bVar.a() <= 0 || ((O) this.f1596b.p()[0]).b(bVar)) {
                z10 = true;
            } else {
                this.f1596b.y(0);
            }
        }
        if (z10) {
            this.f1598d.postFrameCallback(this);
        } else {
            this.f1597c = false;
        }
    }

    public void c() {
    }
}
