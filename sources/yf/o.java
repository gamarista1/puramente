package Yf;

import Fg.S;
import Of.C5484b;
import Of.C5487e;
import eg.r;
import java.util.Collections;
import java.util.List;

public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f66764a = new a();

    static class a implements o {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public b a(r rVar, C5487e eVar, S s10, S s11, List list, List list2) {
            if (rVar == null) {
                c(0);
            }
            if (eVar == null) {
                c(1);
            }
            if (s10 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(s10, s11, list, list2, Collections.emptyList(), false);
        }

        public void b(C5484b bVar, List list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final S f66765a;

        /* renamed from: b  reason: collision with root package name */
        private final S f66766b;

        /* renamed from: c  reason: collision with root package name */
        private final List f66767c;

        /* renamed from: d  reason: collision with root package name */
        private final List f66768d;

        /* renamed from: e  reason: collision with root package name */
        private final List f66769e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f66770f;

        public b(S s10, S s11, List list, List list2, List list3, boolean z10) {
            if (s10 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f66765a = s10;
            this.f66766b = s11;
            this.f66767c = list;
            this.f66768d = list2;
            this.f66769e = list3;
            this.f66770f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
                th2 = new IllegalStateException(format);
            } else {
                th2 = new IllegalArgumentException(format);
            }
            throw th2;
        }

        public List b() {
            List list = this.f66769e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public S c() {
            return this.f66766b;
        }

        public S d() {
            S s10 = this.f66765a;
            if (s10 == null) {
                a(4);
            }
            return s10;
        }

        public List e() {
            List list = this.f66768d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List f() {
            List list = this.f66767c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f66770f;
        }
    }

    b a(r rVar, C5487e eVar, S s10, S s11, List list, List list2);

    void b(C5484b bVar, List list);
}
