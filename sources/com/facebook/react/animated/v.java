package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class v extends b {

    /* renamed from: f  reason: collision with root package name */
    private final o f40554f;

    /* renamed from: g  reason: collision with root package name */
    private final List f40555g;

    private final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private int f40556c;

        public a() {
            super();
        }

        public final int c() {
            return this.f40556c;
        }

        public final void d(int i10) {
            this.f40556c = i10;
        }
    }

    private final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private double f40558c;

        public b() {
            super();
        }

        public final double c() {
            return this.f40558c;
        }

        public final void d(double d10) {
            this.f40558c = d10;
        }
    }

    private class c {

        /* renamed from: a  reason: collision with root package name */
        private String f40560a;

        public c() {
        }

        public final String a() {
            return this.f40560a;
        }

        public final void b(String str) {
            this.f40560a = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.facebook.react.animated.v$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.facebook.react.animated.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.facebook.react.animated.v$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.facebook.react.animated.v$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(com.facebook.react.bridge.ReadableMap r7, com.facebook.react.animated.o r8) {
        /*
            r6 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "nativeAnimatedNodesManager"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r6.<init>()
            r6.f40554f = r8
            java.lang.String r8 = "transforms"
            com.facebook.react.bridge.ReadableArray r7 = r7.getArray(r8)
            if (r7 != 0) goto L_0x001c
            java.util.List r7 = mf.C6565s.n()
            goto L_0x0074
        L_0x001c:
            int r8 = r7.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r1 = 0
        L_0x0026:
            if (r1 >= r8) goto L_0x0073
            com.facebook.react.bridge.ReadableMap r2 = r7.getMap(r1)
            if (r2 == 0) goto L_0x006b
            java.lang.String r3 = "property"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)
            java.lang.String r5 = "animated"
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)
            if (r4 == 0) goto L_0x0054
            com.facebook.react.animated.v$a r4 = new com.facebook.react.animated.v$a
            r4.<init>()
            r4.b(r3)
            java.lang.String r3 = "nodeTag"
            int r2 = r2.getInt(r3)
            r4.d(r2)
            goto L_0x0065
        L_0x0054:
            com.facebook.react.animated.v$b r4 = new com.facebook.react.animated.v$b
            r4.<init>()
            r4.b(r3)
            java.lang.String r3 = "value"
            double r2 = r2.getDouble(r3)
            r4.d(r2)
        L_0x0065:
            r0.add(r4)
            int r1 = r1 + 1
            goto L_0x0026
        L_0x006b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L_0x0073:
            r7 = r0
        L_0x0074:
            r6.f40555g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.v.<init>(com.facebook.react.bridge.ReadableMap, com.facebook.react.animated.o):void");
    }

    public String e() {
        int i10 = this.f40448d;
        List list = this.f40555g;
        return "TransformAnimatedNode[" + i10 + "]: transformConfigs: " + list;
    }

    public final void i(JavaOnlyMap javaOnlyMap) {
        double d10;
        C6496s.h(javaOnlyMap, "propsMap");
        int size = this.f40555g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f40555g.get(i10);
            if (cVar instanceof a) {
                b k10 = this.f40554f.k(((a) cVar).c());
                if (k10 == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                } else if (k10 instanceof w) {
                    d10 = ((w) k10).l();
                } else {
                    Class<?> cls = k10.getClass();
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + cls);
                }
            } else {
                C6496s.f(cVar, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                d10 = ((b) cVar).c();
            }
            arrayList.add(JavaOnlyMap.Companion.of(cVar.a(), Double.valueOf(d10)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.Companion.from(arrayList));
    }
}
