package com.airbnb.android.react.lottie;

import android.animation.Animator;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import m8.C3817m;
import m8.C3819n;
import u4.C4070j;
import u4.C4071k;

@Q7.a(name = "LottieAnimationView")
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010\u001cJ\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u001cJ!\u0010,\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b/\u0010-J!\u00101\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b1\u0010-J!\u00102\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b2\u0010-J\u001f\u00105\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b8\u0010-J!\u0010:\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b:\u0010-J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;H\u0017¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010C\u001a\u000203H\u0017¢\u0006\u0004\bD\u00106J\u001f\u0010F\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010E\u001a\u000203H\u0017¢\u0006\u0004\bF\u00106J!\u0010H\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\bH\u0010-J\u001f\u0010J\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010I\u001a\u000203H\u0017¢\u0006\u0004\bJ\u00106J\u001f\u0010L\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010K\u001a\u000203H\u0017¢\u0006\u0004\bL\u00106J\u001f\u0010N\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010M\u001a\u000203H\u0017¢\u0006\u0004\bN\u00106J!\u0010P\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\bP\u0010QJ!\u0010S\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\bS\u0010QJ#\u0010U\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010T\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bU\u0010QJ!\u0010W\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lu4/j;", "Lm8/n;", "<init>", "()V", "view", "Lcom/airbnb/android/react/lottie/h;", "getOrCreatePropertyManager", "(Lu4/j;)Lcom/airbnb/android/react/lottie/h;", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lu4/j;", "", "getExportedCustomDirectEventTypeConstants", "Llf/M;", "onAfterUpdateTransaction", "(Lu4/j;)V", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lu4/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "startFrame", "endFrame", "play", "(Lu4/j;II)V", "reset", "pause", "resume", "name", "setSourceName", "(Lu4/j;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "setSourceDotLottieURI", "", "cacheComposition", "setCacheComposition", "(Lu4/j;Z)V", "resizeMode", "setResizeMode", "renderMode", "setRenderMode", "", "progress", "setProgress", "(Lu4/j;F)V", "", "speed", "setSpeed", "(Lu4/j;D)V", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePathsAndroidForKitKatAndAbove", "enableSafeMode", "setEnableSafeModeAndroid", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "colorFilters", "setColorFilters", "(Lu4/j;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFiltersAndroid", "value", "setTextFiltersIOS", "Lcom/facebook/react/bridge/ReadableMap;", "setDummy", "(Lu4/j;Lcom/facebook/react/bridge/ReadableMap;)V", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/w0;", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LottieAnimationViewManager extends SimpleViewManager<C4070j> implements C3819n {
    private final w0 delegate = new C3817m(this);
    private final WeakHashMap<C4070j, h> propManagersMap = new WeakHashMap<>();

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4070j f37001a;

        a(C4070j jVar) {
            this.f37001a = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            C6496s.h(animator, "animation");
            g.r(this.f37001a, true);
        }

        public void onAnimationEnd(Animator animator) {
            C6496s.h(animator, "animation");
            g.r(this.f37001a, false);
        }

        public void onAnimationRepeat(Animator animator) {
            C6496s.h(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            C6496s.h(animator, "animation");
        }
    }

    /* access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(C4070j jVar, Throwable th2) {
        C6496s.e(th2);
        g.p(jVar, th2);
    }

    /* access modifiers changed from: private */
    public static final void createViewInstance$lambda$1(C4070j jVar, C4071k kVar) {
        g.q(jVar);
    }

    private final h getOrCreatePropertyManager(C4070j jVar) {
        h hVar = this.propManagersMap.get(jVar);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(jVar);
        this.propManagersMap.put(jVar, hVar2);
        return hVar2;
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return g.f();
    }

    public Map<String, Object> getExportedViewConstants() {
        return g.g();
    }

    public String getName() {
        return "LottieAnimationView";
    }

    public void setDummy(C4070j jVar, ReadableMap readableMap) {
        C6496s.h(jVar, "view");
    }

    public C4070j createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        C4070j e10 = g.e(h0Var);
        e10.setFailureListener(new a(e10));
        e10.j(new b(e10));
        e10.i(new a(e10));
        return e10;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C4070j jVar) {
        C6496s.h(jVar, "view");
        super.onAfterUpdateTransaction(jVar);
        getOrCreatePropertyManager(jVar).a();
    }

    public void pause(C4070j jVar) {
        C6496s.h(jVar, "view");
        g.h(jVar);
    }

    public void play(C4070j jVar, int i10, int i11) {
        C6496s.h(jVar, "view");
        g.j(jVar, i10, i11);
    }

    public void receiveCommand(C4070j jVar, String str, ReadableArray readableArray) {
        C6496s.h(jVar, "root");
        C6496s.h(str, "commandId");
        this.delegate.b(jVar, str, readableArray);
    }

    public void reset(C4070j jVar) {
        C6496s.h(jVar, "view");
        g.l(jVar);
    }

    public void resume(C4070j jVar) {
        C6496s.h(jVar, "view");
        g.n(jVar);
    }

    @C3500a(name = "autoPlay")
    public void setAutoPlay(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        g.s(z10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "cacheComposition")
    public void setCacheComposition(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        g.t(jVar, z10);
    }

    @C3500a(name = "colorFilters")
    public void setColorFilters(C4070j jVar, ReadableArray readableArray) {
        C6496s.h(jVar, "view");
        g.u(readableArray, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePathsAndroidForKitKatAndAbove(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        g.v(z10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "enableSafeModeAndroid")
    public void setEnableSafeModeAndroid(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        g.w(z10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "hardwareAccelerationAndroid")
    public void setHardwareAccelerationAndroid(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        g.x(z10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "imageAssetsFolder")
    public void setImageAssetsFolder(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.y(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "loop")
    public void setLoop(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        g.z(z10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "progress")
    public void setProgress(C4070j jVar, float f10) {
        C6496s.h(jVar, "view");
        g.A(f10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "renderMode")
    public void setRenderMode(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.B(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "resizeMode")
    public void setResizeMode(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.C(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "sourceDotLottieURI")
    public void setSourceDotLottieURI(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.D(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "sourceJson")
    public void setSourceJson(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.E(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "sourceName")
    public void setSourceName(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.F(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "sourceURL")
    public void setSourceURL(C4070j jVar, String str) {
        C6496s.h(jVar, "view");
        g.G(str, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "speed")
    public void setSpeed(C4070j jVar, double d10) {
        C6496s.h(jVar, "view");
        g.H(d10, getOrCreatePropertyManager(jVar));
    }

    @C3500a(name = "textFiltersAndroid")
    public void setTextFiltersAndroid(C4070j jVar, ReadableArray readableArray) {
        C6496s.h(jVar, "view");
        g.I(readableArray, getOrCreatePropertyManager(jVar));
    }

    public void setTextFiltersIOS(C4070j jVar, ReadableArray readableArray) {
    }
}
