package fa;

import W9.g;
import W9.j;
import android.text.TextUtils;
import ja.B;
import java.util.ArrayList;
import k9.L0;

public final class h extends g {

    /* renamed from: o  reason: collision with root package name */
    private final B f43597o = new B();

    /* renamed from: p  reason: collision with root package name */
    private final c f43598p = new c();

    public h() {
        super("WebvttDecoder");
    }

    private static int B(B b10) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = b10.e();
            String p10 = b10.p();
            if (p10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(p10)) {
                i10 = 2;
            } else if (p10.startsWith("NOTE")) {
                i10 = 1;
            } else {
                i10 = 3;
            }
        }
        b10.P(i11);
        return i10;
    }

    private static void C(B b10) {
        do {
        } while (!TextUtils.isEmpty(b10.p()));
    }

    /* access modifiers changed from: protected */
    public W9.h z(byte[] bArr, int i10, boolean z10) {
        e m10;
        this.f43597o.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f43597o);
            do {
            } while (!TextUtils.isEmpty(this.f43597o.p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B10 = B(this.f43597o);
                if (B10 == 0) {
                    return new k(arrayList2);
                }
                if (B10 == 1) {
                    C(this.f43597o);
                } else if (B10 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f43597o.p();
                        arrayList.addAll(this.f43598p.d(this.f43597o));
                    } else {
                        throw new j("A style block was found after the first cue.");
                    }
                } else if (B10 == 3 && (m10 = f.m(this.f43597o, arrayList)) != null) {
                    arrayList2.add(m10);
                }
            }
        } catch (L0 e10) {
            throw new j((Throwable) e10);
        }
    }
}
