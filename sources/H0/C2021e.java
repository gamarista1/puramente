package h0;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.J0;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.O;
import yf.C6798l;
import yf.p;

/* renamed from: h0.e  reason: case insensitive filesystem */
final class C2021e implements C2020d {

    /* renamed from: d  reason: collision with root package name */
    public static final c f21114d = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C2026j f21115e = C2027k.a(a.f21119a, b.f21120a);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f21116a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f21117b;

    /* renamed from: c  reason: collision with root package name */
    private C2023g f21118c;

    /* renamed from: h0.e$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21119a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Map invoke(C2028l lVar, C2021e eVar) {
            return eVar.h();
        }
    }

    /* renamed from: h0.e$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21120a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C2021e invoke(Map map) {
            return new C2021e(map);
        }
    }

    /* renamed from: h0.e$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a() {
            return C2021e.f21115e;
        }

        private c() {
        }
    }

    /* renamed from: h0.e$d */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f21121a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21122b = true;

        /* renamed from: c  reason: collision with root package name */
        private final C2023g f21123c;

        /* renamed from: h0.e$d$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2021e f21125a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2021e eVar) {
                super(1);
                this.f21125a = eVar;
            }

            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                boolean z10;
                C2023g g10 = this.f21125a.g();
                if (g10 != null) {
                    z10 = g10.a(obj);
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }

        public d(Object obj) {
            this.f21121a = obj;
            this.f21123c = C2025i.a((Map) C2021e.this.f21116a.get(obj), new a(C2021e.this));
        }

        public final C2023g a() {
            return this.f21123c;
        }

        public final void b(Map map) {
            if (this.f21122b) {
                Map e10 = this.f21123c.e();
                if (e10.isEmpty()) {
                    map.remove(this.f21121a);
                } else {
                    map.put(this.f21121a, e10);
                }
            }
        }

        public final void c(boolean z10) {
            this.f21122b = z10;
        }
    }

    /* renamed from: h0.e$e  reason: collision with other inner class name */
    static final class C0354e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2021e f21126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f21127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f21128c;

        /* renamed from: h0.e$e$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f21129a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2021e f21130b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f21131c;

            public a(d dVar, C2021e eVar, Object obj) {
                this.f21129a = dVar;
                this.f21130b = eVar;
                this.f21131c = obj;
            }

            public void dispose() {
                this.f21129a.b(this.f21130b.f21116a);
                this.f21130b.f21117b.remove(this.f21131c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0354e(C2021e eVar, Object obj, d dVar) {
            super(1);
            this.f21126a = eVar;
            this.f21127b = obj;
            this.f21128c = dVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            boolean containsKey = this.f21126a.f21117b.containsKey(this.f21127b);
            Object obj = this.f21127b;
            if (!containsKey) {
                this.f21126a.f21116a.remove(this.f21127b);
                this.f21126a.f21117b.put(this.f21127b, this.f21128c);
                return new a(this.f21128c, this.f21126a, this.f21127b);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* renamed from: h0.e$f */
    static final class f extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2021e f21132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f21133b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f21134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f21135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C2021e eVar, Object obj, p pVar, int i10) {
            super(2);
            this.f21132a = eVar;
            this.f21133b = obj;
            this.f21134c = pVar;
            this.f21135d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f21132a.c(this.f21133b, this.f21134c, mVar, M0.a(this.f21135d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public C2021e(Map map) {
        this.f21116a = map;
        this.f21117b = new LinkedHashMap();
    }

    /* access modifiers changed from: private */
    public final Map h() {
        Map B10 = O.B(this.f21116a);
        for (d b10 : this.f21117b.values()) {
            b10.b(B10);
        }
        if (B10.isEmpty()) {
            return null;
        }
        return B10;
    }

    public void c(Object obj, p pVar, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-1198538093);
        if ((i10 & 6) == 0) {
            if (h10.C(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(this)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1198538093, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            h10.H(207, obj);
            Object A10 = h10.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                C2023g gVar = this.f21118c;
                if (gVar != null) {
                    z10 = gVar.a(obj);
                } else {
                    z10 = true;
                }
                if (z10) {
                    A10 = new d(obj);
                    h10.r(A10);
                } else {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
            }
            d dVar = (d) A10;
            C1521x.a(C2025i.d().d(dVar.a()), pVar, h10, (i11 & 112) | J0.f9784i);
            C6514M m10 = C6514M.f71813a;
            boolean C10 = h10.C(this) | h10.C(obj) | h10.C(dVar);
            Object A11 = h10.A();
            if (C10 || A11 == aVar.a()) {
                A11 = new C0354e(this, obj, dVar);
                h10.r(A11);
            }
            P.c(m10, (C6798l) A11, h10, 6);
            h10.y();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(this, obj, pVar, i10));
        }
    }

    public void d(Object obj) {
        d dVar = (d) this.f21117b.get(obj);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.f21116a.remove(obj);
        }
    }

    public final C2023g g() {
        return this.f21118c;
    }

    public final void i(C2023g gVar) {
        this.f21118c = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2021e(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
