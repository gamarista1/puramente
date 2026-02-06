package Jb;

import java.net.URI;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f51238a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51239b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f51240c;

    public f(String str, String str2, boolean z10) {
        this.f51238a = str;
        this.f51239b = str2;
        this.f51240c = z10;
    }

    public static URI a(String str, boolean z10, String str2, String str3) {
        String str4;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        String str5 = str4 + "://" + str + "/.ws?ns=" + str2 + "&" + "v" + com.amazon.a.a.o.b.f.f37530b + "5";
        if (str3 != null) {
            str5 = str5 + "&ls=" + str3;
        }
        return URI.create(str5);
    }

    public String b() {
        return this.f51238a;
    }

    public String c() {
        return this.f51239b;
    }

    public boolean d() {
        return this.f51240c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http");
        if (this.f51240c) {
            str = "s";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("://");
        sb2.append(this.f51238a);
        return sb2.toString();
    }
}
