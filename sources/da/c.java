package da;

import W9.g;
import W9.h;
import W9.j;
import android.text.Layout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import ja.C3645a;
import ja.M;
import ja.N;
import ja.s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.C5108c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class c extends g {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f43185p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f43186q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f43187r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s  reason: collision with root package name */
    static final Pattern f43188s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    static final Pattern f43189t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f43190u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f43191v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w  reason: collision with root package name */
    private static final b f43192w = new b(30.0f, 1, 1);

    /* renamed from: x  reason: collision with root package name */
    private static final a f43193x = new a(32, 15);

    /* renamed from: o  reason: collision with root package name */
    private final XmlPullParserFactory f43194o;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f43195a;

        /* renamed from: b  reason: collision with root package name */
        final int f43196b;

        a(int i10, int i11) {
            this.f43195a = i10;
            this.f43196b = i11;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final float f43197a;

        /* renamed from: b  reason: collision with root package name */
        final int f43198b;

        /* renamed from: c  reason: collision with root package name */
        final int f43199c;

        b(float f10, int i10, int i11) {
            this.f43197a = f10;
            this.f43198b = i10;
            this.f43199c = i11;
        }
    }

    /* renamed from: da.c$c  reason: collision with other inner class name */
    private static final class C0669c {

        /* renamed from: a  reason: collision with root package name */
        final int f43200a;

        /* renamed from: b  reason: collision with root package name */
        final int f43201b;

        C0669c(int i10, int i11) {
            this.f43200a = i10;
            this.f43201b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f43194o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g B(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    private static boolean C(String str) {
        if (str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals(AppearanceType.IMAGE) || str.equals("data") || str.equals("information")) {
            return true;
        }
        return false;
    }

    private static Layout.Alignment D(String str) {
        String e10 = C5108c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1364013995:
                if (e10.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (e10.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e10.equals(BlockAlignment.LEFT)) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e10.equals(BlockAlignment.RIGHT)) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e10.equals(OpsMetricTracker.START)) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a E(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f43191v.matcher(attributeValue);
        if (!matcher.matches()) {
            s.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) C3645a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C3645a.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new j("Invalid cell resolution " + parseInt + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + parseInt2);
        } catch (NumberFormatException unused) {
            s.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void F(String str, g gVar) {
        Matcher matcher;
        String[] R02 = M.R0(str, "\\s+");
        if (R02.length == 1) {
            matcher = f43187r.matcher(str);
        } else if (R02.length == 2) {
            matcher = f43187r.matcher(R02[1]);
            s.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new j("Invalid number of entries for fontSize: " + R02.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) C3645a.e(matcher.group(3));
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.z(3);
                    break;
                case 1:
                    gVar.z(2);
                    break;
                case 2:
                    gVar.z(1);
                    break;
                default:
                    throw new j("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.y(Float.parseFloat((String) C3645a.e(matcher.group(1))));
            return;
        }
        throw new j("Invalid expression for fontSize: '" + str + "'.");
    }

    private static b G(XmlPullParser xmlPullParser) {
        int i10;
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] R02 = M.R0(attributeValue2, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (R02.length == 2) {
                f10 = ((float) Integer.parseInt(R02[0])) / ((float) Integer.parseInt(R02[1]));
            } else {
                throw new j("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        b bVar = f43192w;
        int i11 = bVar.f43198b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f43199c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) i10) * f10, i11, i12);
    }

    private static Map H(XmlPullParser xmlPullParser, Map map, a aVar, C0669c cVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "style")) {
                String a10 = N.a(xmlPullParser, "style");
                g M10 = M(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : N(a10)) {
                        M10.a((g) map.get(str));
                    }
                }
                String g10 = M10.g();
                if (g10 != null) {
                    map.put(g10, M10);
                }
            } else if (N.f(xmlPullParser, "region")) {
                e K10 = K(xmlPullParser, aVar, cVar);
                if (K10 != null) {
                    map2.put(K10.f43215a, K10);
                }
            } else if (N.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!N.d(xmlPullParser, "head"));
        return map;
    }

    private static void I(XmlPullParser xmlPullParser, Map map) {
        String a10;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, AppearanceType.IMAGE) && (a10 = N.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!N.d(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static da.d J(org.xmlpull.v1.XmlPullParser r20, da.d r21, java.util.Map r22, da.c.b r23) {
        /*
            r0 = r20
            r9 = r21
            r1 = r23
            r2 = 1
            int r3 = r20.getAttributeCount()
            r4 = 0
            da.g r5 = M(r0, r4)
            java.lang.String r8 = ""
            r12 = r4
            r11 = r8
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r12
            r4 = 0
        L_0x0025:
            if (r4 >= r3) goto L_0x00b5
            java.lang.String r10 = r0.getAttributeName(r4)
            java.lang.String r6 = r0.getAttributeValue(r4)
            r10.hashCode()
            int r19 = r10.hashCode()
            switch(r19) {
                case -934795532: goto L_0x0072;
                case 99841: goto L_0x0067;
                case 100571: goto L_0x005c;
                case 93616297: goto L_0x0051;
                case 109780401: goto L_0x0046;
                case 1292595405: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            r7 = -1
            goto L_0x007c
        L_0x003b:
            java.lang.String r7 = "backgroundImage"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0044
            goto L_0x0039
        L_0x0044:
            r7 = 5
            goto L_0x007c
        L_0x0046:
            java.lang.String r7 = "style"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            r7 = 4
            goto L_0x007c
        L_0x0051:
            java.lang.String r7 = "begin"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x005a
            goto L_0x0039
        L_0x005a:
            r7 = 3
            goto L_0x007c
        L_0x005c:
            java.lang.String r7 = "end"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0065
            goto L_0x0039
        L_0x0065:
            r7 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r7 = "dur"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0070
            goto L_0x0039
        L_0x0070:
            r7 = r2
            goto L_0x007c
        L_0x0072:
            java.lang.String r7 = "region"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x007b
            goto L_0x0039
        L_0x007b:
            r7 = 0
        L_0x007c:
            switch(r7) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009f;
                case 3: goto L_0x009a;
                case 4: goto L_0x008f;
                case 5: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x008c
        L_0x0080:
            java.lang.String r7 = "#"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x008c
            java.lang.String r12 = r6.substring(r2)
        L_0x008c:
            r7 = r22
            goto L_0x00b2
        L_0x008f:
            java.lang.String[] r6 = N(r6)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x008c
            r7 = r22
            r8 = r6
            goto L_0x00b2
        L_0x009a:
            long r13 = O(r6, r1)
            goto L_0x008c
        L_0x009f:
            long r15 = O(r6, r1)
            goto L_0x008c
        L_0x00a4:
            long r17 = O(r6, r1)
            goto L_0x008c
        L_0x00a9:
            r7 = r22
            boolean r10 = r7.containsKey(r6)
            if (r10 == 0) goto L_0x00b2
            r11 = r6
        L_0x00b2:
            int r4 = r4 + r2
            goto L_0x0025
        L_0x00b5:
            if (r9 == 0) goto L_0x00ce
            long r1 = r9.f43205d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00cc
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00c7
            long r13 = r13 + r1
        L_0x00c7:
            int r6 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00cc
            long r15 = r15 + r1
        L_0x00cc:
            r1 = r13
            goto L_0x00d4
        L_0x00ce:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00cc
        L_0x00d4:
            int r6 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00eb
            int r6 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00e1
            long r17 = r1 + r17
            r3 = r17
            goto L_0x00ec
        L_0x00e1:
            if (r9 == 0) goto L_0x00eb
            long r6 = r9.f43206e
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00eb
            r3 = r6
            goto L_0x00ec
        L_0x00eb:
            r3 = r15
        L_0x00ec:
            java.lang.String r0 = r20.getName()
            r6 = r8
            r7 = r11
            r8 = r12
            r9 = r21
            da.d r0 = da.d.c(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c.J(org.xmlpull.v1.XmlPullParser, da.d, java.util.Map, da.c$b):da.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ac, code lost:
        if (r0.equals("tb") == false) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static da.e K(org.xmlpull.v1.XmlPullParser r18, da.c.a r19, da.c.C0669c r20) {
        /*
            r0 = r18
            r1 = r20
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.String r5 = "id"
            java.lang.String r7 = ja.N.a(r0, r5)
            r5 = 0
            if (r7 != 0) goto L_0x0011
            return r5
        L_0x0011:
            java.lang.String r6 = "origin"
            java.lang.String r6 = ja.N.a(r0, r6)
            java.lang.String r8 = "TtmlDecoder"
            if (r6 == 0) goto L_0x021e
            java.util.regex.Pattern r9 = f43189t
            java.util.regex.Matcher r10 = r9.matcher(r6)
            java.util.regex.Pattern r11 = f43190u
            java.util.regex.Matcher r12 = r11.matcher(r6)
            boolean r13 = r10.matches()
            java.lang.String r14 = "Ignoring region with missing tts:extent: "
            java.lang.String r15 = "Ignoring region with malformed origin: "
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r13 == 0) goto L_0x006c
            java.lang.String r12 = r10.group(r3)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.Object r12 = ja.C3645a.e(r12)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x0059 }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0059 }
            float r12 = r12 / r16
            java.lang.String r10 = r10.group(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.Object r10 = ja.C3645a.e(r10)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0059 }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x0059 }
            float r10 = r10 / r16
            r17 = r12
            r12 = r10
            r10 = r17
            goto L_0x00ad
        L_0x0059:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x006c:
            boolean r10 = r12.matches()
            if (r10 == 0) goto L_0x0209
            if (r1 != 0) goto L_0x0087
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x0087:
            java.lang.String r10 = r12.group(r3)     // Catch:{ NumberFormatException -> 0x01f6 }
            java.lang.Object r10 = ja.C3645a.e(r10)     // Catch:{ NumberFormatException -> 0x01f6 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x01f6 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01f6 }
            java.lang.String r12 = r12.group(r4)     // Catch:{ NumberFormatException -> 0x01f6 }
            java.lang.Object r12 = ja.C3645a.e(r12)     // Catch:{ NumberFormatException -> 0x01f6 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x01f6 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01f6 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01f6 }
            int r13 = r1.f43200a     // Catch:{ NumberFormatException -> 0x01f6 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01f6 }
            float r10 = r10 / r13
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x01f6 }
            int r13 = r1.f43201b     // Catch:{ NumberFormatException -> 0x01f6 }
            float r13 = (float) r13
            float r12 = r12 / r13
        L_0x00ad:
            java.lang.String r13 = "extent"
            java.lang.String r13 = ja.N.a(r0, r13)
            if (r13 == 0) goto L_0x01f0
            java.util.regex.Matcher r9 = r9.matcher(r13)
            java.util.regex.Matcher r11 = r11.matcher(r13)
            boolean r13 = r9.matches()
            java.lang.String r15 = "Ignoring region with malformed extent: "
            if (r13 == 0) goto L_0x00fa
            java.lang.String r1 = r9.group(r3)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Object r1 = ja.C3645a.e(r1)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e7 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e7 }
            float r1 = r1 / r16
            java.lang.String r9 = r9.group(r4)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Object r9 = ja.C3645a.e(r9)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x00e7 }
            float r5 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00e7 }
            float r5 = r5 / r16
            r13 = r5
            goto L_0x013d
        L_0x00e7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x00fa:
            boolean r9 = r11.matches()
            if (r9 == 0) goto L_0x01db
            if (r1 != 0) goto L_0x0115
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x0115:
            java.lang.String r9 = r11.group(r3)     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.Object r9 = ja.C3645a.e(r9)     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01c8 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.String r11 = r11.group(r4)     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.Object r11 = ja.C3645a.e(r11)     // Catch:{ NumberFormatException -> 0x01c8 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x01c8 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01c8 }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01c8 }
            int r13 = r1.f43200a     // Catch:{ NumberFormatException -> 0x01c8 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01c8 }
            float r9 = r9 / r13
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x01c8 }
            int r1 = r1.f43201b     // Catch:{ NumberFormatException -> 0x01c8 }
            float r1 = (float) r1
            float r11 = r11 / r1
            r1 = r9
            r13 = r11
        L_0x013d:
            java.lang.String r5 = "displayAlign"
            java.lang.String r5 = ja.N.a(r0, r5)
            if (r5 == 0) goto L_0x016c
            java.lang.String r5 = nb.C5108c.e(r5)
            r5.hashCode()
            java.lang.String r6 = "center"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0163
            java.lang.String r6 = "after"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x015d
            goto L_0x016c
        L_0x015d:
            float r12 = r12 + r13
            r5 = r19
            r11 = r4
        L_0x0161:
            r9 = r12
            goto L_0x0170
        L_0x0163:
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r13 / r5
            float r12 = r12 + r5
            r5 = r19
            r11 = r3
            goto L_0x0161
        L_0x016c:
            r5 = r19
            r11 = r2
            goto L_0x0161
        L_0x0170:
            int r5 = r5.f43196b
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r15 = r6 / r5
            java.lang.String r5 = "writingMode"
            java.lang.String r0 = ja.N.a(r0, r5)
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = nb.C5108c.e(r0)
            r0.hashCode()
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case 3694: goto L_0x01a6;
                case 3553396: goto L_0x019b;
                case 3553576: goto L_0x0190;
                default: goto L_0x018e;
            }
        L_0x018e:
            r2 = r5
            goto L_0x01af
        L_0x0190:
            java.lang.String r2 = "tbrl"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0199
            goto L_0x018e
        L_0x0199:
            r2 = r4
            goto L_0x01af
        L_0x019b:
            java.lang.String r2 = "tblr"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01a4
            goto L_0x018e
        L_0x01a4:
            r2 = r3
            goto L_0x01af
        L_0x01a6:
            java.lang.String r6 = "tb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01af
            goto L_0x018e
        L_0x01af:
            switch(r2) {
                case 0: goto L_0x01b6;
                case 1: goto L_0x01b6;
                case 2: goto L_0x01b3;
                default: goto L_0x01b2;
            }
        L_0x01b2:
            goto L_0x01b9
        L_0x01b3:
            r16 = r3
            goto L_0x01bc
        L_0x01b6:
            r16 = r4
            goto L_0x01bc
        L_0x01b9:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01b3
        L_0x01bc:
            da.e r0 = new da.e
            r2 = 0
            r14 = 1
            r6 = r0
            r8 = r10
            r10 = r2
            r12 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x01c8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x01db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x01f0:
            java.lang.String r0 = "Ignoring region without an extent"
            ja.s.i(r8, r0)
            return r5
        L_0x01f6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x0209:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            ja.s.i(r8, r0)
            return r5
        L_0x021e:
            java.lang.String r0 = "Ignoring region without an origin"
            ja.s.i(r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c.K(org.xmlpull.v1.XmlPullParser, da.c$a, da.c$c):da.e");
    }

    private static float L(String str) {
        Matcher matcher = f43188s.matcher(str);
        if (!matcher.matches()) {
            s.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C3645a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            s.j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static da.g M(org.xmlpull.v1.XmlPullParser r13, da.g r14) {
        /*
            r0 = 5
            r1 = 4
            r2 = -1
            r3 = 3
            r4 = 2
            r5 = 1
            int r6 = r13.getAttributeCount()
            r7 = 0
            r8 = r7
        L_0x000c:
            if (r8 >= r6) goto L_0x02f8
            java.lang.String r9 = r13.getAttributeValue(r8)
            java.lang.String r10 = r13.getAttributeName(r8)
            r10.hashCode()
            java.lang.String r11 = "TtmlDecoder"
            int r12 = r10.hashCode()
            switch(r12) {
                case -1550943582: goto L_0x00d1;
                case -1224696685: goto L_0x00c5;
                case -1065511464: goto L_0x00b9;
                case -879295043: goto L_0x00ad;
                case -734428249: goto L_0x00a1;
                case 3355: goto L_0x0096;
                case 3511770: goto L_0x008b;
                case 94842723: goto L_0x0080;
                case 109403361: goto L_0x0073;
                case 110138194: goto L_0x0066;
                case 365601008: goto L_0x0059;
                case 921125321: goto L_0x004c;
                case 1115953443: goto L_0x003f;
                case 1287124693: goto L_0x0032;
                case 1754920356: goto L_0x0025;
                default: goto L_0x0022;
            }
        L_0x0022:
            r10 = r2
            goto L_0x00dc
        L_0x0025:
            java.lang.String r12 = "multiRowAlign"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x002e
            goto L_0x0022
        L_0x002e:
            r10 = 14
            goto L_0x00dc
        L_0x0032:
            java.lang.String r12 = "backgroundColor"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x003b
            goto L_0x0022
        L_0x003b:
            r10 = 13
            goto L_0x00dc
        L_0x003f:
            java.lang.String r12 = "rubyPosition"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0048
            goto L_0x0022
        L_0x0048:
            r10 = 12
            goto L_0x00dc
        L_0x004c:
            java.lang.String r12 = "textEmphasis"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0055
            goto L_0x0022
        L_0x0055:
            r10 = 11
            goto L_0x00dc
        L_0x0059:
            java.lang.String r12 = "fontSize"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0062
            goto L_0x0022
        L_0x0062:
            r10 = 10
            goto L_0x00dc
        L_0x0066:
            java.lang.String r12 = "textCombine"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x006f
            goto L_0x0022
        L_0x006f:
            r10 = 9
            goto L_0x00dc
        L_0x0073:
            java.lang.String r12 = "shear"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x007c
            goto L_0x0022
        L_0x007c:
            r10 = 8
            goto L_0x00dc
        L_0x0080:
            java.lang.String r12 = "color"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0089
            goto L_0x0022
        L_0x0089:
            r10 = 7
            goto L_0x00dc
        L_0x008b:
            java.lang.String r12 = "ruby"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0094
            goto L_0x0022
        L_0x0094:
            r10 = 6
            goto L_0x00dc
        L_0x0096:
            java.lang.String r12 = "id"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x009f
            goto L_0x0022
        L_0x009f:
            r10 = r0
            goto L_0x00dc
        L_0x00a1:
            java.lang.String r12 = "fontWeight"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00ab
            goto L_0x0022
        L_0x00ab:
            r10 = r1
            goto L_0x00dc
        L_0x00ad:
            java.lang.String r12 = "textDecoration"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00b7
            goto L_0x0022
        L_0x00b7:
            r10 = r3
            goto L_0x00dc
        L_0x00b9:
            java.lang.String r12 = "textAlign"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00c3
            goto L_0x0022
        L_0x00c3:
            r10 = r4
            goto L_0x00dc
        L_0x00c5:
            java.lang.String r12 = "fontFamily"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00cf
            goto L_0x0022
        L_0x00cf:
            r10 = r5
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r12 = "fontStyle"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00db
            goto L_0x0022
        L_0x00db:
            r10 = r7
        L_0x00dc:
            switch(r10) {
                case 0: goto L_0x02e7;
                case 1: goto L_0x02de;
                case 2: goto L_0x02d1;
                case 3: goto L_0x026e;
                case 4: goto L_0x025e;
                case 5: goto L_0x0248;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01a7;
                case 8: goto L_0x0199;
                case 9: goto L_0x016c;
                case 10: goto L_0x014d;
                case 11: goto L_0x013f;
                case 12: goto L_0x0112;
                case 13: goto L_0x00ef;
                case 14: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x02f5
        L_0x00e1:
            da.g r14 = B(r14)
            android.text.Layout$Alignment r9 = D(r9)
            da.g r14 = r14.D(r9)
            goto L_0x02f5
        L_0x00ef:
            da.g r14 = B(r14)
            int r10 = ja.C3650f.c(r9)     // Catch:{ IllegalArgumentException -> 0x00fc }
            r14.u(r10)     // Catch:{ IllegalArgumentException -> 0x00fc }
            goto L_0x02f5
        L_0x00fc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Failed parsing background value: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            ja.s.i(r11, r9)
            goto L_0x02f5
        L_0x0112:
            java.lang.String r9 = nb.C5108c.e(r9)
            r9.hashCode()
            java.lang.String r10 = "before"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0135
            java.lang.String r10 = "after"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x012b
            goto L_0x02f5
        L_0x012b:
            da.g r14 = B(r14)
            da.g r14 = r14.E(r4)
            goto L_0x02f5
        L_0x0135:
            da.g r14 = B(r14)
            da.g r14 = r14.E(r5)
            goto L_0x02f5
        L_0x013f:
            da.g r14 = B(r14)
            da.b r9 = da.b.a(r9)
            da.g r14 = r14.J(r9)
            goto L_0x02f5
        L_0x014d:
            da.g r14 = B(r14)     // Catch:{ j -> 0x0156 }
            F(r9, r14)     // Catch:{ j -> 0x0156 }
            goto L_0x02f5
        L_0x0156:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Failed parsing fontSize value: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            ja.s.i(r11, r9)
            goto L_0x02f5
        L_0x016c:
            java.lang.String r9 = nb.C5108c.e(r9)
            r9.hashCode()
            java.lang.String r10 = "all"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x018f
            java.lang.String r10 = "none"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0185
            goto L_0x02f5
        L_0x0185:
            da.g r14 = B(r14)
            da.g r14 = r14.I(r7)
            goto L_0x02f5
        L_0x018f:
            da.g r14 = B(r14)
            da.g r14 = r14.I(r5)
            goto L_0x02f5
        L_0x0199:
            da.g r14 = B(r14)
            float r9 = L(r9)
            da.g r14 = r14.G(r9)
            goto L_0x02f5
        L_0x01a7:
            da.g r14 = B(r14)
            int r10 = ja.C3650f.c(r9)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            r14.w(r10)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            goto L_0x02f5
        L_0x01b4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Failed parsing color value: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            ja.s.i(r11, r9)
            goto L_0x02f5
        L_0x01ca:
            java.lang.String r9 = nb.C5108c.e(r9)
            r9.hashCode()
            int r10 = r9.hashCode()
            switch(r10) {
                case -618561360: goto L_0x0211;
                case -410956671: goto L_0x0206;
                case -250518009: goto L_0x01fb;
                case -136074796: goto L_0x01f0;
                case 3016401: goto L_0x01e5;
                case 3556653: goto L_0x01da;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            r9 = r2
            goto L_0x021b
        L_0x01da:
            java.lang.String r10 = "text"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01e3
            goto L_0x01d8
        L_0x01e3:
            r9 = r0
            goto L_0x021b
        L_0x01e5:
            java.lang.String r10 = "base"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01ee
            goto L_0x01d8
        L_0x01ee:
            r9 = r1
            goto L_0x021b
        L_0x01f0:
            java.lang.String r10 = "textContainer"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01f9
            goto L_0x01d8
        L_0x01f9:
            r9 = r3
            goto L_0x021b
        L_0x01fb:
            java.lang.String r10 = "delimiter"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0204
            goto L_0x01d8
        L_0x0204:
            r9 = r4
            goto L_0x021b
        L_0x0206:
            java.lang.String r10 = "container"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x020f
            goto L_0x01d8
        L_0x020f:
            r9 = r5
            goto L_0x021b
        L_0x0211:
            java.lang.String r10 = "baseContainer"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x021a
            goto L_0x01d8
        L_0x021a:
            r9 = r7
        L_0x021b:
            switch(r9) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0234;
                case 2: goto L_0x022a;
                case 3: goto L_0x0220;
                case 4: goto L_0x023e;
                case 5: goto L_0x0220;
                default: goto L_0x021e;
            }
        L_0x021e:
            goto L_0x02f5
        L_0x0220:
            da.g r14 = B(r14)
            da.g r14 = r14.F(r3)
            goto L_0x02f5
        L_0x022a:
            da.g r14 = B(r14)
            da.g r14 = r14.F(r1)
            goto L_0x02f5
        L_0x0234:
            da.g r14 = B(r14)
            da.g r14 = r14.F(r5)
            goto L_0x02f5
        L_0x023e:
            da.g r14 = B(r14)
            da.g r14 = r14.F(r4)
            goto L_0x02f5
        L_0x0248:
            java.lang.String r10 = "style"
            java.lang.String r11 = r13.getName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x02f5
            da.g r14 = B(r14)
            da.g r14 = r14.A(r9)
            goto L_0x02f5
        L_0x025e:
            da.g r14 = B(r14)
            java.lang.String r10 = "bold"
            boolean r9 = r10.equalsIgnoreCase(r9)
            da.g r14 = r14.v(r9)
            goto L_0x02f5
        L_0x026e:
            java.lang.String r9 = nb.C5108c.e(r9)
            r9.hashCode()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1461280213: goto L_0x029f;
                case -1026963764: goto L_0x0294;
                case 913457136: goto L_0x0289;
                case 1679736913: goto L_0x027e;
                default: goto L_0x027c;
            }
        L_0x027c:
            r9 = r2
            goto L_0x02a9
        L_0x027e:
            java.lang.String r10 = "linethrough"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0287
            goto L_0x027c
        L_0x0287:
            r9 = r3
            goto L_0x02a9
        L_0x0289:
            java.lang.String r10 = "nolinethrough"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0292
            goto L_0x027c
        L_0x0292:
            r9 = r4
            goto L_0x02a9
        L_0x0294:
            java.lang.String r10 = "underline"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x029d
            goto L_0x027c
        L_0x029d:
            r9 = r5
            goto L_0x02a9
        L_0x029f:
            java.lang.String r10 = "nounderline"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x02a8
            goto L_0x027c
        L_0x02a8:
            r9 = r7
        L_0x02a9:
            switch(r9) {
                case 0: goto L_0x02c8;
                case 1: goto L_0x02bf;
                case 2: goto L_0x02b6;
                case 3: goto L_0x02ad;
                default: goto L_0x02ac;
            }
        L_0x02ac:
            goto L_0x02f5
        L_0x02ad:
            da.g r14 = B(r14)
            da.g r14 = r14.C(r5)
            goto L_0x02f5
        L_0x02b6:
            da.g r14 = B(r14)
            da.g r14 = r14.C(r7)
            goto L_0x02f5
        L_0x02bf:
            da.g r14 = B(r14)
            da.g r14 = r14.K(r5)
            goto L_0x02f5
        L_0x02c8:
            da.g r14 = B(r14)
            da.g r14 = r14.K(r7)
            goto L_0x02f5
        L_0x02d1:
            da.g r14 = B(r14)
            android.text.Layout$Alignment r9 = D(r9)
            da.g r14 = r14.H(r9)
            goto L_0x02f5
        L_0x02de:
            da.g r14 = B(r14)
            da.g r14 = r14.x(r9)
            goto L_0x02f5
        L_0x02e7:
            da.g r14 = B(r14)
            java.lang.String r10 = "italic"
            boolean r9 = r10.equalsIgnoreCase(r9)
            da.g r14 = r14.B(r9)
        L_0x02f5:
            int r8 = r8 + r5
            goto L_0x000c
        L_0x02f8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c.M(org.xmlpull.v1.XmlPullParser, da.g):da.g");
    }

    private static String[] N(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return M.R0(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
        if (r13.equals("ms") == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r8 = r8 * r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long O(java.lang.String r13, da.c.b r14) {
        /*
            r0 = 4
            r1 = 3
            java.util.regex.Pattern r2 = f43185p
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0084
            java.lang.String r13 = r2.group(r7)
            java.lang.Object r13 = ja.C3645a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r2.group(r6)
            java.lang.Object r13 = ja.C3645a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r1)
            java.lang.Object r13 = ja.C3645a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r2.group(r0)
            r0 = 0
            if (r13 == 0) goto L_0x0057
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0058
        L_0x0057:
            r9 = r0
        L_0x0058:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x006a
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r3 = r14.f43197a
            float r13 = r13 / r3
            double r9 = (double) r13
            goto L_0x006b
        L_0x006a:
            r9 = r0
        L_0x006b:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r2.group(r13)
            if (r13 == 0) goto L_0x0080
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f43198b
            double r2 = (double) r13
            double r0 = r0 / r2
            float r13 = r14.f43197a
            double r13 = (double) r13
            double r0 = r0 / r13
        L_0x0080:
            double r7 = r7 + r0
            double r7 = r7 * r4
            long r13 = (long) r7
            return r13
        L_0x0084:
            java.util.regex.Pattern r2 = f43186q
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L_0x0109
            java.lang.String r13 = r2.group(r7)
            java.lang.Object r13 = ja.C3645a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r2.group(r6)
            java.lang.Object r13 = ja.C3645a.e(r13)
            java.lang.String r13 = (java.lang.String) r13
            r13.hashCode()
            r2 = -1
            int r3 = r13.hashCode()
            switch(r3) {
                case 102: goto L_0x00df;
                case 104: goto L_0x00d4;
                case 109: goto L_0x00c9;
                case 116: goto L_0x00be;
                case 3494: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r0 = r2
            goto L_0x00e9
        L_0x00b5:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e9
            goto L_0x00b3
        L_0x00be:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c7
            goto L_0x00b3
        L_0x00c7:
            r0 = r1
            goto L_0x00e9
        L_0x00c9:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00d2
            goto L_0x00b3
        L_0x00d2:
            r0 = r6
            goto L_0x00e9
        L_0x00d4:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00dd
            goto L_0x00b3
        L_0x00dd:
            r0 = r7
            goto L_0x00e9
        L_0x00df:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00e8
            goto L_0x00b3
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            switch(r0) {
                case 0: goto L_0x0102;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0106
        L_0x00ed:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00f2:
            double r8 = r8 / r13
            goto L_0x0106
        L_0x00f4:
            int r13 = r14.f43199c
            double r13 = (double) r13
            goto L_0x00f2
        L_0x00f8:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x00fa:
            double r8 = r8 * r13
            goto L_0x0106
        L_0x00fc:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            goto L_0x00fa
        L_0x0102:
            float r13 = r14.f43197a
            double r13 = (double) r13
            goto L_0x00f2
        L_0x0106:
            double r8 = r8 * r4
            long r13 = (long) r8
            return r13
        L_0x0109:
            W9.j r14 = new W9.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c.O(java.lang.String, da.c$b):long");
    }

    private static C0669c P(XmlPullParser xmlPullParser) {
        String a10 = N.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f43190u.matcher(a10);
        if (!matcher.matches()) {
            s.i("TtmlDecoder", "Ignoring non-pixel tts extent: " + a10);
            return null;
        }
        try {
            return new C0669c(Integer.parseInt((String) C3645a.e(matcher.group(1))), Integer.parseInt((String) C3645a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            s.i("TtmlDecoder", "Ignoring malformed tts extent: " + a10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f43194o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0669c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f43192w;
            a aVar = f43193x;
            int i11 = 0;
            h hVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = G(newPullParser);
                            aVar = E(newPullParser, f43193x);
                            cVar = P(newPullParser);
                        }
                        C0669c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!C(name)) {
                            s.f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d J10 = J(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(J10);
                                    if (dVar != null) {
                                        dVar.a(J10);
                                    }
                                } catch (j e10) {
                                    s.j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) C3645a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) C3645a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new j("No TTML subtitles found");
        } catch (XmlPullParserException e11) {
            throw new j("Unable to decode source", e11);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        }
    }
}
