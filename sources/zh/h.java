package zh;

import Ef.g;
import Ef.m;
import Gh.C5404e;
import Gh.C5406g;
import Gh.C5407h;
import Gh.W;
import Gh.X;
import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.C6726e;
import zh.d;

public final class h implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f74147e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f74148f;

    /* renamed from: a  reason: collision with root package name */
    private final C5406g f74149a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f74150b;

    /* renamed from: c  reason: collision with root package name */
    private final b f74151c;

    /* renamed from: d  reason: collision with root package name */
    private final d.a f74152d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return h.f74148f;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    public interface c {
        void a(int i10, C6844b bVar);

        void b(boolean z10, int i10, int i11, List list);

        void c(int i10, long j10);

        void e(boolean z10, m mVar);

        void h(int i10, C6844b bVar, C5407h hVar);

        void i(int i10, int i11, List list);

        void j();

        void l(boolean z10, int i10, C5406g gVar, int i11);

        void m(boolean z10, int i10, int i11);

        void o(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        C6496s.g(logger, "getLogger(Http2::class.java.name)");
        f74148f = logger;
    }

    public h(C5406g gVar, boolean z10) {
        C6496s.h(gVar, "source");
        this.f74149a = gVar;
        this.f74150b = z10;
        b bVar = new b(gVar);
        this.f74151c = bVar;
        this.f74152d = new d.a(bVar, 4096, 0, 4, (DefaultConstructorMarker) null);
    }

    private final void E(c cVar, int i10, int i11, int i12) {
        if (i10 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        } else if (i12 != 0) {
            y(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    private final void F(c cVar, int i10, int i11, int i12) {
        int i13;
        if (i12 != 0) {
            if ((i11 & 8) != 0) {
                i13 = C6726e.d(this.f74149a.readByte(), 255);
            } else {
                i13 = 0;
            }
            cVar.i(i12, this.f74149a.readInt() & a.e.API_PRIORITY_OTHER, q(f74147e.b(i10 - 4, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void I(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 != 0) {
            int readInt = this.f74149a.readInt();
            C6844b a10 = C6844b.f74008b.a(readInt);
            if (a10 != null) {
                cVar.a(i12, a10);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    private final void M(c cVar, int i10, int i11, int i12) {
        int readInt;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i11 & 1) != 0) {
            if (i10 == 0) {
                cVar.j();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i10 % 6 == 0) {
            m mVar = new m();
            g t10 = m.t(m.u(0, i10), 6);
            int k10 = t10.k();
            int n10 = t10.n();
            int r10 = t10.r();
            if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
                while (true) {
                    int e10 = C6726e.e(this.f74149a.readShort(), 65535);
                    readInt = this.f74149a.readInt();
                    if (e10 != 2) {
                        if (e10 == 3) {
                            e10 = 4;
                        } else if (e10 != 4) {
                            if (e10 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            e10 = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.h(e10, readInt);
                    if (k10 == n10) {
                        break;
                    }
                    k10 += r10;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.e(false, mVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
    }

    private final void Q(c cVar, int i10, int i11, int i12) {
        if (i10 == 4) {
            long f10 = C6726e.f(this.f74149a.readInt(), 2147483647L);
            if (f10 != 0) {
                cVar.c(i12, f10);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
    }

    private final void n(c cVar, int i10, int i11, int i12) {
        boolean z10;
        if (i12 != 0) {
            int i13 = 0;
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 32) == 0) {
                if ((i11 & 8) != 0) {
                    i13 = C6726e.d(this.f74149a.readByte(), 255);
                }
                cVar.l(z10, i12, this.f74149a, f74147e.b(i10, i11, i13));
                this.f74149a.skip((long) i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void o(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f74149a.readInt();
            int readInt2 = this.f74149a.readInt();
            int i13 = i10 - 8;
            C6844b a10 = C6844b.f74008b.a(readInt2);
            if (a10 != null) {
                C5407h hVar = C5407h.f63296e;
                if (i13 > 0) {
                    hVar = this.f74149a.A0((long) i13);
                }
                cVar.h(readInt, a10, hVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List q(int i10, int i11, int i12, int i13) {
        this.f74151c.n(i10);
        b bVar = this.f74151c;
        bVar.o(bVar.a());
        this.f74151c.q(i11);
        this.f74151c.f(i12);
        this.f74151c.t(i13);
        this.f74152d.k();
        return this.f74152d.e();
    }

    private final void t(c cVar, int i10, int i11, int i12) {
        boolean z10;
        if (i12 != 0) {
            int i13 = 0;
            if ((i11 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 8) != 0) {
                i13 = C6726e.d(this.f74149a.readByte(), 255);
            }
            if ((i11 & 32) != 0) {
                y(cVar, i12);
                i10 -= 5;
            }
            cVar.b(z10, i12, -1, q(f74147e.b(i10, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void v(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f74149a.readInt();
            int readInt2 = this.f74149a.readInt();
            boolean z10 = true;
            if ((i11 & 1) == 0) {
                z10 = false;
            }
            cVar.m(z10, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void y(c cVar, int i10) {
        boolean z10;
        int readInt = this.f74149a.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.o(i10, readInt & a.e.API_PRIORITY_OTHER, C6726e.d(this.f74149a.readByte(), 255) + 1, z10);
    }

    public final boolean b(boolean z10, c cVar) {
        C6496s.h(cVar, "handler");
        try {
            this.f74149a.u0(9);
            int K10 = C6726e.K(this.f74149a);
            if (K10 <= 16384) {
                int d10 = C6726e.d(this.f74149a.readByte(), 255);
                int d11 = C6726e.d(this.f74149a.readByte(), 255);
                int readInt = this.f74149a.readInt() & a.e.API_PRIORITY_OTHER;
                Logger logger = f74148f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f74056a.c(true, readInt, K10, d10, d11));
                }
                if (!z10 || d10 == 4) {
                    switch (d10) {
                        case 0:
                            n(cVar, K10, d11, readInt);
                            return true;
                        case 1:
                            t(cVar, K10, d11, readInt);
                            return true;
                        case 2:
                            E(cVar, K10, d11, readInt);
                            return true;
                        case 3:
                            I(cVar, K10, d11, readInt);
                            return true;
                        case 4:
                            M(cVar, K10, d11, readInt);
                            return true;
                        case 5:
                            F(cVar, K10, d11, readInt);
                            return true;
                        case 6:
                            v(cVar, K10, d11, readInt);
                            return true;
                        case 7:
                            o(cVar, K10, d11, readInt);
                            return true;
                        case 8:
                            Q(cVar, K10, d11, readInt);
                            return true;
                        default:
                            this.f74149a.skip((long) K10);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + e.f74056a.b(d10));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + K10);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() {
        this.f74149a.close();
    }

    public final void f(c cVar) {
        C6496s.h(cVar, "handler");
        if (!this.f74150b) {
            C5406g gVar = this.f74149a;
            C5407h hVar = e.f74057b;
            C5407h A02 = gVar.A0((long) hVar.O());
            Logger logger = f74148f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C6726e.t("<< CONNECTION " + A02.r(), new Object[0]));
            }
            if (!C6496s.c(hVar, A02)) {
                throw new IOException("Expected a connection header but was " + A02.W());
            }
        } else if (!b(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public static final class b implements W {

        /* renamed from: a  reason: collision with root package name */
        private final C5406g f74153a;

        /* renamed from: b  reason: collision with root package name */
        private int f74154b;

        /* renamed from: c  reason: collision with root package name */
        private int f74155c;

        /* renamed from: d  reason: collision with root package name */
        private int f74156d;

        /* renamed from: e  reason: collision with root package name */
        private int f74157e;

        /* renamed from: f  reason: collision with root package name */
        private int f74158f;

        public b(C5406g gVar) {
            C6496s.h(gVar, "source");
            this.f74153a = gVar;
        }

        private final void b() {
            int i10 = this.f74156d;
            int K10 = C6726e.K(this.f74153a);
            this.f74157e = K10;
            this.f74154b = K10;
            int d10 = C6726e.d(this.f74153a.readByte(), 255);
            this.f74155c = C6726e.d(this.f74153a.readByte(), 255);
            a aVar = h.f74147e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f74056a.c(true, this.f74156d, this.f74154b, d10, this.f74155c));
            }
            int readInt = this.f74153a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f74156d = readInt;
            if (d10 != 9) {
                throw new IOException(d10 + " != TYPE_CONTINUATION");
            } else if (readInt != i10) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final int a() {
            return this.f74157e;
        }

        public final void f(int i10) {
            this.f74155c = i10;
        }

        public final void n(int i10) {
            this.f74157e = i10;
        }

        public final void o(int i10) {
            this.f74154b = i10;
        }

        public final void q(int i10) {
            this.f74158f = i10;
        }

        public final void t(int i10) {
            this.f74156d = i10;
        }

        public X timeout() {
            return this.f74153a.timeout();
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            while (true) {
                int i10 = this.f74157e;
                if (i10 == 0) {
                    this.f74153a.skip((long) this.f74158f);
                    this.f74158f = 0;
                    if ((this.f74155c & 4) != 0) {
                        return -1;
                    }
                    b();
                } else {
                    long y12 = this.f74153a.y1(eVar, Math.min(j10, (long) i10));
                    if (y12 == -1) {
                        return -1;
                    }
                    this.f74157e -= (int) y12;
                    return y12;
                }
            }
        }

        public void close() {
        }
    }
}
