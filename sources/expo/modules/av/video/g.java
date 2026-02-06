package expo.modules.av.video;

import Hd.m;
import ae.C4464a;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.av.player.PlayerData;
import io.branch.rnbranch.RNBranchModule;
import lf.C6514M;

public class g extends FrameLayout implements m, c, PlayerData.d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f60352a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final PlayerData.g f60353b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final expo.modules.av.a f60354c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public VideoViewWrapper f60355d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public PlayerData f60356e = null;

    /* renamed from: f  reason: collision with root package name */
    private Nd.b f60357f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Kd.b f60358g = Kd.b.LEFT_TOP;

    /* renamed from: h  reason: collision with root package name */
    private boolean f60359h = false;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f60360i = null;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public e f60361j = null;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Pair f60362k = null;

    /* renamed from: l  reason: collision with root package name */
    private d f60363l = null;

    /* renamed from: m  reason: collision with root package name */
    private Bundle f60364m = new Bundle();

    /* renamed from: n  reason: collision with root package name */
    private b f60365n = null;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public f f60366o = null;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f60367p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f60368q = false;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public d f60369r = null;

    class a implements Runnable {
        a() {
        }

        public void run() {
            if (g.this.f60361j != null) {
                g.this.f60361j.v();
            }
        }
    }

    class b implements PlayerData.g {
        b() {
        }

        public void a(Bundle bundle) {
            g gVar = g.this;
            gVar.post(gVar.f60352a);
            g.this.f60355d.getOnStatusUpdate().invoke(bundle);
        }
    }

    class c implements PlayerData.c {
        c() {
        }

        public void a(String str) {
            g.this.O();
            g.this.y(str);
        }
    }

    class d implements PlayerData.h {
        d() {
        }

        public void a(Pair pair) {
            g.this.f60366o.b(pair, g.this.f60358g);
            g.this.f60362k = pair;
            g.this.z(pair);
        }
    }

    class e implements PlayerData.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Md.d f60374a;

        e(Md.d dVar) {
            this.f60374a = dVar;
        }

        public void a(String str) {
            if (g.this.f60369r != null) {
                g.this.f60369r.e(str);
                g.this.f60369r = null;
            }
            g.this.f60368q = false;
            g.this.O();
            Md.d dVar = this.f60374a;
            if (dVar != null) {
                dVar.reject("E_VIDEO_NOTCREATED", str);
            }
            g.this.y(str);
        }

        public void b(Bundle bundle) {
            g.this.f60367p = true;
            g.this.f60366o.b(g.this.f60356e.E0(), g.this.f60358g);
            if (g.this.f60366o.isAttachedToWindow()) {
                g.this.f60356e.X0(g.this.f60366o.getSurface());
            }
            if (this.f60374a != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putAll(bundle);
                this.f60374a.resolve(bundle2);
            }
            g.this.f60356e.Q0(g.this.f60353b);
            if (g.this.f60361j == null) {
                g.this.f60361j = new e(g.this.getContext());
            }
            g.this.f60361j.setMediaPlayer(new expo.modules.av.player.g(g.this.f60356e));
            g.this.f60361j.setAnchorView(g.this);
            g.this.G(false);
            g.this.f60355d.getOnLoad().invoke(bundle);
            if (g.this.f60369r != null) {
                d f10 = g.this.f60369r;
                g.this.f60369r = null;
                if (g.this.f60368q) {
                    g.this.D(f10);
                } else {
                    g.this.B(f10);
                }
            }
            g gVar = g.this;
            gVar.z(gVar.f60362k);
        }
    }

    public g(Context context, VideoViewWrapper videoViewWrapper, C4464a aVar) {
        super(context);
        this.f60355d = videoViewWrapper;
        expo.modules.av.a aVar2 = (expo.modules.av.a) aVar.p().b(expo.modules.av.a.class);
        this.f60354c = aVar2;
        aVar2.e(this);
        f fVar = new f(context, this);
        this.f60366o = fVar;
        addView(fVar, generateDefaultLayoutParams());
        b bVar = new b(context, this, aVar);
        this.f60365n = bVar;
        bVar.e(this);
        e eVar = new e(getContext());
        this.f60361j = eVar;
        eVar.setAnchorView(this);
        F();
    }

    private static boolean E(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size() || !bundle.keySet().containsAll(bundle2.keySet())) {
            return false;
        }
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            Object obj2 = bundle2.get(next);
            if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            } else if (!E((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
        }
        return true;
    }

    private void I(boolean z10, d dVar) {
        this.f60368q = z10;
        d dVar2 = this.f60369r;
        if (dVar2 != null) {
            dVar2.f();
        }
        this.f60369r = dVar;
    }

    private boolean L() {
        Boolean bool = this.f60360i;
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.f60359h;
    }

    private int getReactId() {
        return this.f60355d.getId();
    }

    private void x(a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("fullscreenUpdate", aVar.b());
        bundle.putBundle("status", getStatus());
        this.f60355d.getOnFullscreenUpdate().invoke(bundle);
    }

    /* access modifiers changed from: private */
    public void y(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, str);
        this.f60355d.getOnError().invoke(bundle);
    }

    /* access modifiers changed from: private */
    public void z(Pair pair) {
        String str;
        if (pair != null && this.f60367p) {
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            if (intValue != 0 && intValue2 != 0) {
                Bundle bundle = new Bundle();
                bundle.putInt(Snapshot.WIDTH, intValue);
                bundle.putInt(Snapshot.HEIGHT, intValue2);
                if (intValue > intValue2) {
                    str = "landscape";
                } else {
                    str = "portrait";
                }
                bundle.putString("orientation", str);
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("naturalSize", bundle);
                bundle2.putBundle("status", this.f60356e.C0());
                this.f60355d.getOnReadyForDisplay().invoke(bundle2);
            }
        }
    }

    public void A() {
        B((d) null);
    }

    public void B(d dVar) {
        if (!this.f60367p) {
            I(false, dVar);
        } else if (this.f60363l != null) {
            if (dVar != null) {
                dVar.g();
            }
        } else if (e()) {
            if (dVar != null) {
                this.f60363l = dVar;
            }
            this.f60365n.dismiss();
        } else if (dVar != null) {
            dVar.b();
        }
    }

    public void C() {
        D((d) null);
    }

    public void D(d dVar) {
        if (!this.f60367p) {
            I(true, dVar);
        } else if (this.f60363l != null) {
            if (dVar != null) {
                dVar.g();
            }
        } else if (!e()) {
            if (dVar != null) {
                this.f60363l = dVar;
            }
            this.f60365n.show();
        } else if (dVar != null) {
            dVar.a();
        }
    }

    public void F() {
        G(true);
    }

    public void G(boolean z10) {
        e eVar;
        if (this.f60356e != null && (eVar = this.f60361j) != null) {
            eVar.v();
            this.f60361j.setEnabled(L());
            if (!L() || !z10) {
                this.f60361j.n();
            } else {
                this.f60361j.s();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f60354c.u(this);
        O();
    }

    public void J(Nd.b bVar, Nd.b bVar2, Md.d dVar) {
        PlayerData playerData = this.f60356e;
        String str = null;
        if (playerData != null) {
            this.f60364m.putAll(playerData.C0());
            this.f60356e.release();
            this.f60356e = null;
            this.f60367p = false;
        }
        if (bVar2 != null) {
            this.f60364m.putAll(bVar2.e());
        }
        if (bVar != null) {
            str = bVar.getString("uri");
        }
        if (str != null) {
            this.f60355d.getOnLoadStart().invoke(C6514M.f71813a);
            Bundle bundle = new Bundle();
            bundle.putAll(this.f60364m);
            this.f60364m = new Bundle();
            PlayerData v02 = PlayerData.v0(this.f60354c, getContext(), bVar, bundle);
            this.f60356e = v02;
            v02.N0(new c());
            this.f60356e.S0(new d());
            this.f60356e.O0(this);
            this.f60356e.L0(bundle, new e(dVar));
        } else if (dVar != null) {
            dVar.resolve(PlayerData.D0());
        }
    }

    public void K(Nd.b bVar, Md.d dVar) {
        Bundle e10 = bVar.e();
        this.f60364m.putAll(e10);
        if (this.f60356e != null) {
            new Bundle().putAll(this.f60364m);
            this.f60364m = new Bundle();
            this.f60356e.P0(e10, dVar);
        } else if (dVar != null) {
            dVar.resolve(PlayerData.D0());
        }
    }

    public void M() {
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.M();
        }
    }

    public void N(Surface surface) {
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.X0(surface);
        }
    }

    public void O() {
        A();
        e eVar = this.f60361j;
        if (eVar != null) {
            eVar.n();
            this.f60361j.setEnabled(false);
            this.f60361j.setAnchorView((ViewGroup) null);
            this.f60361j = null;
        }
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.release();
            this.f60356e = null;
        }
        this.f60367p = false;
    }

    public void W() {
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.W();
        }
    }

    public void a() {
        e eVar = this.f60361j;
        if (eVar != null) {
            eVar.v();
        }
        x(a.FULLSCREEN_PLAYER_DID_PRESENT);
        d dVar = this.f60363l;
        if (dVar != null) {
            dVar.a();
            this.f60363l = null;
        }
    }

    public void b() {
        e eVar = this.f60361j;
        if (eVar != null) {
            eVar.v();
        }
        x(a.FULLSCREEN_PLAYER_DID_DISMISS);
        d dVar = this.f60363l;
        if (dVar != null) {
            dVar.b();
            this.f60363l = null;
        }
    }

    public void b0() {
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.b0();
        }
    }

    public void c() {
        x(a.FULLSCREEN_PLAYER_WILL_DISMISS);
        d dVar = this.f60363l;
        if (dVar != null) {
            dVar.c();
        }
    }

    public void d() {
        x(a.FULLSCREEN_PLAYER_WILL_PRESENT);
        d dVar = this.f60363l;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void d0() {
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.d0();
        }
    }

    public boolean e() {
        return this.f60365n.isShowing();
    }

    public Bundle getStatus() {
        PlayerData playerData = this.f60356e;
        if (playerData == null) {
            return PlayerData.D0();
        }
        return playerData.C0();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PlayerData playerData;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && (playerData = this.f60356e) != null) {
            this.f60366o.b(playerData.E0(), this.f60358g);
        }
    }

    public void onPause() {
        if (this.f60356e != null) {
            A();
            this.f60356e.onPause();
        }
    }

    public void onResume() {
        PlayerData playerData = this.f60356e;
        if (playerData != null) {
            playerData.onResume();
        }
        this.f60366o.a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar;
        if (L() && (eVar = this.f60361j) != null) {
            eVar.s();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFullscreenMode(boolean z10) {
        if (z10) {
            C();
        } else {
            A();
        }
    }

    /* access modifiers changed from: package-private */
    public void setOverridingUseNativeControls(Boolean bool) {
        this.f60360i = bool;
        F();
    }

    /* access modifiers changed from: package-private */
    public void setResizeMode(Kd.b bVar) {
        if (this.f60358g != bVar) {
            this.f60358g = bVar;
            PlayerData playerData = this.f60356e;
            if (playerData != null) {
                this.f60366o.b(playerData.E0(), this.f60358g);
            }
        }
    }

    public void setSource(Nd.b bVar) {
        Nd.b bVar2 = this.f60357f;
        if (bVar2 == null || !E(bVar2.e(), bVar.e())) {
            this.f60357f = bVar;
            J(bVar, (Nd.b) null, (Md.d) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void setUseNativeControls(boolean z10) {
        this.f60359h = z10;
        F();
    }

    public boolean w() {
        PlayerData playerData = this.f60356e;
        if (playerData == null || !playerData.w()) {
            return false;
        }
        return true;
    }
}
