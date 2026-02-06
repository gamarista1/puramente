package com.facebook.imagepipeline.memory;

import W5.a;
import W5.d;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import f7.E;
import f7.F;
import kotlin.jvm.internal.C6496s;

public class e extends a implements a {

    /* renamed from: k  reason: collision with root package name */
    private final int[] f39757k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, E e10, F f10) {
        super(dVar, e10, f10);
        C6496s.h(dVar, "memoryTrimmableRegistry");
        C6496s.h(e10, "poolParams");
        C6496s.h(f10, "poolStatsTracker");
        SparseIntArray sparseIntArray = e10.f43425c;
        if (sparseIntArray != null) {
            this.f39757k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f39757k[i10] = sparseIntArray.keyAt(i10);
            }
        } else {
            this.f39757k = new int[0];
        }
        t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public byte[] h(int i10) {
        return new byte[i10];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void l(byte[] bArr) {
        C6496s.h(bArr, "value");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int p(byte[] bArr) {
        C6496s.h(bArr, "value");
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    public int o(int i10) {
        if (i10 > 0) {
            for (int i11 : this.f39757k) {
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
