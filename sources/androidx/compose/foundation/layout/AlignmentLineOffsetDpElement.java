package androidx.compose.foundation.layout;

import H0.C1180a;
import J0.V;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b#\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/b;", "LH0/a;", "alignmentLine", "Lc1/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(LH0/a;FFLyf/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/b;", "node", "e", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LH0/a;", "getAlignmentLine", "()LH0/a;", "c", "F", "getBefore-D9Ej5fM", "()F", "getAfter-D9Ej5fM", "Lyf/l;", "getInspectorInfo", "()Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C1180a f12760b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12761c;

    /* renamed from: d  reason: collision with root package name */
    private final float f12762d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f12763e;

    public /* synthetic */ AlignmentLineOffsetDpElement(C1180a aVar, float f10, float f11, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f10, f11, lVar);
    }

    /* renamed from: d */
    public b a() {
        return new b(this.f12760b, this.f12761c, this.f12762d, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public void b(b bVar) {
        bVar.m2(this.f12760b);
        bVar.n2(this.f12761c);
        bVar.l2(this.f12762d);
    }

    public boolean equals(Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        if (!C6496s.c(this.f12760b, alignmentLineOffsetDpElement.f12760b) || !h.m(this.f12761c, alignmentLineOffsetDpElement.f12761c) || !h.m(this.f12762d, alignmentLineOffsetDpElement.f12762d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f12760b.hashCode() * 31) + h.o(this.f12761c)) * 31) + h.o(this.f12762d);
    }

    private AlignmentLineOffsetDpElement(C1180a aVar, float f10, float f11, C6798l lVar) {
        this.f12760b = aVar;
        this.f12761c = f10;
        this.f12762d = f11;
        this.f12763e = lVar;
        if ((f10 < 0.0f && !h.m(f10, h.f19213b.c())) || (f11 < 0.0f && !h.m(f11, h.f19213b.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
