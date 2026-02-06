package com.amazon.a.b;

import com.amazon.a.a.n.a;
import com.amazon.a.a.o.c;
import com.amazon.a.a.o.d;
import java.lang.reflect.Method;

public class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37620a = new c("DRMSuccessTask");

    /* renamed from: b  reason: collision with root package name */
    private static final String f37621b = "com.amazon.drm.AmazonLicenseVerificationCallback";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37622c = "onDRMSuccess";

    public void a() {
        Method a10;
        Class<?> a11 = d.a(f37621b);
        if (a11 != null && (a10 = a(a11, f37622c)) != null) {
            if (c.f37534a) {
                c cVar = f37620a;
                cVar.a("Invoking callback: " + a10.getName());
            }
            try {
                a10.invoke((Object) null, (Object[]) null);
                if (c.f37534a) {
                    f37620a.a("Callback invoked.");
                }
            } catch (Exception unused) {
            }
        }
    }

    private static Method a(Class<?> cls, String str) {
        com.amazon.a.a.o.a.a.a((Object) cls, "Class<?> target");
        com.amazon.a.a.o.a.a.a((Object) str, "String methodName");
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) null);
            if (declaredMethod == null) {
                if (c.f37534a) {
                    c cVar = f37620a;
                    cVar.a("No exception thrown, but method '" + str + "' was not found, this should not happen. ");
                }
                return null;
            }
            declaredMethod.setAccessible(true);
            if (!d.c(declaredMethod)) {
                if (c.f37534a) {
                    c cVar2 = f37620a;
                    cVar2.a("Callback " + str + " isn't static, ignoring...");
                }
                return null;
            } else if (!d.b(declaredMethod)) {
                if (c.f37534a) {
                    c cVar3 = f37620a;
                    cVar3.a("Callback " + str + " returns a value, ignoring...");
                }
                return null;
            } else if (!d.a(declaredMethod)) {
                return declaredMethod;
            } else {
                if (c.f37534a) {
                    c cVar4 = f37620a;
                    cVar4.a("Callback " + str + " takes parameters, ignoring...");
                }
                return null;
            }
        } catch (NoSuchMethodException unused) {
            if (c.f37534a) {
                c cVar5 = f37620a;
                cVar5.a("Did not find method " + str);
            }
            return null;
        }
    }
}
