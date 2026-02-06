package k2;

import android.net.Uri;
import i2.C2076a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class y extends C2147b {

    /* renamed from: e  reason: collision with root package name */
    private final int f23280e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f23281f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f23282g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f23283h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f23284i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f23285j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f23286k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f23287l;

    /* renamed from: m  reason: collision with root package name */
    private int f23288m;

    public static final class a extends g {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public y() {
        this(2000);
    }

    public void close() {
        this.f23283h = null;
        MulticastSocket multicastSocket = this.f23285j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C2076a.e(this.f23286k));
            } catch (IOException unused) {
            }
            this.f23285j = null;
        }
        DatagramSocket datagramSocket = this.f23284i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f23284i = null;
        }
        this.f23286k = null;
        this.f23288m = 0;
        if (this.f23287l) {
            this.f23287l = false;
            p();
        }
    }

    public Uri getUri() {
        return this.f23283h;
    }

    public long m(j jVar) {
        Uri uri = jVar.f23194a;
        this.f23283h = uri;
        String str = (String) C2076a.e(uri.getHost());
        int port = this.f23283h.getPort();
        q(jVar);
        try {
            this.f23286k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f23286k, port);
            if (this.f23286k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f23285j = multicastSocket;
                multicastSocket.joinGroup(this.f23286k);
                this.f23284i = this.f23285j;
            } else {
                this.f23284i = new DatagramSocket(inetSocketAddress);
            }
            this.f23284i.setSoTimeout(this.f23280e);
            this.f23287l = true;
            r(jVar);
            return -1;
        } catch (SecurityException e10) {
            throw new a(e10, 2006);
        } catch (IOException e11) {
            throw new a(e11, 2001);
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f23288m == 0) {
            try {
                ((DatagramSocket) C2076a.e(this.f23284i)).receive(this.f23282g);
                int length = this.f23282g.getLength();
                this.f23288m = length;
                o(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f23282g.getLength();
        int i12 = this.f23288m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f23281f, length2 - i12, bArr, i10, min);
        this.f23288m -= min;
        return min;
    }

    public y(int i10) {
        this(i10, 8000);
    }

    public y(int i10, int i11) {
        super(true);
        this.f23280e = i11;
        byte[] bArr = new byte[i10];
        this.f23281f = bArr;
        this.f23282g = new DatagramPacket(bArr, 0, i10);
    }
}
