package androidx.compose.ui.layout;

import H0.C1204z;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "LJ0/V;", "LH0/z;", "Lkotlin/Function3;", "LH0/H;", "LH0/E;", "Lc1/b;", "LH0/G;", "measure", "<init>", "(Lyf/q;)V", "d", "()LH0/z;", "node", "Llf/M;", "e", "(LH0/z;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lyf/q;", "getMeasure", "()Lyf/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final q f13450b;

    public LayoutElement(q qVar) {
        this.f13450b = qVar;
    }

    /* renamed from: d */
    public C1204z a() {
        return new C1204z(this.f13450b);
    }

    /* renamed from: e */
    public void b(C1204z zVar) {
        zVar.l2(this.f13450b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && C6496s.c(this.f13450b, ((LayoutElement) obj).f13450b);
    }

    public int hashCode() {
        return this.f13450b.hashCode();
    }

    public String toString() {
        return "LayoutElement(measure=" + this.f13450b + ')';
    }
}
