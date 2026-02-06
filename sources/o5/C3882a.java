package o5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o5.a  reason: case insensitive filesystem */
public abstract class C3882a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f47027a = new AtomicReference();

    /* renamed from: o5.a$b */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f47030a;

        /* renamed from: b  reason: collision with root package name */
        final int f47031b;

        /* renamed from: c  reason: collision with root package name */
        final byte[] f47032c;

        b(byte[] bArr, int i10, int i11) {
            this.f47032c = bArr;
            this.f47030a = i10;
            this.f47031b = i11;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.spi.AbstractInterruptibleChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048 A[SYNTHETIC, Splitter:B:24:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d A[SYNTHETIC, Splitter:B:28:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(java.io.File r8) {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0033 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x003e
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0036
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r8
        L_0x0031:
            r8 = move-exception
            goto L_0x0046
        L_0x0033:
            r8 = move-exception
            r7 = r0
            goto L_0x0046
        L_0x0036:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r8     // Catch:{ all -> 0x0033 }
        L_0x003e:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r8     // Catch:{ all -> 0x0033 }
        L_0x0046:
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            if (r7 == 0) goto L_0x0050
            r7.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3882a.a(java.io.File):java.nio.ByteBuffer");
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f47027a.getAndSet((Object) null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                f47027a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b c10 = c(byteBuffer);
        if (c10 != null && c10.f47030a == 0 && c10.f47031b == c10.f47032c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.nio.ByteBuffer r3, java.io.File r4) {
        /*
            d(r3)
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0025 }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x0023 }
            r0.write(r3)     // Catch:{ all -> 0x0023 }
            r3 = 0
            r0.force(r3)     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r3 = move-exception
            goto L_0x0027
        L_0x0025:
            r3 = move-exception
            r1 = r0
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3882a.f(java.nio.ByteBuffer, java.io.File):void");
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new C0706a(byteBuffer);
    }

    /* renamed from: o5.a$a  reason: collision with other inner class name */
    private static class C0706a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f47028a;

        /* renamed from: b  reason: collision with root package name */
        private int f47029b = -1;

        C0706a(ByteBuffer byteBuffer) {
            this.f47028a = byteBuffer;
        }

        public int available() {
            return this.f47028a.remaining();
        }

        public synchronized void mark(int i10) {
            this.f47029b = this.f47028a.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f47028a.hasRemaining()) {
                return -1;
            }
            return this.f47028a.get() & 255;
        }

        public synchronized void reset() {
            int i10 = this.f47029b;
            if (i10 != -1) {
                this.f47028a.position(i10);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j10) {
            if (!this.f47028a.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j10, (long) available());
            ByteBuffer byteBuffer = this.f47028a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f47028a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i11, available());
            this.f47028a.get(bArr, i10, min);
            return min;
        }
    }
}
