package rh;

import Ef.g;
import Gh.C5404e;
import Sg.m;
import Sg.p;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import sh.C6722a;
import sh.C6726e;

public final class v {

    /* renamed from: k  reason: collision with root package name */
    public static final b f73477k = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f73478l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    private final String f73479a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73480b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73481c;

    /* renamed from: d  reason: collision with root package name */
    private final String f73482d;

    /* renamed from: e  reason: collision with root package name */
    private final int f73483e;

    /* renamed from: f  reason: collision with root package name */
    private final List f73484f;

    /* renamed from: g  reason: collision with root package name */
    private final List f73485g;

    /* renamed from: h  reason: collision with root package name */
    private final String f73486h;

    /* renamed from: i  reason: collision with root package name */
    private final String f73487i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f73488j;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C1067a f73489i = new C1067a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private String f73490a;

        /* renamed from: b  reason: collision with root package name */
        private String f73491b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f73492c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f73493d;

        /* renamed from: e  reason: collision with root package name */
        private int f73494e = -1;

        /* renamed from: f  reason: collision with root package name */
        private final List f73495f;

        /* renamed from: g  reason: collision with root package name */
        private List f73496g;

        /* renamed from: h  reason: collision with root package name */
        private String f73497h;

        /* renamed from: rh.v$a$a  reason: collision with other inner class name */
        public static final class C1067a {
            public /* synthetic */ C1067a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(v.f73477k, str, i10, i11, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) == ']');
                    } else if (charAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((C6496s.i(charAt, 97) < 0 || C6496s.i(charAt, 122) > 0) && (C6496s.i(charAt, 65) < 0 || C6496s.i(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i10);
                    if (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && !(('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i10;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private C1067a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f73495f = arrayList;
            arrayList.add("");
        }

        private final int d() {
            int i10 = this.f73494e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = v.f73477k;
            String str = this.f73490a;
            C6496s.e(str);
            return bVar.c(str);
        }

        private final boolean i(String str) {
            if (C6496s.c(str, ".") || p.v(str, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean j(String str) {
            if (C6496s.c(str, "..") || p.v(str, "%2e.", true) || p.v(str, ".%2e", true) || p.v(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void m() {
            List list = this.f73495f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f73495f.isEmpty()) {
                this.f73495f.add("");
                return;
            }
            List list2 = this.f73495f;
            list2.set(list2.size() - 1, "");
        }

        private final void o(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(v.f73477k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, (Charset) null, 240, (Object) null);
            if (!i(b10)) {
                if (j(b10)) {
                    m();
                    return;
                }
                List list = this.f73495f;
                if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                    List list2 = this.f73495f;
                    list2.set(list2.size() - 1, b10);
                } else {
                    this.f73495f.add(b10);
                }
                if (z10) {
                    this.f73495f.add("");
                }
            }
        }

        private final void r(String str, int i10, int i11) {
            boolean z10;
            if (i10 != i11) {
                char charAt = str.charAt(i10);
                if (charAt == '/' || charAt == '\\') {
                    this.f73495f.clear();
                    this.f73495f.add("");
                    i10++;
                } else {
                    List list = this.f73495f;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i12 = i10;
                    while (true) {
                        if (i12 < i11) {
                            i10 = C6726e.q(str, "/\\", i12, i11);
                            if (i10 < i11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            o(str, i12, i10, z10, true);
                            if (z10) {
                                i12 = i10 + 1;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final a a(String str, String str2) {
            String str3;
            C6496s.h(str, "encodedName");
            if (this.f73496g == null) {
                this.f73496g = new ArrayList();
            }
            List list = this.f73496g;
            C6496s.e(list);
            b bVar = v.f73477k;
            list.add(b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
            List list2 = this.f73496g;
            C6496s.e(list2);
            if (str2 != null) {
                str3 = b.b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null);
            } else {
                str3 = null;
            }
            list2.add(str3);
            return this;
        }

        public final a b(String str, String str2) {
            String str3;
            C6496s.h(str, "name");
            if (this.f73496g == null) {
                this.f73496g = new ArrayList();
            }
            List list = this.f73496g;
            C6496s.e(list);
            b bVar = v.f73477k;
            list.add(b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            List list2 = this.f73496g;
            C6496s.e(list2);
            if (str2 != null) {
                str3 = b.b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null);
            } else {
                str3 = null;
            }
            list2.add(str3);
            return this;
        }

        public final v c() {
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.f73490a;
            if (str3 != null) {
                b bVar = v.f73477k;
                String h10 = b.h(bVar, this.f73491b, 0, 0, false, 7, (Object) null);
                String h11 = b.h(bVar, this.f73492c, 0, 0, false, 7, (Object) null);
                String str4 = this.f73493d;
                if (str4 != null) {
                    int d10 = d();
                    Iterable<String> iterable = this.f73495f;
                    ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
                    for (String h12 : iterable) {
                        arrayList2.add(b.h(v.f73477k, h12, 0, 0, false, 7, (Object) null));
                    }
                    List list = this.f73496g;
                    if (list != null) {
                        Iterable<String> iterable2 = list;
                        arrayList = new ArrayList(C6565s.y(iterable2, 10));
                        for (String str5 : iterable2) {
                            if (str5 != null) {
                                str2 = b.h(v.f73477k, str5, 0, 0, true, 3, (Object) null);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.f73497h;
                    if (str6 != null) {
                        str = b.h(v.f73477k, str6, 0, 0, false, 7, (Object) null);
                    } else {
                        str = null;
                    }
                    return new v(str3, h10, h11, str4, d10, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a e(String str) {
            List list;
            if (str != null) {
                b bVar = v.f73477k;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211, (Object) null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f73496g = list;
                    return this;
                }
            }
            list = null;
            this.f73496g = list;
            return this;
        }

        public final a f(String str) {
            String str2;
            if (str != null) {
                str2 = b.b(v.f73477k, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null);
            } else {
                str2 = null;
            }
            this.f73497h = str2;
            return this;
        }

        public final List g() {
            return this.f73495f;
        }

        public final a h(String str) {
            C6496s.h(str, "host");
            String e10 = C6722a.e(b.h(v.f73477k, str, 0, 0, false, 7, (Object) null));
            if (e10 != null) {
                this.f73493d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a k(v vVar, String str) {
            int i10;
            int q10;
            char c10;
            int i11;
            int i12;
            boolean z10;
            boolean z11;
            String str2 = str;
            C6496s.h(str2, MetricTracker.Object.INPUT);
            int A10 = C6726e.A(str2, 0, 0, 3, (Object) null);
            int C10 = C6726e.C(str2, A10, 0, 2, (Object) null);
            C1067a aVar = f73489i;
            int c11 = aVar.g(str2, A10, C10);
            boolean z12 = true;
            char c12 = 65535;
            if (c11 != -1) {
                if (p.G(str2, "https:", A10, true)) {
                    this.f73490a = Constants.SCHEME;
                    A10 += 6;
                } else if (p.G(str2, "http:", A10, true)) {
                    this.f73490a = "http";
                    A10 += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str2.substring(0, c11);
                    C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (vVar != null) {
                this.f73490a = vVar.s();
            } else {
                if (str.length() > 6) {
                    str2 = p.m1(str2, 6) + "...";
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
            }
            int d10 = aVar.h(str2, A10, C10);
            char c13 = '?';
            char c14 = '#';
            if (d10 >= 2 || vVar == null || !C6496s.c(vVar.s(), this.f73490a)) {
                boolean z13 = false;
                boolean z14 = false;
                int i13 = A10 + d10;
                while (true) {
                    q10 = C6726e.q(str2, "@/\\?#", i13, C10);
                    if (q10 != C10) {
                        c10 = str2.charAt(q10);
                    } else {
                        c10 = c12;
                    }
                    if (c10 == c12 || c10 == c14 || c10 == '/' || c10 == '\\' || c10 == c13) {
                        int i14 = q10;
                        boolean z15 = z12;
                        i10 = C10;
                        C1067a aVar2 = f73489i;
                        int b10 = aVar2.f(str2, i13, i14);
                        int i15 = b10 + 1;
                    } else if (c10 == '@') {
                        if (!z13) {
                            int p10 = C6726e.p(str2, ':', i13, q10);
                            b bVar = v.f73477k;
                            String str3 = "%40";
                            int i16 = q10;
                            int i17 = p10;
                            z10 = z12;
                            String b11 = b.b(bVar, str, i13, p10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                            if (z14) {
                                b11 = this.f73491b + str3 + b11;
                            }
                            this.f73491b = b11;
                            int i18 = i16;
                            int i19 = i17;
                            if (i19 != i18) {
                                i11 = i18;
                                this.f73492c = b.b(bVar, str, i19 + 1, i18, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                z11 = z10;
                            } else {
                                i11 = i18;
                                z11 = z13;
                            }
                            z13 = z11;
                            i12 = C10;
                            z14 = z10;
                        } else {
                            i11 = q10;
                            z10 = z12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f73492c);
                            sb3.append("%40");
                            i12 = C10;
                            StringBuilder sb4 = sb3;
                            sb4.append(b.b(v.f73477k, str, i13, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                            this.f73492c = sb4.toString();
                        }
                        i13 = i11 + 1;
                        z12 = z10;
                        C10 = i12;
                        c14 = '#';
                        c13 = '?';
                        c12 = 65535;
                    }
                }
                int i142 = q10;
                boolean z152 = z12;
                i10 = C10;
                C1067a aVar22 = f73489i;
                int b102 = aVar22.f(str2, i13, i142);
                int i152 = b102 + 1;
                if (i152 < i142) {
                    this.f73493d = C6722a.e(b.h(v.f73477k, str, i13, b102, false, 4, (Object) null));
                    int a10 = aVar22.e(str2, i152, i142);
                    this.f73494e = a10;
                    if (a10 == -1) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid URL port: \"");
                        String substring2 = str2.substring(i152, i142);
                        C6496s.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb5.append(substring2);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    b bVar2 = v.f73477k;
                    this.f73493d = C6722a.e(b.h(bVar2, str, i13, b102, false, 4, (Object) null));
                    String str4 = this.f73490a;
                    C6496s.e(str4);
                    this.f73494e = bVar2.c(str4);
                }
                if (this.f73493d != null) {
                    A10 = i142;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Invalid URL host: \"");
                    String substring3 = str2.substring(i13, b102);
                    C6496s.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb6.append(substring3);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
            } else {
                this.f73491b = vVar.g();
                this.f73492c = vVar.c();
                this.f73493d = vVar.i();
                this.f73494e = vVar.o();
                this.f73495f.clear();
                this.f73495f.addAll(vVar.e());
                if (A10 == C10 || str2.charAt(A10) == '#') {
                    e(vVar.f());
                }
                i10 = C10;
            }
            int i20 = i10;
            int q11 = C6726e.q(str2, "?#", A10, i20);
            r(str2, A10, q11);
            if (q11 < i20 && str2.charAt(q11) == '?') {
                int p11 = C6726e.p(str2, '#', q11, i20);
                b bVar3 = v.f73477k;
                this.f73496g = bVar3.j(b.b(bVar3, str, q11 + 1, p11, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                q11 = p11;
            }
            if (q11 < i20 && str2.charAt(q11) == '#') {
                this.f73497h = b.b(v.f73477k, str, q11 + 1, i20, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final a l(String str) {
            C6496s.h(str, "password");
            this.f73492c = b.b(v.f73477k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final a n(int i10) {
            if (1 > i10 || i10 >= 65536) {
                throw new IllegalArgumentException(("unexpected port: " + i10).toString());
            }
            this.f73494e = i10;
            return this;
        }

        public final a p(String str) {
            List list;
            if (str != null) {
                b bVar = v.f73477k;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, (Charset) null, 219, (Object) null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f73496g = list;
                    return this;
                }
            }
            list = null;
            this.f73496g = list;
            return this;
        }

        public final a q() {
            String str;
            String str2;
            String str3 = this.f73493d;
            String str4 = null;
            if (str3 != null) {
                str = new m("[\"<>^`{|}]").e(str3, "");
            } else {
                str = null;
            }
            this.f73493d = str;
            int size = this.f73495f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f73495f;
                list.set(i10, b.b(v.f73477k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List list2 = this.f73496g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str5 = (String) list2.get(i11);
                    if (str5 != null) {
                        str2 = b.b(v.f73477k, str5, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i11, str2);
                }
            }
            String str6 = this.f73497h;
            if (str6 != null) {
                str4 = b.b(v.f73477k, str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.f73497h = str4;
            return this;
        }

        public final a s(String str) {
            C6496s.h(str, "scheme");
            if (p.v(str, "http", true)) {
                this.f73490a = "http";
            } else if (p.v(str, Constants.SCHEME, true)) {
                this.f73490a = Constants.SCHEME;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void t(String str) {
            this.f73497h = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
            if (r1 != r4.c(r3)) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f73490a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f73491b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L_0x0022
                goto L_0x002a
            L_0x0022:
                java.lang.String r1 = r6.f73492c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0044
            L_0x002a:
                java.lang.String r1 = r6.f73491b
                r0.append(r1)
                java.lang.String r1 = r6.f73492c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003f
                r0.append(r2)
                java.lang.String r1 = r6.f73492c
                r0.append(r1)
            L_0x003f:
                r1 = 64
                r0.append(r1)
            L_0x0044:
                java.lang.String r1 = r6.f73493d
                if (r1 == 0) goto L_0x0069
                kotlin.jvm.internal.C6496s.e(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = Sg.p.N(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L_0x0064
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f73493d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0069
            L_0x0064:
                java.lang.String r1 = r6.f73493d
                r0.append(r1)
            L_0x0069:
                int r1 = r6.f73494e
                r3 = -1
                if (r1 != r3) goto L_0x0072
                java.lang.String r1 = r6.f73490a
                if (r1 == 0) goto L_0x008b
            L_0x0072:
                int r1 = r6.d()
                java.lang.String r3 = r6.f73490a
                if (r3 == 0) goto L_0x0085
                rh.v$b r4 = rh.v.f73477k
                kotlin.jvm.internal.C6496s.e(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L_0x008b
            L_0x0085:
                r0.append(r2)
                r0.append(r1)
            L_0x008b:
                rh.v$b r1 = rh.v.f73477k
                java.util.List r2 = r6.f73495f
                r1.i(r2, r0)
                java.util.List r2 = r6.f73496g
                if (r2 == 0) goto L_0x00a3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f73496g
                kotlin.jvm.internal.C6496s.e(r2)
                r1.k(r2, r0)
            L_0x00a3:
                java.lang.String r1 = r6.f73497h
                if (r1 == 0) goto L_0x00b1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f73497h
                r0.append(r1)
            L_0x00b1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C6496s.g(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rh.v.a.toString():java.lang.String");
        }

        public final void u(String str) {
            C6496s.h(str, "<set-?>");
            this.f73492c = str;
        }

        public final void v(String str) {
            C6496s.h(str, "<set-?>");
            this.f73491b = str;
        }

        public final void w(String str) {
            this.f73493d = str;
        }

        public final void x(int i10) {
            this.f73494e = i10;
        }

        public final void y(String str) {
            this.f73490a = str;
        }

        public final a z(String str) {
            C6496s.h(str, "username");
            this.f73491b = b.b(v.f73477k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            int i13;
            int i14;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            Charset charset2;
            int i15 = i12;
            if ((i15 & 1) != 0) {
                i13 = 0;
            } else {
                i13 = i10;
            }
            if ((i15 & 2) != 0) {
                i14 = str.length();
            } else {
                i14 = i11;
            }
            if ((i15 & 8) != 0) {
                z14 = false;
            } else {
                z14 = z10;
            }
            if ((i15 & 16) != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if ((i15 & 32) != 0) {
                z16 = false;
            } else {
                z16 = z12;
            }
            if ((i15 & 64) != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if ((i15 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return bVar.a(str, i13, i14, str2, z14, z15, z16, z17, charset2);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            if (i12 >= i11 || str.charAt(i10) != '%' || C6726e.I(str.charAt(i10 + 1)) == -1 || C6726e.I(str.charAt(i12)) == -1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
            if (e(r1, r5, r2) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void l(Gh.C5404e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x0028
                r8 = 9
                if (r7 == r8) goto L_0x0023
                r8 = 10
                if (r7 == r8) goto L_0x0023
                r8 = 12
                if (r7 == r8) goto L_0x0023
                r8 = 13
                if (r7 != r8) goto L_0x0028
            L_0x0023:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x0028:
                r8 = 43
                if (r7 != r8) goto L_0x0039
                if (r22 == 0) goto L_0x0039
                if (r20 == 0) goto L_0x0033
                java.lang.String r8 = "+"
                goto L_0x0035
            L_0x0033:
                java.lang.String r8 = "%2B"
            L_0x0035:
                r15.X(r8)
                goto L_0x0023
            L_0x0039:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x004a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x004a
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004e
                if (r23 == 0) goto L_0x004a
                goto L_0x004e
            L_0x004a:
                r8 = r14
                r12 = r19
                goto L_0x006f
            L_0x004e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = Sg.p.N(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x0069
                if (r7 != r9) goto L_0x0067
                if (r20 == 0) goto L_0x0069
                if (r21 == 0) goto L_0x0067
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L_0x006b
                goto L_0x006f
            L_0x0067:
                r8 = r14
                goto L_0x006b
            L_0x0069:
                r8 = r14
                goto L_0x006f
            L_0x006b:
                r15.I1(r7)
                goto L_0x00b5
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                Gh.e r6 = new Gh.e
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C6496s.c(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.E1(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.I1(r7)
            L_0x008d:
                boolean r10 = r6.J0()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.K0(r9)
                char[] r13 = rh.v.f73478l
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.K0(r11)
                char[] r11 = rh.v.f73478l
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.K0(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh.v.b.l(Gh.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(C5404e eVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I10 = C6726e.I(str.charAt(i10 + 1));
                    int I11 = C6726e.I(str.charAt(i12));
                    if (!(I10 == -1 || I11 == -1)) {
                        eVar.K0((I10 << 4) + I11);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                } else if (codePointAt == 43 && z10) {
                    eVar.K0(32);
                    i10++;
                }
                eVar.I1(codePointAt);
                i10 += Character.charCount(codePointAt);
            }
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            String str3 = str;
            int i12 = i11;
            String str4 = str2;
            C6496s.h(str, "<this>");
            C6496s.h(str4, "encodeSet");
            int i13 = i10;
            while (i13 < i12) {
                int codePointAt = str.codePointAt(i13);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !p.N(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z10) {
                            if (z11) {
                                if (!e(str, i13, i12)) {
                                    C5404e eVar = new C5404e();
                                    int i14 = i10;
                                    eVar.a0(str, i10, i13);
                                    l(eVar, str, i13, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar.p1();
                                }
                                if (codePointAt == 43 || !z12) {
                                    i13 += Character.charCount(codePointAt);
                                } else {
                                    C5404e eVar2 = new C5404e();
                                    int i142 = i10;
                                    eVar2.a0(str, i10, i13);
                                    l(eVar2, str, i13, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar2.p1();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i13 += Character.charCount(codePointAt);
                }
                C5404e eVar22 = new C5404e();
                int i1422 = i10;
                eVar22.a0(str, i10, i13);
                l(eVar22, str, i13, i11, str2, z10, z11, z12, z13, charset);
                return eVar22.p1();
            }
            int i15 = i10;
            String substring = str.substring(i10, i11);
            C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            C6496s.h(str, "scheme");
            if (C6496s.c(str, "http")) {
                return 80;
            }
            if (C6496s.c(str, Constants.SCHEME)) {
                return 443;
            }
            return -1;
        }

        public final v d(String str) {
            C6496s.h(str, "<this>");
            return new a().k((v) null, str).c();
        }

        public final v f(String str) {
            C6496s.h(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            C6496s.h(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    C5404e eVar = new C5404e();
                    eVar.a0(str, i10, i12);
                    m(eVar, str, i12, i11, z10);
                    return eVar.p1();
                }
            }
            String substring = str.substring(i10, i11);
            C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List list, StringBuilder sb2) {
            C6496s.h(list, "<this>");
            C6496s.h(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) list.get(i10));
            }
        }

        public final List j(String str) {
            C6496s.h(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int a02 = p.a0(str, '&', i10, false, 4, (Object) null);
                if (a02 == -1) {
                    a02 = str.length();
                }
                int i11 = a02;
                int a03 = p.a0(str, '=', i10, false, 4, (Object) null);
                if (a03 == -1 || a03 > i11) {
                    String substring = str.substring(i10, i11);
                    C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i10, a03);
                    C6496s.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(a03 + 1, i11);
                    C6496s.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder sb2) {
            C6496s.h(list, "<this>");
            C6496s.h(sb2, "out");
            g t10 = Ef.m.t(Ef.m.u(0, list.size()), 2);
            int k10 = t10.k();
            int n10 = t10.n();
            int r10 = t10.r();
            if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
                while (true) {
                    String str = (String) list.get(k10);
                    String str2 = (String) list.get(k10 + 1);
                    if (k10 > 0) {
                        sb2.append('&');
                    }
                    sb2.append(str);
                    if (str2 != null) {
                        sb2.append('=');
                        sb2.append(str2);
                    }
                    if (k10 != n10) {
                        k10 += r10;
                    } else {
                        return;
                    }
                }
            }
        }

        private b() {
        }
    }

    public v(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        C6496s.h(str, "scheme");
        C6496s.h(str2, "username");
        C6496s.h(str3, "password");
        C6496s.h(str4, "host");
        C6496s.h(list, "pathSegments");
        C6496s.h(str6, "url");
        this.f73479a = str;
        this.f73480b = str2;
        this.f73481c = str3;
        this.f73482d = str4;
        this.f73483e = i10;
        this.f73484f = list;
        this.f73485g = list2;
        this.f73486h = str5;
        this.f73487i = str6;
        this.f73488j = C6496s.c(str, Constants.SCHEME);
    }

    public static final v h(String str) {
        return f73477k.d(str);
    }

    public static final v m(String str) {
        return f73477k.f(str);
    }

    public final String b() {
        if (this.f73486h == null) {
            return null;
        }
        String substring = this.f73487i.substring(p.a0(this.f73487i, '#', 0, false, 6, (Object) null) + 1);
        C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f73481c.length() == 0) {
            return "";
        }
        int a02 = p.a0(this.f73487i, '@', 0, false, 6, (Object) null);
        String substring = this.f73487i.substring(p.a0(this.f73487i, ':', this.f73479a.length() + 3, false, 4, (Object) null) + 1, a02);
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int a02 = p.a0(this.f73487i, '/', this.f73479a.length() + 3, false, 4, (Object) null);
        String str = this.f73487i;
        String substring = this.f73487i.substring(a02, C6726e.q(str, "?#", a02, str.length()));
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List e() {
        int a02 = p.a0(this.f73487i, '/', this.f73479a.length() + 3, false, 4, (Object) null);
        String str = this.f73487i;
        int q10 = C6726e.q(str, "?#", a02, str.length());
        ArrayList arrayList = new ArrayList();
        while (a02 < q10) {
            int i10 = a02 + 1;
            int p10 = C6726e.p(this.f73487i, '/', i10, q10);
            String substring = this.f73487i.substring(i10, p10);
            C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            a02 = p10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v) || !C6496s.c(((v) obj).f73487i, this.f73487i)) {
            return false;
        }
        return true;
    }

    public final String f() {
        if (this.f73485g == null) {
            return null;
        }
        int a02 = p.a0(this.f73487i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f73487i;
        String substring = this.f73487i.substring(a02, C6726e.p(str, '#', a02, str.length()));
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f73480b.length() == 0) {
            return "";
        }
        int length = this.f73479a.length() + 3;
        String str = this.f73487i;
        String substring = this.f73487i.substring(length, C6726e.q(str, ":@", length, str.length()));
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f73487i.hashCode();
    }

    public final String i() {
        return this.f73482d;
    }

    public final boolean j() {
        return this.f73488j;
    }

    public final a k() {
        int i10;
        a aVar = new a();
        aVar.y(this.f73479a);
        aVar.v(g());
        aVar.u(c());
        aVar.w(this.f73482d);
        if (this.f73483e != f73477k.c(this.f73479a)) {
            i10 = this.f73483e;
        } else {
            i10 = -1;
        }
        aVar.x(i10);
        aVar.g().clear();
        aVar.g().addAll(e());
        aVar.e(f());
        aVar.t(b());
        return aVar;
    }

    public final a l(String str) {
        C6496s.h(str, ActionType.LINK);
        try {
            return new a().k(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List n() {
        return this.f73484f;
    }

    public final int o() {
        return this.f73483e;
    }

    public final String p() {
        if (this.f73485g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f73477k.k(this.f73485g, sb2);
        return sb2.toString();
    }

    public final String q() {
        a l10 = l("/...");
        C6496s.e(l10);
        return l10.z("").l("").c().toString();
    }

    public final v r(String str) {
        C6496s.h(str, ActionType.LINK);
        a l10 = l(str);
        if (l10 != null) {
            return l10.c();
        }
        return null;
    }

    public final String s() {
        return this.f73479a;
    }

    public final URI t() {
        String aVar = k().q().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new m("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").e(aVar, ""));
                C6496s.g(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f73487i;
    }

    public final URL u() {
        try {
            return new URL(this.f73487i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
