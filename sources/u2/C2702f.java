package u2;

import W2.e;
import com.google.common.collect.B;
import com.google.common.collect.C4770v;
import java.util.ArrayList;

/* renamed from: u2.f  reason: case insensitive filesystem */
final class C2702f implements C2697a {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f26558a = new ArrayList();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f26558a.size(); i10++) {
            if (j10 < ((e) this.f26558a.get(i10)).f8638b) {
                return i10;
            }
        }
        return this.f26558a.size();
    }

    public C4770v a(long j10) {
        int f10 = f(j10);
        if (f10 == 0) {
            return C4770v.E();
        }
        e eVar = (e) this.f26558a.get(f10 - 1);
        long j11 = eVar.f8640d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return eVar.f8637a;
        }
        return C4770v.E();
    }

    public long b(long j10) {
        if (this.f26558a.isEmpty() || j10 < ((e) this.f26558a.get(0)).f8638b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f26558a.size(); i10++) {
            long j11 = ((e) this.f26558a.get(i10)).f8638b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                e eVar = (e) this.f26558a.get(i10 - 1);
                long j12 = eVar.f8640d;
                if (j12 == -9223372036854775807L || j12 > j10) {
                    return eVar.f8638b;
                }
                return j12;
            }
        }
        e eVar2 = (e) B.d(this.f26558a);
        long j13 = eVar2.f8640d;
        if (j13 == -9223372036854775807L || j10 < j13) {
            return eVar2.f8638b;
        }
        return j13;
    }

    public long c(long j10) {
        if (this.f26558a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((e) this.f26558a.get(0)).f8638b) {
            return ((e) this.f26558a.get(0)).f8638b;
        }
        for (int i10 = 1; i10 < this.f26558a.size(); i10++) {
            e eVar = (e) this.f26558a.get(i10);
            if (j10 < eVar.f8638b) {
                long j11 = ((e) this.f26558a.get(i10 - 1)).f8640d;
                if (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f8638b) {
                    return eVar.f8638b;
                }
                return j11;
            }
        }
        long j12 = ((e) B.d(this.f26558a)).f8640d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    public void clear() {
        this.f26558a.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(W2.e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f8638b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000f
            r0 = r4
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            i2.C2076a.a(r0)
            long r5 = r10.f8638b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            long r5 = r10.f8640d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
        L_0x0023:
            r0 = r4
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            java.util.ArrayList r2 = r9.f26558a
            int r2 = r2.size()
            int r2 = r2 - r4
        L_0x002d:
            if (r2 < 0) goto L_0x0058
            long r5 = r10.f8638b
            java.util.ArrayList r3 = r9.f26558a
            java.lang.Object r3 = r3.get(r2)
            W2.e r3 = (W2.e) r3
            long r7 = r3.f8638b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0046
            java.util.ArrayList r11 = r9.f26558a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L_0x0046:
            java.util.ArrayList r3 = r9.f26558a
            java.lang.Object r3 = r3.get(r2)
            W2.e r3 = (W2.e) r3
            long r5 = r3.f8638b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0055
            r0 = r1
        L_0x0055:
            int r2 = r2 + -1
            goto L_0x002d
        L_0x0058:
            java.util.ArrayList r11 = r9.f26558a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C2702f.d(W2.e, long):boolean");
    }

    public void e(long j10) {
        int f10 = f(j10);
        if (f10 > 0) {
            this.f26558a.subList(0, f10).clear();
        }
    }
}
