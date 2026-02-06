package f3;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import f2.C1961B;
import i2.C2076a;
import i2.z;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import pb.d;
import pb.e;

abstract class v {

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f20768a;

        /* renamed from: b  reason: collision with root package name */
        public long f20769b;

        /* renamed from: c  reason: collision with root package name */
        public int f20770c;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f20771a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20772b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20773c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f20774d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f20771a = i10;
            this.f20772b = i11;
            this.f20773c = i12;
            this.f20774d = bArr;
        }
    }

    private static int a(int i10) {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw C1961B.c("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw C1961B.c("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
            default:
                throw C1961B.c("Unsupported sampling rate index " + i10);
        }
    }

    private static int d(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw C1961B.c("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        if ((i10 & 16777215) == 12583333) {
            return true;
        }
        return false;
    }

    public static int f(z zVar) {
        if (!zVar.g()) {
            return 0;
        }
        zVar.r(2);
        return zVar.h(13);
    }

    public static boolean g(z zVar, b bVar) {
        zVar.d();
        int k10 = k(zVar, 3, 8, 8);
        bVar.f20768a = k10;
        if (k10 == -1) {
            return false;
        }
        long l10 = l(zVar, 2, 8, 32);
        bVar.f20769b = l10;
        if (l10 == -1) {
            return false;
        }
        if (l10 <= 16) {
            if (l10 == 0) {
                int i10 = bVar.f20768a;
                if (i10 == 1) {
                    throw C1961B.a("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
                } else if (i10 == 2) {
                    throw C1961B.a("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
                } else if (i10 == 17) {
                    throw C1961B.a("AudioTruncation packet with invalid packet label 0", (Throwable) null);
                }
            }
            int k11 = k(zVar, 11, 24, 24);
            bVar.f20770c = k11;
            if (k11 != -1) {
                return true;
            }
            return false;
        }
        throw C1961B.c("Contains sub-stream with an invalid packet label " + bVar.f20769b);
    }

    public static c h(z zVar) {
        int i10;
        int h10 = zVar.h(8);
        int h11 = zVar.h(5);
        if (h11 == 31) {
            i10 = zVar.h(24);
        } else {
            i10 = c(h11);
        }
        int h12 = zVar.h(3);
        int a10 = a(h12);
        int d10 = d(h12);
        zVar.r(2);
        p(zVar);
        m(zVar, j(zVar), d10);
        byte[] bArr = null;
        if (zVar.g()) {
            int k10 = k(zVar, 2, 4, 8) + 1;
            for (int i11 = 0; i11 < k10; i11++) {
                int k11 = k(zVar, 4, 8, 16);
                int k12 = k(zVar, 4, 8, 16);
                if (k11 == 7) {
                    int h13 = zVar.h(4) + 1;
                    zVar.r(4);
                    byte[] bArr2 = new byte[h13];
                    for (int i12 = 0; i12 < h13; i12++) {
                        bArr2[i12] = (byte) zVar.h(8);
                    }
                    bArr = bArr2;
                } else {
                    zVar.r(k12 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b10 = b(i10);
        return new c(h10, (int) (((double) i10) * b10), (int) (((double) a10) * b10), bArr3);
    }

    private static boolean i(z zVar) {
        zVar.r(3);
        boolean g10 = zVar.g();
        if (g10) {
            zVar.r(13);
        }
        return g10;
    }

    private static int j(z zVar) {
        int h10 = zVar.h(5);
        int i10 = 0;
        for (int i11 = 0; i11 < h10 + 1; i11++) {
            int h11 = zVar.h(3);
            i10 += k(zVar, 5, 8, 16) + 1;
            if ((h11 == 0 || h11 == 2) && zVar.g()) {
                p(zVar);
            }
        }
        return i10;
    }

    private static int k(z zVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        d.a(d.a(i13, i14), 1 << i12);
        if (zVar.b() < i10) {
            return -1;
        }
        int h10 = zVar.h(i10);
        if (h10 != i13) {
            return h10;
        }
        if (zVar.b() < i11) {
            return -1;
        }
        int h11 = zVar.h(i11);
        int i15 = h10 + h11;
        if (h11 != i14) {
            return i15;
        }
        if (zVar.b() < i12) {
            return -1;
        }
        return i15 + zVar.h(i12);
    }

    private static long l(z zVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 63) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        e.a(e.a(j10, j11), 1 << i12);
        if (zVar.b() < i10) {
            return -1;
        }
        long j12 = zVar.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (zVar.b() < i11) {
            return -1;
        }
        long j13 = zVar.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (zVar.b() < i12) {
            return -1;
        }
        return j14 + zVar.j(i12);
    }

    private static void m(z zVar, int i10, int i11) {
        int i12;
        int k10 = k(zVar, 4, 8, 16) + 1;
        zVar.q();
        for (int i13 = 0; i13 < k10; i13++) {
            int h10 = zVar.h(2);
            if (h10 == 0) {
                i(zVar);
                if (i11 > 0) {
                    o(zVar);
                }
            } else if (h10 == 1) {
                if (i(zVar)) {
                    zVar.q();
                }
                if (i11 > 0) {
                    o(zVar);
                    i12 = zVar.h(2);
                } else {
                    i12 = 0;
                }
                if (i12 > 0) {
                    zVar.r(6);
                    int h11 = zVar.h(2);
                    zVar.r(4);
                    if (zVar.g()) {
                        zVar.r(5);
                    }
                    if (i12 == 2 || i12 == 3) {
                        zVar.r(6);
                    }
                    if (h11 == 2) {
                        zVar.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log((double) (i10 - 1)) / Math.log(2.0d))) + 1;
                int h12 = zVar.h(2);
                if (h12 > 0 && zVar.g()) {
                    zVar.r(floor);
                }
                if (zVar.g()) {
                    zVar.r(floor);
                }
                if (i11 == 0 && h12 == 0) {
                    zVar.q();
                }
            } else if (h10 == 3) {
                k(zVar, 4, 8, 16);
                int k11 = k(zVar, 4, 8, 16);
                if (zVar.g()) {
                    k(zVar, 8, 16, 0);
                }
                zVar.q();
                if (k11 > 0) {
                    zVar.r(k11 * 8);
                }
            }
        }
    }

    private static void n(z zVar, int i10) {
        int i11;
        int i12;
        int i13;
        boolean g10 = zVar.g();
        int i14 = 5;
        if (g10) {
            i11 = 1;
        } else {
            i11 = 5;
        }
        if (g10) {
            i14 = 7;
        }
        if (g10) {
            i12 = 8;
        } else {
            i12 = 6;
        }
        int i15 = 0;
        while (i15 < i10) {
            if (zVar.g()) {
                zVar.r(7);
                i13 = 0;
            } else {
                if (zVar.h(2) == 3 && zVar.h(i14) * i11 != 0) {
                    zVar.q();
                }
                i13 = zVar.h(i12) * i11;
                if (!(i13 == 0 || i13 == 180)) {
                    zVar.q();
                }
                zVar.q();
            }
            if (!(i13 == 0 || i13 == 180 || !zVar.g())) {
                i15++;
            }
            i15++;
        }
    }

    private static void o(z zVar) {
        zVar.r(3);
        zVar.r(8);
        boolean g10 = zVar.g();
        boolean g11 = zVar.g();
        if (g10) {
            zVar.r(5);
        }
        if (g11) {
            zVar.r(6);
        }
    }

    private static void p(z zVar) {
        int h10 = zVar.h(2);
        if (h10 == 0) {
            zVar.r(6);
            return;
        }
        int k10 = k(zVar, 5, 8, 16) + 1;
        if (h10 == 1) {
            zVar.r(k10 * 7);
        } else if (h10 == 2) {
            n(zVar, k10);
        }
    }
}
