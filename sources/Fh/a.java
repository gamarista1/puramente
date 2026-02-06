package Fh;

import Gh.C5404e;
import Gh.C5407h;
import Gh.C5408i;
import Gh.U;
import java.io.Closeable;
import java.util.zip.Deflater;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63086a;

    /* renamed from: b  reason: collision with root package name */
    private final C5404e f63087b;

    /* renamed from: c  reason: collision with root package name */
    private final Deflater f63088c;

    /* renamed from: d  reason: collision with root package name */
    private final C5408i f63089d;

    public a(boolean z10) {
        this.f63086a = z10;
        C5404e eVar = new C5404e();
        this.f63087b = eVar;
        Deflater deflater = new Deflater(-1, true);
        this.f63088c = deflater;
        this.f63089d = new C5408i((U) eVar, deflater);
    }

    private final boolean b(C5404e eVar, C5407h hVar) {
        return eVar.F0(eVar.B0() - ((long) hVar.O()), hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        wf.C6763c.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(Gh.C5404e r6) {
        /*
            r5 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            Gh.e r0 = r5.f63087b
            long r0 = r0.B0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            boolean r0 = r5.f63086a
            if (r0 == 0) goto L_0x001a
            java.util.zip.Deflater r0 = r5.f63088c
            r0.reset()
        L_0x001a:
            Gh.i r0 = r5.f63089d
            long r1 = r6.B0()
            r0.P(r6, r1)
            Gh.i r0 = r5.f63089d
            r0.flush()
            Gh.e r0 = r5.f63087b
            Gh.h r1 = Fh.b.f63090a
            boolean r0 = r5.b(r0, r1)
            if (r0 == 0) goto L_0x0053
            Gh.e r0 = r5.f63087b
            long r0 = r0.B0()
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 - r2
            Gh.e r2 = r5.f63087b
            r3 = 1
            r4 = 0
            Gh.e$a r2 = Gh.C5404e.j0(r2, r4, r3, r4)
            r2.f(r0)     // Catch:{ all -> 0x004c }
            wf.C6763c.a(r2, r4)
            goto L_0x0059
        L_0x004c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            wf.C6763c.a(r2, r6)
            throw r0
        L_0x0053:
            Gh.e r0 = r5.f63087b
            r1 = 0
            r0.K0(r1)
        L_0x0059:
            Gh.e r0 = r5.f63087b
            long r1 = r0.B0()
            r6.P(r0, r1)
            return
        L_0x0063:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fh.a.a(Gh.e):void");
    }

    public void close() {
        this.f63089d.close();
    }
}
