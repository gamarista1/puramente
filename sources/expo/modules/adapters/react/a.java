package expo.modules.adapters.react;

import Md.b;
import Pd.c;
import ae.C4466c;
import ae.k;
import ae.o;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.ExpoBridgeModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class a implements P {

    /* renamed from: a  reason: collision with root package name */
    protected b f60117a;

    /* renamed from: b  reason: collision with root package name */
    protected o f60118b;

    /* renamed from: c  reason: collision with root package name */
    protected ReactAdapterPackage f60119c = new ReactAdapterPackage();

    /* renamed from: d  reason: collision with root package name */
    private NativeModulesProxy f60120d;

    /* renamed from: e  reason: collision with root package name */
    private List f60121e = null;

    /* renamed from: f  reason: collision with root package name */
    private FabricComponentsRegistry f60122f = null;

    public a(List list) {
        this.f60117a = new b(list, (List) null);
    }

    private synchronized NativeModulesProxy b(ReactApplicationContext reactApplicationContext, b bVar) {
        b bVar2;
        try {
            NativeModulesProxy nativeModulesProxy = this.f60120d;
            if (!(nativeModulesProxy == null || nativeModulesProxy.getReactContext() == reactApplicationContext)) {
                c((NativeModulesProxy) null);
            }
            if (this.f60120d == null) {
                if (bVar != null) {
                    bVar2 = bVar;
                } else {
                    bVar2 = this.f60117a.b(reactApplicationContext);
                }
                o oVar = this.f60118b;
                if (oVar != null) {
                    c(new NativeModulesProxy(reactApplicationContext, bVar2, oVar));
                } else {
                    c(new NativeModulesProxy(reactApplicationContext, bVar2));
                }
            }
            if (!(bVar == null || bVar == this.f60120d.getModuleRegistry())) {
                C4466c.a().a("❌ NativeModuleProxy was configured with a different instance of the modules registry.", (Throwable) null);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f60120d;
    }

    private void c(NativeModulesProxy nativeModulesProxy) {
        this.f60120d = nativeModulesProxy;
        if (nativeModulesProxy != null) {
            nativeModulesProxy.getKotlinInteropModuleRegistry().k(this.f60120d);
        }
    }

    /* access modifiers changed from: protected */
    public List a(ReactApplicationContext reactApplicationContext, b bVar, Pd.b bVar2) {
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy b10 = b(reactApplicationContext, bVar);
        if (bVar2 != null) {
            bVar2.apply(b10.getKotlinInteropModuleRegistry().f());
        }
        arrayList.add(b10);
        arrayList.add(new ModuleRegistryReadyNotifier(bVar));
        for (P createNativeModules : ((c) bVar.b(c.class)).b()) {
            arrayList.addAll(createNativeModules.createNativeModules(reactApplicationContext));
        }
        arrayList.add(new ExpoBridgeModule(reactApplicationContext, new WeakReference(b10)));
        return arrayList;
    }

    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        NativeModulesProxy b10 = b(reactApplicationContext, (b) null);
        b moduleRegistry = b10.getModuleRegistry();
        for (c e10 : this.f60119c.f(reactApplicationContext)) {
            moduleRegistry.e(e10);
        }
        List a10 = a(reactApplicationContext, moduleRegistry, (Pd.b) null);
        if (this.f60121e != null) {
            b10.getKotlinInteropModuleRegistry().l(this.f60121e);
        }
        return a10;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList(this.f60117a.c(reactApplicationContext));
        NativeModulesProxy b10 = b(reactApplicationContext, (b) null);
        Objects.requireNonNull(b10);
        k kotlinInteropModuleRegistry = b10.getKotlinInteropModuleRegistry();
        List d10 = kotlinInteropModuleRegistry.d();
        this.f60121e = kotlinInteropModuleRegistry.e(d10);
        arrayList.addAll(d10);
        this.f60122f = new FabricComponentsRegistry(d10);
        return arrayList;
    }
}
