package Oh;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class c extends d {

    /* renamed from: e  reason: collision with root package name */
    private boolean f64544e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f64545f = false;

    /* renamed from: g  reason: collision with root package name */
    protected String[] f64546g;

    /* renamed from: h  reason: collision with root package name */
    private Class f64547h = null;

    public c(Object obj, e eVar, StringBuffer stringBuffer, Class cls, boolean z10, boolean z11) {
        super(obj, eVar, stringBuffer);
        o(cls);
        n(z10);
        m(z11);
    }

    public static String p(Object obj, e eVar) {
        return q(obj, eVar, false, false, (Class) null);
    }

    public static String q(Object obj, e eVar, boolean z10, boolean z11, Class cls) {
        return new c(obj, eVar, (StringBuffer) null, cls, z10, z11).toString();
    }

    /* access modifiers changed from: protected */
    public boolean f(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !k()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !j()) {
            return false;
        }
        String[] strArr = this.f64546g;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void g(Class cls) {
        if (cls.isArray()) {
            l(c());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (f(field)) {
                try {
                    a(name, i(field));
                } catch (IllegalAccessException e10) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e10.getMessage());
                }
            }
        }
    }

    public Class h() {
        return this.f64547h;
    }

    /* access modifiers changed from: protected */
    public Object i(Field field) {
        return field.get(c());
    }

    public boolean j() {
        return this.f64544e;
    }

    public boolean k() {
        return this.f64545f;
    }

    public c l(Object obj) {
        e().Y(d(), (String) null, obj);
        return this;
    }

    public void m(boolean z10) {
        this.f64544e = z10;
    }

    public void n(boolean z10) {
        this.f64545f = z10;
    }

    public void o(Class cls) {
        Object c10;
        if (cls == null || (c10 = c()) == null || cls.isInstance(c10)) {
            this.f64547h = cls;
            return;
        }
        throw new IllegalArgumentException("Specified class is not a superclass of the object");
    }

    public String toString() {
        if (c() == null) {
            return e().S();
        }
        Class cls = c().getClass();
        g(cls);
        while (cls.getSuperclass() != null && cls != h()) {
            cls = cls.getSuperclass();
            g(cls);
        }
        return super.toString();
    }
}
