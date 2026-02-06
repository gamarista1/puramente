package Sg;

import java.util.Locale;
import kotlin.jvm.internal.C6496s;

public abstract class G {
    public static final String a(char c10) {
        String valueOf = String.valueOf(c10);
        C6496s.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C6496s.g(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        C6496s.f(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        C6496s.g(substring, "substring(...)");
        C6496s.f(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        C6496s.g(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
