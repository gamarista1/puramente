package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.c;
import androidx.datastore.preferences.protobuf.r0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s  reason: case insensitive filesystem */
final class C1745s {

    /* renamed from: d  reason: collision with root package name */
    private static final C1745s f16483d = new C1745s(true);

    /* renamed from: a  reason: collision with root package name */
    private final h0 f16484a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16485b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16486c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16487a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f16488b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                androidx.datastore.preferences.protobuf.r0$b[] r0 = androidx.datastore.preferences.protobuf.r0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16488b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.r0$b r2 = androidx.datastore.preferences.protobuf.r0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f16488b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.r0$b r3 = androidx.datastore.preferences.protobuf.r0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f16488b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.r0$b r4 = androidx.datastore.preferences.protobuf.r0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f16488b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.r0$b r5 = androidx.datastore.preferences.protobuf.r0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f16488b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.r0$b r6 = androidx.datastore.preferences.protobuf.r0.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f16488b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.r0$b r7 = androidx.datastore.preferences.protobuf.r0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f16488b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.r0$b r8 = androidx.datastore.preferences.protobuf.r0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f16488b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.r0$b r9 = androidx.datastore.preferences.protobuf.r0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f16488b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.r0$c[] r9 = androidx.datastore.preferences.protobuf.r0.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f16487a = r9
                androidx.datastore.preferences.protobuf.r0$c r10 = androidx.datastore.preferences.protobuf.r0.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f16487a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.r0$c r9 = androidx.datastore.preferences.protobuf.r0.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f16487a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1745s.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        int d();

        boolean g();

        r0.b h();

        boolean k();
    }

    private C1745s() {
        this.f16484a = h0.u(16);
    }

    static int b(r0.b bVar, int i10, Object obj) {
        int P10 = C1737j.P(i10);
        if (bVar == r0.b.GROUP) {
            P10 *= 2;
        }
        return P10 + c(bVar, obj);
    }

    static int c(r0.b bVar, Object obj) {
        switch (a.f16488b[bVar.ordinal()]) {
            case 1:
                return C1737j.i(((Double) obj).doubleValue());
            case 2:
                return C1737j.q(((Float) obj).floatValue());
            case 3:
                return C1737j.x(((Long) obj).longValue());
            case 4:
                return C1737j.T(((Long) obj).longValue());
            case 5:
                return C1737j.v(((Integer) obj).intValue());
            case 6:
                return C1737j.o(((Long) obj).longValue());
            case 7:
                return C1737j.m(((Integer) obj).intValue());
            case 8:
                return C1737j.d(((Boolean) obj).booleanValue());
            case 9:
                return C1737j.s((O) obj);
            case 10:
                return C1737j.A((O) obj);
            case 11:
                if (obj instanceof C1734g) {
                    return C1737j.g((C1734g) obj);
                }
                return C1737j.O((String) obj);
            case 12:
                if (obj instanceof C1734g) {
                    return C1737j.g((C1734g) obj);
                }
                return C1737j.e((byte[]) obj);
            case 13:
                return C1737j.R(((Integer) obj).intValue());
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return C1737j.G(((Integer) obj).intValue());
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return C1737j.I(((Long) obj).longValue());
            case 16:
                return C1737j.K(((Integer) obj).intValue());
            case 17:
                return C1737j.M(((Long) obj).longValue());
            case 18:
                return C1737j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b h10 = bVar.h();
        int d10 = bVar.d();
        if (!bVar.g()) {
            return b(h10, d10, obj);
        }
        int i10 = 0;
        if (bVar.k()) {
            for (Object c10 : (List) obj) {
                i10 += c(h10, c10);
            }
            return C1737j.P(d10) + i10 + C1737j.E(i10);
        }
        for (Object b10 : (List) obj) {
            i10 += b(h10, d10, b10);
        }
        return i10;
    }

    private int g(Map.Entry entry) {
        c.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(r0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private static boolean l(Map.Entry entry) {
        c.a(entry.getKey());
        throw null;
    }

    private static boolean m(r0.b bVar, Object obj) {
        C1751y.a(obj);
        switch (a.f16487a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof C1734g) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof O;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        c.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C1745s r() {
        return new C1745s();
    }

    private void t(r0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void u(C1737j jVar, r0.b bVar, int i10, Object obj) {
        if (bVar == r0.b.GROUP) {
            jVar.r0(i10, (O) obj);
            return;
        }
        jVar.N0(i10, i(bVar, false));
        v(jVar, bVar, obj);
    }

    static void v(C1737j jVar, r0.b bVar, Object obj) {
        switch (a.f16488b[bVar.ordinal()]) {
            case 1:
                jVar.i0(((Double) obj).doubleValue());
                return;
            case 2:
                jVar.q0(((Float) obj).floatValue());
                return;
            case 3:
                jVar.y0(((Long) obj).longValue());
                return;
            case 4:
                jVar.R0(((Long) obj).longValue());
                return;
            case 5:
                jVar.w0(((Integer) obj).intValue());
                return;
            case 6:
                jVar.o0(((Long) obj).longValue());
                return;
            case 7:
                jVar.m0(((Integer) obj).intValue());
                return;
            case 8:
                jVar.c0(((Boolean) obj).booleanValue());
                return;
            case 9:
                jVar.t0((O) obj);
                return;
            case 10:
                jVar.A0((O) obj);
                return;
            case 11:
                if (obj instanceof C1734g) {
                    jVar.g0((C1734g) obj);
                    return;
                } else {
                    jVar.M0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C1734g) {
                    jVar.g0((C1734g) obj);
                    return;
                } else {
                    jVar.d0((byte[]) obj);
                    return;
                }
            case 13:
                jVar.P0(((Integer) obj).intValue());
                return;
            case StdKeyDeserializer.TYPE_URL /*14*/:
                jVar.E0(((Integer) obj).intValue());
                return;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                jVar.G0(((Long) obj).longValue());
                return;
            case 16:
                jVar.I0(((Integer) obj).intValue());
                return;
            case 17:
                jVar.K0(((Long) obj).longValue());
                return;
            case 18:
                jVar.k0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public C1745s clone() {
        C1745s r10 = r();
        for (int i10 = 0; i10 < this.f16484a.o(); i10++) {
            Map.Entry n10 = this.f16484a.n(i10);
            c.a(n10.getKey());
            r10.s((b) null, n10.getValue());
        }
        for (Map.Entry entry : this.f16484a.q()) {
            c.a(entry.getKey());
            r10.s((b) null, entry.getValue());
        }
        r10.f16486c = this.f16486c;
        return r10;
    }

    /* access modifiers changed from: package-private */
    public Iterator e() {
        if (this.f16486c) {
            return new B(this.f16484a.k().iterator());
        }
        return this.f16484a.k().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1745s)) {
            return false;
        }
        return this.f16484a.equals(((C1745s) obj).f16484a);
    }

    public int f() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16484a.o(); i11++) {
            i10 += g(this.f16484a.n(i11));
        }
        for (Map.Entry g10 : this.f16484a.q()) {
            i10 += g(g10);
        }
        return i10;
    }

    public int h() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16484a.o(); i11++) {
            Map.Entry n10 = this.f16484a.n(i11);
            c.a(n10.getKey());
            i10 += d((b) null, n10.getValue());
        }
        for (Map.Entry entry : this.f16484a.q()) {
            c.a(entry.getKey());
            i10 += d((b) null, entry.getValue());
        }
        return i10;
    }

    public int hashCode() {
        return this.f16484a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f16484a.isEmpty();
    }

    public boolean k() {
        for (int i10 = 0; i10 < this.f16484a.o(); i10++) {
            if (!l(this.f16484a.n(i10))) {
                return false;
            }
        }
        for (Map.Entry l10 : this.f16484a.q()) {
            if (!l(l10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        if (this.f16486c) {
            return new B(this.f16484a.entrySet().iterator());
        }
        return this.f16484a.entrySet().iterator();
    }

    public void o() {
        if (!this.f16485b) {
            this.f16484a.t();
            this.f16485b = true;
        }
    }

    public void p(C1745s sVar) {
        for (int i10 = 0; i10 < sVar.f16484a.o(); i10++) {
            q(sVar.f16484a.n(i10));
        }
        for (Map.Entry q10 : sVar.f16484a.q()) {
            q(q10);
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.g()) {
            t(bVar.h(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object t10 : arrayList) {
                t(bVar.h(), t10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f16484a.v(bVar, obj);
    }

    private C1745s(boolean z10) {
        this(h0.u(0));
        o();
    }

    private C1745s(h0 h0Var) {
        this.f16484a = h0Var;
        o();
    }
}
