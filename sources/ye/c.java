package ye;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import expo.modules.splashscreen.SplashScreenOptions;
import ge.C5007a;
import ie.C5036f;
import ie.C5039i;
import ie.C5040j;
import ie.k;
import ie.n;
import ie.r;
import io.intercom.android.sdk.annotations.SeenState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.w;
import qe.C5155b;
import qe.C5157d;
import qe.V;
import qe.W;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lye/c;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "", "d", "Z", "userControlledAutoHideEnabled", "expo-splash-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends ke.b {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f62352d;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f62353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SplashScreenOptions f62354b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SplashScreenOptions splashScreenOptions, C6658d dVar) {
            super(2, dVar);
            this.f62354b = splashScreenOptions;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f62354b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f62353a == 0) {
                w.b(obj);
                b.f62348a.f(this.f62354b);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class b implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62355a;

        public b(c cVar) {
            this.f62355a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            this.f62355a.f62352d = true;
            b.f62348a.e(true);
            return Boolean.TRUE;
        }
    }

    /* renamed from: ye.c$c  reason: collision with other inner class name */
    public static final class C0919c implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            b.f62348a.e(true);
            return C6514M.f71813a;
        }
    }

    public static final class d implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            b.f62348a.d();
            return C6514M.f71813a;
        }
    }

    public static final class e implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62356a;

        public e(c cVar) {
            this.f62356a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            if (!this.f62356a.f62352d) {
                b.f62348a.d();
            }
            return C6514M.f71813a;
        }
    }

    public static final class f implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f62357a = new f();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(SplashScreenOptions.class);
        }
    }

    public static final class g implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62358a;

        public g(c cVar) {
            this.f62358a = cVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return C5576k.d(this.f62358a.c().r(), (qf.g) null, (M) null, new a(objArr[0], (C6658d) null), 3, (Object) null);
        }
    }

    public static final class h implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            b.f62348a.d();
            return C6514M.f71813a;
        }
    }

    public static final class i implements C6787a {
        public final void a() {
            b.f62348a.g();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C6514M.f71813a;
        }
    }

    public ke.d b() {
        Object obj;
        Object obj2;
        Class<SplashScreenOptions> cls = SplashScreenOptions.class;
        Class<Object> cls2 = Object.class;
        Class<C5600w0> cls3 = C5600w0.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            ke.c cVar = new ke.c(this);
            cVar.o("ExpoSplashScreen");
            C5155b[] bVarArr = new C5155b[0];
            b bVar = new b(this);
            Class<Boolean> cls4 = Boolean.class;
            Class cls5 = Integer.TYPE;
            Class<String> cls6 = String.class;
            if (C6496s.c(cls4, cls5)) {
                obj = new ie.l("preventAutoHideAsync", bVarArr, bVar);
            } else if (C6496s.c(cls4, Boolean.TYPE)) {
                obj = new C5039i("preventAutoHideAsync", bVarArr, bVar);
            } else if (C6496s.c(cls4, Double.TYPE)) {
                obj = new C5040j("preventAutoHideAsync", bVarArr, bVar);
            } else if (C6496s.c(cls4, Float.TYPE)) {
                obj = new k("preventAutoHideAsync", bVarArr, bVar);
            } else if (C6496s.c(cls4, cls6)) {
                obj = new n("preventAutoHideAsync", bVarArr, bVar);
            } else {
                obj = new C5036f("preventAutoHideAsync", bVarArr, bVar);
            }
            cVar.k().put("preventAutoHideAsync", obj);
            C5155b[] bVarArr2 = new C5155b[0];
            C0919c cVar2 = new C0919c();
            Class<C6514M> cls7 = C6514M.class;
            if (C6496s.c(cls7, cls5)) {
                obj2 = new ie.l("internalPreventAutoHideAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls7, Boolean.TYPE)) {
                obj2 = new C5039i("internalPreventAutoHideAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls7, Double.TYPE)) {
                obj2 = new C5040j("internalPreventAutoHideAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls7, Float.TYPE)) {
                obj2 = new k("internalPreventAutoHideAsync", bVarArr2, cVar2);
            } else if (C6496s.c(cls7, cls6)) {
                obj2 = new n("internalPreventAutoHideAsync", bVarArr2, cVar2);
            } else {
                obj2 = new C5036f("internalPreventAutoHideAsync", bVarArr2, cVar2);
            }
            cVar.k().put("internalPreventAutoHideAsync", obj2);
            C5155b bVar2 = (C5155b) C5157d.f61437a.a().get(new Pair(O.b(cls), Boolean.FALSE));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(O.b(cls), false, f.f62357a));
            }
            C5155b[] bVarArr3 = {bVar2};
            W w10 = W.f61408a;
            V v10 = (V) w10.a().get(O.b(cls3));
            if (v10 == null) {
                v10 = new V(O.b(cls3));
                w10.a().put(O.b(cls3), v10);
            }
            cVar.n().put("setOptions", new r("setOptions", bVarArr3, v10, new g(this)));
            C5155b[] bVarArr4 = new C5155b[0];
            V v11 = (V) w10.a().get(O.b(cls2));
            if (v11 == null) {
                v11 = new V(O.b(cls2));
                w10.a().put(O.b(cls2), v11);
            }
            cVar.n().put(SeenState.HIDE, new r(SeenState.HIDE, bVarArr4, v11, new h()));
            cVar.k().put("hideAsync", new C5036f("hideAsync", new C5155b[0], new d()));
            cVar.k().put("internalMaybeHideAsync", new C5036f("internalMaybeHideAsync", new C5155b[0], new e(this)));
            Map r10 = cVar.r();
            ge.e eVar = ge.e.MODULE_DESTROY;
            r10.put(eVar, new C5007a(eVar, new i()));
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
