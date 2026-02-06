package z2;

import i2.C2073A;

/* renamed from: z2.n  reason: case insensitive filesystem */
public final class C2970n {

    /* renamed from: a  reason: collision with root package name */
    public final int f29257a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29258b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29259c;

    private C2970n(int i10, int i11, String str) {
        this.f29257a = i10;
        this.f29258b = i11;
        this.f29259c = str;
    }

    public static C2970n a(C2073A a10) {
        String str;
        a10.V(2);
        int H10 = a10.H();
        int i10 = H10 >> 1;
        int H11 = ((a10.H() >> 3) & 31) | ((H10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (H11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(H11);
        return new C2970n(i10, H11, sb2.toString());
    }
}
