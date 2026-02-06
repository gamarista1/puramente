package com.google.protobuf;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.protobuf.g  reason: case insensitive filesystem */
public abstract class C4869g {

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f58469d = 100;

    /* renamed from: a  reason: collision with root package name */
    int f58470a;

    /* renamed from: b  reason: collision with root package name */
    int f58471b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f58472c;

    /* renamed from: com.google.protobuf.g$b */
    private static final class b extends C4869g {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f58473e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f58474f;

        /* renamed from: g  reason: collision with root package name */
        private int f58475g;

        /* renamed from: h  reason: collision with root package name */
        private int f58476h;

        /* renamed from: i  reason: collision with root package name */
        private int f58477i;

        /* renamed from: j  reason: collision with root package name */
        private int f58478j;

        /* renamed from: k  reason: collision with root package name */
        private int f58479k;

        private void f() {
            int i10 = this.f58475g + this.f58476h;
            this.f58475g = i10;
            int i11 = i10 - this.f58478j;
            int i12 = this.f58479k;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f58476h = i13;
                this.f58475g = i10 - i13;
                return;
            }
            this.f58476h = 0;
        }

        public int d() {
            return this.f58477i - this.f58478j;
        }

        public int e(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f58479k;
                    if (d10 <= i11) {
                        this.f58479k = d10;
                        f();
                        return i11;
                    }
                    throw C4883v.d();
                }
                throw C4883v.c();
            }
            throw C4883v.b();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f58479k = a.e.API_PRIORITY_OTHER;
            this.f58473e = bArr;
            this.f58475g = i11 + i10;
            this.f58477i = i10;
            this.f58478j = i10;
            this.f58474f = z10;
        }
    }

    public static C4869g a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static C4869g b(byte[] bArr, int i10, int i11) {
        return c(bArr, i10, i11, false);
    }

    static C4869g c(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.e(i11);
            return bVar;
        } catch (C4883v e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private C4869g() {
        this.f58470a = f58469d;
        this.f58471b = a.e.API_PRIORITY_OTHER;
        this.f58472c = false;
    }
}
