package com.amazon.c.a.a;

import Nh.d;
import Oh.a;
import Oh.b;
import Oh.c;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37694a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f37695b;

    /* renamed from: c  reason: collision with root package name */
    private String f37696c;

    /* renamed from: d  reason: collision with root package name */
    private String f37697d;

    /* renamed from: e  reason: collision with root package name */
    private String f37698e;

    /* renamed from: f  reason: collision with root package name */
    private String f37699f;

    static {
        Class<e> cls = e.class;
        f37694a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", new Object[]{cls.getSimpleName()});
        f37695b = String.format("A valid instance of %s is required to have a certificate ID.", new Object[]{cls.getSimpleName()});
    }

    public static String a() {
        return f37694a;
    }

    public static String b() {
        return f37695b;
    }

    public boolean c() {
        return !d.a(e()) && !d.a(f());
    }

    public boolean d() {
        return !d.a(e());
    }

    public String e() {
        if (d.a(this.f37698e)) {
            return this.f37696c;
        }
        return this.f37698e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new a().g(this.f37698e, eVar.f37698e).g(this.f37699f, eVar.f37699f).g(this.f37696c, eVar.f37696c).g(this.f37697d, eVar.f37697d).s();
    }

    public String f() {
        if (d.a(this.f37699f)) {
            return this.f37697d;
        }
        return this.f37699f;
    }

    public String g() {
        return this.f37696c;
    }

    public String h() {
        return this.f37697d;
    }

    public int hashCode() {
        return new b().g(this.f37698e).g(this.f37699f).g(this.f37696c).g(this.f37697d).s();
    }

    public String i() {
        return this.f37698e;
    }

    public String j() {
        return this.f37699f;
    }

    public String toString() {
        return c.p(this, Oh.e.f64555x);
    }

    public e a(String str) {
        this.f37696c = str;
        return this;
    }

    public void b(String str) {
        this.f37696c = str;
    }

    public e c(String str) {
        this.f37697d = str;
        return this;
    }

    public void d(String str) {
        this.f37697d = str;
    }

    public e g(String str) {
        this.f37699f = str;
        return this;
    }

    public void h(String str) {
        this.f37699f = str;
    }

    public e e(String str) {
        this.f37698e = str;
        return this;
    }

    public void f(String str) {
        this.f37698e = str;
    }
}
