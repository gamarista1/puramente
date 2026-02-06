package n2;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.C1810h;
import com.google.common.collect.C4770v;
import com.google.common.collect.g0;
import f2.C1961B;
import f2.C1962C;
import f2.C1964E;
import f2.C1973h;
import f2.C1979n;
import f2.H;
import f2.L;
import f2.P;
import f2.s;
import f2.w;
import i2.C2076a;
import i2.L;
import i2.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import k2.o;
import k2.q;
import k2.r;
import k2.y;
import m2.k;
import n2.C2282b;
import n2.t1;
import o2.C2378y;
import p2.C2404h;
import p2.C2409m;
import p2.N;
import r2.l;
import r2.t;
import t2.C2613A;
import t2.C2615C;
import t2.C2658x;

public final class s1 implements C2282b, t1.a {

    /* renamed from: A  reason: collision with root package name */
    private boolean f24618A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f24619a;

    /* renamed from: b  reason: collision with root package name */
    private final t1 f24620b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f24621c;

    /* renamed from: d  reason: collision with root package name */
    private final long f24622d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    private final H.c f24623e = new H.c();

    /* renamed from: f  reason: collision with root package name */
    private final H.b f24624f = new H.b();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f24625g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f24626h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private String f24627i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f24628j;

    /* renamed from: k  reason: collision with root package name */
    private int f24629k;

    /* renamed from: l  reason: collision with root package name */
    private int f24630l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f24631m = 0;

    /* renamed from: n  reason: collision with root package name */
    private C1962C f24632n;

    /* renamed from: o  reason: collision with root package name */
    private b f24633o;

    /* renamed from: p  reason: collision with root package name */
    private b f24634p;

    /* renamed from: q  reason: collision with root package name */
    private b f24635q;

    /* renamed from: r  reason: collision with root package name */
    private s f24636r;

    /* renamed from: s  reason: collision with root package name */
    private s f24637s;

    /* renamed from: t  reason: collision with root package name */
    private s f24638t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f24639u;

    /* renamed from: v  reason: collision with root package name */
    private int f24640v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f24641w;

    /* renamed from: x  reason: collision with root package name */
    private int f24642x;

    /* renamed from: y  reason: collision with root package name */
    private int f24643y;

    /* renamed from: z  reason: collision with root package name */
    private int f24644z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f24645a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24646b;

        public a(int i10, int i11) {
            this.f24645a = i10;
            this.f24646b = i11;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final s f24647a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24648b;

        /* renamed from: c  reason: collision with root package name */
        public final String f24649c;

        public b(s sVar, int i10, String str) {
            this.f24647a = sVar;
            this.f24648b = i10;
            this.f24649c = str;
        }
    }

    private s1(Context context, PlaybackSession playbackSession) {
        this.f24619a = context.getApplicationContext();
        this.f24621c = playbackSession;
        C2313q0 q0Var = new C2313q0();
        this.f24620b = q0Var;
        q0Var.d(this);
    }

    private static Pair A0(String str) {
        String str2;
        String[] a12 = L.a1(str, "-");
        String str3 = a12[0];
        if (a12.length >= 2) {
            str2 = a12[1];
        } else {
            str2 = null;
        }
        return Pair.create(str3, str2);
    }

    private static int C0(Context context) {
        switch (u.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
            default:
                return 1;
        }
    }

    private static int D0(w wVar) {
        w.h hVar = wVar.f20157b;
        if (hVar == null) {
            return 0;
        }
        int w02 = L.w0(hVar.f20249a, hVar.f20250b);
        if (w02 == 0) {
            return 3;
        }
        if (w02 == 1) {
            return 5;
        }
        if (w02 != 2) {
            return 1;
        }
        return 4;
    }

    private static int E0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return 1;
        }
        return 4;
    }

    private void F0(C2282b.C0415b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            C2282b.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f24620b.e(c10);
            } else if (b10 == 11) {
                this.f24620b.g(c10, this.f24629k);
            } else {
                this.f24620b.f(c10);
            }
        }
    }

    private void G0(long j10) {
        int C02 = C0(this.f24619a);
        if (C02 != this.f24631m) {
            this.f24631m = C02;
            this.f24621c.reportNetworkEvent(C0.a().setNetworkType(C02).setTimeSinceCreatedMillis(j10 - this.f24622d).build());
        }
    }

    private void H0(long j10) {
        boolean z10;
        C1962C c10 = this.f24632n;
        if (c10 != null) {
            Context context = this.f24619a;
            if (this.f24640v == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            a z02 = z0(c10, context, z10);
            this.f24621c.reportPlaybackErrorEvent(Y0.a().setTimeSinceCreatedMillis(j10 - this.f24622d).setErrorCode(z02.f24645a).setSubErrorCode(z02.f24646b).setException(c10).build());
            this.f24618A = true;
            this.f24632n = null;
        }
    }

    private void I0(C1964E e10, C2282b.C0415b bVar, long j10) {
        if (e10.k() != 2) {
            this.f24639u = false;
        }
        if (e10.i() == null) {
            this.f24641w = false;
        } else if (bVar.a(10)) {
            this.f24641w = true;
        }
        int Q02 = Q0(e10);
        if (this.f24630l != Q02) {
            this.f24630l = Q02;
            this.f24618A = true;
            this.f24621c.reportPlaybackStateEvent(j1.a().setState(this.f24630l).setTimeSinceCreatedMillis(j10 - this.f24622d).build());
        }
    }

    private void J0(C1964E e10, C2282b.C0415b bVar, long j10) {
        if (bVar.a(2)) {
            f2.L m10 = e10.m();
            boolean c10 = m10.c(2);
            boolean c11 = m10.c(1);
            boolean c12 = m10.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    O0(j10, (s) null, 0);
                }
                if (!c11) {
                    K0(j10, (s) null, 0);
                }
                if (!c12) {
                    M0(j10, (s) null, 0);
                }
            }
        }
        if (t0(this.f24633o)) {
            b bVar2 = this.f24633o;
            s sVar = bVar2.f24647a;
            if (sVar.f20090u != -1) {
                O0(j10, sVar, bVar2.f24648b);
                this.f24633o = null;
            }
        }
        if (t0(this.f24634p)) {
            b bVar3 = this.f24634p;
            K0(j10, bVar3.f24647a, bVar3.f24648b);
            this.f24634p = null;
        }
        if (t0(this.f24635q)) {
            b bVar4 = this.f24635q;
            M0(j10, bVar4.f24647a, bVar4.f24648b);
            this.f24635q = null;
        }
    }

    private void K0(long j10, s sVar, int i10) {
        if (!L.c(this.f24637s, sVar)) {
            if (this.f24637s == null && i10 == 0) {
                i10 = 1;
            }
            this.f24637s = sVar;
            P0(0, j10, sVar, i10);
        }
    }

    private void L0(C1964E e10, C2282b.C0415b bVar) {
        C1979n x02;
        if (bVar.a(0)) {
            C2282b.a c10 = bVar.c(0);
            if (this.f24628j != null) {
                N0(c10.f24512b, c10.f24514d);
            }
        }
        if (!(!bVar.a(2) || this.f24628j == null || (x02 = x0(e10.m().a())) == null)) {
            PlaybackMetrics.Builder unused = K0.a(L.h(this.f24628j)).setDrmType(y0(x02));
        }
        if (bVar.a(1011)) {
            this.f24644z++;
        }
    }

    private void M0(long j10, s sVar, int i10) {
        if (!L.c(this.f24638t, sVar)) {
            if (this.f24638t == null && i10 == 0) {
                i10 = 1;
            }
            this.f24638t = sVar;
            P0(2, j10, sVar, i10);
        }
    }

    private void N0(H h10, C2615C.b bVar) {
        int b10;
        int i10;
        PlaybackMetrics.Builder builder = this.f24628j;
        if (bVar != null && (b10 = h10.b(bVar.f25960a)) != -1) {
            h10.f(b10, this.f24624f);
            h10.n(this.f24624f.f19746c, this.f24623e);
            PlaybackMetrics.Builder unused = builder.setStreamType(D0(this.f24623e.f19769c));
            H.c cVar = this.f24623e;
            if (cVar.f19779m != -9223372036854775807L && !cVar.f19777k && !cVar.f19775i && !cVar.f()) {
                PlaybackMetrics.Builder unused2 = builder.setMediaDurationMillis(this.f24623e.d());
            }
            if (this.f24623e.f()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            PlaybackMetrics.Builder unused3 = builder.setPlaybackType(i10);
            this.f24618A = true;
        }
    }

    private void O0(long j10, s sVar, int i10) {
        if (!L.c(this.f24636r, sVar)) {
            if (this.f24636r == null && i10 == 0) {
                i10 = 1;
            }
            this.f24636r = sVar;
            P0(1, j10, sVar, i10);
        }
    }

    private void P0(int i10, long j10, s sVar, int i11) {
        TrackChangeEvent.Builder a10 = C2314r0.a(i10).setTimeSinceCreatedMillis(j10 - this.f24622d);
        if (sVar != null) {
            TrackChangeEvent.Builder unused = a10.setTrackState(1);
            TrackChangeEvent.Builder unused2 = a10.setTrackChangeReason(E0(i11));
            String str = sVar.f20082m;
            if (str != null) {
                TrackChangeEvent.Builder unused3 = a10.setContainerMimeType(str);
            }
            String str2 = sVar.f20083n;
            if (str2 != null) {
                TrackChangeEvent.Builder unused4 = a10.setSampleMimeType(str2);
            }
            String str3 = sVar.f20079j;
            if (str3 != null) {
                TrackChangeEvent.Builder unused5 = a10.setCodecName(str3);
            }
            int i12 = sVar.f20078i;
            if (i12 != -1) {
                TrackChangeEvent.Builder unused6 = a10.setBitrate(i12);
            }
            int i13 = sVar.f20089t;
            if (i13 != -1) {
                TrackChangeEvent.Builder unused7 = a10.setWidth(i13);
            }
            int i14 = sVar.f20090u;
            if (i14 != -1) {
                TrackChangeEvent.Builder unused8 = a10.setHeight(i14);
            }
            int i15 = sVar.f20059B;
            if (i15 != -1) {
                TrackChangeEvent.Builder unused9 = a10.setChannelCount(i15);
            }
            int i16 = sVar.f20060C;
            if (i16 != -1) {
                TrackChangeEvent.Builder unused10 = a10.setAudioSampleRate(i16);
            }
            String str4 = sVar.f20073d;
            if (str4 != null) {
                Pair A02 = A0(str4);
                TrackChangeEvent.Builder unused11 = a10.setLanguage((String) A02.first);
                Object obj = A02.second;
                if (obj != null) {
                    TrackChangeEvent.Builder unused12 = a10.setLanguageRegion((String) obj);
                }
            }
            float f10 = sVar.f20091v;
            if (f10 != -1.0f) {
                TrackChangeEvent.Builder unused13 = a10.setVideoFrameRate(f10);
            }
        } else {
            TrackChangeEvent.Builder unused14 = a10.setTrackState(0);
        }
        this.f24618A = true;
        this.f24621c.reportTrackChangeEvent(a10.build());
    }

    private int Q0(C1964E e10) {
        int k10 = e10.k();
        if (this.f24639u) {
            return 5;
        }
        if (this.f24641w) {
            return 13;
        }
        if (k10 == 4) {
            return 11;
        }
        if (k10 == 2) {
            int i10 = this.f24630l;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (!e10.u()) {
                return 7;
            }
            if (e10.r() != 0) {
                return 10;
            }
            return 6;
        } else if (k10 == 3) {
            if (!e10.u()) {
                return 4;
            }
            if (e10.r() != 0) {
                return 9;
            }
            return 3;
        } else if (k10 != 1 || this.f24630l == 0) {
            return this.f24630l;
        } else {
            return 12;
        }
    }

    private boolean t0(b bVar) {
        if (bVar == null || !bVar.f24649c.equals(this.f24620b.a())) {
            return false;
        }
        return true;
    }

    public static s1 u0(Context context) {
        MediaMetricsManager a10 = n1.a(context.getSystemService("media_metrics"));
        if (a10 == null) {
            return null;
        }
        return new s1(context, a10.createPlaybackSession());
    }

    private void v0() {
        long j10;
        long j11;
        int i10;
        PlaybackMetrics.Builder builder = this.f24628j;
        if (builder != null && this.f24618A) {
            PlaybackMetrics.Builder unused = builder.setAudioUnderrunCount(this.f24644z);
            PlaybackMetrics.Builder unused2 = this.f24628j.setVideoFramesDropped(this.f24642x);
            PlaybackMetrics.Builder unused3 = this.f24628j.setVideoFramesPlayed(this.f24643y);
            Long l10 = (Long) this.f24625g.get(this.f24627i);
            PlaybackMetrics.Builder builder2 = this.f24628j;
            if (l10 == null) {
                j10 = 0;
            } else {
                j10 = l10.longValue();
            }
            PlaybackMetrics.Builder unused4 = builder2.setNetworkTransferDurationMillis(j10);
            Long l11 = (Long) this.f24626h.get(this.f24627i);
            PlaybackMetrics.Builder builder3 = this.f24628j;
            if (l11 == null) {
                j11 = 0;
            } else {
                j11 = l11.longValue();
            }
            PlaybackMetrics.Builder unused5 = builder3.setNetworkBytesRead(j11);
            PlaybackMetrics.Builder builder4 = this.f24628j;
            if (l11 == null || l11.longValue() <= 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            PlaybackMetrics.Builder unused6 = builder4.setStreamSource(i10);
            this.f24621c.reportPlaybackMetrics(this.f24628j.build());
        }
        this.f24628j = null;
        this.f24627i = null;
        this.f24644z = 0;
        this.f24642x = 0;
        this.f24643y = 0;
        this.f24636r = null;
        this.f24637s = null;
        this.f24638t = null;
        this.f24618A = false;
    }

    private static int w0(int i10) {
        switch (L.V(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static C1979n x0(C4770v vVar) {
        C1979n nVar;
        g0 m10 = vVar.iterator();
        while (m10.hasNext()) {
            L.a aVar = (L.a) m10.next();
            int i10 = 0;
            while (true) {
                if (i10 < aVar.f19900a) {
                    if (aVar.f(i10) && (nVar = aVar.b(i10).f20087r) != null) {
                        return nVar;
                    }
                    i10++;
                }
            }
        }
        return null;
    }

    private static int y0(C1979n nVar) {
        for (int i10 = 0; i10 < nVar.f20015d; i10++) {
            UUID uuid = nVar.c(i10).f20017b;
            if (uuid.equals(C1973h.f19975d)) {
                return 3;
            }
            if (uuid.equals(C1973h.f19976e)) {
                return 2;
            }
            if (uuid.equals(C1973h.f19974c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a z0(C1962C c10, Context context, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        if (c10.f19703a == 1001) {
            return new a(20, 0);
        }
        if (c10 instanceof C1810h) {
            C1810h hVar = (C1810h) c10;
            if (hVar.f17703j == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            i10 = hVar.f17707n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) C2076a.e(c10.getCause());
        if (th2 instanceof IOException) {
            if (th2 instanceof k2.s) {
                return new a(5, ((k2.s) th2).f23262d);
            }
            if ((th2 instanceof r) || (th2 instanceof C1961B)) {
                if (z10) {
                    i11 = 10;
                } else {
                    i11 = 11;
                }
                return new a(i11, 0);
            }
            boolean z12 = th2 instanceof q;
            if (z12 || (th2 instanceof y.a)) {
                if (u.d(context).f() == 1) {
                    return new a(3, 0);
                }
                Throwable cause = th2.getCause();
                if (cause instanceof UnknownHostException) {
                    return new a(6, 0);
                }
                if (cause instanceof SocketTimeoutException) {
                    return new a(7, 0);
                }
                if (!z12 || ((q) th2).f23260c != 1) {
                    return new a(8, 0);
                }
                return new a(4, 0);
            } else if (c10.f19703a == 1002) {
                return new a(21, 0);
            } else {
                if (th2 instanceof C2409m.a) {
                    Throwable th3 = (Throwable) C2076a.e(th2.getCause());
                    int i12 = i2.L.f22072a;
                    if (i12 >= 21 && (th3 instanceof MediaDrm.MediaDrmStateException)) {
                        int W10 = i2.L.W(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
                        return new a(w0(W10), W10);
                    } else if (i12 >= 23 && (th3 instanceof MediaDrmResetException)) {
                        return new a(27, 0);
                    } else {
                        if (th3 instanceof NotProvisionedException) {
                            return new a(24, 0);
                        }
                        if (th3 instanceof DeniedByServerException) {
                            return new a(29, 0);
                        }
                        if (th3 instanceof N) {
                            return new a(23, 0);
                        }
                        if (th3 instanceof C2404h.e) {
                            return new a(28, 0);
                        }
                        return new a(30, 0);
                    }
                } else if (!(th2 instanceof o.b) || !(th2.getCause() instanceof FileNotFoundException)) {
                    return new a(9, 0);
                } else {
                    Throwable cause2 = ((Throwable) C2076a.e(th2.getCause())).getCause();
                    if (i2.L.f22072a < 21 || !(cause2 instanceof ErrnoException) || ((ErrnoException) cause2).errno != OsConstants.EACCES) {
                        return new a(31, 0);
                    }
                    return new a(32, 0);
                }
            }
        } else if (z11 && (i10 == 0 || i10 == 1)) {
            return new a(35, 0);
        } else {
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof t.d) {
                return new a(13, i2.L.W(((t.d) th2).f25737d));
            }
            if (th2 instanceof l) {
                return new a(14, ((l) th2).f25653c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof C2378y.c) {
                return new a(17, ((C2378y.c) th2).f25057a);
            }
            if (th2 instanceof C2378y.f) {
                return new a(18, ((C2378y.f) th2).f25062a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(w0(errorCode), errorCode);
        }
    }

    public void A(C2282b.a aVar, String str, boolean z10) {
        C2615C.b bVar = aVar.f24514d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f24627i)) {
            v0();
        }
        this.f24625g.remove(str);
        this.f24626h.remove(str);
    }

    public LogSessionId B0() {
        return this.f24621c.getSessionId();
    }

    public void d(C1964E e10, C2282b.C0415b bVar) {
        if (bVar.d() != 0) {
            F0(bVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            L0(e10, bVar);
            H0(elapsedRealtime);
            J0(e10, bVar, elapsedRealtime);
            G0(elapsedRealtime);
            I0(e10, bVar, elapsedRealtime);
            if (bVar.a(1028)) {
                this.f24620b.b(bVar.c(1028));
            }
        }
    }

    public void g0(C2282b.a aVar, C2613A a10) {
        if (aVar.f24514d != null) {
            b bVar = new b((s) C2076a.e(a10.f25954c), a10.f25955d, this.f24620b.c(aVar.f24512b, (C2615C.b) C2076a.e(aVar.f24514d)));
            int i10 = a10.f25953b;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f24634p = bVar;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.f24635q = bVar;
                        return;
                    }
                    return;
                }
            }
            this.f24633o = bVar;
        }
    }

    public void l0(C2282b.a aVar, C1962C c10) {
        this.f24632n = c10;
    }

    public void m0(C2282b.a aVar, P p10) {
        b bVar = this.f24633o;
        if (bVar != null) {
            s sVar = bVar.f24647a;
            if (sVar.f20090u == -1) {
                this.f24633o = new b(sVar.a().t0(p10.f19911a).Y(p10.f19912b).K(), bVar.f24648b, bVar.f24649c);
            }
        }
    }

    public void p0(C2282b.a aVar, int i10, long j10, long j11) {
        long j12;
        C2615C.b bVar = aVar.f24514d;
        if (bVar != null) {
            String c10 = this.f24620b.c(aVar.f24512b, (C2615C.b) C2076a.e(bVar));
            Long l10 = (Long) this.f24626h.get(c10);
            Long l11 = (Long) this.f24625g.get(c10);
            HashMap hashMap = this.f24626h;
            long j13 = 0;
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            hashMap.put(c10, Long.valueOf(j12 + j10));
            HashMap hashMap2 = this.f24625g;
            if (l11 != null) {
                j13 = l11.longValue();
            }
            hashMap2.put(c10, Long.valueOf(j13 + ((long) i10)));
        }
    }

    public void q0(C2282b.a aVar, C1964E.e eVar, C1964E.e eVar2, int i10) {
        if (i10 == 1) {
            this.f24639u = true;
        }
        this.f24629k = i10;
    }

    public void r(C2282b.a aVar, String str) {
        C2615C.b bVar = aVar.f24514d;
        if (bVar == null || !bVar.b()) {
            v0();
            this.f24627i = str;
            this.f24628j = N0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
            N0(aVar.f24512b, aVar.f24514d);
        }
    }

    public void u(C2282b.a aVar, k kVar) {
        this.f24642x += kVar.f23709g;
        this.f24643y += kVar.f23707e;
    }

    public void y(C2282b.a aVar, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
        this.f24640v = a10.f25952a;
    }

    public void c0(C2282b.a aVar, String str) {
    }

    public void l(C2282b.a aVar, String str, String str2) {
    }
}
