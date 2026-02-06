package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "", "name", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "decorator", "Llf/M;", "decorate", "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "finalize", "()V", "b", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "mHybridData", "Lcom/facebook/jni/HybridData;", "", "()Z", "isValid", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaScriptModuleObject implements Destructible {

    /* renamed from: a  reason: collision with root package name */
    private final String f60436a;
    private final HybridData mHybridData = initHybrid();

    public JavaScriptModuleObject(JNIDeallocator jNIDeallocator, String str) {
        C6496s.h(jNIDeallocator, "jniDeallocator");
        C6496s.h(str, "name");
        this.f60436a = str;
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    public final boolean a() {
        return this.mHybridData.isValid();
    }

    public void b() {
        this.mHybridData.resetNative();
    }

    public final native void decorate(JSDecoratorsBridgingObject jSDecoratorsBridgingObject);

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
    }

    public String toString() {
        String str = this.f60436a;
        return "JavaScriptModuleObject_" + str;
    }
}
