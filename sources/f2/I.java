package f2;

import i2.C2076a;
import i2.L;
import i2.p;
import java.util.Arrays;

public final class I {

    /* renamed from: f  reason: collision with root package name */
    private static final String f19783f = L.y0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f19784g = L.y0(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f19785a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19786b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19787c;

    /* renamed from: d  reason: collision with root package name */
    private final s[] f19788d;

    /* renamed from: e  reason: collision with root package name */
    private int f19789e;

    public I(s... sVarArr) {
        this("", sVarArr);
    }

    private static void c(String str, String str2, String str3, int i10) {
        p.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        if (str == null || str.equals("und")) {
            return "";
        }
        return str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String d10 = d(this.f19788d[0].f20073d);
        int e10 = e(this.f19788d[0].f20075f);
        int i10 = 1;
        while (true) {
            s[] sVarArr = this.f19788d;
            if (i10 >= sVarArr.length) {
                return;
            }
            if (!d10.equals(d(sVarArr[i10].f20073d))) {
                s[] sVarArr2 = this.f19788d;
                c("languages", sVarArr2[0].f20073d, sVarArr2[i10].f20073d, i10);
                return;
            } else if (e10 != e(this.f19788d[i10].f20075f)) {
                c("role flags", Integer.toBinaryString(this.f19788d[0].f20075f), Integer.toBinaryString(this.f19788d[i10].f20075f), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public s a(int i10) {
        return this.f19788d[i10];
    }

    public int b(s sVar) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f19788d;
            if (i10 >= sVarArr.length) {
                return -1;
            }
            if (sVar == sVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i10 = (I) obj;
        if (!this.f19786b.equals(i10.f19786b) || !Arrays.equals(this.f19788d, i10.f19788d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f19789e == 0) {
            this.f19789e = ((527 + this.f19786b.hashCode()) * 31) + Arrays.hashCode(this.f19788d);
        }
        return this.f19789e;
    }

    public I(String str, s... sVarArr) {
        C2076a.a(sVarArr.length > 0);
        this.f19786b = str;
        this.f19788d = sVarArr;
        this.f19785a = sVarArr.length;
        int i10 = C1960A.i(sVarArr[0].f20083n);
        this.f19787c = i10 == -1 ? C1960A.i(sVarArr[0].f20082m) : i10;
        f();
    }
}
