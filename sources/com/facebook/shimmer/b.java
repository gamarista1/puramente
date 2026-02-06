package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;

public class b {

    /* renamed from: a  reason: collision with root package name */
    final float[] f42452a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    final int[] f42453b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    final RectF f42454c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    int f42455d = 0;

    /* renamed from: e  reason: collision with root package name */
    int f42456e = -1;

    /* renamed from: f  reason: collision with root package name */
    int f42457f = 1291845631;

    /* renamed from: g  reason: collision with root package name */
    int f42458g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f42459h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f42460i = 0;

    /* renamed from: j  reason: collision with root package name */
    float f42461j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    float f42462k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    float f42463l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    float f42464m = 0.5f;

    /* renamed from: n  reason: collision with root package name */
    float f42465n = 20.0f;

    /* renamed from: o  reason: collision with root package name */
    boolean f42466o = true;

    /* renamed from: p  reason: collision with root package name */
    boolean f42467p = true;

    /* renamed from: q  reason: collision with root package name */
    boolean f42468q = true;

    /* renamed from: r  reason: collision with root package name */
    int f42469r = -1;

    /* renamed from: s  reason: collision with root package name */
    int f42470s = 1;

    /* renamed from: t  reason: collision with root package name */
    long f42471t = 1000;

    /* renamed from: u  reason: collision with root package name */
    long f42472u;

    public static class a extends C0657b {
        public a() {
            this.f42473a.f42468q = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public a d() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.b$b  reason: collision with other inner class name */
    public static abstract class C0657b {

        /* renamed from: a  reason: collision with root package name */
        final b f42473a = new b();

        private static float b(float f10, float f11, float f12) {
            return Math.min(f11, Math.max(f10, f12));
        }

        public b a() {
            this.f42473a.b();
            this.f42473a.c();
            return this.f42473a;
        }

        /* access modifiers changed from: package-private */
        public C0657b c(TypedArray typedArray) {
            if (typedArray.hasValue(a.f42435e)) {
                g(typedArray.getBoolean(a.f42435e, this.f42473a.f42466o));
            }
            if (typedArray.hasValue(a.f42432b)) {
                e(typedArray.getBoolean(a.f42432b, this.f42473a.f42467p));
            }
            if (typedArray.hasValue(a.f42433c)) {
                f(typedArray.getFloat(a.f42433c, 0.3f));
            }
            if (typedArray.hasValue(a.f42443m)) {
                n(typedArray.getFloat(a.f42443m, 1.0f));
            }
            if (typedArray.hasValue(a.f42439i)) {
                j((long) typedArray.getInt(a.f42439i, (int) this.f42473a.f42471t));
            }
            if (typedArray.hasValue(a.f42446p)) {
                p(typedArray.getInt(a.f42446p, this.f42473a.f42469r));
            }
            if (typedArray.hasValue(a.f42447q)) {
                q((long) typedArray.getInt(a.f42447q, (int) this.f42473a.f42472u));
            }
            if (typedArray.hasValue(a.f42448r)) {
                r(typedArray.getInt(a.f42448r, this.f42473a.f42470s));
            }
            if (typedArray.hasValue(a.f42437g)) {
                int i10 = typedArray.getInt(a.f42437g, this.f42473a.f42455d);
                if (i10 == 1) {
                    h(1);
                } else if (i10 == 2) {
                    h(2);
                } else if (i10 != 3) {
                    h(0);
                } else {
                    h(3);
                }
            }
            if (typedArray.hasValue(a.f42449s)) {
                if (typedArray.getInt(a.f42449s, this.f42473a.f42458g) != 1) {
                    s(0);
                } else {
                    s(1);
                }
            }
            if (typedArray.hasValue(a.f42438h)) {
                i(typedArray.getFloat(a.f42438h, this.f42473a.f42464m));
            }
            if (typedArray.hasValue(a.f42441k)) {
                l(typedArray.getDimensionPixelSize(a.f42441k, this.f42473a.f42459h));
            }
            if (typedArray.hasValue(a.f42440j)) {
                k(typedArray.getDimensionPixelSize(a.f42440j, this.f42473a.f42460i));
            }
            if (typedArray.hasValue(a.f42445o)) {
                o(typedArray.getFloat(a.f42445o, this.f42473a.f42463l));
            }
            if (typedArray.hasValue(a.f42451u)) {
                u(typedArray.getFloat(a.f42451u, this.f42473a.f42461j));
            }
            if (typedArray.hasValue(a.f42442l)) {
                m(typedArray.getFloat(a.f42442l, this.f42473a.f42462k));
            }
            if (typedArray.hasValue(a.f42450t)) {
                t(typedArray.getFloat(a.f42450t, this.f42473a.f42465n));
            }
            return d();
        }

        /* access modifiers changed from: protected */
        public abstract C0657b d();

        public C0657b e(boolean z10) {
            this.f42473a.f42467p = z10;
            return d();
        }

        public C0657b f(float f10) {
            b bVar = this.f42473a;
            bVar.f42457f = (((int) (b(0.0f, 1.0f, f10) * 255.0f)) << 24) | (bVar.f42457f & 16777215);
            return d();
        }

        public C0657b g(boolean z10) {
            this.f42473a.f42466o = z10;
            return d();
        }

        public C0657b h(int i10) {
            this.f42473a.f42455d = i10;
            return d();
        }

        public C0657b i(float f10) {
            if (f10 >= 0.0f) {
                this.f42473a.f42464m = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
        }

        public C0657b j(long j10) {
            if (j10 >= 0) {
                this.f42473a.f42471t = j10;
                return d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j10);
        }

        public C0657b k(int i10) {
            if (i10 >= 0) {
                this.f42473a.f42460i = i10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i10);
        }

        public C0657b l(int i10) {
            if (i10 >= 0) {
                this.f42473a.f42459h = i10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i10);
        }

        public C0657b m(float f10) {
            if (f10 >= 0.0f) {
                this.f42473a.f42462k = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f10);
        }

        public C0657b n(float f10) {
            b bVar = this.f42473a;
            bVar.f42456e = (((int) (b(0.0f, 1.0f, f10) * 255.0f)) << 24) | (bVar.f42456e & 16777215);
            return d();
        }

        public C0657b o(float f10) {
            if (f10 >= 0.0f) {
                this.f42473a.f42463l = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f10);
        }

        public C0657b p(int i10) {
            this.f42473a.f42469r = i10;
            return d();
        }

        public C0657b q(long j10) {
            if (j10 >= 0) {
                this.f42473a.f42472u = j10;
                return d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j10);
        }

        public C0657b r(int i10) {
            this.f42473a.f42470s = i10;
            return d();
        }

        public C0657b s(int i10) {
            this.f42473a.f42458g = i10;
            return d();
        }

        public C0657b t(float f10) {
            this.f42473a.f42465n = f10;
            return d();
        }

        public C0657b u(float f10) {
            if (f10 >= 0.0f) {
                this.f42473a.f42461j = f10;
                return d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f10);
        }
    }

    public static class c extends C0657b {
        public c() {
            this.f42473a.f42468q = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public c c(TypedArray typedArray) {
            super.c(typedArray);
            if (typedArray.hasValue(a.f42434d)) {
                x(typedArray.getColor(a.f42434d, this.f42473a.f42457f));
            }
            if (typedArray.hasValue(a.f42444n)) {
                y(typedArray.getColor(a.f42444n, this.f42473a.f42456e));
            }
            return d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public c d() {
            return this;
        }

        public c x(int i10) {
            b bVar = this.f42473a;
            bVar.f42457f = (i10 & 16777215) | (bVar.f42457f & -16777216);
            return d();
        }

        public c y(int i10) {
            this.f42473a.f42456e = i10;
            return d();
        }
    }

    b() {
    }

    /* access modifiers changed from: package-private */
    public int a(int i10) {
        int i11 = this.f42460i;
        if (i11 > 0) {
            return i11;
        }
        return Math.round(this.f42462k * ((float) i10));
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f42458g != 1) {
            int[] iArr = this.f42453b;
            int i10 = this.f42457f;
            iArr[0] = i10;
            int i11 = this.f42456e;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
            return;
        }
        int[] iArr2 = this.f42453b;
        int i12 = this.f42456e;
        iArr2[0] = i12;
        iArr2[1] = i12;
        int i13 = this.f42457f;
        iArr2[2] = i13;
        iArr2[3] = i13;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f42458g != 1) {
            this.f42452a[0] = Math.max(((1.0f - this.f42463l) - this.f42464m) / 2.0f, 0.0f);
            this.f42452a[1] = Math.max(((1.0f - this.f42463l) - 0.001f) / 2.0f, 0.0f);
            this.f42452a[2] = Math.min(((this.f42463l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f42452a[3] = Math.min(((this.f42463l + 1.0f) + this.f42464m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f42452a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f42463l, 1.0f);
        this.f42452a[2] = Math.min(this.f42463l + this.f42464m, 1.0f);
        this.f42452a[3] = 1.0f;
    }

    /* access modifiers changed from: package-private */
    public int d(int i10) {
        int i11 = this.f42459h;
        if (i11 > 0) {
            return i11;
        }
        return Math.round(this.f42461j * ((float) i10));
    }
}
