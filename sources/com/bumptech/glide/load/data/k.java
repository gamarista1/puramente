package com.bumptech.glide.load.data;

import W4.b;
import c5.C;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C f39144a;

    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final b f39145a;

        public a(b bVar) {
            this.f39145a = bVar;
        }

        public Class a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f39145a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        C c10 = new C(inputStream, bVar);
        this.f39144a = c10;
        c10.mark(5242880);
    }

    public void b() {
        this.f39144a.f();
    }

    public void c() {
        this.f39144a.b();
    }

    /* renamed from: d */
    public InputStream a() {
        this.f39144a.reset();
        return this.f39144a;
    }
}
