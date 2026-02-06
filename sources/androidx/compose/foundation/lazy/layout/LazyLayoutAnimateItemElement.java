package androidx.compose.foundation.lazy.layout;

import E.C1140i;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import w.C2763G;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "LJ0/V;", "LE/i;", "Lw/G;", "", "fadeInSpec", "Lc1/n;", "placementSpec", "fadeOutSpec", "<init>", "(Lw/G;Lw/G;Lw/G;)V", "d", "()LE/i;", "node", "Llf/M;", "e", "(LE/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lw/G;", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutAnimateItemElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final C2763G f12941b;

    /* renamed from: c  reason: collision with root package name */
    private final C2763G f12942c;

    /* renamed from: d  reason: collision with root package name */
    private final C2763G f12943d;

    public LazyLayoutAnimateItemElement(C2763G g10, C2763G g11, C2763G g12) {
        this.f12941b = g10;
        this.f12942c = g11;
        this.f12943d = g12;
    }

    /* renamed from: d */
    public C1140i a() {
        return new C1140i(this.f12941b, this.f12942c, this.f12943d);
    }

    /* renamed from: e */
    public void b(C1140i iVar) {
        iVar.o2(this.f12941b);
        iVar.q2(this.f12942c);
        iVar.p2(this.f12943d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return C6496s.c(this.f12941b, lazyLayoutAnimateItemElement.f12941b) && C6496s.c(this.f12942c, lazyLayoutAnimateItemElement.f12942c) && C6496s.c(this.f12943d, lazyLayoutAnimateItemElement.f12943d);
    }

    public int hashCode() {
        C2763G g10 = this.f12941b;
        int i10 = 0;
        int hashCode = (g10 == null ? 0 : g10.hashCode()) * 31;
        C2763G g11 = this.f12942c;
        int hashCode2 = (hashCode + (g11 == null ? 0 : g11.hashCode())) * 31;
        C2763G g12 = this.f12943d;
        if (g12 != null) {
            i10 = g12.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f12941b + ", placementSpec=" + this.f12942c + ", fadeOutSpec=" + this.f12943d + ')';
    }
}
