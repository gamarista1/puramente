package e3;

import W2.e;
import W2.s;
import h2.C2030a;
import i2.C2073A;
import i2.C2076a;
import i2.C2082g;
import i2.L;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: e3.a  reason: case insensitive filesystem */
public final class C1945a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f19534a = new C2073A();

    private static C2030a d(C2073A a10, int i10) {
        boolean z10;
        CharSequence charSequence = null;
        C2030a.b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.b(z10, "Incomplete vtt cue box header found.");
            int q10 = a10.q();
            int q11 = a10.q();
            int i11 = q10 - 8;
            String H10 = L.H(a10.e(), a10.f(), i11);
            a10.V(i11);
            i10 = (i10 - 8) - i11;
            if (q11 == 1937011815) {
                bVar = C1949e.o(H10);
            } else if (q11 == 1885436268) {
                charSequence = C1949e.q((String) null, H10.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.o(charSequence).a();
        }
        return C1949e.l(charSequence);
    }

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        boolean z10;
        this.f19534a.S(bArr, i11 + i10);
        this.f19534a.U(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f19534a.a() > 0) {
            if (this.f19534a.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.b(z10, "Incomplete Mp4Webvtt Top Level box header found.");
            int q10 = this.f19534a.q();
            if (this.f19534a.q() == 1987343459) {
                arrayList.add(d(this.f19534a, q10 - 8));
            } else {
                this.f19534a.V(q10 - 8);
            }
        }
        gVar.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public int c() {
        return 2;
    }
}
