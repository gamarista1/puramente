package af;

import ff.C5856j;
import p003if.h;

/* renamed from: af.a  reason: case insensitive filesystem */
public final class C5728a extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;

    /* renamed from: a  reason: collision with root package name */
    private final C5856j f67035a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f67036b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread f67037c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f67038d;

    public C5728a(C5856j jVar, Throwable th2, Thread thread, boolean z10) {
        this.f67035a = (C5856j) h.c(jVar, "Mechanism is required.");
        this.f67036b = (Throwable) h.c(th2, "Throwable is required.");
        this.f67037c = (Thread) h.c(thread, "Thread is required.");
        this.f67038d = z10;
    }

    public Throwable a() {
        return this.f67036b;
    }

    public C5728a(C5856j jVar, Throwable th2, Thread thread) {
        this(jVar, th2, thread, false);
    }
}
