package com.facebook.react.bridge;

import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB!\b\u0012\u0012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0012\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0006\u0010\nB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0012J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u00020+2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020+H\u0016¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010\u000eR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyArray;", "Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/WritableArray;", "", "", "values", "<init>", "([Ljava/lang/Object;)V", "", "list", "(Ljava/util/List;)V", "()V", "", "size", "()I", "index", "", "isNull", "(I)Z", "", "getDouble", "(I)D", "getInt", "(I)I", "", "getLong", "(I)J", "", "getString", "(I)Ljava/lang/String;", "getArray", "(I)Lcom/facebook/react/bridge/ReadableArray;", "getBoolean", "Lcom/facebook/react/bridge/ReadableMap;", "getMap", "(I)Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/Dynamic;", "getDynamic", "(I)Lcom/facebook/react/bridge/Dynamic;", "Lcom/facebook/react/bridge/ReadableType;", "getType", "(I)Lcom/facebook/react/bridge/ReadableType;", "value", "Llf/M;", "pushBoolean", "(Z)V", "pushDouble", "(D)V", "pushInt", "(I)V", "pushLong", "(J)V", "pushString", "(Ljava/lang/String;)V", "array", "pushArray", "(Lcom/facebook/react/bridge/ReadableArray;)V", "map", "pushMap", "(Lcom/facebook/react/bridge/ReadableMap;)V", "pushNull", "Ljava/util/ArrayList;", "toArrayList", "()Ljava/util/ArrayList;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "backingList", "Ljava/util/List;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaOnlyArray implements ReadableArray, WritableArray {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<Object> backingList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007J%\u0010\b\u001a\u00020\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyArray$Companion;", "", "<init>", "()V", "from", "Lcom/facebook/react/bridge/JavaOnlyArray;", "list", "", "of", "values", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyArray;", "deepClone", "array", "Lcom/facebook/react/bridge/ReadableArray;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaOnlyArray.Companion.WhenMappings.<clinit>():void");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaOnlyArray deepClone(ReadableArray readableArray) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            if (readableArray == null) {
                return javaOnlyArray;
            }
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()]) {
                    case 1:
                        javaOnlyArray.pushNull();
                        break;
                    case 2:
                        javaOnlyArray.pushBoolean(readableArray.getBoolean(i10));
                        break;
                    case 3:
                        javaOnlyArray.pushDouble(readableArray.getDouble(i10));
                        break;
                    case 4:
                        javaOnlyArray.pushString(readableArray.getString(i10));
                        break;
                    case 5:
                        javaOnlyArray.pushMap(JavaOnlyMap.Companion.deepClone(readableArray.getMap(i10)));
                        break;
                    case 6:
                        javaOnlyArray.pushArray(JavaOnlyArray.Companion.deepClone(readableArray.getArray(i10)));
                        break;
                    default:
                        throw new C6535s();
                }
            }
            return javaOnlyArray;
        }

        public final JavaOnlyArray from(List<?> list) {
            C6496s.h(list, AttributeType.LIST);
            return new JavaOnlyArray((List) list, (DefaultConstructorMarker) null);
        }

        public final JavaOnlyArray of(Object... objArr) {
            C6496s.h(objArr, "values");
            return new JavaOnlyArray(Arrays.copyOf(objArr, objArr.length), (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ JavaOnlyArray(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<?>) list);
    }

    public static final JavaOnlyArray deepClone(ReadableArray readableArray) {
        return Companion.deepClone(readableArray);
    }

    public static final JavaOnlyArray from(List<?> list) {
        return Companion.from(list);
    }

    public static final JavaOnlyArray of(Object... objArr) {
        return Companion.of(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C6496s.c(JavaOnlyArray.class, obj.getClass())) {
            return false;
        }
        return C6496s.c(this.backingList, ((JavaOnlyArray) obj).backingList);
    }

    public ReadableArray getArray(int i10) {
        return (ReadableArray) this.backingList.get(i10);
    }

    public boolean getBoolean(int i10) {
        Object obj = this.backingList.get(i10);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public double getDouble(int i10) {
        Object obj = this.backingList.get(i10);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).doubleValue();
    }

    public Dynamic getDynamic(int i10) {
        DynamicFromArray create = DynamicFromArray.create(this, i10);
        C6496s.g(create, "create(...)");
        return create;
    }

    public int getInt(int i10) {
        Object obj = this.backingList.get(i10);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).intValue();
    }

    public long getLong(int i10) {
        Object obj = this.backingList.get(i10);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).longValue();
    }

    public ReadableMap getMap(int i10) {
        return (ReadableMap) this.backingList.get(i10);
    }

    public String getString(int i10) {
        return (String) this.backingList.get(i10);
    }

    public ReadableType getType(int i10) {
        Object obj = this.backingList.get(i10);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        Class<?> cls = obj.getClass();
        throw new IllegalStateException("Invalid type " + cls + ")");
    }

    public int hashCode() {
        return this.backingList.hashCode();
    }

    public boolean isNull(int i10) {
        if (this.backingList.get(i10) == null) {
            return true;
        }
        return false;
    }

    public void pushArray(ReadableArray readableArray) {
        this.backingList.add(readableArray);
    }

    public void pushBoolean(boolean z10) {
        this.backingList.add(Boolean.valueOf(z10));
    }

    public void pushDouble(double d10) {
        this.backingList.add(Double.valueOf(d10));
    }

    public void pushInt(int i10) {
        this.backingList.add(Double.valueOf((double) i10));
    }

    public void pushLong(long j10) {
        this.backingList.add(Double.valueOf((double) j10));
    }

    public void pushMap(ReadableMap readableMap) {
        this.backingList.add(readableMap);
    }

    public void pushNull() {
        this.backingList.add((Object) null);
    }

    public void pushString(String str) {
        this.backingList.add(str);
    }

    public int size() {
        return this.backingList.size();
    }

    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this.backingList);
    }

    public String toString() {
        return this.backingList.toString();
    }

    public /* synthetic */ JavaOnlyArray(Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(objArr);
    }

    private JavaOnlyArray(Object... objArr) {
        this.backingList = C6565s.t(Arrays.copyOf(objArr, objArr.length));
    }

    private JavaOnlyArray(List<?> list) {
        this.backingList = new ArrayList(list);
    }

    public JavaOnlyArray() {
        this.backingList = new ArrayList();
    }
}
