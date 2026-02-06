package y9;

import J9.c;
import ja.B;
import java.util.ArrayList;
import java.util.List;
import k9.L0;
import nb.s;
import q9.l;
import q9.y;

final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final s f50015d = s.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final s f50016e = s.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List f50017a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f50018b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f50019c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f50020a;

        /* renamed from: b  reason: collision with root package name */
        public final long f50021b;

        /* renamed from: c  reason: collision with root package name */
        public final int f50022c;

        public a(int i10, long j10, int i11) {
            this.f50020a = i10;
            this.f50021b = j10;
            this.f50022c = i11;
        }
    }

    private void a(l lVar, y yVar) {
        B b10 = new B(8);
        lVar.readFully(b10.d(), 0, 8);
        this.f50019c = b10.q() + 8;
        if (b10.n() != 1397048916) {
            yVar.f47919a = 0;
            return;
        }
        yVar.f47919a = lVar.getPosition() - ((long) (this.f50019c - 12));
        this.f50018b = 2;
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
                throw L0.a("Invalid SEF name", (Throwable) null);
        }
    }

    private void d(l lVar, y yVar) {
        long a10 = lVar.a();
        int i10 = this.f50019c - 20;
        B b10 = new B(i10);
        lVar.readFully(b10.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            b10.Q(2);
            short s10 = b10.s();
            if (s10 == 2192 || s10 == 2816 || s10 == 2817 || s10 == 2819 || s10 == 2820) {
                this.f50017a.add(new a(s10, (a10 - ((long) this.f50019c)) - ((long) b10.q()), b10.q()));
            } else {
                b10.Q(8);
            }
        }
        if (this.f50017a.isEmpty()) {
            yVar.f47919a = 0;
            return;
        }
        this.f50018b = 3;
        yVar.f47919a = ((a) this.f50017a.get(0)).f50021b;
    }

    private void e(l lVar, List list) {
        long position = lVar.getPosition();
        int a10 = (int) ((lVar.a() - lVar.getPosition()) - ((long) this.f50019c));
        B b10 = new B(a10);
        lVar.readFully(b10.d(), 0, a10);
        for (int i10 = 0; i10 < this.f50017a.size(); i10++) {
            a aVar = (a) this.f50017a.get(i10);
            b10.P((int) (aVar.f50021b - position));
            b10.Q(4);
            int q10 = b10.q();
            int b11 = b(b10.A(q10));
            int i11 = aVar.f50022c - (q10 + 8);
            if (b11 == 2192) {
                list.add(f(b10, i11));
            } else if (!(b11 == 2816 || b11 == 2817 || b11 == 2819 || b11 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    private static c f(B b10, int i10) {
        ArrayList arrayList = new ArrayList();
        List f10 = f50016e.f(b10.A(i10));
        int i11 = 0;
        while (i11 < f10.size()) {
            List f11 = f50015d.f((CharSequence) f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new c.b(Long.parseLong((String) f11.get(0)), Long.parseLong((String) f11.get(1)), 1 << (Integer.parseInt((String) f11.get(2)) - 1)));
                    i11++;
                } catch (NumberFormatException e10) {
                    throw L0.a((String) null, e10);
                }
            } else {
                throw L0.a((String) null, (Throwable) null);
            }
        }
        return new c(arrayList);
    }

    public int c(l lVar, y yVar, List list) {
        int i10 = this.f50018b;
        long j10 = 0;
        if (i10 == 0) {
            long a10 = lVar.a();
            if (a10 != -1 && a10 >= 8) {
                j10 = a10 - 8;
            }
            yVar.f47919a = j10;
            this.f50018b = 1;
        } else if (i10 == 1) {
            a(lVar, yVar);
        } else if (i10 == 2) {
            d(lVar, yVar);
        } else if (i10 == 3) {
            e(lVar, list);
            yVar.f47919a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void g() {
        this.f50017a.clear();
        this.f50018b = 0;
    }
}
