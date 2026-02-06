package V9;

import V9.a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import ia.D;
import io.intercom.android.sdk.models.AttributeType;
import ja.C3645a;
import ja.C3649e;
import ja.M;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k9.C3717q0;
import k9.L0;
import m9.C3843a;
import o9.m;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import y9.l;
import y9.p;

public class b implements D.a {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f34781a;

    /* renamed from: V9.b$b  reason: collision with other inner class name */
    public static class C0564b extends L0 {
        public C0564b(String str) {
            super("Missing required field: " + str, (Throwable) null, true, 4);
        }
    }

    private static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f34786e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f34787f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f34788g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, (String) null, 8, r(bArr), 0, 0, (byte[]) null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            if (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') {
                return str.substring(1, str.length() - 1);
            }
            return str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        public Object b() {
            UUID uuid = this.f34787f;
            return new a.C0563a(uuid, l.a(uuid, this.f34788g), q(this.f34788g));
        }

        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f34786e = false;
            }
        }

        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f34786e = true;
                this.f34787f = UUID.fromString(s(xmlPullParser.getAttributeValue((String) null, "SystemID")));
            }
        }

        public void o(XmlPullParser xmlPullParser) {
            if (this.f34786e) {
                this.f34788g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    private static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private C3717q0 f34789e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J10 = M.J(str);
                byte[][] i10 = C3649e.i(J10);
                if (i10 == null) {
                    arrayList.add(J10);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        public Object b() {
            return this.f34789e;
        }

        public void n(XmlPullParser xmlPullParser) {
            int i10;
            C3717q0.b bVar = new C3717q0.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List q10 = q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(C3843a.a(k11, k10));
                }
                bVar.K("audio/mp4").H(k10).f0(k11).T(q10);
            } else if (intValue == 3) {
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                    bVar.K("application/mp4").c0(i10);
                }
                i10 = 0;
                bVar.K("application/mp4").c0(i10);
            } else {
                bVar.K("application/mp4");
            }
            this.f34789e = bVar.S(xmlPullParser.getAttributeValue((String) null, "Index")).U((String) c("Name")).e0(r10).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    private static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List f34790e = new LinkedList();

        /* renamed from: f  reason: collision with root package name */
        private int f34791f;

        /* renamed from: g  reason: collision with root package name */
        private int f34792g;

        /* renamed from: h  reason: collision with root package name */
        private long f34793h;

        /* renamed from: i  reason: collision with root package name */
        private long f34794i;

        /* renamed from: j  reason: collision with root package name */
        private long f34795j;

        /* renamed from: k  reason: collision with root package name */
        private int f34796k = -1;

        /* renamed from: l  reason: collision with root package name */
        private boolean f34797l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0563a f34798m = null;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        public void a(Object obj) {
            boolean z10;
            if (obj instanceof a.b) {
                this.f34790e.add((a.b) obj);
            } else if (obj instanceof a.C0563a) {
                if (this.f34798m == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.f(z10);
                this.f34798m = (a.C0563a) obj;
            }
        }

        public Object b() {
            int size = this.f34790e.size();
            a.b[] bVarArr = new a.b[size];
            this.f34790e.toArray(bVarArr);
            if (this.f34798m != null) {
                a.C0563a aVar = this.f34798m;
                m mVar = new m(new m.b(aVar.f34762a, "video/mp4", aVar.f34763b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f34765a;
                    if (i11 == 2 || i11 == 1) {
                        C3717q0[] q0VarArr = bVar.f34774j;
                        for (int i12 = 0; i12 < q0VarArr.length; i12++) {
                            q0VarArr[i12] = q0VarArr[i12].b().M(mVar).E();
                        }
                    }
                }
            }
            return new a(this.f34791f, this.f34792g, this.f34793h, this.f34794i, this.f34795j, this.f34796k, this.f34797l, this.f34798m, bVarArr);
        }

        public void n(XmlPullParser xmlPullParser) {
            this.f34791f = k(xmlPullParser, "MajorVersion");
            this.f34792g = k(xmlPullParser, "MinorVersion");
            this.f34793h = j(xmlPullParser, "TimeScale", 10000000);
            this.f34794i = l(xmlPullParser, "Duration");
            this.f34795j = j(xmlPullParser, "DVRWindowLength", 0);
            this.f34796k = i(xmlPullParser, "LookaheadCount", -1);
            this.f34797l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f34793h));
        }
    }

    private static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f34799e;

        /* renamed from: f  reason: collision with root package name */
        private final List f34800f = new LinkedList();

        /* renamed from: g  reason: collision with root package name */
        private int f34801g;

        /* renamed from: h  reason: collision with root package name */
        private String f34802h;

        /* renamed from: i  reason: collision with root package name */
        private long f34803i;

        /* renamed from: j  reason: collision with root package name */
        private String f34804j;

        /* renamed from: k  reason: collision with root package name */
        private String f34805k;

        /* renamed from: l  reason: collision with root package name */
        private int f34806l;

        /* renamed from: m  reason: collision with root package name */
        private int f34807m;

        /* renamed from: n  reason: collision with root package name */
        private int f34808n;

        /* renamed from: o  reason: collision with root package name */
        private int f34809o;

        /* renamed from: p  reason: collision with root package name */
        private String f34810p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList f34811q;

        /* renamed from: r  reason: collision with root package name */
        private long f34812r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f34799e = str;
        }

        private void q(XmlPullParser xmlPullParser) {
            int s10 = s(xmlPullParser);
            this.f34801g = s10;
            p("Type", Integer.valueOf(s10));
            if (this.f34801g == 3) {
                this.f34802h = m(xmlPullParser, "Subtype");
            } else {
                this.f34802h = xmlPullParser.getAttributeValue((String) null, "Subtype");
            }
            p("Subtype", this.f34802h);
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Name");
            this.f34804j = attributeValue;
            p("Name", attributeValue);
            this.f34805k = m(xmlPullParser, "Url");
            this.f34806l = i(xmlPullParser, "MaxWidth", -1);
            this.f34807m = i(xmlPullParser, "MaxHeight", -1);
            this.f34808n = i(xmlPullParser, "DisplayWidth", -1);
            this.f34809o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "Language");
            this.f34810p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = (long) i(xmlPullParser, "TimeScale", -1);
            this.f34803i = i10;
            if (i10 == -1) {
                this.f34803i = ((Long) c("TimeScale")).longValue();
            }
            this.f34811q = new ArrayList();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.f34811q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else if (this.f34812r != -1) {
                    j10 = this.f34812r + ((Long) this.f34811q.get(size - 1)).longValue();
                } else {
                    throw L0.c("Unable to infer start time", (Throwable) null);
                }
            }
            this.f34811q.add(Long.valueOf(j10));
            this.f34812r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1);
            if (j11 <= 1 || this.f34812r != -9223372036854775807L) {
                while (true) {
                    long j12 = (long) i10;
                    if (j12 < j11) {
                        this.f34811q.add(Long.valueOf((this.f34812r * j12) + j10));
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                throw L0.c("Repeated chunk with unspecified duration", (Throwable) null);
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
            if (attributeValue == null) {
                throw new C0564b("Type");
            } else if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if (AttributeType.TEXT.equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw L0.c("Invalid key value[" + attributeValue + "]", (Throwable) null);
            }
        }

        public void a(Object obj) {
            if (obj instanceof C3717q0) {
                this.f34800f.add((C3717q0) obj);
            }
        }

        public Object b() {
            C3717q0[] q0VarArr = new C3717q0[this.f34800f.size()];
            this.f34800f.toArray(q0VarArr);
            a.b bVar = r2;
            a.b bVar2 = new a.b(this.f34799e, this.f34805k, this.f34801g, this.f34802h, this.f34803i, this.f34804j, this.f34806l, this.f34807m, this.f34808n, this.f34809o, this.f34810p, q0VarArr, this.f34811q, this.f34812r);
            return bVar;
        }

        public boolean d(String str) {
            return "c".equals(str);
        }

        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f34781a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: b */
    public a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f34781a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (a) new e((a) null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw L0.c((String) null, e10);
        }
    }

    private static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f34782a;

        /* renamed from: b  reason: collision with root package name */
        private final String f34783b;

        /* renamed from: c  reason: collision with root package name */
        private final a f34784c;

        /* renamed from: d  reason: collision with root package name */
        private final List f34785d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f34784c = aVar;
            this.f34782a = str;
            this.f34783b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public abstract Object b();

        /* access modifiers changed from: protected */
        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f34785d.size(); i10++) {
                Pair pair = (Pair) this.f34785d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f34784c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        /* access modifiers changed from: protected */
        public boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f34783b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f34782a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* access modifiers changed from: protected */
        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return Boolean.parseBoolean(attributeValue);
            }
            return z10;
        }

        /* access modifiers changed from: protected */
        public final int i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw L0.c((String) null, e10);
            }
        }

        /* access modifiers changed from: protected */
        public final long j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw L0.c((String) null, e10);
            }
        }

        /* access modifiers changed from: protected */
        public final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw L0.c((String) null, e10);
                }
            } else {
                throw new C0564b(str);
            }
        }

        /* access modifiers changed from: protected */
        public final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw L0.c((String) null, e10);
                }
            } else {
                throw new C0564b(str);
            }
        }

        /* access modifiers changed from: protected */
        public final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0564b(str);
        }

        /* access modifiers changed from: protected */
        public abstract void n(XmlPullParser xmlPullParser);

        /* access modifiers changed from: protected */
        public final void p(String str, Object obj) {
            this.f34785d.add(Pair.create(str, obj));
        }

        /* access modifiers changed from: protected */
        public void a(Object obj) {
        }

        /* access modifiers changed from: protected */
        public void h(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public void o(XmlPullParser xmlPullParser) {
        }
    }
}
