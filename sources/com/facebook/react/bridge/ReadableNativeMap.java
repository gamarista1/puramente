package com.facebook.react.bridge;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import n7.C3863a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0002\u0010\tJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H ¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H ¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J6\u0010\u001f\u001a\u0002H \"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010\u001d\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\b¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J,\u0010%\u001a\u0002H \"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\b¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J.\u0010'\u001a\u0004\u0018\u0001H \"\u0006\b\u0000\u0010 \u0018\u00012\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\b¢\u0006\u0002\u0010&J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u00102\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u00104\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020,H\u0016J\u0013\u0010>\u001a\u00020\u001c2\b\u0010?\u001a\u0004\u0018\u00010\u000eH\u0002J(\u0010@\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000fH\u0016R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR;\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R7\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\rj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014`\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\u0011R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e08078VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006B"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/NativeMap;", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "()V", "keys", "", "", "getKeys", "()[Ljava/lang/String;", "keys$delegate", "Lkotlin/Lazy;", "localMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getLocalMap", "()Ljava/util/HashMap;", "localMap$delegate", "localTypeMap", "Lcom/facebook/react/bridge/ReadableType;", "getLocalTypeMap", "localTypeMap$delegate", "importKeys", "importValues", "()[Ljava/lang/Object;", "importTypes", "hasKey", "", "name", "isNull", "checkInstance", "T", "instance", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "getValue", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getNullableValue", "getBoolean", "getDouble", "", "getInt", "", "getLong", "", "getString", "getArray", "Lcom/facebook/react/bridge/ReadableArray;", "getMap", "getType", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "entryIterator", "", "", "getEntryIterator", "()Ljava/util/Iterator;", "keySetIterator", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "hashCode", "equals", "other", "toHashMap", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int jniPassCounter;
    private final Lazy keys$delegate;
    private final Lazy localMap$delegate;
    private final Lazy localTypeMap$delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap$Companion;", "", "<init>", "()V", "value", "", "jniPassCounter", "getJNIPassCounter", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.WhenMappings.<clinit>():void");
        }
    }

    protected ReadableNativeMap() {
        C6534r rVar = C6534r.SYNCHRONIZED;
        this.keys$delegate = C6531o.a(rVar, new q(this));
        this.localMap$delegate = C6531o.a(rVar, new r(this));
        this.localTypeMap$delegate = C6531o.a(rVar, new s(this));
    }

    @SuppressLint({"ReflectionMethodUse"})
    private final /* synthetic */ <T> T checkInstance(String str, Object obj, Class<T> cls) {
        String str2;
        C6496s.l(2, "T");
        if (obj != null) {
            return obj;
        }
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "NULL";
        }
        String simpleName = cls.getSimpleName();
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + str2 + " to " + simpleName);
    }

    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    private final String[] getKeys() {
        return (String[]) this.keys$delegate.getValue();
    }

    private final HashMap<String, Object> getLocalMap() {
        return (HashMap) this.localMap$delegate.getValue();
    }

    private final HashMap<String, ReadableType> getLocalTypeMap() {
        return (HashMap) this.localTypeMap$delegate.getValue();
    }

    private final Object getNullableValue(String str) {
        return getLocalMap().get(str);
    }

    private final Object getValue(String str) {
        if (hasKey(str)) {
            Object c10 = C3863a.c(getLocalMap().get(str));
            C6496s.g(c10, "assertNotNull(...)");
            return c10;
        }
        throw new NoSuchKeyException(str);
    }

    private final native String[] importKeys();

    private final native Object[] importTypes();

    private final native Object[] importValues();

    /* access modifiers changed from: private */
    public static final String[] keys_delegate$lambda$1(ReadableNativeMap readableNativeMap) {
        String[] importKeys = readableNativeMap.importKeys();
        jniPassCounter++;
        return importKeys;
    }

    /* access modifiers changed from: private */
    public static final HashMap localMap_delegate$lambda$2(ReadableNativeMap readableNativeMap) {
        int length = readableNativeMap.getKeys().length;
        HashMap hashMap = new HashMap(length);
        Object[] importValues = readableNativeMap.importValues();
        jniPassCounter++;
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(readableNativeMap.getKeys()[i10], importValues[i10]);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static final HashMap localTypeMap_delegate$lambda$3(ReadableNativeMap readableNativeMap) {
        int length = readableNativeMap.getKeys().length;
        HashMap hashMap = new HashMap(length);
        Object[] importTypes = readableNativeMap.importTypes();
        jniPassCounter++;
        for (int i10 = 0; i10 < length; i10++) {
            String str = readableNativeMap.getKeys()[i10];
            Object obj = importTypes[i10];
            C6496s.f(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
            hashMap.put(str, (ReadableType) obj);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeMap)) {
            return false;
        }
        return C6496s.c(getLocalMap(), ((ReadableNativeMap) obj).getLocalMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.facebook.react.bridge.ReadableArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.facebook.react.bridge.ReadableArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.facebook.react.bridge.ReadableArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.facebook.react.bridge.ReadableArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.ReadableArray getArray(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.Object r0 = r5.getNullableValue(r6)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            boolean r2 = r0 instanceof com.facebook.react.bridge.ReadableArray
            if (r2 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            com.facebook.react.bridge.ReadableArray r1 = (com.facebook.react.bridge.ReadableArray) r1
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            return r1
        L_0x0018:
            com.facebook.react.bridge.UnexpectedNativeTypeException r1 = new com.facebook.react.bridge.UnexpectedNativeTypeException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Class<com.facebook.react.bridge.ReadableArray> r2 = com.facebook.react.bridge.ReadableArray.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Value for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " cannot be cast from "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = " to "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.getArray(java.lang.String):com.facebook.react.bridge.ReadableArray");
    }

    public boolean getBoolean(String str) {
        Object obj;
        String str2;
        C6496s.h(str, "name");
        Class cls = Boolean.TYPE;
        Object value = getValue(str);
        if (!(value instanceof Boolean)) {
            obj = null;
        } else {
            obj = value;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (value != null) {
            str2 = value.getClass().getSimpleName();
        } else {
            str2 = "NULL";
        }
        String simpleName = cls.getSimpleName();
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + str2 + " to " + simpleName);
    }

    public double getDouble(String str) {
        Object obj;
        String str2;
        C6496s.h(str, "name");
        Class cls = Double.TYPE;
        Object value = getValue(str);
        if (!(value instanceof Double)) {
            obj = null;
        } else {
            obj = value;
        }
        Double d10 = (Double) obj;
        if (d10 != null) {
            return d10.doubleValue();
        }
        if (value != null) {
            str2 = value.getClass().getSimpleName();
        } else {
            str2 = "NULL";
        }
        String simpleName = cls.getSimpleName();
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + str2 + " to " + simpleName);
    }

    public Dynamic getDynamic(String str) {
        C6496s.h(str, "name");
        DynamicFromMap create = DynamicFromMap.create(this, str);
        C6496s.g(create, "create(...)");
        return create;
    }

    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        ReadableNativeMap$entryIterator$1$1 readableNativeMap$entryIterator$1$1;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] importValues = importValues();
            jniPassCounter++;
            readableNativeMap$entryIterator$1$1 = new ReadableNativeMap$entryIterator$1$1(keys, importValues);
        }
        return readableNativeMap$entryIterator$1$1;
    }

    public int getInt(String str) {
        Object obj;
        String str2;
        C6496s.h(str, "name");
        Class cls = Double.TYPE;
        Object value = getValue(str);
        if (!(value instanceof Double)) {
            obj = null;
        } else {
            obj = value;
        }
        Double d10 = (Double) obj;
        if (d10 != null) {
            return (int) d10.doubleValue();
        }
        if (value != null) {
            str2 = value.getClass().getSimpleName();
        } else {
            str2 = "NULL";
        }
        String simpleName = cls.getSimpleName();
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + str2 + " to " + simpleName);
    }

    public long getLong(String str) {
        Object obj;
        String str2;
        C6496s.h(str, "name");
        Class cls = Long.TYPE;
        Object value = getValue(str);
        if (!(value instanceof Long)) {
            obj = null;
        } else {
            obj = value;
        }
        Long l10 = (Long) obj;
        if (l10 != null) {
            return l10.longValue();
        }
        if (value != null) {
            str2 = value.getClass().getSimpleName();
        } else {
            str2 = "NULL";
        }
        String simpleName = cls.getSimpleName();
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + str2 + " to " + simpleName);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.Object r0 = r5.getNullableValue(r6)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            return r1
        L_0x0018:
            com.facebook.react.bridge.UnexpectedNativeTypeException r1 = new com.facebook.react.bridge.UnexpectedNativeTypeException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Value for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " cannot be cast from "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = " to "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.getString(java.lang.String):java.lang.String");
    }

    public ReadableType getType(String str) {
        C6496s.h(str, "name");
        ReadableType readableType = getLocalTypeMap().get(str);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(str);
    }

    public boolean hasKey(String str) {
        C6496s.h(str, "name");
        return getLocalMap().containsKey(str);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    public boolean isNull(String str) {
        C6496s.h(str, "name");
        if (!getLocalMap().containsKey(str)) {
            throw new NoSuchKeyException(str);
        } else if (getLocalMap().get(str) == null) {
            return true;
        } else {
            return false;
        }
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMap$keySetIterator$1(getKeys());
    }

    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> hashMap = new HashMap<>(getLocalMap());
        for (String next : hashMap.keySet()) {
            C6496s.f(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    hashMap.put(str, ((ReadableNativeMap) C3863a.c(getMap(str))).toHashMap());
                    break;
                case 6:
                    hashMap.put(str, ((ReadableArray) C3863a.c(getArray(str))).toArrayList());
                    break;
                default:
                    throw new C6535s();
            }
        }
        return hashMap;
    }

    private final /* synthetic */ <T> T getNullableValue(String str, Class<T> cls) {
        T nullableValue = getNullableValue(str);
        if (nullableValue == null) {
            return null;
        }
        C6496s.l(2, "T");
        return nullableValue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.facebook.react.bridge.ReadableNativeMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.facebook.react.bridge.ReadableNativeMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.facebook.react.bridge.ReadableNativeMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.facebook.react.bridge.ReadableNativeMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.ReadableNativeMap getMap(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.Object r0 = r5.getNullableValue(r6)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            boolean r2 = r0 instanceof com.facebook.react.bridge.ReadableNativeMap
            if (r2 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            com.facebook.react.bridge.ReadableNativeMap r1 = (com.facebook.react.bridge.ReadableNativeMap) r1
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            return r1
        L_0x0018:
            com.facebook.react.bridge.UnexpectedNativeTypeException r1 = new com.facebook.react.bridge.UnexpectedNativeTypeException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Class<com.facebook.react.bridge.ReadableNativeMap> r2 = com.facebook.react.bridge.ReadableNativeMap.class
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Value for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " cannot be cast from "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = " to "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.getMap(java.lang.String):com.facebook.react.bridge.ReadableNativeMap");
    }

    private final /* synthetic */ <T> T getValue(String str, Class<T> cls) {
        T value = getValue(str);
        C6496s.l(2, "T");
        if (value != null) {
            return value;
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : "NULL";
        String simpleName2 = cls.getSimpleName();
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + simpleName2);
    }
}
