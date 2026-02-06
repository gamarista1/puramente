package ka;

import ja.B;
import ja.C3649e;
import ja.x;
import java.util.ArrayList;
import java.util.List;
import k9.L0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List f45950a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45951b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45952c;

    /* renamed from: d  reason: collision with root package name */
    public final int f45953d;

    /* renamed from: e  reason: collision with root package name */
    public final float f45954e;

    /* renamed from: f  reason: collision with root package name */
    public final String f45955f;

    private a(List list, int i10, int i11, int i12, float f10, String str) {
        this.f45950a = list;
        this.f45951b = i10;
        this.f45952c = i11;
        this.f45953d = i12;
        this.f45954e = f10;
        this.f45955f = str;
    }

    private static byte[] a(B b10) {
        int J10 = b10.J();
        int e10 = b10.e();
        b10.Q(J10);
        return C3649e.d(b10.d(), e10, J10);
    }

    public static a b(B b10) {
        String str;
        float f10;
        int i10;
        int i11;
        try {
            b10.Q(4);
            int D10 = (b10.D() & 3) + 1;
            if (D10 != 3) {
                ArrayList arrayList = new ArrayList();
                int D11 = b10.D() & 31;
                for (int i12 = 0; i12 < D11; i12++) {
                    arrayList.add(a(b10));
                }
                int D12 = b10.D();
                for (int i13 = 0; i13 < D12; i13++) {
                    arrayList.add(a(b10));
                }
                if (D11 > 0) {
                    x.c l10 = x.l((byte[]) arrayList.get(0), D10, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f45085f;
                    int i15 = l10.f45086g;
                    float f11 = l10.f45087h;
                    str = C3649e.a(l10.f45080a, l10.f45081b, l10.f45082c);
                    i11 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    i11 = -1;
                    i10 = -1;
                    f10 = 1.0f;
                    str = null;
                }
                return new a(arrayList, D10, i11, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw L0.a("Error parsing AVC config", e10);
        }
    }
}
