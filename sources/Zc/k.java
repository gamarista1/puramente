package Zc;

import Tc.b;

public class k {

    /* renamed from: i  reason: collision with root package name */
    static final k[] f53560i;

    /* renamed from: j  reason: collision with root package name */
    private static k[] f53561j;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f53562a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53563b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53564c;

    /* renamed from: d  reason: collision with root package name */
    public final int f53565d;

    /* renamed from: e  reason: collision with root package name */
    public final int f53566e;

    /* renamed from: f  reason: collision with root package name */
    private final int f53567f;

    /* renamed from: g  reason: collision with root package name */
    private final int f53568g;

    /* renamed from: h  reason: collision with root package name */
    private final int f53569h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f53560i = kVarArr;
        f53561j = kVarArr;
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    private int e() {
        int i10 = this.f53567f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (!(i10 == 2 || i10 == 4)) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    private int k() {
        int i10 = this.f53567f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static k l(int i10, l lVar, b bVar, b bVar2, boolean z10) {
        for (k kVar : f53561j) {
            if ((lVar != l.FORCE_SQUARE || !kVar.f53562a) && ((lVar != l.FORCE_RECTANGLE || kVar.f53562a) && i10 <= kVar.f53563b)) {
                return kVar;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public final int a() {
        return this.f53563b;
    }

    public int b(int i10) {
        return this.f53568g;
    }

    public final int c() {
        return this.f53564c;
    }

    public final int d(int i10) {
        return this.f53569h;
    }

    public int f() {
        return this.f53563b / this.f53568g;
    }

    public final int g() {
        return k() * this.f53566e;
    }

    public final int h() {
        return e() * this.f53565d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f53562a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        sb2.append(this.f53565d);
        sb2.append('x');
        sb2.append(this.f53566e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f53563b);
        sb2.append('+');
        sb2.append(this.f53564c);
        return sb2.toString();
    }

    k(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f53562a = z10;
        this.f53563b = i10;
        this.f53564c = i11;
        this.f53565d = i12;
        this.f53566e = i13;
        this.f53567f = i14;
        this.f53568g = i15;
        this.f53569h = i16;
    }
}
