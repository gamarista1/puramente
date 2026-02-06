package p003if;

import We.C5643o;
import bf.C5732b;

/* renamed from: if.d  reason: invalid package */
public abstract class d {
    public static C5643o a(Object obj) {
        C5643o oVar = new C5643o();
        c(oVar, obj);
        return oVar;
    }

    public static C5732b b(C5643o oVar) {
        return (C5732b) oVar.a("sentry:eventDropReason", C5732b.class);
    }

    public static void c(C5643o oVar, Object obj) {
        oVar.c("sentry:typeCheckHint", obj);
    }
}
