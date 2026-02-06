package com.amazon.c.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f37653a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f37654b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f37655c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f37656d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f37657e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f37658f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final int f37659g = 16;

    /* renamed from: h  reason: collision with root package name */
    public static final int f37660h = 32;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ boolean f37661i = true;

    /* renamed from: j  reason: collision with root package name */
    private static final int f37662j = 76;

    /* renamed from: k  reason: collision with root package name */
    private static final byte f37663k = 61;

    /* renamed from: l  reason: collision with root package name */
    private static final byte f37664l = 10;

    /* renamed from: m  reason: collision with root package name */
    private static final String f37665m = "US-ASCII";

    /* renamed from: n  reason: collision with root package name */
    private static final byte f37666n = -5;

    /* renamed from: o  reason: collision with root package name */
    private static final byte f37667o = -1;

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f37668p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: q  reason: collision with root package name */
    private static final byte[] f37669q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f37666n, f37666n, -9, -9, f37666n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f37666n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f37663k, -9, -9, -9, f37667o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f37664l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: r  reason: collision with root package name */
    private static final byte[] f37670r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f37671s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f37666n, f37666n, -9, -9, f37666n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f37666n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f37663k, -9, -9, -9, f37667o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f37664l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f37672t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: u  reason: collision with root package name */
    private static final byte[] f37673u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f37666n, f37666n, -9, -9, f37666n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f37666n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, f37664l, -9, -9, -9, f37667o, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, f37663k, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private boolean f37674a;

        /* renamed from: b  reason: collision with root package name */
        private int f37675b;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f37676c;

        /* renamed from: d  reason: collision with root package name */
        private int f37677d;

        /* renamed from: e  reason: collision with root package name */
        private int f37678e;

        /* renamed from: f  reason: collision with root package name */
        private int f37679f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f37680g;

        /* renamed from: h  reason: collision with root package name */
        private int f37681h;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f37682i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[LOOP:1: B:13:0x0036->B:19:0x004c, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0052 A[EDGE_INSN: B:49:0x0052->B:20:0x0052 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int read() {
            /*
                r10 = this;
                int r0 = r10.f37675b
                r1 = -1
                r2 = 0
                if (r0 >= 0) goto L_0x006c
                boolean r0 = r10.f37674a
                r3 = 4
                if (r0 == 0) goto L_0x0033
                r0 = 3
                byte[] r4 = new byte[r0]
                r5 = r2
                r6 = r5
            L_0x0010:
                if (r5 >= r0) goto L_0x0022
                java.io.InputStream r7 = r10.in
                int r7 = r7.read()
                if (r7 < 0) goto L_0x0022
                byte r7 = (byte) r7
                r4[r5] = r7
                int r6 = r6 + 1
                int r5 = r5 + 1
                goto L_0x0010
            L_0x0022:
                if (r6 <= 0) goto L_0x0032
                byte[] r7 = r10.f37676c
                r8 = 0
                int r9 = r10.f37681h
                r5 = 0
                byte[] unused = com.amazon.c.a.a.c.b(r4, r5, r6, r7, r8, r9)
                r10.f37675b = r2
                r10.f37678e = r3
                goto L_0x006c
            L_0x0032:
                return r1
            L_0x0033:
                byte[] r0 = new byte[r3]
                r4 = r2
            L_0x0036:
                if (r4 >= r3) goto L_0x0052
            L_0x0038:
                java.io.InputStream r5 = r10.in
                int r5 = r5.read()
                if (r5 < 0) goto L_0x0049
                byte[] r6 = r10.f37682i
                r7 = r5 & 127(0x7f, float:1.78E-43)
                byte r6 = r6[r7]
                r7 = -5
                if (r6 <= r7) goto L_0x0038
            L_0x0049:
                if (r5 >= 0) goto L_0x004c
                goto L_0x0052
            L_0x004c:
                byte r5 = (byte) r5
                r0[r4] = r5
                int r4 = r4 + 1
                goto L_0x0036
            L_0x0052:
                if (r4 != r3) goto L_0x0061
                byte[] r3 = r10.f37676c
                int r4 = r10.f37681h
                int r0 = com.amazon.c.a.a.c.b(r0, r2, r3, r2, r4)
                r10.f37678e = r0
                r10.f37675b = r2
                goto L_0x006c
            L_0x0061:
                if (r4 != 0) goto L_0x0064
                return r1
            L_0x0064:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Improperly padded Base64 input."
                r0.<init>(r1)
                throw r0
            L_0x006c:
                int r0 = r10.f37675b
                if (r0 < 0) goto L_0x009f
                int r3 = r10.f37678e
                if (r0 < r3) goto L_0x0075
                return r1
            L_0x0075:
                boolean r3 = r10.f37674a
                if (r3 == 0) goto L_0x0088
                boolean r3 = r10.f37680g
                if (r3 == 0) goto L_0x0088
                int r3 = r10.f37679f
                r4 = 76
                if (r3 < r4) goto L_0x0088
                r10.f37679f = r2
                r0 = 10
                return r0
            L_0x0088:
                int r2 = r10.f37679f
                int r2 = r2 + 1
                r10.f37679f = r2
                byte[] r2 = r10.f37676c
                int r3 = r0 + 1
                r10.f37675b = r3
                byte r0 = r2[r0]
                int r2 = r10.f37677d
                if (r3 < r2) goto L_0x009c
                r10.f37675b = r1
            L_0x009c:
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L_0x009f:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Error in Base64 code reading stream."
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.c.a.read():int");
        }

        public a(InputStream inputStream, int i10) {
            super(inputStream);
            this.f37681h = i10;
            boolean z10 = true;
            this.f37680g = (i10 & 8) > 0;
            z10 = (i10 & 1) <= 0 ? false : z10;
            this.f37674a = z10;
            int i11 = z10 ? 4 : 3;
            this.f37677d = i11;
            this.f37676c = new byte[i11];
            this.f37675b = -1;
            this.f37679f = 0;
            this.f37682i = c.c(i10);
        }

        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i10 + i12] = (byte) read;
                    i12++;
                } else if (i12 == 0) {
                    return -1;
                }
            }
            return i12;
        }
    }

    public static class b extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        private boolean f37683a;

        /* renamed from: b  reason: collision with root package name */
        private int f37684b;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f37685c;

        /* renamed from: d  reason: collision with root package name */
        private int f37686d;

        /* renamed from: e  reason: collision with root package name */
        private int f37687e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f37688f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f37689g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f37690h;

        /* renamed from: i  reason: collision with root package name */
        private int f37691i;

        /* renamed from: j  reason: collision with root package name */
        private byte[] f37692j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() {
            int i10 = this.f37684b;
            if (i10 <= 0) {
                return;
            }
            if (this.f37683a) {
                this.out.write(c.b(this.f37689g, this.f37685c, i10, this.f37691i));
                this.f37684b = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void b() {
            a();
            this.f37690h = true;
        }

        public void c() {
            this.f37690h = false;
        }

        public void close() {
            a();
            super.close();
            this.f37685c = null;
            this.out = null;
        }

        public void write(int i10) {
            if (this.f37690h) {
                this.out.write(i10);
            } else if (this.f37683a) {
                byte[] bArr = this.f37685c;
                int i11 = this.f37684b;
                int i12 = i11 + 1;
                this.f37684b = i12;
                bArr[i11] = (byte) i10;
                int i13 = this.f37686d;
                if (i12 >= i13) {
                    this.out.write(c.b(this.f37689g, bArr, i13, this.f37691i));
                    int i14 = this.f37687e + 4;
                    this.f37687e = i14;
                    if (this.f37688f && i14 >= c.f37662j) {
                        this.out.write(10);
                        this.f37687e = 0;
                    }
                    this.f37684b = 0;
                }
            } else {
                byte b10 = this.f37692j[i10 & 127];
                if (b10 > -5) {
                    byte[] bArr2 = this.f37685c;
                    int i15 = this.f37684b;
                    int i16 = i15 + 1;
                    this.f37684b = i16;
                    bArr2[i15] = (byte) i10;
                    if (i16 >= this.f37686d) {
                        this.out.write(this.f37689g, 0, c.b(bArr2, 0, this.f37689g, 0, this.f37691i));
                        this.f37684b = 0;
                    }
                } else if (b10 != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        public b(OutputStream outputStream, int i10) {
            super(outputStream);
            boolean z10 = true;
            this.f37688f = (i10 & 8) != 0;
            z10 = (i10 & 1) == 0 ? false : z10;
            this.f37683a = z10;
            int i11 = z10 ? 3 : 4;
            this.f37686d = i11;
            this.f37685c = new byte[i11];
            this.f37684b = 0;
            this.f37687e = 0;
            this.f37690h = false;
            this.f37689g = new byte[4];
            this.f37691i = i10;
            this.f37692j = c.c(i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            if (this.f37690h) {
                this.out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    private c() {
    }

    private static final byte[] b(int i10) {
        if ((i10 & 16) == 16) {
            return f37670r;
        }
        if ((i10 & 32) == 32) {
            return f37672t;
        }
        return f37668p;
    }

    /* access modifiers changed from: private */
    public static final byte[] c(int i10) {
        if ((i10 & 16) == 16) {
            return f37671s;
        }
        if ((i10 & 32) == 32) {
            return f37673u;
        }
        return f37669q;
    }

    /* access modifiers changed from: private */
    public static byte[] b(byte[] bArr, byte[] bArr2, int i10, int i11) {
        b(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        return c(bArr, 0, bArr.length, 0);
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            b(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] b10 = b(i13);
        int i14 = 0;
        int i15 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0);
        if (i11 > 2) {
            i14 = (bArr[i10 + 2] << 24) >>> 24;
        }
        int i16 = i15 | i14;
        if (i11 == 1) {
            bArr2[i12] = b10[i16 >>> 18];
            bArr2[i12 + 1] = b10[(i16 >>> 12) & 63];
            bArr2[i12 + 2] = f37663k;
            bArr2[i12 + 3] = f37663k;
            return bArr2;
        } else if (i11 == 2) {
            bArr2[i12] = b10[i16 >>> 18];
            bArr2[i12 + 1] = b10[(i16 >>> 12) & 63];
            bArr2[i12 + 2] = b10[(i16 >>> 6) & 63];
            bArr2[i12 + 3] = f37663k;
            return bArr2;
        } else if (i11 != 3) {
            return bArr2;
        } else {
            bArr2[i12] = b10[i16 >>> 18];
            bArr2[i12 + 1] = b10[(i16 >>> 12) & 63];
            bArr2[i12 + 2] = b10[(i16 >>> 6) & 63];
            bArr2[i12 + 3] = b10[i16 & 63];
            return bArr2;
        }
    }

    public static byte[] c(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        } else if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
        } else if (i11 == 0) {
            return new byte[0];
        } else {
            if (i11 >= 4) {
                byte[] c10 = c(i12);
                byte[] bArr2 = new byte[((i11 * 3) / 4)];
                byte[] bArr3 = new byte[4];
                int i14 = 0;
                int i15 = 0;
                while (i10 < i13) {
                    byte b10 = bArr[i10];
                    byte b11 = c10[b10 & f37667o];
                    if (b11 >= -5) {
                        if (b11 >= -1) {
                            int i16 = i14 + 1;
                            bArr3[i14] = b10;
                            if (i16 > 3) {
                                i15 += b(bArr3, 0, bArr2, i15, i12);
                                if (bArr[i10] == 61) {
                                    break;
                                }
                                i14 = 0;
                            } else {
                                i14 = i16;
                            }
                        }
                        i10++;
                    } else {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[]{Integer.valueOf(bArr[i10] & f37667o), Integer.valueOf(i10)}));
                    }
                }
                byte[] bArr4 = new byte[i15];
                System.arraycopy(bArr2, 0, bArr4, 0, i15);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i11);
        }
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            b(bArr2, bArr, min, 0);
            for (int i10 = 0; i10 < 4; i10++) {
                charBuffer.put((char) (bArr2[i10] & f37667o));
            }
        }
    }

    public static String a(Serializable serializable) {
        return a(serializable, 0);
    }

    public static byte[] b(byte[] bArr) {
        try {
            return b(bArr, 0, bArr.length, 0);
        } catch (IOException e10) {
            if (f37661i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e10.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.ObjectOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.io.ObjectOutputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|51|52|53|54|55|56|57|58|59) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:4|5|6|(5:8|9|10|11|12)(3:20|21|22)|23|24|25|26|27|28|29|30|31|32|33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:2|3|4|5|6|(5:8|9|10|11|12)(3:20|21|22)|23|24|25|26|27|28|29|30|31|32|33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:1|2|3|4|5|6|(5:8|9|10|11|12)(3:20|21|22)|23|24|25|26|27|28|29|30|31|32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
        return new java.lang.String(r1.toByteArray());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x007d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.Serializable r5, int r6) {
        /*
            if (r5 == 0) goto L_0x0081
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            r1.<init>()     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            com.amazon.c.a.a.c$b r2 = new com.amazon.c.a.a.c$b     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            r3 = r6 | 1
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x002f
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r0 = r3
            goto L_0x0037
        L_0x001f:
            r5 = move-exception
            goto L_0x0074
        L_0x0022:
            r5 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x006f
        L_0x0027:
            r5 = move-exception
            r6 = r0
            goto L_0x0074
        L_0x002a:
            r5 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
            goto L_0x006f
        L_0x002f:
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0037:
            r0.writeObject(r5)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r0.close()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r6.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            r2.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            r1.close()     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            byte[] r6 = r1.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            java.lang.String r0 = "US-ASCII"
            r5.<init>(r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            return r5
        L_0x0052:
            java.lang.String r5 = new java.lang.String
            byte[] r6 = r1.toByteArray()
            r5.<init>(r6)
            return r5
        L_0x005c:
            r5 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x0074
        L_0x0060:
            r5 = move-exception
            r6 = r0
            r2 = r6
            r0 = r1
            r1 = r2
            goto L_0x006f
        L_0x0066:
            r5 = move-exception
            r6 = r0
            r1 = r6
            r2 = r1
            goto L_0x0074
        L_0x006b:
            r5 = move-exception
            r6 = r0
            r1 = r6
            r2 = r1
        L_0x006f:
            throw r5     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r5 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0074:
            r0.close()     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            r6.close()     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            r2.close()     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            r1.close()     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            throw r5
        L_0x0081:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Cannot serialize a null object."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.c.a(java.io.Serializable, int):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:33|34|45|46|47|48|49|50|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x005f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(byte[] r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            if (r0 == 0) goto L_0x011a
            if (r7 < 0) goto L_0x0103
            if (r8 < 0) goto L_0x00ec
            int r1 = r7 + r8
            int r2 = r0.length
            if (r1 > r2) goto L_0x00cf
            r1 = r21 & 2
            r9 = 1
            if (r1 == 0) goto L_0x0063
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r2.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            com.amazon.c.a.a.c$b r3 = new com.amazon.c.a.a.c$b     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r4.close()     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r4.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            r3.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r2.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            r1 = r4
            goto L_0x0059
        L_0x003f:
            r0 = move-exception
        L_0x0040:
            r1 = r2
            goto L_0x0055
        L_0x0042:
            r0 = move-exception
            goto L_0x0059
        L_0x0044:
            r0 = move-exception
            r4 = r1
            goto L_0x0040
        L_0x0047:
            r0 = move-exception
            r3 = r1
            goto L_0x0059
        L_0x004a:
            r0 = move-exception
            r3 = r1
            r4 = r3
            goto L_0x0040
        L_0x004e:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x0059
        L_0x0052:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0055:
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r2 = r1
            goto L_0x003d
        L_0x0059:
            r1.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r3.close()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            r2.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r0
        L_0x0063:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x0069
            r11 = r9
            goto L_0x006a
        L_0x0069:
            r11 = 0
        L_0x006a:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * r12
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x0074
            r2 = r12
            goto L_0x0075
        L_0x0074:
            r2 = 0
        L_0x0075:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x007b
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x007b:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + -2
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x0085:
            if (r6 >= r15) goto L_0x00af
            int r2 = r6 + r7
            r3 = 3
            r1 = r18
            r4 = r14
            r5 = r16
            r10 = r6
            r6 = r21
            b(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00a8
            r2 = 76
            if (r1 < r2) goto L_0x00a8
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00aa
        L_0x00a8:
            r17 = r1
        L_0x00aa:
            int r6 = r10 + 3
            int r16 = r16 + 4
            goto L_0x0085
        L_0x00af:
            r10 = r6
            if (r10 >= r8) goto L_0x00c2
            int r2 = r10 + r7
            int r3 = r8 - r10
            r1 = r18
            r4 = r14
            r5 = r16
            r6 = r21
            b(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x00c2:
            r0 = r16
            int r13 = r13 - r9
            if (r0 > r13) goto L_0x00ce
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            return r1
        L_0x00ce:
            return r14
        L_0x00cf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r2 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x00ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0103:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x011a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Cannot serialize a null array."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.c.b(byte[], int, int, int):byte[]");
    }

    public static String c(String str) {
        a aVar = null;
        try {
            File file = new File(str);
            byte[] bArr = new byte[Math.max((int) ((((double) file.length()) * 1.4d) + 1.0d), 40)];
            a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
            int i10 = 0;
            while (true) {
                try {
                    int read = aVar2.read(bArr, i10, 4096);
                    if (read < 0) {
                        break;
                    }
                    i10 += read;
                } catch (IOException e10) {
                    e = e10;
                    aVar = aVar2;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = aVar2;
                    try {
                        aVar.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
            String str2 = new String(bArr, 0, i10, f37665m);
            try {
                aVar2.close();
            } catch (Exception unused2) {
            }
            return str2;
        } catch (IOException e11) {
            e = e11;
            throw e;
        }
    }

    public static void c(String str, String str2) {
        byte[] b10 = b(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                bufferedOutputStream2.write(b10);
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                e = e10;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            throw e;
        }
    }

    public static String a(byte[] bArr) {
        String str;
        try {
            str = a(bArr, 0, bArr.length, 0);
        } catch (IOException e10) {
            if (f37661i) {
                str = null;
            } else {
                throw new AssertionError(e10.getMessage());
            }
        }
        if (f37661i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i10) {
        return a(bArr, 0, bArr.length, i10);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        String str;
        try {
            str = a(bArr, i10, i11, 0);
        } catch (IOException e10) {
            if (f37661i) {
                str = null;
            } else {
                throw new AssertionError(e10.getMessage());
            }
        }
        if (f37661i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i10, int i11, int i12) {
        byte[] b10 = b(bArr, i10, i11, i12);
        try {
            return new String(b10, f37665m);
        } catch (UnsupportedEncodingException unused) {
            return new String(b10);
        }
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        } else if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        } else if (i10 < 0 || (i13 = i10 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10)}));
        } else if (i11 < 0 || (i14 = i11 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i11)}));
        } else {
            byte[] c10 = c(i12);
            byte b10 = bArr[i10 + 2];
            if (b10 == 61) {
                bArr2[i11] = (byte) ((((c10[bArr[i10 + 1]] & f37667o) << 12) | ((c10[bArr[i10]] & f37667o) << 18)) >>> 16);
                return 1;
            }
            byte b11 = bArr[i13];
            if (b11 == 61) {
                int i15 = ((c10[bArr[i10 + 1]] & f37667o) << 12) | ((c10[bArr[i10]] & f37667o) << 18) | ((c10[b10] & f37667o) << 6);
                bArr2[i11] = (byte) (i15 >>> 16);
                bArr2[i11 + 1] = (byte) (i15 >>> 8);
                return 2;
            }
            byte b12 = ((c10[bArr[i10 + 1]] & f37667o) << 12) | ((c10[bArr[i10]] & f37667o) << 18) | ((c10[b10] & f37667o) << 6) | (c10[b11] & f37667o);
            bArr2[i11] = (byte) (b12 >> 16);
            bArr2[i11 + 1] = (byte) (b12 >> 8);
            bArr2[i14] = (byte) b12;
            return 3;
        }
    }

    public static byte[] a(String str) {
        return a(str, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|(5:17|18|19|20|(6:21|22|(3:23|24|(1:26)(1:67))|31|32|33))|34|35|(2:36|37)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:54|55|56|57|58|59|60|61) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0089 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r5, int r6) {
        /*
            if (r5 == 0) goto L_0x008e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0009 }
            goto L_0x000d
        L_0x0009:
            byte[] r5 = r5.getBytes()
        L_0x000d:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = c(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001b
        L_0x001a:
            r6 = r1
        L_0x001b:
            if (r5 == 0) goto L_0x008d
            int r3 = r5.length
            if (r3 < r0) goto L_0x008d
            if (r6 != 0) goto L_0x008d
            byte r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L_0x008d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0078, all -> 0x0074 }
            r2.<init>()     // Catch:{ IOException -> 0x0078, all -> 0x0074 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
        L_0x0048:
            int r0 = r4.read(r6)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            if (r0 < 0) goto L_0x0058
            r2.write(r6, r1, r0)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            goto L_0x0048
        L_0x0052:
            r5 = move-exception
        L_0x0053:
            r0 = r2
            goto L_0x0083
        L_0x0055:
            r6 = move-exception
        L_0x0056:
            r0 = r2
            goto L_0x007b
        L_0x0058:
            byte[] r5 = r2.toByteArray()     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r2.close()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            r4.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            r3.close()     // Catch:{ Exception -> 0x008d }
            goto L_0x008d
        L_0x0066:
            r5 = move-exception
            r4 = r0
            goto L_0x0053
        L_0x0069:
            r6 = move-exception
            r4 = r0
            goto L_0x0056
        L_0x006c:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0053
        L_0x0070:
            r6 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0056
        L_0x0074:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0083
        L_0x0078:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x007b:
            r6.printStackTrace()     // Catch:{ all -> 0x0082 }
            r0.close()     // Catch:{ Exception -> 0x005f }
            goto L_0x005f
        L_0x0082:
            r5 = move-exception
        L_0x0083:
            r0.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            r4.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            r3.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            throw r5
        L_0x008d:
            return r5
        L_0x008e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.c.a(java.lang.String, int):byte[]");
    }

    public static byte[] b(String str) {
        a aVar = null;
        try {
            File file = new File(str);
            if (file.length() <= 2147483647L) {
                byte[] bArr = new byte[((int) file.length())];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                int i10 = 0;
                while (true) {
                    try {
                        int read = aVar2.read(bArr, i10, 4096);
                        if (read < 0) {
                            break;
                        }
                        i10 += read;
                    } catch (IOException e10) {
                        e = e10;
                        aVar = aVar2;
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                try {
                    aVar2.close();
                } catch (Exception unused2) {
                }
                return bArr2;
            }
            throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
        } catch (IOException e11) {
            e = e11;
            throw e;
        }
    }

    public static void a(byte[] bArr, String str) {
        if (bArr != null) {
            b bVar = null;
            try {
                b bVar2 = new b(new FileOutputStream(str), 1);
                try {
                    bVar2.write(bArr);
                    try {
                        bVar2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e10) {
                    e = e10;
                    bVar = bVar2;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar = bVar2;
                    try {
                        bVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                throw e;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    public static void a(String str, String str2) {
        b bVar = null;
        try {
            b bVar2 = new b(new FileOutputStream(str2), 0);
            try {
                bVar2.write(str.getBytes(f37665m));
                try {
                    bVar2.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                e = e10;
                bVar = bVar2;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                try {
                    bVar.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            throw e;
        }
    }

    public static void b(String str, String str2) {
        String c10 = c(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                bufferedOutputStream2.write(c10.getBytes(f37665m));
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                e = e10;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            throw e;
        }
    }
}
