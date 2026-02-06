package fa;

import W9.b;
import W9.g;
import W9.h;
import W9.j;
import ja.B;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;

public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final B f43547o = new B();

    public a() {
        super("Mp4WebvttDecoder");
    }

    private static b B(B b10, int i10) {
        CharSequence charSequence = null;
        b.C0565b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int n10 = b10.n();
                int n11 = b10.n();
                int i11 = n10 - 8;
                String E10 = M.E(b10.d(), b10.e(), i11);
                b10.Q(i11);
                i10 = (i10 - 8) - i11;
                if (n11 == 1937011815) {
                    bVar = f.o(E10);
                } else if (n11 == 1885436268) {
                    charSequence = f.q((String) null, E10.trim(), Collections.emptyList());
                }
            } else {
                throw new j("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.o(charSequence).a();
        }
        return f.l(charSequence);
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        this.f43547o.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f43547o.a() > 0) {
            if (this.f43547o.a() >= 8) {
                int n10 = this.f43547o.n();
                if (this.f43547o.n() == 1987343459) {
                    arrayList.add(B(this.f43547o, n10 - 8));
                } else {
                    this.f43547o.Q(n10 - 8);
                }
            } else {
                throw new j("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
