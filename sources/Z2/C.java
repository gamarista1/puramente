package z2;

import f2.C1961B;
import i2.C2073A;
import i2.C2079d;
import j2.d;
import java.util.Collections;
import java.util.List;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final List f29075a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29076b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29077c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29078d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29079e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29080f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29081g;

    /* renamed from: h  reason: collision with root package name */
    public final int f29082h;

    /* renamed from: i  reason: collision with root package name */
    public final int f29083i;

    /* renamed from: j  reason: collision with root package name */
    public final float f29084j;

    /* renamed from: k  reason: collision with root package name */
    public final int f29085k;

    /* renamed from: l  reason: collision with root package name */
    public final String f29086l;

    private C(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, String str) {
        this.f29075a = list;
        this.f29076b = i10;
        this.f29077c = i11;
        this.f29078d = i12;
        this.f29079e = i13;
        this.f29080f = i14;
        this.f29081g = i15;
        this.f29082h = i16;
        this.f29083i = i17;
        this.f29084j = f10;
        this.f29085k = i18;
        this.f29086l = str;
    }

    public static C a(C2073A a10) {
        List singletonList;
        int i10;
        int i11;
        C2073A a11 = a10;
        try {
            a11.V(21);
            int H10 = a10.H() & 3;
            int H11 = a10.H();
            int f10 = a10.f();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < H11; i14++) {
                a11.V(1);
                int N10 = a10.N();
                for (int i15 = 0; i15 < N10; i15++) {
                    int N11 = a10.N();
                    i13 += N11 + 4;
                    a11.V(N11);
                }
            }
            a11.U(f10);
            byte[] bArr = new byte[i13];
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            float f11 = 1.0f;
            String str = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < H11) {
                int H12 = a10.H() & 63;
                int N12 = a10.N();
                int i26 = i12;
                while (i26 < N12) {
                    int N13 = a10.N();
                    byte[] bArr2 = d.f22705a;
                    int i27 = H11;
                    System.arraycopy(bArr2, i12, bArr, i25, bArr2.length);
                    int length = i25 + bArr2.length;
                    System.arraycopy(a10.e(), a10.f(), bArr, length, N13);
                    if (H12 == 33 && i26 == 0) {
                        d.a h10 = d.h(bArr, length, length + N13);
                        int i28 = h10.f22719k;
                        i17 = h10.f22720l;
                        i18 = h10.f22714f + 8;
                        i19 = h10.f22715g + 8;
                        int i29 = h10.f22723o;
                        int i30 = h10.f22724p;
                        int i31 = h10.f22725q;
                        float f12 = h10.f22721m;
                        int i32 = h10.f22722n;
                        i11 = H12;
                        i10 = N12;
                        i16 = i28;
                        str = C2079d.c(h10.f22709a, h10.f22710b, h10.f22711c, h10.f22712d, h10.f22716h, h10.f22717i);
                        int i33 = i31;
                        i21 = i30;
                        i20 = i29;
                        i23 = i32;
                        f11 = f12;
                        i22 = i33;
                    } else {
                        i11 = H12;
                        i10 = N12;
                    }
                    i25 = length + N13;
                    a11.V(N13);
                    i26++;
                    H11 = i27;
                    H12 = i11;
                    N12 = i10;
                    i12 = 0;
                }
                int i34 = H11;
                i24++;
                i12 = 0;
            }
            if (i13 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C(singletonList, H10 + 1, i16, i17, i18, i19, i20, i21, i22, f11, i23, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C1961B.a("Error parsing HEVC config", e10);
        }
    }
}
