package com.bumptech.glide.integration.webp;

import c5.C;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o5.k;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f39075a = f();

    private static final class a implements C0619c {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f39076a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39077b;

        /* renamed from: c  reason: collision with root package name */
        private final int f39078c;

        /* renamed from: d  reason: collision with root package name */
        private int f39079d;

        a(byte[] bArr, int i10, int i11) {
            this.f39076a = bArr;
            this.f39077b = i10;
            this.f39078c = i11;
            this.f39079d = i10;
        }

        public int a() {
            return ((b() << 8) & 65280) | (b() & 255);
        }

        public int b() {
            int i10 = this.f39079d;
            if (i10 >= this.f39077b + this.f39078c) {
                return -1;
            }
            byte[] bArr = this.f39076a;
            this.f39079d = i10 + 1;
            return bArr[i10];
        }

        public long skip(long j10) {
            int min = (int) Math.min((long) ((this.f39077b + this.f39078c) - this.f39079d), j10);
            this.f39079d += min;
            return (long) min;
        }
    }

    private static final class b implements C0619c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f39080a;

        b(ByteBuffer byteBuffer) {
            this.f39080a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return ((b() << 8) & 65280) | (b() & 255);
        }

        public int b() {
            if (this.f39080a.remaining() < 1) {
                return -1;
            }
            return this.f39080a.get();
        }

        public long skip(long j10) {
            int min = (int) Math.min((long) this.f39080a.remaining(), j10);
            ByteBuffer byteBuffer = this.f39080a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.integration.webp.c$c  reason: collision with other inner class name */
    private interface C0619c {
        int a();

        int b();

        long skip(long j10);
    }

    private static final class d implements C0619c {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f39081a;

        d(InputStream inputStream) {
            this.f39081a = inputStream;
        }

        public int a() {
            return ((this.f39081a.read() << 8) & 65280) | (this.f39081a.read() & 255);
        }

        public int b() {
            return this.f39081a.read();
        }

        public long skip(long j10) {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f39081a.skip(j11);
                if (skip <= 0) {
                    if (this.f39081a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public enum e {
        WEBP_SIMPLE(false, false),
        WEBP_LOSSLESS(false, false),
        WEBP_LOSSLESS_WITH_ALPHA(true, false),
        WEBP_EXTENDED(false, false),
        WEBP_EXTENDED_WITH_ALPHA(true, false),
        WEBP_EXTENDED_ANIMATED(false, true),
        NONE_WEBP(false, false);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f39090a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f39091b;

        private e(boolean z10, boolean z11) {
            this.f39090a = z10;
            this.f39091b = z11;
        }
    }

    private static e a(C0619c cVar) {
        if ((((cVar.a() << 16) & -65536) | (cVar.a() & 65535)) != 1380533830) {
            return e.NONE_WEBP;
        }
        cVar.skip(4);
        if ((((cVar.a() << 16) & -65536) | (cVar.a() & 65535)) != 1464156752) {
            return e.NONE_WEBP;
        }
        int a10 = ((cVar.a() << 16) & -65536) | (cVar.a() & 65535);
        if (a10 == 1448097824) {
            return e.WEBP_SIMPLE;
        }
        if (a10 == 1448097868) {
            cVar.skip(4);
            if ((cVar.b() & 8) != 0) {
                return e.WEBP_LOSSLESS_WITH_ALPHA;
            }
            return e.WEBP_LOSSLESS;
        } else if (a10 != 1448097880) {
            return e.NONE_WEBP;
        } else {
            cVar.skip(4);
            int b10 = cVar.b();
            if ((b10 & 2) != 0) {
                return e.WEBP_EXTENDED_ANIMATED;
            }
            if ((b10 & 16) != 0) {
                return e.WEBP_EXTENDED_WITH_ALPHA;
            }
            return e.WEBP_EXTENDED;
        }
    }

    public static e b(InputStream inputStream, W4.b bVar) {
        if (inputStream == null) {
            return e.NONE_WEBP;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, bVar);
        }
        inputStream.mark(21);
        try {
            return a(new d((InputStream) k.d(inputStream)));
        } finally {
            inputStream.reset();
        }
    }

    public static e c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return e.NONE_WEBP;
        }
        return a(new b((ByteBuffer) k.d(byteBuffer)));
    }

    public static e d(byte[] bArr, int i10, int i11) {
        return a(new a(bArr, i10, i11));
    }

    public static boolean e(e eVar) {
        if (eVar == e.WEBP_EXTENDED_ANIMATED) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g(e eVar) {
        if (eVar == e.WEBP_SIMPLE || eVar == e.WEBP_LOSSLESS || eVar == e.WEBP_LOSSLESS_WITH_ALPHA || eVar == e.WEBP_EXTENDED || eVar == e.WEBP_EXTENDED_WITH_ALPHA) {
            return true;
        }
        return false;
    }
}
