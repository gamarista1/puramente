package x;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2472Y;
import r0.C2520p0;
import r0.H1;
import r0.S1;
import t0.C2600a;

/* renamed from: x.d  reason: case insensitive filesystem */
final class C2865d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public H1 f27932a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C2520p0 f27933b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C2600a f27934c;

    /* renamed from: d  reason: collision with root package name */
    private S1 f27935d;

    public C2865d(H1 h12, C2520p0 p0Var, C2600a aVar, S1 s12) {
        this.f27932a = h12;
        this.f27933b = p0Var;
        this.f27934c = aVar;
        this.f27935d = s12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2865d)) {
            return false;
        }
        C2865d dVar = (C2865d) obj;
        if (C6496s.c(this.f27932a, dVar.f27932a) && C6496s.c(this.f27933b, dVar.f27933b) && C6496s.c(this.f27934c, dVar.f27934c) && C6496s.c(this.f27935d, dVar.f27935d)) {
            return true;
        }
        return false;
    }

    public final S1 g() {
        S1 s12 = this.f27935d;
        if (s12 != null) {
            return s12;
        }
        S1 a10 = C2472Y.a();
        this.f27935d = a10;
        return a10;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        H1 h12 = this.f27932a;
        int i13 = 0;
        if (h12 == null) {
            i10 = 0;
        } else {
            i10 = h12.hashCode();
        }
        int i14 = i10 * 31;
        C2520p0 p0Var = this.f27933b;
        if (p0Var == null) {
            i11 = 0;
        } else {
            i11 = p0Var.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        C2600a aVar = this.f27934c;
        if (aVar == null) {
            i12 = 0;
        } else {
            i12 = aVar.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        S1 s12 = this.f27935d;
        if (s12 != null) {
            i13 = s12.hashCode();
        }
        return i16 + i13;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f27932a + ", canvas=" + this.f27933b + ", canvasDrawScope=" + this.f27934c + ", borderPath=" + this.f27935d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2865d(H1 h12, C2520p0 p0Var, C2600a aVar, S1 s12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : h12, (i10 & 2) != 0 ? null : p0Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : s12);
    }
}
