package Zg;

import Rg.k;
import Ug.H;
import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: Zg.h  reason: case insensitive filesystem */
public abstract class C5719h {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection f66974a;

    static {
        Class<H> cls = H.class;
        f66974a = k.G(k.c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final Collection a() {
        return f66974a;
    }

    public static final void b(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
