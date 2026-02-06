package Xg;

import Yg.i;
import Yg.j;
import Zg.H;
import com.google.android.gms.common.api.a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6559l;
import qf.C6658d;
import qf.g;
import yf.p;
import yf.q;

abstract /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int f66642a = H.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, a.e.API_PRIORITY_OTHER);

    static final class a extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f66643a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66644b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f66645c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f66646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C6658d dVar) {
            super(3, dVar);
            this.f66646d = pVar;
        }

        public final Object invoke(C5695g gVar, Object obj, C6658d dVar) {
            a aVar = new a(this.f66646d, dVar);
            aVar.f66644b = gVar;
            aVar.f66645c = obj;
            return aVar.invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Xg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r5.f66643a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                lf.w.b(r6)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f66644b
                Xg.g r1 = (Xg.C5695g) r1
                lf.w.b(r6)
                goto L_0x0039
            L_0x0022:
                lf.w.b(r6)
                java.lang.Object r6 = r5.f66644b
                r1 = r6
                Xg.g r1 = (Xg.C5695g) r1
                java.lang.Object r6 = r5.f66645c
                yf.p r4 = r5.f66646d
                r5.f66644b = r1
                r5.f66643a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r3 = 0
                r5.f66644b = r3
                r5.f66643a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                lf.M r6 = lf.C6514M.f71813a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final C5694f a(C5694f fVar, p pVar) {
        return C5696h.O(fVar, new a(pVar, (C6658d) null));
    }

    public static final C5694f b(Iterable iterable) {
        return new j(iterable, (g) null, 0, (Wg.a) null, 14, (DefaultConstructorMarker) null);
    }

    public static final C5694f c(C5694f... fVarArr) {
        return C5696h.D(C6559l.R(fVarArr));
    }

    public static final C5694f d(C5694f fVar, q qVar) {
        return new i(qVar, fVar, (g) null, 0, (Wg.a) null, 28, (DefaultConstructorMarker) null);
    }
}
