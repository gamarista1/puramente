package com.bumptech.glide.integration.okhttp3;

import T4.i;
import Z4.h;
import Z4.n;
import Z4.o;
import Z4.r;
import rh.C6703A;
import rh.C6708e;

public class b implements n {

    /* renamed from: a  reason: collision with root package name */
    private final C6708e.a f39063a;

    public static class a implements o {

        /* renamed from: b  reason: collision with root package name */
        private static volatile C6708e.a f39064b;

        /* renamed from: a  reason: collision with root package name */
        private final C6708e.a f39065a;

        public a() {
            this(a());
        }

        private static C6708e.a a() {
            if (f39064b == null) {
                synchronized (a.class) {
                    try {
                        if (f39064b == null) {
                            f39064b = new C6703A();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f39064b;
        }

        public n c(r rVar) {
            return new b(this.f39065a);
        }

        public void teardown() {
        }

        public a(C6708e.a aVar) {
            this.f39065a = aVar;
        }
    }

    public b(C6708e.a aVar) {
        this.f39063a = aVar;
    }

    /* renamed from: c */
    public n.a a(h hVar, int i10, int i11, i iVar) {
        return new n.a(hVar, new R4.a(this.f39063a, hVar));
    }

    /* renamed from: d */
    public boolean b(h hVar) {
        return true;
    }
}
