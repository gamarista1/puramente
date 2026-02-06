package V;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.g2;
import yf.p;

/* renamed from: V.w  reason: case insensitive filesystem */
public final class C1412w {

    /* renamed from: a  reason: collision with root package name */
    public static final C1412w f8072a = new C1412w();

    /* renamed from: b  reason: collision with root package name */
    public static p f8073b = c.c(-1187811352, false, a.f8075a);

    /* renamed from: c  reason: collision with root package name */
    public static p f8074c = c.c(-91331245, false, b.f8076a);

    /* renamed from: V.w$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8075a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1187811352, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-1.<anonymous> (ModalBottomSheet.android.kt:242)");
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

    /* renamed from: V.w$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8076a = new b();

        b() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-91331245, i10, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-2.<anonymous> (ModalBottomSheet.android.kt:335)");
                }
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
        return f8074c;
    }
}
