package com.facebook.react;

import U7.b;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.C0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z8.C4236a;

/* renamed from: com.facebook.react.c  reason: case insensitive filesystem */
class C3332c extends C3328a implements S {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final J f40583a;

    /* renamed from: b  reason: collision with root package name */
    private final b f40584b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f40585c;

    /* renamed from: d  reason: collision with root package name */
    private final int f40586d;

    /* renamed from: com.facebook.react.c$a */
    class a implements C0 {
        a() {
        }

        public Collection a() {
            return C3332c.this.f40583a.I();
        }

        public ViewManager b(String str) {
            return C3332c.this.f40583a.A(str);
        }
    }

    public C3332c(J j10, b bVar, boolean z10, int i10) {
        this.f40583a = j10;
        this.f40584b = bVar;
        this.f40585c = z10;
        this.f40586d = i10;
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C4236a.c(0, "createUIManagerModule");
        try {
            if (this.f40585c) {
                return new UIManagerModule(reactApplicationContext, (C0) new a(), this.f40586d);
            }
            UIManagerModule uIManagerModule = new UIManagerModule(reactApplicationContext, (List<ViewManager>) this.f40583a.H(reactApplicationContext), this.f40586d);
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
            return uIManagerModule;
        } finally {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private R7.a e() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 11; i10++) {
            Class cls = clsArr[i10];
            Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
            hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.b(cls)));
        }
        return new C3331b(hashMap);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map f(Map map) {
        return map;
    }

    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
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
            case -1789797270:
                if (str.equals("Timing")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1633589448:
                if (str.equals(NativeDevSettingsSpec.NAME)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1520650172:
                if (str.equals(NativeDeviceInfoSpec.NAME)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1071344908:
                if (str.equals(NativeDevMenuSpec.NAME)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1037217463:
                if (str.equals("DeviceEventManager")) {
                    c10 = 5;
                    break;
                }
                break;
            case -790603268:
                if (str.equals(NativePlatformConstantsAndroidSpec.NAME)) {
                    c10 = 6;
                    break;
                }
                break;
            case 512434409:
                if (str.equals(NativeExceptionsManagerSpec.NAME)) {
                    c10 = 7;
                    break;
                }
                break;
            case 881516744:
                if (str.equals(NativeSourceCodeSpec.NAME)) {
                    c10 = 8;
                    break;
                }
                break;
            case 1256514152:
                if (str.equals(NativeHeadlessJsTaskSupportSpec.NAME)) {
                    c10 = 9;
                    break;
                }
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new LogBoxModule(reactApplicationContext, this.f40583a.E());
            case 1:
                return new TimingModule(reactApplicationContext, this.f40583a.E());
            case 2:
                return new DevSettingsModule(reactApplicationContext, this.f40583a.E());
            case 3:
                return new DeviceInfoModule(reactApplicationContext);
            case 4:
                return new DevMenuModule(reactApplicationContext, this.f40583a.E());
            case 5:
                return new DeviceEventManagerModule(reactApplicationContext, this.f40584b);
            case 6:
                return new AndroidInfoModule(reactApplicationContext);
            case 7:
                return new ExceptionsManagerModule(this.f40583a.E());
            case 8:
                return new SourceCodeModule(reactApplicationContext);
            case 9:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case 10:
                return createUIManager(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    public R7.a getReactModuleInfoProvider() {
        if (!C7.a.a()) {
            return e();
        }
        try {
            return (R7.a) C7.a.b("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return e();
        } catch (InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        }
    }
}
