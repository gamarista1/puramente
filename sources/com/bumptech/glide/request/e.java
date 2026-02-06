package com.bumptech.glide.request;

public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f39166a;

        private a(boolean z10) {
            this.f39166a = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f39166a;
        }
    }

    boolean a(d dVar);

    boolean b();

    boolean c(d dVar);

    void d(d dVar);

    void f(d dVar);

    e getRoot();

    boolean j(d dVar);
}
