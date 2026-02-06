package com.bugsnag.android;

import K4.g;
import com.bugsnag.android.K0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

/* renamed from: com.bugsnag.android.g1  reason: case insensitive filesystem */
public final class C3239g1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38722b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Set f38723c = Y.d(Pattern.compile(".*password.*", 2));

    /* renamed from: a  reason: collision with root package name */
    private Set f38724a = f38723c;

    /* renamed from: com.bugsnag.android.g1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void a(K0 k02, Object obj) {
        k02.f();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            g(this, Array.get(obj, i10), k02, false, 4, (Object) null);
        }
        k02.q();
    }

    private final void b(K0 k02, Collection collection) {
        k02.f();
        for (Object g10 : collection) {
            g(this, g10, k02, false, 4, (Object) null);
        }
        k02.q();
    }

    private final boolean d(String str) {
        Iterable<Pattern> iterable = this.f38724a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Pattern matcher : iterable) {
            if (matcher.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private final void e(K0 k02, Map map, boolean z10) {
        k02.n();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                String str = (String) key;
                k02.y(str);
                if (!z10 || !d(str)) {
                    f(entry.getValue(), k02, z10);
                } else {
                    k02.j0("[REDACTED]");
                }
            }
        }
        k02.t();
    }

    public static /* synthetic */ void g(C3239g1 g1Var, Object obj, K0 k02, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        g1Var.f(obj, k02, z10);
    }

    public final Set c() {
        return this.f38724a;
    }

    public final void f(Object obj, K0 k02, boolean z10) {
        if (obj == null) {
            k02.F();
        } else if (obj instanceof String) {
            k02.j0((String) obj);
        } else if (obj instanceof Number) {
            k02.h0((Number) obj);
        } else if (obj instanceof Boolean) {
            k02.o0(((Boolean) obj).booleanValue());
        } else if (obj instanceof K0.a) {
            ((K0.a) obj).toStream(k02);
        } else if (obj instanceof Date) {
            k02.j0(g.c((Date) obj));
        } else if (obj instanceof Map) {
            e(k02, (Map) obj, z10);
        } else if (obj instanceof Collection) {
            b(k02, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            a(k02, obj);
        } else {
            k02.j0("[OBJECT]");
        }
    }

    public final void h(Set set) {
        this.f38724a = set;
    }
}
