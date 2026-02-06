package ae;

import Ef.m;
import Md.b;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.views.GroupViewManagerWrapper;
import expo.modules.kotlin.views.SimpleViewManagerWrapper;
import expo.modules.kotlin.views.n;
import expo.modules.kotlin.views.p;
import expo.modules.kotlin.views.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import mf.O;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final C4464a f53625a;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53626a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                expo.modules.kotlin.views.o[] r0 = expo.modules.kotlin.views.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                expo.modules.kotlin.views.o r1 = expo.modules.kotlin.views.o.SIMPLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                expo.modules.kotlin.views.o r1 = expo.modules.kotlin.views.o.GROUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f53626a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ae.k.a.<clinit>():void");
        }
    }

    public k(o oVar, b bVar, WeakReference weakReference) {
        C6496s.h(oVar, "modulesProvider");
        C6496s.h(bVar, "legacyModuleRegistry");
        C6496s.h(weakReference, "reactContext");
        this.f53625a = new C4464a(oVar, bVar, weakReference);
    }

    /* access modifiers changed from: private */
    public final n g() {
        return this.f53625a.o().h();
    }

    public final void b(String str, String str2, ReadableArray readableArray, p pVar) {
        C6496s.h(str, "moduleName");
        C6496s.h(str2, "method");
        C6496s.h(readableArray, "arguments");
        C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            m t10 = g().t(str);
            if (t10 != null) {
                Object[] array = readableArray.toArrayList().toArray();
                C6496s.g(array, "toArray(...)");
                t10.d(str2, array, pVar);
                return;
            }
            throw new IllegalArgumentException(("Trying to call '" + str2 + "' on the non-existing module '" + str + "'").toString());
        } catch (CodedException e10) {
            pVar.g(e10);
        } catch (Throwable th2) {
            pVar.g(new UnexpectedException(th2));
        }
    }

    public final void c() {
        this.f53625a.y();
    }

    public final List d() {
        Object obj;
        D3.a.c("[" + "ExpoModulesCore" + "] " + "KotlinInteropModuleRegistry.exportViewManagers");
        try {
            n a10 = g();
            ArrayList<m> arrayList = new ArrayList<>();
            for (Object next : a10) {
                if (((m) next).e().h() != null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
            for (m mVar : arrayList) {
                p pVar = new p(mVar);
                n h10 = mVar.e().h();
                C6496s.e(h10);
                int i10 = a.f53626a[h10.i().ordinal()];
                if (i10 == 1) {
                    obj = new SimpleViewManagerWrapper(pVar);
                } else if (i10 == 2) {
                    obj = new GroupViewManagerWrapper(pVar);
                } else {
                    throw new C6535s();
                }
                arrayList2.add(obj);
            }
            D3.a.f();
            return arrayList2;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }

    public final List e(List list) {
        C6496s.h(list, "viewManagers");
        D3.a.c("[" + "ExpoModulesCore" + "] " + "KotlinInteropModuleRegistry.extractViewManagersDelegateHolders");
        try {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof r) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } finally {
            D3.a.f();
        }
    }

    public final C4464a f() {
        return this.f53625a;
    }

    public final boolean h(String str) {
        C6496s.h(str, "name");
        return g().z(str);
    }

    public final void i() {
        this.f53625a.w();
    }

    public final void j() {
        this.f53625a.z();
        C4466c.a().c("✅ KotlinInteropModuleRegistry was destroyed");
    }

    public final void k(NativeModulesProxy nativeModulesProxy) {
        C6496s.h(nativeModulesProxy, "proxyModule");
        this.f53625a.F(new WeakReference(nativeModulesProxy));
    }

    public final void l(List list) {
        C6496s.h(list, "viewWrapperHolders");
        D3.a.c("[" + "ExpoModulesCore" + "] " + "KotlinInteropModuleRegistry.updateModuleHoldersInViewManagers");
        try {
            Iterable<r> iterable = list;
            ArrayList<p> arrayList = new ArrayList<>(C6565s.y(iterable, 10));
            for (r viewWrapperDelegate : iterable) {
                arrayList.add(viewWrapperDelegate.getViewWrapperDelegate());
            }
            for (p pVar : arrayList) {
                m t10 = g().t(pVar.d().h());
                if (t10 != null) {
                    pVar.j(t10);
                } else {
                    String h10 = pVar.d().h();
                    throw new IllegalArgumentException(("Cannot update the module holder for " + h10 + ".").toString());
                }
            }
            C6514M m10 = C6514M.f71813a;
            D3.a.f();
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }

    public final Map m() {
        List list;
        D3.a.c("[" + "ExpoModulesCore" + "] " + "KotlinInteropModuleRegistry.viewManagersMetadata");
        try {
            n a10 = g();
            ArrayList<m> arrayList = new ArrayList<>();
            for (Object next : a10) {
                if (((m) next).e().h() != null) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(arrayList, 10)), 16));
            for (m mVar : arrayList) {
                String h10 = mVar.h();
                n h11 = mVar.e().h();
                if (h11 == null || (list = h11.g()) == null) {
                    list = C6565s.n();
                }
                Pair a11 = C6502A.a(h10, O.f(C6502A.a("propsNames", list)));
                linkedHashMap.put(a11.c(), a11.d());
            }
            D3.a.f();
            return linkedHashMap;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
