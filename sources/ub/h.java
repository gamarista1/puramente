package Ub;

import Ub.a;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

class h {

    /* renamed from: a  reason: collision with root package name */
    private DataInputStream f53362a = null;

    /* renamed from: b  reason: collision with root package name */
    private c f53363b = null;

    /* renamed from: c  reason: collision with root package name */
    private d f53364c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f53365d = new byte[112];

    /* renamed from: e  reason: collision with root package name */
    private a.b f53366e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f53367f = false;

    h(c cVar) {
        this.f53363b = cVar;
    }

    private void a(boolean z10, byte b10, byte[] bArr) {
        if (b10 != 9) {
            a.b bVar = this.f53366e;
            if (bVar != null && b10 != 0) {
                throw new e("Failed to continue outstanding frame");
            } else if (bVar == null && b10 == 0) {
                throw new e("Received continuing frame, but there's nothing to continue");
            } else {
                if (bVar == null) {
                    this.f53366e = a.a(b10);
                }
                if (!this.f53366e.a(bArr)) {
                    throw new e("Failed to decode frame");
                } else if (z10) {
                    g b11 = this.f53366e.b();
                    this.f53366e = null;
                    if (b11 != null) {
                        this.f53364c.d(b11);
                        return;
                    }
                    throw new e("Failed to decode whole message");
                }
            }
        } else if (z10) {
            c(bArr);
        } else {
            throw new e("PING must not fragment across frames");
        }
    }

    private void b(e eVar) {
        h();
        this.f53363b.k(eVar);
    }

    private void c(byte[] bArr) {
        if (bArr.length <= 125) {
            this.f53363b.m(bArr);
            return;
        }
        throw new e("PING frame too long");
    }

    private long d(byte[] bArr, int i10) {
        return (((long) bArr[i10]) << 56) + (((long) (bArr[i10 + 1] & 255)) << 48) + (((long) (bArr[i10 + 2] & 255)) << 40) + (((long) (bArr[i10 + 3] & 255)) << 32) + (((long) (bArr[i10 + 4] & 255)) << 24) + ((long) ((bArr[i10 + 5] & 255) << 16)) + ((long) ((bArr[i10 + 6] & 255) << 8)) + ((long) (bArr[i10 + 7] & 255));
    }

    private int e(byte[] bArr, int i10, int i11) {
        this.f53362a.readFully(bArr, i10, i11);
        return i11;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        boolean z10;
        long j10;
        this.f53364c = this.f53363b.g();
        while (!this.f53367f) {
            try {
                int e10 = e(this.f53365d, 0, 1);
                byte[] bArr = this.f53365d;
                byte b10 = bArr[0];
                if ((b10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((b10 & 112) == 0) {
                    byte b11 = (byte) (b10 & 15);
                    int e11 = e10 + e(bArr, e10, 1);
                    byte[] bArr2 = this.f53365d;
                    byte b12 = bArr2[1];
                    if (b12 < 126) {
                        j10 = (long) b12;
                    } else if (b12 == 126) {
                        e(bArr2, e11, 2);
                        byte[] bArr3 = this.f53365d;
                        j10 = (((long) (bArr3[2] & 255)) << 8) | ((long) (bArr3[3] & 255));
                    } else if (b12 == Byte.MAX_VALUE) {
                        j10 = d(this.f53365d, (e11 + e(bArr2, e11, 8)) - 8);
                    } else {
                        j10 = 0;
                    }
                    int i10 = (int) j10;
                    byte[] bArr4 = new byte[i10];
                    e(bArr4, 0, i10);
                    if (b11 == 8) {
                        this.f53363b.l();
                    } else if (b11 != 10) {
                        if (!(b11 == 1 || b11 == 2 || b11 == 9)) {
                            if (b11 != 0) {
                                throw new e("Unsupported opcode: " + b11);
                            }
                        }
                        a(z10, b11, bArr4);
                    }
                } else {
                    throw new e("Invalid frame received");
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException e12) {
                b(new e("IO Error", e12));
            } catch (e e13) {
                b(e13);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(DataInputStream dataInputStream) {
        this.f53362a = dataInputStream;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f53367f = true;
    }
}
