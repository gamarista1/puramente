package com.horcrux.svg;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.b0;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

public class SvgPackage extends a0 implements b0 {
    private Map<String, ModuleSpec> mViewManagers;

    class A implements Provider {
        A() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    class B implements Provider {
        B() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    class C implements Provider {
        C() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$a  reason: case insensitive filesystem */
    class C4888a implements Provider {
        C4888a() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$b  reason: case insensitive filesystem */
    class C4889b implements Provider {
        C4889b() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$c  reason: case insensitive filesystem */
    class C4890c implements Provider {
        C4890c() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    class d implements Provider {
        d() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    class e implements Provider {
        e() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    class f implements Provider {
        f() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    class g implements Provider {
        g() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    class h implements Provider {
        h() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    class i implements Provider {
        i() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    class j implements Provider {
        j() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FilterManager();
        }
    }

    class k implements Provider {
        k() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    class l implements Provider {
        l() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FeBlendManager();
        }
    }

    class m implements Provider {
        m() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FeColorMatrixManager();
        }
    }

    class n implements Provider {
        n() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FeFloodManager();
        }
    }

    class o implements Provider {
        o() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FeGaussianBlurManager();
        }
    }

    class p implements Provider {
        p() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FeMergeManager();
        }
    }

    class q implements Provider {
        q() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.FeOffsetManager();
        }
    }

    class r implements Provider {
        r() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    class s implements Provider {
        s() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    class t implements Provider {
        t() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new SvgViewManager();
        }
    }

    class u implements a {
        u() {
        }

        public Map a() {
            HashMap hashMap = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i10 = 0; i10 < 2; i10++) {
                Class cls = clsArr[i10];
                Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), true));
            }
            return hashMap;
        }
    }

    class v implements Provider {
        v() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    class w implements Provider {
        w() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    class x implements Provider {
        x() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    class y implements Provider {
        y() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    class z implements Provider {
        z() {
        }

        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap b10 = C7.d.b();
            b10.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new k()));
            b10.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new v()));
            b10.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new w()));
            b10.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new x()));
            b10.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new y()));
            b10.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new z()));
            b10.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new A()));
            b10.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new B()));
            b10.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C()));
            b10.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C4888a()));
            b10.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C4889b()));
            b10.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C4890c()));
            b10.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new d()));
            b10.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new e()));
            b10.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new f()));
            b10.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new g()));
            b10.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new h()));
            b10.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new i()));
            b10.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new j()));
            b10.put(RenderableViewManager.FeBlendManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new l()));
            b10.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new m()));
            b10.put(RenderableViewManager.FeFloodManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new n()));
            b10.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new o()));
            b10.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new p()));
            b10.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new q()));
            b10.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new r()));
            b10.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new s()));
            b10.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new t()));
            this.mViewManagers = b10;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals("RNSVGRenderableModule")) {
            return new RNSVGRenderableManager(reactApplicationContext);
        }
        if (!str.equals("RNSVGSvgViewModule")) {
            return null;
        }
        return new SvgViewModule(reactApplicationContext);
    }

    public a getReactModuleInfoProvider() {
        try {
            return (a) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new u();
        } catch (IllegalAccessException | InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e10);
        }
    }

    /* access modifiers changed from: protected */
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }
}
