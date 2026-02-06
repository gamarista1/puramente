package Rg;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import rf.C6680b;
import yf.p;

abstract class l {

    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64994a;

        public a(p pVar) {
            this.f64994a = pVar;
        }

        public Iterator iterator() {
            return k.a(this.f64994a);
        }
    }

    public static Iterator a(p pVar) {
        C6496s.h(pVar, "block");
        i iVar = new i();
        iVar.k(C6680b.a(pVar, iVar, iVar));
        return iVar;
    }

    public static h b(p pVar) {
        C6496s.h(pVar, "block");
        return new a(pVar);
    }
}
