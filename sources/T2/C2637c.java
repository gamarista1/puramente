package t2;

import S2.f;
import i2.C2076a;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.u;

/* renamed from: t2.c  reason: case insensitive filesystem */
public final class C2637c implements C2626N {

    /* renamed from: a  reason: collision with root package name */
    private final u f26165a;

    /* renamed from: b  reason: collision with root package name */
    private C2972p f26166b;

    /* renamed from: c  reason: collision with root package name */
    private C2973q f26167c;

    public C2637c(u uVar) {
        this.f26165a = uVar;
    }

    public void a(long j10, long j11) {
        ((C2972p) C2076a.e(this.f26166b)).a(j10, j11);
    }

    public void b() {
        C2972p pVar = this.f26166b;
        if (pVar != null) {
            C2972p h10 = pVar.h();
            if (h10 instanceof f) {
                ((f) h10).l();
            }
        }
    }

    public long c() {
        C2973q qVar = this.f26167c;
        if (qVar != null) {
            return qVar.getPosition();
        }
        return -1;
    }

    public int d(I i10) {
        return ((C2972p) C2076a.e(this.f26166b)).i((C2973q) C2076a.e(this.f26167c), i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0.getPosition() != r11) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r0.getPosition() != r11) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(f2.C1975j r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, z2.r r15) {
        /*
            r7 = this;
            z2.i r6 = new z2.i
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f26167c = r6
            z2.p r8 = r7.f26166b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            z2.u r8 = r7.f26165a
            z2.p[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            com.google.common.collect.v$a r10 = com.google.common.collect.C4770v.v(r10)
            int r13 = r8.length
            r14 = 0
            r0 = 1
            if (r13 != r0) goto L_0x0025
            r8 = r8[r14]
            r7.f26166b = r8
            goto L_0x0082
        L_0x0025:
            int r13 = r8.length
            r1 = r14
        L_0x0027:
            if (r1 >= r13) goto L_0x007e
            r2 = r8[r1]
            boolean r3 = r2.j(r6)     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            if (r3 == 0) goto L_0x003c
            r7.f26166b = r2     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            i2.C2076a.g(r0)
            r6.e()
            goto L_0x007e
        L_0x003a:
            r8 = move-exception
            goto L_0x005a
        L_0x003c:
            java.util.List r2 = r2.k()     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            r10.j(r2)     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            z2.p r2 = r7.f26166b
            if (r2 != 0) goto L_0x0052
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r2 = r14
            goto L_0x0053
        L_0x0052:
            r2 = r0
        L_0x0053:
            i2.C2076a.g(r2)
            r6.e()
            goto L_0x007b
        L_0x005a:
            z2.p r9 = r7.f26166b
            if (r9 != 0) goto L_0x0066
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0067
        L_0x0066:
            r14 = r0
        L_0x0067:
            i2.C2076a.g(r14)
            r6.e()
            throw r8
        L_0x006e:
            z2.p r2 = r7.f26166b
            if (r2 != 0) goto L_0x0052
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
            goto L_0x0052
        L_0x007b:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x007e:
            z2.p r11 = r7.f26166b
            if (r11 == 0) goto L_0x0088
        L_0x0082:
            z2.p r8 = r7.f26166b
            r8.f(r15)
            return
        L_0x0088:
            t2.k0 r11 = new t2.k0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            nb.h r13 = nb.C5113h.g(r13)
            com.google.common.collect.v r8 = com.google.common.collect.C4770v.A(r8)
            t2.b r14 = new t2.b
            r14.<init>()
            java.util.List r8 = com.google.common.collect.E.k(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = i2.C2076a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            com.google.common.collect.v r10 = r10.k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2637c.e(f2.j, android.net.Uri, java.util.Map, long, long, z2.r):void");
    }

    public void release() {
        C2972p pVar = this.f26166b;
        if (pVar != null) {
            pVar.release();
            this.f26166b = null;
        }
        this.f26167c = null;
    }
}
