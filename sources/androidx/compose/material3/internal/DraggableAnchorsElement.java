package androidx.compose.material3.internal;

import J0.V;
import W.C1431f;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.p;
import z.q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "LJ0/V;", "Landroidx/compose/material3/internal/c;", "LW/f;", "state", "Lkotlin/Function2;", "Lc1/r;", "Lc1/b;", "Lkotlin/Pair;", "LW/h;", "anchors", "Lz/q;", "orientation", "<init>", "(LW/f;Lyf/p;Lz/q;)V", "d", "()Landroidx/compose/material3/internal/c;", "node", "Llf/M;", "e", "(Landroidx/compose/material3/internal/c;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LW/f;", "c", "Lyf/p;", "Lz/q;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C1431f f13211b;

    /* renamed from: c  reason: collision with root package name */
    private final p f13212c;

    /* renamed from: d  reason: collision with root package name */
    private final q f13213d;

    public DraggableAnchorsElement(C1431f fVar, p pVar, q qVar) {
        this.f13211b = fVar;
        this.f13212c = pVar;
        this.f13213d = qVar;
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f13211b, this.f13212c, this.f13213d);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.p2(this.f13211b);
        cVar.n2(this.f13212c);
        cVar.o2(this.f13213d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (C6496s.c(this.f13211b, draggableAnchorsElement.f13211b) && this.f13212c == draggableAnchorsElement.f13212c && this.f13213d == draggableAnchorsElement.f13213d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f13211b.hashCode() * 31) + this.f13212c.hashCode()) * 31) + this.f13213d.hashCode();
    }
}
