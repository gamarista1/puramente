package ka;

import ja.B;
import ja.C3649e;
import ja.x;
import java.util.Collections;
import java.util.List;
import k9.L0;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List f45979a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45980b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45981c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45982d;

    /* renamed from: e  reason: collision with root package name */
    public final float f45983e;

    /* renamed from: f  reason: collision with root package name */
    public final String f45984f;

    private f(List list, int i10, int i11, int i12, float f10, String str) {
        this.f45979a = list;
        this.f45980b = i10;
        this.f45981c = i11;
        this.f45982d = i12;
        this.f45983e = f10;
        this.f45984f = str;
    }

    public static f a(B b10) {
        List singletonList;
        int i10;
        int i11;
        B b11 = b10;
        try {
            b11.Q(21);
            int D10 = b10.D() & 3;
            int D11 = b10.D();
            int e10 = b10.e();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < D11; i14++) {
                b11.Q(1);
                int J10 = b10.J();
                for (int i15 = 0; i15 < J10; i15++) {
                    int J11 = b10.J();
                    i13 += J11 + 4;
                    b11.Q(J11);
                }
            }
            b11.P(e10);
            byte[] bArr = new byte[i13];
            int i16 = -1;
            int i17 = -1;
            float f10 = 1.0f;
            String str = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < D11) {
                int D12 = b10.D() & 127;
                int J12 = b10.J();
                int i20 = i12;
                while (i20 < J12) {
                    int J13 = b10.J();
                    byte[] bArr2 = x.f45063a;
                    int i21 = D11;
                    System.arraycopy(bArr2, i12, bArr, i19, bArr2.length);
                    int length = i19 + bArr2.length;
                    System.arraycopy(b10.d(), b10.e(), bArr, length, J13);
                    if (D12 == 33 && i20 == 0) {
                        x.a h10 = x.h(bArr, length, length + J13);
                        int i22 = h10.f45074h;
                        i17 = h10.f45075i;
                        f10 = h10.f45076j;
                        i11 = D12;
                        i10 = J12;
                        i16 = i22;
                        str = C3649e.c(h10.f45067a, h10.f45068b, h10.f45069c, h10.f45070d, h10.f45071e, h10.f45072f);
                    } else {
                        i11 = D12;
                        i10 = J12;
                    }
                    i19 = length + J13;
                    b11.Q(J13);
                    i20++;
                    D11 = i21;
                    D12 = i11;
                    J12 = i10;
                    i12 = 0;
                }
                int i23 = D11;
                i18++;
                i12 = 0;
            }
            if (i13 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new f(singletonList, D10 + 1, i16, i17, f10, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw L0.a("Error parsing HEVC config", e11);
        }
    }
}
