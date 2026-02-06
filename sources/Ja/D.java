package ja;

import android.os.SystemClock;
import ia.B;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public abstract class D {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f44957a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Object f44958b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static boolean f44959c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static long f44960d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f44961e = "time.android.com";

    public interface b {
        void a();

        void b(IOException iOException);
    }

    private static void g(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + b11);
        } else if (i10 == 0 || i10 > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        } else if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long h() {
        long j10;
        synchronized (f44958b) {
            try {
                if (f44959c) {
                    j10 = f44960d;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f44958b) {
            str = f44961e;
        }
        return str;
    }

    public static void j(B b10, b bVar) {
        if (!k()) {
            if (b10 == null) {
                b10 = new B("SntpClient");
            }
            b10.n(new d(), new c(bVar), 1);
        } else if (bVar != null) {
            bVar.a();
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f44958b) {
            z10 = f44959c;
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b10 = bArr[0];
            long n10 = n(bArr, 24);
            long n11 = n(bArr, 32);
            long n12 = n(bArr, 40);
            g((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), bArr[1] & 255, n12);
            long j11 = (j10 + (((n11 - n10) + (n12 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static long m(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        byte b12 = bArr[i10 + 2];
        byte b13 = bArr[i10 + 3];
        byte b14 = b10 & true;
        int i11 = b10;
        if (b14 == true) {
            i11 = (b10 & Byte.MAX_VALUE) + 128;
        }
        byte b15 = b11 & true;
        int i12 = b11;
        if (b15 == true) {
            i12 = (b11 & Byte.MAX_VALUE) + 128;
        }
        byte b16 = b12 & true;
        int i13 = b12;
        if (b16 == true) {
            i13 = (b12 & Byte.MAX_VALUE) + 128;
        }
        byte b17 = b13 & true;
        int i14 = b13;
        if (b17 == true) {
            i14 = (b13 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long n(byte[] bArr, int i10) {
        long m10 = m(bArr, i10);
        long m11 = m(bArr, i10 + 4);
        if (m10 == 0 && m11 == 0) {
            return 0;
        }
        return ((m10 - 2208988800L) * 1000) + ((m11 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        bArr[i10] = (byte) ((int) (j13 >> 24));
        bArr[i10 + 1] = (byte) ((int) (j13 >> 16));
        bArr[i10 + 2] = (byte) ((int) (j13 >> 8));
        bArr[i10 + 3] = (byte) ((int) j13);
        long j14 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) ((int) (j14 >> 24));
        bArr[i10 + 5] = (byte) ((int) (j14 >> 16));
        bArr[i10 + 6] = (byte) ((int) (j14 >> 8));
        bArr[i10 + 7] = (byte) ((int) (Math.random() * 255.0d));
    }

    private static final class d implements B.e {
        private d() {
        }

        public void a() {
            synchronized (D.f44957a) {
                synchronized (D.f44958b) {
                    if (!D.f44959c) {
                        long e10 = D.l();
                        synchronized (D.f44958b) {
                            long unused = D.f44960d = e10;
                            boolean unused2 = D.f44959c = true;
                        }
                    }
                }
            }
        }

        public void b() {
        }
    }

    private static final class c implements B.b {

        /* renamed from: a  reason: collision with root package name */
        private final b f44962a;

        public c(b bVar) {
            this.f44962a = bVar;
        }

        public void p(B.e eVar, long j10, long j11) {
            if (this.f44962a == null) {
                return;
            }
            if (!D.k()) {
                this.f44962a.b(new IOException(new ConcurrentModificationException()));
            } else {
                this.f44962a.a();
            }
        }

        public B.c u(B.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f44962a;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return B.f44364f;
        }

        public void t(B.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
