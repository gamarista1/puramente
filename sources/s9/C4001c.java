package s9;

import ja.B;

/* renamed from: s9.c  reason: case insensitive filesystem */
final class C4001c implements C3999a {

    /* renamed from: a  reason: collision with root package name */
    public final int f48131a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48132b;

    /* renamed from: c  reason: collision with root package name */
    public final int f48133c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48134d;

    private C4001c(int i10, int i11, int i12, int i13) {
        this.f48131a = i10;
        this.f48132b = i11;
        this.f48133c = i12;
        this.f48134d = i13;
    }

    public static C4001c b(B b10) {
        int q10 = b10.q();
        b10.Q(8);
        int q11 = b10.q();
        int q12 = b10.q();
        b10.Q(4);
        int q13 = b10.q();
        b10.Q(12);
        return new C4001c(q10, q11, q12, q13);
    }

    public boolean a() {
        if ((this.f48132b & 16) == 16) {
            return true;
        }
        return false;
    }

    public int getType() {
        return 1751742049;
    }
}
