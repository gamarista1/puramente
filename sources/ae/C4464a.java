package ae;

import Md.b;
import Ug.C5600w0;
import Ug.J;
import Ug.K;
import Ug.L;
import Ug.U0;
import Ug.Z;
import Vg.e;
import Vg.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.d;
import ce.C4488a;
import ce.g;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.n0;
import fe.C4992b;
import fe.C4993c;
import ge.C5008b;
import ge.h;
import ge.j;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import me.a;

/* renamed from: ae.a  reason: case insensitive filesystem */
public final class C4464a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f53603a;

    /* renamed from: b  reason: collision with root package name */
    private final u f53604b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final s f53605c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f53606d;

    /* renamed from: e  reason: collision with root package name */
    private final e f53607e;

    /* renamed from: f  reason: collision with root package name */
    private final K f53608f = L.a(Z.b().n1(U0.b((C5600w0) null, 1, (Object) null)).n1(new J("expo.modules.BackgroundCoroutineScope")));

    /* renamed from: g  reason: collision with root package name */
    private final K f53609g;

    /* renamed from: h  reason: collision with root package name */
    private final K f53610h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference f53611i;

    /* renamed from: j  reason: collision with root package name */
    private final C4488a f53612j;

    /* renamed from: k  reason: collision with root package name */
    private final g f53613k;

    public C4464a(o oVar, b bVar, WeakReference weakReference) {
        C6496s.h(oVar, "modulesProvider");
        C6496s.h(bVar, "legacyModuleRegistry");
        C6496s.h(weakReference, "reactContextHolder");
        this.f53603a = bVar;
        u uVar = new u(this, weakReference);
        this.f53604b = uVar;
        s sVar = new s(this);
        this.f53605c = sVar;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        e c10 = f.c(new Handler(handlerThread.getLooper()), (String) null, 1, (Object) null);
        this.f53607e = c10;
        this.f53609g = L.a(c10.n1(U0.b((C5600w0) null, 1, (Object) null)).n1(new J("expo.modules.AsyncFunctionQueue")));
        this.f53610h = L.a(Z.c().n1(U0.b((C5600w0) null, 1, (Object) null)).n1(new J("expo.modules.MainQueue")));
        C4488a aVar = new C4488a(this);
        this.f53612j = aVar;
        this.f53613k = new g(aVar);
        Object obj = weakReference.get();
        if (obj != null) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
            reactApplicationContext.addLifecycleEventListener(sVar);
            reactApplicationContext.addActivityEventListener(sVar);
            uVar.h().N(new C4992b());
            uVar.h().N(new C4993c());
            uVar.h().I(oVar);
            C4466c.a().c("✅ AppContext was initialized");
            return;
        }
        throw new IllegalArgumentException("The app context should be created with valid react context.");
    }

    private final Xd.a g() {
        Object obj;
        try {
            obj = p().b(Xd.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Xd.a) obj;
    }

    public final void A() {
        String str;
        Activity l10 = l();
        if (l10 != null) {
            if (!(l10 instanceof d)) {
                Activity l11 = l();
                if (l11 != null) {
                    str = l11.getLocalClassName();
                } else {
                    str = null;
                }
                throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + str).toString());
            }
            this.f53612j.e((d) l10);
        }
        this.f53604b.h().A(ge.e.ACTIVITY_DESTROYS);
        this.f53606d = true;
    }

    public final void B() {
        this.f53604b.h().A(ge.e.ACTIVITY_ENTERS_BACKGROUND);
    }

    public final void C() {
        String str;
        Activity l10 = l();
        if (l10 != null) {
            if (!(l10 instanceof d)) {
                Activity l11 = l();
                if (l11 != null) {
                    str = l11.getLocalClassName();
                } else {
                    str = null;
                }
                throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + str).toString());
            }
            if (this.f53606d) {
                this.f53606d = false;
                this.f53604b.h().P();
            }
            this.f53612j.f((d) l10);
            this.f53604b.h().A(ge.e.ACTIVITY_ENTERS_FOREGROUND);
        }
    }

    public final void D(Intent intent) {
        this.f53604b.h().C(ge.e.ON_NEW_INTENT, intent);
    }

    public final void E() {
        this.f53604b.h().A(ge.e.ON_USER_LEAVES_ACTIVITY);
    }

    public final void F(WeakReference weakReference) {
        this.f53611i = weakReference;
    }

    public final void b() {
        v vVar = v.f53656a;
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            String name = Thread.currentThread().getName();
            C6496s.g(name, "getName(...)");
            String name2 = Looper.getMainLooper().getThread().getName();
            C6496s.g(name2, "getName(...)");
            throw new expo.modules.kotlin.exception.f(name, name2);
        }
    }

    public final C5008b c(ke.b bVar) {
        Object obj;
        C6496s.h(bVar, "module");
        try {
            obj = p().b(Qd.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        Qd.a aVar = (Qd.a) obj;
        if (aVar == null) {
            return null;
        }
        m v10 = this.f53604b.h().v(bVar);
        if (v10 != null) {
            return new h(v10, aVar, this.f53604b.g());
        }
        throw new IllegalArgumentException("Cannot create an event emitter for the module that isn't present in the module registry.");
    }

    public final View d(int i10) {
        View view;
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f53604b.g().get();
        if (reactApplicationContext == null) {
            return null;
        }
        UIManager i11 = n0.i(reactApplicationContext, i10);
        if (i11 != null) {
            view = i11.resolveView(i10);
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        return null;
    }

    public final Pd.a e() {
        Object obj;
        try {
            obj = p().b(Pd.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Pd.a) obj;
    }

    public final g f() {
        return this.f53613k;
    }

    public final K h() {
        return this.f53608f;
    }

    public final File i() {
        File a10;
        Xd.a g10 = g();
        if (g10 != null && (a10 = g10.a()) != null) {
            return a10;
        }
        throw new Od.d("expo.modules.interfaces.filesystem.AppDirectories");
    }

    public final C5008b j() {
        Object obj;
        try {
            obj = p().b(Qd.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        Qd.a aVar = (Qd.a) obj;
        if (aVar == null) {
            return null;
        }
        return new ge.g(aVar, this.f53604b.g());
    }

    public final Wd.a k() {
        Object obj;
        try {
            obj = p().b(Wd.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Wd.a) obj;
    }

    public Activity l() {
        ReactApplicationContext reactApplicationContext;
        Activity a10;
        Pd.a e10 = e();
        if (e10 != null && (a10 = e10.a()) != null) {
            return a10;
        }
        Context u10 = u();
        if (u10 instanceof ReactApplicationContext) {
            reactApplicationContext = (ReactApplicationContext) u10;
        } else {
            reactApplicationContext = null;
        }
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    public final C4992b m() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z10;
        Iterator it = this.f53604b.h().x().values().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            ke.b g10 = ((m) obj2).g();
            if (g10 != null) {
                z10 = g10 instanceof C4992b;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                break;
            }
        }
        m mVar = (m) obj2;
        if (mVar != null) {
            obj3 = mVar.g();
        } else {
            obj3 = null;
        }
        if (obj3 instanceof C4992b) {
            obj = obj3;
        }
        return (C4992b) obj;
    }

    public final Xd.b n() {
        Object obj;
        try {
            obj = p().b(Xd.b.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Xd.b) obj;
    }

    public final u o() {
        return this.f53604b;
    }

    public final b p() {
        return this.f53603a;
    }

    public final WeakReference q() {
        return this.f53611i;
    }

    public final K r() {
        return this.f53610h;
    }

    public final K s() {
        return this.f53609g;
    }

    public final Yd.a t() {
        Object obj;
        try {
            obj = p().b(Yd.a.class);
        } catch (Exception unused) {
            obj = null;
        }
        return (Yd.a) obj;
    }

    public final Context u() {
        return (ReactApplicationContext) this.f53604b.g().get();
    }

    public final Activity v() {
        Activity activity;
        ReactApplicationContext reactApplicationContext;
        Pd.a e10 = e();
        if (e10 == null || (activity = e10.a()) == null) {
            Context u10 = u();
            if (u10 instanceof ReactApplicationContext) {
                reactApplicationContext = (ReactApplicationContext) u10;
            } else {
                reactApplicationContext = null;
            }
            if (reactApplicationContext != null) {
                activity = reactApplicationContext.getCurrentActivity();
            } else {
                activity = null;
            }
        }
        if (activity != null) {
            return activity;
        }
        throw new expo.modules.kotlin.exception.g();
    }

    public final void w() {
        this.f53604b.j();
    }

    public final void x(Activity activity, int i10, int i11, Intent intent) {
        C6496s.h(activity, "activity");
        this.f53612j.d(i10, i11, intent);
        this.f53604b.h().D(ge.e.ON_ACTIVITY_RESULT, activity, new j(i10, i11, intent));
    }

    public final void y() {
        D3.a.c("[" + "ExpoModulesCore" + "] " + "AppContext.onCreate");
        try {
            o().h().E();
            C6514M m10 = C6514M.f71813a;
        } finally {
            D3.a.f();
        }
    }

    public final void z() {
        D3.a.c("[" + "ExpoModulesCore" + "] " + "AppContext.onDestroy");
        try {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) o().g().get();
            if (reactApplicationContext != null) {
                reactApplicationContext.removeLifecycleEventListener(this.f53605c);
            }
            o().h().A(ge.e.MODULE_DESTROY);
            o().h().k();
            L.c(s(), new Od.b((String) null, 1, (DefaultConstructorMarker) null));
            L.c(r(), new Od.b((String) null, 1, (DefaultConstructorMarker) null));
            L.c(h(), new Od.b((String) null, 1, (DefaultConstructorMarker) null));
            o().a();
            C4466c.a().c("✅ AppContext was destroyed");
            C6514M m10 = C6514M.f71813a;
            D3.a.f();
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
