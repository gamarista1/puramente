package c5;

import T4.i;
import T4.k;
import V4.v;
import W4.b;
import android.graphics.Bitmap;
import c5.s;
import java.io.IOException;
import java.io.InputStream;
import o5.d;

public class E implements k {

    /* renamed from: a  reason: collision with root package name */
    private final s f36430a;

    /* renamed from: b  reason: collision with root package name */
    private final b f36431b;

    static class a implements s.b {

        /* renamed from: a  reason: collision with root package name */
        private final C f36432a;

        /* renamed from: b  reason: collision with root package name */
        private final d f36433b;

        a(C c10, d dVar) {
            this.f36432a = c10;
            this.f36433b = dVar;
        }

        public void a() {
            this.f36432a.b();
        }

        public void b(W4.d dVar, Bitmap bitmap) {
            IOException a10 = this.f36433b.a();
            if (a10 != null) {
                if (bitmap != null) {
                    dVar.c(bitmap);
                }
                throw a10;
            }
        }
    }

    public E(s sVar, b bVar) {
        this.f36430a = sVar;
        this.f36431b = bVar;
    }

    /* renamed from: c */
    public v b(InputStream inputStream, int i10, int i11, i iVar) {
        C c10;
        boolean z10;
        if (inputStream instanceof C) {
            c10 = (C) inputStream;
            z10 = false;
        } else {
            z10 = true;
            c10 = new C(inputStream, this.f36431b);
        }
        d b10 = d.b(c10);
        try {
            return this.f36430a.f(new o5.i(b10), i10, i11, iVar, new a(c10, b10));
        } finally {
            b10.f();
            if (z10) {
                c10.f();
            }
        }
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        return this.f36430a.p(inputStream);
    }
}
