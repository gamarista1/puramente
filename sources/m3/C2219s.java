package m3;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import m3.r;

/* renamed from: m3.s  reason: case insensitive filesystem */
public final class C2219s {

    /* renamed from: f  reason: collision with root package name */
    public static final a f24100f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C2219s f24101g;

    /* renamed from: a  reason: collision with root package name */
    private final r f24102a;

    /* renamed from: b  reason: collision with root package name */
    private final r f24103b;

    /* renamed from: c  reason: collision with root package name */
    private final r f24104c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24105d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f24106e;

    /* renamed from: m3.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2219s a() {
            return C2219s.f24101g;
        }

        private a() {
        }
    }

    /* renamed from: m3.s$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24107a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f24107a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2219s.b.<clinit>():void");
        }
    }

    static {
        r.c.a aVar = r.c.f24097b;
        f24101g = new C2219s(aVar.b(), aVar.b(), aVar.b());
    }

    public C2219s(r rVar, r rVar2, r rVar3) {
        boolean z10;
        C6496s.h(rVar, "refresh");
        C6496s.h(rVar2, "prepend");
        C6496s.h(rVar3, "append");
        this.f24102a = rVar;
        this.f24103b = rVar2;
        this.f24104c = rVar3;
        boolean z11 = true;
        if ((rVar instanceof r.a) || (rVar3 instanceof r.a) || (rVar2 instanceof r.a)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24105d = z10;
        this.f24106e = (!(rVar instanceof r.c) || !(rVar3 instanceof r.c) || !(rVar2 instanceof r.c)) ? false : z11;
    }

    public static /* synthetic */ C2219s c(C2219s sVar, r rVar, r rVar2, r rVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = sVar.f24102a;
        }
        if ((i10 & 2) != 0) {
            rVar2 = sVar.f24103b;
        }
        if ((i10 & 4) != 0) {
            rVar3 = sVar.f24104c;
        }
        return sVar.b(rVar, rVar2, rVar3);
    }

    public final C2219s b(r rVar, r rVar2, r rVar3) {
        C6496s.h(rVar, "refresh");
        C6496s.h(rVar2, "prepend");
        C6496s.h(rVar3, "append");
        return new C2219s(rVar, rVar2, rVar3);
    }

    public final r d() {
        return this.f24104c;
    }

    public final r e() {
        return this.f24103b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2219s)) {
            return false;
        }
        C2219s sVar = (C2219s) obj;
        if (C6496s.c(this.f24102a, sVar.f24102a) && C6496s.c(this.f24103b, sVar.f24103b) && C6496s.c(this.f24104c, sVar.f24104c)) {
            return true;
        }
        return false;
    }

    public final r f() {
        return this.f24102a;
    }

    public final boolean g() {
        return this.f24105d;
    }

    public final boolean h() {
        return this.f24106e;
    }

    public int hashCode() {
        return (((this.f24102a.hashCode() * 31) + this.f24103b.hashCode()) * 31) + this.f24104c.hashCode();
    }

    public final C2219s i(C2220t tVar, r rVar) {
        C6496s.h(tVar, "loadType");
        C6496s.h(rVar, "newState");
        int i10 = b.f24107a[tVar.ordinal()];
        if (i10 == 1) {
            return c(this, (r) null, (r) null, rVar, 3, (Object) null);
        }
        if (i10 == 2) {
            return c(this, (r) null, rVar, (r) null, 5, (Object) null);
        }
        if (i10 == 3) {
            return c(this, rVar, (r) null, (r) null, 6, (Object) null);
        }
        throw new C6535s();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.f24102a + ", prepend=" + this.f24103b + ", append=" + this.f24104c + ')';
    }
}
