package D6;

import C6.f;
import P6.a;
import P6.c;
import P6.e;
import R6.b;
import T5.k;
import T5.o;
import V6.n;
import a6.C3136b;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b7.C3158a;
import c7.C3183c;
import c7.C3185e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import v6.C4106a;
import w6.C4142b;
import w6.C4143c;
import x6.C4171a;
import x6.C4172b;
import x6.C4173c;
import x6.C4174d;
import y6.C4189b;
import y6.C4190c;

public class d implements C3158a {

    /* renamed from: a  reason: collision with root package name */
    private final b f30548a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f30549b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f30550c;

    /* renamed from: d  reason: collision with root package name */
    private final C3136b f30551d;

    /* renamed from: e  reason: collision with root package name */
    private final U6.d f30552e;

    /* renamed from: f  reason: collision with root package name */
    private final n f30553f;

    /* renamed from: g  reason: collision with root package name */
    private final T5.n f30554g;

    /* renamed from: h  reason: collision with root package name */
    private final T5.n f30555h;

    /* renamed from: i  reason: collision with root package name */
    private final T5.n f30556i;

    /* renamed from: j  reason: collision with root package name */
    private final T5.n f30557j;

    /* renamed from: k  reason: collision with root package name */
    private final T5.n f30558k;

    /* renamed from: l  reason: collision with root package name */
    private final T5.n f30559l;

    /* renamed from: m  reason: collision with root package name */
    private final T5.n f30560m;

    /* renamed from: n  reason: collision with root package name */
    private final T5.n f30561n = o.f34179b;

    public d(b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C3136b bVar2, U6.d dVar, n nVar, T5.n nVar2, T5.n nVar3, T5.n nVar4, T5.n nVar5, T5.n nVar6, T5.n nVar7, T5.n nVar8) {
        this.f30548a = bVar;
        this.f30549b = scheduledExecutorService;
        this.f30550c = executorService;
        this.f30551d = bVar2;
        this.f30552e = dVar;
        this.f30553f = nVar;
        this.f30554g = nVar2;
        this.f30555h = nVar3;
        this.f30556i = nVar4;
        this.f30557j = nVar5;
        this.f30559l = nVar7;
        this.f30558k = nVar6;
        this.f30560m = nVar8;
    }

    private a c(e eVar) {
        c d10 = eVar.d();
        return this.f30548a.a(eVar, new Rect(0, 0, d10.e(), d10.d()));
    }

    private R6.c d(e eVar) {
        return new R6.c(new C4171a(eVar.hashCode(), ((Boolean) this.f30556i.get()).booleanValue()), this.f30553f);
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [y6.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private v6.C4106a e(P6.e r11, android.graphics.Bitmap.Config r12, I6.c r13) {
        /*
            r10 = this;
            P6.a r13 = r10.c(r11)
            B6.a r6 = new B6.a
            r6.<init>(r13)
            w6.b r7 = r10.f(r11)
            B6.b r8 = new B6.b
            T5.n r0 = r10.f30557j
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.<init>(r7, r13, r0)
            T5.n r13 = r10.f30555h
            java.lang.Object r13 = r13.get()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 <= 0) goto L_0x0036
            y6.d r0 = new y6.d
            r0.<init>(r13)
            y6.b r12 = r10.g(r8, r12)
            goto L_0x0038
        L_0x0036:
            r0 = 0
            r12 = r0
        L_0x0038:
            T5.n r13 = r10.f30557j
            java.lang.Object r13 = r13.get()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x007e
            y6.f r13 = new y6.f
            java.lang.String r1 = r11.e()
            A6.k r4 = new A6.k
            U6.d r11 = r10.f30552e
            T5.n r0 = r10.f30559l
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            T5.n r2 = r10.f30560m
            java.lang.Object r2 = r2.get()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.<init>(r11, r0, r2)
            T5.n r11 = r10.f30558k
            java.lang.Object r11 = r11.get()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r5 = r11.booleanValue()
            r0 = r13
            r2 = r6
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x007f
        L_0x007e:
            r13 = r0
        L_0x007f:
            w6.a r11 = new w6.a
            U6.d r1 = r10.f30552e
            T5.n r0 = r10.f30557j
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            r9 = 0
            r0 = r11
            r2 = r7
            r3 = r6
            r4 = r8
            r6 = r13
            r7 = r12
            r8 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            a6.b r12 = r10.f30551d
            java.util.concurrent.ScheduledExecutorService r13 = r10.f30549b
            v6.b r11 = v6.C4108c.r(r11, r12, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.d.e(P6.e, android.graphics.Bitmap$Config, I6.c):v6.a");
    }

    private C4142b f(e eVar) {
        int intValue = ((Integer) this.f30554g.get()).intValue();
        if (intValue == 1) {
            return new C4172b(d(eVar), true);
        }
        if (intValue == 2) {
            return new C4172b(d(eVar), false);
        }
        if (intValue != 3) {
            return new C4174d();
        }
        return new C4173c();
    }

    private C4189b g(C4143c cVar, Bitmap.Config config) {
        U6.d dVar = this.f30552e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new C4190c(dVar, cVar, config, this.f30550c);
    }

    public Drawable a(C3185e eVar) {
        Bitmap.Config config;
        C3183c cVar = (C3183c) eVar;
        c U10 = cVar.U();
        e eVar2 = (e) k.g(cVar.V());
        if (U10 != null) {
            config = U10.r();
        } else {
            config = null;
        }
        C4106a e10 = e(eVar2, config, (I6.c) null);
        if (((Boolean) this.f30561n.get()).booleanValue()) {
            return new f(e10);
        }
        return new C6.b(e10);
    }

    public boolean b(C3185e eVar) {
        return eVar instanceof C3183c;
    }
}
