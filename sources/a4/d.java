package A4;

import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List f29360a;

    /* renamed from: b  reason: collision with root package name */
    private final char f29361b;

    /* renamed from: c  reason: collision with root package name */
    private final double f29362c;

    /* renamed from: d  reason: collision with root package name */
    private final double f29363d;

    /* renamed from: e  reason: collision with root package name */
    private final String f29364e;

    /* renamed from: f  reason: collision with root package name */
    private final String f29365f;

    public d(List list, char c10, double d10, double d11, String str, String str2) {
        this.f29360a = list;
        this.f29361b = c10;
        this.f29362c = d10;
        this.f29363d = d11;
        this.f29364e = str;
        this.f29365f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f29360a;
    }

    public double b() {
        return this.f29363d;
    }

    public int hashCode() {
        return c(this.f29361b, this.f29365f, this.f29364e);
    }
}
