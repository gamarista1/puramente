package F2;

import i2.C2073A;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z2.C2969m;

final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private long f2150b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f2151c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f2152d = new long[0];

    public d() {
        super(new C2969m());
    }

    private static Boolean g(C2073A a10) {
        boolean z10 = true;
        if (a10.H() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private static Object h(C2073A a10, int i10) {
        if (i10 == 0) {
            return j(a10);
        }
        if (i10 == 1) {
            return g(a10);
        }
        if (i10 == 2) {
            return n(a10);
        }
        if (i10 == 3) {
            return l(a10);
        }
        if (i10 == 8) {
            return k(a10);
        }
        if (i10 == 10) {
            return m(a10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(a10);
    }

    private static Date i(C2073A a10) {
        Date date = new Date((long) j(a10).doubleValue());
        a10.V(2);
        return date;
    }

    private static Double j(C2073A a10) {
        return Double.valueOf(Double.longBitsToDouble(a10.A()));
    }

    private static HashMap k(C2073A a10) {
        int L10 = a10.L();
        HashMap hashMap = new HashMap(L10);
        for (int i10 = 0; i10 < L10; i10++) {
            String n10 = n(a10);
            Object h10 = h(a10, o(a10));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap l(C2073A a10) {
        HashMap hashMap = new HashMap();
        while (true) {
            String n10 = n(a10);
            int o10 = o(a10);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(a10, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList m(C2073A a10) {
        int L10 = a10.L();
        ArrayList arrayList = new ArrayList(L10);
        for (int i10 = 0; i10 < L10; i10++) {
            Object h10 = h(a10, o(a10));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(C2073A a10) {
        int N10 = a10.N();
        int f10 = a10.f();
        a10.V(N10);
        return new String(a10.e(), f10, N10);
    }

    private static int o(C2073A a10) {
        return a10.H();
    }

    /* access modifiers changed from: protected */
    public boolean b(C2073A a10) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(C2073A a10, long j10) {
        if (o(a10) != 2 || !"onMetaData".equals(n(a10)) || a10.a() == 0 || o(a10) != 8) {
            return false;
        }
        HashMap k10 = k(a10);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f2150b = (long) (doubleValue * 1000000.0d);
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
                this.f2151c = new long[size];
                this.f2152d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f2151c = new long[0];
                        this.f2152d = new long[0];
                    } else {
                        this.f2151c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f2152d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f2151c = new long[0];
                this.f2152d = new long[0];
            }
        }
        return false;
    }

    public long d() {
        return this.f2150b;
    }

    public long[] e() {
        return this.f2152d;
    }

    public long[] f() {
        return this.f2151c;
    }
}
