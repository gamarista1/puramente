package K1;

import Bf.c;
import J1.b;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.U0;
import Ug.Z;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import yf.C6798l;

public abstract class a {

    /* renamed from: K1.a$a  reason: collision with other inner class name */
    static final class C0092a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0092a f3982a = new C0092a();

        C0092a() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Context context) {
            C6496s.h(context, "it");
            return C6565s.n();
        }
    }

    public static final c a(String str, b bVar, C6798l lVar, K k10) {
        C6496s.h(str, "name");
        C6496s.h(lVar, "produceMigrations");
        C6496s.h(k10, "scope");
        return new c(str, bVar, lVar, k10);
    }

    public static /* synthetic */ c b(String str, b bVar, C6798l lVar, K k10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0092a.f3982a;
        }
        if ((i10 & 8) != 0) {
            k10 = L.a(Z.b().n1(U0.b((C5600w0) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, k10);
    }
}
