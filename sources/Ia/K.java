package ia;

import android.net.Uri;
import ja.C3645a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class K extends C3608f {

    /* renamed from: e  reason: collision with root package name */
    private final int f44411e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f44412f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f44413g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f44414h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f44415i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f44416j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f44417k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f44418l;

    /* renamed from: m  reason: collision with root package name */
    private int f44419m;

    public static final class a extends C3613k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public K() {
        this(2000);
    }

    public void close() {
        this.f44414h = null;
        MulticastSocket multicastSocket = this.f44416j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C3645a.e(this.f44417k));
            } catch (IOException unused) {
            }
            this.f44416j = null;
        }
        DatagramSocket datagramSocket = this.f44415i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f44415i = null;
        }
        this.f44417k = null;
        this.f44419m = 0;
        if (this.f44418l) {
            this.f44418l = false;
            p();
        }
    }

    public Uri getUri() {
        return this.f44414h;
    }

    public long m(n nVar) {
        Uri uri = nVar.f44456a;
        this.f44414h = uri;
        String str = (String) C3645a.e(uri.getHost());
        int port = this.f44414h.getPort();
        q(nVar);
        try {
            this.f44417k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f44417k, port);
            if (this.f44417k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f44416j = multicastSocket;
                multicastSocket.joinGroup(this.f44417k);
                this.f44415i = this.f44416j;
            } else {
                this.f44415i = new DatagramSocket(inetSocketAddress);
            }
            this.f44415i.setSoTimeout(this.f44411e);
            this.f44418l = true;
            r(nVar);
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
        if (this.f44419m == 0) {
            try {
                ((DatagramSocket) C3645a.e(this.f44415i)).receive(this.f44413g);
                int length = this.f44413g.getLength();
                this.f44419m = length;
                o(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f44413g.getLength();
        int i12 = this.f44419m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f44412f, length2 - i12, bArr, i10, min);
        this.f44419m -= min;
        return min;
    }

    public K(int i10) {
        this(i10, 8000);
    }

    public K(int i10, int i11) {
        super(true);
        this.f44411e = i11;
        byte[] bArr = new byte[i10];
        this.f44412f = bArr;
        this.f44413g = new DatagramPacket(bArr, 0, i10);
    }
}
