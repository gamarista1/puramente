package qg;

import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.N;
import Of.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.d;
import ng.f;
import rg.C6691i;

/* renamed from: qg.b  reason: case insensitive filesystem */
public interface C6661b {

    /* renamed from: qg.b$a */
    public static final class a implements C6661b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f72678a = new a();

        private a() {
        }

        public String a(C5490h hVar, n nVar) {
            C6496s.h(hVar, "classifier");
            C6496s.h(nVar, "renderer");
            if (hVar instanceof m0) {
                f name = ((m0) hVar).getName();
                C6496s.g(name, "getName(...)");
                return nVar.T(name, false);
            }
            d m10 = C6691i.m(hVar);
            C6496s.g(m10, "getFqName(...)");
            return nVar.S(m10);
        }
    }

    /* renamed from: qg.b$b  reason: collision with other inner class name */
    public static final class C1053b implements C6661b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1053b f72679a = new C1053b();

        private C1053b() {
        }

        public String a(C5490h hVar, n nVar) {
            boolean z10;
            C6496s.h(hVar, "classifier");
            C6496s.h(nVar, "renderer");
            if (hVar instanceof m0) {
                f name = ((m0) hVar).getName();
                C6496s.g(name, "getName(...)");
                return nVar.T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C5495m mVar = hVar;
            do {
                arrayList.add(mVar.getName());
                C5495m b10 = mVar.b();
                z10 = b10 instanceof C5487e;
                mVar = b10;
            } while (z10);
            return G.c(C6565s.V(arrayList));
        }
    }

    /* renamed from: qg.b$c */
    public static final class c implements C6661b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72680a = new c();

        private c() {
        }

        private final String b(C5490h hVar) {
            f name = hVar.getName();
            C6496s.g(name, "getName(...)");
            String b10 = G.b(name);
            if (hVar instanceof m0) {
                return b10;
            }
            C5495m b11 = hVar.b();
            C6496s.g(b11, "getContainingDeclaration(...)");
            String c10 = c(b11);
            if (c10 == null || C6496s.c(c10, "")) {
                return b10;
            }
            return c10 + '.' + b10;
        }

        private final String c(C5495m mVar) {
            if (mVar instanceof C5487e) {
                return b((C5490h) mVar);
            }
            if (!(mVar instanceof N)) {
                return null;
            }
            d j10 = ((N) mVar).f().j();
            C6496s.g(j10, "toUnsafe(...)");
            return G.a(j10);
        }

        public String a(C5490h hVar, n nVar) {
            C6496s.h(hVar, "classifier");
            C6496s.h(nVar, "renderer");
            return b(hVar);
        }
    }

    String a(C5490h hVar, n nVar);
}
