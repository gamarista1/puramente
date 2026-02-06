package androidx.compose.ui.draw;

import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "LJ0/V;", "Landroidx/compose/ui/draw/c;", "Lkotlin/Function1;", "Lt0/c;", "Llf/M;", "onDraw", "<init>", "(Lyf/l;)V", "d", "()Landroidx/compose/ui/draw/c;", "node", "e", "(Landroidx/compose/ui/draw/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/l;", "getOnDraw", "()Lyf/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DrawWithContentElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13251b;

    public DrawWithContentElement(C6798l lVar) {
        this.f13251b = lVar;
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f13251b);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.l2(this.f13251b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && C6496s.c(this.f13251b, ((DrawWithContentElement) obj).f13251b);
    }

    public int hashCode() {
        return this.f13251b.hashCode();
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.f13251b + ')';
    }
}
