package c5;

import W4.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private volatile byte[] f36422a;

    /* renamed from: b  reason: collision with root package name */
    private int f36423b;

    /* renamed from: c  reason: collision with root package name */
    private int f36424c;

    /* renamed from: d  reason: collision with root package name */
    private int f36425d;

    /* renamed from: e  reason: collision with root package name */
    private int f36426e;

    /* renamed from: f  reason: collision with root package name */
    private final b f36427f;

    static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public C(InputStream inputStream, b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i10;
        int i11 = this.f36425d;
        if (i11 == -1 || this.f36426e - i11 >= (i10 = this.f36424c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f36425d = -1;
                this.f36426e = 0;
                this.f36423b = read;
            }
            return read;
        }
        if (i11 == 0 && i10 > bArr.length && this.f36423b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i10) {
                i10 = length;
            }
            byte[] bArr2 = (byte[]) this.f36427f.d(i10, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f36422a = bArr2;
            this.f36427f.c(bArr);
            bArr = bArr2;
        } else if (i11 > 0) {
            System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
        }
        int i12 = this.f36426e - this.f36425d;
        this.f36426e = i12;
        this.f36425d = 0;
        this.f36423b = 0;
        int read2 = inputStream.read(bArr, i12, bArr.length - i12);
        int i13 = this.f36426e;
        if (read2 > 0) {
            i13 += read2;
        }
        this.f36423b = i13;
        return read2;
    }

    private static IOException n() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f36422a == null || inputStream == null) {
            throw n();
        }
        return (this.f36423b - this.f36426e) + inputStream.available();
    }

    public synchronized void b() {
        this.f36424c = this.f36422a.length;
    }

    public void close() {
        if (this.f36422a != null) {
            this.f36427f.c(this.f36422a);
            this.f36422a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void f() {
        if (this.f36422a != null) {
            this.f36427f.c(this.f36422a);
            this.f36422a = null;
        }
    }

    public synchronized void mark(int i10) {
        this.f36424c = Math.max(this.f36424c, i10);
        this.f36425d = this.f36426e;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x001a=Splitter:B:12:0x001a, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f36422a     // Catch:{ all -> 0x0018 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r2 = r5.f36426e     // Catch:{ all -> 0x0018 }
            int r3 = r5.f36423b     // Catch:{ all -> 0x0018 }
            r4 = -1
            if (r2 < r3) goto L_0x001a
            int r1 = r5.a(r1, r0)     // Catch:{ all -> 0x0018 }
            if (r1 != r4) goto L_0x001a
            monitor-exit(r5)
            return r4
        L_0x0018:
            r0 = move-exception
            goto L_0x0040
        L_0x001a:
            byte[] r1 = r5.f36422a     // Catch:{ all -> 0x0018 }
            if (r0 == r1) goto L_0x0028
            byte[] r0 = r5.f36422a     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            java.io.IOException r0 = n()     // Catch:{ all -> 0x0018 }
            throw r0     // Catch:{ all -> 0x0018 }
        L_0x0028:
            int r1 = r5.f36423b     // Catch:{ all -> 0x0018 }
            int r2 = r5.f36426e     // Catch:{ all -> 0x0018 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r2 + 1
            r5.f36426e = r1     // Catch:{ all -> 0x0018 }
            byte r0 = r0[r2]     // Catch:{ all -> 0x0018 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0039:
            monitor-exit(r5)
            return r4
        L_0x003b:
            java.io.IOException r0 = n()     // Catch:{ all -> 0x0018 }
            throw r0     // Catch:{ all -> 0x0018 }
        L_0x0040:
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C.read():int");
    }

    public synchronized void reset() {
        if (this.f36422a != null) {
            int i10 = this.f36425d;
            if (-1 != i10) {
                this.f36426e = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f36426e + " markLimit: " + this.f36424c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0;
        }
        byte[] bArr = this.f36422a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i10 = this.f36423b;
                int i11 = this.f36426e;
                if (((long) (i10 - i11)) >= j10) {
                    this.f36426e = (int) (((long) i11) + j10);
                    return j10;
                }
                long j11 = ((long) i10) - ((long) i11);
                this.f36426e = i10;
                if (this.f36425d == -1 || j10 > ((long) this.f36424c)) {
                    long skip = inputStream.skip(j10 - j11);
                    if (skip > 0) {
                        this.f36425d = -1;
                    }
                    return j11 + skip;
                } else if (a(inputStream, bArr) == -1) {
                    return j11;
                } else {
                    int i12 = this.f36423b;
                    int i13 = this.f36426e;
                    if (((long) (i12 - i13)) >= j10 - j11) {
                        this.f36426e = (int) ((((long) i13) + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + ((long) i12)) - ((long) i13);
                    this.f36426e = i12;
                    return j12;
                }
            } else {
                throw n();
            }
        } else {
            throw n();
        }
    }

    C(InputStream inputStream, b bVar, int i10) {
        super(inputStream);
        this.f36425d = -1;
        this.f36427f = bVar;
        this.f36422a = (byte[]) bVar.d(i10, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0049, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0056, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f36422a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x008d
            if (r9 != 0) goto L_0x000a
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0088
            int r2 = r6.f36426e     // Catch:{ all -> 0x0030 }
            int r3 = r6.f36423b     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0034
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0030 }
            int r2 = r6.f36426e     // Catch:{ all -> 0x0030 }
            int r2 = r2 + r3
            r6.f36426e = r2     // Catch:{ all -> 0x0030 }
            if (r3 == r9) goto L_0x0032
            int r2 = r1.available()     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0035
        L_0x0030:
            r7 = move-exception
            goto L_0x0092
        L_0x0032:
            monitor-exit(r6)
            return r3
        L_0x0034:
            r2 = r9
        L_0x0035:
            int r3 = r6.f36425d     // Catch:{ all -> 0x0030 }
            r4 = -1
            if (r3 != r4) goto L_0x004a
            int r3 = r0.length     // Catch:{ all -> 0x0030 }
            if (r2 < r3) goto L_0x004a
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0030 }
            if (r3 != r4) goto L_0x0078
            if (r2 != r9) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            int r4 = r9 - r2
        L_0x0048:
            monitor-exit(r6)
            return r4
        L_0x004a:
            int r3 = r6.a(r1, r0)     // Catch:{ all -> 0x0030 }
            if (r3 != r4) goto L_0x0057
            if (r2 != r9) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            int r4 = r9 - r2
        L_0x0055:
            monitor-exit(r6)
            return r4
        L_0x0057:
            byte[] r3 = r6.f36422a     // Catch:{ all -> 0x0030 }
            if (r0 == r3) goto L_0x0065
            byte[] r0 = r6.f36422a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            java.io.IOException r7 = n()     // Catch:{ all -> 0x0030 }
            throw r7     // Catch:{ all -> 0x0030 }
        L_0x0065:
            int r3 = r6.f36423b     // Catch:{ all -> 0x0030 }
            int r4 = r6.f36426e     // Catch:{ all -> 0x0030 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006f
            r3 = r2
            goto L_0x0070
        L_0x006f:
            int r3 = r3 - r4
        L_0x0070:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0030 }
            int r4 = r6.f36426e     // Catch:{ all -> 0x0030 }
            int r4 = r4 + r3
            r6.f36426e = r4     // Catch:{ all -> 0x0030 }
        L_0x0078:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007d
            monitor-exit(r6)
            return r9
        L_0x007d:
            int r4 = r1.available()     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x0086
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0086:
            int r8 = r8 + r3
            goto L_0x0035
        L_0x0088:
            java.io.IOException r7 = n()     // Catch:{ all -> 0x0030 }
            throw r7     // Catch:{ all -> 0x0030 }
        L_0x008d:
            java.io.IOException r7 = n()     // Catch:{ all -> 0x0030 }
            throw r7     // Catch:{ all -> 0x0030 }
        L_0x0092:
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C.read(byte[], int, int):int");
    }
}
