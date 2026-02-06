package l3;

import gh.C5978b;
import gh.C5988l;
import ih.f;
import ih.k;
import j3.C2126C;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.O;
import lf.C6514M;
import yf.q;

/* renamed from: l3.c  reason: case insensitive filesystem */
public abstract class C2173c {

    /* renamed from: l3.c$a */
    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f23559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2171a f23560b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Map map, C2171a aVar) {
            super(3);
            this.f23559a = map;
            this.f23560b = aVar;
        }

        public final void a(int i10, String str, C2126C c10) {
            C6496s.h(str, "argName");
            C6496s.h(c10, "navType");
            Object obj = this.f23559a.get(str);
            C6496s.e(obj);
            this.f23560b.c(i10, str, c10, (List) obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Number) obj).intValue(), (String) obj2, (C2126C) obj3);
            return C6514M.f71813a;
        }
    }

    private static final void a(C5978b bVar, Map map, q qVar) {
        int d10 = bVar.getDescriptor().d();
        int i10 = 0;
        while (i10 < d10) {
            String e10 = bVar.getDescriptor().e(i10);
            C2126C c10 = (C2126C) map.get(e10);
            if (c10 != null) {
                qVar.invoke(Integer.valueOf(i10), e10, c10);
                i10++;
            } else {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + e10 + ']').toString());
            }
        }
    }

    public static final int b(C5978b bVar) {
        C6496s.h(bVar, "<this>");
        int hashCode = bVar.getDescriptor().i().hashCode();
        int d10 = bVar.getDescriptor().d();
        for (int i10 = 0; i10 < d10; i10++) {
            hashCode = (hashCode * 31) + bVar.getDescriptor().e(i10).hashCode();
        }
        return hashCode;
    }

    public static final String c(Object obj, Map map) {
        C6496s.h(obj, "route");
        C6496s.h(map, "typeMap");
        C5978b a10 = C5988l.a(O.b(obj.getClass()));
        Map J10 = new C2172b(a10, map).J(obj);
        C2171a aVar = new C2171a(a10);
        a(a10, map, new a(J10, aVar));
        return aVar.d();
    }

    public static final boolean d(f fVar) {
        C6496s.h(fVar, "<this>");
        if (!C6496s.c(fVar.h(), k.a.f68506a) || !fVar.isInline() || fVar.d() != 1) {
            return false;
        }
        return true;
    }
}
