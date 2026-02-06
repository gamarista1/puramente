package m3;

import Xg.C5694f;
import Xg.C5696h;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.C2224x;
import mf.C6565s;
import yf.C6787a;

/* renamed from: m3.F  reason: case insensitive filesystem */
public final class C2201F {

    /* renamed from: e  reason: collision with root package name */
    public static final d f23775e = new d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final X f23776f = new c();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C2216o f23777g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final C5694f f23778a;

    /* renamed from: b  reason: collision with root package name */
    private final X f23779b;

    /* renamed from: c  reason: collision with root package name */
    private final C2216o f23780c;

    /* renamed from: d  reason: collision with root package name */
    private final C6787a f23781d;

    /* renamed from: m3.F$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23782a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: m3.F$b */
    public static final class b implements C2216o {
        b() {
        }

        public void a(Z z10) {
            C6496s.h(z10, "viewportHint");
        }
    }

    /* renamed from: m3.F$d */
    public static final class d {

        /* renamed from: m3.F$d$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f23783a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f23783a = list;
            }

            /* renamed from: a */
            public final C2224x.b invoke() {
                return C2224x.b.f24139g.c(C6565s.e(new W(0, this.f23783a)), 0, 0, C2219s.f24100f.a(), (C2219s) null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2201F a(List list) {
            C6496s.h(list, "data");
            return new C2201F(C5696h.A(new C2224x.d(list, (C2219s) null, (C2219s) null)), c(), b(), new a(list));
        }

        public final C2216o b() {
            return C2201F.f23777g;
        }

        public final X c() {
            return C2201F.f23776f;
        }

        private d() {
        }
    }

    public C2201F(C5694f fVar, X x10, C2216o oVar, C6787a aVar) {
        C6496s.h(fVar, "flow");
        C6496s.h(x10, "uiReceiver");
        C6496s.h(oVar, "hintReceiver");
        C6496s.h(aVar, "cachedPageEvent");
        this.f23778a = fVar;
        this.f23779b = x10;
        this.f23780c = oVar;
        this.f23781d = aVar;
    }

    public final C2224x.b c() {
        return (C2224x.b) this.f23781d.invoke();
    }

    public final C5694f d() {
        return this.f23778a;
    }

    public final C2216o e() {
        return this.f23780c;
    }

    public final X f() {
        return this.f23779b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2201F(C5694f fVar, X x10, C2216o oVar, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, x10, oVar, (i10 & 8) != 0 ? a.f23782a : aVar);
    }

    /* renamed from: m3.F$c */
    public static final class c implements X {
        c() {
        }

        public void a() {
        }

        public void b() {
        }
    }
}
