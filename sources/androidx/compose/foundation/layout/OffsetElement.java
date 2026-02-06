package androidx.compose.foundation.layout;

import J0.V;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/m;", "Lc1/h;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(FFZLyf/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/m;", "node", "e", "(Landroidx/compose/foundation/layout/m;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "F", "getX-D9Ej5fM", "()F", "c", "getY-D9Ej5fM", "Z", "getRtlAware", "()Z", "Lyf/l;", "getInspectorInfo", "()Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OffsetElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final float f12780b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12781c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12782d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f12783e;

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10, lVar);
    }

    /* renamed from: d */
    public m a() {
        return new m(this.f12780b, this.f12781c, this.f12782d, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(m mVar) {
        mVar.p2(this.f12780b);
        mVar.q2(this.f12781c);
        mVar.o2(this.f12782d);
    }

    public boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement == null) {
            return false;
        }
        if (!h.m(this.f12780b, offsetElement.f12780b) || !h.m(this.f12781c, offsetElement.f12781c) || this.f12782d != offsetElement.f12782d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((h.o(this.f12780b) * 31) + h.o(this.f12781c)) * 31) + Boolean.hashCode(this.f12782d);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + h.p(this.f12780b) + ", y=" + h.p(this.f12781c) + ", rtlAware=" + this.f12782d + ')';
    }

    private OffsetElement(float f10, float f11, boolean z10, C6798l lVar) {
        this.f12780b = f10;
        this.f12781c = f11;
        this.f12782d = z10;
        this.f12783e = lVar;
    }
}
