package Gh;

import kotlin.jvm.internal.C6496s;

public final class N implements W {

    /* renamed from: a  reason: collision with root package name */
    private final C5406g f63226a;

    /* renamed from: b  reason: collision with root package name */
    private final C5404e f63227b;

    /* renamed from: c  reason: collision with root package name */
    private Q f63228c;

    /* renamed from: d  reason: collision with root package name */
    private int f63229d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f63230e;

    /* renamed from: f  reason: collision with root package name */
    private long f63231f;

    public N(C5406g gVar) {
        int i10;
        C6496s.h(gVar, "upstream");
        this.f63226a = gVar;
        C5404e i11 = gVar.i();
        this.f63227b = i11;
        Q q10 = i11.f63284a;
        this.f63228c = q10;
        if (q10 != null) {
            i10 = q10.f63242b;
        } else {
            i10 = -1;
        }
        this.f63229d = i10;
    }

    public void close() {
        this.f63230e = true;
    }

    public X timeout() {
        return this.f63226a.timeout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 == r4.f63242b) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long y1(Gh.C5404e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            boolean r3 = r8.f63230e
            if (r3 != 0) goto L_0x006d
            Gh.Q r3 = r8.f63228c
            if (r3 == 0) goto L_0x002b
            Gh.e r4 = r8.f63227b
            Gh.Q r4 = r4.f63284a
            if (r3 != r4) goto L_0x0023
            int r3 = r8.f63229d
            kotlin.jvm.internal.C6496s.e(r4)
            int r4 = r4.f63242b
            if (r3 != r4) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            return r0
        L_0x002e:
            Gh.g r0 = r8.f63226a
            long r1 = r8.f63231f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.e0(r1)
            if (r0 != 0) goto L_0x003e
            r9 = -1
            return r9
        L_0x003e:
            Gh.Q r0 = r8.f63228c
            if (r0 != 0) goto L_0x0051
            Gh.e r0 = r8.f63227b
            Gh.Q r0 = r0.f63284a
            if (r0 == 0) goto L_0x0051
            r8.f63228c = r0
            kotlin.jvm.internal.C6496s.e(r0)
            int r0 = r0.f63242b
            r8.f63229d = r0
        L_0x0051:
            Gh.e r0 = r8.f63227b
            long r0 = r0.B0()
            long r2 = r8.f63231f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            Gh.e r2 = r8.f63227b
            long r4 = r8.f63231f
            r3 = r9
            r6 = r10
            r2.y(r3, r4, r6)
            long r0 = r8.f63231f
            long r0 = r0 + r10
            r8.f63231f = r0
            return r10
        L_0x006d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L_0x0075:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.N.y1(Gh.e, long):long");
    }
}
