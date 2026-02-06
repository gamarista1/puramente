package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class zzce implements InvocationHandler {
    private final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        int i10;
        if (C6496s.c(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (C6496s.c(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (C6496s.c(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (!(objArr == null || objArr.length == 0)) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    i10 = obj3.hashCode();
                } else {
                    i10 = 0;
                }
                if (i10 == obj.hashCode()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        } else if (!zza(obj, method, objArr)) {
            return C6514M.f71813a;
        } else {
            if ((this.zza != null || !C6496s.c(method.getReturnType(), Void.TYPE)) && ((obj2 = this.zza) == null || !C6496s.c(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
                throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
            }
            Object obj4 = this.zza;
            if (obj4 == null) {
                return C6514M.f71813a;
            }
            return obj4;
        }
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
