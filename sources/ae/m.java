package ae;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import ce.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.q;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.views.n;
import ge.C5007a;
import ge.c;
import ie.C5031a;
import ie.C5034d;
import ie.C5038h;
import ie.r;
import java.util.List;
import java.util.Map;
import ke.d;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import le.e;
import le.h;
import lf.C6514M;
import lf.C6531o;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import xf.C6781a;
import yf.p;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final ke.b f53628a;

    /* renamed from: b  reason: collision with root package name */
    private final d f53629b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53630c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f53631d = C6531o.b(new l(this));

    static final class a implements JNIFunctionBody {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f53632a;

        a(m mVar) {
            this.f53632a = mVar;
        }

        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return this.f53632a.h();
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f53633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f53634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f53635c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, m mVar, C6658d dVar) {
            super(2, dVar);
            this.f53634b = pVar;
            this.f53635c = mVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f53634b, this.f53635c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f53633a;
            if (i10 == 0) {
                w.b(obj);
                p pVar = this.f53634b;
                g f11 = this.f53635c.g().c().f();
                this.f53633a = 1;
                if (pVar.invoke(f11, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public m(ke.b bVar) {
        C6496s.h(bVar, "module");
        this.f53628a = bVar;
        this.f53629b = bVar.b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final void c(C4464a aVar, e eVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        D3.a.c("[" + "ExpoModulesCore" + "] " + "Exporting constants");
        try {
            WritableNativeMap makeNativeMap = Arguments.makeNativeMap((Map<String, Object>) (Map) eVar.b().invoke());
            C6496s.e(makeNativeMap);
            jSDecoratorsBridgingObject.registerConstants(makeNativeMap);
            C6514M m10 = C6514M.f71813a;
            D3.a.f();
            D3.a.c("[" + "ExpoModulesCore" + "] " + "Attaching functions");
            try {
                C4465b d10 = eVar.d();
                while (d10.hasNext()) {
                    ((C5031a) d10.next()).a(aVar, jSDecoratorsBridgingObject, str);
                }
                C6514M m11 = C6514M.f71813a;
                D3.a.f();
                D3.a.c("[" + "ExpoModulesCore" + "] " + "Attaching properties");
                try {
                    for (Map.Entry value : eVar.e().entrySet()) {
                        ((h) value.getValue()).c(aVar, jSDecoratorsBridgingObject);
                    }
                    C6514M m12 = C6514M.f71813a;
                    D3.a.f();
                } catch (Throwable th2) {
                    throw th2;
                }
            } finally {
                D3.a.f();
            }
        } catch (Throwable th3) {
            D3.a.f();
            throw th3;
        }
    }

    /* access modifiers changed from: private */
    public static final JavaScriptModuleObject j(m mVar) {
        List<C5038h> list;
        Ff.e eVar;
        Ff.d dVar;
        Class cls;
        String str;
        Class j10;
        m mVar2 = mVar;
        mVar2.f53630c = true;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (mVar.h() + ".jsObject"));
        try {
            C4464a c10 = mVar.g().c();
            JNIDeallocator e10 = mVar.g().e().e();
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(e10);
            mVar2.c(c10, mVar.e().f(), jSDecoratorsBridgingObject, mVar.h());
            jSDecoratorsBridgingObject.registerProperty("__expo_module_name__", false, new ExpectedType[0], new a(mVar2), false, new ExpectedType[0], (JNIFunctionBody) null);
            n h10 = mVar.e().h();
            if (h10 != null) {
                list = h10.b();
            } else {
                list = null;
            }
            if (list != null && (!list.isEmpty())) {
                D3.a.c("[" + "ExpoModulesCore" + "] " + "Attaching view prototype");
                JSDecoratorsBridgingObject jSDecoratorsBridgingObject2 = new JSDecoratorsBridgingObject(e10);
                for (C5038h hVar : list) {
                    String h11 = mVar.h();
                    n h12 = mVar.e().h();
                    if (h12 == null || (j10 = h12.j()) == null) {
                        str = null;
                    } else {
                        str = j10.getName();
                    }
                    hVar.a(c10, jSDecoratorsBridgingObject2, h11 + "_" + str);
                }
                jSDecoratorsBridgingObject.registerObject("ViewPrototype", jSDecoratorsBridgingObject2);
                C6514M m10 = C6514M.f71813a;
                D3.a.f();
            }
            D3.a.c("[" + "ExpoModulesCore" + "] " + "Attaching classes");
            for (ee.d dVar2 : mVar.e().b()) {
                JSDecoratorsBridgingObject jSDecoratorsBridgingObject3 = new JSDecoratorsBridgingObject(e10);
                mVar2.c(c10, dVar2.c(), jSDecoratorsBridgingObject3, dVar2.b());
                r a10 = dVar2.a();
                Ff.p g10 = a10.g();
                if (g10 != null) {
                    eVar = g10.b();
                } else {
                    eVar = null;
                }
                if (eVar instanceof Ff.d) {
                    dVar = (Ff.d) eVar;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    cls = C6781a.b(dVar);
                } else {
                    cls = null;
                }
                jSDecoratorsBridgingObject.registerClass(dVar2.b(), jSDecoratorsBridgingObject3, a10.h(), cls, dVar2.d(), (ExpectedType[]) a10.d().toArray(new ExpectedType[0]), a10.n(dVar2.b(), c10));
            }
            C6514M m11 = C6514M.f71813a;
            D3.a.f();
            JavaScriptModuleObject javaScriptModuleObject = new JavaScriptModuleObject(e10, mVar.h());
            javaScriptModuleObject.decorate(jSDecoratorsBridgingObject);
            D3.a.f();
            return javaScriptModuleObject;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }

    public final void d(String str, Object[] objArr, p pVar) {
        CodedException codedException;
        C6496s.h(str, "methodName");
        C6496s.h(objArr, "args");
        C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            C5038h hVar = (C5038h) this.f53629b.a().get(str);
            if (hVar == null) {
                throw new q();
            } else if (hVar instanceof C5034d) {
                ((C5034d) hVar).r(objArr, pVar, this.f53628a.c());
                C6514M m10 = C6514M.f71813a;
            } else {
                throw new IllegalStateException("Cannot call a " + hVar + " method in test context");
            }
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else if (th2 instanceof Od.a) {
                Od.a aVar = th2;
                String a10 = aVar.a();
                C6496s.g(a10, "getCode(...)");
                codedException = new CodedException(a10, aVar.getMessage(), aVar.getCause());
            } else {
                codedException = new UnexpectedException((Throwable) th2);
            }
            throw new expo.modules.kotlin.exception.l(str, this.f53629b.e(), codedException);
        }
    }

    public final d e() {
        return this.f53629b;
    }

    public final JavaScriptModuleObject f() {
        return (JavaScriptModuleObject) this.f53631d.getValue();
    }

    public final ke.b g() {
        return this.f53628a;
    }

    public final String h() {
        return this.f53629b.e();
    }

    public final JavaScriptModuleObject i() {
        if (this.f53630c) {
            return f();
        }
        return null;
    }

    public final void k(ge.e eVar) {
        C5007a aVar;
        C6496s.h(eVar, "eventName");
        c cVar = (c) this.f53629b.c().get(eVar);
        if (cVar != null) {
            if (cVar instanceof C5007a) {
                aVar = (C5007a) cVar;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void l(ge.e eVar, Object obj) {
        C6496s.h(eVar, "eventName");
        c cVar = (c) this.f53629b.c().get(eVar);
    }

    public final void m(ge.e eVar, Object obj, Object obj2) {
        ge.d dVar;
        C6496s.h(eVar, "eventName");
        c cVar = (c) this.f53629b.c().get(eVar);
        if (cVar != null) {
            if (cVar instanceof ge.d) {
                dVar = (ge.d) cVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                dVar.a(obj, obj2);
            }
        }
    }

    public final void n() {
        p g10 = this.f53629b.g();
        if (g10 != null) {
            C5600w0 unused = C5576k.d(this.f53628a.c().r(), (qf.g) null, (M) null, new b(g10, this, (C6658d) null), 3, (Object) null);
        }
    }
}
