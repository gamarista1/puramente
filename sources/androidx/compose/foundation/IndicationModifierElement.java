package androidx.compose.foundation;

import B.j;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import x.C2845I;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "LJ0/V;", "Landroidx/compose/foundation/l;", "LB/j;", "interactionSource", "Lx/I;", "indication", "<init>", "(LB/j;Lx/I;)V", "d", "()Landroidx/compose/foundation/l;", "node", "Llf/M;", "e", "(Landroidx/compose/foundation/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/j;", "c", "Lx/I;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IndicationModifierElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final j f12436b;

    /* renamed from: c  reason: collision with root package name */
    private final C2845I f12437c;

    public IndicationModifierElement(j jVar, C2845I i10) {
        this.f12436b = jVar;
        this.f12437c = i10;
    }

    /* renamed from: d */
    public l a() {
        return new l(this.f12437c.a(this.f12436b));
    }

    /* renamed from: e */
    public void b(l lVar) {
        lVar.r2(this.f12437c.a(this.f12436b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        if (C6496s.c(this.f12436b, indicationModifierElement.f12436b) && C6496s.c(this.f12437c, indicationModifierElement.f12437c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f12436b.hashCode() * 31) + this.f12437c.hashCode();
    }
}
