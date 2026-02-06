package androidx.compose.foundation.layout;

import J0.V;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/c;", "Lk0/c;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(Lk0/c;ZLyf/l;)V", "d", "()Landroidx/compose/foundation/layout/c;", "node", "e", "(Landroidx/compose/foundation/layout/c;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lk0/c;", "getAlignment", "()Lk0/c;", "c", "Z", "getMatchParentSize", "()Z", "Lyf/l;", "getInspectorInfo", "()Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BoxChildDataElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final c f12764b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12765c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f12766d;

    public BoxChildDataElement(c cVar, boolean z10, C6798l lVar) {
        this.f12764b = cVar;
        this.f12765c = z10;
        this.f12766d = lVar;
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f12764b, this.f12765c);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.o2(this.f12764b);
        cVar.p2(this.f12765c);
    }

    public boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement == null) {
            return false;
        }
        if (!C6496s.c(this.f12764b, boxChildDataElement.f12764b) || this.f12765c != boxChildDataElement.f12765c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f12764b.hashCode() * 31) + Boolean.hashCode(this.f12765c);
    }
}
