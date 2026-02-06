package gh;

import jh.c;
import jh.f;
import kh.C6441b;
import kh.C6443c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6527k;

/* renamed from: gh.f  reason: case insensitive filesystem */
public abstract class C5982f {
    public static final C5977a a(C6441b bVar, c cVar, String str) {
        C6496s.h(bVar, "<this>");
        C6496s.h(cVar, "decoder");
        C5977a c10 = bVar.c(cVar, str);
        if (c10 != null) {
            return c10;
        }
        C6443c.b(str, bVar.e());
        throw new C6527k();
    }

    public static final C5987k b(C6441b bVar, f fVar, Object obj) {
        C6496s.h(bVar, "<this>");
        C6496s.h(fVar, "encoder");
        C6496s.h(obj, "value");
        C5987k d10 = bVar.d(fVar, obj);
        if (d10 != null) {
            return d10;
        }
        C6443c.a(O.b(obj.getClass()), bVar.e());
        throw new C6527k();
    }
}
