package T9;

import T9.g;
import T9.h;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import ia.D;
import ja.C3645a;
import ja.M;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.C3702j;
import k9.L0;
import o9.m;
import y9.l;

public final class j implements D.a {

    /* renamed from: A  reason: collision with root package name */
    private static final Pattern f34334A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B  reason: collision with root package name */
    private static final Pattern f34335B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C  reason: collision with root package name */
    private static final Pattern f34336C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D  reason: collision with root package name */
    private static final Pattern f34337D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E  reason: collision with root package name */
    private static final Pattern f34338E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F  reason: collision with root package name */
    private static final Pattern f34339F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G  reason: collision with root package name */
    private static final Pattern f34340G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H  reason: collision with root package name */
    private static final Pattern f34341H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I  reason: collision with root package name */
    private static final Pattern f34342I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J  reason: collision with root package name */
    private static final Pattern f34343J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K  reason: collision with root package name */
    private static final Pattern f34344K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L  reason: collision with root package name */
    private static final Pattern f34345L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M  reason: collision with root package name */
    private static final Pattern f34346M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N  reason: collision with root package name */
    private static final Pattern f34347N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O  reason: collision with root package name */
    private static final Pattern f34348O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P  reason: collision with root package name */
    private static final Pattern f34349P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q  reason: collision with root package name */
    private static final Pattern f34350Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R  reason: collision with root package name */
    private static final Pattern f34351R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S  reason: collision with root package name */
    private static final Pattern f34352S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T  reason: collision with root package name */
    private static final Pattern f34353T = c("AUTOSELECT");

    /* renamed from: U  reason: collision with root package name */
    private static final Pattern f34354U = c("DEFAULT");

    /* renamed from: V  reason: collision with root package name */
    private static final Pattern f34355V = c("FORCED");

    /* renamed from: W  reason: collision with root package name */
    private static final Pattern f34356W = c("INDEPENDENT");

    /* renamed from: X  reason: collision with root package name */
    private static final Pattern f34357X = c("GAP");

    /* renamed from: Y  reason: collision with root package name */
    private static final Pattern f34358Y = c("PRECISE");

    /* renamed from: Z  reason: collision with root package name */
    private static final Pattern f34359Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    private static final Pattern f34360a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    private static final Pattern f34361b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f34362c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f34363d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f34364e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f34365f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f34366g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f34367h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f34368i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f34369j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f34370k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f34371l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f34372m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f34373n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f34374o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f34375p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f34376q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f34377r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f34378s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f34379t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f34380u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f34381v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    private static final Pattern f34382w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x  reason: collision with root package name */
    private static final Pattern f34383x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f34384y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f34385z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: a  reason: collision with root package name */
    private final h f34386a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34387b;

    public static final class a extends IOException {
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedReader f34388a;

        /* renamed from: b  reason: collision with root package name */
        private final Queue f34389b;

        /* renamed from: c  reason: collision with root package name */
        private String f34390c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f34389b = queue;
            this.f34388a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f34390c != null) {
                return true;
            }
            if (!this.f34389b.isEmpty()) {
                this.f34390c = (String) C3645a.e((String) this.f34389b.poll());
                return true;
            }
            do {
                String readLine = this.f34388a.readLine();
                this.f34390c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f34390c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (a()) {
                String str = this.f34390c;
                this.f34390c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public j() {
        this(h.f34310n, (g) null);
    }

    private static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
    }

    private static String B(String str, Map map) {
        Matcher matcher = f34361b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !M.w0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C10 = C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (C10 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            C10 = bufferedReader.read();
        }
        return M.w0(C(bufferedReader, false, C10));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(" + "NO" + f.f37531c + "YES" + ")");
    }

    private static m d(String str, m.b[] bVarArr) {
        m.b[] bVarArr2 = new m.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b((byte[]) null);
        }
        return new m(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str2 != null) {
            return str2;
        }
        return Long.toHexString(j10);
    }

    private static h.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            if (str.equals(bVar.f34328d)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            if (str.equals(bVar.f34329e)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b h(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = (h.b) arrayList.get(i10);
            if (str.equals(bVar.f34327c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static m.b k(String str, String str2, Map map) {
        String u10 = u(str, f34343J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z10 = z(str, f34344K, map);
            return new m.b(C3702j.f45578d, "video/mp4", Base64.decode(z10.substring(z10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new m.b(C3702j.f45578d, "hls", M.n0(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(u10)) {
                return null;
            }
            String z11 = z(str, f34344K, map);
            byte[] decode = Base64.decode(z11.substring(z11.indexOf(44)), 0);
            UUID uuid = C3702j.f45579e;
            return new m.b(uuid, "video/mp4", l.a(uuid, decode));
        }
    }

    private static String l(String str) {
        if ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) {
            return "cenc";
        }
        return "cbcs";
    }

    private static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v0, resolved type: o9.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v1, resolved type: o9.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v15, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r10v50 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static T9.g o(T9.h r92, T9.g r93, T9.j.b r94, java.lang.String r95) {
        /*
            r0 = r92
            r1 = r93
            boolean r2 = r0.f34333c
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            T9.g$f r7 = new T9.g$f
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r7
            r16.<init>(r17, r19, r20, r22, r24)
            java.util.TreeMap r9 = new java.util.TreeMap
            r9.<init>()
            r10 = 0
            java.lang.String r13 = ""
            r20 = r13
            r35 = r2
            r56 = r7
            r2 = r10
            r23 = r2
            r26 = r23
            r27 = r26
            r36 = r27
            r54 = r36
            r79 = r54
            r84 = r79
            r41 = r20
            r14 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r28 = 0
            r30 = 1
            r31 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r37 = 0
            r39 = 0
            r50 = 0
            r51 = 0
            r75 = -1
            r77 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r85 = 0
            r86 = 0
            r88 = 0
            r7 = r5
            r5 = 0
        L_0x008d:
            boolean r42 = r94.a()
            if (r42 == 0) goto L_0x065a
            java.lang.String r13 = r94.b()
            java.lang.String r12 = "#EXT"
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x00a2
            r8.add(r13)
        L_0x00a2:
            java.lang.String r12 = "#EXT-X-PLAYLIST-TYPE"
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x00c4
            java.util.regex.Pattern r12 = f34376q
            java.lang.String r12 = z(r13, r12, r3)
            java.lang.String r13 = "VOD"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x00ba
            r2 = 1
            goto L_0x008d
        L_0x00ba:
            java.lang.String r13 = "EVENT"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x008d
            r2 = 2
            goto L_0x008d
        L_0x00c4:
            java.lang.String r12 = "#EXT-X-I-FRAMES-ONLY"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x00cf
            r84 = 1
            goto L_0x008d
        L_0x00cf:
            java.lang.String r12 = "#EXT-X-START"
            boolean r12 = r13.startsWith(r12)
            r43 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r12 == 0) goto L_0x00ee
            java.util.regex.Pattern r12 = f34336C
            double r21 = j(r13, r12)
            double r11 = r21 * r43
            long r11 = (long) r11
            r21 = r11
            java.util.regex.Pattern r11 = f34358Y
            boolean r23 = q(r13, r11, r10)
            goto L_0x008d
        L_0x00ee:
            java.lang.String r11 = "#EXT-X-SERVER-CONTROL"
            boolean r11 = r13.startsWith(r11)
            if (r11 == 0) goto L_0x00fb
            T9.g$f r56 = y(r13)
            goto L_0x008d
        L_0x00fb:
            java.lang.String r11 = "#EXT-X-PART-INF"
            boolean r11 = r13.startsWith(r11)
            if (r11 == 0) goto L_0x0110
            java.util.regex.Pattern r11 = f34374o
            double r11 = j(r13, r11)
            double r11 = r11 * r43
            long r11 = (long) r11
            r33 = r11
            goto L_0x008d
        L_0x0110:
            java.lang.String r11 = "#EXT-X-MAP"
            boolean r11 = r13.startsWith(r11)
            java.lang.String r12 = "@"
            if (r11 == 0) goto L_0x016f
            java.util.regex.Pattern r11 = f34344K
            java.lang.String r43 = z(r13, r11, r3)
            java.util.regex.Pattern r11 = f34338E
            java.lang.String r11 = v(r13, r11, r3)
            if (r11 == 0) goto L_0x013e
            java.lang.String[] r11 = ja.M.R0(r11, r12)
            r12 = r11[r10]
            long r75 = java.lang.Long.parseLong(r12)
            int r12 = r11.length
            r13 = 1
            if (r12 <= r13) goto L_0x013e
            r11 = r11[r13]
            long r11 = java.lang.Long.parseLong(r11)
            r39 = r11
        L_0x013e:
            r11 = -1
            int r13 = (r75 > r11 ? 1 : (r75 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0146
            r39 = 0
        L_0x0146:
            r11 = r77
            if (r14 == 0) goto L_0x014c
            if (r11 == 0) goto L_0x014e
        L_0x014c:
            r12 = 0
            goto L_0x0156
        L_0x014e:
            java.lang.String r0 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r12 = 0
            k9.L0 r0 = k9.L0.c(r0, r12)
            throw r0
        L_0x0156:
            T9.g$d r85 = new T9.g$d
            r42 = r85
            r44 = r39
            r46 = r75
            r48 = r14
            r49 = r11
            r42.<init>(r43, r44, r46, r48, r49)
            if (r13 == 0) goto L_0x0169
            long r39 = r39 + r75
        L_0x0169:
            r77 = r11
            r75 = -1
            goto L_0x008d
        L_0x016f:
            r11 = r77
            r77 = 0
            java.lang.String r10 = "#EXT-X-TARGETDURATION"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x018c
            java.util.regex.Pattern r10 = f34372m
            int r10 = m(r13, r10)
            long r12 = (long) r10
            r31 = 1000000(0xf4240, double:4.940656E-318)
            long r31 = r31 * r12
        L_0x0187:
            r77 = r11
        L_0x0189:
            r10 = 0
            goto L_0x008d
        L_0x018c:
            java.lang.String r10 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x019f
            java.util.regex.Pattern r10 = f34383x
            long r82 = n(r13, r10)
            r77 = r11
            r28 = r82
            goto L_0x0189
        L_0x019f:
            java.lang.String r10 = "#EXT-X-VERSION"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x01ae
            java.util.regex.Pattern r10 = f34375p
            int r30 = m(r13, r10)
            goto L_0x0187
        L_0x01ae:
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x01e9
            java.util.regex.Pattern r10 = f34360a0
            java.lang.String r10 = v(r13, r10, r3)
            if (r10 == 0) goto L_0x01cc
            java.util.Map r12 = r0.f34319l
            java.lang.Object r12 = r12.get(r10)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x01db
            r3.put(r10, r12)
            goto L_0x01db
        L_0x01cc:
            java.util.regex.Pattern r10 = f34349P
            java.lang.String r10 = z(r13, r10, r3)
            java.util.regex.Pattern r12 = f34359Z
            java.lang.String r12 = z(r13, r12, r3)
            r3.put(r10, r12)
        L_0x01db:
            r12 = r7
            r91 = r8
            r10 = r78
            r7 = r82
            r1 = 0
            r78 = r2
        L_0x01e5:
            r82 = r5
            goto L_0x0646
        L_0x01e9:
            java.lang.String r10 = "#EXTINF"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x0200
            java.util.regex.Pattern r10 = f34384y
            long r86 = A(r13, r10)
            java.util.regex.Pattern r10 = f34385z
            r12 = r20
            java.lang.String r41 = u(r13, r10, r12, r3)
            goto L_0x0187
        L_0x0200:
            r10 = r20
            java.lang.String r0 = "#EXT-X-SKIP"
            boolean r0 = r13.startsWith(r0)
            r45 = 1
            if (r0 == 0) goto L_0x02b6
            java.util.regex.Pattern r0 = f34379t
            int r0 = m(r13, r0)
            if (r1 == 0) goto L_0x021c
            boolean r12 = r15.isEmpty()
            if (r12 == 0) goto L_0x021c
            r12 = 1
            goto L_0x021d
        L_0x021c:
            r12 = 0
        L_0x021d:
            ja.C3645a.f(r12)
            java.lang.Object r12 = ja.M.j(r93)
            T9.g r12 = (T9.g) r12
            long r12 = r12.f34275k
            long r12 = r28 - r12
            int r12 = (int) r12
            int r0 = r0 + r12
            if (r12 < 0) goto L_0x02b0
            java.util.List r13 = r1.f34282r
            int r13 = r13.size()
            if (r0 > r13) goto L_0x02b0
            r20 = r10
            r13 = r11
            r10 = r80
        L_0x023b:
            if (r12 >= r0) goto L_0x02a4
            java.util.List r14 = r1.f34282r
            java.lang.Object r14 = r14.get(r12)
            T9.g$d r14 = (T9.g.d) r14
            r55 = r7
            r91 = r8
            long r7 = r1.f34275k
            int r7 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x025a
            int r7 = r1.f34274j
            int r7 = r7 - r27
            int r8 = r14.f34297d
            int r7 = r7 + r8
            T9.g$d r14 = r14.b(r10, r7)
        L_0x025a:
            r15.add(r14)
            long r7 = r14.f34296c
            long r10 = r10 + r7
            long r7 = r14.f34303j
            r42 = -1
            int r38 = (r7 > r42 ? 1 : (r7 == r42 ? 0 : -1))
            if (r38 == 0) goto L_0x026f
            r38 = r0
            long r0 = r14.f34302i
            long r39 = r0 + r7
            goto L_0x0271
        L_0x026f:
            r38 = r0
        L_0x0271:
            int r0 = r14.f34297d
            T9.g$d r1 = r14.f34295b
            o9.m r7 = r14.f34299f
            java.lang.String r8 = r14.f34300g
            r42 = r0
            java.lang.String r0 = r14.f34301h
            r43 = r1
            if (r0 == 0) goto L_0x028b
            java.lang.String r1 = java.lang.Long.toHexString(r82)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x028e
        L_0x028b:
            java.lang.String r0 = r14.f34301h
            r13 = r0
        L_0x028e:
            long r82 = r82 + r45
            int r12 = r12 + 1
            r1 = r93
            r50 = r7
            r14 = r8
            r51 = r10
            r0 = r38
            r79 = r42
            r85 = r43
            r7 = r55
            r8 = r91
            goto L_0x023b
        L_0x02a4:
            r55 = r7
            r0 = r92
            r1 = r93
            r80 = r10
            r77 = r13
            goto L_0x0189
        L_0x02b0:
            T9.j$a r0 = new T9.j$a
            r0.<init>()
            throw r0
        L_0x02b6:
            r55 = r7
            r91 = r8
            r20 = r10
            java.lang.String r0 = "#EXT-X-KEY"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x0325
            java.util.regex.Pattern r0 = f34341H
            java.lang.String r0 = z(r13, r0, r3)
            java.util.regex.Pattern r1 = f34342I
            java.lang.String r7 = "identity"
            java.lang.String r1 = u(r13, r1, r7, r3)
            java.lang.String r8 = "NONE"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x02e3
            r9.clear()
            r8 = r77
            r14 = r8
        L_0x02e0:
            r50 = r14
            goto L_0x0319
        L_0x02e3:
            java.util.regex.Pattern r8 = f34345L
            java.lang.String r8 = v(r13, r8, r3)
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0302
            java.lang.String r1 = "AES-128"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ff
            java.util.regex.Pattern r0 = f34344K
            java.lang.String r0 = z(r13, r0, r3)
            r14 = r0
            goto L_0x0319
        L_0x02ff:
            r14 = r77
            goto L_0x0319
        L_0x0302:
            r7 = r78
            if (r7 != 0) goto L_0x030b
            java.lang.String r78 = l(r0)
            goto L_0x030d
        L_0x030b:
            r78 = r7
        L_0x030d:
            o9.m$b r0 = k(r13, r1, r3)
            if (r0 == 0) goto L_0x02ff
            r9.put(r1, r0)
            r14 = r77
            goto L_0x02e0
        L_0x0319:
            r0 = r92
            r1 = r93
            r77 = r8
        L_0x031f:
            r7 = r55
        L_0x0321:
            r8 = r91
            goto L_0x0189
        L_0x0325:
            r7 = r78
            java.lang.String r0 = "#EXT-X-BYTERANGE"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x0355
            java.util.regex.Pattern r0 = f34337D
            java.lang.String r0 = z(r13, r0, r3)
            java.lang.String[] r0 = ja.M.R0(r0, r12)
            r1 = 0
            r8 = r0[r1]
            long r75 = java.lang.Long.parseLong(r8)
            int r1 = r0.length
            r8 = 1
            if (r1 <= r8) goto L_0x034c
            r0 = r0[r8]
            long r0 = java.lang.Long.parseLong(r0)
            r39 = r0
        L_0x034c:
            r0 = r92
            r1 = r93
            r78 = r7
            r77 = r11
            goto L_0x031f
        L_0x0355:
            r8 = 1
            java.lang.String r0 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r0 = r13.startsWith(r0)
            r1 = 58
            if (r0 == 0) goto L_0x037e
            int r0 = r13.indexOf(r1)
            int r0 = r0 + r8
            java.lang.String r0 = r13.substring(r0)
            int r27 = java.lang.Integer.parseInt(r0)
            r0 = r92
            r1 = r93
            r78 = r7
            r77 = r11
            r7 = r55
            r8 = r91
            r10 = 0
            r26 = 1
            goto L_0x008d
        L_0x037e:
            java.lang.String r0 = "#EXT-X-DISCONTINUITY"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0389
            int r79 = r79 + 1
            goto L_0x034c
        L_0x0389:
            java.lang.String r0 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x03b6
            r18 = 0
            int r0 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x03ac
            int r0 = r13.indexOf(r1)
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r0 = r13.substring(r0)
            long r0 = ja.M.J0(r0)
            long r0 = ja.M.C0(r0)
            long r24 = r0 - r80
            goto L_0x034c
        L_0x03ac:
            r78 = r2
            r10 = r7
        L_0x03af:
            r12 = r55
            r7 = r82
            r1 = 0
            goto L_0x01e5
        L_0x03b6:
            java.lang.String r0 = "#EXT-X-GAP"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x03cf
            r0 = r92
            r1 = r93
            r78 = r7
            r77 = r11
            r7 = r55
            r8 = r91
            r10 = 0
            r54 = 1
            goto L_0x008d
        L_0x03cf:
            java.lang.String r0 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x03e8
            r0 = r92
            r1 = r93
            r78 = r7
            r77 = r11
            r7 = r55
            r8 = r91
            r10 = 0
            r35 = 1
            goto L_0x008d
        L_0x03e8:
            java.lang.String r0 = "#EXT-X-ENDLIST"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0401
            r0 = r92
            r1 = r93
            r78 = r7
            r77 = r11
            r7 = r55
            r8 = r91
            r10 = 0
            r36 = 1
            goto L_0x008d
        L_0x0401:
            java.lang.String r0 = "#EXT-X-RENDITION-REPORT"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x0435
            java.util.regex.Pattern r0 = f34334A
            r78 = r2
            r10 = r7
            r1 = -1
            long r7 = t(r13, r0, r1)
            java.util.regex.Pattern r0 = f34335B
            r1 = -1
            int r0 = s(r13, r0, r1)
            java.util.regex.Pattern r1 = f34344K
            java.lang.String r1 = z(r13, r1, r3)
            r2 = r95
            java.lang.String r1 = ja.K.d(r2, r1)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            T9.g$c r12 = new T9.g$c
            r12.<init>(r1, r7, r0)
            r6.add(r12)
            goto L_0x03af
        L_0x0435:
            r78 = r2
            r10 = r7
            r2 = r95
            java.lang.String r0 = "#EXT-X-PRELOAD-HINT"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x04cd
            if (r5 == 0) goto L_0x0446
        L_0x0444:
            goto L_0x03af
        L_0x0446:
            java.util.regex.Pattern r0 = f34347N
            java.lang.String r0 = z(r13, r0, r3)
            java.lang.String r1 = "PART"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0455
            goto L_0x0444
        L_0x0455:
            java.util.regex.Pattern r0 = f34344K
            java.lang.String r58 = z(r13, r0, r3)
            java.util.regex.Pattern r0 = f34339F
            r7 = -1
            long r0 = t(r13, r0, r7)
            java.util.regex.Pattern r12 = f34340G
            long r70 = t(r13, r12, r7)
            r7 = r82
            java.lang.String r67 = e(r7, r14, r11)
            if (r50 != 0) goto L_0x0491
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x0491
            java.util.Collection r12 = r9.values()
            r13 = 0
            o9.m$b[] r2 = new o9.m.b[r13]
            java.lang.Object[] r2 = r12.toArray(r2)
            o9.m$b[] r2 = (o9.m.b[]) r2
            o9.m r12 = new o9.m
            r12.<init>((java.lang.String) r10, (o9.m.b[]) r2)
            if (r37 != 0) goto L_0x048f
            o9.m r37 = d(r10, r2)
        L_0x048f:
            r50 = r12
        L_0x0491:
            r12 = -1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x049b
            int r38 = (r70 > r12 ? 1 : (r70 == r12 ? 0 : -1))
            if (r38 == 0) goto L_0x04bb
        L_0x049b:
            T9.g$b r5 = new T9.g$b
            if (r2 == 0) goto L_0x04a2
            r68 = r0
            goto L_0x04a4
        L_0x04a2:
            r68 = 0
        L_0x04a4:
            r73 = 0
            r74 = 1
            r60 = 0
            r72 = 0
            r57 = r5
            r59 = r85
            r62 = r79
            r63 = r51
            r65 = r50
            r66 = r14
            r57.<init>(r58, r59, r60, r62, r63, r65, r66, r67, r68, r70, r72, r73, r74)
        L_0x04bb:
            r0 = r92
            r1 = r93
            r82 = r7
            r77 = r11
            r7 = r55
            r2 = r78
            r8 = r91
            r78 = r10
            goto L_0x0189
        L_0x04cd:
            r7 = r82
            java.lang.String r0 = "#EXT-X-PART"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x058a
            java.lang.String r67 = e(r7, r14, r11)
            java.util.regex.Pattern r0 = f34344K
            java.lang.String r58 = z(r13, r0, r3)
            java.util.regex.Pattern r0 = f34373n
            double r0 = j(r13, r0)
            double r0 = r0 * r43
            long r0 = (long) r0
            java.util.regex.Pattern r2 = f34356W
            r82 = r5
            r5 = 0
            boolean r2 = q(r13, r2, r5)
            if (r35 == 0) goto L_0x04fe
            boolean r38 = r55.isEmpty()
            if (r38 == 0) goto L_0x04fe
            r38 = 1
            goto L_0x0500
        L_0x04fe:
            r38 = r5
        L_0x0500:
            r73 = r2 | r38
            java.util.regex.Pattern r2 = f34357X
            boolean r72 = q(r13, r2, r5)
            java.util.regex.Pattern r2 = f34338E
            java.lang.String r2 = v(r13, r2, r3)
            if (r2 == 0) goto L_0x0529
            java.lang.String[] r2 = ja.M.R0(r2, r12)
            r12 = r2[r5]
            long r12 = java.lang.Long.parseLong(r12)
            int r5 = r2.length
            r42 = r12
            r12 = 1
            if (r5 <= r12) goto L_0x0526
            r2 = r2[r12]
            long r88 = java.lang.Long.parseLong(r2)
        L_0x0526:
            r12 = -1
            goto L_0x052d
        L_0x0529:
            r12 = -1
            r42 = -1
        L_0x052d:
            int r2 = (r42 > r12 ? 1 : (r42 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0533
            r88 = 0
        L_0x0533:
            if (r50 != 0) goto L_0x0555
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L_0x0555
            java.util.Collection r5 = r9.values()
            r12 = 0
            o9.m$b[] r13 = new o9.m.b[r12]
            java.lang.Object[] r5 = r5.toArray(r13)
            o9.m$b[] r5 = (o9.m.b[]) r5
            o9.m r12 = new o9.m
            r12.<init>((java.lang.String) r10, (o9.m.b[]) r5)
            if (r37 != 0) goto L_0x0553
            o9.m r37 = d(r10, r5)
        L_0x0553:
            r50 = r12
        L_0x0555:
            T9.g$b r5 = new T9.g$b
            r57 = r5
            r74 = 0
            r59 = r85
            r60 = r0
            r62 = r79
            r63 = r51
            r65 = r50
            r66 = r14
            r68 = r88
            r70 = r42
            r57.<init>(r58, r59, r60, r62, r63, r65, r66, r67, r68, r70, r72, r73, r74)
            r12 = r55
            r12.add(r5)
            long r51 = r51 + r0
            if (r2 == 0) goto L_0x0579
            long r88 = r88 + r42
        L_0x0579:
            r0 = r92
            r1 = r93
            r77 = r11
            r2 = r78
            r5 = r82
            r82 = r7
            r78 = r10
            r7 = r12
            goto L_0x0321
        L_0x058a:
            r82 = r5
            r12 = r55
            java.lang.String r0 = "#"
            boolean r0 = r13.startsWith(r0)
            if (r0 != 0) goto L_0x0645
            java.lang.String r0 = e(r7, r14, r11)
            long r1 = r7 + r45
            java.lang.String r5 = B(r13, r3)
            java.lang.Object r7 = r4.get(r5)
            T9.g$d r7 = (T9.g.d) r7
            r42 = -1
            int r8 = (r75 > r42 ? 1 : (r75 == r42 ? 0 : -1))
            if (r8 != 0) goto L_0x05af
            r57 = 0
            goto L_0x05cb
        L_0x05af:
            if (r84 == 0) goto L_0x05c9
            if (r85 != 0) goto L_0x05c9
            if (r7 != 0) goto L_0x05c9
            T9.g$d r7 = new T9.g$d
            r48 = 0
            r49 = 0
            r44 = 0
            r42 = r7
            r43 = r5
            r46 = r39
            r42.<init>(r43, r44, r46, r48, r49)
            r4.put(r5, r7)
        L_0x05c9:
            r57 = r39
        L_0x05cb:
            if (r50 != 0) goto L_0x05ee
            boolean r13 = r9.isEmpty()
            if (r13 != 0) goto L_0x05ee
            java.util.Collection r13 = r9.values()
            r59 = r1
            r1 = 0
            o9.m$b[] r2 = new o9.m.b[r1]
            java.lang.Object[] r2 = r13.toArray(r2)
            o9.m$b[] r2 = (o9.m.b[]) r2
            o9.m r13 = new o9.m
            r13.<init>((java.lang.String) r10, (o9.m.b[]) r2)
            if (r37 != 0) goto L_0x05f3
            o9.m r37 = d(r10, r2)
            goto L_0x05f3
        L_0x05ee:
            r59 = r1
            r1 = 0
            r13 = r50
        L_0x05f3:
            T9.g$d r2 = new T9.g$d
            if (r85 == 0) goto L_0x05fa
            r40 = r85
            goto L_0x05fc
        L_0x05fa:
            r40 = r7
        L_0x05fc:
            r38 = r2
            r39 = r5
            r42 = r86
            r44 = r79
            r45 = r80
            r47 = r13
            r48 = r14
            r49 = r0
            r50 = r57
            r52 = r75
            r55 = r12
            r38.<init>(r39, r40, r41, r42, r44, r45, r47, r48, r49, r50, r52, r54, r55)
            r15.add(r2)
            long r51 = r80 + r86
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r8 == 0) goto L_0x0623
            long r57 = r57 + r75
        L_0x0623:
            r39 = r57
            r0 = r92
            r54 = r1
            r77 = r11
            r50 = r13
            r41 = r20
            r80 = r51
            r2 = r78
            r5 = r82
            r8 = r91
            r75 = -1
            r86 = 0
            r78 = r10
            r82 = r59
            r1 = r93
            r10 = r54
            goto L_0x008d
        L_0x0645:
            r1 = 0
        L_0x0646:
            r0 = r92
            r77 = r11
            r2 = r78
            r5 = r82
            r82 = r7
            r78 = r10
            r7 = r12
            r8 = r91
            r10 = r1
            r1 = r93
            goto L_0x008d
        L_0x065a:
            r78 = r2
            r82 = r5
            r12 = r7
            r91 = r8
            r1 = r10
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r1
        L_0x0668:
            int r3 = r6.size()
            if (r2 >= r3) goto L_0x06c4
            java.lang.Object r3 = r6.get(r2)
            T9.g$c r3 = (T9.g.c) r3
            long r4 = r3.f34290b
            r7 = -1
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0689
            int r4 = r15.size()
            long r4 = (long) r4
            long r4 = r28 + r4
            boolean r9 = r12.isEmpty()
            long r9 = (long) r9
            long r4 = r4 - r9
        L_0x0689:
            int r9 = r3.f34291c
            r10 = -1
            if (r9 != r10) goto L_0x06b0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r33 > r13 ? 1 : (r33 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x06ae
            boolean r9 = r12.isEmpty()
            if (r9 == 0) goto L_0x06a6
            java.lang.Object r9 = com.google.common.collect.B.d(r15)
            T9.g$d r9 = (T9.g.d) r9
            java.util.List r9 = r9.f34293m
            goto L_0x06a7
        L_0x06a6:
            r9 = r12
        L_0x06a7:
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
            goto L_0x06b6
        L_0x06ae:
            r11 = 1
            goto L_0x06b6
        L_0x06b0:
            r11 = 1
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x06b6:
            android.net.Uri r3 = r3.f34289a
            T9.g$c r1 = new T9.g$c
            r1.<init>(r3, r4, r9)
            r0.put(r3, r1)
            int r2 = r2 + 1
            r1 = 0
            goto L_0x0668
        L_0x06c4:
            r11 = 1
            if (r82 == 0) goto L_0x06cc
            r5 = r82
            r12.add(r5)
        L_0x06cc:
            T9.g r1 = new T9.g
            r2 = 0
            int r2 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x06d7
            r90 = r11
            goto L_0x06d9
        L_0x06d7:
            r90 = 0
        L_0x06d9:
            r5 = r1
            r6 = r78
            r55 = r12
            r7 = r95
            r8 = r91
            r9 = r21
            r11 = r23
            r12 = r24
            r14 = r26
            r2 = r15
            r15 = r27
            r16 = r28
            r18 = r30
            r19 = r31
            r21 = r33
            r23 = r35
            r24 = r36
            r25 = r90
            r26 = r37
            r27 = r2
            r28 = r55
            r29 = r56
            r30 = r0
            r5.<init>(r6, r7, r8, r9, r11, r12, r14, r15, r16, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T9.j.o(T9.h, T9.g, T9.j$b, java.lang.String):T9.g");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0494, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0495, code lost:
        r14 = r14 + r0;
        r31 = r7;
        r33 = r9;
        r32 = r13;
        r0 = r21;
        r9 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static T9.h p(T9.j.b r37, java.lang.String r38) {
        /*
            r1 = r38
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r16 = 0
            r17 = 0
        L_0x0038:
            boolean r18 = r37.a()
            java.lang.String r0 = "application/x-mpegURL"
            if (r18 == 0) goto L_0x0209
            java.lang.String r2 = r37.b()
            java.lang.String r4 = "#EXT"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x004f
            r14.add(r2)
        L_0x004f:
            java.lang.String r4 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r4 = r2.startsWith(r4)
            java.lang.String r15 = "#EXT-X-DEFINE"
            boolean r15 = r2.startsWith(r15)
            if (r15 == 0) goto L_0x006d
            java.util.regex.Pattern r0 = f34349P
            java.lang.String r0 = z(r2, r0, r11)
            java.util.regex.Pattern r4 = f34359Z
            java.lang.String r2 = z(r2, r4, r11)
            r11.put(r0, r2)
            goto L_0x00cc
        L_0x006d:
            java.lang.String r15 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r15 = r2.equals(r15)
            if (r15 == 0) goto L_0x0088
            r1 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r28 = r13
            r30 = r14
            r16 = 1
            goto L_0x01ee
        L_0x0088:
            java.lang.String r15 = "#EXT-X-MEDIA"
            boolean r15 = r2.startsWith(r15)
            if (r15 == 0) goto L_0x0094
            r12.add(r2)
            goto L_0x00cc
        L_0x0094:
            java.lang.String r15 = "#EXT-X-SESSION-KEY"
            boolean r15 = r2.startsWith(r15)
            if (r15 == 0) goto L_0x00c1
            java.util.regex.Pattern r0 = f34342I
            java.lang.String r4 = "identity"
            java.lang.String r0 = u(r2, r0, r4, r11)
            o9.m$b r0 = k(r2, r0, r11)
            if (r0 == 0) goto L_0x00cc
            java.util.regex.Pattern r4 = f34341H
            java.lang.String r2 = z(r2, r4, r11)
            java.lang.String r2 = l(r2)
            o9.m r4 = new o9.m
            o9.m$b[] r0 = new o9.m.b[]{r0}
            r4.<init>((java.lang.String) r2, (o9.m.b[]) r0)
            r13.add(r4)
            goto L_0x00cc
        L_0x00c1:
            java.lang.String r15 = "#EXT-X-STREAM-INF"
            boolean r15 = r2.startsWith(r15)
            if (r15 != 0) goto L_0x00dd
            if (r4 == 0) goto L_0x00cc
            goto L_0x00dd
        L_0x00cc:
            r1 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r28 = r13
            r30 = r14
            goto L_0x01ee
        L_0x00dd:
            java.lang.String r15 = "CLOSED-CAPTIONS=NONE"
            boolean r15 = r2.contains(r15)
            r17 = r17 | r15
            if (r4 == 0) goto L_0x00ea
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00eb
        L_0x00ea:
            r15 = 0
        L_0x00eb:
            java.util.regex.Pattern r3 = f34367h
            int r3 = m(r2, r3)
            r28 = r13
            java.util.regex.Pattern r13 = f34362c
            r29 = r10
            r10 = -1
            int r13 = s(r2, r13, r10)
            java.util.regex.Pattern r10 = f34369j
            java.lang.String r10 = v(r2, r10, r11)
            r30 = r14
            java.util.regex.Pattern r14 = f34370k
            java.lang.String r14 = v(r2, r14, r11)
            if (r14 == 0) goto L_0x012c
            r31 = r9
            java.lang.String r9 = "x"
            java.lang.String[] r9 = ja.M.R0(r14, r9)
            r14 = 0
            r21 = r9[r14]
            int r14 = java.lang.Integer.parseInt(r21)
            r19 = 1
            r9 = r9[r19]
            int r9 = java.lang.Integer.parseInt(r9)
            if (r14 <= 0) goto L_0x0127
            if (r9 > 0) goto L_0x0129
        L_0x0127:
            r9 = -1
            r14 = -1
        L_0x0129:
            r32 = r8
            goto L_0x0132
        L_0x012c:
            r31 = r9
            r32 = r8
            r9 = -1
            r14 = -1
        L_0x0132:
            java.util.regex.Pattern r8 = f34371l
            java.lang.String r8 = v(r2, r8, r11)
            if (r8 == 0) goto L_0x0141
            float r8 = java.lang.Float.parseFloat(r8)
        L_0x013e:
            r33 = r7
            goto L_0x0144
        L_0x0141:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x013e
        L_0x0144:
            java.util.regex.Pattern r7 = f34363d
            java.lang.String r7 = v(r2, r7, r11)
            r34 = r12
            java.util.regex.Pattern r12 = f34364e
            java.lang.String r12 = v(r2, r12, r11)
            r35 = r5
            java.util.regex.Pattern r5 = f34365f
            java.lang.String r5 = v(r2, r5, r11)
            r36 = r5
            java.util.regex.Pattern r5 = f34366g
            java.lang.String r5 = v(r2, r5, r11)
            if (r4 == 0) goto L_0x016f
            java.util.regex.Pattern r4 = f34344K
            java.lang.String r2 = z(r2, r4, r11)
            android.net.Uri r2 = ja.K.e(r1, r2)
            goto L_0x0181
        L_0x016f:
            boolean r2 = r37.a()
            if (r2 == 0) goto L_0x0201
            java.lang.String r2 = r37.b()
            java.lang.String r2 = B(r2, r11)
            android.net.Uri r2 = ja.K.e(r1, r2)
        L_0x0181:
            k9.q0$b r4 = new k9.q0$b
            r4.<init>()
            int r1 = r6.size()
            k9.q0$b r1 = r4.R(r1)
            k9.q0$b r0 = r1.K(r0)
            k9.q0$b r0 = r0.I(r10)
            k9.q0$b r0 = r0.G(r13)
            k9.q0$b r0 = r0.Z(r3)
            k9.q0$b r0 = r0.j0(r14)
            k9.q0$b r0 = r0.Q(r9)
            k9.q0$b r0 = r0.P(r8)
            k9.q0$b r0 = r0.c0(r15)
            k9.q0 r23 = r0.E()
            T9.h$b r0 = new T9.h$b
            r21 = r0
            r22 = r2
            r24 = r7
            r25 = r12
            r26 = r36
            r27 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r6.add(r0)
            r1 = r35
            java.lang.Object r0 = r1.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x01d8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
        L_0x01d8:
            S9.q$b r2 = new S9.q$b
            r21 = r2
            r22 = r13
            r23 = r3
            r24 = r7
            r25 = r12
            r26 = r36
            r27 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r0.add(r2)
        L_0x01ee:
            r5 = r1
            r13 = r28
            r10 = r29
            r14 = r30
            r9 = r31
            r8 = r32
            r7 = r33
            r12 = r34
            r1 = r38
            goto L_0x0038
        L_0x0201:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            k9.L0 r0 = k9.L0.c(r0, r1)
            throw r0
        L_0x0209:
            r1 = r5
            r33 = r7
            r32 = r8
            r31 = r9
            r29 = r10
            r34 = r12
            r28 = r13
            r30 = r14
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0223:
            int r5 = r6.size()
            if (r4 >= r5) goto L_0x027c
            java.lang.Object r5 = r6.get(r4)
            T9.h$b r5 = (T9.h.b) r5
            android.net.Uri r7 = r5.f34325a
            boolean r7 = r2.add(r7)
            if (r7 == 0) goto L_0x0278
            k9.q0 r7 = r5.f34326b
            D9.a r7 = r7.f45768j
            if (r7 != 0) goto L_0x023f
            r7 = 1
            goto L_0x0240
        L_0x023f:
            r7 = 0
        L_0x0240:
            ja.C3645a.f(r7)
            S9.q r7 = new S9.q
            android.net.Uri r8 = r5.f34325a
            java.lang.Object r8 = r1.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = ja.C3645a.e(r8)
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            r7.<init>(r9, r9, r8)
            D9.a r8 = new D9.a
            r10 = 1
            D9.a$b[] r12 = new D9.a.b[r10]
            r13 = 0
            r12[r13] = r7
            r8.<init>((D9.a.b[]) r12)
            k9.q0 r7 = r5.f34326b
            k9.q0$b r7 = r7.b()
            k9.q0$b r7 = r7.X(r8)
            k9.q0 r7 = r7.E()
            T9.h$b r5 = r5.a(r7)
            r3.add(r5)
            goto L_0x027a
        L_0x0278:
            r9 = 0
            r10 = 1
        L_0x027a:
            int r4 = r4 + r10
            goto L_0x0223
        L_0x027c:
            r9 = 0
            r1 = r9
            r8 = r1
            r14 = 0
        L_0x0280:
            int r2 = r34.size()
            if (r14 >= r2) goto L_0x04a1
            r2 = r34
            java.lang.Object r4 = r2.get(r14)
            java.lang.String r4 = (java.lang.String) r4
            java.util.regex.Pattern r5 = f34350Q
            java.lang.String r5 = z(r4, r5, r11)
            java.util.regex.Pattern r7 = f34349P
            java.lang.String r7 = z(r4, r7, r11)
            k9.q0$b r10 = new k9.q0$b
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r13 = ":"
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            k9.q0$b r10 = r10.S(r12)
            k9.q0$b r10 = r10.U(r7)
            k9.q0$b r10 = r10.K(r0)
            int r12 = x(r4)
            k9.q0$b r10 = r10.g0(r12)
            int r12 = w(r4, r11)
            k9.q0$b r10 = r10.c0(r12)
            java.util.regex.Pattern r12 = f34348O
            java.lang.String r12 = v(r4, r12, r11)
            k9.q0$b r10 = r10.V(r12)
            java.util.regex.Pattern r12 = f34344K
            java.lang.String r12 = v(r4, r12, r11)
            r13 = r38
            if (r12 != 0) goto L_0x02e5
            r12 = r9
            goto L_0x02e9
        L_0x02e5:
            android.net.Uri r12 = ja.K.e(r13, r12)
        L_0x02e9:
            D9.a r15 = new D9.a
            S9.q r9 = new S9.q
            r21 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r9.<init>(r5, r7, r0)
            r34 = r2
            r0 = 1
            D9.a$b[] r2 = new D9.a.b[r0]
            r0 = 0
            r2[r0] = r9
            r15.<init>((D9.a.b[]) r2)
            java.util.regex.Pattern r0 = f34346M
            java.lang.String r0 = z(r4, r0, r11)
            r0.hashCode()
            int r2 = r0.hashCode()
            switch(r2) {
                case -959297733: goto L_0x0334;
                case -333210994: goto L_0x0329;
                case 62628790: goto L_0x031e;
                case 81665115: goto L_0x0313;
                default: goto L_0x0311;
            }
        L_0x0311:
            r0 = -1
            goto L_0x033e
        L_0x0313:
            java.lang.String r2 = "VIDEO"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x031c
            goto L_0x0311
        L_0x031c:
            r0 = 3
            goto L_0x033e
        L_0x031e:
            java.lang.String r2 = "AUDIO"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0327
            goto L_0x0311
        L_0x0327:
            r0 = 2
            goto L_0x033e
        L_0x0329:
            java.lang.String r2 = "CLOSED-CAPTIONS"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0332
            goto L_0x0311
        L_0x0332:
            r0 = 1
            goto L_0x033e
        L_0x0334:
            java.lang.String r2 = "SUBTITLES"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x033d
            goto L_0x0311
        L_0x033d:
            r0 = 0
        L_0x033e:
            switch(r0) {
                case 0: goto L_0x044f;
                case 1: goto L_0x040a;
                case 2: goto L_0x0392;
                case 3: goto L_0x034d;
                default: goto L_0x0341;
            }
        L_0x0341:
            r7 = r31
            r13 = r32
            r9 = r33
        L_0x0347:
            r2 = 2
            r4 = 3
            r20 = 0
            goto L_0x0494
        L_0x034d:
            T9.h$b r0 = h(r6, r5)
            if (r0 == 0) goto L_0x0379
            k9.q0 r0 = r0.f34326b
            java.lang.String r2 = r0.f45767i
            r4 = 2
            java.lang.String r2 = ja.M.L(r2, r4)
            k9.q0$b r4 = r10.I(r2)
            java.lang.String r2 = ja.w.g(r2)
            k9.q0$b r2 = r4.e0(r2)
            int r4 = r0.f45775q
            k9.q0$b r2 = r2.j0(r4)
            int r4 = r0.f45776r
            k9.q0$b r2 = r2.Q(r4)
            float r0 = r0.f45777s
            r2.P(r0)
        L_0x0379:
            if (r12 != 0) goto L_0x037c
            goto L_0x0341
        L_0x037c:
            r10.X(r15)
            T9.h$a r0 = new T9.h$a
            k9.q0 r2 = r10.E()
            r0.<init>(r12, r2, r5, r7)
            r9 = r33
            r9.add(r0)
            r7 = r31
            r13 = r32
            goto L_0x0347
        L_0x0392:
            r9 = r33
            T9.h$b r0 = f(r6, r5)
            if (r0 == 0) goto L_0x03ab
            k9.q0 r2 = r0.f34326b
            java.lang.String r2 = r2.f45767i
            r13 = 1
            java.lang.String r2 = ja.M.L(r2, r13)
            r10.I(r2)
            java.lang.String r2 = ja.w.g(r2)
            goto L_0x03ac
        L_0x03ab:
            r2 = 0
        L_0x03ac:
            java.util.regex.Pattern r13 = f34368i
            java.lang.String r4 = v(r4, r13, r11)
            if (r4 == 0) goto L_0x03dd
            java.lang.String r13 = "/"
            java.lang.String[] r13 = ja.M.S0(r4, r13)
            r20 = 0
            r13 = r13[r20]
            int r13 = java.lang.Integer.parseInt(r13)
            r10.H(r13)
            java.lang.String r13 = "audio/eac3"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x03df
            java.lang.String r13 = "/JOC"
            boolean r4 = r4.endsWith(r13)
            if (r4 == 0) goto L_0x03df
            java.lang.String r2 = "ec+3"
            r10.I(r2)
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x03df
        L_0x03dd:
            r20 = 0
        L_0x03df:
            r10.e0(r2)
            if (r12 == 0) goto L_0x03fb
            r10.X(r15)
            T9.h$a r0 = new T9.h$a
            k9.q0 r2 = r10.E()
            r0.<init>(r12, r2, r5, r7)
            r13 = r32
            r13.add(r0)
        L_0x03f5:
            r7 = r31
            r2 = 2
            r4 = 3
            goto L_0x0494
        L_0x03fb:
            r13 = r32
            if (r0 == 0) goto L_0x03f5
            k9.q0 r8 = r10.E()
            r7 = r31
            r0 = 1
            r2 = 2
        L_0x0407:
            r4 = 3
            goto L_0x0495
        L_0x040a:
            r13 = r32
            r9 = r33
            r20 = 0
            java.util.regex.Pattern r0 = f34352S
            java.lang.String r0 = z(r4, r0, r11)
            java.lang.String r2 = "CC"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x042a
            r2 = 2
            java.lang.String r0 = r0.substring(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r4 = "application/cea-608"
            goto L_0x0436
        L_0x042a:
            r2 = 2
            r4 = 7
            java.lang.String r0 = r0.substring(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r4 = "application/cea-708"
        L_0x0436:
            if (r1 != 0) goto L_0x043d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x043d:
            k9.q0$b r4 = r10.e0(r4)
            r4.F(r0)
            k9.q0 r0 = r10.E()
            r1.add(r0)
            r7 = r31
            r0 = 1
            goto L_0x0407
        L_0x044f:
            r13 = r32
            r9 = r33
            r2 = 2
            r20 = 0
            T9.h$b r0 = g(r6, r5)
            if (r0 == 0) goto L_0x046d
            k9.q0 r0 = r0.f34326b
            java.lang.String r0 = r0.f45767i
            r4 = 3
            java.lang.String r0 = ja.M.L(r0, r4)
            r10.I(r0)
            java.lang.String r0 = ja.w.g(r0)
            goto L_0x046f
        L_0x046d:
            r4 = 3
            r0 = 0
        L_0x046f:
            if (r0 != 0) goto L_0x0473
            java.lang.String r0 = "text/vtt"
        L_0x0473:
            k9.q0$b r0 = r10.e0(r0)
            r0.X(r15)
            if (r12 == 0) goto L_0x048b
            T9.h$a r0 = new T9.h$a
            k9.q0 r10 = r10.E()
            r0.<init>(r12, r10, r5, r7)
            r7 = r31
            r7.add(r0)
            goto L_0x0494
        L_0x048b:
            r7 = r31
            java.lang.String r0 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            ja.s.i(r0, r5)
        L_0x0494:
            r0 = 1
        L_0x0495:
            int r14 = r14 + r0
            r31 = r7
            r33 = r9
            r32 = r13
            r0 = r21
            r9 = 0
            goto L_0x0280
        L_0x04a1:
            r7 = r31
            r13 = r32
            r9 = r33
            if (r17 == 0) goto L_0x04af
            java.util.List r0 = java.util.Collections.emptyList()
            r10 = r0
            goto L_0x04b0
        L_0x04af:
            r10 = r1
        L_0x04b0:
            T9.h r14 = new T9.h
            r0 = r14
            r1 = r38
            r2 = r30
            r4 = r9
            r5 = r13
            r6 = r7
            r7 = r29
            r9 = r10
            r10 = r16
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: T9.j.p(T9.j$b, java.lang.String):T9.h");
    }

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) C3645a.e(matcher.group(1)));
        }
        return d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) C3645a.e(matcher.group(1)));
        }
        return i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) C3645a.e(matcher.group(1)));
        }
        return j10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String u(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2, java.util.Map r3) {
        /*
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x0016
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = ja.C3645a.e(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = B(r2, r3)
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T9.j.u(java.lang.String, java.util.regex.Pattern, java.lang.String, java.util.Map):java.lang.String");
    }

    private static String v(String str, Pattern pattern, Map map) {
        return u(str, pattern, (String) null, map);
    }

    private static int w(String str, Map map) {
        String v10 = v(str, f34351R, map);
        int i10 = 0;
        if (TextUtils.isEmpty(v10)) {
            return 0;
        }
        String[] R02 = M.R0(v10, f.f37529a);
        if (M.s(R02, "public.accessibility.describes-video")) {
            i10 = 512;
        }
        if (M.s(R02, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (M.s(R02, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        if (M.s(R02, "public.easy-to-read")) {
            return i10 | 8192;
        }
        return i10;
    }

    private static int x(String str) {
        boolean q10 = q(str, f34354U, false);
        if (q(str, f34355V, false)) {
            q10 |= true;
        }
        return q(str, f34353T, false) ? q10 | true ? 1 : 0 : q10 ? 1 : 0;
    }

    private static g.f y(String str) {
        long j10;
        long j11;
        String str2 = str;
        double r10 = r(str2, f34377r, -9.223372036854776E18d);
        long j12 = -9223372036854775807L;
        if (r10 == -9.223372036854776E18d) {
            j10 = -9223372036854775807L;
        } else {
            j10 = (long) (r10 * 1000000.0d);
        }
        boolean q10 = q(str2, f34378s, false);
        double r11 = r(str2, f34380u, -9.223372036854776E18d);
        if (r11 == -9.223372036854776E18d) {
            j11 = -9223372036854775807L;
        } else {
            j11 = (long) (r11 * 1000000.0d);
        }
        double r12 = r(str2, f34381v, -9.223372036854776E18d);
        if (r12 != -9.223372036854776E18d) {
            j12 = (long) (r12 * 1000000.0d);
        }
        return new g.f(j10, q10, j11, j12, q(str2, f34382w, false));
    }

    private static String z(String str, Pattern pattern, Map map) {
        String v10 = v(str, pattern, map);
        if (v10 != null) {
            return v10;
        }
        throw L0.c("Couldn't match " + pattern.pattern() + " in " + str, (Throwable) null);
    }

    /* renamed from: i */
    public i a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                h p10 = p(new b(arrayDeque, bufferedReader), uri.toString());
                                M.n(bufferedReader);
                                return p10;
                            }
                        }
                    } else {
                        M.n(bufferedReader);
                        throw L0.c("Failed to parse the playlist, could not identify any tags.", (Throwable) null);
                    }
                }
                arrayDeque.add(trim);
                return o(this.f34386a, this.f34387b, new b(arrayDeque, bufferedReader), uri.toString());
            }
            throw L0.c("Input does not start with the #EXTM3U header.", (Throwable) null);
        } finally {
            M.n(bufferedReader);
        }
    }

    public j(h hVar, g gVar) {
        this.f34386a = hVar;
        this.f34387b = gVar;
    }
}
