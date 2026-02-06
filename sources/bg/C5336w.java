package Bg;

import Of.C5484b;
import Of.C5487e;
import java.util.List;

/* renamed from: Bg.w  reason: case insensitive filesystem */
public interface C5336w {

    /* renamed from: a  reason: collision with root package name */
    public static final C5336w f62587a = new a();

    /* renamed from: Bg.w$a */
    static class a implements C5336w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(C5484b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        public void b(C5487e eVar, List list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(C5484b bVar);

    void b(C5487e eVar, List list);
}
