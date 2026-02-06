package v1;

import android.util.Base64;
import java.util.List;
import x1.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f26924a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26925b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26926c;

    /* renamed from: d  reason: collision with root package name */
    private final List f26927d;

    /* renamed from: e  reason: collision with root package name */
    private final int f26928e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f26929f;

    public e(String str, String str2, String str3, List list) {
        this.f26924a = (String) g.f(str);
        this.f26925b = (String) g.f(str2);
        this.f26926c = (String) g.f(str3);
        this.f26927d = (List) g.f(list);
        this.f26929f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f26927d;
    }

    public int c() {
        return this.f26928e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f26929f;
    }

    public String e() {
        return this.f26924a;
    }

    public String f() {
        return this.f26925b;
    }

    public String g() {
        return this.f26926c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f26924a + ", mProviderPackage: " + this.f26925b + ", mQuery: " + this.f26926c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f26927d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f26927d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f26928e);
        return sb2.toString();
    }
}
