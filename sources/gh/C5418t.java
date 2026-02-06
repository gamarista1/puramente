package Gh;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.C6496s;

/* renamed from: Gh.t  reason: case insensitive filesystem */
public final class C5418t extends C5409j {

    /* renamed from: e  reason: collision with root package name */
    private final RandomAccessFile f63337e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5418t(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        C6496s.h(randomAccessFile, "randomAccessFile");
        this.f63337e = randomAccessFile;
    }

    /* access modifiers changed from: protected */
    public synchronized void q() {
        this.f63337e.close();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int t(long r2, byte[] r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C6496s.h(r4, r0)     // Catch:{ all -> 0x001f }
            java.io.RandomAccessFile r0 = r1.f63337e     // Catch:{ all -> 0x001f }
            r0.seek(r2)     // Catch:{ all -> 0x001f }
            r2 = 0
        L_0x000c:
            if (r2 >= r6) goto L_0x0021
            java.io.RandomAccessFile r3 = r1.f63337e     // Catch:{ all -> 0x001f }
            int r0 = r6 - r2
            int r3 = r3.read(r4, r5, r0)     // Catch:{ all -> 0x001f }
            r0 = -1
            if (r3 != r0) goto L_0x001d
            if (r2 != 0) goto L_0x0021
            monitor-exit(r1)
            return r0
        L_0x001d:
            int r2 = r2 + r3
            goto L_0x000c
        L_0x001f:
            r2 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r1)
            return r2
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.C5418t.t(long, byte[], int, int):int");
    }

    /* access modifiers changed from: protected */
    public synchronized long v() {
        return this.f63337e.length();
    }
}
