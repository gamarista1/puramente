package e3;

import W2.i;
import W2.s;
import android.text.TextUtils;
import f2.C1961B;
import i2.C2073A;
import i2.C2082g;
import java.util.ArrayList;

/* renamed from: e3.g  reason: case insensitive filesystem */
public final class C1951g implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f19583a = new C2073A();

    /* renamed from: b  reason: collision with root package name */
    private final C1946b f19584b = new C1946b();

    private static int d(C2073A a10) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = a10.f();
            String s10 = a10.s();
            if (s10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(s10)) {
                i10 = 2;
            } else if (s10.startsWith("NOTE")) {
                i10 = 1;
            } else {
                i10 = 3;
            }
        }
        a10.U(i11);
        return i10;
    }

    private static void e(C2073A a10) {
        do {
        } while (!TextUtils.isEmpty(a10.s()));
    }

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        C1948d m10;
        this.f19583a.S(bArr, i11 + i10);
        this.f19583a.U(i10);
        ArrayList arrayList = new ArrayList();
        try {
            C1952h.d(this.f19583a);
            do {
            } while (!TextUtils.isEmpty(this.f19583a.s()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int d10 = d(this.f19583a);
                if (d10 == 0) {
                    i.c(new C1954j(arrayList2), bVar, gVar);
                    return;
                } else if (d10 == 1) {
                    e(this.f19583a);
                } else if (d10 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f19583a.s();
                        arrayList.addAll(this.f19584b.d(this.f19583a));
                    } else {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                } else if (d10 == 3 && (m10 = C1949e.m(this.f19583a, arrayList)) != null) {
                    arrayList2.add(m10);
                }
            }
        } catch (C1961B e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public int c() {
        return 1;
    }
}
