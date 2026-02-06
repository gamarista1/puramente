package f7;

import T5.k;
import X5.h;
import android.graphics.Bitmap;
import m7.C3783c;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private int f43433a;

    /* renamed from: b  reason: collision with root package name */
    private long f43434b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43435c;

    /* renamed from: d  reason: collision with root package name */
    private final int f43436d;

    /* renamed from: e  reason: collision with root package name */
    private final h f43437e;

    class a implements h {
        a() {
        }

        /* renamed from: b */
        public void a(Bitmap bitmap) {
            try {
                g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public g(int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        k.b(Boolean.valueOf(i11 > 0 ? true : z11));
        this.f43435c = i10;
        this.f43436d = i11;
        this.f43437e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        boolean z10;
        int j10 = C3783c.j(bitmap);
        boolean z11 = false;
        if (this.f43433a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.c(z10, "No bitmaps registered.");
        long j11 = (long) j10;
        if (j11 <= this.f43434b) {
            z11 = true;
        }
        k.d(z11, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(j10), Long.valueOf(this.f43434b));
        this.f43434b -= j11;
        this.f43433a--;
    }

    public synchronized int b() {
        return this.f43433a;
    }

    public synchronized int c() {
        return this.f43435c;
    }

    public synchronized int d() {
        return this.f43436d;
    }

    public h e() {
        return this.f43437e;
    }

    public synchronized long f() {
        return this.f43434b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean g(android.graphics.Bitmap r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r10 = m7.C3783c.j(r10)     // Catch:{ all -> 0x0021 }
            int r0 = r9.f43433a     // Catch:{ all -> 0x0021 }
            int r1 = r9.f43435c     // Catch:{ all -> 0x0021 }
            if (r0 >= r1) goto L_0x0023
            long r1 = r9.f43434b     // Catch:{ all -> 0x0021 }
            long r3 = (long) r10     // Catch:{ all -> 0x0021 }
            long r5 = r1 + r3
            int r10 = r9.f43436d     // Catch:{ all -> 0x0021 }
            long r7 = (long) r10     // Catch:{ all -> 0x0021 }
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            r10 = 1
            int r0 = r0 + r10
            r9.f43433a = r0     // Catch:{ all -> 0x0021 }
            long r1 = r1 + r3
            r9.f43434b = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r9)
            return r10
        L_0x0021:
            r10 = move-exception
            goto L_0x0026
        L_0x0023:
            monitor-exit(r9)
            r10 = 0
            return r10
        L_0x0026:
            monitor-exit(r9)     // Catch:{ all -> 0x0021 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.g.g(android.graphics.Bitmap):boolean");
    }
}
