package Zc;

final class f implements g {
    f() {
    }

    private static void b(char c10, StringBuilder sb2) {
        if (c10 >= ' ' && c10 <= '?') {
            sb2.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            j.e(c10);
        } else {
            sb2.append((char) (c10 - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i10) {
        char c10;
        char c11;
        int length = charSequence.length() - i10;
        if (length != 0) {
            char charAt = charSequence.charAt(i10);
            char c12 = 0;
            if (length >= 2) {
                c10 = charSequence.charAt(i10 + 1);
            } else {
                c10 = 0;
            }
            if (length >= 3) {
                c11 = charSequence.charAt(i10 + 2);
            } else {
                c11 = 0;
            }
            if (length >= 4) {
                c12 = charSequence.charAt(i10 + 3);
            }
            int i11 = (charAt << 18) + (c10 << 12) + (c11 << 6) + c12;
            char c13 = (char) ((i11 >> 8) & 255);
            char c14 = (char) (i11 & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((i11 >> 16) & 255));
            if (length >= 2) {
                sb2.append(c13);
            }
            if (length >= 3) {
                sb2.append(c14);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z10 = true;
                if (length == 1) {
                    hVar.p();
                    int a10 = hVar.g().a() - hVar.a();
                    int f10 = hVar.f();
                    if (f10 > a10) {
                        hVar.q(hVar.a() + 1);
                        a10 = hVar.g().a() - hVar.a();
                    }
                    if (f10 <= a10 && a10 <= 2) {
                        hVar.o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i10 = length - 1;
                    String c10 = c(charSequence, 0);
                    if (hVar.i() || i10 > 2) {
                        z10 = false;
                    }
                    if (i10 <= 2) {
                        hVar.q(hVar.a() + i10);
                        if (hVar.g().a() - hVar.a() >= 3) {
                            hVar.q(hVar.a() + c10.length());
                            z10 = false;
                        }
                    }
                    if (z10) {
                        hVar.k();
                        hVar.f53552d -= i10;
                    } else {
                        hVar.s(c10);
                    }
                    hVar.o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.o(0);
        }
    }

    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb2);
            hVar.f53552d++;
            if (sb2.length() >= 4) {
                hVar.s(c(sb2, 0));
                sb2.delete(0, 4);
                if (j.n(hVar.d(), hVar.f53552d, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb2.append(31);
        e(hVar, sb2);
    }

    public int d() {
        return 4;
    }
}
