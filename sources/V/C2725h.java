package v;

import kotlin.jvm.internal.C6498u;
import r0.C2544x0;
import r0.C2550z0;
import s0.C2581c;
import s0.C2585g;
import w.C2804p;
import w.r0;
import w.t0;
import yf.C6798l;

/* renamed from: v.h  reason: case insensitive filesystem */
public abstract class C2725h {

    /* renamed from: a  reason: collision with root package name */
    private static final C6798l f26868a = a.f26869a;

    /* renamed from: v.h$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26869a = new a();

        /* renamed from: v.h$a$a  reason: collision with other inner class name */
        static final class C0447a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0447a f26870a = new C0447a();

            C0447a() {
                super(1);
            }

            public final C2804p a(long j10) {
                long m10 = C2544x0.m(j10, C2585g.f25794a.t());
                return new C2804p(C2544x0.r(m10), C2544x0.v(m10), C2544x0.u(m10), C2544x0.s(m10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((C2544x0) obj).y());
            }
        }

        /* renamed from: v.h$a$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2581c f26871a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C2581c cVar) {
                super(1);
                this.f26871a = cVar;
            }

            public final long a(C2804p pVar) {
                float g10 = pVar.g();
                float f10 = 0.0f;
                if (g10 < 0.0f) {
                    g10 = 0.0f;
                }
                float f11 = 1.0f;
                if (g10 > 1.0f) {
                    g10 = 1.0f;
                }
                float h10 = pVar.h();
                float f12 = -0.5f;
                if (h10 < -0.5f) {
                    h10 = -0.5f;
                }
                float f13 = 0.5f;
                if (h10 > 0.5f) {
                    h10 = 0.5f;
                }
                float i10 = pVar.i();
                if (i10 >= -0.5f) {
                    f12 = i10;
                }
                if (f12 <= 0.5f) {
                    f13 = f12;
                }
                float f14 = pVar.f();
                if (f14 >= 0.0f) {
                    f10 = f14;
                }
                if (f10 <= 1.0f) {
                    f11 = f10;
                }
                return C2544x0.m(C2550z0.a(g10, h10, f13, f11, C2585g.f25794a.t()), this.f26871a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C2544x0.k(a((C2804p) obj));
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final r0 invoke(C2581c cVar) {
            return t0.a(C0447a.f26870a, new b(cVar));
        }
    }

    public static final C6798l a(C2544x0.a aVar) {
        return f26868a;
    }
}
