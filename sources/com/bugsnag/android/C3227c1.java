package com.bugsnag.android;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.bugsnag.android.c1  reason: case insensitive filesystem */
public final class C3227c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C3227c1 f38676a = new C3227c1();

    /* renamed from: b  reason: collision with root package name */
    private static C3245i1 f38677b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f38678c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f38679d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f38680e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f38681f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f38682g;

    /* renamed from: h  reason: collision with root package name */
    private static Method f38683h;

    /* renamed from: i  reason: collision with root package name */
    private static Method f38684i;

    /* renamed from: j  reason: collision with root package name */
    private static Method f38685j;

    private C3227c1() {
    }

    private final Method c(String str, Class... clsArr) {
        C3245i1 i1Var = f38677b;
        if (i1Var == null) {
            return null;
        }
        return i1Var.getClass().getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public final Map a() {
        Method method = f38681f;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(f38677b, (Object[]) null);
        if (invoke != null) {
            return (Map) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
    }

    public final Map b() {
        Method method = f38682g;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(f38677b, (Object[]) null);
        if (invoke != null) {
            return (Map) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
    }

    public final void d(Map map) {
        Method method = f38683h;
        if (method != null) {
            method.invoke(f38677b, new Object[]{map});
        }
    }

    public final void e(String str) {
        Method method = f38684i;
        if (method != null) {
            method.invoke(f38677b, new Object[]{str});
        }
    }

    public final void f(boolean z10) {
        Method method = f38678c;
        if (method != null) {
            method.invoke(f38677b, new Object[]{Boolean.valueOf(z10)});
        }
    }

    public final void g(C3245i1 i1Var) {
        if (i1Var != null) {
            f38677b = i1Var;
            f38678c = c("setInternalMetricsEnabled", Boolean.TYPE);
            Class<Map> cls = Map.class;
            f38679d = c("setStaticData", cls);
            f38680e = c("getSignalUnwindStackFunction", new Class[0]);
            f38681f = c("getCurrentCallbackSetCounts", new Class[0]);
            f38682g = c("getCurrentNativeApiCallUsage", new Class[0]);
            f38683h = c("initCallbackCounts", cls);
            Class<String> cls2 = String.class;
            f38684i = c("notifyAddCallback", cls2);
            f38685j = c("notifyRemoveCallback", cls2);
        }
    }

    public final void h(Map map) {
        Method method = f38679d;
        if (method != null) {
            method.invoke(f38677b, new Object[]{map});
        }
    }
}
