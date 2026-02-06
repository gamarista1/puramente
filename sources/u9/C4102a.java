package u9;

import ja.B;
import java.util.Collections;
import k9.C3717q0;
import m9.C3843a;
import q9.C3962B;
import u9.e;

/* renamed from: u9.a  reason: case insensitive filesystem */
final class C4102a extends e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f48668e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f48669b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48670c;

    /* renamed from: d  reason: collision with root package name */
    private int f48671d;

    public C4102a(C3962B b10) {
        super(b10);
    }

    /* access modifiers changed from: protected */
    public boolean b(B b10) {
        String str;
        if (!this.f48669b) {
            int D10 = b10.D();
            int i10 = (D10 >> 4) & 15;
            this.f48671d = i10;
            if (i10 == 2) {
                this.f48692a.c(new C3717q0.b().e0("audio/mpeg").H(1).f0(f48668e[(D10 >> 2) & 3]).E());
                this.f48670c = true;
            } else if (i10 == 7 || i10 == 8) {
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f48692a.c(new C3717q0.b().e0(str).H(1).f0(8000).E());
                this.f48670c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f48671d);
            }
            this.f48669b = true;
        } else {
            b10.Q(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(B b10, long j10) {
        if (this.f48671d == 2) {
            int a10 = b10.a();
            this.f48692a.d(b10, a10);
            this.f48692a.f(j10, 1, a10, 0, (C3962B.a) null);
            return true;
        }
        int D10 = b10.D();
        if (D10 == 0 && !this.f48670c) {
            int a11 = b10.a();
            byte[] bArr = new byte[a11];
            b10.j(bArr, 0, a11);
            C3843a.b f10 = C3843a.f(bArr);
            this.f48692a.c(new C3717q0.b().e0("audio/mp4a-latm").I(f10.f46612c).H(f10.f46611b).f0(f10.f46610a).T(Collections.singletonList(bArr)).E());
            this.f48670c = true;
            return false;
        } else if (this.f48671d == 10 && D10 != 1) {
            return false;
        } else {
            int a12 = b10.a();
            this.f48692a.d(b10, a12);
            this.f48692a.f(j10, 1, a12, 0, (C3962B.a) null);
            return true;
        }
    }
}
