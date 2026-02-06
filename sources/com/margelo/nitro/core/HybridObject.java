package com.margelo.nitro.core;

import B7.a;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8WX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/margelo/nitro/core/HybridObject;", "", "<init>", "()V", "Llf/M;", "dispose", "", "toString", "()Ljava/lang/String;", "Lcom/facebook/jni/HybridData;", "hybridData", "updateNative", "(Lcom/facebook/jni/HybridData;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "", "getMemorySize", "()J", "memorySize", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
@Keep
public abstract class HybridObject {
    private HybridData mHybridData;

    @a
    @Keep
    public void dispose() {
    }

    @a
    @Keep
    public long getMemorySize() {
        return 0;
    }

    @a
    @Keep
    public String toString() {
        String w10 = O.b(getClass()).w();
        return "[HybridObject " + w10 + "]";
    }

    /* access modifiers changed from: protected */
    public void updateNative(HybridData hybridData) {
        C6496s.h(hybridData, "hybridData");
        this.mHybridData = hybridData;
    }
}
