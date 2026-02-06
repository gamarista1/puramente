package m9;

import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import ja.A;
import ja.s;
import k9.L0;

/* renamed from: m9.a  reason: case insensitive filesystem */
public abstract class C3843a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f46608a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f46609b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: m9.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f46610a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46611b;

        /* renamed from: c  reason: collision with root package name */
        public final String f46612c;

        private b(int i10, int i11, String str) {
            this.f46610a = i10;
            this.f46611b = i11;
            this.f46612c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f46608a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f46609b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int c(A a10) {
        int h10 = a10.h(5);
        if (h10 == 31) {
            return a10.h(6) + 32;
        }
        return h10;
    }

    private static int d(A a10) {
        int h10 = a10.h(4);
        if (h10 == 15) {
            return a10.h(24);
        }
        if (h10 < 13) {
            return f46608a[h10];
        }
        throw L0.a((String) null, (Throwable) null);
    }

    public static b e(A a10, boolean z10) {
        int c10 = c(a10);
        int d10 = d(a10);
        int h10 = a10.h(4);
        String str = "mp4a.40." + c10;
        if (c10 == 5 || c10 == 29) {
            d10 = d(a10);
            c10 = c(a10);
            if (c10 == 22) {
                h10 = a10.h(4);
            }
        }
        if (z10) {
            if (!(c10 == 1 || c10 == 2 || c10 == 3 || c10 == 4 || c10 == 6 || c10 == 7 || c10 == 17)) {
                switch (c10) {
                    case 19:
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw L0.d("Unsupported audio object type: " + c10);
                }
            }
            g(a10, c10, h10);
            switch (c10) {
                case 17:
                case 19:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 21:
                case 22:
                case 23:
                    int h11 = a10.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw L0.d("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f46609b[h10];
        if (i10 != -1) {
            return new b(d10, i10, str);
        }
        throw L0.a((String) null, (Throwable) null);
    }

    public static b f(byte[] bArr) {
        return e(new A(bArr), false);
    }

    private static void g(A a10, int i10, int i11) {
        if (a10.g()) {
            s.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (a10.g()) {
            a10.r(14);
        }
        boolean g10 = a10.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                a10.r(3);
            }
            if (g10) {
                if (i10 == 22) {
                    a10.r(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    a10.r(3);
                }
                a10.r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
