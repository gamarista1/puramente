package k3;

import Xg.L;
import androidx.compose.ui.window.i;
import j3.C2128E;
import j3.C2133d;
import j3.k;
import j3.s;
import j3.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.q;

@C2128E.b("dialog")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lk3/i;", "Lj3/E;", "Lk3/i$b;", "<init>", "()V", "Lj3/k;", "backStackEntry", "Llf/M;", "m", "(Lj3/k;)V", "", "entries", "Lj3/z;", "navOptions", "Lj3/E$a;", "navigatorExtras", "e", "(Ljava/util/List;Lj3/z;Lj3/E$a;)V", "l", "()Lk3/i$b;", "popUpTo", "", "savedState", "j", "(Lj3/k;Z)V", "entry", "p", "LXg/L;", "n", "()LXg/L;", "backStack", "", "o", "transitionInProgress", "c", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k3.i  reason: case insensitive filesystem */
public final class C2157i extends C2128E {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23350c = new a((DefaultConstructorMarker) null);

    /* renamed from: k3.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public void e(List list, z zVar, C2128E.a aVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().j((k) it.next());
        }
    }

    public void j(k kVar, boolean z10) {
        b().h(kVar, z10);
        int s02 = C6565s.s0((Iterable) b().c().getValue(), kVar);
        int i10 = 0;
        for (Object next : (Iterable) b().c().getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            k kVar2 = (k) next;
            if (i10 > s02) {
                p(kVar2);
            }
            i10 = i11;
        }
    }

    /* renamed from: l */
    public b a() {
        return new b(this, (i) null, C2151c.f23295a.a(), 2, (DefaultConstructorMarker) null);
    }

    public final void m(k kVar) {
        j(kVar, false);
    }

    public final L n() {
        return b().b();
    }

    public final L o() {
        return b().c();
    }

    public final void p(k kVar) {
        b().e(kVar);
    }

    /* renamed from: k3.i$b */
    public static final class b extends s implements C2133d {

        /* renamed from: m  reason: collision with root package name */
        private final i f23351m;

        /* renamed from: n  reason: collision with root package name */
        private final q f23352n;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C2157i iVar, i iVar2, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(iVar, (i10 & 2) != 0 ? new i(false, false, false, 7, (DefaultConstructorMarker) null) : iVar2, qVar);
        }

        public final q Z() {
            return this.f23352n;
        }

        public final i a0() {
            return this.f23351m;
        }

        public b(C2157i iVar, i iVar2, q qVar) {
            super((C2128E) iVar);
            this.f23351m = iVar2;
            this.f23352n = qVar;
        }
    }
}
