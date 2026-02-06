package Y0;

import Q0.C1328k;
import Q0.C1334q;
import android.graphics.Matrix;
import android.graphics.Shader;
import b1.k;
import java.util.List;
import q0.C2428n;
import r0.C2514n0;
import r0.C2517o0;
import r0.C2520p0;
import r0.c2;
import r0.e2;
import r0.h2;
import t0.C2606g;

public abstract class b {
    public static final void a(C1328k kVar, C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar2, C2606g gVar, int i10) {
        C2514n0 n0Var2 = n0Var;
        p0Var.q();
        if (kVar.w().size() <= 1) {
            b(kVar, p0Var, n0Var, f10, e2Var, kVar2, gVar, i10);
        } else if (n0Var2 instanceof h2) {
            b(kVar, p0Var, n0Var, f10, e2Var, kVar2, gVar, i10);
        } else if (n0Var2 instanceof c2) {
            List w10 = kVar.w();
            int size = w10.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                C1334q qVar = (C1334q) w10.get(i11);
                f12 += qVar.e().d();
                f11 = Math.max(f11, qVar.e().e());
            }
            Shader b10 = ((c2) n0Var2).b(C2428n.a(f11, f12));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            List w11 = kVar.w();
            int size2 = w11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C1334q qVar2 = (C1334q) w11.get(i12);
                C2520p0 p0Var2 = p0Var;
                qVar2.e().p(p0Var2, C2517o0.a(b10), f10, e2Var, kVar2, gVar, i10);
                p0Var2.d(0.0f, qVar2.e().d());
                matrix.setTranslate(0.0f, -qVar2.e().d());
                b10.setLocalMatrix(matrix);
            }
        }
        C2520p0 p0Var3 = p0Var;
        p0Var.h();
    }

    private static final void b(C1328k kVar, C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar2, C2606g gVar, int i10) {
        List w10 = kVar.w();
        int size = w10.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1334q qVar = (C1334q) w10.get(i11);
            qVar.e().p(p0Var, n0Var, f10, e2Var, kVar2, gVar, i10);
            p0Var.d(0.0f, qVar.e().d());
        }
    }
}
