package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n7.C3863a;

public abstract class V extends TurboModuleManagerDelegate {
    private final List<b> mModuleProviders = new ArrayList();
    private final Map<b, Map<String, ReactModuleInfo>> mPackageModuleInfos = new HashMap();
    private List<P> mPackages;
    private ReactApplicationContext mReactContext;
    private final boolean mShouldEnableLegacyModuleInterop;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private List f40308a;

        /* renamed from: b  reason: collision with root package name */
        private ReactApplicationContext f40309b;

        public V a() {
            C3863a.d(this.f40309b, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            C3863a.d(this.f40308a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return b(this.f40309b, this.f40308a);
        }

        /* access modifiers changed from: protected */
        public abstract V b(ReactApplicationContext reactApplicationContext, List list);

        public a c(List list) {
            this.f40308a = new ArrayList(list);
            return this;
        }

        public a d(ReactApplicationContext reactApplicationContext) {
            this.f40309b = reactApplicationContext;
            return this;
        }
    }

    interface b {
        NativeModule getModule(String str);
    }

    protected V(ReactApplicationContext reactApplicationContext, List list, HybridData hybridData) {
        super(hybridData);
        boolean z10;
        if (!M7.b.e() || !M7.b.w()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.mShouldEnableLegacyModuleInterop = z10;
        b(reactApplicationContext, list);
    }

    private void b(ReactApplicationContext reactApplicationContext, List list) {
        String str;
        ReactModuleInfo reactModuleInfo;
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            if (p10 instanceof C3328a) {
                C3328a aVar = (C3328a) p10;
                T t10 = new T(aVar, reactApplicationContext2);
                this.mModuleProviders.add(t10);
                this.mPackageModuleInfos.put(t10, aVar.getReactModuleInfoProvider().a());
            } else {
                d();
                if (d()) {
                    List<NativeModule> createNativeModules = p10.createNativeModules(reactApplicationContext2);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    for (NativeModule nativeModule : createNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        Q7.a aVar2 = (Q7.a) cls.getAnnotation(Q7.a.class);
                        if (aVar2 != null) {
                            str = aVar2.name();
                        } else {
                            str = nativeModule.getName();
                        }
                        if (aVar2 != null) {
                            reactModuleInfo = new ReactModuleInfo(str, cls.getName(), aVar2.canOverrideExistingModule(), true, aVar2.isCxxModule(), ReactModuleInfo.b(cls));
                        } else {
                            reactModuleInfo = new ReactModuleInfo(str, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.b(cls));
                        }
                        hashMap2.put(str, reactModuleInfo);
                        hashMap.put(str, nativeModule);
                    }
                    U u10 = new U(hashMap);
                    this.mModuleProviders.add(u10);
                    this.mPackageModuleInfos.put(u10, hashMap2);
                }
            }
        }
    }

    private boolean d() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.mModuleProviders) {
            for (ReactModuleInfo reactModuleInfo : this.mPackageModuleInfos.get(bVar).values()) {
                if (reactModuleInfo.e() && reactModuleInfo.g()) {
                    arrayList.add(reactModuleInfo.f());
                }
            }
        }
        return arrayList;
    }

    public NativeModule getLegacyModule(String str) {
        NativeModule module;
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b next : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.mPackageModuleInfos.get(next).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e()) {
                if ((nativeModule == null || reactModuleInfo.a()) && (module = next.getModule(str)) != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    public TurboModule getModule(String str) {
        NativeModule module;
        NativeModule nativeModule = null;
        for (b next : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.mPackageModuleInfos.get(next).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e()) {
                if ((nativeModule == null || reactModuleInfo.a()) && (module = next.getModule(str)) != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) nativeModule;
    }

    public boolean unstable_isLegacyModuleRegistered(String str) {
        for (b bVar : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.mPackageModuleInfos.get(bVar).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean unstable_isModuleRegistered(String str) {
        for (b bVar : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.mPackageModuleInfos.get(bVar).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.mShouldEnableLegacyModuleInterop;
    }
}
