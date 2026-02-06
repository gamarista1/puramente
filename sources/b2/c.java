package B2;

import i2.C2073A;

final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f798a;

    /* renamed from: b  reason: collision with root package name */
    public final int f799b;

    /* renamed from: c  reason: collision with root package name */
    public final int f800c;

    /* renamed from: d  reason: collision with root package name */
    public final int f801d;

    private c(int i10, int i11, int i12, int i13) {
        this.f798a = i10;
        this.f799b = i11;
        this.f800c = i12;
        this.f801d = i13;
    }

    public static c b(C2073A a10) {
        int u10 = a10.u();
        a10.V(8);
        int u11 = a10.u();
        int u12 = a10.u();
        a10.V(4);
        int u13 = a10.u();
        a10.V(12);
        return new c(u10, u11, u12, u13);
    }

    public boolean a() {
        if ((this.f799b & 16) == 16) {
            return true;
        }
        return false;
    }

    public int getType() {
        return 1751742049;
    }
}
