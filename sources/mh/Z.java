package mh;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;

public final class Z extends C6584a {

    /* renamed from: e  reason: collision with root package name */
    private final String f72181e;

    public Z(String str) {
        C6496s.h(str, "source");
        this.f72181e = str;
    }

    public String E(String str, boolean z10) {
        C6496s.h(str, "keyToMatch");
        int i10 = this.f72182a;
        try {
            if (j() == 6) {
                if (C6496s.c(G(z10), str)) {
                    t();
                    if (j() == 5) {
                        String G10 = G(z10);
                        this.f72182a = i10;
                        t();
                        return G10;
                    }
                }
            }
            return null;
        } finally {
            this.f72182a = i10;
            t();
        }
    }

    public int H(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    public int J() {
        int i10 = this.f72182a;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < C().length() && ((r1 = C().charAt(i10)) == ' ' || r1 == 10 || r1 == 13 || r1 == 9)) {
            i10++;
        }
        this.f72182a = i10;
        return i10;
    }

    public boolean M() {
        int J10 = J();
        if (J10 == C().length() || J10 == -1 || C().charAt(J10) != ',') {
            return false;
        }
        this.f72182a++;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public String C() {
        return this.f72181e;
    }

    public boolean e() {
        int i10 = this.f72182a;
        if (i10 == -1) {
            return false;
        }
        while (i10 < C().length()) {
            char charAt = C().charAt(i10);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i10++;
            } else {
                this.f72182a = i10;
                return D(charAt);
            }
        }
        this.f72182a = i10;
        return false;
    }

    public String i() {
        l('\"');
        int i10 = this.f72182a;
        int a02 = p.a0(C(), '\"', i10, false, 4, (Object) null);
        if (a02 != -1) {
            for (int i11 = i10; i11 < a02; i11++) {
                if (C().charAt(i11) == '\\') {
                    return p(C(), this.f72182a, i11);
                }
            }
            this.f72182a = a02 + 1;
            String substring = C().substring(i10, a02);
            C6496s.g(substring, "substring(...)");
            return substring;
        }
        q();
        y((byte) 1, false);
        throw new C6527k();
    }

    public byte j() {
        byte a10;
        String R10 = C();
        do {
            int i10 = this.f72182a;
            if (i10 == -1 || i10 >= R10.length()) {
                return 10;
            }
            int i11 = this.f72182a;
            this.f72182a = i11 + 1;
            a10 = C6585b.a(R10.charAt(i11));
        } while (a10 == 3);
        return a10;
    }

    public void l(char c10) {
        if (this.f72182a == -1) {
            P(c10);
        }
        String R10 = C();
        while (this.f72182a < R10.length()) {
            int i10 = this.f72182a;
            this.f72182a = i10 + 1;
            char charAt = R10.charAt(i10);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                if (charAt != c10) {
                    P(c10);
                } else {
                    return;
                }
            }
        }
        this.f72182a = -1;
        P(c10);
    }
}
