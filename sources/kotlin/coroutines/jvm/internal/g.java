package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C6496s;

public abstract class g {
    private static final void a(int i10, int i11) {
        if (i11 > i10) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        Integer num;
        int i10;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            return i10 - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        int i10;
        String str;
        C6496s.h(aVar, "<this>");
        f b10 = b(aVar);
        if (b10 == null) {
            return null;
        }
        a(1, b10.v());
        int c10 = c(aVar);
        if (c10 < 0) {
            i10 = -1;
        } else {
            i10 = b10.l()[c10];
        }
        String b11 = i.f71745a.b(aVar);
        if (b11 == null) {
            str = b10.c();
        } else {
            str = b11 + '/' + b10.c();
        }
        return new StackTraceElement(str, b10.m(), b10.f(), i10);
    }
}
