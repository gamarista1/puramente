package expo.modules.kotlin.jni.decorators;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import expo.modules.kotlin.jni.Destructible;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH ¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H ¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u001aH ¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010#\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u0016H ¢\u0006\u0004\b#\u0010$J \u0010&\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0000H ¢\u0006\u0004\b&\u0010'JT\u0010,\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\u0006\u0010+\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H ¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000bH\u0004¢\u0006\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/bridge/NativeMap;", "constants", "Llf/M;", "registerConstants", "(Lcom/facebook/react/bridge/NativeMap;)V", "", "name", "", "takesOwner", "enumerable", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "desiredTypes", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "body", "registerSyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;", "registerAsyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V", "getterTakesOwner", "getterExpectedType", "getter", "setterTakesOwner", "setterExpectedType", "setter", "registerProperty", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "jsDecoratorsBridgingObject", "registerObject", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "prototypeDecorator", "Ljava/lang/Class;", "ownerClass", "isSharedRef", "registerClass", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;ZLjava/lang/Class;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "b", "()V", "finalize", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JSDecoratorsBridgingObject implements Destructible {
    private final HybridData mHybridData = initHybrid();

    public JSDecoratorsBridgingObject(JNIDeallocator jNIDeallocator) {
        C6496s.h(jNIDeallocator, "jniDeallocator");
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    public void b() {
        this.mHybridData.resetNative();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        b();
    }

    public final native void registerAsyncFunction(String str, boolean z10, boolean z11, ExpectedType[] expectedTypeArr, JNIAsyncFunctionBody jNIAsyncFunctionBody);

    public final native void registerClass(String str, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, boolean z10, Class<?> cls, boolean z11, ExpectedType[] expectedTypeArr, JNIFunctionBody jNIFunctionBody);

    public final native void registerConstants(NativeMap nativeMap);

    public final native void registerObject(String str, JSDecoratorsBridgingObject jSDecoratorsBridgingObject);

    public final native void registerProperty(String str, boolean z10, ExpectedType[] expectedTypeArr, JNIFunctionBody jNIFunctionBody, boolean z11, ExpectedType[] expectedTypeArr2, JNIFunctionBody jNIFunctionBody2);

    public final native void registerSyncFunction(String str, boolean z10, boolean z11, ExpectedType[] expectedTypeArr, JNIFunctionBody jNIFunctionBody);
}
