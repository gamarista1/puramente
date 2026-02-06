package ih;

import Sg.p;
import ih.k;
import kh.q0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6559l;
import yf.C6798l;

public abstract class i {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68503a = new a();

        a() {
            super(1);
        }

        public final void invoke(C6000a aVar) {
            C6496s.h(aVar, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C6000a) obj);
            return C6514M.f71813a;
        }
    }

    public static final f a(String str, e eVar) {
        C6496s.h(str, "serialName");
        C6496s.h(eVar, "kind");
        if (!p.d0(str)) {
            return q0.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final f b(String str, f[] fVarArr, C6798l lVar) {
        C6496s.h(str, "serialName");
        C6496s.h(fVarArr, "typeParameters");
        C6496s.h(lVar, "builderAction");
        if (!p.d0(str)) {
            C6000a aVar = new C6000a(str);
            lVar.invoke(aVar);
            return new g(str, k.a.f68506a, aVar.f().size(), C6559l.n1(fVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final f c(String str, j jVar, f[] fVarArr, C6798l lVar) {
        C6496s.h(str, "serialName");
        C6496s.h(jVar, "kind");
        C6496s.h(fVarArr, "typeParameters");
        C6496s.h(lVar, "builder");
        if (p.d0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        } else if (!C6496s.c(jVar, k.a.f68506a)) {
            C6000a aVar = new C6000a(str);
            lVar.invoke(aVar);
            return new g(str, jVar, aVar.f().size(), C6559l.n1(fVarArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
    }

    public static /* synthetic */ f d(String str, j jVar, f[] fVarArr, C6798l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = a.f68503a;
        }
        return c(str, jVar, fVarArr, lVar);
    }
}
