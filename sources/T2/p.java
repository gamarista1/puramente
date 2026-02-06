package T2;

import O2.b;
import f2.C1961B;
import i2.C2073A;
import java.util.ArrayList;
import java.util.List;
import nb.s;
import z2.C2973q;
import z2.I;

final class p {

    /* renamed from: d  reason: collision with root package name */
    private static final s f6118d = s.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final s f6119e = s.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List f6120a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f6121b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f6122c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6123a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6124b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6125c;

        public a(int i10, long j10, int i11) {
            this.f6123a = i10;
            this.f6124b = j10;
            this.f6125c = i11;
        }
    }

    private void a(C2973q qVar, I i10) {
        C2073A a10 = new C2073A(8);
        qVar.readFully(a10.e(), 0, 8);
        this.f6122c = a10.u() + 8;
        if (a10.q() != 1397048916) {
            i10.f29106a = 0;
            return;
        }
        i10.f29106a = qVar.getPosition() - ((long) (this.f6122c - 12));
        this.f6121b = 2;
    }

    private static int b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw C1961B.a("Invalid SEF name", (Throwable) null);
        }
    }

    private void d(C2973q qVar, I i10) {
        long a10 = qVar.a();
        int i11 = this.f6122c - 20;
        C2073A a11 = new C2073A(i11);
        qVar.readFully(a11.e(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            a11.V(2);
            short w10 = a11.w();
            if (w10 == 2192 || w10 == 2816 || w10 == 2817 || w10 == 2819 || w10 == 2820) {
                this.f6120a.add(new a(w10, (a10 - ((long) this.f6122c)) - ((long) a11.u()), a11.u()));
            } else {
                a11.V(8);
            }
        }
        if (this.f6120a.isEmpty()) {
            i10.f29106a = 0;
            return;
        }
        this.f6121b = 3;
        i10.f29106a = ((a) this.f6120a.get(0)).f6124b;
    }

    private void e(C2973q qVar, List list) {
        long position = qVar.getPosition();
        int a10 = (int) ((qVar.a() - qVar.getPosition()) - ((long) this.f6122c));
        C2073A a11 = new C2073A(a10);
        qVar.readFully(a11.e(), 0, a10);
        for (int i10 = 0; i10 < this.f6120a.size(); i10++) {
            a aVar = (a) this.f6120a.get(i10);
            a11.U((int) (aVar.f6124b - position));
            a11.V(4);
            int u10 = a11.u();
            int b10 = b(a11.E(u10));
            int i11 = aVar.f6125c - (u10 + 8);
            if (b10 == 2192) {
                list.add(f(a11, i11));
            } else if (!(b10 == 2816 || b10 == 2817 || b10 == 2819 || b10 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    private static b f(C2073A a10, int i10) {
        ArrayList arrayList = new ArrayList();
        List f10 = f6119e.f(a10.E(i10));
        int i11 = 0;
        while (i11 < f10.size()) {
            List f11 = f6118d.f((CharSequence) f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new b.C0117b(Long.parseLong((String) f11.get(0)), Long.parseLong((String) f11.get(1)), 1 << (Integer.parseInt((String) f11.get(2)) - 1)));
                    i11++;
                } catch (NumberFormatException e10) {
                    throw C1961B.a((String) null, e10);
                }
            } else {
                throw C1961B.a((String) null, (Throwable) null);
            }
        }
        return new b(arrayList);
    }

    public int c(C2973q qVar, I i10, List list) {
        int i11 = this.f6121b;
        long j10 = 0;
        if (i11 == 0) {
            long a10 = qVar.a();
            if (a10 != -1 && a10 >= 8) {
                j10 = a10 - 8;
            }
            i10.f29106a = j10;
            this.f6121b = 1;
        } else if (i11 == 1) {
            a(qVar, i10);
        } else if (i11 == 2) {
            d(qVar, i10);
        } else if (i11 == 3) {
            e(qVar, list);
            i10.f29106a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f6120a.clear();
        this.f6121b = 0;
    }
}
