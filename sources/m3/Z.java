package m3;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

public abstract class Z {

    /* renamed from: a  reason: collision with root package name */
    private final int f23939a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23940b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23941c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23942d;

    public static final class a extends Z {

        /* renamed from: e  reason: collision with root package name */
        private final int f23943e;

        /* renamed from: f  reason: collision with root package name */
        private final int f23944f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, (DefaultConstructorMarker) null);
            this.f23943e = i10;
            this.f23944f = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f23943e == aVar.f23943e && this.f23944f == aVar.f23944f && d() == aVar.d() && c() == aVar.c() && a() == aVar.a() && b() == aVar.b()) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f23944f;
        }

        public final int g() {
            return this.f23943e;
        }

        public int hashCode() {
            return Z.super.hashCode() + Integer.hashCode(this.f23943e) + Integer.hashCode(this.f23944f);
        }

        public String toString() {
            return p.h("ViewportHint.Access(\n            |    pageOffset=" + this.f23943e + ",\n            |    indexInPage=" + this.f23944f + ",\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    public static final class b extends Z {
        public b(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return p.h("ViewportHint.Initial(\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23945a;

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
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f23945a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.Z.c.<clinit>():void");
        }
    }

    public /* synthetic */ Z(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13);
    }

    public final int a() {
        return this.f23941c;
    }

    public final int b() {
        return this.f23942d;
    }

    public final int c() {
        return this.f23940b;
    }

    public final int d() {
        return this.f23939a;
    }

    public final int e(C2220t tVar) {
        C6496s.h(tVar, "loadType");
        int i10 = c.f23945a[tVar.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        } else if (i10 == 2) {
            return this.f23939a;
        } else {
            if (i10 == 3) {
                return this.f23940b;
            }
            throw new C6535s();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        if (this.f23939a == z10.f23939a && this.f23940b == z10.f23940b && this.f23941c == z10.f23941c && this.f23942d == z10.f23942d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f23939a) + Integer.hashCode(this.f23940b) + Integer.hashCode(this.f23941c) + Integer.hashCode(this.f23942d);
    }

    private Z(int i10, int i11, int i12, int i13) {
        this.f23939a = i10;
        this.f23940b = i11;
        this.f23941c = i12;
        this.f23942d = i13;
    }
}
