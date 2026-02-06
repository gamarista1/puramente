package G;

import Ef.m;
import Y.C1510r0;
import Y.o1;
import h0.C2017a;
import h0.C2026j;
import h0.C2028l;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: G.b  reason: case insensitive filesystem */
final class C1176b extends C {

    /* renamed from: L  reason: collision with root package name */
    public static final c f2250L = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public static final C2026j f2251M = C2017a.a(a.f2253a, C0034b.f2254a);

    /* renamed from: K  reason: collision with root package name */
    private C1510r0 f2252K;

    /* renamed from: G.b$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2253a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(C2028l lVar, C1176b bVar) {
            return C6565s.q(Integer.valueOf(bVar.v()), Float.valueOf(m.k(bVar.w(), -0.5f, 0.5f)), Integer.valueOf(bVar.F()));
        }
    }

    /* renamed from: G.b$b  reason: collision with other inner class name */
    static final class C0034b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0034b f2254a = new C0034b();

        /* renamed from: G.b$b$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f2255a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f2255a = list;
            }

            /* renamed from: a */
            public final Integer invoke() {
                Object obj = this.f2255a.get(2);
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        C0034b() {
            super(1);
        }

        /* renamed from: a */
        public final C1176b invoke(List list) {
            Object obj = list.get(0);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C1176b(intValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    /* renamed from: G.b$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a() {
            return C1176b.f2251M;
        }

        private c() {
        }
    }

    public C1176b(int i10, float f10, C6787a aVar) {
        super(i10, f10);
        this.f2252K = u1.d(aVar, (o1) null, 2, (Object) null);
    }

    public int F() {
        return ((Number) ((C6787a) this.f2252K.getValue()).invoke()).intValue();
    }

    public final C1510r0 m0() {
        return this.f2252K;
    }
}
