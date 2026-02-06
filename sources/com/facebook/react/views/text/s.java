package com.facebook.react.views.text;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;

public abstract class s {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.react.views.text.r[] r0 = com.facebook.react.views.text.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.views.text.r r1 = com.facebook.react.views.text.r.UPPERCASE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.views.text.r r1 = com.facebook.react.views.text.r.LOWERCASE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.views.text.r r1 = com.facebook.react.views.text.r.CAPITALIZE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42233a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.s.a.<clinit>():void");
        }
    }

    public static final String a(String str, r rVar) {
        int i10;
        C6496s.h(str, "<this>");
        if (rVar == null) {
            i10 = -1;
        } else {
            i10 = a.f42233a[rVar.ordinal()];
        }
        if (i10 == 1) {
            Locale locale = Locale.getDefault();
            C6496s.g(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            C6496s.g(upperCase, "toUpperCase(...)");
            return upperCase;
        } else if (i10 == 2) {
            Locale locale2 = Locale.getDefault();
            C6496s.g(locale2, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale2);
            C6496s.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        } else if (i10 != 3) {
            return str;
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance();
            wordInstance.setText(str);
            StringBuilder sb2 = new StringBuilder(str.length());
            int first = wordInstance.first();
            int next = wordInstance.next();
            while (true) {
                int i11 = next;
                int i12 = first;
                first = i11;
                if (first != -1) {
                    String substring = str.substring(i12, first);
                    C6496s.g(substring, "substring(...)");
                    if (substring.length() > 0) {
                        char upperCase2 = Character.toUpperCase(substring.charAt(0));
                        String substring2 = substring.substring(1);
                        C6496s.g(substring2, "substring(...)");
                        substring = upperCase2 + substring2;
                    }
                    sb2.append(substring);
                    next = wordInstance.next();
                } else {
                    String sb3 = sb2.toString();
                    C6496s.e(sb3);
                    return sb3;
                }
            }
        }
    }
}
