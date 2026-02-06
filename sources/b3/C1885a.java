package b3;

import W2.e;
import W2.s;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.C4770v;
import i2.C2073A;
import i2.C2076a;
import i2.C2082g;
import i2.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5110e;

/* renamed from: b3.a  reason: case insensitive filesystem */
public final class C1885a implements s {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f19167d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f19168e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f19169a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f19170b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f19171c = new C2073A();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h2.C2030a d(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            h2.a$b r1 = new h2.a$b
            r1.<init>()
            r2 = r17
            h2.a$b r1 = r1.o(r2)
            if (r0 != 0) goto L_0x0014
            h2.a r0 = r1.a()
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
            float r0 = f(r0)
            h2.a$b r0 = r1.k(r0)
            int r1 = r1.c()
            float r1 = f(r1)
            r2 = 0
            h2.a$b r0 = r0.h(r1, r2)
            h2.a r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C1885a.d(android.text.Spanned, java.lang.String):h2.a");
    }

    private Charset e(C2073A a10) {
        Charset P10 = a10.P();
        if (P10 != null) {
            return P10;
        }
        return C5110e.f61085c;
    }

    public static float f(int i10) {
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

    private static long g(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        long parseLong = j10 + (Long.parseLong((String) C2076a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) C2076a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String h(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f19168e.matcher(trim);
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

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        ArrayList<e> arrayList;
        String str;
        C2082g gVar2;
        String str2;
        String str3;
        C2082g gVar3;
        int i12 = i10;
        s.b bVar2 = bVar;
        C2082g gVar4 = gVar;
        String str4 = "SubripParser";
        this.f19171c.S(bArr, i12 + i11);
        this.f19171c.U(i12);
        Charset e10 = e(this.f19171c);
        if (bVar2.f8666a == -9223372036854775807L || !bVar2.f8667b) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
        }
        while (true) {
            String t10 = this.f19171c.t(e10);
            if (t10 == null) {
                break;
            } else if (t10.length() != 0) {
                try {
                    Integer.parseInt(t10);
                    String t11 = this.f19171c.t(e10);
                    if (t11 == null) {
                        p.h(str4, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f19167d.matcher(t11);
                    if (matcher.matches()) {
                        long g10 = g(matcher, 1);
                        long g11 = g(matcher, 6);
                        int i13 = 0;
                        this.f19169a.setLength(0);
                        this.f19170b.clear();
                        for (String t12 = this.f19171c.t(e10); !TextUtils.isEmpty(t12); t12 = this.f19171c.t(e10)) {
                            if (this.f19169a.length() > 0) {
                                this.f19169a.append("<br>");
                            }
                            this.f19169a.append(h(t12, this.f19170b));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f19169a.toString());
                        while (true) {
                            if (i13 >= this.f19170b.size()) {
                                str2 = str4;
                                str3 = null;
                                break;
                            }
                            str3 = (String) this.f19170b.get(i13);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i13++;
                        }
                        long j10 = bVar2.f8666a;
                        if (j10 == -9223372036854775807L || g10 >= j10) {
                            gVar3 = gVar;
                            gVar3.accept(new e(C4770v.H(d(fromHtml, str3)), g10, g11 - g10));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new e(C4770v.H(d(fromHtml, str3)), g10, g11 - g10));
                            }
                            gVar3 = gVar;
                        }
                        gVar4 = gVar3;
                        str4 = str2;
                    } else {
                        String str5 = str4;
                        gVar2 = gVar4;
                        str = str5;
                        p.h(str, "Skipping invalid timing: " + t11);
                        gVar4 = gVar2;
                        str4 = str;
                    }
                } catch (NumberFormatException unused) {
                    str = str4;
                    gVar2 = gVar4;
                    p.h(str, "Skipping invalid index: " + t10);
                }
            }
        }
        C2082g gVar5 = gVar4;
        if (arrayList != null) {
            for (e accept : arrayList) {
                gVar5.accept(accept);
            }
        }
    }

    public int c() {
        return 1;
    }
}
