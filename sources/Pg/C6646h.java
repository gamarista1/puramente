package pg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pg.C6648j;
import pg.p;
import pg.y;

/* renamed from: pg.h  reason: case insensitive filesystem */
final class C6646h {

    /* renamed from: d  reason: collision with root package name */
    private static final C6646h f72521d = new C6646h(true);

    /* renamed from: a  reason: collision with root package name */
    private final u f72522a = u.r(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f72523b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f72524c = false;

    /* renamed from: pg.h$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72525a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f72526b;

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
                pg.y$b[] r0 = pg.y.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f72526b = r0
                r1 = 1
                pg.y$b r2 = pg.y.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f72526b     // Catch:{ NoSuchFieldError -> 0x001d }
                pg.y$b r3 = pg.y.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f72526b     // Catch:{ NoSuchFieldError -> 0x0028 }
                pg.y$b r4 = pg.y.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f72526b     // Catch:{ NoSuchFieldError -> 0x0033 }
                pg.y$b r5 = pg.y.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f72526b     // Catch:{ NoSuchFieldError -> 0x003e }
                pg.y$b r6 = pg.y.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f72526b     // Catch:{ NoSuchFieldError -> 0x0049 }
                pg.y$b r7 = pg.y.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f72526b     // Catch:{ NoSuchFieldError -> 0x0054 }
                pg.y$b r8 = pg.y.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f72526b     // Catch:{ NoSuchFieldError -> 0x0060 }
                pg.y$b r9 = pg.y.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x006c }
                pg.y$b r10 = pg.y.b.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x0078 }
                pg.y$b r10 = pg.y.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x0084 }
                pg.y$b r10 = pg.y.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x0090 }
                pg.y$b r10 = pg.y.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x009c }
                pg.y$b r10 = pg.y.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                pg.y$b r10 = pg.y.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                pg.y$b r10 = pg.y.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                pg.y$b r10 = pg.y.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x00cc }
                pg.y$b r10 = pg.y.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f72526b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                pg.y$b r10 = pg.y.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                pg.y$c[] r9 = pg.y.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f72525a = r9
                pg.y$c r10 = pg.y.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f72525a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                pg.y$c r9 = pg.y.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x00fd }
                pg.y$c r1 = pg.y.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x0107 }
                pg.y$c r1 = pg.y.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x0111 }
                pg.y$c r1 = pg.y.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x011b }
                pg.y$c r1 = pg.y.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x0125 }
                pg.y$c r1 = pg.y.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x012f }
                pg.y$c r1 = pg.y.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f72525a     // Catch:{ NoSuchFieldError -> 0x0139 }
                pg.y$c r1 = pg.y.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pg.C6646h.a.<clinit>():void");
        }
    }

    /* renamed from: pg.h$b */
    public interface b extends Comparable {
        int d();

        boolean g();

        y.b h();

        boolean k();

        p.a n(p.a aVar, p pVar);

        y.c v();
    }

    private C6646h() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(y.b bVar, int i10, Object obj) {
        int C10 = C6644f.C(i10);
        if (bVar == y.b.GROUP) {
            C10 *= 2;
        }
        return C10 + e(bVar, obj);
    }

    private static int e(y.b bVar, Object obj) {
        switch (a.f72526b[bVar.ordinal()]) {
            case 1:
                return C6644f.g(((Double) obj).doubleValue());
            case 2:
                return C6644f.m(((Float) obj).floatValue());
            case 3:
                return C6644f.q(((Long) obj).longValue());
            case 4:
                return C6644f.E(((Long) obj).longValue());
            case 5:
                return C6644f.p(((Integer) obj).intValue());
            case 6:
                return C6644f.k(((Long) obj).longValue());
            case 7:
                return C6644f.j(((Integer) obj).intValue());
            case 8:
                return C6644f.b(((Boolean) obj).booleanValue());
            case 9:
                return C6644f.B((String) obj);
            case 10:
                if (obj instanceof C6642d) {
                    return C6644f.e((C6642d) obj);
                }
                return C6644f.c((byte[]) obj);
            case 11:
                return C6644f.D(((Integer) obj).intValue());
            case 12:
                return C6644f.w(((Integer) obj).intValue());
            case 13:
                return C6644f.x(((Long) obj).longValue());
            case StdKeyDeserializer.TYPE_URL:
                return C6644f.y(((Integer) obj).intValue());
            case StdKeyDeserializer.TYPE_CLASS:
                return C6644f.A(((Long) obj).longValue());
            case 16:
                return C6644f.n((p) obj);
            case 17:
                return C6644f.s((p) obj);
            case 18:
                if (obj instanceof C6648j.a) {
                    return C6644f.i(((C6648j.a) obj).d());
                }
                return C6644f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        y.b h10 = bVar.h();
        int d10 = bVar.d();
        if (!bVar.g()) {
            return d(h10, d10, obj);
        }
        int i10 = 0;
        if (bVar.k()) {
            for (Object e10 : (List) obj) {
                i10 += e(h10, e10);
            }
            return C6644f.C(d10) + i10 + C6644f.u(i10);
        }
        for (Object d11 : (List) obj) {
            i10 += d(h10, d10, d11);
        }
        return i10;
    }

    public static C6646h g() {
        return f72521d;
    }

    static int l(y.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.v() != y.c.MESSAGE) {
            return true;
        }
        if (bVar.g()) {
            for (p e10 : (List) entry.getValue()) {
                if (!e10.e()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof p)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else if (!((p) value).e()) {
            return false;
        } else {
            return true;
        }
    }

    private void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.g()) {
            Object h10 = h(bVar);
            if (h10 == null) {
                h10 = new ArrayList();
            }
            for (Object c10 : (List) value) {
                ((List) h10).add(c(c10));
            }
            this.f72522a.s(bVar, h10);
        } else if (bVar.v() == y.c.MESSAGE) {
            Object h11 = h(bVar);
            if (h11 == null) {
                this.f72522a.s(bVar, c(value));
                return;
            }
            this.f72522a.s(bVar, bVar.n(((p) h11).g(), (p) value).f());
        } else {
            this.f72522a.s(bVar, c(value));
        }
    }

    public static C6646h t() {
        return new C6646h();
    }

    public static Object u(C6643e eVar, y.b bVar, boolean z10) {
        switch (a.f72526b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.l());
            case 2:
                return Float.valueOf(eVar.p());
            case 3:
                return Long.valueOf(eVar.s());
            case 4:
                return Long.valueOf(eVar.L());
            case 5:
                return Integer.valueOf(eVar.r());
            case 6:
                return Long.valueOf(eVar.o());
            case 7:
                return Integer.valueOf(eVar.n());
            case 8:
                return Boolean.valueOf(eVar.j());
            case 9:
                if (z10) {
                    return eVar.I();
                }
                return eVar.H();
            case 10:
                return eVar.k();
            case 11:
                return Integer.valueOf(eVar.K());
            case 12:
                return Integer.valueOf(eVar.D());
            case 13:
                return Long.valueOf(eVar.E());
            case StdKeyDeserializer.TYPE_URL:
                return Integer.valueOf(eVar.F());
            case StdKeyDeserializer.TYPE_CLASS:
                return Long.valueOf(eVar.G());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if ((r3 instanceof pg.C6648j.a) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void w(pg.y.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = pg.C6646h.a.f72525a
            pg.y$c r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                case 3: goto L_0x0036;
                case 4: goto L_0x0033;
                case 5: goto L_0x0030;
                case 6: goto L_0x002d;
                case 7: goto L_0x0024;
                case 8: goto L_0x0018;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x003e
        L_0x0015:
            boolean r1 = r3 instanceof pg.p
            goto L_0x003e
        L_0x0018:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0022
            boolean r2 = r3 instanceof pg.C6648j.a
            if (r2 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            r1 = r0
            goto L_0x003e
        L_0x0024:
            boolean r2 = r3 instanceof pg.C6642d
            if (r2 != 0) goto L_0x0022
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0021
            goto L_0x0022
        L_0x002d:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x003e
        L_0x0030:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x003e
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x003e
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x003e
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x003e
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x003e:
            if (r1 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C6646h.w(pg.y$b, java.lang.Object):void");
    }

    private static void x(C6644f fVar, y.b bVar, int i10, Object obj) {
        if (bVar == y.b.GROUP) {
            fVar.X(i10, (p) obj);
            return;
        }
        fVar.v0(i10, l(bVar, false));
        y(fVar, bVar, obj);
    }

    private static void y(C6644f fVar, y.b bVar, Object obj) {
        switch (a.f72526b[bVar.ordinal()]) {
            case 1:
                fVar.Q(((Double) obj).doubleValue());
                return;
            case 2:
                fVar.W(((Float) obj).floatValue());
                return;
            case 3:
                fVar.b0(((Long) obj).longValue());
                return;
            case 4:
                fVar.y0(((Long) obj).longValue());
                return;
            case 5:
                fVar.a0(((Integer) obj).intValue());
                return;
            case 6:
                fVar.U(((Long) obj).longValue());
                return;
            case 7:
                fVar.T(((Integer) obj).intValue());
                return;
            case 8:
                fVar.L(((Boolean) obj).booleanValue());
                return;
            case 9:
                fVar.u0((String) obj);
                return;
            case 10:
                if (obj instanceof C6642d) {
                    fVar.O((C6642d) obj);
                    return;
                } else {
                    fVar.M((byte[]) obj);
                    return;
                }
            case 11:
                fVar.x0(((Integer) obj).intValue());
                return;
            case 12:
                fVar.p0(((Integer) obj).intValue());
                return;
            case 13:
                fVar.q0(((Long) obj).longValue());
                return;
            case StdKeyDeserializer.TYPE_URL:
                fVar.r0(((Integer) obj).intValue());
                return;
            case StdKeyDeserializer.TYPE_CLASS:
                fVar.t0(((Long) obj).longValue());
                return;
            case 16:
                fVar.Y((p) obj);
                return;
            case 17:
                fVar.d0((p) obj);
                return;
            case 18:
                if (obj instanceof C6648j.a) {
                    fVar.S(((C6648j.a) obj).d());
                    return;
                } else {
                    fVar.S(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void z(b bVar, Object obj, C6644f fVar) {
        y.b h10 = bVar.h();
        int d10 = bVar.d();
        if (bVar.g()) {
            List<Object> list = (List) obj;
            if (bVar.k()) {
                fVar.v0(d10, 2);
                int i10 = 0;
                for (Object e10 : list) {
                    i10 += e(h10, e10);
                }
                fVar.n0(i10);
                for (Object y10 : list) {
                    y(fVar, h10, y10);
                }
                return;
            }
            for (Object x10 : list) {
                x(fVar, h10, d10, x10);
            }
            return;
        }
        x(fVar, h10, d10, obj);
    }

    public void a(b bVar, Object obj) {
        List list;
        if (bVar.g()) {
            w(bVar.h(), obj);
            Object h10 = h(bVar);
            if (h10 == null) {
                list = new ArrayList();
                this.f72522a.s(bVar, list);
            } else {
                list = (List) h10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C6646h clone() {
        C6646h t10 = t();
        for (int i10 = 0; i10 < this.f72522a.l(); i10++) {
            Map.Entry k10 = this.f72522a.k(i10);
            t10.v((b) k10.getKey(), k10.getValue());
        }
        for (Map.Entry entry : this.f72522a.n()) {
            t10.v((b) entry.getKey(), entry.getValue());
        }
        t10.f72524c = this.f72524c;
        return t10;
    }

    public Object h(b bVar) {
        return this.f72522a.get(bVar);
    }

    public Object i(b bVar, int i10) {
        if (bVar.g()) {
            Object h10 = h(bVar);
            if (h10 != null) {
                return ((List) h10).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int j(b bVar) {
        if (bVar.g()) {
            Object h10 = h(bVar);
            if (h10 == null) {
                return 0;
            }
            return ((List) h10).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f72522a.l(); i11++) {
            Map.Entry k10 = this.f72522a.k(i11);
            i10 += f((b) k10.getKey(), k10.getValue());
        }
        for (Map.Entry entry : this.f72522a.n()) {
            i10 += f((b) entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean m(b bVar) {
        if (bVar.g()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        } else if (this.f72522a.get(bVar) != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f72522a.l(); i10++) {
            if (!o(this.f72522a.k(i10))) {
                return false;
            }
        }
        for (Map.Entry o10 : this.f72522a.n()) {
            if (!o(o10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        if (this.f72524c) {
            return new C6650l(this.f72522a.entrySet().iterator());
        }
        return this.f72522a.entrySet().iterator();
    }

    public void q() {
        if (!this.f72523b) {
            this.f72522a.q();
            this.f72523b = true;
        }
    }

    public void r(C6646h hVar) {
        for (int i10 = 0; i10 < hVar.f72522a.l(); i10++) {
            s(hVar.f72522a.k(i10));
        }
        for (Map.Entry s10 : hVar.f72522a.n()) {
            s(s10);
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.g()) {
            w(bVar.h(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object w10 : arrayList) {
                w(bVar.h(), w10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f72522a.s(bVar, obj);
    }

    private C6646h(boolean z10) {
        q();
    }
}
