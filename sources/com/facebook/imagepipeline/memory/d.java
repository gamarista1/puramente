package com.facebook.imagepipeline.memory;

import T5.k;
import X5.h;
import f7.E;
import f7.F;
import f7.z;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final h f39754a;

    /* renamed from: b  reason: collision with root package name */
    final b f39755b;

    class a implements h {
        a() {
        }

        /* renamed from: b */
        public void a(byte[] bArr) {
            d.this.b(bArr);
        }
    }

    static class b extends e {
        public b(W5.d dVar, E e10, F f10) {
            super(dVar, e10, f10);
        }

        /* access modifiers changed from: package-private */
        public b y(int i10) {
            return new h(q(i10), this.f39739c.f43429g, 0);
        }
    }

    public d(W5.d dVar, E e10) {
        boolean z10;
        if (e10.f43429g > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        this.f39755b = new b(dVar, e10, z.h());
        this.f39754a = new a();
    }

    public X5.a a(int i10) {
        return X5.a.g0((byte[]) this.f39755b.get(i10), this.f39754a);
    }

    public void b(byte[] bArr) {
        this.f39755b.a(bArr);
    }
}
