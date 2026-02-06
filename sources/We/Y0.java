package We;

import java.lang.reflect.InvocationTargetException;
import p003if.g;
import p003if.i;

public abstract class Y0 {
    public static C5610C a(g gVar, C5654u uVar) {
        Class b10;
        if (i.b() && gVar.a("io.sentry.opentelemetry.OtelSpanFactory", uVar) && (b10 = gVar.b("io.sentry.opentelemetry.OtelSpanFactory", uVar)) != null) {
            try {
                Object newInstance = b10.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                if (newInstance != null && (newInstance instanceof C5610C)) {
                    return (C5610C) newInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C5629h();
    }
}
