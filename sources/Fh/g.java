package Fh;

import Gh.C5404e;
import Gh.C5406g;
import Gh.C5407h;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import sh.C6726e;

public final class g implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63144a;

    /* renamed from: b  reason: collision with root package name */
    private final C5406g f63145b;

    /* renamed from: c  reason: collision with root package name */
    private final a f63146c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63147d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f63148e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f63149f;

    /* renamed from: g  reason: collision with root package name */
    private int f63150g;

    /* renamed from: h  reason: collision with root package name */
    private long f63151h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f63152i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f63153j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f63154k;

    /* renamed from: l  reason: collision with root package name */
    private final C5404e f63155l = new C5404e();

    /* renamed from: m  reason: collision with root package name */
    private final C5404e f63156m = new C5404e();

    /* renamed from: n  reason: collision with root package name */
    private c f63157n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f63158o;

    /* renamed from: p  reason: collision with root package name */
    private final C5404e.a f63159p;

    public interface a {
        void a(String str);

        void b(C5407h hVar);

        void c(C5407h hVar);

        void d(C5407h hVar);

        void e(int i10, String str);
    }

    public g(boolean z10, C5406g gVar, a aVar, boolean z11, boolean z12) {
        byte[] bArr;
        C6496s.h(gVar, "source");
        C6496s.h(aVar, "frameCallback");
        this.f63144a = z10;
        this.f63145b = gVar;
        this.f63146c = aVar;
        this.f63147d = z11;
        this.f63148e = z12;
        C5404e.a aVar2 = null;
        if (z10) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f63158o = bArr;
        this.f63159p = !z10 ? new C5404e.a() : aVar2;
    }

    private final void b() {
        String str;
        short s10;
        long j10 = this.f63151h;
        if (j10 > 0) {
            this.f63145b.Z0(this.f63155l, j10);
            if (!this.f63144a) {
                C5404e eVar = this.f63155l;
                C5404e.a aVar = this.f63159p;
                C6496s.e(aVar);
                eVar.g0(aVar);
                this.f63159p.n(0);
                f fVar = f.f63143a;
                C5404e.a aVar2 = this.f63159p;
                byte[] bArr = this.f63158o;
                C6496s.e(bArr);
                fVar.b(aVar2, bArr);
                this.f63159p.close();
            }
        }
        switch (this.f63150g) {
            case 8:
                long B02 = this.f63155l.B0();
                if (B02 != 1) {
                    if (B02 != 0) {
                        s10 = this.f63155l.readShort();
                        str = this.f63155l.p1();
                        String a10 = f.f63143a.a(s10);
                        if (a10 != null) {
                            throw new ProtocolException(a10);
                        }
                    } else {
                        s10 = 1005;
                        str = "";
                    }
                    this.f63146c.e(s10, str);
                    this.f63149f = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f63146c.b(this.f63155l.o0());
                return;
            case 10:
                this.f63146c.d(this.f63155l.o0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C6726e.R(this.f63150g));
        }
    }

    /* JADX INFO: finally extract failed */
    private final void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        if (!this.f63149f) {
            long h10 = this.f63145b.timeout().h();
            this.f63145b.timeout().b();
            try {
                int d10 = C6726e.d(this.f63145b.readByte(), 255);
                this.f63145b.timeout().g(h10, TimeUnit.NANOSECONDS);
                int i10 = d10 & 15;
                this.f63150g = i10;
                boolean z14 = false;
                if ((d10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f63152i = z10;
                if ((d10 & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f63153j = z11;
                if (!z11 || z10) {
                    if ((d10 & 64) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i10 == 1 || i10 == 2) {
                        if (!z12) {
                            z13 = false;
                        } else if (this.f63147d) {
                            z13 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.f63154k = z13;
                    } else if (z12) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((d10 & 32) != 0) {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    } else if ((d10 & 16) == 0) {
                        int d11 = C6726e.d(this.f63145b.readByte(), 255);
                        if ((d11 & 128) != 0) {
                            z14 = true;
                        }
                        if (z14 == this.f63144a) {
                            if (this.f63144a) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j10 = (long) (d11 & 127);
                        this.f63151h = j10;
                        if (j10 == 126) {
                            this.f63151h = (long) C6726e.e(this.f63145b.readShort(), 65535);
                        } else if (j10 == 127) {
                            long readLong = this.f63145b.readLong();
                            this.f63151h = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + C6726e.S(this.f63151h) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.f63153j && this.f63151h > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        } else if (z14) {
                            C5406g gVar = this.f63145b;
                            byte[] bArr = this.f63158o;
                            C6496s.e(bArr);
                            gVar.readFully(bArr);
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv3 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th2) {
                this.f63145b.timeout().g(h10, TimeUnit.NANOSECONDS);
                throw th2;
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    private final void n() {
        while (!this.f63149f) {
            long j10 = this.f63151h;
            if (j10 > 0) {
                this.f63145b.Z0(this.f63156m, j10);
                if (!this.f63144a) {
                    C5404e eVar = this.f63156m;
                    C5404e.a aVar = this.f63159p;
                    C6496s.e(aVar);
                    eVar.g0(aVar);
                    this.f63159p.n(this.f63156m.B0() - this.f63151h);
                    f fVar = f.f63143a;
                    C5404e.a aVar2 = this.f63159p;
                    byte[] bArr = this.f63158o;
                    C6496s.e(bArr);
                    fVar.b(aVar2, bArr);
                    this.f63159p.close();
                }
            }
            if (!this.f63152i) {
                q();
                if (this.f63150g != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + C6726e.R(this.f63150g));
                }
            } else {
                return;
            }
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    private final void o() {
        int i10 = this.f63150g;
        if (i10 == 1 || i10 == 2) {
            n();
            if (this.f63154k) {
                c cVar = this.f63157n;
                if (cVar == null) {
                    cVar = new c(this.f63148e);
                    this.f63157n = cVar;
                }
                cVar.a(this.f63156m);
            }
            if (i10 == 1) {
                this.f63146c.a(this.f63156m.p1());
            } else {
                this.f63146c.c(this.f63156m.o0());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + C6726e.R(i10));
        }
    }

    private final void q() {
        while (!this.f63149f) {
            f();
            if (this.f63153j) {
                b();
            } else {
                return;
            }
        }
    }

    public final void a() {
        f();
        if (this.f63153j) {
            b();
        } else {
            o();
        }
    }

    public void close() {
        c cVar = this.f63157n;
        if (cVar != null) {
            cVar.close();
        }
    }
}
