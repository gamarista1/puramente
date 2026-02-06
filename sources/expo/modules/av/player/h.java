package expo.modules.av.player;

import Id.b;
import Md.d;
import N9.A;
import N9.C3065n;
import N9.C3068q;
import N9.C3070t;
import N9.H;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import expo.modules.av.a;
import expo.modules.av.player.PlayerData;
import ga.C3564a;
import ga.m;
import ia.C3612j;
import ia.E;
import ia.n;
import ia.q;
import ja.M;
import java.io.IOException;
import java.util.Map;
import k9.C3732y0;
import k9.P0;
import k9.S0;
import k9.T0;
import k9.f1;
import ka.y;

class h extends PlayerData implements T0.d, A {

    /* renamed from: A  reason: collision with root package name */
    private static final String f60286A = "h";

    /* renamed from: r  reason: collision with root package name */
    private f1 f60287r = null;

    /* renamed from: s  reason: collision with root package name */
    private final String f60288s;

    /* renamed from: t  reason: collision with root package name */
    private PlayerData.e f60289t = null;

    /* renamed from: u  reason: collision with root package name */
    private boolean f60290u = false;

    /* renamed from: v  reason: collision with root package name */
    private Pair f60291v = null;

    /* renamed from: w  reason: collision with root package name */
    private Integer f60292w = null;

    /* renamed from: x  reason: collision with root package name */
    private boolean f60293x = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f60294y = true;

    /* renamed from: z  reason: collision with root package name */
    private final Context f60295z;

    h(a aVar, Context context, Uri uri, String str, Map map) {
        super(aVar, uri, map);
        this.f60295z = context;
        this.f60288s = str;
    }

    private C3070t Y0(Uri uri, String str, C3612j.a aVar) {
        String str2;
        try {
            if (uri.getScheme() == null) {
                n nVar = new n(E.buildRawResourceUri(this.f60295z.getResources().getIdentifier(uri.toString(), "raw", this.f60295z.getPackageName())));
                E e10 = new E(this.f60295z);
                e10.m(nVar);
                uri = e10.getUri();
            }
        } catch (Exception e11) {
            Log.e(f60286A, "Error reading raw resource from ExoPlayer", e11);
        }
        if (TextUtils.isEmpty(str)) {
            str2 = String.valueOf(uri);
        } else {
            str2 = "." + str;
        }
        int p02 = M.p0(str2);
        if (p02 == 0) {
            return new DashMediaSource.Factory(new c.a(aVar), aVar).a(C3732y0.d(uri));
        }
        if (p02 == 1) {
            return new SsMediaSource.Factory(new a.C0661a(aVar), aVar).a(C3732y0.d(uri));
        }
        if (p02 == 2) {
            return new HlsMediaSource.Factory(aVar).a(C3732y0.d(uri));
        }
        if (p02 == 4) {
            return new H.b(aVar).b(C3732y0.d(uri));
        }
        throw new IllegalStateException("Content of this type is unsupported at the moment. Unsupported type: " + p02);
    }

    private void Z0(Throwable th2) {
        PlayerData.e eVar = this.f60289t;
        if (eVar != null) {
            this.f60289t = null;
            eVar.a(th2.toString());
        } else {
            PlayerData.c cVar = this.f60254i;
            if (cVar != null) {
                cVar.a("Player error: " + th2.getMessage());
            }
        }
        release();
    }

    /* access modifiers changed from: package-private */
    public void A0(Bundle bundle) {
        boolean z10;
        int C10 = (int) this.f60287r.C();
        bundle.putInt("durationMillis", C10);
        boolean z11 = false;
        bundle.putInt("positionMillis", y0(Integer.valueOf((int) this.f60287r.getCurrentPosition()), 0, Integer.valueOf(C10)));
        bundle.putInt("playableDurationMillis", y0(Integer.valueOf((int) this.f60287r.y()), 0, Integer.valueOf(C10)));
        if (!this.f60287r.u() || this.f60287r.k() != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        bundle.putBoolean("isPlaying", z10);
        if (this.f60294y || this.f60287r.k() == 2) {
            z11 = true;
        }
        bundle.putBoolean("isBuffering", z11);
        bundle.putBoolean("isLooping", this.f60293x);
    }

    /* access modifiers changed from: package-private */
    public String B0() {
        return "SimpleExoPlayer";
    }

    public void E(int i10) {
        if (i10 == 0) {
            t0();
        }
    }

    public Pair E0() {
        Pair pair = this.f60291v;
        if (pair != null) {
            return pair;
        }
        return new Pair(0, 0);
    }

    /* access modifiers changed from: package-private */
    public boolean F0() {
        if (this.f60287r != null) {
            return true;
        }
        return false;
    }

    public void H(boolean z10, int i10) {
        PlayerData.e eVar;
        if (i10 == 3 && (eVar = this.f60289t) != null) {
            this.f60289t = null;
            eVar.b(C0());
        }
        Integer num = this.f60292w;
        if (num == null || i10 == num.intValue() || i10 != 4) {
            s0();
            if (z10 && i10 == 3) {
                r0();
            }
        } else {
            t0();
            V0();
        }
        this.f60292w = Integer.valueOf(i10);
    }

    public void L0(Bundle bundle, PlayerData.e eVar) {
        this.f60289t = eVar;
        Context context = this.f60246a.getContext();
        q a10 = new q.b(context).a();
        f1 a11 = new f1.a(context).d(new m(context, new C3564a.b())).b(a10).c(Looper.getMainLooper()).a();
        this.f60287r = a11;
        a11.f(this);
        try {
            this.f60287r.G(Y0(this.f60247b, this.f60288s, ((b) this.f60246a.m().b(b.class)).a(this.f60295z, this.f60246a.m(), M.m0(context, "yourApplicationName"), this.f60248c, a10.a())));
            P0(bundle, (d) null);
        } catch (IllegalStateException e10) {
            Z0(e10);
        }
    }

    public void M() {
        f1 f1Var = this.f60287r;
        if (f1Var != null) {
            f1Var.M(this.f60246a.E(this.f60262q, this.f60260o));
        }
    }

    /* access modifiers changed from: package-private */
    public void M0() {
        float f10;
        if (this.f60287r != null && U0()) {
            if (!this.f60262q) {
                this.f60246a.x();
            }
            M();
            f1 f1Var = this.f60287r;
            float f11 = this.f60258m;
            if (this.f60259n) {
                f10 = 1.0f;
            } else {
                f10 = f11;
            }
            f1Var.J(new S0(f11, f10));
            this.f60287r.I(this.f60257l);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean T0() {
        f1 f1Var = this.f60287r;
        if (f1Var == null || !f1Var.u()) {
            return false;
        }
        return true;
    }

    public void X0(Surface surface) {
        f1 f1Var = this.f60287r;
        if (f1Var != null) {
            f1Var.L(surface);
        }
    }

    public void a0(P0 p02) {
        Z0(p02.getCause());
    }

    public void b0() {
        f1 f1Var = this.f60287r;
        if (f1Var != null) {
            f1Var.I(false);
        }
        V0();
    }

    public void h0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
        PlayerData.e eVar = this.f60289t;
        if (eVar != null) {
            this.f60289t = null;
            eVar.a(iOException.toString());
        }
    }

    public void p(y yVar) {
        PlayerData.h hVar;
        Pair pair = new Pair(Integer.valueOf(yVar.f46097a), Integer.valueOf(yVar.f46098b));
        this.f60291v = pair;
        if (this.f60290u && (hVar = this.f60255j) != null) {
            hVar.a(pair);
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(Integer num, Boolean bool) {
        if (this.f60287r != null) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.f60293x = booleanValue;
                if (booleanValue) {
                    this.f60287r.K(2);
                } else {
                    this.f60287r.K(0);
                }
            }
            if (!U0()) {
                this.f60287r.I(false);
                V0();
            }
            M();
            if (num != null) {
                this.f60287r.e((long) num.intValue());
            }
            M0();
            return;
        }
        throw new IllegalStateException("mSimpleExoPlayer is null!");
    }

    public void r(int i10) {
    }

    public synchronized void release() {
        super.release();
        V0();
        f1 f1Var = this.f60287r;
        if (f1Var != null) {
            f1Var.H();
            this.f60287r = null;
        }
    }

    public void t(boolean z10) {
        this.f60294y = z10;
        s0();
    }

    public boolean w() {
        f1 f1Var = this.f60287r;
        if (f1Var == null || ((!f1Var.u() && !U0()) || this.f60262q)) {
            return false;
        }
        return true;
    }

    public int x0() {
        f1 f1Var = this.f60287r;
        if (f1Var != null) {
            return f1Var.l();
        }
        return 0;
    }

    public void z() {
        Pair pair;
        PlayerData.h hVar;
        if (!(this.f60290u || (pair = this.f60291v) == null || (hVar = this.f60255j) == null)) {
            hVar.a(pair);
        }
        this.f60290u = true;
    }

    /* access modifiers changed from: protected */
    public double z0() {
        return -1.0d;
    }

    public void o(S0 s02) {
    }

    public void P(int i10, C3070t.b bVar, C3068q qVar) {
    }

    public void n0(int i10, C3070t.b bVar, C3068q qVar) {
    }

    public void V(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
    }

    public void c0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
    }

    public void g0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar) {
    }
}
