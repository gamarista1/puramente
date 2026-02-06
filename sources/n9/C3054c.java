package N9;

import ja.C3645a;
import q9.k;
import q9.l;
import q9.p;
import q9.y;
import x9.C4184f;

/* renamed from: N9.c  reason: case insensitive filesystem */
public final class C3054c implements B {

    /* renamed from: a  reason: collision with root package name */
    private final p f33207a;

    /* renamed from: b  reason: collision with root package name */
    private k f33208b;

    /* renamed from: c  reason: collision with root package name */
    private l f33209c;

    public C3054c(p pVar) {
        this.f33207a = pVar;
    }

    public void a(long j10, long j11) {
        ((k) C3645a.e(this.f33208b)).a(j10, j11);
    }

    public void b() {
        k kVar = this.f33208b;
        if (kVar instanceof C4184f) {
            ((C4184f) kVar).j();
        }
    }

    public long c() {
        l lVar = this.f33209c;
        if (lVar != null) {
            return lVar.getPosition();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0.getPosition() != r11) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r0.getPosition() != r11) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(ia.C3610h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, q9.m r15) {
        /*
            r7 = this;
            q9.e r6 = new q9.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f33209c = r6
            q9.k r8 = r7.f33208b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            q9.p r8 = r7.f33207a
            q9.k[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f33208b = r8
            goto L_0x0076
        L_0x0020:
            int r10 = r8.length
            r0 = r13
        L_0x0022:
            if (r0 >= r10) goto L_0x0072
            r1 = r8[r0]
            boolean r2 = r1.h(r6)     // Catch:{ EOFException -> 0x0062, all -> 0x0035 }
            if (r2 == 0) goto L_0x0037
            r7.f33208b = r1     // Catch:{ EOFException -> 0x0062, all -> 0x0035 }
            ja.C3645a.f(r14)
            r6.e()
            goto L_0x0072
        L_0x0035:
            r8 = move-exception
            goto L_0x004e
        L_0x0037:
            q9.k r1 = r7.f33208b
            if (r1 != 0) goto L_0x0046
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r1 = r13
            goto L_0x0047
        L_0x0046:
            r1 = r14
        L_0x0047:
            ja.C3645a.f(r1)
            r6.e()
            goto L_0x006f
        L_0x004e:
            q9.k r9 = r7.f33208b
            if (r9 != 0) goto L_0x005a
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x005b
        L_0x005a:
            r13 = r14
        L_0x005b:
            ja.C3645a.f(r13)
            r6.e()
            throw r8
        L_0x0062:
            q9.k r1 = r7.f33208b
            if (r1 != 0) goto L_0x0046
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0044
            goto L_0x0046
        L_0x006f:
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0072:
            q9.k r10 = r7.f33208b
            if (r10 == 0) goto L_0x007c
        L_0x0076:
            q9.k r8 = r7.f33208b
            r8.f(r15)
            return
        L_0x007c:
            N9.W r10 = new N9.W
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = ja.M.M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = ja.C3645a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.C3054c.d(ia.h, android.net.Uri, java.util.Map, long, long, q9.m):void");
    }

    public int e(y yVar) {
        return ((k) C3645a.e(this.f33208b)).i((l) C3645a.e(this.f33209c), yVar);
    }

    public void release() {
        k kVar = this.f33208b;
        if (kVar != null) {
            kVar.release();
            this.f33208b = null;
        }
        this.f33209c = null;
    }
}
