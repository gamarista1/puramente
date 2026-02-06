package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Llf/M;", "finalize", "()V", "b", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "lock", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaScriptWeakObject implements Destructible {
    private final HybridData mHybridData;

    public JavaScriptWeakObject(HybridData hybridData) {
        C6496s.h(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }

    public void b() {
        this.mHybridData.resetNative();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
    }

    public final native JavaScriptObject lock();
}
