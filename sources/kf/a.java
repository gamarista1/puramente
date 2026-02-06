package Kf;

import Of.h0;
import Xf.H;
import Xf.I;
import gg.C5974x;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.J;
import mf.C6565s;
import ng.b;
import ng.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63853a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Set f63854b;

    /* renamed from: c  reason: collision with root package name */
    private static final b f63855c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f72283d;
        for (c c10 : C6565s.q(I.f66262a, I.f66273l, I.f66274m, I.f66265d, I.f66267f, I.f66270i)) {
            linkedHashSet.add(aVar.c(c10));
        }
        f63854b = linkedHashSet;
        b.a aVar2 = b.f72283d;
        c cVar = I.f66271j;
        C6496s.g(cVar, "REPEATABLE_ANNOTATION");
        f63855c = aVar2.c(cVar);
    }

    private a() {
    }

    public final b a() {
        return f63855c;
    }

    public final Set b() {
        return f63854b;
    }

    public final boolean c(C5974x xVar) {
        C6496s.h(xVar, "klass");
        J j10 = new J();
        xVar.b(new C0941a(j10), (byte[]) null);
        return j10.f71755a;
    }

    /* renamed from: Kf.a$a  reason: collision with other inner class name */
    public static final class C0941a implements C5974x.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f63856a;

        C0941a(J j10) {
            this.f63856a = j10;
        }

        public C5974x.a b(b bVar, h0 h0Var) {
            C6496s.h(bVar, "classId");
            C6496s.h(h0Var, "source");
            if (!C6496s.c(bVar, H.f66257a.a())) {
                return null;
            }
            this.f63856a.f71755a = true;
            return null;
        }

        public void a() {
        }
    }
}
