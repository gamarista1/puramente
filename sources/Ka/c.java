package ka;

import android.os.Bundle;
import java.util.Arrays;
import k9.C3700i;

public final class c implements C3700i {

    /* renamed from: f  reason: collision with root package name */
    public static final C3700i.a f45956f = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f45957a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45958b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45959c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f45960d;

    /* renamed from: e  reason: collision with root package name */
    private int f45961e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f45957a = i10;
        this.f45958b = i11;
        this.f45959c = i12;
        this.f45960d = bArr;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            return 2;
        }
        return -1;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 == 18) {
            return 7;
        }
        if (i10 == 6 || i10 == 7) {
            return 3;
        }
        return -1;
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c e(Bundle bundle) {
        return new c(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45957a == cVar.f45957a && this.f45958b == cVar.f45958b && this.f45959c == cVar.f45959c && Arrays.equals(this.f45960d, cVar.f45960d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f45961e == 0) {
            this.f45961e = ((((((527 + this.f45957a) * 31) + this.f45958b) * 31) + this.f45959c) * 31) + Arrays.hashCode(this.f45960d);
        }
        return this.f45961e;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f45957a);
        sb2.append(", ");
        sb2.append(this.f45958b);
        sb2.append(", ");
        sb2.append(this.f45959c);
        sb2.append(", ");
        if (this.f45960d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
