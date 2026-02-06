package androidx.compose.ui.graphics;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import r0.C2511m0;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "LJ0/V;", "Lr0/m0;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Llf/M;", "block", "<init>", "(Lyf/l;)V", "d", "()Lr0/m0;", "node", "e", "(Lr0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/l;", "getBlock", "()Lyf/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BlockGraphicsLayerElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13369b;

    public BlockGraphicsLayerElement(C6798l lVar) {
        this.f13369b = lVar;
    }

    /* renamed from: d */
    public C2511m0 a() {
        return new C2511m0(this.f13369b);
    }

    /* renamed from: e */
    public void b(C2511m0 m0Var) {
        m0Var.n2(this.f13369b);
        m0Var.m2();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && C6496s.c(this.f13369b, ((BlockGraphicsLayerElement) obj).f13369b);
    }

    public int hashCode() {
        return this.f13369b.hashCode();
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f13369b + ')';
    }
}
