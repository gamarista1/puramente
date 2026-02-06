package Zc;

final class n extends c {
    n() {
    }

    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f53552d++;
            c(c10, sb2);
            if (sb2.length() % 3 == 0) {
                c.g(hVar, sb2);
                if (j.n(hVar.d(), hVar.f53552d, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb2);
    }

    /* access modifiers changed from: package-private */
    public int c(char c10, StringBuilder sb2) {
        if (c10 == 13) {
            sb2.append(0);
        } else if (c10 == ' ') {
            sb2.append(3);
        } else if (c10 == '*') {
            sb2.append(1);
        } else if (c10 == '>') {
            sb2.append(2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
        } else if (c10 < 'A' || c10 > 'Z') {
            j.e(c10);
        } else {
            sb2.append((char) (c10 - '3'));
        }
        return 1;
    }

    public int e() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb2) {
        hVar.p();
        int a10 = hVar.g().a() - hVar.a();
        hVar.f53552d -= sb2.length();
        if (hVar.f() > 1 || a10 > 1 || hVar.f() != a10) {
            hVar.r(254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
