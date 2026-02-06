package com.amazon.a.a.k;

import com.amazon.a.a.o.a.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final com.amazon.a.a.o.c f37269a = new com.amazon.a.a.o.c("ResourceManagerImpl");

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f37270b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f37271c = false;

    public c() {
        a((Object) this);
    }

    private boolean c(Object obj) {
        a.a(obj, "resource");
        if (a(obj.getClass()) != null) {
            return true;
        }
        return false;
    }

    private boolean d(Object obj) {
        return obj.getClass().getName().startsWith("com.amazon.");
    }

    public void a(Object obj) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37269a;
            cVar.a("Registering resource: " + obj);
        }
        a.a();
        if (!this.f37271c) {
            boolean c10 = c(obj);
            a.b(c10, "Resource already registered: " + obj);
            this.f37270b.add(obj);
            return;
        }
        throw new IllegalStateException("Attempt made to register resource after population has begun!");
    }

    public void b(Object obj) {
        a.a(obj, "target");
        if (com.amazon.a.a.o.c.f37534a) {
            f37269a.a("Populating: " + obj);
        }
        if (!d(obj)) {
            f37269a.a("Ignoring: " + obj + ", not a kiwi class");
            return;
        }
        for (Class cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (a(field)) {
                    a(obj, field);
                }
            }
        }
        if (obj instanceof d) {
            ((d) obj).e();
        }
    }

    private Object a(Class<?> cls) {
        for (Object next : this.f37270b) {
            if (cls.isAssignableFrom(next.getClass())) {
                return next;
            }
        }
        return null;
    }

    private boolean a(Field field) {
        return field.getAnnotation(a.class) != null;
    }

    private void a(Object obj, Field field) {
        Class<?> type = field.getType();
        Object a10 = a(type);
        a.b(a10, "no resource found for type: " + type);
        field.setAccessible(true);
        try {
            field.set(obj, a10);
        } catch (Exception e10) {
            a.a("Failed to populate field: " + field, (Throwable) e10);
        }
    }

    public void a() {
        for (Object b10 : this.f37270b) {
            b(b10);
        }
    }
}
