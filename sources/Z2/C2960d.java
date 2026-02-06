package z2;

import f2.C1961B;
import i2.C2073A;
import i2.C2079d;
import j2.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z2.d  reason: case insensitive filesystem */
public final class C2960d {

    /* renamed from: a  reason: collision with root package name */
    public final List f29179a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29180b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29181c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29182d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29183e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29184f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29185g;

    /* renamed from: h  reason: collision with root package name */
    public final int f29186h;

    /* renamed from: i  reason: collision with root package name */
    public final int f29187i;

    /* renamed from: j  reason: collision with root package name */
    public final int f29188j;

    /* renamed from: k  reason: collision with root package name */
    public final float f29189k;

    /* renamed from: l  reason: collision with root package name */
    public final String f29190l;

    private C2960d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f29179a = list;
        this.f29180b = i10;
        this.f29181c = i11;
        this.f29182d = i12;
        this.f29183e = i13;
        this.f29184f = i14;
        this.f29185g = i15;
        this.f29186h = i16;
        this.f29187i = i17;
        this.f29188j = i18;
        this.f29189k = f10;
        this.f29190l = str;
    }

    private static byte[] a(C2073A a10) {
        int N10 = a10.N();
        int f10 = a10.f();
        a10.V(N10);
        return C2079d.d(a10.e(), f10, N10);
    }

    public static C2960d b(C2073A a10) {
        String str;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        try {
            a10.V(4);
            int H10 = (a10.H() & 3) + 1;
            if (H10 != 3) {
                ArrayList arrayList = new ArrayList();
                int H11 = a10.H() & 31;
                for (int i18 = 0; i18 < H11; i18++) {
                    arrayList.add(a(a10));
                }
                int H12 = a10.H();
                for (int i19 = 0; i19 < H12; i19++) {
                    arrayList.add(a(a10));
                }
                if (H11 > 0) {
                    d.c l10 = d.l((byte[]) arrayList.get(0), H10, ((byte[]) arrayList.get(0)).length);
                    int i20 = l10.f22734f;
                    int i21 = l10.f22735g;
                    int i22 = l10.f22745q;
                    int i23 = l10.f22746r;
                    int i24 = l10.f22747s;
                    int i25 = l10.f22748t;
                    float f11 = l10.f22736h;
                    str = C2079d.a(l10.f22729a, l10.f22730b, l10.f22731c);
                    i11 = i24;
                    i10 = i25;
                    f10 = f11;
                    i14 = l10.f22738j + 8;
                    i13 = i22;
                    i12 = i23;
                    i17 = i20;
                    i16 = i21;
                    i15 = l10.f22737i + 8;
                } else {
                    i17 = -1;
                    i16 = -1;
                    i15 = -1;
                    i14 = -1;
                    i13 = -1;
                    i12 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                    str = null;
                    i10 = 16;
                }
                return new C2960d(arrayList, H10, i17, i16, i15, i14, i13, i12, i11, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C1961B.a("Error parsing AVC config", e10);
        }
    }
}
