package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H ¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H ¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H ¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/facebook/react/bridge/DynamicNative;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/bridge/Dynamic;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableType;", "getTypeNative", "()Lcom/facebook/react/bridge/ReadableType;", "", "isNullNative", "()Z", "asBoolean", "", "asInt", "()I", "", "asDouble", "()D", "", "asString", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableArray;", "asArray", "()Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/ReadableMap;", "asMap", "()Lcom/facebook/react/bridge/ReadableMap;", "Llf/M;", "recycle", "getType", "type", "isNull", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DynamicNative extends HybridClassBase implements Dynamic {
    private final native ReadableType getTypeNative();

    private final native boolean isNullNative();

    public native ReadableArray asArray();

    public native boolean asBoolean();

    public native double asDouble();

    public int asInt() {
        return (int) asDouble();
    }

    public native ReadableMap asMap();

    public native String asString();

    public ReadableType getType() {
        return getTypeNative();
    }

    public boolean isNull() {
        return isNullNative();
    }

    public void recycle() {
    }
}
