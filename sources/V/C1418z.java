package V;

import Q.b;
import S.d;
import W.v;
import W.w;
import Y.C1500m;
import Y.C1506p;
import g0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import x0.C2891d;
import yf.p;

/* renamed from: V.z  reason: case insensitive filesystem */
public final class C1418z {

    /* renamed from: a  reason: collision with root package name */
    public static final C1418z f8155a = new C1418z();

    /* renamed from: b  reason: collision with root package name */
    public static p f8156b = c.c(-505750804, false, a.f8157a);

    /* renamed from: V.z$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8157a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-505750804, i10, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:231)");
                }
                C2891d a10 = d.a(b.a.f5156a);
                v.a aVar = v.f8397a;
                V.b(a10, w.a(v.a(C1402q0.f7961j), mVar, 0), (i) null, 0, mVar, 0, 12);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public final p a() {
        return f8156b;
    }
}
