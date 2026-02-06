package rh;

import Sg.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tf.C6729c;

public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final a f73499e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f73500f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f73501g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f73502a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73503b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73504c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f73505d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(String str) {
            C6496s.h(str, "<this>");
            Matcher matcher = y.f73500f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C6496s.g(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C6496s.g(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C6496s.g(group2, "typeSubtype.group(2)");
                C6496s.g(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = y.f73501g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (p.J(group4, "'", false, 2, (Object) null) && p.u(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C6496s.g(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                return new y(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final y b(String str) {
            C6496s.h(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ y(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(y yVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return yVar.c(charset);
    }

    public static final y e(String str) {
        return f73499e.a(str);
    }

    public static final y g(String str) {
        return f73499e.b(str);
    }

    public final Charset c(Charset charset) {
        String f10 = f("charset");
        if (f10 == null) {
            return charset;
        }
        try {
            return Charset.forName(f10);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y) || !C6496s.c(((y) obj).f73502a, this.f73502a)) {
            return false;
        }
        return true;
    }

    public final String f(String str) {
        C6496s.h(str, "name");
        int i10 = 0;
        int c10 = C6729c.c(0, this.f73505d.length - 1, 2);
        if (c10 < 0) {
            return null;
        }
        while (!p.v(this.f73505d[i10], str, true)) {
            if (i10 == c10) {
                return null;
            }
            i10 += 2;
        }
        return this.f73505d[i10 + 1];
    }

    public final String h() {
        return this.f73503b;
    }

    public int hashCode() {
        return this.f73502a.hashCode();
    }

    public String toString() {
        return this.f73502a;
    }

    private y(String str, String str2, String str3, String[] strArr) {
        this.f73502a = str;
        this.f73503b = str2;
        this.f73504c = str3;
        this.f73505d = strArr;
    }
}
