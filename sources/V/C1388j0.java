package V;

import androidx.compose.ui.window.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: V.j0  reason: case insensitive filesystem */
public final class C1388j0 {

    /* renamed from: a  reason: collision with root package name */
    private final t f7678a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7679b;

    public C1388j0(t tVar, boolean z10) {
        this.f7678a = tVar;
        this.f7679b = z10;
    }

    public final t a() {
        return this.f7678a;
    }

    public final boolean b() {
        return this.f7679b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1388j0) && this.f7678a == ((C1388j0) obj).f7678a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7678a.hashCode() * 31) + Boolean.hashCode(this.f7679b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1388j0(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public C1388j0(boolean z10) {
        this(t.Inherit, z10);
    }
}
