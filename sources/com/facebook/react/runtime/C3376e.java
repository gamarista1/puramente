package com.facebook.react.runtime;

import I7.e;
import R7.a;
import U7.b;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.C3328a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;
import n7.C3863a;

/* renamed from: com.facebook.react.runtime.e  reason: case insensitive filesystem */
class C3376e extends C3328a {

    /* renamed from: a  reason: collision with root package name */
    private final e f41300a;

    /* renamed from: b  reason: collision with root package name */
    private final b f41301b;

    public C3376e(e eVar, b bVar) {
        this.f41300a = eVar;
        this.f41301b = bVar;
    }

    private a d() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 8; i10++) {
            Class cls = clsArr[i10];
            Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
            if (aVar != null) {
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new C3375d(hashMap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map e(Map map) {
        return map;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals("LogBox")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1633589448:
                if (str.equals(NativeDevSettingsSpec.NAME)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1520650172:
                if (str.equals(NativeDeviceInfoSpec.NAME)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1071344908:
                if (str.equals(NativeDevMenuSpec.NAME)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1037217463:
                if (str.equals("DeviceEventManager")) {
                    c10 = 4;
                    break;
                }
                break;
            case -790603268:
                if (str.equals(NativePlatformConstantsAndroidSpec.NAME)) {
                    c10 = 5;
                    break;
                }
                break;
            case 512434409:
                if (str.equals(NativeExceptionsManagerSpec.NAME)) {
                    c10 = 6;
                    break;
                }
                break;
            case 881516744:
                if (str.equals(NativeSourceCodeSpec.NAME)) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new LogBoxModule(reactApplicationContext, this.f41300a);
            case 1:
                return new DevSettingsModule(reactApplicationContext, this.f41300a);
            case 2:
                return new DeviceInfoModule(reactApplicationContext);
            case 3:
                return new DevMenuModule(reactApplicationContext, this.f41300a);
            case 4:
                return new DeviceEventManagerModule(reactApplicationContext, this.f41301b);
            case 5:
                return new AndroidInfoModule(reactApplicationContext);
            case 6:
                return new ExceptionsManagerModule(this.f41300a);
            case 7:
                return new SourceCodeModule(reactApplicationContext);
            default:
                return null;
        }
    }

    public a getReactModuleInfoProvider() {
        Class<C3376e> cls = C3376e.class;
        if (!C7.a.a()) {
            return d();
        }
        try {
            return (a) ((Class) C3863a.c(C7.a.b(cls.getName() + "$$ReactModuleInfoProvider"))).newInstance();
        } catch (ClassNotFoundException unused) {
            return d();
        } catch (InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + cls.getName() + "$$ReactModuleInfoProvider", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + cls.getName() + "$$ReactModuleInfoProvider", e11);
        }
    }
}
