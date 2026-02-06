package Yf;

import Of.C5487e;
import Of.C5494l;
import Of.Z;
import Of.g0;
import eg.C5830g;
import eg.C5835l;
import eg.C5837n;
import eg.q;
import ng.c;

public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f66757a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(q qVar, g0 g0Var) {
            if (qVar == null) {
                f(1);
            }
            if (g0Var == null) {
                f(2);
            }
        }

        public void b(C5835l lVar, C5494l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        public void c(C5837n nVar, Z z10) {
            if (nVar == null) {
                f(5);
            }
            if (z10 == null) {
                f(6);
            }
        }

        public C5487e d(c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        public void e(C5830g gVar, C5487e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }
    }

    void a(q qVar, g0 g0Var);

    void b(C5835l lVar, C5494l lVar2);

    void c(C5837n nVar, Z z10);

    C5487e d(c cVar);

    void e(C5830g gVar, C5487e eVar);
}
