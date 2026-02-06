package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14282a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14283b;

    /* renamed from: c  reason: collision with root package name */
    private final t f14284c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14285d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14286e;

    public i(boolean z10, boolean z11, t tVar, boolean z12, boolean z13) {
        this.f14282a = z10;
        this.f14283b = z11;
        this.f14284c = tVar;
        this.f14285d = z12;
        this.f14286e = z13;
    }

    public final boolean a() {
        return this.f14286e;
    }

    public final boolean b() {
        return this.f14282a;
    }

    public final boolean c() {
        return this.f14283b;
    }

    public final t d() {
        return this.f14284c;
    }

    public final boolean e() {
        return this.f14285d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f14282a == iVar.f14282a && this.f14283b == iVar.f14283b && this.f14284c == iVar.f14284c && this.f14285d == iVar.f14285d && this.f14286e == iVar.f14286e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f14282a) * 31) + Boolean.hashCode(this.f14283b)) * 31) + this.f14284c.hashCode()) * 31) + Boolean.hashCode(this.f14285d)) * 31) + Boolean.hashCode(this.f14286e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public i(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, t.Inherit, z12, true);
    }
}
