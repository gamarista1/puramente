package com.facebook.react.bridge;

import B7.a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import mf.C6559l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H ¢\u0006\u0002\u0010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020\u0014H\u0016J\u0013\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070*H\u0016R#\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006,"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeArray;", "Lcom/facebook/react/bridge/NativeArray;", "Lcom/facebook/react/bridge/ReadableArray;", "<init>", "()V", "localArray", "", "", "getLocalArray", "()[Ljava/lang/Object;", "localArray$delegate", "Lkotlin/Lazy;", "importArray", "localTypeArray", "Lcom/facebook/react/bridge/ReadableType;", "getLocalTypeArray", "()[Lcom/facebook/react/bridge/ReadableType;", "localTypeArray$delegate", "importTypeArray", "size", "", "isNull", "", "index", "getBoolean", "getDouble", "", "getInt", "getLong", "", "getString", "", "getArray", "getMap", "Lcom/facebook/react/bridge/ReadableNativeMap;", "getType", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "hashCode", "equals", "other", "toArrayList", "Ljava/util/ArrayList;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int jniPassCounter;
    private final Lazy localArray$delegate;
    private final Lazy localTypeArray$delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeArray$Companion;", "", "<init>", "()V", "value", "", "jniPassCounter", "getJNIPassCounter", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getJNIPassCounter() {
            return ReadableNativeArray.jniPassCounter;
        }

        private Companion() {
        }
    }

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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeArray.WhenMappings.<clinit>():void");
        }
    }

    protected ReadableNativeArray() {
        C6534r rVar = C6534r.SYNCHRONIZED;
        this.localArray$delegate = C6531o.a(rVar, new o(this));
        this.localTypeArray$delegate = C6531o.a(rVar, new p(this));
    }

    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    private final Object[] getLocalArray() {
        return (Object[]) this.localArray$delegate.getValue();
    }

    private final ReadableType[] getLocalTypeArray() {
        Object value = this.localTypeArray$delegate.getValue();
        C6496s.g(value, "getValue(...)");
        return (ReadableType[]) value;
    }

    private final native Object[] importArray();

    private final native Object[] importTypeArray();

    /* access modifiers changed from: private */
    public static final Object[] localArray_delegate$lambda$0(ReadableNativeArray readableNativeArray) {
        jniPassCounter++;
        return readableNativeArray.importArray();
    }

    /* access modifiers changed from: private */
    public static final ReadableType[] localTypeArray_delegate$lambda$1(ReadableNativeArray readableNativeArray) {
        jniPassCounter++;
        Object[] importTypeArray = readableNativeArray.importTypeArray();
        return (ReadableType[]) Arrays.copyOf(importTypeArray, importTypeArray.length, ReadableType[].class);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeArray)) {
            return false;
        }
        return C6559l.c(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
    }

    public boolean getBoolean(int i10) {
        Object obj = getLocalArray()[i10];
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public double getDouble(int i10) {
        Object obj = getLocalArray()[i10];
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) obj).doubleValue();
    }

    public Dynamic getDynamic(int i10) {
        DynamicFromArray create = DynamicFromArray.create(this, i10);
        C6496s.g(create, "create(...)");
        return create;
    }

    public int getInt(int i10) {
        Object obj = getLocalArray()[i10];
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Double");
        return (int) ((Double) obj).doubleValue();
    }

    public long getLong(int i10) {
        Object obj = getLocalArray()[i10];
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    public String getString(int i10) {
        return (String) getLocalArray()[i10];
    }

    public ReadableType getType(int i10) {
        return getLocalTypeArray()[i10];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    public boolean isNull(int i10) {
        if (getLocalArray()[i10] == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return getLocalArray().length;
    }

    public ArrayList<Object> toArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = null;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(i10).ordinal()]) {
                case 1:
                    arrayList.add((Object) null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(getBoolean(i10)));
                    break;
                case 3:
                    arrayList.add(Double.valueOf(getDouble(i10)));
                    break;
                case 4:
                    arrayList.add(getString(i10));
                    break;
                case 5:
                    ReadableNativeMap map = getMap(i10);
                    if (map != null) {
                        obj = map.toHashMap();
                    }
                    arrayList.add(obj);
                    break;
                case 6:
                    ReadableNativeArray array = getArray(i10);
                    if (array != null) {
                        obj = array.toArrayList();
                    }
                    arrayList.add(obj);
                    break;
                default:
                    throw new C6535s();
            }
        }
        return arrayList;
    }

    public ReadableNativeArray getArray(int i10) {
        return (ReadableNativeArray) getLocalArray()[i10];
    }

    public ReadableNativeMap getMap(int i10) {
        return (ReadableNativeMap) getLocalArray()[i10];
    }
}
