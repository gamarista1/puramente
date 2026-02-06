package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

public final class p extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f40517h = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final o f40518f;

    /* renamed from: g  reason: collision with root package name */
    private final JavaOnlyMap f40519g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40520a;

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
                f40520a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.p.b.<clinit>():void");
        }
    }

    public p(ReadableMap readableMap, o oVar) {
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40518f = oVar;
        this.f40519g = JavaOnlyMap.Companion.deepClone(readableMap);
    }

    private final JavaOnlyArray j(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (b.f40520a[readableArray.getType(i10).ordinal()]) {
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
                    ReadableMap map = readableArray.getMap(i10);
                    if (map == null || !map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyArray.pushMap(k(readableArray.getMap(i10)));
                        break;
                    } else {
                        b k10 = this.f40518f.k(map.getInt("nodeTag"));
                        if (k10 != null) {
                            if (!(k10 instanceof w)) {
                                if (!(k10 instanceof f)) {
                                    break;
                                } else {
                                    javaOnlyArray.pushInt(((f) k10).i());
                                    break;
                                }
                            } else {
                                w wVar = (w) k10;
                                Object k11 = wVar.k();
                                if (!(k11 instanceof Integer)) {
                                    if (!(k11 instanceof String)) {
                                        javaOnlyArray.pushDouble(wVar.l());
                                        break;
                                    } else {
                                        javaOnlyArray.pushString((String) k11);
                                        break;
                                    }
                                } else {
                                    javaOnlyArray.pushInt(((Number) k11).intValue());
                                    break;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(j(readableArray.getArray(i10)));
                    break;
                default:
                    throw new C6535s();
            }
        }
        return javaOnlyArray;
    }

    private final JavaOnlyMap k(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (b.f40520a[readableMap.getType(nextKey).ordinal()]) {
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
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map == null || !map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyMap.putMap(nextKey, k(map));
                        break;
                    } else {
                        b k10 = this.f40518f.k(map.getInt("nodeTag"));
                        if (k10 != null) {
                            if (!(k10 instanceof w)) {
                                if (!(k10 instanceof f)) {
                                    break;
                                } else {
                                    javaOnlyMap.putInt(nextKey, ((f) k10).i());
                                    break;
                                }
                            } else {
                                w wVar = (w) k10;
                                Object k11 = wVar.k();
                                if (!(k11 instanceof Integer)) {
                                    if (!(k11 instanceof String)) {
                                        javaOnlyMap.putDouble(nextKey, wVar.l());
                                        break;
                                    } else {
                                        javaOnlyMap.putString(nextKey, (String) k11);
                                        break;
                                    }
                                } else {
                                    javaOnlyMap.putInt(nextKey, ((Number) k11).intValue());
                                    break;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                    }
                case 6:
                    javaOnlyMap.putArray(nextKey, j(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new C6535s();
            }
        }
        return javaOnlyMap;
    }

    public String e() {
        int i10 = this.f40448d;
        JavaOnlyMap javaOnlyMap = this.f40519g;
        return "ObjectAnimatedNode[" + i10 + "]: mConfig: " + javaOnlyMap;
    }

    public final void i(String str, JavaOnlyMap javaOnlyMap) {
        C6496s.h(str, "propKey");
        C6496s.h(javaOnlyMap, "propsMap");
        ReadableType type = this.f40519g.getType("value");
        if (type == ReadableType.Map) {
            javaOnlyMap.putMap(str, k(this.f40519g.getMap("value")));
        } else if (type == ReadableType.Array) {
            javaOnlyMap.putArray(str, j(this.f40519g.getArray("value")));
        } else {
            throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
        }
    }
}
