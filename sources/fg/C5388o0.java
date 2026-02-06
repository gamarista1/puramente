package Fg;

import Of.l0;
import Of.m0;
import Pf.c;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fg.o0  reason: case insensitive filesystem */
public interface C5388o0 {

    /* renamed from: Fg.o0$a */
    public static final class a implements C5388o0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63038a = new a();

        private a() {
        }

        public void a(l0 l0Var, m0 m0Var, S s10) {
            C6496s.h(l0Var, "typeAlias");
            C6496s.h(s10, "substitutedArgument");
        }

        public void b(G0 g02, S s10, S s11, m0 m0Var) {
            C6496s.h(g02, "substitutor");
            C6496s.h(s10, "unsubstitutedArgument");
            C6496s.h(s11, "argument");
            C6496s.h(m0Var, "typeParameter");
        }

        public void c(c cVar) {
            C6496s.h(cVar, "annotation");
        }

        public void d(l0 l0Var) {
            C6496s.h(l0Var, "typeAlias");
        }
    }

    void a(l0 l0Var, m0 m0Var, S s10);

    void b(G0 g02, S s10, S s11, m0 m0Var);

    void c(c cVar);

    void d(l0 l0Var);
}
