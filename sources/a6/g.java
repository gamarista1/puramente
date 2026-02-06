package A6;

import A6.j;
import A6.l;
import Ef.i;
import Ef.m;
import U6.d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.L;
import mf.O;
import mf.Y;
import v6.C4109d;
import w6.C4143c;
import yf.C6787a;
import z6.C4234b;
import z6.c;

public final class g implements j {

    /* renamed from: n  reason: collision with root package name */
    public static final b f29398n = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f29399a;

    /* renamed from: b  reason: collision with root package name */
    private final C4143c f29400b;

    /* renamed from: c  reason: collision with root package name */
    private final c f29401c;

    /* renamed from: d  reason: collision with root package name */
    private final C4109d f29402d;

    /* renamed from: e  reason: collision with root package name */
    private final int f29403e;

    /* renamed from: f  reason: collision with root package name */
    private final int f29404f;

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentHashMap f29405g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private volatile int f29406h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f29407i;

    /* renamed from: j  reason: collision with root package name */
    private final h f29408j = new h(k().a());

    /* renamed from: k  reason: collision with root package name */
    private int f29409k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Map f29410l = O.i();

    /* renamed from: m  reason: collision with root package name */
    private Set f29411m = Y.e();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final X5.a f29412a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f29413b;

        public a(X5.a aVar) {
            C6496s.h(aVar, "bitmapRef");
            this.f29412a = aVar;
        }

        public final X5.a a() {
            return this.f29412a;
        }

        public final boolean b() {
            if (this.f29413b || !this.f29412a.Q()) {
                return false;
            }
            return true;
        }

        public final void c() {
            X5.a.E(this.f29412a);
        }

        public final void d(boolean z10) {
            this.f29413b = z10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public g(d dVar, C4143c cVar, c cVar2, C4109d dVar2, int i10) {
        C6496s.h(dVar, "platformBitmapFactory");
        C6496s.h(cVar, "bitmapFrameRenderer");
        C6496s.h(cVar2, "fpsCompressor");
        C6496s.h(dVar2, "animationInformation");
        this.f29399a = dVar;
        this.f29400b = cVar;
        this.f29401c = cVar2;
        this.f29402d = dVar2;
        this.f29403e = i10;
        int d10 = m.d((j(k()) * i10) / 1000, 1);
        this.f29404f = d10;
        c(j(k()));
        this.f29406h = (int) (((float) d10) * 0.5f);
    }

    private final void e(X5.a aVar) {
        if (aVar.Q()) {
            new Canvas((Bitmap) aVar.I()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ea, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        wf.C6763c.a(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            A6.h r14 = r10.f29408j
            int r0 = r10.f29404f
            java.util.List r11 = r14.d(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0013:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r11.next()
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.util.Set r2 = r10.f29411m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0013
            r14.add(r0)
            goto L_0x0013
        L_0x0034:
            java.util.Set r11 = mf.C6565s.j1(r14)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.concurrent.ConcurrentHashMap r1 = r10.f29405g
            java.util.Set r1 = r1.keySet()
            java.lang.String r2 = "<get-keys>(...)"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r1 = mf.Y.l(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x0055:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.util.concurrent.ConcurrentHashMap r5 = r10.f29405g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto L_0x0074
            goto L_0x0055
        L_0x0074:
            int r5 = r10.f29409k
            r6 = -1
            if (r5 == r6) goto L_0x0084
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r11.contains(r5)
            if (r5 != 0) goto L_0x0084
            return r4
        L_0x0084:
            java.lang.Object r5 = r0.pollFirst()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0090
            int r6 = r5.intValue()
        L_0x0090:
            java.util.concurrent.ConcurrentHashMap r5 = r10.f29405g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r5 = r5.get(r7)
            A6.g$a r5 = (A6.g.a) r5
            r7 = 0
            if (r5 == 0) goto L_0x00aa
            X5.a r8 = r5.a()
            if (r8 == 0) goto L_0x00aa
            X5.a r8 = r8.q()
            goto L_0x00ab
        L_0x00aa:
            r8 = r7
        L_0x00ab:
            if (r8 == 0) goto L_0x00ae
            goto L_0x00c6
        L_0x00ae:
            A6.g$a r5 = new A6.g$a
            U6.d r8 = r10.f29399a
            X5.a r8 = r8.a(r12, r13)
            java.lang.String r9 = "createBitmap(...)"
            kotlin.jvm.internal.C6496s.g(r8, r9)
            r5.<init>(r8)
            X5.a r8 = r5.a()
            X5.a r8 = r8.o()
        L_0x00c6:
            r5.d(r3)
            r10.n(r8, r2, r12, r13)     // Catch:{ all -> 0x00e8 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x00e8 }
            wf.C6763c.a(r8, r7)
            java.util.concurrent.ConcurrentHashMap r3 = r10.f29405g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.remove(r6)
            r5.d(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r10.f29405g
            r3.put(r2, r5)
            goto L_0x0055
        L_0x00e8:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r12 = move-exception
            wf.C6763c.a(r8, r11)
            throw r12
        L_0x00ef:
            boolean r11 = r14.isEmpty()
            r12 = 1056964608(0x3f000000, float:0.5)
            if (r11 == 0) goto L_0x00fd
            int r11 = r10.f29404f
            float r11 = (float) r11
            float r11 = r11 * r12
            int r11 = (int) r11
            goto L_0x0113
        L_0x00fd:
            int r11 = r14.size()
            float r13 = (float) r11
            float r13 = r13 * r12
            int r12 = (int) r13
            int r11 = r11 - r3
            int r11 = Ef.m.l(r12, r4, r11)
            java.lang.Object r11 = r14.get(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
        L_0x0113:
            r10.f29406h = r11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.g.f(int, int, int, int):boolean");
    }

    static /* synthetic */ boolean g(g gVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return gVar.f(i10, i11, i12, i13);
    }

    private final a h(int i10) {
        a aVar;
        Iterator it = new i(0, this.f29408j.b()).iterator();
        do {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            int a10 = this.f29408j.a(i10 - ((L) it).a());
            a aVar2 = (a) this.f29405g.get(Integer.valueOf(a10));
            if (aVar2 != null) {
                if (!aVar2.b()) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar = new a(a10, aVar2.a());
                    continue;
                } else {
                    continue;
                }
            }
        } while (aVar == null);
        return aVar;
    }

    private final l i(int i10) {
        a h10 = h(i10);
        if (h10 == null) {
            return new l((X5.a) null, l.a.MISSING);
        }
        X5.a o10 = h10.a().o();
        C6496s.g(o10, "clone(...)");
        this.f29409k = h10.b();
        return new l(o10, l.a.NEAREST);
    }

    private final int j(C4109d dVar) {
        return (int) m.e(TimeUnit.SECONDS.toMillis(1) / ((long) (dVar.k() / dVar.a())), 1);
    }

    private final void l(int i10, int i11) {
        if (!this.f29407i) {
            this.f29407i = true;
            C4234b.f50079a.b(new f(this, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final void m(g gVar, int i10, int i11) {
        C6496s.h(gVar, "this$0");
        do {
        } while (!g(gVar, m.d(gVar.f29409k, 0), i10, i11, 0, 8, (Object) null));
        gVar.f29407i = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        wf.C6763c.a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n(X5.a r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            A6.a r7 = r4.h(r6)
            java.lang.String r8 = "get(...)"
            if (r7 == 0) goto L_0x0060
            X5.a r0 = r7.a()
            if (r0 == 0) goto L_0x0060
            X5.a r0 = r0.q()
            if (r0 == 0) goto L_0x0060
            int r7 = r7.b()     // Catch:{ all -> 0x004e }
            r1 = 0
            if (r7 >= r6) goto L_0x0054
            java.lang.Object r2 = r0.I()     // Catch:{ all -> 0x004e }
            kotlin.jvm.internal.C6496s.g(r2, r8)     // Catch:{ all -> 0x004e }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x004e }
            r4.o(r5, r2)     // Catch:{ all -> 0x004e }
            Ef.i r2 = new Ef.i     // Catch:{ all -> 0x004e }
            int r7 = r7 + 1
            r2.<init>(r7, r6)     // Catch:{ all -> 0x004e }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x004e }
        L_0x0032:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x004e }
            if (r7 == 0) goto L_0x0050
            r7 = r6
            mf.L r7 = (mf.L) r7     // Catch:{ all -> 0x004e }
            int r7 = r7.a()     // Catch:{ all -> 0x004e }
            w6.c r2 = r4.f29400b     // Catch:{ all -> 0x004e }
            java.lang.Object r3 = r5.I()     // Catch:{ all -> 0x004e }
            kotlin.jvm.internal.C6496s.g(r3, r8)     // Catch:{ all -> 0x004e }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x004e }
            r2.a(r7, r3)     // Catch:{ all -> 0x004e }
            goto L_0x0032
        L_0x004e:
            r5 = move-exception
            goto L_0x005a
        L_0x0050:
            wf.C6763c.a(r0, r1)
            return
        L_0x0054:
            lf.M r7 = lf.C6514M.f71813a     // Catch:{ all -> 0x004e }
            wf.C6763c.a(r0, r1)
            goto L_0x0060
        L_0x005a:
            throw r5     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            wf.C6763c.a(r0, r5)
            throw r6
        L_0x0060:
            r4.e(r5)
            Ef.i r7 = new Ef.i
            r0 = 0
            r7.<init>(r0, r6)
            java.util.Iterator r6 = r7.iterator()
        L_0x006d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0089
            r7 = r6
            mf.L r7 = (mf.L) r7
            int r7 = r7.a()
            w6.c r0 = r4.f29400b
            java.lang.Object r1 = r5.I()
            kotlin.jvm.internal.C6496s.g(r1, r8)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.a(r7, r1)
            goto L_0x006d
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.g.n(X5.a, int, int, int):void");
    }

    private final X5.a o(X5.a aVar, Bitmap bitmap) {
        if (aVar.Q() && !C6496s.c(aVar.I(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) aVar.I());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return aVar;
    }

    public void a(int i10, int i11, C6787a aVar) {
        C6496s.h(aVar, "onAnimationLoaded");
        l(i10, i11);
        aVar.invoke();
    }

    public l b(int i10, int i11, int i12) {
        Integer num = (Integer) this.f29410l.get(Integer.valueOf(i10));
        if (num == null) {
            return i(i10);
        }
        int intValue = num.intValue();
        this.f29409k = intValue;
        a aVar = (a) this.f29405g.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar != null) {
            if (this.f29408j.c(this.f29406h, intValue, this.f29404f)) {
                l(i11, i12);
            }
            return new l(aVar.a().o(), l.a.SUCCESS);
        }
        l(i11, i12);
        return i(intValue);
    }

    public void c(int i10) {
        Map a10 = this.f29401c.a(k().k() * m.d(k().b(), 1), k().a(), m.h(i10, j(k())));
        this.f29410l = a10;
        this.f29411m = C6565s.j1(a10.values());
    }

    public void clear() {
        Collection<a> values = this.f29405g.values();
        C6496s.g(values, "<get-values>(...)");
        for (a c10 : values) {
            c10.c();
        }
        this.f29405g.clear();
        this.f29409k = -1;
    }

    public C4109d k() {
        return this.f29402d;
    }

    public void onStop() {
        j.a.a(this);
    }
}
