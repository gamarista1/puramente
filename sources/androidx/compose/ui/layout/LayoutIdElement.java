package androidx.compose.ui.layout;

import H0.C1199u;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "LJ0/V;", "LH0/u;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "d", "()LH0/u;", "node", "Llf/M;", "e", "(LH0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutIdElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final Object f13451b;

    public LayoutIdElement(Object obj) {
        this.f13451b = obj;
    }

    /* renamed from: d */
    public C1199u a() {
        return new C1199u(this.f13451b);
    }

    /* renamed from: e */
    public void b(C1199u uVar) {
        uVar.l2(this.f13451b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && C6496s.c(this.f13451b, ((LayoutIdElement) obj).f13451b);
    }

    public int hashCode() {
        return this.f13451b.hashCode();
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f13451b + ')';
    }
}
