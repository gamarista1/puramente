package zh;

import Gh.C5404e;
import Gh.C5405f;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.C6726e;
import zh.d;

public final class j implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final a f74187g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f74188h = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final C5405f f74189a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f74190b;

    /* renamed from: c  reason: collision with root package name */
    private final C5404e f74191c;

    /* renamed from: d  reason: collision with root package name */
    private int f74192d = 16384;

    /* renamed from: e  reason: collision with root package name */
    private boolean f74193e;

    /* renamed from: f  reason: collision with root package name */
    private final d.b f74194f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(C5405f fVar, boolean z10) {
        C6496s.h(fVar, "sink");
        this.f74189a = fVar;
        this.f74190b = z10;
        C5404e eVar = new C5404e();
        this.f74191c = eVar;
        this.f74194f = new d.b(0, false, eVar, 3, (DefaultConstructorMarker) null);
    }

    private final void Q(int i10, long j10) {
        int i11;
        while (j10 > 0) {
            long min = Math.min((long) this.f74192d, j10);
            j10 -= min;
            int i12 = (int) min;
            if (j10 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            o(i10, i12, 9, i11);
            this.f74189a.P(this.f74191c, min);
        }
    }

    public final synchronized void E(int i10, int i11, List list) {
        int i12;
        C6496s.h(list, "requestHeaders");
        if (!this.f74193e) {
            this.f74194f.g(list);
            long B02 = this.f74191c.B0();
            int min = (int) Math.min(((long) this.f74192d) - 4, B02);
            int i13 = min + 4;
            long j10 = (long) min;
            int i14 = (B02 > j10 ? 1 : (B02 == j10 ? 0 : -1));
            if (i14 == 0) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            o(i10, i13, 5, i12);
            this.f74189a.D(i11 & a.e.API_PRIORITY_OTHER);
            this.f74189a.P(this.f74191c, j10);
            if (i14 > 0) {
                Q(i10, B02 - j10);
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public final synchronized void F(int i10, C6844b bVar) {
        C6496s.h(bVar, "errorCode");
        if (this.f74193e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        } else if (bVar.b() != -1) {
            o(i10, 4, 3, 0);
            this.f74189a.D(bVar.b());
            this.f74189a.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final synchronized void I(m mVar) {
        int i10;
        try {
            C6496s.h(mVar, "settings");
            if (!this.f74193e) {
                o(0, mVar.i() * 6, 4, 0);
                for (int i11 = 0; i11 < 10; i11++) {
                    if (mVar.f(i11)) {
                        if (i11 == 4) {
                            i10 = 3;
                        } else if (i11 != 7) {
                            i10 = i11;
                        } else {
                            i10 = 4;
                        }
                        this.f74189a.D0(i10);
                        this.f74189a.D(mVar.a(i11));
                    }
                }
                this.f74189a.flush();
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        } finally {
        }
    }

    public final synchronized void M(int i10, long j10) {
        if (this.f74193e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        } else if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        } else {
            o(i10, 4, 8, 0);
            this.f74189a.D((int) j10);
            this.f74189a.flush();
        }
    }

    public final synchronized void a(m mVar) {
        try {
            C6496s.h(mVar, "peerSettings");
            if (!this.f74193e) {
                this.f74192d = mVar.e(this.f74192d);
                if (mVar.b() != -1) {
                    this.f74194f.e(mVar.b());
                }
                o(0, 0, 4, 1);
                this.f74189a.flush();
            } else {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f74193e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            } else if (this.f74190b) {
                Logger logger = f74188h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C6726e.t(">> CONNECTION " + e.f74057b.r(), new Object[0]));
                }
                this.f74189a.k0(e.f74057b);
                this.f74189a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void close() {
        this.f74193e = true;
        this.f74189a.close();
    }

    public final synchronized void f(boolean z10, int i10, C5404e eVar, int i11) {
        if (!this.f74193e) {
            n(i10, z10 ? 1 : 0, eVar, i11);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public final synchronized void flush() {
        if (!this.f74193e) {
            this.f74189a.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public final void n(int i10, int i11, C5404e eVar, int i12) {
        o(i10, i12, 0, i11);
        if (i12 > 0) {
            C5405f fVar = this.f74189a;
            C6496s.e(eVar);
            fVar.P(eVar, (long) i12);
        }
    }

    public final void o(int i10, int i11, int i12, int i13) {
        Logger logger = f74188h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f74056a.c(false, i10, i11, i12, i13));
        }
        if (i11 > this.f74192d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f74192d + ": " + i11).toString());
        } else if ((Integer.MIN_VALUE & i10) == 0) {
            C6726e.c0(this.f74189a, i11);
            this.f74189a.K0(i12 & 255);
            this.f74189a.K0(i13 & 255);
            this.f74189a.D(i10 & a.e.API_PRIORITY_OTHER);
        } else {
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
    }

    public final synchronized void q(int i10, C6844b bVar, byte[] bArr) {
        try {
            C6496s.h(bVar, "errorCode");
            C6496s.h(bArr, "debugData");
            if (this.f74193e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            } else if (bVar.b() != -1) {
                boolean z10 = false;
                o(0, bArr.length + 8, 7, 0);
                this.f74189a.D(i10);
                this.f74189a.D(bVar.b());
                if (bArr.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    this.f74189a.n0(bArr);
                }
                this.f74189a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void t(boolean z10, int i10, List list) {
        int i11;
        C6496s.h(list, "headerBlock");
        if (!this.f74193e) {
            this.f74194f.g(list);
            long B02 = this.f74191c.B0();
            long min = Math.min((long) this.f74192d, B02);
            int i12 = (B02 > min ? 1 : (B02 == min ? 0 : -1));
            if (i12 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (z10) {
                i11 |= 1;
            }
            o(i10, (int) min, 1, i11);
            this.f74189a.P(this.f74191c, min);
            if (i12 > 0) {
                Q(i10, B02 - min);
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public final int v() {
        return this.f74192d;
    }

    public final synchronized void y(boolean z10, int i10, int i11) {
        if (!this.f74193e) {
            o(0, 8, 6, z10 ? 1 : 0);
            this.f74189a.D(i10);
            this.f74189a.D(i11);
            this.f74189a.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }
}
