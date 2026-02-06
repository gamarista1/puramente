package com.facebook.react.defaults;

import android.app.Application;
import com.facebook.react.C3362h;
import com.facebook.react.O;
import com.facebook.react.V;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C0;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

public abstract class d extends O {

    public static final class a implements C0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f40646a;

        a(d dVar) {
            this.f40646a = dVar;
        }

        public Collection a() {
            return this.f40646a.c().I();
        }

        public ViewManager b(String str) {
            C6496s.h(str, "viewManagerName");
            return this.f40646a.c().A(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected d(Application application) {
        super(application);
        C6496s.h(application, "application");
    }

    /* access modifiers changed from: private */
    public static final UIManager j(d dVar, ReactApplicationContext reactApplicationContext) {
        B0 b02;
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        if (dVar.b()) {
            b02 = new B0((C0) new a(dVar));
        } else {
            b02 = new B0(dVar.c().H(reactApplicationContext));
        }
        return new FabricUIManagerProviderImpl(componentFactory, ReactNativeConfig.DEFAULT_CONFIG, b02).createUIManager(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public C3362h getJSEngineResolutionAlgorithm() {
        Boolean k10 = k();
        if (C6496s.c(k10, Boolean.TRUE)) {
            return C3362h.HERMES;
        }
        if (C6496s.c(k10, Boolean.FALSE)) {
            return C3362h.JSC;
        }
        if (k10 == null) {
            return null;
        }
        throw new C6535s();
    }

    /* access modifiers changed from: protected */
    public V.a getReactPackageTurboModuleManagerDelegateBuilder() {
        if (l()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public UIManagerProvider getUIManagerProvider() {
        if (l()) {
            return new c(this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Boolean k() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }
}
