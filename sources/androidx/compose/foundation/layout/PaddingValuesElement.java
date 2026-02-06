package androidx.compose.foundation.layout;

import C.N;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "LJ0/V;", "Landroidx/compose/foundation/layout/p;", "LC/N;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "Llf/M;", "inspectorInfo", "<init>", "(LC/N;Lyf/l;)V", "d", "()Landroidx/compose/foundation/layout/p;", "node", "e", "(Landroidx/compose/foundation/layout/p;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LC/N;", "getPaddingValues", "()LC/N;", "c", "Lyf/l;", "getInspectorInfo", "()Lyf/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingValuesElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final N f12790b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f12791c;

    public PaddingValuesElement(N n10, C6798l lVar) {
        this.f12790b = n10;
        this.f12791c = lVar;
    }

    /* renamed from: d */
    public p a() {
        return new p(this.f12790b);
    }

    /* renamed from: e */
    public void b(p pVar) {
        pVar.m2(this.f12790b);
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return C6496s.c(this.f12790b, paddingValuesElement.f12790b);
    }

    public int hashCode() {
        return this.f12790b.hashCode();
    }
}
