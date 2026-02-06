package androidx.compose.foundation;

import J0.V;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.g2;
import x.C2867f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "LJ0/V;", "Lx/f;", "Lc1/h;", "width", "Lr0/n0;", "brush", "Lr0/g2;", "shape", "<init>", "(FLr0/n0;Lr0/g2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lx/f;", "node", "Llf/M;", "e", "(Lx/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWidth-D9Ej5fM", "()F", "c", "Lr0/n0;", "getBrush", "()Lr0/n0;", "Lr0/g2;", "getShape", "()Lr0/g2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BorderModifierNodeElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f12414b;

    /* renamed from: c  reason: collision with root package name */
    private final C2514n0 f12415c;

    /* renamed from: d  reason: collision with root package name */
    private final g2 f12416d;

    public /* synthetic */ BorderModifierNodeElement(float f10, C2514n0 n0Var, g2 g2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, n0Var, g2Var);
    }

    /* renamed from: d */
    public C2867f a() {
        return new C2867f(this.f12414b, this.f12415c, this.f12416d, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(C2867f fVar) {
        fVar.z2(this.f12414b);
        fVar.y2(this.f12415c);
        fVar.O0(this.f12416d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return h.m(this.f12414b, borderModifierNodeElement.f12414b) && C6496s.c(this.f12415c, borderModifierNodeElement.f12415c) && C6496s.c(this.f12416d, borderModifierNodeElement.f12416d);
    }

    public int hashCode() {
        return (((h.o(this.f12414b) * 31) + this.f12415c.hashCode()) * 31) + this.f12416d.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + h.p(this.f12414b) + ", brush=" + this.f12415c + ", shape=" + this.f12416d + ')';
    }

    private BorderModifierNodeElement(float f10, C2514n0 n0Var, g2 g2Var) {
        this.f12414b = f10;
        this.f12415c = n0Var;
        this.f12416d = g2Var;
    }
}
