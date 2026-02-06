package R9;

import ja.M;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f33793a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33794b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33795c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33796d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33797e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f33793a = str;
        this.f33794b = str2;
        this.f33795c = str3;
        this.f33796d = str4;
        this.f33797e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!M.c(this.f33793a, hVar.f33793a) || !M.c(this.f33794b, hVar.f33794b) || !M.c(this.f33795c, hVar.f33795c) || !M.c(this.f33796d, hVar.f33796d) || !M.c(this.f33797e, hVar.f33797e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = this.f33793a;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f33794b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f33795c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f33796d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f33797e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
