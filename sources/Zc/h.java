package Zc;

import Tc.b;
import java.nio.charset.StandardCharsets;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f53549a;

    /* renamed from: b  reason: collision with root package name */
    private l f53550b;

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f53551c;

    /* renamed from: d  reason: collision with root package name */
    int f53552d;

    /* renamed from: e  reason: collision with root package name */
    private int f53553e;

    /* renamed from: f  reason: collision with root package name */
    private k f53554f;

    /* renamed from: g  reason: collision with root package name */
    private int f53555g;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 != '?' || str.charAt(i10) == '?') {
                sb2.append(c10);
                i10++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f53549a = sb2.toString();
        this.f53550b = l.FORCE_NONE;
        this.f53551c = new StringBuilder(str.length());
        this.f53553e = -1;
    }

    private int h() {
        return this.f53549a.length() - this.f53555g;
    }

    public int a() {
        return this.f53551c.length();
    }

    public StringBuilder b() {
        return this.f53551c;
    }

    public char c() {
        return this.f53549a.charAt(this.f53552d);
    }

    public String d() {
        return this.f53549a;
    }

    public int e() {
        return this.f53553e;
    }

    public int f() {
        return h() - this.f53552d;
    }

    public k g() {
        return this.f53554f;
    }

    public boolean i() {
        if (this.f53552d < h()) {
            return true;
        }
        return false;
    }

    public void j() {
        this.f53553e = -1;
    }

    public void k() {
        this.f53554f = null;
    }

    public void m(int i10) {
        this.f53555g = i10;
    }

    public void n(l lVar) {
        this.f53550b = lVar;
    }

    public void o(int i10) {
        this.f53553e = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f53554f;
        if (kVar == null || i10 > kVar.a()) {
            this.f53554f = k.l(i10, this.f53550b, (b) null, (b) null, true);
        }
    }

    public void r(char c10) {
        this.f53551c.append(c10);
    }

    public void s(String str) {
        this.f53551c.append(str);
    }

    public void l(b bVar, b bVar2) {
    }
}
