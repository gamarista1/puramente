package vc;

import android.util.SparseIntArray;

/* renamed from: vc.f  reason: case insensitive filesystem */
public abstract class C5253f {

    /* renamed from: vc.f$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f61762a;

        /* renamed from: b  reason: collision with root package name */
        int f61763b;

        /* renamed from: c  reason: collision with root package name */
        int f61764c;

        public a(int i10, int i11, int i12) {
            this.f61762a = i10;
            this.f61763b = i11;
            this.f61764c = i12;
        }

        public a a(a aVar) {
            return new a(this.f61762a - aVar.d(), this.f61763b - aVar.c(), this.f61764c - aVar.b());
        }

        public int b() {
            return this.f61764c;
        }

        public int c() {
            return this.f61763b;
        }

        public int d() {
            return this.f61762a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i11 = 0;
            i10 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            i10 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i10 += valueAt;
                }
                if (keyAt > 16) {
                    i11 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i11, i10);
    }
}
