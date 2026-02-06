package Zg;

import Ug.I;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6523g;
import qf.g;
import yf.C6798l;

public abstract class y {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f67009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f67010b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f67011c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6798l lVar, Object obj, g gVar) {
            super(1);
            this.f67009a = lVar;
            this.f67010b = obj;
            this.f67011c = gVar;
        }

        public final void a(Throwable th2) {
            y.b(this.f67009a, this.f67010b, this.f67011c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final C6798l a(C6798l lVar, Object obj, g gVar) {
        return new a(lVar, obj, gVar);
    }

    public static final void b(C6798l lVar, Object obj, g gVar) {
        P c10 = c(lVar, obj, (P) null);
        if (c10 != null) {
            I.a(gVar, c10);
        }
    }

    public static final P c(C6798l lVar, Object obj, P p10) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th2) {
            if (p10 == null || p10.getCause() == th2) {
                return new P("Exception in undelivered element handler for " + obj, th2);
            }
            C6523g.a(p10, th2);
        }
        return p10;
    }

    public static /* synthetic */ P d(C6798l lVar, Object obj, P p10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            p10 = null;
        }
        return c(lVar, obj, p10);
    }
}
