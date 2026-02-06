package c8;

import Ef.m;
import X6.C3097u;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.C3328a;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.b0;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolsruntimesettings.ReactDevToolsRuntimeSettingsModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.reactdevtoolssettings.ReactDevToolsSettingsManagerModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.image.a;
import com.facebook.react.views.image.f;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import n6.b;

public final class t extends C3328a implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f36563a = O.l(C6502A.a(ReactDrawerLayoutManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new k())), C6502A.a(ReactHorizontalScrollViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new s())), C6502A.a(ReactHorizontalScrollContainerViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new c())), C6502A.a(ReactProgressBarViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new d())), C6502A.a(ReactSafeAreaViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new e())), C6502A.a(ReactScrollViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new f())), C6502A.a(ReactSwitchManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new g())), C6502A.a(SwipeRefreshLayoutManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new h())), C6502A.a(FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new i())), C6502A.a(ReactImageManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new j())), C6502A.a(ReactModalHostManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new l())), C6502A.a(ReactRawTextManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new m())), C6502A.a(ReactTextInputManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new n())), C6502A.a(ReactTextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new o())), C6502A.a(ReactViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new p())), C6502A.a(ReactVirtualTextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new q())), C6502A.a(ReactUnimplementedViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new r())));

    public t(C3192a aVar) {
    }

    /* access modifiers changed from: private */
    public static final NativeModule A() {
        return new ReactTextInputManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule B() {
        return new ReactTextViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule C() {
        return new ReactViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule D() {
        return new ReactVirtualTextViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule E() {
        return new ReactUnimplementedViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule F() {
        return new ReactHorizontalScrollContainerViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule G() {
        return new ReactProgressBarViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule H() {
        return new ReactSafeAreaViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule I() {
        return new ReactScrollViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule J() {
        return new ReactSwitchManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule K() {
        return new SwipeRefreshLayoutManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule L() {
        return new FrescoBasedReactTextInlineImageViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule M() {
        return new ReactImageManager((b) null, (a) null, (f) null, 7, (DefaultConstructorMarker) null);
    }

    private final R7.a u() {
        Class<Q7.a> cls;
        Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ReactDevToolsSettingsManagerModule.class, ReactDevToolsRuntimeSettingsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
        ArrayList<Class> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            cls = Q7.a.class;
            if (i10 >= 24) {
                break;
            }
            Class cls2 = clsArr[i10];
            if (cls2.isAnnotationPresent(cls)) {
                arrayList.add(cls2);
            }
            i10++;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(arrayList, 10)), 16));
        for (Class cls3 : arrayList) {
            Annotation annotation = cls3.getAnnotation(cls);
            if (annotation != null) {
                Q7.a aVar = (Q7.a) annotation;
                String name = aVar.name();
                String name2 = aVar.name();
                String name3 = cls3.getName();
                C6496s.g(name3, "getName(...)");
                Pair a10 = C6502A.a(name, new ReactModuleInfo(name2, name3, aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.isCxxModule(), ReactModuleInfo.f40951g.a(cls3)));
                linkedHashMap.put(a10.c(), a10.d());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return new b(linkedHashMap);
    }

    /* access modifiers changed from: private */
    public static final NativeModule w() {
        return new ReactDrawerLayoutManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule x() {
        return new ReactHorizontalScrollViewManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule y() {
        return new ReactModalHostManager();
    }

    /* access modifiers changed from: private */
    public static final NativeModule z() {
        return new ReactRawTextManager();
    }

    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        NativeModule nativeModule;
        Provider provider;
        C6496s.h(reactApplicationContext, "reactContext");
        C6496s.h(str, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) this.f36563a.get(str);
        if (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) {
            nativeModule = null;
        } else {
            nativeModule = (NativeModule) provider.get();
        }
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        ReactDrawerLayoutManager reactDrawerLayoutManager = new ReactDrawerLayoutManager();
        ReactHorizontalScrollViewManager reactHorizontalScrollViewManager = new ReactHorizontalScrollViewManager();
        ReactHorizontalScrollContainerViewManager reactHorizontalScrollContainerViewManager = new ReactHorizontalScrollContainerViewManager();
        ReactProgressBarViewManager reactProgressBarViewManager = new ReactProgressBarViewManager();
        ReactScrollViewManager reactScrollViewManager = new ReactScrollViewManager();
        ReactSwitchManager reactSwitchManager = new ReactSwitchManager();
        ReactSafeAreaViewManager reactSafeAreaViewManager = new ReactSafeAreaViewManager();
        SwipeRefreshLayoutManager swipeRefreshLayoutManager = new SwipeRefreshLayoutManager();
        FrescoBasedReactTextInlineImageViewManager frescoBasedReactTextInlineImageViewManager = new FrescoBasedReactTextInlineImageViewManager();
        ReactImageManager reactImageManager = new ReactImageManager((b) null, (a) null, (f) null, 7, (DefaultConstructorMarker) null);
        ReactModalHostManager reactModalHostManager = new ReactModalHostManager();
        ReactRawTextManager reactRawTextManager = new ReactRawTextManager();
        ReactTextInputManager reactTextInputManager = new ReactTextInputManager();
        ReactTextViewManager reactTextViewManager = new ReactTextViewManager();
        ReactViewManager reactViewManager = new ReactViewManager();
        ReactVirtualTextViewManager reactVirtualTextViewManager = new ReactVirtualTextViewManager();
        ReactVirtualTextViewManager reactVirtualTextViewManager2 = reactVirtualTextViewManager;
        return C6565s.q(reactDrawerLayoutManager, reactHorizontalScrollViewManager, reactHorizontalScrollContainerViewManager, reactProgressBarViewManager, reactScrollViewManager, reactSwitchManager, reactSafeAreaViewManager, swipeRefreshLayoutManager, frescoBasedReactTextInlineImageViewManager, reactImageManager, reactModalHostManager, reactRawTextManager, reactTextInputManager, reactTextViewManager, reactViewManager, reactVirtualTextViewManager2, new ReactUnimplementedViewManager());
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        NativeModule appearanceModule;
        C6496s.h(str, "name");
        C6496s.h(reactApplicationContext, "reactContext");
        switch (str.hashCode()) {
            case -2115067288:
                if (!str.equals("ToastAndroid")) {
                    return null;
                }
                return new ToastModule(reactApplicationContext);
            case -1962922905:
                if (!str.equals("ImageStoreManager")) {
                    return null;
                }
                return new ImageStoreManager(reactApplicationContext);
            case -1850625090:
                if (!str.equals("SoundManager")) {
                    return null;
                }
                return new SoundManagerModule(reactApplicationContext);
            case -1654566518:
                if (!str.equals(NativeDialogManagerAndroidSpec.NAME)) {
                    return null;
                }
                return new DialogModule(reactApplicationContext);
            case -1344126773:
                if (!str.equals(NativeFileReaderModuleSpec.NAME)) {
                    return null;
                }
                return new FileReaderModule(reactApplicationContext);
            case -1067020766:
                if (!str.equals("ReactDevToolsRuntimeSettingsModule")) {
                    return null;
                }
                return new ReactDevToolsRuntimeSettingsModule(reactApplicationContext);
            case -1062061717:
                if (!str.equals("PermissionsAndroid")) {
                    return null;
                }
                return new PermissionsModule(reactApplicationContext);
            case -657277650:
                if (!str.equals("ImageLoader")) {
                    return null;
                }
                return new ImageLoaderModule(reactApplicationContext);
            case -585704955:
                if (!str.equals("ReactDevToolsSettingsManager")) {
                    return null;
                }
                return new ReactDevToolsSettingsManagerModule(reactApplicationContext);
            case -570370161:
                if (!str.equals("I18nManager")) {
                    return null;
                }
                return new I18nManagerModule(reactApplicationContext);
            case -504784764:
                if (str.equals("Appearance")) {
                    appearanceModule = new AppearanceModule(reactApplicationContext, (AppearanceModule.b) null, 2, (DefaultConstructorMarker) null);
                    break;
                } else {
                    return null;
                }
            case -457866500:
                if (!str.equals("AccessibilityInfo")) {
                    return null;
                }
                return new AccessibilityInfoModule(reactApplicationContext);
            case -382654004:
                if (!str.equals("StatusBarManager")) {
                    return null;
                }
                return new StatusBarModule(reactApplicationContext);
            case -254310125:
                if (!str.equals(NativeWebSocketModuleSpec.NAME)) {
                    return null;
                }
                return new WebSocketModule(reactApplicationContext);
            case -99249460:
                if (!str.equals("DevLoadingView")) {
                    return null;
                }
                return new DevLoadingModule(reactApplicationContext);
            case 163245714:
                if (str.equals(FrescoModule.NAME)) {
                    appearanceModule = new FrescoModule(reactApplicationContext, true, (C3097u) null);
                    break;
                } else {
                    return null;
                }
            case 403570038:
                if (!str.equals("Clipboard")) {
                    return null;
                }
                return new ClipboardModule(reactApplicationContext);
            case 563961875:
                if (!str.equals("IntentAndroid")) {
                    return null;
                }
                return new IntentModule(reactApplicationContext);
            case 1221389072:
                if (!str.equals("AppState")) {
                    return null;
                }
                return new AppStateModule(reactApplicationContext);
            case 1515242260:
                if (!str.equals(NativeNetworkingAndroidSpec.NAME)) {
                    return null;
                }
                return new NetworkingModule(reactApplicationContext);
            case 1547941001:
                if (!str.equals(NativeBlobModuleSpec.NAME)) {
                    return null;
                }
                return new BlobModule(reactApplicationContext);
            case 1555425035:
                if (!str.equals("ShareModule")) {
                    return null;
                }
                return new ShareModule(reactApplicationContext);
            case 1721274886:
                if (!str.equals(NativeAnimatedModuleSpec.NAME)) {
                    return null;
                }
                return new NativeAnimatedModule(reactApplicationContext);
            case 1922110066:
                if (!str.equals("Vibration")) {
                    return null;
                }
                return new VibrationModule(reactApplicationContext);
            default:
                return null;
        }
        return appearanceModule;
    }

    public R7.a getReactModuleInfoProvider() {
        Object obj;
        if (!C7.a.a()) {
            return u();
        }
        try {
            Class b10 = C7.a.b("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider");
            R7.a aVar = null;
            if (b10 != null) {
                obj = b10.newInstance();
            } else {
                obj = null;
            }
            if (obj instanceof R7.a) {
                aVar = (R7.a) obj;
            }
            if (aVar == null) {
                return u();
            }
            return aVar;
        } catch (ClassNotFoundException unused) {
            return u();
        } catch (InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e11);
        }
    }

    public Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return this.f36563a.keySet();
    }

    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.e1(this.f36563a.values());
    }

    /* access modifiers changed from: private */
    public static final Map v(Map map) {
        return map;
    }
}
