package z2;

import f2.C1961B;
import i2.p;
import i2.z;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* renamed from: z2.a  reason: case insensitive filesystem */
public abstract class C2957a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29155a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29156b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: z2.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29157a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29158b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29159c;

        private b(int i10, int i11, String str) {
            this.f29157a = i10;
            this.f29158b = i11;
            this.f29159c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(z zVar) {
        int h10 = zVar.h(5);
        if (h10 == 31) {
            return zVar.h(6) + 32;
        }
        return h10;
    }

    private static int c(z zVar) {
        int h10 = zVar.h(4);
        if (h10 == 15) {
            if (zVar.b() >= 24) {
                return zVar.h(24);
            }
            throw C1961B.a("AAC header insufficient data", (Throwable) null);
        } else if (h10 < 13) {
            return f29155a[h10];
        } else {
            throw C1961B.a("AAC header wrong Sampling Frequency Index", (Throwable) null);
        }
    }

    public static b d(z zVar, boolean z10) {
        int b10 = b(zVar);
        int c10 = c(zVar);
        int h10 = zVar.h(4);
        String str = "mp4a.40." + b10;
        if (b10 == 5 || b10 == 29) {
            c10 = c(zVar);
            b10 = b(zVar);
            if (b10 == 22) {
                h10 = zVar.h(4);
            }
        }
        if (z10) {
            if (!(b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 6 || b10 == 7 || b10 == 17)) {
                switch (b10) {
                    case 19:
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C1961B.c("Unsupported audio object type: " + b10);
                }
            }
            f(zVar, b10, h10);
            switch (b10) {
                case 17:
                case 19:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 21:
                case 22:
                case 23:
                    int h11 = zVar.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw C1961B.c("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f29156b[h10];
        if (i10 != -1) {
            return new b(c10, i10, str);
        }
        throw C1961B.a((String) null, (Throwable) null);
    }

    public static b e(byte[] bArr) {
        return d(new z(bArr), false);
    }

    private static void f(z zVar, int i10, int i11) {
        if (zVar.g()) {
            p.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean g10 = zVar.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                zVar.r(3);
            }
            if (g10) {
                if (i10 == 22) {
                    zVar.r(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    zVar.r(3);
                }
                zVar.r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
