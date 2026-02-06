package Vc;

import Wc.a;

final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f53437c;

    /* renamed from: d  reason: collision with root package name */
    private final short f53438d;

    b(g gVar, int i10, int i11) {
        super(gVar);
        this.f53437c = (short) i10;
        this.f53438d = (short) i11;
    }

    public void c(a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f53438d;
            if (i10 < s10) {
                if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                    aVar.d(31, 5);
                    short s11 = this.f53438d;
                    if (s11 > 62) {
                        aVar.d(s11 - 31, 16);
                    } else if (i10 == 0) {
                        aVar.d(Math.min(s11, 31), 5);
                    } else {
                        aVar.d(s11 - 31, 5);
                    }
                }
                aVar.d(bArr[this.f53437c + i10], 8);
                i10++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(this.f53437c);
        sb2.append("::");
        sb2.append((this.f53437c + this.f53438d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
