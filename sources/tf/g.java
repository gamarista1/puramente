package Tf;

import Cg.a;
import Cg.d;
import Lf.o;
import eg.C5830g;
import gg.C5972v;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.C6577e;
import ng.b;
import ng.c;

public final class g implements C5972v {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f65158a;

    /* renamed from: b  reason: collision with root package name */
    private final d f65159b = new d();

    public g(ClassLoader classLoader) {
        C6496s.h(classLoader, "classLoader");
        this.f65158a = classLoader;
    }

    private final C5972v.a d(String str) {
        f a10;
        Class a11 = e.a(this.f65158a, str);
        if (a11 == null || (a10 = f.f65155c.a(a11)) == null) {
            return null;
        }
        return new C5972v.a.C1003a(a10, (byte[]) null, 2, (DefaultConstructorMarker) null);
    }

    public C5972v.a a(C5830g gVar, C6577e eVar) {
        String b10;
        C6496s.h(gVar, "javaClass");
        C6496s.h(eVar, "jvmMetadataVersion");
        c f10 = gVar.f();
        if (f10 == null || (b10 = f10.b()) == null) {
            return null;
        }
        return d(b10);
    }

    public C5972v.a b(b bVar, C6577e eVar) {
        C6496s.h(bVar, "classId");
        C6496s.h(eVar, "jvmMetadataVersion");
        return d(h.b(bVar));
    }

    public InputStream c(c cVar) {
        C6496s.h(cVar, "packageFqName");
        if (!cVar.i(o.f63953z)) {
            return null;
        }
        return this.f65159b.a(a.f62633r.r(cVar));
    }
}
