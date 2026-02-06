package Xf;

import Ng.a;
import Sg.p;
import kotlin.jvm.internal.C6496s;
import ng.b;
import ng.c;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public static final H f66257a = new H();

    /* renamed from: b  reason: collision with root package name */
    public static final c f66258b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f66259c;

    /* renamed from: d  reason: collision with root package name */
    private static final b f66260d;

    /* renamed from: e  reason: collision with root package name */
    private static final b f66261e;

    static {
        c cVar = new c("kotlin.jvm.JvmField");
        f66258b = cVar;
        b.a aVar = b.f72283d;
        f66259c = aVar.c(cVar);
        f66260d = aVar.c(new c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f66261e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, (Object) null);
    }

    private H() {
    }

    public static final String b(String str) {
        C6496s.h(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return com.amazon.a.a.o.b.au + a.a(str);
    }

    public static final boolean c(String str) {
        C6496s.h(str, "name");
        if (p.J(str, com.amazon.a.a.o.b.au, false, 2, (Object) null) || p.J(str, "is", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    public static final boolean d(String str) {
        C6496s.h(str, "name");
        return p.J(str, "set", false, 2, (Object) null);
    }

    public static final String e(String str) {
        String str2;
        C6496s.h(str, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(str)) {
            str2 = str.substring(2);
            C6496s.g(str2, "substring(...)");
        } else {
            str2 = a.a(str);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static final boolean f(String str) {
        C6496s.h(str, "name");
        if (!p.J(str, "is", false, 2, (Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (C6496s.i(97, charAt) > 0 || C6496s.i(charAt, 122) > 0) {
            return true;
        }
        return false;
    }

    public final b a() {
        return f66261e;
    }
}
