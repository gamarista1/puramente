package Ff;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62882c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final r f62883d = new r((s) null, (p) null);

    /* renamed from: a  reason: collision with root package name */
    private final s f62884a;

    /* renamed from: b  reason: collision with root package name */
    private final p f62885b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(p pVar) {
            C6496s.h(pVar, "type");
            return new r(s.IN, pVar);
        }

        public final r b(p pVar) {
            C6496s.h(pVar, "type");
            return new r(s.OUT, pVar);
        }

        public final r c() {
            return r.f62883d;
        }

        public final r d(p pVar) {
            C6496s.h(pVar, "type");
            return new r(s.INVARIANT, pVar);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62886a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ff.s[] r0 = Ff.s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ff.s r1 = Ff.s.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ff.s r1 = Ff.s.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ff.s r1 = Ff.s.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62886a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ff.r.b.<clinit>():void");
        }
    }

    public r(s sVar, p pVar) {
        boolean z10;
        String str;
        this.f62884a = sVar;
        this.f62885b = pVar;
        boolean z11 = false;
        if (sVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != (pVar == null ? true : z11)) {
            if (sVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + sVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final s a() {
        return this.f62884a;
    }

    public final p b() {
        return this.f62885b;
    }

    public final p c() {
        return this.f62885b;
    }

    public final s d() {
        return this.f62884a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f62884a == rVar.f62884a && C6496s.c(this.f62885b, rVar.f62885b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        s sVar = this.f62884a;
        int i11 = 0;
        if (sVar == null) {
            i10 = 0;
        } else {
            i10 = sVar.hashCode();
        }
        int i12 = i10 * 31;
        p pVar = this.f62885b;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        int i10;
        s sVar = this.f62884a;
        if (sVar == null) {
            i10 = -1;
        } else {
            i10 = b.f62886a[sVar.ordinal()];
        }
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f62885b);
        }
        if (i10 == 2) {
            return "in " + this.f62885b;
        } else if (i10 == 3) {
            return "out " + this.f62885b;
        } else {
            throw new C6535s();
        }
    }
}
