package Y;

import g0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

/* renamed from: Y.i  reason: case insensitive filesystem */
public final class C1492i {

    /* renamed from: a  reason: collision with root package name */
    public static final C1492i f10015a = new C1492i();

    /* renamed from: b  reason: collision with root package name */
    public static p f10016b = c.c(954879418, false, a.f10018a);

    /* renamed from: c  reason: collision with root package name */
    public static p f10017c = c.c(1918065384, false, b.f10019a);

    /* renamed from: Y.i$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10018a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:623)");
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

    /* renamed from: Y.i$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10019a = new b();

        b() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:757)");
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
        return f10016b;
    }

    public final p b() {
        return f10017c;
    }
}
