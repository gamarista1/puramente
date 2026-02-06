package androidx.compose.foundation.layout;

import C.I;
import J0.V;
import kotlin.Metadata;
import yf.C6798l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/h;", "LC/I;", "height", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(LC/I;ZLyf/l;)V", "d", "()Landroidx/compose/foundation/layout/h;", "node", "e", "(Landroidx/compose/foundation/layout/h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LC/I;", "getHeight", "()LC/I;", "c", "Z", "getEnforceIncoming", "()Z", "Lyf/l;", "getInspectorInfo", "()Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IntrinsicHeightElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final I f12772b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12773c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f12774d;

    public IntrinsicHeightElement(I i10, boolean z10, C6798l lVar) {
        this.f12772b = i10;
        this.f12773c = z10;
        this.f12774d = lVar;
    }

    /* renamed from: d */
    public h a() {
        return new h(this.f12772b, this.f12773c);
    }

    /* renamed from: e */
    public void b(h hVar) {
        hVar.o2(this.f12772b);
        hVar.n2(this.f12773c);
    }

    public boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement == null) {
            return false;
        }
        if (this.f12772b == intrinsicHeightElement.f12772b && this.f12773c == intrinsicHeightElement.f12773c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f12772b.hashCode() * 31) + Boolean.hashCode(this.f12773c);
    }
}
