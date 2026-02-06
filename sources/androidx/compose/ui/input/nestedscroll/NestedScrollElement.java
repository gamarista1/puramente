package androidx.compose.ui.input.nestedscroll;

import C0.a;
import C0.b;
import C0.c;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "LJ0/V;", "LC0/c;", "LC0/a;", "connection", "LC0/b;", "dispatcher", "<init>", "(LC0/a;LC0/b;)V", "d", "()LC0/c;", "node", "Llf/M;", "e", "(LC0/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LC0/a;", "getConnection", "()LC0/a;", "c", "LC0/b;", "getDispatcher", "()LC0/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class NestedScrollElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final a f13438b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13439c;

    public NestedScrollElement(a aVar, b bVar) {
        this.f13438b = aVar;
        this.f13439c = bVar;
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f13438b, this.f13439c);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.s2(this.f13438b, this.f13439c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (C6496s.c(nestedScrollElement.f13438b, this.f13438b) && C6496s.c(nestedScrollElement.f13439c, this.f13439c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f13438b.hashCode() * 31;
        b bVar = this.f13439c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
