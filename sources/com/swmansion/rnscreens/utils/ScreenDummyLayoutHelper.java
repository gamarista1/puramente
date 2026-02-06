package com.swmansion.rnscreens.utils;

import Ad.b;
import Ad.c;
import Ad.d;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.G;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.H;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u00106R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<¨\u0006>"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "Landroid/content/Context;", "contextWithTheme", "Llf/M;", "f", "(Landroid/content/Context;)V", "", "fontSize", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "Lkotlin/Function0;", "", "lazyMessage", "j", "(Lyf/a;)Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Activity;", "i", "()Landroid/app/Activity;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "a", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "b", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroid/view/View;", "c", "Landroid/view/View;", "dummyContentView", "Landroidx/appcompat/widget/Toolbar;", "d", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "e", "F", "defaultFontSize", "I", "defaultContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/utils/a;", "Lcom/swmansion/rnscreens/utils/a;", "cache", "Ljava/lang/ref/WeakReference;", "h", "Ljava/lang/ref/WeakReference;", "reactContextRef", "Z", "isLayoutInitialized", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {

    /* renamed from: j  reason: collision with root package name */
    public static final a f59914j = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static WeakReference f59915k = new WeakReference((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private CoordinatorLayout f59916a;

    /* renamed from: b  reason: collision with root package name */
    private AppBarLayout f59917b;

    /* renamed from: c  reason: collision with root package name */
    private View f59918c;

    /* renamed from: d  reason: collision with root package name */
    private Toolbar f59919d;

    /* renamed from: e  reason: collision with root package name */
    private float f59920e;

    /* renamed from: f  reason: collision with root package name */
    private int f59921f;

    /* renamed from: g  reason: collision with root package name */
    private a f59922g = a.f59925c.a();

    /* renamed from: h  reason: collision with root package name */
    private WeakReference f59923h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f59924i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.f59915k.get();
        }

        private a() {
        }
    }

    public ScreenDummyLayoutHelper(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        this.f59923h = new WeakReference(reactApplicationContext);
        try {
            System.loadLibrary("react_codegen_rnscreens");
        } catch (UnsatisfiedLinkError unused) {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to load react_codegen_rnscreens library.");
        }
        f59915k = new WeakReference(this);
        if (!reactApplicationContext.hasCurrentActivity() || !g(reactApplicationContext)) {
            reactApplicationContext.addLifecycleEventListener(this);
        }
    }

    @DoNotStrip
    private final float computeDummyLayout(int i10, boolean z10) {
        float f10;
        if (!this.f59924i && !g(j(new b()))) {
            Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return 0.0f;
        } else if (this.f59922g.c(new b(i10, z10))) {
            return this.f59922g.b();
        } else {
            View decorView = i().getWindow().getDecorView();
            C6496s.g(decorView, "getDecorView(...)");
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
            AppBarLayout appBarLayout = null;
            if (z10) {
                Toolbar toolbar = this.f59919d;
                if (toolbar == null) {
                    C6496s.v("toolbar");
                    toolbar = null;
                }
                toolbar.setTitle((CharSequence) "");
                Toolbar toolbar2 = this.f59919d;
                if (toolbar2 == null) {
                    C6496s.v("toolbar");
                    toolbar2 = null;
                }
                toolbar2.setContentInsetStartWithNavigation(0);
            } else {
                Toolbar toolbar3 = this.f59919d;
                if (toolbar3 == null) {
                    C6496s.v("toolbar");
                    toolbar3 = null;
                }
                toolbar3.setTitle((CharSequence) "FontSize123!#$");
                Toolbar toolbar4 = this.f59919d;
                if (toolbar4 == null) {
                    C6496s.v("toolbar");
                    toolbar4 = null;
                }
                toolbar4.setContentInsetStartWithNavigation(this.f59921f);
            }
            H.a aVar = H.f59682A;
            Toolbar toolbar5 = this.f59919d;
            if (toolbar5 == null) {
                C6496s.v("toolbar");
                toolbar5 = null;
            }
            TextView a10 = aVar.a(toolbar5);
            if (a10 != null) {
                if (i10 != -1) {
                    f10 = (float) i10;
                } else {
                    f10 = this.f59920e;
                }
                a10.setTextSize(f10);
            }
            CoordinatorLayout coordinatorLayout = this.f59916a;
            if (coordinatorLayout == null) {
                C6496s.v("coordinatorLayout");
                coordinatorLayout = null;
            }
            coordinatorLayout.measure(makeMeasureSpec, makeMeasureSpec2);
            CoordinatorLayout coordinatorLayout2 = this.f59916a;
            if (coordinatorLayout2 == null) {
                C6496s.v("coordinatorLayout");
                coordinatorLayout2 = null;
            }
            coordinatorLayout2.layout(0, 0, width, height);
            AppBarLayout appBarLayout2 = this.f59917b;
            if (appBarLayout2 == null) {
                C6496s.v("appBarLayout");
            } else {
                appBarLayout = appBarLayout2;
            }
            float f11 = G.f((float) appBarLayout.getHeight());
            this.f59922g = new a(new b(i10, z10), f11);
            return f11;
        }
    }

    /* access modifiers changed from: private */
    public static final Object e() {
        return "[RNScreens] Context was null-ed before dummy layout was initialized";
    }

    private final void f(Context context) {
        this.f59916a = new CoordinatorLayout(context);
        AppBarLayout appBarLayout = new AppBarLayout(context);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        this.f59917b = appBarLayout;
        Toolbar toolbar = new Toolbar(context);
        toolbar.setTitle((CharSequence) "FontSize123!#$");
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.f59919d = toolbar;
        TextView a10 = H.f59682A.a(toolbar);
        C6496s.e(a10);
        this.f59920e = a10.getTextSize();
        Toolbar toolbar2 = this.f59919d;
        View view = null;
        if (toolbar2 == null) {
            C6496s.v("toolbar");
            toolbar2 = null;
        }
        this.f59921f = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.f59917b;
        if (appBarLayout2 == null) {
            C6496s.v("appBarLayout");
            appBarLayout2 = null;
        }
        Toolbar toolbar3 = this.f59919d;
        if (toolbar3 == null) {
            C6496s.v("toolbar");
            toolbar3 = null;
        }
        appBarLayout2.addView(toolbar3);
        View view2 = new View(context);
        view2.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        this.f59918c = view2;
        CoordinatorLayout coordinatorLayout = this.f59916a;
        if (coordinatorLayout == null) {
            C6496s.v("coordinatorLayout");
            coordinatorLayout = null;
        }
        AppBarLayout appBarLayout3 = this.f59917b;
        if (appBarLayout3 == null) {
            C6496s.v("appBarLayout");
            appBarLayout3 = null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view3 = this.f59918c;
        if (view3 == null) {
            C6496s.v("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.f59924i = true;
    }

    private final boolean g(ReactApplicationContext reactApplicationContext) {
        if (this.f59924i) {
            return true;
        }
        if (!reactApplicationContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity != null) {
            synchronized (this) {
                if (this.f59924i) {
                    return true;
                }
                f(currentActivity);
                C6514M m10 = C6514M.f71813a;
                return true;
            }
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
    }

    @DoNotStrip
    public static final ScreenDummyLayoutHelper getInstance() {
        return f59914j.getInstance();
    }

    /* access modifiers changed from: private */
    public static final Object h() {
        return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
    }

    private final Activity i() {
        Activity currentActivity = k(this, (C6787a) null, 1, (Object) null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
    }

    private final ReactApplicationContext j(C6787a aVar) {
        Object obj = this.f59923h.get();
        if (aVar == null) {
            new d
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r2v4 ? I:Ad.d) =  call: Ad.d.<init>():void type: CONSTRUCTOR in method: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper.j(yf.a):com.facebook.react.bridge.ReactApplicationContext, dex: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                java.lang.ref.WeakReference r0 = r1.f59923h
                java.lang.Object r0 = r0.get()
                if (r2 != 0) goto L_0x000d
                Ad.d r2 = new Ad.d
                r2.<init>()
            L_0x000d:
                if (r0 == 0) goto L_0x0012
                com.facebook.react.bridge.ReactApplicationContext r0 = (com.facebook.react.bridge.ReactApplicationContext) r0
                return r0
            L_0x0012:
                java.lang.Object r2 = r2.invoke()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper.j(yf.a):com.facebook.react.bridge.ReactApplicationContext");
        }

        static /* synthetic */ ReactApplicationContext k(ScreenDummyLayoutHelper screenDummyLayoutHelper, C6787a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = null;
            }
            return screenDummyLayoutHelper.j(aVar);
        }

        /* access modifiers changed from: private */
        public static final Object l() {
            return "[RNScreens] Attempt to require missing react context";
        }

        public void onHostDestroy() {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f59923h.get();
            if (reactApplicationContext != null) {
                reactApplicationContext.removeLifecycleEventListener(this);
            }
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            ReactApplicationContext j10 = j(new c());
            if (g(j10)) {
                j10.removeLifecycleEventListener(this);
            } else {
                Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to initialise dummy layout in onHostResume.");
            }
        }
    }
