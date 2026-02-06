package com.facebook.imagepipeline.memory;

import T5.k;
import W5.d;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import f7.E;
import f7.F;
import f7.v;

public abstract class f extends a {

    /* renamed from: k  reason: collision with root package name */
    private final int[] f39758k;

    f(d dVar, E e10, F f10) {
        super(dVar, e10, f10);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(e10.f43425c);
        this.f39758k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f39758k;
            if (i10 < iArr.length) {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            } else {
                t();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void l(v vVar) {
        k.g(vVar);
        vVar.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public int p(v vVar) {
        k.g(vVar);
        return vVar.getSize();
    }

    /* access modifiers changed from: package-private */
    public int D() {
        return this.f39758k[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean v(v vVar) {
        k.g(vVar);
        return !vVar.isClosed();
    }

    /* access modifiers changed from: protected */
    public int o(int i10) {
        if (i10 > 0) {
            for (int i11 : this.f39758k) {
                if (i11 >= i10) {
                    return i11;
                }
            }
            return i10;
        }
        throw new a.b(Integer.valueOf(i10));
    }

    /* access modifiers changed from: protected */
    public int q(int i10) {
        return i10;
    }
}
