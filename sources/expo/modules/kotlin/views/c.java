package expo.modules.kotlin.views;

import Od.a;
import ae.C4464a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.v;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import qe.C5155b;
import yf.p;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private final p f60466c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f60467d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, C5155b bVar, p pVar) {
        super(str, bVar);
        C6496s.h(str, "name");
        C6496s.h(bVar, "propType");
        C6496s.h(pVar, "setter");
        this.f60466c = pVar;
        this.f60467d = bVar.f().e();
    }

    public void c(Dynamic dynamic, View view, C4464a aVar) {
        CodedException codedException;
        C6496s.h(dynamic, "prop");
        C6496s.h(view, "onView");
        try {
            this.f60466c.invoke(view, b().b(dynamic, aVar));
            C6514M m10 = C6514M.f71813a;
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else if (th2 instanceof a) {
                a aVar2 = th2;
                String a10 = aVar2.a();
                C6496s.g(a10, "getCode(...)");
                codedException = new CodedException(a10, aVar2.getMessage(), aVar2.getCause());
            } else {
                codedException = new UnexpectedException((Throwable) th2);
            }
            throw new v(a(), O.b(view.getClass()), codedException);
        }
    }
}
