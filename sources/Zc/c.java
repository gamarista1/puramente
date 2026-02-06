package Zc;

class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        hVar.f53552d--;
        int c10 = c(hVar.c(), sb3);
        hVar.k();
        return c10;
    }

    private static String d(CharSequence charSequence, int i10) {
        int charAt = (charSequence.charAt(i10) * 1600) + (charSequence.charAt(i10 + 1) * '(') + charSequence.charAt(i10 + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    static void g(h hVar, StringBuilder sb2) {
        hVar.s(d(sb2, 0));
        sb2.delete(0, 3);
    }

    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f53552d++;
            int c11 = c(c10, sb2);
            int a10 = hVar.a() + ((sb2.length() / 3) << 1);
            hVar.q(a10);
            int a11 = hVar.g().a() - a10;
            if (hVar.i()) {
                if (sb2.length() % 3 == 0 && j.n(hVar.d(), hVar.f53552d, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (a11 < 2 || a11 > 2)) {
                    c11 = b(hVar, sb2, sb3, c11);
                }
                while (sb2.length() % 3 == 1 && ((c11 <= 3 && a11 != 1) || c11 > 3)) {
                    c11 = b(hVar, sb2, sb3, c11);
                }
            }
        }
        f(hVar, sb2);
    }

    /* access modifiers changed from: package-private */
    public int c(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append(3);
            return 1;
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
            return 1;
        } else if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) (c10 - '3'));
            return 1;
        } else if (c10 < ' ') {
            sb2.append(0);
            sb2.append(c10);
            return 2;
        } else if (c10 >= '!' && c10 <= '/') {
            sb2.append(1);
            sb2.append((char) (c10 - '!'));
            return 2;
        } else if (c10 >= ':' && c10 <= '@') {
            sb2.append(1);
            sb2.append((char) (c10 - '+'));
            return 2;
        } else if (c10 >= '[' && c10 <= '_') {
            sb2.append(1);
            sb2.append((char) (c10 - 'E'));
            return 2;
        } else if (c10 < '`' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return c((char) (c10 - 128), sb2) + 2;
        } else {
            sb2.append(2);
            sb2.append((char) (c10 - '`'));
            return 2;
        }
    }

    public int e() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb2) {
        int length = sb2.length() % 3;
        int a10 = hVar.a() + ((sb2.length() / 3) << 1);
        hVar.q(a10);
        int a11 = hVar.g().a() - a10;
        if (length == 2) {
            sb2.append(0);
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.i()) {
                hVar.r(254);
            }
        } else if (a11 == 1 && length == 1) {
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.i()) {
                hVar.r(254);
            }
            hVar.f53552d--;
        } else if (length == 0) {
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (a11 > 0 || hVar.i()) {
                hVar.r(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.o(0);
    }
}
