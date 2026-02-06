package m3;

import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import m3.r;

/* renamed from: m3.w  reason: case insensitive filesystem */
public final class C2223w {

    /* renamed from: a  reason: collision with root package name */
    private r f24130a;

    /* renamed from: b  reason: collision with root package name */
    private r f24131b;

    /* renamed from: c  reason: collision with root package name */
    private r f24132c;

    /* renamed from: m3.w$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24133a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f24133a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2223w.a.<clinit>():void");
        }
    }

    public C2223w() {
        r.c.a aVar = r.c.f24097b;
        this.f24130a = aVar.b();
        this.f24131b = aVar.b();
        this.f24132c = aVar.b();
    }

    public final r a(C2220t tVar) {
        C6496s.h(tVar, "loadType");
        int i10 = a.f24133a[tVar.ordinal()];
        if (i10 == 1) {
            return this.f24130a;
        }
        if (i10 == 2) {
            return this.f24132c;
        }
        if (i10 == 3) {
            return this.f24131b;
        }
        throw new C6535s();
    }

    public final void b(C2219s sVar) {
        C6496s.h(sVar, "states");
        this.f24130a = sVar.f();
        this.f24132c = sVar.d();
        this.f24131b = sVar.e();
    }

    public final void c(C2220t tVar, r rVar) {
        C6496s.h(tVar, "type");
        C6496s.h(rVar, "state");
        int i10 = a.f24133a[tVar.ordinal()];
        if (i10 == 1) {
            this.f24130a = rVar;
        } else if (i10 == 2) {
            this.f24132c = rVar;
        } else if (i10 == 3) {
            this.f24131b = rVar;
        } else {
            throw new C6535s();
        }
    }

    public final C2219s d() {
        return new C2219s(this.f24130a, this.f24131b, this.f24132c);
    }
}
