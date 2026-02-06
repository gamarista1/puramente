package X8;

import X8.i;
import android.util.SparseArray;

public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(b bVar);

        public abstract a c(c cVar);
    }

    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: w  reason: collision with root package name */
        private static final SparseArray f35513w = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f35515a;

        static {
            b bVar;
            b bVar2;
            b bVar3;
            b bVar4;
            b bVar5;
            b bVar6;
            b bVar7;
            b bVar8;
            b bVar9;
            b bVar10;
            b bVar11;
            b bVar12;
            b bVar13;
            b bVar14;
            b bVar15;
            b bVar16;
            b bVar17;
            b bVar18;
            b bVar19;
            b bVar20;
            SparseArray sparseArray = new SparseArray();
            f35513w = sparseArray;
            sparseArray.put(0, bVar14);
            sparseArray.put(1, bVar11);
            sparseArray.put(2, bVar8);
            sparseArray.put(3, bVar5);
            sparseArray.put(4, bVar2);
            sparseArray.put(5, bVar);
            sparseArray.put(6, bVar3);
            sparseArray.put(7, bVar4);
            sparseArray.put(8, bVar6);
            sparseArray.put(9, bVar7);
            sparseArray.put(10, bVar9);
            sparseArray.put(11, bVar10);
            sparseArray.put(12, bVar12);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar19);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar20);
        }

        private b(int i10) {
            this.f35515a = i10;
        }

        public static b a(int i10) {
            return (b) f35513w.get(i10);
        }

        public int b() {
            return this.f35515a;
        }
    }

    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: u  reason: collision with root package name */
        private static final SparseArray f35535u = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f35537a;

        static {
            c cVar;
            c cVar2;
            c cVar3;
            c cVar4;
            c cVar5;
            c cVar6;
            c cVar7;
            c cVar8;
            c cVar9;
            c cVar10;
            c cVar11;
            c cVar12;
            c cVar13;
            c cVar14;
            c cVar15;
            c cVar16;
            c cVar17;
            c cVar18;
            c cVar19;
            SparseArray sparseArray = new SparseArray();
            f35535u = sparseArray;
            sparseArray.put(0, cVar14);
            sparseArray.put(1, cVar11);
            sparseArray.put(2, cVar8);
            sparseArray.put(3, cVar5);
            sparseArray.put(4, cVar2);
            sparseArray.put(5, cVar);
            sparseArray.put(6, cVar3);
            sparseArray.put(7, cVar4);
            sparseArray.put(8, cVar6);
            sparseArray.put(9, cVar7);
            sparseArray.put(10, cVar9);
            sparseArray.put(11, cVar10);
            sparseArray.put(12, cVar12);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar18);
            sparseArray.put(17, cVar17);
            sparseArray.put(-1, cVar19);
        }

        private c(int i10) {
            this.f35537a = i10;
        }

        public static c a(int i10) {
            return (c) f35535u.get(i10);
        }

        public int b() {
            return this.f35537a;
        }
    }

    public static a a() {
        return new i.b();
    }

    public abstract b b();

    public abstract c c();
}
