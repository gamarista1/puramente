package androidx.compose.foundation.layout;

import J0.V;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/s;", "Lc1/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/s;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/layout/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "F", "getMinWidth-D9Ej5fM", "()F", "c", "getMinHeight-D9Ej5fM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f12798b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12799c;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    /* renamed from: d */
    public s a() {
        return new s(this.f12798b, this.f12799c, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(s sVar) {
        sVar.m2(this.f12798b);
        sVar.l2(this.f12799c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!h.m(this.f12798b, unspecifiedConstraintsElement.f12798b) || !h.m(this.f12799c, unspecifiedConstraintsElement.f12799c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (h.o(this.f12798b) * 31) + h.o(this.f12799c);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.f12798b = f10;
        this.f12799c = f11;
    }
}
