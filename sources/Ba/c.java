package ba;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f36349a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36350b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f36351c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f36352d;

    /* renamed from: e  reason: collision with root package name */
    public final float f36353e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f36354f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f36355g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f36356h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f36357i;

    /* renamed from: j  reason: collision with root package name */
    public final int f36358j;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f36359a;

        /* renamed from: b  reason: collision with root package name */
        public final int f36360b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36361c;

        /* renamed from: d  reason: collision with root package name */
        public final int f36362d;

        /* renamed from: e  reason: collision with root package name */
        public final int f36363e;

        /* renamed from: f  reason: collision with root package name */
        public final int f36364f;

        /* renamed from: g  reason: collision with root package name */
        public final int f36365g;

        /* renamed from: h  reason: collision with root package name */
        public final int f36366h;

        /* renamed from: i  reason: collision with root package name */
        public final int f36367i;

        /* renamed from: j  reason: collision with root package name */
        public final int f36368j;

        /* renamed from: k  reason: collision with root package name */
        public final int f36369k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f36359a = i10;
            this.f36360b = i11;
            this.f36361c = i12;
            this.f36362d = i13;
            this.f36363e = i14;
            this.f36364f = i15;
            this.f36365g = i16;
            this.f36366h = i17;
            this.f36367i = i18;
            this.f36368j = i19;
            this.f36369k = i20;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static ba.c.a a(java.lang.String r18) {
            /*
                r0 = 1
                r1 = 7
                r2 = r18
                java.lang.String r2 = r2.substring(r1)
                java.lang.String r3 = ","
                java.lang.String[] r2 = android.text.TextUtils.split(r2, r3)
                r3 = -1
                r4 = 0
                r7 = r3
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r16 = r15
                r5 = r4
            L_0x001c:
                int r6 = r2.length
                if (r5 >= r6) goto L_0x00c3
                r6 = r2[r5]
                java.lang.String r6 = r6.trim()
                java.lang.String r6 = nb.C5108c.e(r6)
                r6.hashCode()
                int r17 = r6.hashCode()
                switch(r17) {
                    case -1178781136: goto L_0x009d;
                    case -1026963764: goto L_0x0092;
                    case -192095652: goto L_0x0087;
                    case -70925746: goto L_0x007c;
                    case 3029637: goto L_0x0071;
                    case 3373707: goto L_0x0066;
                    case 366554320: goto L_0x005b;
                    case 767321349: goto L_0x0050;
                    case 1767875043: goto L_0x0043;
                    case 1988365454: goto L_0x0036;
                    default: goto L_0x0033;
                }
            L_0x0033:
                r1 = r3
                goto L_0x00a7
            L_0x0036:
                java.lang.String r1 = "outlinecolour"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x003f
                goto L_0x0033
            L_0x003f:
                r1 = 9
                goto L_0x00a7
            L_0x0043:
                java.lang.String r1 = "alignment"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x004c
                goto L_0x0033
            L_0x004c:
                r1 = 8
                goto L_0x00a7
            L_0x0050:
                java.lang.String r1 = "borderstyle"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0059
                goto L_0x0033
            L_0x0059:
                r1 = 7
                goto L_0x00a7
            L_0x005b:
                java.lang.String r1 = "fontsize"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0064
                goto L_0x0033
            L_0x0064:
                r1 = 6
                goto L_0x00a7
            L_0x0066:
                java.lang.String r1 = "name"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x006f
                goto L_0x0033
            L_0x006f:
                r1 = 5
                goto L_0x00a7
            L_0x0071:
                java.lang.String r1 = "bold"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x007a
                goto L_0x0033
            L_0x007a:
                r1 = 4
                goto L_0x00a7
            L_0x007c:
                java.lang.String r1 = "primarycolour"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0085
                goto L_0x0033
            L_0x0085:
                r1 = 3
                goto L_0x00a7
            L_0x0087:
                java.lang.String r1 = "strikeout"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x0090
                goto L_0x0033
            L_0x0090:
                r1 = 2
                goto L_0x00a7
            L_0x0092:
                java.lang.String r1 = "underline"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x009b
                goto L_0x0033
            L_0x009b:
                r1 = r0
                goto L_0x00a7
            L_0x009d:
                java.lang.String r1 = "italic"
                boolean r1 = r6.equals(r1)
                if (r1 != 0) goto L_0x00a6
                goto L_0x0033
            L_0x00a6:
                r1 = r4
            L_0x00a7:
                switch(r1) {
                    case 0: goto L_0x00be;
                    case 1: goto L_0x00bc;
                    case 2: goto L_0x00ba;
                    case 3: goto L_0x00b8;
                    case 4: goto L_0x00b6;
                    case 5: goto L_0x00b4;
                    case 6: goto L_0x00b2;
                    case 7: goto L_0x00af;
                    case 8: goto L_0x00ad;
                    case 9: goto L_0x00ab;
                    default: goto L_0x00aa;
                }
            L_0x00aa:
                goto L_0x00bf
            L_0x00ab:
                r10 = r5
                goto L_0x00bf
            L_0x00ad:
                r8 = r5
                goto L_0x00bf
            L_0x00af:
                r16 = r5
                goto L_0x00bf
            L_0x00b2:
                r11 = r5
                goto L_0x00bf
            L_0x00b4:
                r7 = r5
                goto L_0x00bf
            L_0x00b6:
                r12 = r5
                goto L_0x00bf
            L_0x00b8:
                r9 = r5
                goto L_0x00bf
            L_0x00ba:
                r15 = r5
                goto L_0x00bf
            L_0x00bc:
                r14 = r5
                goto L_0x00bf
            L_0x00be:
                r13 = r5
            L_0x00bf:
                int r5 = r5 + r0
                r1 = 7
                goto L_0x001c
            L_0x00c3:
                if (r7 == r3) goto L_0x00cf
                ba.c$a r0 = new ba.c$a
                int r1 = r2.length
                r6 = r0
                r17 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00d0
            L_0x00cf:
                r0 = 0
            L_0x00d0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.c.a.a(java.lang.String):ba.c$a");
        }
    }

    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f36370c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f36371d = Pattern.compile(M.C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f36372e = Pattern.compile(M.C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f36373f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f36374a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f36375b;

        private b(int i10, PointF pointF) {
            this.f36374a = i10;
            this.f36375b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f36373f.matcher(str);
            if (matcher.find()) {
                return c.e((String) C3645a.e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|6|(1:8)|9|10|(2:12|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static ba.c.b b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f36370c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = r0
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x0029
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = ja.C3645a.e(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = a(r3)     // Catch:{ RuntimeException -> 0x0009 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                ba.c$b r5 = new ba.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.c.b.b(java.lang.String):ba.c$b");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f36371d.matcher(str);
            Matcher matcher2 = f36372e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    s.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C3645a.e(str2)).trim()), Float.parseFloat(((String) C3645a.e(str3)).trim()));
        }

        public static String d(String str) {
            return f36370c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f36349a = str;
        this.f36350b = i10;
        this.f36351c = num;
        this.f36352d = num2;
        this.f36353e = f10;
        this.f36354f = z10;
        this.f36355g = z11;
        this.f36356h = z12;
        this.f36357i = z13;
        this.f36358j = i11;
    }

    public static c b(String str, a aVar) {
        int i10;
        Integer num;
        Integer num2;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        String str2 = str;
        a aVar2 = aVar;
        C3645a.a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), f.f37529a);
        int length = split.length;
        int i12 = aVar2.f36369k;
        if (length != i12) {
            s.i("SsaStyle", M.C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i12), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            String trim = split[aVar2.f36359a].trim();
            int i13 = aVar2.f36360b;
            if (i13 != -1) {
                i10 = e(split[i13].trim());
            } else {
                i10 = -1;
            }
            int i14 = aVar2.f36361c;
            if (i14 != -1) {
                num = h(split[i14].trim());
            } else {
                num = null;
            }
            int i15 = aVar2.f36362d;
            if (i15 != -1) {
                num2 = h(split[i15].trim());
            } else {
                num2 = null;
            }
            int i16 = aVar2.f36363e;
            if (i16 != -1) {
                f10 = i(split[i16].trim());
            } else {
                f10 = -3.4028235E38f;
            }
            float f11 = f10;
            int i17 = aVar2.f36364f;
            if (i17 == -1 || !f(split[i17].trim())) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i18 = aVar2.f36365g;
            if (i18 == -1 || !f(split[i18].trim())) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i19 = aVar2.f36366h;
            if (i19 == -1 || !f(split[i19].trim())) {
                z12 = false;
            } else {
                z12 = true;
            }
            int i20 = aVar2.f36367i;
            if (i20 == -1 || !f(split[i20].trim())) {
                z13 = false;
            } else {
                z13 = true;
            }
            int i21 = aVar2.f36368j;
            if (i21 != -1) {
                i11 = g(split[i21].trim());
            } else {
                i11 = -1;
            }
            return new c(trim, i10, num, num2, f11, z10, z11, z12, z13, i11);
        } catch (RuntimeException e10) {
            s.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        s.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                return true;
            }
            return false;
        } catch (NumberFormatException e10) {
            s.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        s.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        long j10;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            if (j10 <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.a(z10);
            int d10 = com.google.common.primitives.f.d(((j10 >> 24) & 255) ^ 255);
            int d11 = com.google.common.primitives.f.d((j10 >> 16) & 255);
            return Integer.valueOf(Color.argb(d10, com.google.common.primitives.f.d(j10 & 255), com.google.common.primitives.f.d((j10 >> 8) & 255), d11));
        } catch (IllegalArgumentException e10) {
            s.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            s.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
