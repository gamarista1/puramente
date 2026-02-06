package Zc;

final class b implements g {
    b() {
    }

    private static char c(char c10, int i10) {
        int i11 = c10 + ((i10 * 149) % 255) + 1;
        if (i11 <= 255) {
            return (char) i11;
        }
        return (char) (i11 - 256);
    }

    public void a(h hVar) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(0);
        while (true) {
            if (!hVar.i()) {
                break;
            }
            sb2.append(hVar.c());
            hVar.f53552d++;
            if (j.n(hVar.d(), hVar.f53552d, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int a10 = hVar.a() + length + 1;
        hVar.q(a10);
        if (hVar.g().a() - a10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (hVar.i() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            hVar.r(c(sb2.charAt(i10), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
