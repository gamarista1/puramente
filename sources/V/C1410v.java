package V;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.g2;
import yf.p;

/* renamed from: V.v  reason: case insensitive filesystem */
public final class C1410v {

    /* renamed from: a  reason: collision with root package name */
    public static final C1410v f8062a = new C1410v();

    /* renamed from: b  reason: collision with root package name */
    public static p f8063b = c.c(-1524796689, false, a.f8065a);

    /* renamed from: c  reason: collision with root package name */
    public static p f8064c = c.c(2066864887, false, b.f8066a);

    /* renamed from: V.v$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8065a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1524796689, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda-1.<anonymous> (ModalBottomSheet.kt:128)");
                }
                C1385i.f7527a.a((i) null, 0.0f, 0.0f, (g2) null, 0, mVar, 196608, 31);
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

    /* renamed from: V.v$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8066a = new b();

        b() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(2066864887, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda-2.<anonymous> (ModalBottomSheet.kt:211)");
                }
                C1385i.f7527a.a((i) null, 0.0f, 0.0f, (g2) null, 0, mVar, 196608, 31);
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
        return f8063b;
    }

    public final p b() {
        return f8064c;
    }
}
