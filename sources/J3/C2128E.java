package j3;

import Rg.k;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

/* renamed from: j3.E  reason: case insensitive filesystem */
public abstract class C2128E {

    /* renamed from: a  reason: collision with root package name */
    private G f22767a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22768b;

    /* renamed from: j3.E$a */
    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: j3.E$b */
    public @interface b {
        String value();
    }

    /* renamed from: j3.E$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2128E f22769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f22770b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2128E e10, z zVar, a aVar) {
            super(1);
            this.f22769a = e10;
            this.f22770b = zVar;
        }

        /* renamed from: a */
        public final k invoke(k kVar) {
            C6496s.h(kVar, "backStackEntry");
            s e10 = kVar.e();
            if (e10 == null) {
                e10 = null;
            }
            if (e10 == null) {
                return null;
            }
            s d10 = this.f22769a.d(e10, kVar.c(), this.f22770b, (a) null);
            if (d10 == null) {
                return null;
            }
            if (C6496s.c(d10, e10)) {
                return kVar;
            }
            return this.f22769a.b().a(d10, d10.k(kVar.c()));
        }
    }

    /* renamed from: j3.E$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f22771a = new d();

        d() {
            super(1);
        }

        public final void a(C2124A a10) {
            C6496s.h(a10, "$this$navOptions");
            a10.e(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2124A) obj);
            return C6514M.f71813a;
        }
    }

    public abstract s a();

    /* access modifiers changed from: protected */
    public final G b() {
        G g10 = this.f22767a;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean c() {
        return this.f22768b;
    }

    public s d(s sVar, Bundle bundle, z zVar, a aVar) {
        C6496s.h(sVar, "destination");
        return sVar;
    }

    public void e(List list, z zVar, a aVar) {
        C6496s.h(list, "entries");
        for (k j10 : k.q(k.x(C6565s.b0(list), new c(this, zVar, aVar)))) {
            b().j(j10);
        }
    }

    public void f(G g10) {
        C6496s.h(g10, "state");
        this.f22767a = g10;
        this.f22768b = true;
    }

    public void g(k kVar) {
        C6496s.h(kVar, "backStackEntry");
        s e10 = kVar.e();
        if (e10 == null) {
            e10 = null;
        }
        if (e10 != null) {
            d(e10, (Bundle) null, C2125B.a(d.f22771a), (a) null);
            b().f(kVar);
        }
    }

    public void h(Bundle bundle) {
        C6496s.h(bundle, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(k kVar, boolean z10) {
        C6496s.h(kVar, "popUpTo");
        List list = (List) b().b().getValue();
        if (list.contains(kVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            k kVar2 = null;
            while (k()) {
                kVar2 = (k) listIterator.previous();
                if (C6496s.c(kVar2, kVar)) {
                    break;
                }
            }
            if (kVar2 != null) {
                b().g(kVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + kVar + " which does not exist in back stack " + list).toString());
    }

    public boolean k() {
        return true;
    }
}
