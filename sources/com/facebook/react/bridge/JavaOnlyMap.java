package com.facebook.react.bridge;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import tf.C6729c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0005\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0007¢\u0006\u0004\b\u0003\u0010\u0004B!\b\u0012\u0012\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020+2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020+2\u0006\u0010:\u001a\u00020\u0001H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020+2\u0006\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020+2\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\bA\u00107J\u001d\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0013H\u0016¢\u0006\u0004\bJ\u0010KR\"\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR(\u0010S\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060P0O8VX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyMap;", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "()V", "", "", "keysAndValues", "([Ljava/lang/Object;)V", "", "name", "", "hasKey", "(Ljava/lang/String;)Z", "isNull", "getBoolean", "", "getDouble", "(Ljava/lang/String;)D", "", "getInt", "(Ljava/lang/String;)I", "", "getLong", "(Ljava/lang/String;)J", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "getMap", "(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "getArray", "(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/Dynamic;", "getDynamic", "(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;", "Lcom/facebook/react/bridge/ReadableType;", "getType", "(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "keySetIterator", "()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "key", "value", "Llf/M;", "putBoolean", "(Ljava/lang/String;Z)V", "putDouble", "(Ljava/lang/String;D)V", "putInt", "(Ljava/lang/String;I)V", "putLong", "(Ljava/lang/String;J)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "putNull", "(Ljava/lang/String;)V", "putMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "source", "merge", "(Lcom/facebook/react/bridge/ReadableMap;)V", "copy", "()Lcom/facebook/react/bridge/WritableMap;", "putArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "remove", "Ljava/util/HashMap;", "toHashMap", "()Ljava/util/HashMap;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "backingMap", "Ljava/util/Map;", "", "", "getEntryIterator", "()Ljava/util/Iterator;", "entryIterator", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaOnlyMap implements ReadableMap, WritableMap {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Map<String, Object> backingMap;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyMap$Companion;", "", "<init>", "()V", "of", "Lcom/facebook/react/bridge/JavaOnlyMap;", "keysAndValues", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;", "from", "map", "", "", "deepClone", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaOnlyMap.Companion.WhenMappings.<clinit>():void");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaOnlyMap deepClone(ReadableMap readableMap) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (readableMap == null) {
                return javaOnlyMap;
            }
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        javaOnlyMap.putNull(nextKey);
                        break;
                    case 2:
                        javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                        break;
                    case 3:
                        javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                        break;
                    case 4:
                        javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                        break;
                    case 5:
                        javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                        break;
                    case 6:
                        javaOnlyMap.putArray(nextKey, JavaOnlyArray.Companion.deepClone(readableMap.getArray(nextKey)));
                        break;
                    default:
                        throw new C6535s();
                }
            }
            return javaOnlyMap;
        }

        public final JavaOnlyMap from(Map<String, ? extends Object> map) {
            C6496s.h(map, "map");
            return new JavaOnlyMap(new Object[]{map}, (DefaultConstructorMarker) null);
        }

        public final JavaOnlyMap of(Object... objArr) {
            C6496s.h(objArr, "keysAndValues");
            return new JavaOnlyMap(Arrays.copyOf(objArr, objArr.length), (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ JavaOnlyMap(Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(objArr);
    }

    public static final JavaOnlyMap deepClone(ReadableMap readableMap) {
        return Companion.deepClone(readableMap);
    }

    public static final JavaOnlyMap from(Map<String, ? extends Object> map) {
        return Companion.from(map);
    }

    public static final JavaOnlyMap of(Object... objArr) {
        return Companion.of(objArr);
    }

    public WritableMap copy() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.merge(this);
        return javaOnlyMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C6496s.c(JavaOnlyMap.class, obj.getClass())) {
                return C6496s.c(this.backingMap, ((JavaOnlyMap) obj).backingMap);
            }
        }
        return false;
    }

    public ReadableArray getArray(String str) {
        C6496s.h(str, "name");
        return (ReadableArray) this.backingMap.get(str);
    }

    public boolean getBoolean(String str) {
        C6496s.h(str, "name");
        Object obj = this.backingMap.get(str);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public double getDouble(String str) {
        C6496s.h(str, "name");
        Object obj = this.backingMap.get(str);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).doubleValue();
    }

    public Dynamic getDynamic(String str) {
        C6496s.h(str, "name");
        DynamicFromMap create = DynamicFromMap.create(this, str);
        C6496s.g(create, "create(...)");
        return create;
    }

    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        return this.backingMap.entrySet().iterator();
    }

    public int getInt(String str) {
        C6496s.h(str, "name");
        Object obj = this.backingMap.get(str);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).intValue();
    }

    public long getLong(String str) {
        C6496s.h(str, "name");
        Object obj = this.backingMap.get(str);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).longValue();
    }

    public ReadableMap getMap(String str) {
        C6496s.h(str, "name");
        return (ReadableMap) this.backingMap.get(str);
    }

    public String getString(String str) {
        C6496s.h(str, "name");
        return (String) this.backingMap.get(str);
    }

    public ReadableType getType(String str) {
        C6496s.h(str, "name");
        Object obj = this.backingMap.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        throw new IllegalArgumentException("Invalid value " + obj + " for key " + str + " contained in JavaOnlyMap");
    }

    public boolean hasKey(String str) {
        C6496s.h(str, "name");
        return this.backingMap.containsKey(str);
    }

    public int hashCode() {
        return this.backingMap.hashCode();
    }

    public boolean isNull(String str) {
        C6496s.h(str, "name");
        if (this.backingMap.get(str) == null) {
            return true;
        }
        return false;
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new JavaOnlyMap$keySetIterator$1(this);
    }

    public void merge(ReadableMap readableMap) {
        C6496s.h(readableMap, "source");
        this.backingMap.putAll(((JavaOnlyMap) readableMap).backingMap);
    }

    public void putArray(String str, ReadableArray readableArray) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, readableArray);
    }

    public void putBoolean(String str, boolean z10) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, Boolean.valueOf(z10));
    }

    public void putDouble(String str, double d10) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, Double.valueOf(d10));
    }

    public void putInt(String str, int i10) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, Double.valueOf((double) i10));
    }

    public void putLong(String str, long j10) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, Double.valueOf((double) j10));
    }

    public void putMap(String str, ReadableMap readableMap) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, readableMap);
    }

    public void putNull(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, (Object) null);
    }

    public void putString(String str, String str2) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.put(str, str2);
    }

    public final void remove(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.backingMap.remove(str);
    }

    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this.backingMap);
    }

    public String toString() {
        return this.backingMap.toString();
    }

    public JavaOnlyMap() {
        this.backingMap = new HashMap();
    }

    private JavaOnlyMap(Object... objArr) {
        this();
        if (objArr.length % 2 == 0) {
            int i10 = 0;
            int c10 = C6729c.c(0, objArr.length - 1, 2);
            if (c10 >= 0) {
                while (true) {
                    Double d10 = objArr[i10 + 1];
                    d10 = d10 instanceof Number ? Double.valueOf(d10.doubleValue()) : d10;
                    Map<String, Object> map = this.backingMap;
                    String str = objArr[i10];
                    C6496s.f(str, "null cannot be cast to non-null type kotlin.String");
                    map.put(str, d10);
                    if (i10 != c10) {
                        i10 += 2;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("You must provide the same number of keys and values");
        }
    }
}
