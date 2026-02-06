package Z2;

import W2.e;
import W2.s;
import android.graphics.Bitmap;
import h2.C2030a;
import i2.C2073A;
import i2.C2082g;
import i2.L;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f10392a = new C2073A();

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f10393b = new C2073A();

    /* renamed from: c  reason: collision with root package name */
    private final C0193a f10394c = new C0193a();

    /* renamed from: d  reason: collision with root package name */
    private Inflater f10395d;

    /* renamed from: Z2.a$a  reason: collision with other inner class name */
    private static final class C0193a {

        /* renamed from: a  reason: collision with root package name */
        private final C2073A f10396a = new C2073A();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f10397b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f10398c;

        /* renamed from: d  reason: collision with root package name */
        private int f10399d;

        /* renamed from: e  reason: collision with root package name */
        private int f10400e;

        /* renamed from: f  reason: collision with root package name */
        private int f10401f;

        /* renamed from: g  reason: collision with root package name */
        private int f10402g;

        /* renamed from: h  reason: collision with root package name */
        private int f10403h;

        /* renamed from: i  reason: collision with root package name */
        private int f10404i;

        /* access modifiers changed from: private */
        public void e(C2073A a10, int i10) {
            boolean z10;
            int K10;
            if (i10 >= 4) {
                a10.V(3);
                if ((a10.H() & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i11 = i10 - 4;
                if (z10) {
                    if (i11 >= 7 && (K10 = a10.K()) >= 4) {
                        this.f10403h = a10.N();
                        this.f10404i = a10.N();
                        this.f10396a.Q(K10 - 4);
                        i11 = i10 - 11;
                    } else {
                        return;
                    }
                }
                int f10 = this.f10396a.f();
                int g10 = this.f10396a.g();
                if (f10 < g10 && i11 > 0) {
                    int min = Math.min(i11, g10 - f10);
                    a10.l(this.f10396a.e(), f10, min);
                    this.f10396a.U(f10 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(C2073A a10, int i10) {
            if (i10 >= 19) {
                this.f10399d = a10.N();
                this.f10400e = a10.N();
                a10.V(11);
                this.f10401f = a10.N();
                this.f10402g = a10.N();
            }
        }

        /* access modifiers changed from: private */
        public void g(C2073A a10, int i10) {
            if (i10 % 5 == 2) {
                a10.V(2);
                Arrays.fill(this.f10397b, 0);
                int i11 = i10 / 5;
                for (int i12 = 0; i12 < i11; i12++) {
                    int H10 = a10.H();
                    int H11 = a10.H();
                    int H12 = a10.H();
                    int H13 = a10.H();
                    double d10 = (double) H11;
                    double d11 = (double) (H12 - 128);
                    double d12 = (double) (H13 - 128);
                    this.f10397b[H10] = (L.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (a10.H() << 24) | (L.o((int) ((1.402d * d11) + d10), 0, 255) << 16) | L.o((int) (d10 + (d12 * 1.772d)), 0, 255);
                }
                this.f10398c = true;
            }
        }

        public C2030a d() {
            int i10;
            int i11;
            int i12;
            if (this.f10399d == 0 || this.f10400e == 0 || this.f10403h == 0 || this.f10404i == 0 || this.f10396a.g() == 0 || this.f10396a.f() != this.f10396a.g() || !this.f10398c) {
                return null;
            }
            this.f10396a.U(0);
            int i13 = this.f10403h * this.f10404i;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int H10 = this.f10396a.H();
                if (H10 != 0) {
                    i12 = i14 + 1;
                    iArr[i14] = this.f10397b[H10];
                } else {
                    int H11 = this.f10396a.H();
                    if (H11 != 0) {
                        if ((H11 & 64) == 0) {
                            i10 = H11 & 63;
                        } else {
                            i10 = ((H11 & 63) << 8) | this.f10396a.H();
                        }
                        if ((H11 & 128) == 0) {
                            i11 = this.f10397b[0];
                        } else {
                            i11 = this.f10397b[this.f10396a.H()];
                        }
                        i12 = i10 + i14;
                        Arrays.fill(iArr, i14, i12, i11);
                    }
                }
                i14 = i12;
            }
            return new C2030a.b().f(Bitmap.createBitmap(iArr, this.f10403h, this.f10404i, Bitmap.Config.ARGB_8888)).k(((float) this.f10401f) / ((float) this.f10399d)).l(0).h(((float) this.f10402g) / ((float) this.f10400e), 0).i(0).n(((float) this.f10403h) / ((float) this.f10399d)).g(((float) this.f10404i) / ((float) this.f10400e)).a();
        }

        public void h() {
            this.f10399d = 0;
            this.f10400e = 0;
            this.f10401f = 0;
            this.f10402g = 0;
            this.f10403h = 0;
            this.f10404i = 0;
            this.f10396a.Q(0);
            this.f10398c = false;
        }
    }

    private void d(C2073A a10) {
        if (a10.a() > 0 && a10.j() == 120) {
            if (this.f10395d == null) {
                this.f10395d = new Inflater();
            }
            if (L.x0(a10, this.f10393b, this.f10395d)) {
                a10.S(this.f10393b.e(), this.f10393b.g());
            }
        }
    }

    private static C2030a e(C2073A a10, C0193a aVar) {
        int g10 = a10.g();
        int H10 = a10.H();
        int N10 = a10.N();
        int f10 = a10.f() + N10;
        C2030a aVar2 = null;
        if (f10 > g10) {
            a10.U(g10);
            return null;
        }
        if (H10 != 128) {
            switch (H10) {
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    aVar.g(a10, N10);
                    break;
                case 21:
                    aVar.e(a10, N10);
                    break;
                case 22:
                    aVar.f(a10, N10);
                    break;
            }
        } else {
            aVar2 = aVar.d();
            aVar.h();
        }
        a10.U(f10);
        return aVar2;
    }

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        this.f10392a.S(bArr, i11 + i10);
        this.f10392a.U(i10);
        d(this.f10392a);
        this.f10394c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f10392a.a() >= 3) {
            C2030a e10 = e(this.f10392a, this.f10394c);
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        gVar.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public int c() {
        return 2;
    }
}
