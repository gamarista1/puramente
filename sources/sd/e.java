package Sd;

import Od.a;
import Od.c;
import Sg.C5541d;
import Ug.J;
import Ug.K;
import Ug.L;
import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import expo.modules.fetch.NativeRequest;
import expo.modules.fetch.NativeRequestInit;
import expo.modules.fetch.NativeResponse;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.h;
import ge.C5007a;
import ie.C5036f;
import ie.C5037g;
import ie.C5039i;
import ie.C5040j;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.net.URL;
import java.util.List;
import java.util.Map;
import ke.b;
import ke.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.C6531o;
import mf.C6565s;
import qe.C5155b;
import qe.C5157d;
import qe.V;
import qe.W;
import rh.C6703A;
import xf.C6781a;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"LSd/e;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "Lrh/A;", "d", "Lkotlin/Lazy;", "w", "()Lrh/A;", "client", "Lcom/facebook/react/modules/network/e;", "e", "x", "()Lcom/facebook/react/modules/network/e;", "cookieHandler", "Lcom/facebook/react/modules/network/a;", "f", "y", "()Lcom/facebook/react/modules/network/a;", "cookieJarContainer", "LUg/K;", "g", "z", "()LUg/K;", "moduleCoroutineScope", "Lcom/facebook/react/bridge/ReactContext;", "A", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "h", "a", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final C4391a f52428h = new C4391a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String f52429i = e.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f52430d = C6531o.b(new a(this));

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f52431e = C6531o.b(new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f52432f = C6531o.b(new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f52433g = C6531o.b(new d(this));

    public static final class A implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final A f52434a = new A();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeRequest.class);
        }
    }

    public static final class B implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].Q();
            return C6514M.f71813a;
        }
    }

    public static final class C implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C f52435a = new C();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeRequest.class);
        }
    }

    public static final class D implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final D f52436a = new D();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(URL.class);
        }
    }

    public static final class E implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final E f52437a = new E();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeRequestInit.class);
        }
    }

    public static final class F implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final F f52438a = new F();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.g(byte[].class);
        }
    }

    public static final class G implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f52439a;

        public G(e eVar) {
            this.f52439a = eVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            NativeRequest nativeRequest = objArr[0];
            URL url = objArr[1];
            URL url2 = url;
            NativeRequest nativeRequest2 = nativeRequest;
            C6703A o10 = this.f52439a.w();
            nativeRequest2.U(o10, url2, objArr[2], objArr[3]);
            nativeRequest2.T().A1(C6565s.q(n.RESPONSE_RECEIVED, n.ERROR_RECEIVED), new C4394d(pVar, nativeRequest2));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class H implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final H f52440a = new H();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeResponse.class);
        }
    }

    public static final class I implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f52441a;

        public I(e eVar) {
            this.f52441a = eVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return new NativeRequest(this.f52441a.c(), objArr[0]);
        }
    }

    /* renamed from: Sd.e$a  reason: case insensitive filesystem */
    public static final class C4391a {
        public /* synthetic */ C4391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4391a() {
        }
    }

    /* renamed from: Sd.e$b  reason: case insensitive filesystem */
    static final class C4392b implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NativeResponse f52442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ae.p f52443b;

        C4392b(NativeResponse nativeResponse, ae.p pVar) {
            this.f52442a = nativeResponse;
            this.f52443b = pVar;
        }

        public final void a(n nVar) {
            C6496s.h(nVar, "it");
            this.f52443b.resolve(this.f52442a.E0().b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Sd.e$c  reason: case insensitive filesystem */
    static final class C4393c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NativeResponse f52444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ae.p f52445b;

        C4393c(NativeResponse nativeResponse, ae.p pVar) {
            this.f52444a = nativeResponse;
            this.f52445b = pVar;
        }

        public final void a(n nVar) {
            C6496s.h(nVar, "it");
            this.f52445b.f(new String(this.f52444a.E0().b(), C5541d.f65029b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Sd.e$d  reason: case insensitive filesystem */
    static final class C4394d implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae.p f52446a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NativeRequest f52447b;

        C4394d(ae.p pVar, NativeRequest nativeRequest) {
            this.f52446a = pVar;
            this.f52447b = nativeRequest;
        }

        public final void a(n nVar) {
            CodedException codedException;
            CodedException unexpectedException;
            C6496s.h(nVar, "state");
            if (nVar == n.RESPONSE_RECEIVED) {
                this.f52446a.a();
            } else if (nVar == n.ERROR_RECEIVED) {
                ae.p pVar = this.f52446a;
                Exception x02 = this.f52447b.T().x0();
                if (x02 == null) {
                    codedException = new h();
                } else if (x02 instanceof CodedException) {
                    codedException = (CodedException) x02;
                } else {
                    if (x02 instanceof a) {
                        a aVar = (a) x02;
                        String a10 = aVar.a();
                        C6496s.g(a10, "getCode(...)");
                        unexpectedException = new CodedException(a10, aVar.getMessage(), aVar.getCause());
                    } else {
                        unexpectedException = new UnexpectedException((Throwable) x02);
                    }
                    codedException = unexpectedException;
                }
                pVar.g(codedException);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Sd.e$e  reason: collision with other inner class name */
    public static final class C0804e implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0804e f52448a = new C0804e();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeResponse.class);
        }
    }

    /* renamed from: Sd.e$f  reason: case insensitive filesystem */
    public static final class C4395f implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4395f f52449a = new C4395f();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeRequest.class);
        }
    }

    /* renamed from: Sd.e$g  reason: case insensitive filesystem */
    public static final class C4396g implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f52450a;

        public C4396g(e eVar) {
            this.f52450a = eVar;
        }

        public final void a() {
            this.f52450a.y().a(new rh.x(this.f52450a.x()));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C6514M.f71813a;
        }
    }

    /* renamed from: Sd.e$h  reason: case insensitive filesystem */
    public static final class C4397h implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f52451a;

        public C4397h(e eVar) {
            this.f52451a = eVar;
        }

        public final void a() {
            this.f52451a.x().e();
            this.f52451a.y().c();
            try {
                L.c(this.f52451a.z(), new c((String) null, 1, (DefaultConstructorMarker) null));
            } catch (IllegalStateException unused) {
                Log.e(e.f52429i, "The scope does not have a job in it");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C6514M.f71813a;
        }
    }

    /* renamed from: Sd.e$i  reason: case insensitive filesystem */
    public static final class C4398i implements yf.p {
        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            ((NativeResponse) pVar).z1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class j implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f52452a = new j();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeResponse.class);
        }
    }

    public static final class k implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return objArr[0].z1();
        }
    }

    public static final class l implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f52453a = new l();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeResponse.class);
        }
    }

    public static final class m implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f52454a = new m();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    public static final class n implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            NativeResponse nativeResponse = objArr[0];
            String str = objArr[1];
            nativeResponse.h0();
            return C6514M.f71813a;
        }
    }

    public static final class o implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f52455a = new o();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeResponse.class);
        }
    }

    public static final class p implements yf.p {
        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            NativeResponse nativeResponse = objArr[0];
            nativeResponse.A1(C6565s.e(n.BODY_COMPLETED), new C4392b(nativeResponse, pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class q implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final q f52456a = new q();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(NativeResponse.class);
        }
    }

    public static final class r implements yf.p {
        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            NativeResponse nativeResponse = objArr[0];
            nativeResponse.A1(C6565s.e(n.BODY_COMPLETED), new C4393c(nativeResponse, pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class s implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f52457a;

        public s(e eVar) {
            this.f52457a = eVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return new NativeResponse(this.f52457a.c(), this.f52457a.z());
        }
    }

    public static final class t implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return Boolean.valueOf(objArr[0].t0());
        }
    }

    public static final class u implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            List a10;
            C6496s.h(objArr, "it");
            k B02 = objArr[0].B0();
            if (B02 == null || (a10 = B02.a()) == null) {
                return C6565s.n();
            }
            return a10;
        }
    }

    public static final class v implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            int i10;
            C6496s.h(objArr, "it");
            k B02 = objArr[0].B0();
            if (B02 != null) {
                i10 = B02.c();
            } else {
                i10 = -1;
            }
            return Integer.valueOf(i10);
        }
    }

    public static final class w implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            String d10;
            C6496s.h(objArr, "it");
            k B02 = objArr[0].B0();
            if (B02 == null || (d10 = B02.d()) == null) {
                return "";
            }
            return d10;
        }
    }

    public static final class x implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            String e10;
            C6496s.h(objArr, "it");
            k B02 = objArr[0].B0();
            if (B02 == null || (e10 = B02.e()) == null) {
                return "";
            }
            return e10;
        }
    }

    public static final class y implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            boolean z10 = false;
            k B02 = objArr[0].B0();
            if (B02 != null) {
                z10 = B02.b();
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class z implements yf.p {
        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            ((NativeRequest) pVar).Q();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    private final ReactContext A() {
        ReactContext reactContext;
        Context u10 = c().u();
        if (u10 instanceof ReactContext) {
            reactContext = (ReactContext) u10;
        } else {
            reactContext = null;
        }
        if (reactContext != null) {
            return reactContext;
        }
        throw new h();
    }

    /* access modifiers changed from: private */
    public static final K B(e eVar) {
        return L.a(eVar.c().s().getCoroutineContext().n1(new J("expo.modules.fetch.CoroutineScope")));
    }

    /* access modifiers changed from: private */
    public static final C6703A t(e eVar) {
        return com.facebook.react.modules.network.h.b(eVar.A()).B().a(new expo.modules.fetch.b(eVar.A())).c();
    }

    /* access modifiers changed from: private */
    public static final com.facebook.react.modules.network.e u(e eVar) {
        return new com.facebook.react.modules.network.e(eVar.A());
    }

    /* access modifiers changed from: private */
    public static final com.facebook.react.modules.network.a v(e eVar) {
        rh.n p10 = eVar.w().p();
        C6496s.f(p10, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        return (com.facebook.react.modules.network.a) p10;
    }

    /* access modifiers changed from: private */
    public final C6703A w() {
        return (C6703A) this.f52430d.getValue();
    }

    /* access modifiers changed from: private */
    public final com.facebook.react.modules.network.e x() {
        return (com.facebook.react.modules.network.e) this.f52431e.getValue();
    }

    /* access modifiers changed from: private */
    public final com.facebook.react.modules.network.a y() {
        return (com.facebook.react.modules.network.a) this.f52432f.getValue();
    }

    /* access modifiers changed from: private */
    public final K z() {
        return (K) this.f52433g.getValue();
    }

    public d b() {
        Class<C6514M> cls;
        Class<Boolean> cls2;
        String str;
        Object obj;
        Class<ae.p> cls3;
        Object obj2;
        Class<C6514M> cls4;
        String str2;
        Object obj3;
        Object fVar;
        Class<C6514M> cls5 = C6514M.class;
        Class<ae.p> cls6 = ae.p.class;
        Class<Integer> cls7 = Integer.class;
        Class<List> cls8 = List.class;
        Class<Boolean> cls9 = Boolean.class;
        Class<Object> cls10 = Object.class;
        Class<NativeRequest> cls11 = NativeRequest.class;
        Class<String> cls12 = String.class;
        Class<NativeResponse> cls13 = NativeResponse.class;
        Class<byte[]> cls14 = byte[].class;
        Class<NativeRequestInit> cls15 = NativeRequestInit.class;
        StringBuilder sb2 = new StringBuilder();
        Class<URL> cls16 = URL.class;
        sb2.append("[");
        sb2.append("ExpoModulesCore");
        sb2.append("] ");
        sb2.append(getClass() + ".ModuleDefinition");
        D3.a.c(sb2.toString());
        try {
            ke.c cVar = new ke.c(this);
            cVar.o("ExpoFetchModule");
            Map r10 = cVar.r();
            ge.e eVar = ge.e.MODULE_CREATE;
            Class<NativeRequest> cls17 = cls11;
            Class<Integer> cls18 = cls7;
            r10.put(eVar, new C5007a(eVar, new C4396g(this)));
            Map r11 = cVar.r();
            ge.e eVar2 = ge.e.MODULE_DESTROY;
            r11.put(eVar2, new C5007a(eVar2, new C4397h(this)));
            Ff.d b10 = O.b(cls13);
            String simpleName = C6781a.b(b10).getSimpleName();
            C6496s.g(simpleName, "getSimpleName(...)");
            C5157d dVar = C5157d.f61437a;
            String str3 = "getSimpleName(...)";
            ke.c cVar2 = cVar;
            Ff.d b11 = O.b(cls13);
            Class<List> cls19 = cls8;
            Boolean bool = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b11, bool));
            if (bVar == null) {
                C0804e eVar3 = C0804e.f52448a;
                str = com.amazon.a.a.o.b.au;
                cls2 = cls9;
                cls = cls5;
                bVar = new C5155b(new qe.O(O.b(cls13), false, eVar3));
            } else {
                cls = cls5;
                cls2 = cls9;
                str = com.amazon.a.a.o.b.au;
            }
            ee.c cVar3 = new ee.c(simpleName, b10, bVar);
            C5155b[] bVarArr = new C5155b[0];
            W w10 = W.f61408a;
            V v10 = (V) w10.a().get(O.b(cls10));
            if (v10 == null) {
                v10 = new V(O.b(cls10));
                w10.a().put(O.b(cls10), v10);
            }
            cVar3.u(new ie.r("constructor", bVarArr, v10, new s(this)));
            if (C6496s.c(cls13, cls6)) {
                obj = new C5037g("startStreaming", new C5155b[0], new C4398i());
            } else {
                C5155b bVar2 = (C5155b) dVar.a().get(new Pair(O.b(cls13), bool));
                if (bVar2 == null) {
                    bVar2 = new C5155b(new qe.O(O.b(cls13), false, j.f52452a));
                }
                obj = new C5036f("startStreaming", new C5155b[]{bVar2}, new k());
            }
            cVar3.k().put("startStreaming", obj);
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(O.b(cls13), bool));
            if (bVar3 == null) {
                bVar3 = new C5155b(new qe.O(O.b(cls13), false, l.f52453a));
            }
            C5155b bVar4 = (C5155b) dVar.a().get(new Pair(O.b(cls12), bool));
            if (bVar4 == null) {
                cls3 = cls6;
                bVar4 = new C5155b(new qe.O(O.b(cls12), false, m.f52454a));
            } else {
                cls3 = cls6;
            }
            C5155b[] bVarArr2 = {bVar3, bVar4};
            n nVar = new n();
            Class cls20 = Integer.TYPE;
            Class<C6514M> cls21 = cls;
            if (C6496s.c(cls21, cls20)) {
                obj2 = new ie.l("cancelStreaming", bVarArr2, nVar);
            } else if (C6496s.c(cls21, Boolean.TYPE)) {
                obj2 = new C5039i("cancelStreaming", bVarArr2, nVar);
            } else if (C6496s.c(cls21, Double.TYPE)) {
                obj2 = new C5040j("cancelStreaming", bVarArr2, nVar);
            } else if (C6496s.c(cls21, Float.TYPE)) {
                obj2 = new ie.k("cancelStreaming", bVarArr2, nVar);
            } else if (C6496s.c(cls21, cls12)) {
                obj2 = new ie.n("cancelStreaming", bVarArr2, nVar);
            } else {
                obj2 = new C5036f("cancelStreaming", bVarArr2, nVar);
            }
            cVar3.k().put("cancelStreaming", obj2);
            le.j jVar = new le.j(cVar3.t().f(), "bodyUsed");
            C5155b[] bVarArr3 = {new C5155b(jVar.d())};
            Class cls22 = cls20;
            V v11 = (V) w10.a().get(O.b(cls2));
            if (v11 == null) {
                v11 = new V(O.b(cls2));
                cls4 = cls21;
                w10.a().put(O.b(cls2), v11);
            } else {
                cls4 = cls21;
            }
            String str4 = str;
            ie.r rVar = new ie.r(str4, bVarArr3, v11, new t());
            rVar.k(jVar.d());
            rVar.j(true);
            jVar.b(rVar);
            cVar3.m().put("bodyUsed", jVar);
            le.j jVar2 = new le.j(cVar3.t().f(), "_rawHeaders");
            C5155b[] bVarArr4 = {new C5155b(jVar2.d())};
            V v12 = (V) w10.a().get(O.b(cls19));
            if (v12 == null) {
                v12 = new V(O.b(cls19));
                str2 = "constructor";
                w10.a().put(O.b(cls19), v12);
            } else {
                str2 = "constructor";
            }
            ie.r rVar2 = new ie.r(str4, bVarArr4, v12, new u());
            rVar2.k(jVar2.d());
            rVar2.j(true);
            jVar2.b(rVar2);
            cVar3.m().put("_rawHeaders", jVar2);
            le.j jVar3 = new le.j(cVar3.t().f(), "status");
            C5155b[] bVarArr5 = {new C5155b(jVar3.d())};
            V v13 = (V) w10.a().get(O.b(cls18));
            if (v13 == null) {
                v13 = new V(O.b(cls18));
                w10.a().put(O.b(cls18), v13);
            }
            ie.r rVar3 = new ie.r(str4, bVarArr5, v13, new v());
            rVar3.k(jVar3.d());
            rVar3.j(true);
            jVar3.b(rVar3);
            cVar3.m().put("status", jVar3);
            le.j jVar4 = new le.j(cVar3.t().f(), "statusText");
            C5155b[] bVarArr6 = {new C5155b(jVar4.d())};
            V v14 = (V) w10.a().get(O.b(cls12));
            if (v14 == null) {
                v14 = new V(O.b(cls12));
                w10.a().put(O.b(cls12), v14);
            }
            ie.r rVar4 = new ie.r(str4, bVarArr6, v14, new w());
            rVar4.k(jVar4.d());
            rVar4.j(true);
            jVar4.b(rVar4);
            cVar3.m().put("statusText", jVar4);
            le.j jVar5 = new le.j(cVar3.t().f(), "url");
            C5155b[] bVarArr7 = {new C5155b(jVar5.d())};
            V v15 = (V) w10.a().get(O.b(cls12));
            if (v15 == null) {
                v15 = new V(O.b(cls12));
                w10.a().put(O.b(cls12), v15);
            }
            ie.r rVar5 = new ie.r(str4, bVarArr7, v15, new x());
            rVar5.k(jVar5.d());
            rVar5.j(true);
            jVar5.b(rVar5);
            cVar3.m().put("url", jVar5);
            le.j jVar6 = new le.j(cVar3.t().f(), "redirected");
            C5155b[] bVarArr8 = {new C5155b(jVar6.d())};
            V v16 = (V) w10.a().get(O.b(cls2));
            if (v16 == null) {
                v16 = new V(O.b(cls2));
                w10.a().put(O.b(cls2), v16);
            }
            ie.r rVar6 = new ie.r(str4, bVarArr8, v16, new y());
            rVar6.k(jVar6.d());
            rVar6.j(true);
            jVar6.b(rVar6);
            cVar3.m().put("redirected", jVar6);
            C5155b bVar5 = (C5155b) dVar.a().get(new Pair(O.b(cls13), bool));
            if (bVar5 == null) {
                bVar5 = new C5155b(new qe.O(O.b(cls13), false, o.f52455a));
            }
            cVar3.k().put("arrayBuffer", new C5037g("arrayBuffer", new C5155b[]{bVar5}, new p()));
            C5155b bVar6 = (C5155b) dVar.a().get(new Pair(O.b(cls13), bool));
            if (bVar6 == null) {
                bVar6 = new C5155b(new qe.O(O.b(cls13), false, q.f52456a));
            }
            cVar3.k().put(AttributeType.TEXT, new C5037g(AttributeType.TEXT, new C5155b[]{bVar6}, new r()));
            cVar2.q().add(cVar3.q());
            Ff.d b12 = O.b(cls17);
            String simpleName2 = C6781a.b(b12).getSimpleName();
            C6496s.g(simpleName2, str3);
            C5155b bVar7 = (C5155b) dVar.a().get(new Pair(O.b(cls17), bool));
            if (bVar7 == null) {
                bVar7 = new C5155b(new qe.O(O.b(cls17), false, C4395f.f52449a));
            }
            ee.c cVar4 = new ee.c(simpleName2, b12, bVar7);
            C5155b bVar8 = (C5155b) dVar.a().get(new Pair(O.b(cls13), bool));
            if (bVar8 == null) {
                bVar8 = new C5155b(new qe.O(O.b(cls13), false, H.f52440a));
            }
            C5155b[] bVarArr9 = {bVar8};
            V v17 = (V) w10.a().get(O.b(cls10));
            if (v17 == null) {
                v17 = new V(O.b(cls10));
                w10.a().put(O.b(cls10), v17);
            }
            cVar4.u(new ie.r(str2, bVarArr9, v17, new I(this)));
            C5155b bVar9 = (C5155b) dVar.a().get(new Pair(O.b(cls17), bool));
            if (bVar9 == null) {
                bVar9 = new C5155b(new qe.O(O.b(cls17), false, C.f52435a));
            }
            C5155b bVar10 = (C5155b) dVar.a().get(new Pair(O.b(cls16), bool));
            if (bVar10 == null) {
                bVar10 = new C5155b(new qe.O(O.b(cls16), false, D.f52436a));
            }
            C5155b bVar11 = (C5155b) dVar.a().get(new Pair(O.b(cls15), bool));
            if (bVar11 == null) {
                bVar11 = new C5155b(new qe.O(O.b(cls15), false, E.f52437a));
            }
            C5155b bVar12 = (C5155b) dVar.a().get(new Pair(O.b(cls14), Boolean.TRUE));
            if (bVar12 == null) {
                bVar12 = new C5155b(new qe.O(O.b(cls14), true, F.f52438a));
            }
            cVar4.k().put(OpsMetricTracker.START, new C5037g(OpsMetricTracker.START, new C5155b[]{bVar9, bVar10, bVar11, bVar12}, new G(this)));
            Class<NativeRequest> cls23 = cls17;
            if (C6496s.c(cls23, cls3)) {
                obj3 = new C5037g("cancel", new C5155b[0], new z());
            } else {
                C5155b bVar13 = (C5155b) dVar.a().get(new Pair(O.b(cls23), bool));
                if (bVar13 == null) {
                    bVar13 = new C5155b(new qe.O(O.b(cls23), false, A.f52434a));
                }
                C5155b[] bVarArr10 = {bVar13};
                B b13 = new B();
                Class<C6514M> cls24 = cls4;
                if (C6496s.c(cls24, cls22)) {
                    fVar = new ie.l("cancel", bVarArr10, b13);
                } else if (C6496s.c(cls24, Boolean.TYPE)) {
                    fVar = new C5039i("cancel", bVarArr10, b13);
                } else if (C6496s.c(cls24, Double.TYPE)) {
                    fVar = new C5040j("cancel", bVarArr10, b13);
                } else if (C6496s.c(cls24, Float.TYPE)) {
                    fVar = new ie.k("cancel", bVarArr10, b13);
                } else if (C6496s.c(cls24, cls12)) {
                    fVar = new ie.n("cancel", bVarArr10, b13);
                } else {
                    fVar = new C5036f("cancel", bVarArr10, b13);
                }
                obj3 = fVar;
            }
            cVar4.k().put("cancel", obj3);
            cVar2.q().add(cVar4.q());
            d p10 = cVar2.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
