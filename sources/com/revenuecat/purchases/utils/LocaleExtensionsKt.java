package com.revenuecat.purchases.utils;

import Sg.p;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import u1.i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljava/util/Locale;", "convertToCorrectlyFormattedLocale", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "toLocale", "(Ljava/lang/String;)Ljava/util/Locale;", "locale", "", "sharedLanguageCodeWith", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "", "getDefaultLocales", "()Ljava/util/List;", "inferScript", "(Ljava/util/Locale;)Ljava/lang/String;", "Lu1/i;", "toList", "(Lu1/i;)Ljava/util/List;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        C6496s.h(locale, "<this>");
        String locale2 = locale.toString();
        C6496s.g(locale2, "toString()");
        return toLocale(locale2);
    }

    public static final List<Locale> getDefaultLocales() {
        i d10 = i.d();
        C6496s.g(d10, "getDefault()");
        return toList(d10);
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            C6496s.g(script2, "script");
            return script2;
        } else if (!C6496s.c(locale.getLanguage(), "zh") || (country = locale.getCountry()) == null) {
            return "";
        } else {
            int hashCode = country.hashCode();
            if (hashCode != 2155) {
                if (hashCode != 2307) {
                    if (hashCode != 2466) {
                        if (hashCode != 2644) {
                            if (hashCode == 2691 && country.equals("TW")) {
                                return "Hant";
                            }
                            return "";
                        } else if (!country.equals("SG")) {
                            return "";
                        }
                    } else if (!country.equals("MO")) {
                        return "";
                    }
                } else if (!country.equals("HK")) {
                    return "";
                }
                return "Hant";
            } else if (!country.equals("CN")) {
                return "";
            }
            return "Hans";
        }
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        C6496s.h(locale, "<this>");
        C6496s.h(locale2, "locale");
        try {
            boolean c10 = C6496s.c(locale.getISO3Language(), locale2.getISO3Language());
            boolean c11 = C6496s.c(inferScript(locale), inferScript(locale2));
            if (!c10 || !c11) {
                return false;
            }
            return true;
        } catch (MissingResourceException e10) {
            LogUtilsKt.errorLog$default("Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e10 + "). Falling back to language.", (Throwable) null, 2, (Object) null);
            return C6496s.c(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(i iVar) {
        int g10 = iVar.g();
        Locale[] localeArr = new Locale[g10];
        for (int i10 = 0; i10 < g10; i10++) {
            localeArr[i10] = iVar.c(i10);
        }
        return C6559l.Z(localeArr);
    }

    public static final Locale toLocale(String str) {
        C6496s.h(str, "<this>");
        Locale forLanguageTag = Locale.forLanguageTag(p.D(str, "_", "-", false, 4, (Object) null));
        C6496s.g(forLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return forLanguageTag;
    }
}
