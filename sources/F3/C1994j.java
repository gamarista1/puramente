package f3;

import android.util.SparseArray;
import com.google.common.collect.C4770v;
import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2079d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f3.j  reason: case insensitive filesystem */
public final class C1994j implements K.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f20557a;

    /* renamed from: b  reason: collision with root package name */
    private final List f20558b;

    public C1994j(int i10) {
        this(i10, C4770v.E());
    }

    private F c(K.b bVar) {
        return new F(e(bVar));
    }

    private M d(K.b bVar) {
        return new M(e(bVar));
    }

    private List e(K.b bVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        if (f(32)) {
            return this.f20558b;
        }
        C2073A a10 = new C2073A(bVar.f20478e);
        List list2 = this.f20558b;
        while (a10.a() > 0) {
            int H10 = a10.H();
            int f10 = a10.f() + a10.H();
            if (H10 == 134) {
                list2 = new ArrayList();
                int H11 = a10.H() & 31;
                for (int i11 = 0; i11 < H11; i11++) {
                    String E10 = a10.E(3);
                    int H12 = a10.H();
                    boolean z11 = true;
                    if ((H12 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = H12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte H13 = (byte) a10.H();
                    a10.V(1);
                    if (z10) {
                        if ((H13 & 64) == 0) {
                            z11 = false;
                        }
                        list = C2079d.b(z11);
                    } else {
                        list = null;
                    }
                    list2.add(new s.b().o0(str).e0(E10).L(i10).b0(list).K());
                }
            }
            a10.U(f10);
        }
        return list2;
    }

    private boolean f(int i10) {
        if ((i10 & this.f20557a) != 0) {
            return true;
        }
        return false;
    }

    public SparseArray a() {
        return new SparseArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        return new f3.y(new f3.C1987c(r6.f20475b, r6.a()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f3.K b(int r5, f3.K.b r6) {
        /*
            r4 = this;
            r0 = 2
            if (r5 == r0) goto L_0x0150
            r1 = 3
            if (r5 == r1) goto L_0x013f
            r1 = 4
            if (r5 == r1) goto L_0x013f
            r2 = 21
            if (r5 == r2) goto L_0x0134
            r2 = 27
            r3 = 0
            if (r5 == r2) goto L_0x0113
            r1 = 36
            if (r5 == r1) goto L_0x0104
            r1 = 45
            if (r5 == r1) goto L_0x00f9
            r1 = 89
            if (r5 == r1) goto L_0x00ec
            r1 = 172(0xac, float:2.41E-43)
            if (r5 == r1) goto L_0x00db
            r1 = 257(0x101, float:3.6E-43)
            if (r5 == r1) goto L_0x00ce
            r1 = 138(0x8a, float:1.93E-43)
            if (r5 == r1) goto L_0x00bb
            r1 = 139(0x8b, float:1.95E-43)
            if (r5 == r1) goto L_0x00a8
            switch(r5) {
                case 15: goto L_0x008f;
                case 16: goto L_0x0080;
                case 17: goto L_0x0068;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r5) {
                case 128: goto L_0x0150;
                case 129: goto L_0x0057;
                case 130: goto L_0x004e;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r5) {
                case 134: goto L_0x0038;
                case 135: goto L_0x0057;
                case 136: goto L_0x00bb;
                default: goto L_0x0037;
            }
        L_0x0037:
            return r3
        L_0x0038:
            r5 = 16
            boolean r5 = r4.f(r5)
            if (r5 == 0) goto L_0x0041
            goto L_0x004d
        L_0x0041:
            f3.E r3 = new f3.E
            f3.x r5 = new f3.x
            java.lang.String r6 = "application/x-scte35"
            r5.<init>(r6)
            r3.<init>(r5)
        L_0x004d:
            return r3
        L_0x004e:
            r5 = 64
            boolean r5 = r4.f(r5)
            if (r5 != 0) goto L_0x00bb
            return r3
        L_0x0057:
            f3.y r5 = new f3.y
            f3.c r0 = new f3.c
            java.lang.String r1 = r6.f20475b
            int r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L_0x0068:
            boolean r5 = r4.f(r0)
            if (r5 == 0) goto L_0x006f
            goto L_0x007f
        L_0x006f:
            f3.y r3 = new f3.y
            f3.s r5 = new f3.s
            java.lang.String r0 = r6.f20475b
            int r6 = r6.a()
            r5.<init>(r0, r6)
            r3.<init>(r5)
        L_0x007f:
            return r3
        L_0x0080:
            f3.y r5 = new f3.y
            f3.o r0 = new f3.o
            f3.M r6 = r4.d(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L_0x008f:
            boolean r5 = r4.f(r0)
            if (r5 == 0) goto L_0x0096
            goto L_0x00a7
        L_0x0096:
            f3.y r3 = new f3.y
            f3.i r5 = new f3.i
            java.lang.String r0 = r6.f20475b
            int r6 = r6.a()
            r1 = 0
            r5.<init>(r1, r0, r6)
            r3.<init>(r5)
        L_0x00a7:
            return r3
        L_0x00a8:
            f3.y r5 = new f3.y
            f3.k r0 = new f3.k
            java.lang.String r1 = r6.f20475b
            int r6 = r6.a()
            r2 = 5408(0x1520, float:7.578E-42)
            r0.<init>(r1, r6, r2)
            r5.<init>(r0)
            return r5
        L_0x00bb:
            f3.y r5 = new f3.y
            f3.k r0 = new f3.k
            java.lang.String r1 = r6.f20475b
            int r6 = r6.a()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1, r6, r2)
            r5.<init>(r0)
            return r5
        L_0x00ce:
            f3.E r5 = new f3.E
            f3.x r6 = new f3.x
            java.lang.String r0 = "application/vnd.dvb.ait"
            r6.<init>(r0)
            r5.<init>(r6)
            return r5
        L_0x00db:
            f3.y r5 = new f3.y
            f3.f r0 = new f3.f
            java.lang.String r1 = r6.f20475b
            int r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L_0x00ec:
            f3.y r5 = new f3.y
            f3.l r0 = new f3.l
            java.util.List r6 = r6.f20477d
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L_0x00f9:
            f3.y r5 = new f3.y
            f3.u r6 = new f3.u
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x0104:
            f3.y r5 = new f3.y
            f3.q r0 = new f3.q
            f3.F r6 = r4.c(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L_0x0113:
            boolean r5 = r4.f(r1)
            if (r5 == 0) goto L_0x011a
            goto L_0x0133
        L_0x011a:
            f3.y r3 = new f3.y
            f3.p r5 = new f3.p
            f3.F r6 = r4.c(r6)
            r0 = 1
            boolean r0 = r4.f(r0)
            r1 = 8
            boolean r1 = r4.f(r1)
            r5.<init>(r6, r0, r1)
            r3.<init>(r5)
        L_0x0133:
            return r3
        L_0x0134:
            f3.y r5 = new f3.y
            f3.r r6 = new f3.r
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x013f:
            f3.y r5 = new f3.y
            f3.t r0 = new f3.t
            java.lang.String r1 = r6.f20475b
            int r6 = r6.a()
            r0.<init>(r1, r6)
            r5.<init>(r0)
            return r5
        L_0x0150:
            f3.y r5 = new f3.y
            f3.n r0 = new f3.n
            f3.M r6 = r4.d(r6)
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C1994j.b(int, f3.K$b):f3.K");
    }

    public C1994j(int i10, List list) {
        this.f20557a = i10;
        this.f20558b = list;
    }
}
