package Db;

final class m0 extends i0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50534a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50535b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50536c;

    public final String a() {
        return this.f50535b;
    }

    public final String b() {
        return this.f50536c;
    }

    public final String c() {
        return this.f50534a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            String str = this.f50534a;
            if (str != null ? str.equals(i0Var.c()) : i0Var.c() == null) {
                String str2 = this.f50535b;
                if (str2 != null ? str2.equals(i0Var.a()) : i0Var.a() == null) {
                    String str3 = this.f50536c;
                    if (str3 != null ? !str3.equals(i0Var.b()) : i0Var.b() != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.f50534a;
        int i12 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (i10 ^ 1000003) * 1000003;
        String str2 = this.f50535b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 ^ i11) * 1000003;
        String str3 = this.f50536c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 ^ i12;
    }

    public final String toString() {
        String str = this.f50534a;
        String str2 = this.f50535b;
        String str3 = this.f50536c;
        return "AttestationResult{recaptchaV2Token=" + str + ", playIntegrityToken=" + str2 + ", recaptchaEnterpriseToken=" + str3 + "}";
    }

    private m0(String str, String str2, String str3) {
        this.f50534a = str;
        this.f50535b = str2;
        this.f50536c = null;
    }
}
