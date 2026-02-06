package androidx.compose.ui.input.pointer;

import D0.C1129u;
import D0.C1130v;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "LJ0/V;", "LD0/u;", "LD0/v;", "icon", "", "overrideDescendants", "<init>", "(LD0/v;Z)V", "d", "()LD0/u;", "node", "Llf/M;", "e", "(LD0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LD0/v;", "getIcon", "()LD0/v;", "c", "Z", "getOverrideDescendants", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointerHoverIconModifierElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C1130v f13440b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13441c;

    public PointerHoverIconModifierElement(C1130v vVar, boolean z10) {
        this.f13440b = vVar;
        this.f13441c = z10;
    }

    /* renamed from: d */
    public C1129u a() {
        return new C1129u(this.f13440b, this.f13441c);
    }

    /* renamed from: e */
    public void b(C1129u uVar) {
        uVar.y2(this.f13440b);
        uVar.z2(this.f13441c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return C6496s.c(this.f13440b, pointerHoverIconModifierElement.f13440b) && this.f13441c == pointerHoverIconModifierElement.f13441c;
    }

    public int hashCode() {
        return (this.f13440b.hashCode() * 31) + Boolean.hashCode(this.f13441c);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f13440b + ", overrideDescendants=" + this.f13441c + ')';
    }
}
