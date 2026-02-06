package ka;

import ja.B;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f45962a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45963b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45964c;

    private d(int i10, int i11, String str) {
        this.f45962a = i10;
        this.f45963b = i11;
        this.f45964c = str;
    }

    public static d a(B b10) {
        String str;
        b10.Q(2);
        int D10 = b10.D();
        int i10 = D10 >> 1;
        int D11 = ((b10.D() >> 3) & 31) | ((D10 & 1) << 5);
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
        if (D11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(D11);
        return new d(i10, D11, sb2.toString());
    }
}
