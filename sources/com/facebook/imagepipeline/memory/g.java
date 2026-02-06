package com.facebook.imagepipeline.memory;

import W5.k;
import f7.v;
import f7.x;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g extends k {

    /* renamed from: a  reason: collision with root package name */
    private final f f39759a;

    /* renamed from: b  reason: collision with root package name */
    private X5.a f39760b;

    /* renamed from: c  reason: collision with root package name */
    private int f39761c;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? fVar.D() : i10);
    }

    private final void b() {
        if (!X5.a.T(this.f39760b)) {
            throw new a();
        }
    }

    public void close() {
        X5.a.E(this.f39760b);
        this.f39760b = null;
        this.f39761c = -1;
        super.close();
    }

    public final void f(int i10) {
        b();
        X5.a aVar = this.f39760b;
        if (aVar != null) {
            C6496s.e(aVar);
            if (i10 > ((v) aVar.I()).getSize()) {
                Object obj = this.f39759a.get(i10);
                C6496s.g(obj, "get(...)");
                v vVar = (v) obj;
                X5.a aVar2 = this.f39760b;
                if (aVar2 != null) {
                    C6496s.e(aVar2);
                    ((v) aVar2.I()).f(0, vVar, 0, this.f39761c);
                    X5.a aVar3 = this.f39760b;
                    C6496s.e(aVar3);
                    aVar3.close();
                    this.f39760b = X5.a.g0(vVar, this.f39759a);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: n */
    public x a() {
        b();
        X5.a aVar = this.f39760b;
        if (aVar != null) {
            return new x(aVar, this.f39761c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public int size() {
        return this.f39761c;
    }

    public void write(int i10) {
        write(new byte[]{(byte) i10});
    }

    public g(f fVar, int i10) {
        C6496s.h(fVar, "pool");
        if (i10 > 0) {
            this.f39759a = fVar;
            this.f39761c = 0;
            this.f39760b = X5.a.g0(fVar.get(i10), fVar);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public void write(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "buffer");
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
        }
        b();
        f(this.f39761c + i11);
        X5.a aVar = this.f39760b;
        if (aVar != null) {
            ((v) aVar.I()).b(this.f39761c, bArr, i10, i11);
            this.f39761c += i11;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
