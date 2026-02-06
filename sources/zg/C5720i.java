package Zg;

import Ug.H;
import Ug.I;
import lf.C6523g;
import qf.g;

/* renamed from: Zg.i  reason: case insensitive filesystem */
public abstract class C5720i {
    public static final void a(g gVar, Throwable th2) {
        for (H I10 : C5719h.a()) {
            try {
                I10.I(gVar, th2);
            } catch (Throwable th3) {
                C5719h.b(I.b(th2, th3));
            }
        }
        try {
            C6523g.a(th2, new C5721j(gVar));
        } catch (Throwable unused) {
        }
        C5719h.b(th2);
    }
}
