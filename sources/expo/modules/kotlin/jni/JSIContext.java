package expo.modules.kotlin.jni;

import ae.m;
import ae.n;
import ae.u;
import ae.w;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.b;
import oe.c;
import oe.d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 E2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H ¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH ¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020!H ¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u000fH ¢\u0006\u0004\b%\u0010\u0005J \u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!H ¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020\u001cH\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\u001cH\u0007¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c02H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\u0006\u0010(\u001a\u00020!H\u0007¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u0004\u0018\u00010!2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u000f2\n\u00106\u001a\u0006\u0012\u0002\b\u00030=2\u0006\u0010(\u001a\u00020!H\u0007¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u0004\u0018\u00010!2\n\u00106\u001a\u0006\u0012\u0002\b\u00030=H\u0007¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0004¢\u0006\u0004\bD\u0010\u0005J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010\u0005J\u000f\u0010F\u001a\u00020\u000fH\u0016¢\u0006\u0004\bF\u0010\u0005R(\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00160G8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bH\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsInvokerHolder", "Llf/M;", "installJSI", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "installJSIForBridgeless", "(JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)V", "Lae/u;", "runtimeContext", "f", "(Lae/u;JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "n", "(Lae/u;JLcom/facebook/react/bridge/RuntimeExecutor;)V", "", "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", "", "id", "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "", "hasModule", "(Ljava/lang/String;)Z", "", "getJavaScriptModulesName", "()[Ljava/lang/String;", "", "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getSharedObject", "(I)Lexpo/modules/kotlin/jni/JavaScriptObject;", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "getCoreModuleObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "finalize", "b", "close", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "o", "(Ljava/lang/ref/WeakReference;)V", "runtimeContextHolder", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JSIContext implements Destructible, AutoCloseable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60432b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f60433c = 8;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f60434a;
    private final HybridData mHybridData = initHybrid();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("expo-modules-core");
    }

    private final native HybridData initHybrid();

    private final native void installJSI(long j10, JNIDeallocator jNIDeallocator, CallInvokerHolderImpl callInvokerHolderImpl);

    private final native void installJSIForBridgeless(long j10, JNIDeallocator jNIDeallocator, RuntimeExecutor runtimeExecutor);

    public final WeakReference a() {
        WeakReference weakReference = this.f60434a;
        if (weakReference != null) {
            return weakReference;
        }
        C6496s.v("runtimeContextHolder");
        return null;
    }

    public void b() {
        this.mHybridData.resetNative();
    }

    public void close() {
        b();
    }

    public final native JavaScriptObject createObject();

    public final void deleteSharedObject(int i10) {
        d i11;
        u uVar = (u) a().get();
        if (uVar != null && (i11 = uVar.i()) != null) {
            i11.b(c.b(i10));
        }
    }

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String str);

    public final void f(u uVar, long j10, CallInvokerHolderImpl callInvokerHolderImpl) {
        C6496s.h(uVar, "runtimeContext");
        C6496s.h(callInvokerHolderImpl, "jsInvokerHolder");
        o(w.a(uVar));
        installJSI(j10, uVar.e(), callInvokerHolderImpl);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
    }

    public final JavaScriptModuleObject getCoreModuleObject() {
        m d10;
        u uVar = (u) a().get();
        if (uVar == null || (d10 = uVar.d()) == null) {
            return null;
        }
        return d10.f();
    }

    public final JavaScriptModuleObject getJavaScriptModuleObject(String str) {
        n h10;
        m t10;
        C6496s.h(str, "name");
        u uVar = (u) a().get();
        if (uVar == null || (h10 = uVar.h()) == null || (t10 = h10.t(str)) == null) {
            return null;
        }
        return t10.f();
    }

    public final String[] getJavaScriptModulesName() {
        n h10;
        Map x10;
        Set keySet;
        String[] strArr;
        u uVar = (u) a().get();
        if (uVar == null || (h10 = uVar.h()) == null || (x10 = h10.x()) == null || (keySet = x10.keySet()) == null || (strArr = (String[]) keySet.toArray(new String[0])) == null) {
            return new String[0];
        }
        return strArr;
    }

    public final JavaScriptObject getJavascriptClass(Class<?> cls) {
        b c10;
        C6496s.h(cls, "native");
        u uVar = (u) a().get();
        if (uVar == null || (c10 = uVar.c()) == null) {
            return null;
        }
        return c10.e(cls);
    }

    public final JavaScriptObject getSharedObject(int i10) {
        u uVar = (u) a().get();
        if (uVar == null) {
            return null;
        }
        return c.e(c.b(i10), uVar);
    }

    public final native JavaScriptObject global();

    public final boolean hasModule(String str) {
        n h10;
        C6496s.h(str, "name");
        u uVar = (u) a().get();
        if (uVar == null || (h10 = uVar.h()) == null) {
            return false;
        }
        return h10.z(str);
    }

    public final void n(u uVar, long j10, RuntimeExecutor runtimeExecutor) {
        C6496s.h(uVar, "runtimeContext");
        C6496s.h(runtimeExecutor, "runtimeExecutor");
        o(w.a(uVar));
        installJSIForBridgeless(j10, uVar.e(), runtimeExecutor);
    }

    public final void o(WeakReference weakReference) {
        C6496s.h(weakReference, "<set-?>");
        this.f60434a = weakReference;
    }

    public final void registerClass(Class<?> cls, JavaScriptObject javaScriptObject) {
        b c10;
        C6496s.h(cls, "native");
        C6496s.h(javaScriptObject, "js");
        u uVar = (u) a().get();
        if (uVar != null && (c10 = uVar.c()) != null) {
            c10.b(cls, javaScriptObject);
        }
    }

    public final void registerSharedObject(Object obj, JavaScriptObject javaScriptObject) {
        d i10;
        C6496s.h(obj, "native");
        C6496s.h(javaScriptObject, "js");
        u uVar = (u) a().get();
        if (uVar != null && (i10 = uVar.i()) != null) {
            c.a(i10.a((SharedObject) obj, javaScriptObject));
        }
    }

    public final native void setNativeStateForSharedObject(int i10, JavaScriptObject javaScriptObject);
}
