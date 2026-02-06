package Sb;

import Sb.d;
import java.io.PrintWriter;
import java.io.StringWriter;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final d f52374a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52375b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52376c;

    public c(d dVar, String str) {
        this(dVar, str, (String) null);
    }

    private static String d(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private long g() {
        return System.currentTimeMillis();
    }

    private String h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f52376c == null) {
            return str;
        }
        return this.f52376c + " - " + str;
    }

    public void a(String str, Throwable th2, Object... objArr) {
        if (f()) {
            String h10 = h(str, objArr);
            if (th2 != null) {
                h10 = h10 + "\n" + d(th2);
            }
            this.f52374a.b(d.a.DEBUG, this.f52375b, h10, g());
        }
    }

    public void b(String str, Object... objArr) {
        a(str, (Throwable) null, objArr);
    }

    public void c(String str, Throwable th2) {
        this.f52374a.b(d.a.ERROR, this.f52375b, h(str, new Object[0]) + "\n" + d(th2), g());
    }

    public void e(String str) {
        this.f52374a.b(d.a.INFO, this.f52375b, h(str, new Object[0]), g());
    }

    public boolean f() {
        if (this.f52374a.a().ordinal() <= d.a.DEBUG.ordinal()) {
            return true;
        }
        return false;
    }

    public void i(String str) {
        j(str, (Throwable) null);
    }

    public void j(String str, Throwable th2) {
        String h10 = h(str, new Object[0]);
        if (th2 != null) {
            h10 = h10 + "\n" + d(th2);
        }
        this.f52374a.b(d.a.WARN, this.f52375b, h10, g());
    }

    public c(d dVar, String str, String str2) {
        this.f52374a = dVar;
        this.f52375b = str;
        this.f52376c = str2;
    }
}
