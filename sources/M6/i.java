package M6;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static String f32615a = "calendar";

    /* renamed from: b  reason: collision with root package name */
    public static String f32616b = "ca";

    /* renamed from: c  reason: collision with root package name */
    public static String f32617c = "numbers";

    /* renamed from: d  reason: collision with root package name */
    public static String f32618d = "nu";

    /* renamed from: e  reason: collision with root package name */
    public static String f32619e = "hours";

    /* renamed from: f  reason: collision with root package name */
    public static String f32620f = "hc";

    /* renamed from: g  reason: collision with root package name */
    public static String f32621g = "collation";

    /* renamed from: h  reason: collision with root package name */
    public static String f32622h = "co";

    /* renamed from: i  reason: collision with root package name */
    public static String f32623i = "colnumeric";

    /* renamed from: j  reason: collision with root package name */
    public static String f32624j = "kn";

    /* renamed from: k  reason: collision with root package name */
    public static String f32625k = "colcasefirst";

    /* renamed from: l  reason: collision with root package name */
    public static String f32626l = "kf";

    /* renamed from: m  reason: collision with root package name */
    private static HashMap f32627m = new a();

    /* renamed from: n  reason: collision with root package name */
    private static HashMap f32628n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final Map f32629o = new c();

    /* renamed from: p  reason: collision with root package name */
    private static Map f32630p = new d();

    /* renamed from: q  reason: collision with root package name */
    private static Map f32631q = new e();

    /* renamed from: r  reason: collision with root package name */
    private static Map f32632r = new f();

    class a extends HashMap {
        a() {
            put(i.f32616b, i.f32615a);
            put(i.f32618d, i.f32617c);
            put(i.f32620f, i.f32619e);
            put(i.f32622h, i.f32621g);
            put(i.f32624j, i.f32623i);
            put(i.f32626l, i.f32625k);
        }
    }

    class b extends HashMap {
        b() {
            put(i.f32615a, i.f32616b);
            put(i.f32617c, i.f32618d);
            put(i.f32619e, i.f32620f);
            put(i.f32621g, i.f32622h);
            put(i.f32623i, i.f32624j);
            put(i.f32625k, i.f32626l);
        }
    }

    class c extends HashMap {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    class d extends HashMap {
        d() {
            put("gregorian", "gregory");
        }
    }

    class e extends HashMap {
        e() {
            put("traditional", "traditio");
        }
    }

    class f extends HashMap {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        if (f32627m.containsKey(str)) {
            return (String) f32627m.get(str);
        }
        return str;
    }

    public static String b(String str) {
        if (f32628n.containsKey(str)) {
            return (String) f32628n.get(str);
        }
        return str;
    }

    public static boolean c(String str, String str2, b bVar) {
        ULocale uLocale = (ULocale) bVar.h();
        String[] strArr = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            strArr = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            strArr = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            strArr = NumberingSystem.getAvailableNames();
        }
        if (strArr.length == 0) {
            return true;
        }
        return Arrays.asList(strArr).contains(str2);
    }

    public static String d(String str) {
        if (!f32630p.containsKey(str)) {
            return str;
        }
        return (String) f32630p.get(str);
    }

    public static String e(String str) {
        Map map = f32629o;
        if (!map.containsKey(str)) {
            return str;
        }
        return (String) map.get(str);
    }

    public static Object f(String str, Object obj) {
        if (str.equals("ca") && d.m(obj)) {
            return d((String) obj);
        }
        if (str.equals("nu") && d.m(obj)) {
            return g((String) obj);
        }
        if (str.equals("co") && d.m(obj)) {
            return e((String) obj);
        }
        if (str.equals("kn") && d.m(obj) && obj.equals("yes")) {
            return d.r(com.amazon.a.a.o.b.f37475af);
        }
        if ((str.equals("kn") || str.equals("kf")) && d.m(obj) && obj.equals("no")) {
            return d.r(com.amazon.a.a.o.b.f37476ag);
        }
        return obj;
    }

    public static String g(String str) {
        if (!f32631q.containsKey(str)) {
            return str;
        }
        return (String) f32631q.get(str);
    }
}
