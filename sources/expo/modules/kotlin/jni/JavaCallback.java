package expo.modules.kotlin.jni;

import ae.C4466c;
import com.amazon.a.a.o.b;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qe.L;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH ¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH ¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH ¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H ¢\u0006\u0004\b\u0007\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H ¢\u0006\u0004\b\u0007\u0010\u0013J \u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H ¢\u0006\u0004\b\u0007\u0010\u0016J&\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0017H ¢\u0006\u0004\b\u0007\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0019H ¢\u0006\u0004\b\u0007\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001bH ¢\u0006\u0004\b\u0007\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001dH ¢\u0006\u0004\b\u0007\u0010\u001eJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H ¢\u0006\u0004\b\u0007\u0010!J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\"H ¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020%H ¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020(H ¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020+H ¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\bJ\u0018\u00102\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u0010\u000bJ\u0018\u00103\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\rJ\u0018\u00104\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u000fJ\u0018\u00105\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010\u0011J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0013J \u00107\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b7\u0010!J\u000f\u00108\u001a\u00020\u0006H\u0004¢\u0006\u0004\b8\u0010\bJ\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:¨\u0006;"}, d2 = {"Lexpo/modules/kotlin/jni/JavaCallback;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Llf/M;", "invokeNative", "()V", "", "result", "(I)V", "", "(Z)V", "", "(D)V", "", "(F)V", "", "(Ljava/lang/String;)V", "", "", "(Ljava/util/Collection;)V", "", "(Ljava/util/Map;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableNativeMap;", "(Lcom/facebook/react/bridge/WritableNativeMap;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V", "code", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "", "invokeIntArray", "([I)V", "", "invokeLongArray", "([J)V", "", "invokeFloatArray", "([F)V", "", "invokeDoubleArray", "([D)V", "value", "f", "(Ljava/lang/Object;)V", "a", "e", "i", "c", "d", "g", "h", "finalize", "b", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaCallback implements Destructible {
    private final HybridData mHybridData;

    public JavaCallback(HybridData hybridData) {
        C6496s.h(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }

    private final native void invokeDoubleArray(double[] dArr);

    private final native void invokeFloatArray(float[] fArr);

    private final native void invokeIntArray(int[] iArr);

    private final native void invokeLongArray(long[] jArr);

    private final native void invokeNative();

    private final native void invokeNative(double d10);

    private final native void invokeNative(float f10);

    private final native void invokeNative(int i10);

    private final native void invokeNative(WritableNativeArray writableNativeArray);

    private final native void invokeNative(WritableNativeMap writableNativeMap);

    private final native void invokeNative(SharedObject sharedObject);

    private final native void invokeNative(String str);

    private final native void invokeNative(String str, String str2);

    private final native void invokeNative(Collection<? extends Object> collection);

    private final native void invokeNative(Map<String, ? extends Object> map);

    private final native void invokeNative(boolean z10);

    public final void a() {
        try {
            invokeNative();
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    public void b() {
        this.mHybridData.resetNative();
    }

    public final void c(double d10) {
        try {
            invokeNative(d10);
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    public final void d(float f10) {
        try {
            invokeNative(f10);
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    public final void e(int i10) {
        try {
            invokeNative(i10);
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    public final void f(Object obj) {
        try {
            Object b10 = L.b(L.f61392a, obj, (L.a) null, true, 2, (Object) null);
            if (b10 == null) {
                invokeNative();
            } else if (b10 instanceof Integer) {
                invokeNative(((Number) b10).intValue());
            } else if (b10 instanceof Boolean) {
                invokeNative(((Boolean) b10).booleanValue());
            } else if (b10 instanceof Double) {
                invokeNative(((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                invokeNative(((Number) b10).floatValue());
            } else if (b10 instanceof String) {
                invokeNative((String) b10);
            } else if (b10 instanceof Collection) {
                invokeNative((Collection<? extends Object>) (Collection) b10);
            } else if (b10 instanceof Map) {
                invokeNative((Map<String, ? extends Object>) (Map) b10);
            } else if (b10 instanceof WritableNativeArray) {
                invokeNative((WritableNativeArray) b10);
            } else if (b10 instanceof WritableNativeMap) {
                invokeNative((WritableNativeMap) b10);
            } else if (b10 instanceof SharedObject) {
                invokeNative((SharedObject) b10);
            } else if (b10 instanceof int[]) {
                invokeIntArray((int[]) b10);
            } else if (b10 instanceof long[]) {
                invokeLongArray((long[]) b10);
            } else if (b10 instanceof float[]) {
                invokeFloatArray((float[]) b10);
            } else if (b10 instanceof double[]) {
                invokeDoubleArray((double[]) b10);
            } else {
                Class<?> cls = b10.getClass();
                throw new UnexpectedException("Unknown type: " + cls);
            }
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
    }

    public final void g(String str) {
        C6496s.h(str, "result");
        try {
            invokeNative(str);
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    public final void h(String str, String str2) {
        C6496s.h(str, "code");
        C6496s.h(str2, b.f37483f);
        try {
            invokeNative(str, str2);
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }

    public final void i(boolean z10) {
        try {
            invokeNative(z10);
        } catch (Throwable th2) {
            if (!this.mHybridData.isValid()) {
                C4466c.a().a("Invalidated JavaCallback was invoked", th2);
                return;
            }
            throw th2;
        }
    }
}
