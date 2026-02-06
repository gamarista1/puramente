package C;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    private float f862a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f863b;

    /* renamed from: c  reason: collision with root package name */
    private C1095m f864c;

    public V(float f10, boolean z10, C1095m mVar, r rVar) {
        this.f862a = f10;
        this.f863b = z10;
        this.f864c = mVar;
    }

    public final C1095m a() {
        return this.f864c;
    }

    public final boolean b() {
        return this.f863b;
    }

    public final r c() {
        return null;
    }

    public final float d() {
        return this.f862a;
    }

    public final void e(C1095m mVar) {
        this.f864c = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (Float.compare(this.f862a, v10.f862a) == 0 && this.f863b == v10.f863b && C6496s.c(this.f864c, v10.f864c) && C6496s.c((Object) null, (Object) null)) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f863b = z10;
    }

    public final void g(float f10) {
        this.f862a = f10;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((Float.hashCode(this.f862a) * 31) + Boolean.hashCode(this.f863b)) * 31;
        C1095m mVar = this.f864c;
        if (mVar == null) {
            i10 = 0;
        } else {
            i10 = mVar.hashCode();
        }
        return (hashCode + i10) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f862a + ", fill=" + this.f863b + ", crossAxisAlignment=" + this.f864c + ", flowLayoutData=" + null + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(float f10, boolean z10, C1095m mVar, r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : mVar, (i10 & 8) != 0 ? null : rVar);
    }
}
