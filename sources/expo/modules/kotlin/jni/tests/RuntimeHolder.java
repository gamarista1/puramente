package expo.modules.kotlin.jni.tests;

import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H ¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/jni/tests/RuntimeHolder;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Llf/M;", "release", "", "createRuntime", "()J", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "createCallInvoker", "()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "finalize", "close", "mHybridData", "Lcom/facebook/jni/HybridData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasDeallocated", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RuntimeHolder implements AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f60452a = new AtomicBoolean(false);
    private final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    private final native void release();

    public void close() {
        if (this.f60452a.compareAndSet(false, true)) {
            release();
            this.mHybridData.resetNative();
        }
    }

    public final native CallInvokerHolderImpl createCallInvoker();

    public final native long createRuntime();

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }
}
