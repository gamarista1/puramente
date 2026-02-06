package c5;

import android.util.Log;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o5.k;

public final class n implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f36466a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.ENCODING));

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f36467b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f36468a;

        a(ByteBuffer byteBuffer) {
            this.f36468a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return (c() << 8) | c();
        }

        public int b(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f36468a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f36468a.get(bArr, 0, min);
            return min;
        }

        public short c() {
            if (this.f36468a.remaining() >= 1) {
                return (short) (this.f36468a.get() & 255);
            }
            throw new c.a();
        }

        public long skip(long j10) {
            int min = (int) Math.min((long) this.f36468a.remaining(), j10);
            ByteBuffer byteBuffer = this.f36468a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f36469a;

        b(byte[] bArr, int i10) {
            this.f36469a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            if (this.f36469a.remaining() - i10 >= i11) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public short a(int i10) {
            if (c(i10, 2)) {
                return this.f36469a.getShort(i10);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            if (c(i10, 4)) {
                return this.f36469a.getInt(i10);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return this.f36469a.remaining();
        }

        /* access modifiers changed from: package-private */
        public void e(ByteOrder byteOrder) {
            this.f36469a.order(byteOrder);
        }
    }

    private interface c {

        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    private static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f36470a;

        d(InputStream inputStream) {
            this.f36470a = inputStream;
        }

        public int a() {
            return (c() << 8) | c();
        }

        public int b(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f36470a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 != 0 || i12 != -1) {
                return i11;
            }
            throw new c.a();
        }

        public short c() {
            int read = this.f36470a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public long skip(long j10) {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f36470a.skip(j11);
                if (skip <= 0) {
                    if (this.f36470a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    private static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int f(c cVar, W4.b bVar) {
        byte[] bArr;
        try {
            int a10 = cVar.a();
            if (!h(a10)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                }
                return -1;
            }
            int j10 = j(cVar);
            if (j10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.d(j10, byte[].class);
            int l10 = l(cVar, bArr, j10);
            bVar.c(bArr);
            return l10;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th2) {
            bVar.c(bArr);
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType g(c5.n.c r6) {
        /*
            r5 = this;
            int r0 = r6.a()     // Catch:{ a -> 0x00a9 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.c()     // Catch:{ a -> 0x00a9 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.c()     // Catch:{ a -> 0x00a9 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a9 }
            short r6 = r6.c()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0046
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r5.m(r6, r0)     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x0046:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a9 }
            int r2 = r6.a()     // Catch:{ a -> 0x00a9 }
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch:{ a -> 0x00a9 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x005e:
            int r2 = r6.a()     // Catch:{ a -> 0x00a9 }
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch:{ a -> 0x00a9 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0073
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x0073:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0091
            r6.skip(r0)     // Catch:{ a -> 0x00a9 }
            short r6 = r6.c()     // Catch:{ a -> 0x00a9 }
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0087
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x0087:
            r6 = r6 & 16
            if (r6 == 0) goto L_0x008e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x008e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x0091:
            r3 = 76
            if (r2 != r3) goto L_0x00a6
            r6.skip(r0)     // Catch:{ a -> 0x00a9 }
            short r6 = r6.c()     // Catch:{ a -> 0x00a9 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00a3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a9 }
            goto L_0x00a5
        L_0x00a3:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a9 }
        L_0x00a5:
            return r6
        L_0x00a6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a9 }
            return r6
        L_0x00a9:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.n.g(c5.n$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    private static boolean h(int i10) {
        if ((i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761) {
            return true;
        }
        return false;
    }

    private boolean i(byte[] bArr, int i10) {
        boolean z10;
        if (bArr == null || i10 <= f36466a.length) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f36466a;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    return false;
                } else {
                    i11++;
                }
            }
        }
        return z10;
    }

    private int j(c cVar) {
        short c10;
        int a10;
        long j10;
        long skip;
        do {
            short c11 = cVar.c();
            if (c11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + c11);
                }
                return -1;
            }
            c10 = cVar.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = cVar.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            j10 = (long) a10;
            skip = cVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + c10 + ", wanted to skip: " + a10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a10 = bVar.a(6);
        if (a10 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a10 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a10);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b10 = bVar.b(10) + 6;
        short a11 = bVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int e10 = e(b10, i10);
            short a12 = bVar.a(e10);
            if (a12 == 274) {
                short a13 = bVar.a(e10 + 2);
                if (a13 >= 1 && a13 <= 12) {
                    int b11 = bVar.b(e10 + 4);
                    if (b11 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + a12 + " formatCode=" + a13 + " componentCount=" + b11);
                        }
                        int i11 = b11 + f36467b[a13];
                        if (i11 <= 4) {
                            int i12 = e10 + 8;
                            if (i12 < 0 || i12 > bVar.d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i12 + " tagType=" + a12);
                                }
                            } else if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                return bVar.a(i12);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a12);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a13);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + a13);
                }
            }
        }
        return -1;
    }

    private int l(c cVar, byte[] bArr, int i10) {
        int b10 = cVar.b(bArr, i10);
        if (b10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + b10);
            }
            return -1;
        } else if (i(bArr, i10)) {
            return k(new b(bArr, i10));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    private ImageHeaderParser.ImageType m(c cVar, int i10) {
        boolean z10;
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a10 = (cVar.a() << 16) | cVar.a();
        if (a10 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        if (a10 == 1635150182) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.skip(4);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int a11 = (cVar.a() << 16) | cVar.a();
                if (a11 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a11 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        if (z10) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) k.d(byteBuffer)));
    }

    public int b(InputStream inputStream, W4.b bVar) {
        return f(new d((InputStream) k.d(inputStream)), (W4.b) k.d(bVar));
    }

    public int c(ByteBuffer byteBuffer, W4.b bVar) {
        return f(new a((ByteBuffer) k.d(byteBuffer)), (W4.b) k.d(bVar));
    }

    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return g(new d((InputStream) k.d(inputStream)));
    }
}
