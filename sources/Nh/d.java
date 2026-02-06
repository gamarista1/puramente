package Nh;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f64364a = Pattern.compile("\\s+");

    /* renamed from: b  reason: collision with root package name */
    private static boolean f64365b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f64366c;

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f64367d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f64368e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f64369f;

    /* renamed from: g  reason: collision with root package name */
    private static Object f64370g;

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f64371h;

    static {
        f64365b = false;
        f64366c = null;
        Pattern compile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        f64367d = compile;
        f64368e = false;
        f64369f = null;
        f64370g = null;
        f64371h = compile;
        try {
            Class<?> loadClass = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
            f64370g = loadClass.getField("NFD").get((Object) null);
            f64369f = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", new Class[]{CharSequence.class, loadClass});
            f64368e = true;
        } catch (ClassNotFoundException unused) {
            f64368e = false;
        } catch (NoSuchFieldException unused2) {
            f64368e = false;
        } catch (IllegalAccessException unused3) {
            f64368e = false;
        } catch (NoSuchMethodException unused4) {
            f64368e = false;
        }
        try {
            f64366c = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", new Class[]{String.class, Boolean.TYPE, Integer.TYPE});
            f64365b = true;
        } catch (ClassNotFoundException unused5) {
            f64365b = false;
        } catch (NoSuchMethodException unused6) {
            f64365b = false;
        }
    }

    public static boolean a(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isWhitespace(charSequence.charAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String b(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else if (str2.length() == 0) {
            return str;
        } else {
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }
}
