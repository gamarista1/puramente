package F2;

import F2.e;
import f2.s;
import i2.C2073A;
import java.util.Collections;
import z2.C2957a;
import z2.O;

final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2129e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f2130b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2131c;

    /* renamed from: d  reason: collision with root package name */
    private int f2132d;

    public a(O o10) {
        super(o10);
    }

    /* access modifiers changed from: protected */
    public boolean b(C2073A a10) {
        String str;
        if (!this.f2130b) {
            int H10 = a10.H();
            int i10 = (H10 >> 4) & 15;
            this.f2132d = i10;
            if (i10 == 2) {
                this.f2153a.c(new s.b().o0("audio/mpeg").N(1).p0(f2129e[(H10 >> 2) & 3]).K());
                this.f2131c = true;
            } else if (i10 == 7 || i10 == 8) {
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f2153a.c(new s.b().o0(str).N(1).p0(8000).K());
                this.f2131c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f2132d);
            }
            this.f2130b = true;
        } else {
            a10.V(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(C2073A a10, long j10) {
        if (this.f2132d == 2) {
            int a11 = a10.a();
            this.f2153a.f(a10, a11);
            this.f2153a.d(j10, 1, a11, 0, (O.a) null);
            return true;
        }
        int H10 = a10.H();
        if (H10 == 0 && !this.f2131c) {
            int a12 = a10.a();
            byte[] bArr = new byte[a12];
            a10.l(bArr, 0, a12);
            C2957a.b e10 = C2957a.e(bArr);
            this.f2153a.c(new s.b().o0("audio/mp4a-latm").O(e10.f29159c).N(e10.f29158b).p0(e10.f29157a).b0(Collections.singletonList(bArr)).K());
            this.f2131c = true;
            return false;
        } else if (this.f2132d == 10 && H10 != 1) {
            return false;
        } else {
            int a13 = a10.a();
            this.f2153a.f(a10, a13);
            this.f2153a.d(j10, 1, a13, 0, (O.a) null);
            return true;
        }
    }
}
