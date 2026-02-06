package l9;

import C9.o;
import N9.C3065n;
import N9.C3068q;
import N9.C3070t;
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
import com.google.common.collect.C4770v;
import com.google.common.collect.g0;
import ia.K;
import ia.x;
import ia.y;
import ja.C3645a;
import ja.M;
import ja.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import k9.C3702j;
import k9.C3717q0;
import k9.C3732y0;
import k9.L0;
import k9.P0;
import k9.T0;
import k9.n1;
import k9.r;
import k9.s1;
import l9.C3748b;
import l9.r0;
import m9.s;
import n2.C0;
import n2.C2314r0;
import n2.K0;
import n2.N0;
import n2.Y0;
import n2.j1;
import n9.C3869e;
import o9.C3921h;
import o9.m;
import o9.n;

public final class q0 implements C3748b, r0.a {

    /* renamed from: A  reason: collision with root package name */
    private boolean f46307A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f46308a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f46309b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f46310c;

    /* renamed from: d  reason: collision with root package name */
    private final long f46311d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    private final n1.d f46312e = new n1.d();

    /* renamed from: f  reason: collision with root package name */
    private final n1.b f46313f = new n1.b();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f46314g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f46315h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private String f46316i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f46317j;

    /* renamed from: k  reason: collision with root package name */
    private int f46318k;

    /* renamed from: l  reason: collision with root package name */
    private int f46319l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f46320m = 0;

    /* renamed from: n  reason: collision with root package name */
    private P0 f46321n;

    /* renamed from: o  reason: collision with root package name */
    private b f46322o;

    /* renamed from: p  reason: collision with root package name */
    private b f46323p;

    /* renamed from: q  reason: collision with root package name */
    private b f46324q;

    /* renamed from: r  reason: collision with root package name */
    private C3717q0 f46325r;

    /* renamed from: s  reason: collision with root package name */
    private C3717q0 f46326s;

    /* renamed from: t  reason: collision with root package name */
    private C3717q0 f46327t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f46328u;

    /* renamed from: v  reason: collision with root package name */
    private int f46329v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f46330w;

    /* renamed from: x  reason: collision with root package name */
    private int f46331x;

    /* renamed from: y  reason: collision with root package name */
    private int f46332y;

    /* renamed from: z  reason: collision with root package name */
    private int f46333z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f46334a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46335b;

        public a(int i10, int i11) {
            this.f46334a = i10;
            this.f46335b = i11;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C3717q0 f46336a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46337b;

        /* renamed from: c  reason: collision with root package name */
        public final String f46338c;

        public b(C3717q0 q0Var, int i10, String str) {
            this.f46336a = q0Var;
            this.f46337b = i10;
            this.f46338c = str;
        }
    }

    private q0(Context context, PlaybackSession playbackSession) {
        this.f46308a = context.getApplicationContext();
        this.f46310c = playbackSession;
        p0 p0Var = new p0();
        this.f46309b = p0Var;
        p0Var.f(this);
    }

    private void A0() {
        long j10;
        long j11;
        int i10;
        PlaybackMetrics.Builder builder = this.f46317j;
        if (builder != null && this.f46307A) {
            PlaybackMetrics.Builder unused = builder.setAudioUnderrunCount(this.f46333z);
            PlaybackMetrics.Builder unused2 = this.f46317j.setVideoFramesDropped(this.f46331x);
            PlaybackMetrics.Builder unused3 = this.f46317j.setVideoFramesPlayed(this.f46332y);
            Long l10 = (Long) this.f46314g.get(this.f46316i);
            PlaybackMetrics.Builder builder2 = this.f46317j;
            if (l10 == null) {
                j10 = 0;
            } else {
                j10 = l10.longValue();
            }
            PlaybackMetrics.Builder unused4 = builder2.setNetworkTransferDurationMillis(j10);
            Long l11 = (Long) this.f46315h.get(this.f46316i);
            PlaybackMetrics.Builder builder3 = this.f46317j;
            if (l11 == null) {
                j11 = 0;
            } else {
                j11 = l11.longValue();
            }
            PlaybackMetrics.Builder unused5 = builder3.setNetworkBytesRead(j11);
            PlaybackMetrics.Builder builder4 = this.f46317j;
            if (l11 == null || l11.longValue() <= 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            PlaybackMetrics.Builder unused6 = builder4.setStreamSource(i10);
            this.f46310c.reportPlaybackMetrics(this.f46317j.build());
        }
        this.f46317j = null;
        this.f46316i = null;
        this.f46333z = 0;
        this.f46331x = 0;
        this.f46332y = 0;
        this.f46325r = null;
        this.f46326s = null;
        this.f46327t = null;
        this.f46307A = false;
    }

    private static int B0(int i10) {
        switch (M.V(i10)) {
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

    private static m C0(C4770v vVar) {
        m mVar;
        g0 m10 = vVar.iterator();
        while (m10.hasNext()) {
            s1.a aVar = (s1.a) m10.next();
            int i10 = 0;
            while (true) {
                if (i10 < aVar.f45829a) {
                    if (aVar.g(i10) && (mVar = aVar.c(i10).f45773o) != null) {
                        return mVar;
                    }
                    i10++;
                }
            }
        }
        return null;
    }

    private static int D0(m mVar) {
        for (int i10 = 0; i10 < mVar.f47521d; i10++) {
            UUID uuid = mVar.e(i10).f47523b;
            if (uuid.equals(C3702j.f45578d)) {
                return 3;
            }
            if (uuid.equals(C3702j.f45579e)) {
                return 2;
            }
            if (uuid.equals(C3702j.f45577c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a E0(P0 p02, Context context, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        if (p02.f45348a == 1001) {
            return new a(20, 0);
        }
        if (p02 instanceof r) {
            r rVar = (r) p02;
            if (rVar.f45816d == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            i10 = rVar.f45820h;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) C3645a.e(p02.getCause());
        if (th2 instanceof IOException) {
            if (th2 instanceof y.f) {
                return new a(5, ((y.f) th2).f44562d);
            }
            if ((th2 instanceof y.e) || (th2 instanceof L0)) {
                if (z10) {
                    i11 = 10;
                } else {
                    i11 = 11;
                }
                return new a(i11, 0);
            }
            boolean z12 = th2 instanceof y.d;
            if (z12 || (th2 instanceof K.a)) {
                if (z.d(context).f() == 1) {
                    return new a(3, 0);
                }
                Throwable cause = th2.getCause();
                if (cause instanceof UnknownHostException) {
                    return new a(6, 0);
                }
                if (cause instanceof SocketTimeoutException) {
                    return new a(7, 0);
                }
                if (!z12 || ((y.d) th2).f44560c != 1) {
                    return new a(8, 0);
                }
                return new a(4, 0);
            } else if (p02.f45348a == 1002) {
                return new a(21, 0);
            } else {
                if (th2 instanceof n.a) {
                    Throwable th3 = (Throwable) C3645a.e(th2.getCause());
                    int i12 = M.f44981a;
                    if (i12 >= 21 && (th3 instanceof MediaDrm.MediaDrmStateException)) {
                        int W10 = M.W(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
                        return new a(B0(W10), W10);
                    } else if (i12 >= 23 && (th3 instanceof MediaDrmResetException)) {
                        return new a(27, 0);
                    } else {
                        if (i12 >= 18 && (th3 instanceof NotProvisionedException)) {
                            return new a(24, 0);
                        }
                        if (i12 >= 18 && (th3 instanceof DeniedByServerException)) {
                            return new a(29, 0);
                        }
                        if (th3 instanceof o9.K) {
                            return new a(23, 0);
                        }
                        if (th3 instanceof C3921h.e) {
                            return new a(28, 0);
                        }
                        return new a(30, 0);
                    }
                } else if (!(th2 instanceof x.b) || !(th2.getCause() instanceof FileNotFoundException)) {
                    return new a(9, 0);
                } else {
                    Throwable cause2 = ((Throwable) C3645a.e(th2.getCause())).getCause();
                    if (M.f44981a < 21 || !(cause2 instanceof ErrnoException) || ((ErrnoException) cause2).errno != OsConstants.EACCES) {
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
            if (th2 instanceof o.b) {
                return new a(13, M.W(((o.b) th2).f30251d));
            }
            if (th2 instanceof C9.m) {
                return new a(14, M.W(((C9.m) th2).f30165b));
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof s.b) {
                return new a(17, ((s.b) th2).f46685a);
            }
            if (th2 instanceof s.e) {
                return new a(18, ((s.e) th2).f46690a);
            }
            if (M.f44981a < 16 || !(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(B0(errorCode), errorCode);
        }
    }

    private static Pair F0(String str) {
        String str2;
        String[] R02 = M.R0(str, "-");
        String str3 = R02[0];
        if (R02.length >= 2) {
            str2 = R02[1];
        } else {
            str2 = null;
        }
        return Pair.create(str3, str2);
    }

    private static int H0(Context context) {
        switch (z.d(context).f()) {
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

    private static int I0(C3732y0 y0Var) {
        C3732y0.h hVar = y0Var.f45856b;
        if (hVar == null) {
            return 0;
        }
        int r02 = M.r0(hVar.f45919a, hVar.f45920b);
        if (r02 == 0) {
            return 3;
        }
        if (r02 == 1) {
            return 5;
        }
        if (r02 != 2) {
            return 1;
        }
        return 4;
    }

    private static int J0(int i10) {
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

    private void K0(C3748b.C0694b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            C3748b.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f46309b.g(c10);
            } else if (b10 == 11) {
                this.f46309b.d(c10, this.f46318k);
            } else {
                this.f46309b.c(c10);
            }
        }
    }

    private void L0(long j10) {
        int H02 = H0(this.f46308a);
        if (H02 != this.f46320m) {
            this.f46320m = H02;
            this.f46310c.reportNetworkEvent(C0.a().setNetworkType(H02).setTimeSinceCreatedMillis(j10 - this.f46311d).build());
        }
    }

    private void M0(long j10) {
        boolean z10;
        P0 p02 = this.f46321n;
        if (p02 != null) {
            Context context = this.f46308a;
            if (this.f46329v == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            a E02 = E0(p02, context, z10);
            this.f46310c.reportPlaybackErrorEvent(Y0.a().setTimeSinceCreatedMillis(j10 - this.f46311d).setErrorCode(E02.f46334a).setSubErrorCode(E02.f46335b).setException(p02).build());
            this.f46307A = true;
            this.f46321n = null;
        }
    }

    private void N0(T0 t02, C3748b.C0694b bVar, long j10) {
        if (t02.k() != 2) {
            this.f46328u = false;
        }
        if (t02.i() == null) {
            this.f46330w = false;
        } else if (bVar.a(10)) {
            this.f46330w = true;
        }
        int V02 = V0(t02);
        if (this.f46319l != V02) {
            this.f46319l = V02;
            this.f46307A = true;
            this.f46310c.reportPlaybackStateEvent(j1.a().setState(this.f46319l).setTimeSinceCreatedMillis(j10 - this.f46311d).build());
        }
    }

    private void O0(T0 t02, C3748b.C0694b bVar, long j10) {
        if (bVar.a(2)) {
            s1 m10 = t02.m();
            boolean c10 = m10.c(2);
            boolean c11 = m10.c(1);
            boolean c12 = m10.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    T0(j10, (C3717q0) null, 0);
                }
                if (!c11) {
                    P0(j10, (C3717q0) null, 0);
                }
                if (!c12) {
                    R0(j10, (C3717q0) null, 0);
                }
            }
        }
        if (y0(this.f46322o)) {
            b bVar2 = this.f46322o;
            C3717q0 q0Var = bVar2.f46336a;
            if (q0Var.f45776r != -1) {
                T0(j10, q0Var, bVar2.f46337b);
                this.f46322o = null;
            }
        }
        if (y0(this.f46323p)) {
            b bVar3 = this.f46323p;
            P0(j10, bVar3.f46336a, bVar3.f46337b);
            this.f46323p = null;
        }
        if (y0(this.f46324q)) {
            b bVar4 = this.f46324q;
            R0(j10, bVar4.f46336a, bVar4.f46337b);
            this.f46324q = null;
        }
    }

    private void P0(long j10, C3717q0 q0Var, int i10) {
        if (!M.c(this.f46326s, q0Var)) {
            if (this.f46326s == null && i10 == 0) {
                i10 = 1;
            }
            this.f46326s = q0Var;
            U0(0, j10, q0Var, i10);
        }
    }

    private void Q0(T0 t02, C3748b.C0694b bVar) {
        m C02;
        if (bVar.a(0)) {
            C3748b.a c10 = bVar.c(0);
            if (this.f46317j != null) {
                S0(c10.f46203b, c10.f46205d);
            }
        }
        if (!(!bVar.a(2) || this.f46317j == null || (C02 = C0(t02.m().b())) == null)) {
            PlaybackMetrics.Builder unused = K0.a(M.j(this.f46317j)).setDrmType(D0(C02));
        }
        if (bVar.a(1011)) {
            this.f46333z++;
        }
    }

    private void R0(long j10, C3717q0 q0Var, int i10) {
        if (!M.c(this.f46327t, q0Var)) {
            if (this.f46327t == null && i10 == 0) {
                i10 = 1;
            }
            this.f46327t = q0Var;
            U0(2, j10, q0Var, i10);
        }
    }

    private void S0(n1 n1Var, C3070t.b bVar) {
        int f10;
        int i10;
        PlaybackMetrics.Builder builder = this.f46317j;
        if (bVar != null && (f10 = n1Var.f(bVar.f33285a)) != -1) {
            n1Var.j(f10, this.f46313f);
            n1Var.r(this.f46313f.f45715c, this.f46312e);
            PlaybackMetrics.Builder unused = builder.setStreamType(I0(this.f46312e.f45730c));
            n1.d dVar = this.f46312e;
            if (dVar.f45741n != -9223372036854775807L && !dVar.f45739l && !dVar.f45736i && !dVar.g()) {
                PlaybackMetrics.Builder unused2 = builder.setMediaDurationMillis(this.f46312e.f());
            }
            if (this.f46312e.g()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            PlaybackMetrics.Builder unused3 = builder.setPlaybackType(i10);
            this.f46307A = true;
        }
    }

    private void T0(long j10, C3717q0 q0Var, int i10) {
        if (!M.c(this.f46325r, q0Var)) {
            if (this.f46325r == null && i10 == 0) {
                i10 = 1;
            }
            this.f46325r = q0Var;
            U0(1, j10, q0Var, i10);
        }
    }

    private void U0(int i10, long j10, C3717q0 q0Var, int i11) {
        TrackChangeEvent.Builder a10 = C2314r0.a(i10).setTimeSinceCreatedMillis(j10 - this.f46311d);
        if (q0Var != null) {
            TrackChangeEvent.Builder unused = a10.setTrackState(1);
            TrackChangeEvent.Builder unused2 = a10.setTrackChangeReason(J0(i11));
            String str = q0Var.f45769k;
            if (str != null) {
                TrackChangeEvent.Builder unused3 = a10.setContainerMimeType(str);
            }
            String str2 = q0Var.f45770l;
            if (str2 != null) {
                TrackChangeEvent.Builder unused4 = a10.setSampleMimeType(str2);
            }
            String str3 = q0Var.f45767i;
            if (str3 != null) {
                TrackChangeEvent.Builder unused5 = a10.setCodecName(str3);
            }
            int i12 = q0Var.f45766h;
            if (i12 != -1) {
                TrackChangeEvent.Builder unused6 = a10.setBitrate(i12);
            }
            int i13 = q0Var.f45775q;
            if (i13 != -1) {
                TrackChangeEvent.Builder unused7 = a10.setWidth(i13);
            }
            int i14 = q0Var.f45776r;
            if (i14 != -1) {
                TrackChangeEvent.Builder unused8 = a10.setHeight(i14);
            }
            int i15 = q0Var.f45783y;
            if (i15 != -1) {
                TrackChangeEvent.Builder unused9 = a10.setChannelCount(i15);
            }
            int i16 = q0Var.f45784z;
            if (i16 != -1) {
                TrackChangeEvent.Builder unused10 = a10.setAudioSampleRate(i16);
            }
            String str4 = q0Var.f45761c;
            if (str4 != null) {
                Pair F02 = F0(str4);
                TrackChangeEvent.Builder unused11 = a10.setLanguage((String) F02.first);
                Object obj = F02.second;
                if (obj != null) {
                    TrackChangeEvent.Builder unused12 = a10.setLanguageRegion((String) obj);
                }
            }
            float f10 = q0Var.f45777s;
            if (f10 != -1.0f) {
                TrackChangeEvent.Builder unused13 = a10.setVideoFrameRate(f10);
            }
        } else {
            TrackChangeEvent.Builder unused14 = a10.setTrackState(0);
        }
        this.f46307A = true;
        this.f46310c.reportTrackChangeEvent(a10.build());
    }

    private int V0(T0 t02) {
        int k10 = t02.k();
        if (this.f46328u) {
            return 5;
        }
        if (this.f46330w) {
            return 13;
        }
        if (k10 == 4) {
            return 11;
        }
        if (k10 == 2) {
            int i10 = this.f46319l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (!t02.u()) {
                return 7;
            }
            if (t02.r() != 0) {
                return 10;
            }
            return 6;
        } else if (k10 == 3) {
            if (!t02.u()) {
                return 4;
            }
            if (t02.r() != 0) {
                return 9;
            }
            return 3;
        } else if (k10 != 1 || this.f46319l == 0) {
            return this.f46319l;
        } else {
            return 12;
        }
    }

    private boolean y0(b bVar) {
        if (bVar == null || !bVar.f46338c.equals(this.f46309b.a())) {
            return false;
        }
        return true;
    }

    public static q0 z0(Context context) {
        MediaMetricsManager a10 = n2.n1.a(context.getSystemService("media_metrics"));
        if (a10 == null) {
            return null;
        }
        return new q0(context, a10.createPlaybackSession());
    }

    public LogSessionId G0() {
        return this.f46310c.getSessionId();
    }

    public void M(C3748b.a aVar, ka.y yVar) {
        b bVar = this.f46322o;
        if (bVar != null) {
            C3717q0 q0Var = bVar.f46336a;
            if (q0Var.f45776r == -1) {
                this.f46322o = new b(q0Var.b().j0(yVar.f46097a).Q(yVar.f46098b).E(), bVar.f46337b, bVar.f46338c);
            }
        }
    }

    public void R(C3748b.a aVar, P0 p02) {
        this.f46321n = p02;
    }

    public void b0(C3748b.a aVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
        this.f46329v = qVar.f33278a;
    }

    public void k0(C3748b.a aVar, String str) {
        C3070t.b bVar = aVar.f46205d;
        if (bVar == null || !bVar.b()) {
            A0();
            this.f46316i = str;
            this.f46317j = N0.a().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            S0(aVar.f46203b, aVar.f46205d);
        }
    }

    public void o0(C3748b.a aVar, int i10, long j10, long j11) {
        long j12;
        C3070t.b bVar = aVar.f46205d;
        if (bVar != null) {
            String e10 = this.f46309b.e(aVar.f46203b, (C3070t.b) C3645a.e(bVar));
            Long l10 = (Long) this.f46315h.get(e10);
            Long l11 = (Long) this.f46314g.get(e10);
            HashMap hashMap = this.f46315h;
            long j13 = 0;
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            hashMap.put(e10, Long.valueOf(j12 + j10));
            HashMap hashMap2 = this.f46314g;
            if (l11 != null) {
                j13 = l11.longValue();
            }
            hashMap2.put(e10, Long.valueOf(j13 + ((long) i10)));
        }
    }

    public void r0(C3748b.a aVar, C3869e eVar) {
        this.f46331x += eVar.f46943g;
        this.f46332y += eVar.f46941e;
    }

    public void s0(C3748b.a aVar, T0.e eVar, T0.e eVar2, int i10) {
        if (i10 == 1) {
            this.f46328u = true;
        }
        this.f46318k = i10;
    }

    public void u(T0 t02, C3748b.C0694b bVar) {
        if (bVar.d() != 0) {
            K0(bVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Q0(t02, bVar);
            M0(elapsedRealtime);
            O0(t02, bVar, elapsedRealtime);
            L0(elapsedRealtime);
            N0(t02, bVar, elapsedRealtime);
            if (bVar.a(1028)) {
                this.f46309b.b(bVar.c(1028));
            }
        }
    }

    public void v0(C3748b.a aVar, C3068q qVar) {
        if (aVar.f46205d != null) {
            b bVar = new b((C3717q0) C3645a.e(qVar.f33280c), qVar.f33281d, this.f46309b.e(aVar.f46203b, (C3070t.b) C3645a.e(aVar.f46205d)));
            int i10 = qVar.f33279b;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f46323p = bVar;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.f46324q = bVar;
                        return;
                    }
                    return;
                }
            }
            this.f46322o = bVar;
        }
    }

    public void w(C3748b.a aVar, String str, boolean z10) {
        C3070t.b bVar = aVar.f46205d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f46316i)) {
            A0();
        }
        this.f46314g.remove(str);
        this.f46315h.remove(str);
    }

    public void U(C3748b.a aVar, String str) {
    }

    public void F(C3748b.a aVar, String str, String str2) {
    }
}
