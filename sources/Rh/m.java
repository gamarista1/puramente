package rh;

import Sg.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import sh.C6722a;
import sh.C6726e;
import xh.c;

public final class m {

    /* renamed from: j  reason: collision with root package name */
    public static final b f73420j = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f73421k = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f73422l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f73423m = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f73424n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    private final String f73425a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73426b;

    /* renamed from: c  reason: collision with root package name */
    private final long f73427c;

    /* renamed from: d  reason: collision with root package name */
    private final String f73428d;

    /* renamed from: e  reason: collision with root package name */
    private final String f73429e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f73430f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f73431g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f73432h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f73433i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f73434a;

        /* renamed from: b  reason: collision with root package name */
        private String f73435b;

        /* renamed from: c  reason: collision with root package name */
        private long f73436c = 253402300799999L;

        /* renamed from: d  reason: collision with root package name */
        private String f73437d;

        /* renamed from: e  reason: collision with root package name */
        private String f73438e = "/";

        /* renamed from: f  reason: collision with root package name */
        private boolean f73439f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f73440g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f73441h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f73442i;

        private final a c(String str, boolean z10) {
            String e10 = C6722a.e(str);
            if (e10 != null) {
                this.f73437d = e10;
                this.f73442i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f73434a;
            if (str != null) {
                String str2 = this.f73435b;
                if (str2 != null) {
                    long j10 = this.f73436c;
                    String str3 = this.f73437d;
                    if (str3 != null) {
                        return new m(str, str2, j10, str3, this.f73438e, this.f73439f, this.f73440g, this.f73441h, this.f73442i, (DefaultConstructorMarker) null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final a b(String str) {
            C6496s.h(str, "domain");
            return c(str, false);
        }

        public final a d(String str) {
            C6496s.h(str, "name");
            if (C6496s.c(p.g1(str).toString(), str)) {
                this.f73434a = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        public final a e(String str) {
            C6496s.h(str, "value");
            if (C6496s.c(p.g1(str).toString(), str)) {
                this.f73435b = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            boolean z11;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (C6496s.c(str, str2)) {
                return true;
            }
            if (!p.u(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || C6726e.i(str)) {
                return false;
            }
            return true;
        }

        private final String f(String str) {
            if (!p.u(str, ".", false, 2, (Object) null)) {
                String e10 = C6722a.e(p.v0(str, "."));
                if (e10 != null) {
                    return e10;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long g(String str, int i10, int i11) {
            String str2 = str;
            int i12 = i11;
            int a10 = a(str2, i10, i12, false);
            Matcher matcher = m.f73424n.matcher(str2);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            while (a10 < i12) {
                int a11 = a(str2, a10 + 1, i12, true);
                matcher.region(a10, a11);
                if (i14 == -1 && matcher.usePattern(m.f73424n).matches()) {
                    String group = matcher.group(1);
                    C6496s.g(group, "matcher.group(1)");
                    i14 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C6496s.g(group2, "matcher.group(2)");
                    i17 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C6496s.g(group3, "matcher.group(3)");
                    i18 = Integer.parseInt(group3);
                } else if (i15 == -1 && matcher.usePattern(m.f73423m).matches()) {
                    String group4 = matcher.group(1);
                    C6496s.g(group4, "matcher.group(1)");
                    i15 = Integer.parseInt(group4);
                } else if (i16 == -1 && matcher.usePattern(m.f73422l).matches()) {
                    String group5 = matcher.group(1);
                    C6496s.g(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C6496s.g(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = m.f73422l.pattern();
                    C6496s.g(pattern, "MONTH_PATTERN.pattern()");
                    i16 = p.b0(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i13 == -1 && matcher.usePattern(m.f73421k).matches()) {
                    String group6 = matcher.group(1);
                    C6496s.g(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                a10 = a(str2, a11 + 1, i12, false);
            }
            if (70 <= i13 && i13 < 100) {
                i13 += 1900;
            }
            if (i13 >= 0 && i13 < 70) {
                i13 += 2000;
            }
            if (i13 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i16 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (1 > i15 || i15 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i14 < 0 || i14 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i17 < 0 || i17 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i18 < 0 || i18 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(C6726e.f73545f);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i13);
                gregorianCalendar.set(2, i16 - 1);
                gregorianCalendar.set(5, i15);
                gregorianCalendar.set(11, i14);
                gregorianCalendar.set(12, i17);
                gregorianCalendar.set(13, i18);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (!new Sg.m("-?\\d+").d(str)) {
                    throw e10;
                } else if (p.J(str, "-", false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return Long.MAX_VALUE;
                }
            }
        }

        public final m c(v vVar, String str) {
            C6496s.h(vVar, "url");
            C6496s.h(str, "setCookie");
            return d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
            if (r1 > 253402300799999L) goto L_0x0105;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0132 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0133  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final rh.m d(long r26, rh.v r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.C6496s.h(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.C6496s.h(r7, r1)
                r5 = 6
                r6 = 0
                r2 = 59
                r3 = 0
                r4 = 0
                r1 = r29
                int r9 = sh.C6726e.r(r1, r2, r3, r4, r5, r6)
                r5 = 2
                r2 = 61
                r4 = r9
                int r1 = sh.C6726e.r(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = sh.C6726e.a0(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0035
                goto L_0x003c
            L_0x0035:
                int r5 = sh.C6726e.y(r11)
                r6 = -1
                if (r5 == r6) goto L_0x003d
            L_0x003c:
                return r2
            L_0x003d:
                int r1 = r1 + r4
                java.lang.String r12 = sh.C6726e.Z(r7, r1, r9)
                int r1 = sh.C6726e.y(r12)
                if (r1 == r6) goto L_0x0049
                return r2
            L_0x0049:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0061:
                if (r9 >= r1) goto L_0x00d1
                r2 = 59
                int r2 = sh.C6726e.p(r7, r2, r9, r1)
                r13 = 61
                int r13 = sh.C6726e.p(r7, r13, r9, r2)
                java.lang.String r9 = sh.C6726e.Z(r7, r9, r13)
                if (r13 >= r2) goto L_0x007c
                int r13 = r13 + 1
                java.lang.String r13 = sh.C6726e.Z(r7, r13, r2)
                goto L_0x007e
            L_0x007c:
                java.lang.String r13 = ""
            L_0x007e:
                java.lang.String r14 = "expires"
                boolean r14 = Sg.p.v(r9, r14, r4)
                if (r14 == 0) goto L_0x0091
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00cd }
                long r23 = r0.g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00cd }
            L_0x008e:
                r19 = r4
                goto L_0x00cd
            L_0x0091:
                java.lang.String r14 = "max-age"
                boolean r14 = Sg.p.v(r9, r14, r4)
                if (r14 == 0) goto L_0x009e
                long r15 = r0.h(r13)     // Catch:{  }
                goto L_0x008e
            L_0x009e:
                java.lang.String r14 = "domain"
                boolean r14 = Sg.p.v(r9, r14, r4)
                if (r14 == 0) goto L_0x00ad
                java.lang.String r10 = r0.f(r13)     // Catch:{ IllegalArgumentException -> 0x00cd }
                r20 = r3
                goto L_0x00cd
            L_0x00ad:
                java.lang.String r14 = "path"
                boolean r14 = Sg.p.v(r9, r14, r4)
                if (r14 == 0) goto L_0x00b8
                r22 = r13
                goto L_0x00cd
            L_0x00b8:
                java.lang.String r13 = "secure"
                boolean r13 = Sg.p.v(r9, r13, r4)
                if (r13 == 0) goto L_0x00c3
                r17 = r4
                goto L_0x00cd
            L_0x00c3:
                java.lang.String r13 = "httponly"
                boolean r9 = Sg.p.v(r9, r13, r4)
                if (r9 == 0) goto L_0x00cd
                r18 = r4
            L_0x00cd:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0061
            L_0x00d1:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00d9
            L_0x00d7:
                r13 = r1
                goto L_0x0109
            L_0x00d9:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0107
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00eb
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f0
            L_0x00eb:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f0:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0100
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00d7
                goto L_0x0105
            L_0x0100:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0105:
                r13 = r4
                goto L_0x0109
            L_0x0107:
                r13 = r23
            L_0x0109:
                java.lang.String r1 = r28.i()
                if (r10 != 0) goto L_0x0112
                r15 = r1
                r2 = 0
                goto L_0x011c
            L_0x0112:
                boolean r2 = r0.b(r1, r10)
                if (r2 != 0) goto L_0x011a
                r2 = 0
                return r2
            L_0x011a:
                r2 = 0
                r15 = r10
            L_0x011c:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0133
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f72439e
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.c()
                java.lang.String r1 = r1.c(r15)
                if (r1 != 0) goto L_0x0133
                return r2
            L_0x0133:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0144
                r5 = 2
                boolean r2 = Sg.p.J(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0141
                goto L_0x0144
            L_0x0141:
                r16 = r4
                goto L_0x0160
            L_0x0144:
                java.lang.String r2 = r28.d()
                r9 = 6
                r10 = 0
                r6 = 47
                r7 = 0
                r8 = 0
                r5 = r2
                int r4 = Sg.p.g0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x015e
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C6496s.g(r1, r2)
            L_0x015e:
                r16 = r1
            L_0x0160:
                rh.m r1 = new rh.m
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rh.m.b.d(long, rh.v, java.lang.String):rh.m");
        }

        public final List e(v vVar, u uVar) {
            C6496s.h(vVar, "url");
            C6496s.h(uVar, "headers");
            List z10 = uVar.z("Set-Cookie");
            int size = z10.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m c10 = c(vVar, (String) z10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList == null) {
                return C6565s.n();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            C6496s.g(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        private b() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f73425a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (C6496s.c(mVar.f73425a, this.f73425a) && C6496s.c(mVar.f73426b, this.f73426b) && mVar.f73427c == this.f73427c && C6496s.c(mVar.f73428d, this.f73428d) && C6496s.c(mVar.f73429e, this.f73429e) && mVar.f73430f == this.f73430f && mVar.f73431g == this.f73431g && mVar.f73432h == this.f73432h && mVar.f73433i == this.f73433i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f73425a);
        sb2.append('=');
        sb2.append(this.f73426b);
        if (this.f73432h) {
            if (this.f73427c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(c.b(new Date(this.f73427c)));
            }
        }
        if (!this.f73433i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f73428d);
        }
        sb2.append("; path=");
        sb2.append(this.f73429e);
        if (this.f73430f) {
            sb2.append("; secure");
        }
        if (this.f73431g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString()");
        return sb3;
    }

    public final String g() {
        return this.f73426b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f73425a.hashCode()) * 31) + this.f73426b.hashCode()) * 31) + Long.hashCode(this.f73427c)) * 31) + this.f73428d.hashCode()) * 31) + this.f73429e.hashCode()) * 31) + Boolean.hashCode(this.f73430f)) * 31) + Boolean.hashCode(this.f73431g)) * 31) + Boolean.hashCode(this.f73432h)) * 31) + Boolean.hashCode(this.f73433i);
    }

    public String toString() {
        return f(false);
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f73425a = str;
        this.f73426b = str2;
        this.f73427c = j10;
        this.f73428d = str3;
        this.f73429e = str4;
        this.f73430f = z10;
        this.f73431g = z11;
        this.f73432h = z12;
        this.f73433i = z13;
    }
}
