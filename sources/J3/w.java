package j3;

import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j3.C2128E;
import j3.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import mf.C6565s;
import yf.C6798l;

@C2128E.b("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lj3/w;", "Lj3/E;", "Lj3/u;", "Lj3/F;", "navigatorProvider", "<init>", "(Lj3/F;)V", "Lj3/k;", "entry", "Lj3/z;", "navOptions", "Lj3/E$a;", "navigatorExtras", "Llf/M;", "m", "(Lj3/k;Lj3/z;Lj3/E$a;)V", "l", "()Lj3/u;", "", "entries", "e", "(Ljava/util/List;Lj3/z;Lj3/E$a;)V", "c", "Lj3/F;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class w extends C2128E {

    /* renamed from: c  reason: collision with root package name */
    private final C2129F f23004c;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f23005a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10) {
            super(1);
            this.f23005a = n10;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            Object obj = this.f23005a.f71759a;
            boolean z10 = true;
            if (obj != null && ((Bundle) obj).containsKey(str)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public w(C2129F f10) {
        C6496s.h(f10, "navigatorProvider");
        this.f23004c = f10;
    }

    private final void m(k kVar, z zVar, C2128E.a aVar) {
        s sVar;
        Bundle bundle;
        s e10 = kVar.e();
        C6496s.f(e10, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        u uVar = (u) e10;
        N n10 = new N();
        n10.f71759a = kVar.c();
        int o02 = uVar.o0();
        String p02 = uVar.p0();
        if (o02 == 0 && p02 == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + uVar.v()).toString());
        }
        if (p02 != null) {
            sVar = uVar.g0(p02, false);
        } else {
            sVar = (s) uVar.j0().g(o02);
        }
        if (sVar != null) {
            if (p02 != null) {
                if (!C6496s.c(p02, sVar.C())) {
                    s.b I10 = sVar.I(p02);
                    if (I10 != null) {
                        bundle = I10.c();
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Object obj = n10.f71759a;
                        if (((Bundle) obj) != null) {
                            bundle2.putAll((Bundle) obj);
                        }
                        n10.f71759a = bundle2;
                    }
                }
                if (!sVar.t().isEmpty()) {
                    List a10 = j.a(sVar.t(), new a(n10));
                    if (!a10.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + sVar + ". Missing required arguments [" + a10 + ']').toString());
                    }
                }
            }
            this.f23004c.e(sVar.z()).e(C6565s.e(b().a(sVar, sVar.k((Bundle) n10.f71759a))), zVar, aVar);
            return;
        }
        String l02 = uVar.l0();
        throw new IllegalArgumentException("navigation destination " + l02 + " is not a direct child of this NavGraph");
    }

    public void e(List list, z zVar, C2128E.a aVar) {
        C6496s.h(list, "entries");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m((k) it.next(), zVar, aVar);
        }
    }

    /* renamed from: l */
    public u a() {
        return new u(this);
    }
}
