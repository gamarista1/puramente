package u9;

import ja.B;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q9.j;

final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private long f48689b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f48690c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f48691d = new long[0];

    public d() {
        super(new j());
    }

    private static Boolean g(B b10) {
        boolean z10 = true;
        if (b10.D() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private static Object h(B b10, int i10) {
        if (i10 == 0) {
            return j(b10);
        }
        if (i10 == 1) {
            return g(b10);
        }
        if (i10 == 2) {
            return n(b10);
        }
        if (i10 == 3) {
            return l(b10);
        }
        if (i10 == 8) {
            return k(b10);
        }
        if (i10 == 10) {
            return m(b10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(b10);
    }

    private static Date i(B b10) {
        Date date = new Date((long) j(b10).doubleValue());
        b10.Q(2);
        return date;
    }

    private static Double j(B b10) {
        return Double.valueOf(Double.longBitsToDouble(b10.w()));
    }

    private static HashMap k(B b10) {
        int H10 = b10.H();
        HashMap hashMap = new HashMap(H10);
        for (int i10 = 0; i10 < H10; i10++) {
            String n10 = n(b10);
            Object h10 = h(b10, o(b10));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap l(B b10) {
        HashMap hashMap = new HashMap();
        while (true) {
            String n10 = n(b10);
            int o10 = o(b10);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(b10, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList m(B b10) {
        int H10 = b10.H();
        ArrayList arrayList = new ArrayList(H10);
        for (int i10 = 0; i10 < H10; i10++) {
            Object h10 = h(b10, o(b10));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(B b10) {
        int J10 = b10.J();
        int e10 = b10.e();
        b10.Q(J10);
        return new String(b10.d(), e10, J10);
    }

    private static int o(B b10) {
        return b10.D();
    }

    /* access modifiers changed from: protected */
    public boolean b(B b10) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(B b10, long j10) {
        if (o(b10) != 2 || !"onMetaData".equals(n(b10)) || b10.a() == 0 || o(b10) != 8) {
            return false;
        }
        HashMap k10 = k(b10);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f48689b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f48690c = new long[size];
                this.f48691d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f48690c = new long[0];
                        this.f48691d = new long[0];
                    } else {
                        this.f48690c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f48691d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f48690c = new long[0];
                this.f48691d = new long[0];
            }
        }
        return false;
    }

    public long d() {
        return this.f48689b;
    }

    public long[] e() {
        return this.f48691d;
    }

    public long[] f() {
        return this.f48690c;
    }
}
