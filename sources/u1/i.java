package u1;

import android.os.LocaleList;
import com.amazon.a.a.o.b.f;
import java.util.Locale;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final i f26546b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final j f26547a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Locale[] f26548a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f26547a = jVar;
    }

    public static i a(Locale... localeArr) {
        return j(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(f.f37529a, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return j(b.b());
    }

    public static i e() {
        return f26546b;
    }

    public static i j(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f26547a.get(i10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i) || !this.f26547a.equals(((i) obj).f26547a)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f26547a.isEmpty();
    }

    public int g() {
        return this.f26547a.size();
    }

    public String h() {
        return this.f26547a.a();
    }

    public int hashCode() {
        return this.f26547a.hashCode();
    }

    public Object i() {
        return this.f26547a.b();
    }

    public String toString() {
        return this.f26547a.toString();
    }
}
