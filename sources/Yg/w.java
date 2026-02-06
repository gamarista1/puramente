package Yg;

import Ug.C5600w0;
import Zg.C;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import qf.g;
import yf.p;

public abstract class w {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f66861a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(2);
            this.f66861a = uVar;
        }

        public final Integer a(int i10, g.b bVar) {
            int i11;
            g.c key = bVar.getKey();
            g.b b10 = this.f66861a.f66854b.b(key);
            if (key != C5600w0.f65416O) {
                if (bVar != b10) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i11 = i10 + 1;
                }
                return Integer.valueOf(i11);
            }
            C5600w0 w0Var = (C5600w0) b10;
            C6496s.f(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            C5600w0 b11 = w.b((C5600w0) bVar, w0Var);
            if (b11 == w0Var) {
                if (w0Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b11 + ", expected child of " + w0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(u uVar, g gVar) {
        if (((Number) gVar.f0(0, new a(uVar))).intValue() != uVar.f66855c) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + uVar.f66854b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final C5600w0 b(C5600w0 w0Var, C5600w0 w0Var2) {
        while (w0Var != null) {
            if (w0Var == w0Var2 || !(w0Var instanceof C)) {
                return w0Var;
            }
            w0Var = w0Var.getParent();
        }
        return null;
    }
}
