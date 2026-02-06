package org.slf4j.helpers;

import ci.c;
import di.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f72461a;

    /* renamed from: b  reason: collision with root package name */
    private volatile c f72462b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f72463c;

    /* renamed from: d  reason: collision with root package name */
    private Method f72464d;

    /* renamed from: e  reason: collision with root package name */
    private a f72465e;

    /* renamed from: f  reason: collision with root package name */
    private Queue f72466f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f72467g;

    public i(String str, Queue queue, boolean z10) {
        this.f72461a = str;
        this.f72466f = queue;
        this.f72467g = z10;
    }

    private c h() {
        if (this.f72465e == null) {
            this.f72465e = new a(this, this.f72466f);
        }
        return this.f72465e;
    }

    public void a(String str, Throwable th2) {
        g().a(str, th2);
    }

    public boolean b() {
        return g().b();
    }

    public void c(String str, Throwable th2) {
        g().c(str, th2);
    }

    public void d(String str, Object... objArr) {
        g().d(str, objArr);
    }

    public void e(String str, Object obj) {
        g().e(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !this.f72461a.equals(((i) obj).f72461a)) {
            return false;
        }
        return true;
    }

    public void f(String str) {
        g().f(str);
    }

    public c g() {
        if (this.f72462b != null) {
            return this.f72462b;
        }
        if (this.f72467g) {
            return d.f72456a;
        }
        return h();
    }

    public String getName() {
        return this.f72461a;
    }

    public int hashCode() {
        return this.f72461a.hashCode();
    }

    public boolean i() {
        Boolean bool = this.f72463c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f72464d = this.f72462b.getClass().getMethod("log", new Class[]{di.c.class});
            this.f72463c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f72463c = Boolean.FALSE;
        }
        return this.f72463c.booleanValue();
    }

    public boolean j() {
        return this.f72462b instanceof d;
    }

    public boolean k() {
        if (this.f72462b == null) {
            return true;
        }
        return false;
    }

    public void l(di.c cVar) {
        if (i()) {
            try {
                this.f72464d.invoke(this.f72462b, new Object[]{cVar});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void m(c cVar) {
        this.f72462b = cVar;
    }

    public void warn(String str, Object... objArr) {
        g().warn(str, objArr);
    }
}
