package Z9;

import W9.b;
import W9.g;
import W9.h;
import android.graphics.Bitmap;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import ja.B;
import ja.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final B f35981o = new B();

    /* renamed from: p  reason: collision with root package name */
    private final B f35982p = new B();

    /* renamed from: q  reason: collision with root package name */
    private final C0588a f35983q = new C0588a();

    /* renamed from: r  reason: collision with root package name */
    private Inflater f35984r;

    /* renamed from: Z9.a$a  reason: collision with other inner class name */
    private static final class C0588a {

        /* renamed from: a  reason: collision with root package name */
        private final B f35985a = new B();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f35986b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f35987c;

        /* renamed from: d  reason: collision with root package name */
        private int f35988d;

        /* renamed from: e  reason: collision with root package name */
        private int f35989e;

        /* renamed from: f  reason: collision with root package name */
        private int f35990f;

        /* renamed from: g  reason: collision with root package name */
        private int f35991g;

        /* renamed from: h  reason: collision with root package name */
        private int f35992h;

        /* renamed from: i  reason: collision with root package name */
        private int f35993i;

        /* access modifiers changed from: private */
        public void e(B b10, int i10) {
            boolean z10;
            int G10;
            if (i10 >= 4) {
                b10.Q(3);
                if ((b10.D() & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i11 = i10 - 4;
                if (z10) {
                    if (i11 >= 7 && (G10 = b10.G()) >= 4) {
                        this.f35992h = b10.J();
                        this.f35993i = b10.J();
                        this.f35985a.L(G10 - 4);
                        i11 = i10 - 11;
                    } else {
                        return;
                    }
                }
                int e10 = this.f35985a.e();
                int f10 = this.f35985a.f();
                if (e10 < f10 && i11 > 0) {
                    int min = Math.min(i11, f10 - e10);
                    b10.j(this.f35985a.d(), e10, min);
                    this.f35985a.P(e10 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(B b10, int i10) {
            if (i10 >= 19) {
                this.f35988d = b10.J();
                this.f35989e = b10.J();
                b10.Q(11);
                this.f35990f = b10.J();
                this.f35991g = b10.J();
            }
        }

        /* access modifiers changed from: private */
        public void g(B b10, int i10) {
            if (i10 % 5 == 2) {
                b10.Q(2);
                Arrays.fill(this.f35986b, 0);
                int i11 = i10 / 5;
                for (int i12 = 0; i12 < i11; i12++) {
                    int D10 = b10.D();
                    int D11 = b10.D();
                    int D12 = b10.D();
                    int D13 = b10.D();
                    double d10 = (double) D11;
                    double d11 = (double) (D12 - 128);
                    double d12 = (double) (D13 - 128);
                    this.f35986b[D10] = (M.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (b10.D() << 24) | (M.q((int) ((1.402d * d11) + d10), 0, 255) << 16) | M.q((int) (d10 + (d12 * 1.772d)), 0, 255);
                }
                this.f35987c = true;
            }
        }

        public b d() {
            int i10;
            int i11;
            int i12;
            if (this.f35988d == 0 || this.f35989e == 0 || this.f35992h == 0 || this.f35993i == 0 || this.f35985a.f() == 0 || this.f35985a.e() != this.f35985a.f() || !this.f35987c) {
                return null;
            }
            this.f35985a.P(0);
            int i13 = this.f35992h * this.f35993i;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int D10 = this.f35985a.D();
                if (D10 != 0) {
                    i12 = i14 + 1;
                    iArr[i14] = this.f35986b[D10];
                } else {
                    int D11 = this.f35985a.D();
                    if (D11 != 0) {
                        if ((D11 & 64) == 0) {
                            i10 = D11 & 63;
                        } else {
                            i10 = ((D11 & 63) << 8) | this.f35985a.D();
                        }
                        if ((D11 & 128) == 0) {
                            i11 = 0;
                        } else {
                            i11 = this.f35986b[this.f35985a.D()];
                        }
                        i12 = i10 + i14;
                        Arrays.fill(iArr, i14, i12, i11);
                    }
                }
                i14 = i12;
            }
            return new b.C0565b().f(Bitmap.createBitmap(iArr, this.f35992h, this.f35993i, Bitmap.Config.ARGB_8888)).k(((float) this.f35990f) / ((float) this.f35988d)).l(0).h(((float) this.f35991g) / ((float) this.f35989e), 0).i(0).n(((float) this.f35992h) / ((float) this.f35988d)).g(((float) this.f35993i) / ((float) this.f35989e)).a();
        }

        public void h() {
            this.f35988d = 0;
            this.f35989e = 0;
            this.f35990f = 0;
            this.f35991g = 0;
            this.f35992h = 0;
            this.f35993i = 0;
            this.f35985a.L(0);
            this.f35987c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    private void B(B b10) {
        if (b10.a() > 0 && b10.h() == 120) {
            if (this.f35984r == null) {
                this.f35984r = new Inflater();
            }
            if (M.s0(b10, this.f35982p, this.f35984r)) {
                b10.N(this.f35982p.d(), this.f35982p.f());
            }
        }
    }

    private static b C(B b10, C0588a aVar) {
        int f10 = b10.f();
        int D10 = b10.D();
        int J10 = b10.J();
        int e10 = b10.e() + J10;
        b bVar = null;
        if (e10 > f10) {
            b10.P(f10);
            return null;
        }
        if (D10 != 128) {
            switch (D10) {
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    aVar.g(b10, J10);
                    break;
                case 21:
                    aVar.e(b10, J10);
                    break;
                case 22:
                    aVar.f(b10, J10);
                    break;
            }
        } else {
            bVar = aVar.d();
            aVar.h();
        }
        b10.P(e10);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        this.f35981o.N(bArr, i10);
        B(this.f35981o);
        this.f35983q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f35981o.a() >= 3) {
            b C10 = C(this.f35981o, this.f35983q);
            if (C10 != null) {
                arrayList.add(C10);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
