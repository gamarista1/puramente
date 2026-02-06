package ca;

import W9.b;
import W9.g;
import W9.h;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import ja.B;
import ja.C3645a;
import ja.s;
import ja.t;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends g {

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f36564q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f36565r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f36566o = new StringBuilder();

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList f36567p = new ArrayList();

    public a() {
        super("SubripDecoder");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private W9.b B(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            W9.b$b r1 = new W9.b$b
            r1.<init>()
            r2 = r17
            W9.b$b r1 = r1.o(r2)
            if (r0 != 0) goto L_0x0014
            W9.b r0 = r1.a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r3 = "{\\an1}"
            java.lang.String r5 = "{\\an2}"
            java.lang.String r6 = "{\\an3}"
            java.lang.String r7 = "{\\an4}"
            java.lang.String r9 = "{\\an5}"
            java.lang.String r10 = "{\\an6}"
            java.lang.String r11 = "{\\an7}"
            java.lang.String r13 = "{\\an8}"
            java.lang.String r14 = "{\\an9}"
            r4 = 3
            r8 = 4
            r15 = 1
            r12 = 2
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = r12
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = r8
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = r15
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = r4
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r3)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r12) goto L_0x0091
            if (r2 == r4) goto L_0x008d
            if (r2 == r8) goto L_0x008d
            r8 = 5
            if (r2 == r8) goto L_0x008d
            r1.l(r15)
            goto L_0x0095
        L_0x008d:
            r1.l(r12)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.l(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = r4
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = r12
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00e6
            r0 = r15
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r12) goto L_0x00fe
            if (r0 == r4) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.i(r15)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.i(r0)
            goto L_0x0101
        L_0x00fe:
            r1.i(r12)
        L_0x0101:
            int r0 = r1.d()
            float r0 = C(r0)
            W9.b$b r0 = r1.k(r0)
            int r1 = r1.c()
            float r1 = C(r1)
            r2 = 0
            W9.b$b r0 = r0.h(r1, r2)
            W9.b r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.B(android.text.Spanned, java.lang.String):W9.b");
    }

    static float C(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long D(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        long parseLong = j10 + (Long.parseLong((String) C3645a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) C3645a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String E(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f36565r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        String str;
        ArrayList arrayList = new ArrayList();
        t tVar = new t();
        B b10 = new B(bArr, i10);
        while (true) {
            String p10 = b10.p();
            int i11 = 0;
            if (p10 == null) {
                break;
            } else if (p10.length() != 0) {
                try {
                    Integer.parseInt(p10);
                    String p11 = b10.p();
                    if (p11 == null) {
                        s.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f36564q.matcher(p11);
                    if (matcher.matches()) {
                        tVar.a(D(matcher, 1));
                        tVar.a(D(matcher, 6));
                        this.f36566o.setLength(0);
                        this.f36567p.clear();
                        for (String p12 = b10.p(); !TextUtils.isEmpty(p12); p12 = b10.p()) {
                            if (this.f36566o.length() > 0) {
                                this.f36566o.append("<br>");
                            }
                            this.f36566o.append(E(p12, this.f36567p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f36566o.toString());
                        while (true) {
                            if (i11 >= this.f36567p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f36567p.get(i11);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(b.f34926r);
                    } else {
                        s.i("SubripDecoder", "Skipping invalid timing: " + p11);
                    }
                } catch (NumberFormatException unused) {
                    s.i("SubripDecoder", "Skipping invalid index: " + p10);
                }
            }
        }
        return new b((b[]) arrayList.toArray(new b[0]), tVar.d());
    }
}
