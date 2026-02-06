package V0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final h f8158a;

    /* renamed from: b  reason: collision with root package name */
    private final p f8159b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8160c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8161d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f8162e;

    public /* synthetic */ D(h hVar, p pVar, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, pVar, i10, i11, obj);
    }

    public static /* synthetic */ D b(D d10, h hVar, p pVar, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            hVar = d10.f8158a;
        }
        if ((i12 & 2) != 0) {
            pVar = d10.f8159b;
        }
        p pVar2 = pVar;
        if ((i12 & 4) != 0) {
            i10 = d10.f8160c;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = d10.f8161d;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = d10.f8162e;
        }
        return d10.a(hVar, pVar2, i13, i14, obj);
    }

    public final D a(h hVar, p pVar, int i10, int i11, Object obj) {
        return new D(hVar, pVar, i10, i11, obj, (DefaultConstructorMarker) null);
    }

    public final h c() {
        return this.f8158a;
    }

    public final int d() {
        return this.f8160c;
    }

    public final p e() {
        return this.f8159b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (C6496s.c(this.f8158a, d10.f8158a) && C6496s.c(this.f8159b, d10.f8159b) && n.f(this.f8160c, d10.f8160c) && o.h(this.f8161d, d10.f8161d) && C6496s.c(this.f8162e, d10.f8162e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        h hVar = this.f8158a;
        int i11 = 0;
        if (hVar == null) {
            i10 = 0;
        } else {
            i10 = hVar.hashCode();
        }
        int hashCode = ((((((i10 * 31) + this.f8159b.hashCode()) * 31) + n.g(this.f8160c)) * 31) + o.i(this.f8161d)) * 31;
        Object obj = this.f8162e;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f8158a + ", fontWeight=" + this.f8159b + ", fontStyle=" + n.h(this.f8160c) + ", fontSynthesis=" + o.j(this.f8161d) + ", resourceLoaderCacheKey=" + this.f8162e + ')';
    }

    private D(h hVar, p pVar, int i10, int i11, Object obj) {
        this.f8158a = hVar;
        this.f8159b = pVar;
        this.f8160c = i10;
        this.f8161d = i11;
        this.f8162e = obj;
    }
}
