package Z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import b2.C1883g;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f10389a;

    /* renamed from: b  reason: collision with root package name */
    private final c0.c f10390b;

    /* renamed from: c  reason: collision with root package name */
    private final a f10391c;

    public d(d0 d0Var, c0.c cVar, a aVar) {
        C6496s.h(d0Var, ProductResponseJsonKeys.STORE);
        C6496s.h(cVar, "factory");
        C6496s.h(aVar, "extras");
        this.f10389a = d0Var;
        this.f10390b = cVar;
        this.f10391c = aVar;
    }

    public static /* synthetic */ a0 b(d dVar, Ff.d dVar2, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = C1883g.f19165a.c(dVar2);
        }
        return dVar.a(dVar2, str);
    }

    public final a0 a(Ff.d dVar, String str) {
        C6496s.h(dVar, "modelClass");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        a0 b10 = this.f10389a.b(str);
        if (dVar.u(b10)) {
            c0.c cVar = this.f10390b;
            if (cVar instanceof c0.e) {
                C6496s.e(b10);
                ((c0.e) cVar).a(b10);
            }
            C6496s.f(b10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b10;
        }
        b bVar = new b(this.f10391c);
        bVar.c(C1883g.a.f19166a, str);
        a0 a10 = e.a(this.f10390b, dVar, bVar);
        this.f10389a.d(str, a10);
        return a10;
    }
}
