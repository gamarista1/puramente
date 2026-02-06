package Zg;

import qf.g;

/* renamed from: Zg.j  reason: case insensitive filesystem */
public final class C5721j extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient g f66975a;

    public C5721j(g gVar) {
        this.f66975a = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f66975a.toString();
    }
}
