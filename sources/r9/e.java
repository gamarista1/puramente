package R9;

import ja.M;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f33780a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33781b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33782c;

    public e(String str, String str2, String str3) {
        this.f33780a = str;
        this.f33781b = str2;
        this.f33782c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!M.c(this.f33780a, eVar.f33780a) || !M.c(this.f33781b, eVar.f33781b) || !M.c(this.f33782c, eVar.f33782c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f33780a.hashCode() * 31;
        String str = this.f33781b;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f33782c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
