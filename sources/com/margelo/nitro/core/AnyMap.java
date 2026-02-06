package com.margelo.nitro.core;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001OB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0013\u0010\u0015J\u001b\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010H ¢\u0006\u0004\b\"\u0010\u0003J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010'\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b'\u0010\u001fJ\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b(\u0010\u001fJ\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b+\u0010\u001fJ\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b,\u0010\u001fJ\u0018\u0010.\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b0\u0010\u001fJ\u0018\u00102\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b4\u00105J\"\u00107\u001a\f\u0012\u0004\u0012\u00020\f0#j\u0002`62\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b7\u00108J(\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0016j\u0002`92\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b<\u0010!J \u0010=\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020-H ¢\u0006\u0004\b=\u0010>J \u0010?\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001dH ¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u000201H ¢\u0006\u0004\bA\u0010BJ \u0010C\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH ¢\u0006\u0004\bC\u0010DJ*\u0010E\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\f0#j\u0002`6H ¢\u0006\u0004\bE\u0010FJ0\u0010G\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0016j\u0002`9H ¢\u0006\u0004\bG\u0010HJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0000H ¢\u0006\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/margelo/nitro/core/AnyMap;", "", "<init>", "()V", "", "preallocatedSize", "(I)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "", "key", "Lcom/margelo/nitro/core/AnyValue;", "getAnyValue", "(Ljava/lang/String;)Lcom/margelo/nitro/core/AnyValue;", "value", "Llf/M;", "setAnyValue", "(Ljava/lang/String;Lcom/margelo/nitro/core/AnyValue;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "(I)Lcom/facebook/jni/HybridData;", "", "toMap", "()Ljava/util/Map;", "setAny", "(Ljava/lang/String;Ljava/lang/Object;)V", "getAny", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contains", "(Ljava/lang/String;)Z", "remove", "(Ljava/lang/String;)V", "clear", "", "getAllKeys", "()[Ljava/lang/String;", "isNull", "isDouble", "isBoolean", "isBigInt", "isString", "isArray", "isObject", "", "getDouble", "(Ljava/lang/String;)D", "getBoolean", "", "getBigInt", "(Ljava/lang/String;)J", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/margelo/nitro/core/AnyArray;", "getAnyArray", "(Ljava/lang/String;)[Lcom/margelo/nitro/core/AnyValue;", "Lcom/margelo/nitro/core/AnyObject;", "getAnyObject", "(Ljava/lang/String;)Ljava/util/Map;", "setNull", "setDouble", "(Ljava/lang/String;D)V", "setBoolean", "(Ljava/lang/String;Z)V", "setBigInt", "(Ljava/lang/String;J)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setAnyArray", "(Ljava/lang/String;[Lcom/margelo/nitro/core/AnyValue;)V", "setAnyObject", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "merge", "(Lcom/margelo/nitro/core/AnyMap;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@B7.a
public final class AnyMap {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final HybridData mHybridData;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AnyMap() {
        this.mHybridData = initHybrid();
    }

    private final native AnyValue getAnyValue(String str);

    private final native HybridData initHybrid();

    private final native HybridData initHybrid(int i10);

    private final native void setAnyValue(String str, AnyValue anyValue);

    public final native void clear();

    public final native boolean contains(String str);

    public final native String[] getAllKeys();

    public final Object getAny(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return getAnyValue(str).toAny();
    }

    public final native AnyValue[] getAnyArray(String str);

    public final native Map<String, AnyValue> getAnyObject(String str);

    public final native long getBigInt(String str);

    public final native boolean getBoolean(String str);

    public final native double getDouble(String str);

    public final native String getString(String str);

    public final native boolean isArray(String str);

    public final native boolean isBigInt(String str);

    public final native boolean isBoolean(String str);

    public final native boolean isDouble(String str);

    public final native boolean isNull(String str);

    public final native boolean isObject(String str);

    public final native boolean isString(String str);

    public final native void merge(AnyMap anyMap);

    public final native void remove(String str);

    public final void setAny(String str, Object obj) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        setAnyValue(str, AnyValue.Companion.a(obj));
    }

    public final native void setAnyArray(String str, AnyValue[] anyValueArr);

    public final native void setAnyObject(String str, Map<String, AnyValue> map);

    public final native void setBigInt(String str, long j10);

    public final native void setBoolean(String str, boolean z10);

    public final native void setDouble(String str, double d10);

    public final native void setNull(String str);

    public final native void setString(String str, String str2);

    public final Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        for (String str : getAllKeys()) {
            hashMap.put(str, getAny(str));
        }
        return hashMap;
    }

    public AnyMap(int i10) {
        this.mHybridData = initHybrid(i10);
    }

    private AnyMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
