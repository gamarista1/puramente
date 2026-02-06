package R9;

import android.net.Uri;
import ja.K;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f33798a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33799b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33800c;

    /* renamed from: d  reason: collision with root package name */
    private int f33801d;

    public i(String str, long j10, long j11) {
        this.f33800c = str == null ? "" : str;
        this.f33798a = j10;
        this.f33799b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f33799b;
            long j11 = -1;
            if (j10 != -1) {
                long j12 = this.f33798a;
                if (j12 + j10 == iVar.f33798a) {
                    long j13 = iVar.f33799b;
                    if (j13 != -1) {
                        j11 = j10 + j13;
                    }
                    return new i(c10, j12, j11);
                }
            }
            long j14 = iVar.f33799b;
            if (j14 != -1) {
                long j15 = iVar.f33798a;
                if (j15 + j14 == this.f33798a) {
                    if (j10 != -1) {
                        j11 = j14 + j10;
                    }
                    return new i(c10, j15, j11);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return K.e(str, this.f33800c);
    }

    public String c(String str) {
        return K.d(str, this.f33800c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f33798a == iVar.f33798a && this.f33799b == iVar.f33799b && this.f33800c.equals(iVar.f33800c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f33801d == 0) {
            this.f33801d = ((((527 + ((int) this.f33798a)) * 31) + ((int) this.f33799b)) * 31) + this.f33800c.hashCode();
        }
        return this.f33801d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f33800c + ", start=" + this.f33798a + ", length=" + this.f33799b + ")";
    }
}
