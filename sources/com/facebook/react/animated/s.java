package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.O;

public final class s extends b {

    /* renamed from: f  reason: collision with root package name */
    private final o f40545f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f40546g;

    public s(ReadableMap readableMap, o oVar) {
        ReadableMapKeySetIterator readableMapKeySetIterator;
        C6496s.h(readableMap, "config");
        C6496s.h(oVar, "nativeAnimatedNodesManager");
        this.f40545f = oVar;
        ReadableMap map = readableMap.getMap("style");
        if (map != null) {
            readableMapKeySetIterator = map.keySetIterator();
        } else {
            readableMapKeySetIterator = null;
        }
        Map c10 = O.c();
        while (readableMapKeySetIterator != null && readableMapKeySetIterator.hasNextKey()) {
            String nextKey = readableMapKeySetIterator.nextKey();
            c10.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f40546g = O.b(c10);
    }

    public String e() {
        int i10 = this.f40448d;
        Map map = this.f40546g;
        return "StyleAnimatedNode[" + i10 + "] mPropMapping: " + map;
    }

    public final void i(JavaOnlyMap javaOnlyMap) {
        C6496s.h(javaOnlyMap, "propsMap");
        for (Map.Entry entry : this.f40546g.entrySet()) {
            String str = (String) entry.getKey();
            b k10 = this.f40545f.k(((Number) entry.getValue()).intValue());
            if (k10 == null) {
                throw new IllegalArgumentException("Mapped style node does not exist");
            } else if (k10 instanceof v) {
                ((v) k10).i(javaOnlyMap);
            } else if (k10 instanceof w) {
                w wVar = (w) k10;
                Object k11 = wVar.k();
                if (k11 instanceof Integer) {
                    javaOnlyMap.putInt(str, ((Number) k11).intValue());
                } else if (k11 instanceof String) {
                    javaOnlyMap.putString(str, (String) k11);
                } else {
                    javaOnlyMap.putDouble(str, wVar.l());
                }
            } else if (k10 instanceof f) {
                javaOnlyMap.putInt(str, ((f) k10).i());
            } else if (k10 instanceof p) {
                ((p) k10).i(str, javaOnlyMap);
            } else {
                Class<?> cls = k10.getClass();
                throw new IllegalArgumentException("Unsupported type of node used in property node " + cls);
            }
        }
    }
}
