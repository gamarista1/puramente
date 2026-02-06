package i3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.C4770v;
import f2.C1964E;
import f2.H;
import f2.I;
import f2.J;
import f2.K;
import f2.L;
import f2.s;
import f2.x;
import i2.C2074B;
import i2.C2076a;
import i2.L;
import i3.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: i3.j  reason: case insensitive filesystem */
public class C2099j extends FrameLayout {

    /* renamed from: T0  reason: collision with root package name */
    private static final float[] f22481T0 = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final View f22482A;

    /* renamed from: A0  reason: collision with root package name */
    private final String f22483A0;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final View f22484B;

    /* renamed from: B0  reason: collision with root package name */
    private final String f22485B0;

    /* renamed from: C  reason: collision with root package name */
    private final TextView f22486C;
    /* access modifiers changed from: private */

    /* renamed from: C0  reason: collision with root package name */
    public C1964E f22487C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final TextView f22488D;

    /* renamed from: D0  reason: collision with root package name */
    private d f22489D0;

    /* renamed from: E  reason: collision with root package name */
    private final d0 f22490E;

    /* renamed from: E0  reason: collision with root package name */
    private boolean f22491E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final StringBuilder f22492F;

    /* renamed from: F0  reason: collision with root package name */
    private boolean f22493F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final Formatter f22494G;

    /* renamed from: G0  reason: collision with root package name */
    private boolean f22495G0;

    /* renamed from: H  reason: collision with root package name */
    private final H.b f22496H;
    /* access modifiers changed from: private */

    /* renamed from: H0  reason: collision with root package name */
    public boolean f22497H0 = true;

    /* renamed from: I  reason: collision with root package name */
    private final H.c f22498I;

    /* renamed from: I0  reason: collision with root package name */
    private boolean f22499I0;
    /* access modifiers changed from: private */

    /* renamed from: J0  reason: collision with root package name */
    public boolean f22500J0;

    /* renamed from: K0  reason: collision with root package name */
    private int f22501K0 = 5000;

    /* renamed from: L0  reason: collision with root package name */
    private int f22502L0 = 200;
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public int f22503M0 = 0;

    /* renamed from: N0  reason: collision with root package name */
    private long[] f22504N0;

    /* renamed from: O0  reason: collision with root package name */
    private boolean[] f22505O0;

    /* renamed from: P0  reason: collision with root package name */
    private long[] f22506P0;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean[] f22507Q0;

    /* renamed from: R0  reason: collision with root package name */
    private long f22508R0;
    /* access modifiers changed from: private */

    /* renamed from: S0  reason: collision with root package name */
    public boolean f22509S0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C f22510a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f22511b;

    /* renamed from: c  reason: collision with root package name */
    private final c f22512c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArrayList f22513d;

    /* renamed from: e  reason: collision with root package name */
    private final RecyclerView f22514e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final h f22515f;

    /* renamed from: f0  reason: collision with root package name */
    private final Runnable f22516f0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final e f22517g;

    /* renamed from: g0  reason: collision with root package name */
    private final Drawable f22518g0;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C0360j f22519h;

    /* renamed from: h0  reason: collision with root package name */
    private final Drawable f22520h0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b f22521i;

    /* renamed from: i0  reason: collision with root package name */
    private final Drawable f22522i0;

    /* renamed from: j  reason: collision with root package name */
    private final e0 f22523j;

    /* renamed from: j0  reason: collision with root package name */
    private final Drawable f22524j0;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final PopupWindow f22525k;

    /* renamed from: k0  reason: collision with root package name */
    private final Drawable f22526k0;

    /* renamed from: l  reason: collision with root package name */
    private final int f22527l;

    /* renamed from: l0  reason: collision with root package name */
    private final String f22528l0;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f22529m;

    /* renamed from: m0  reason: collision with root package name */
    private final String f22530m0;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f22531n;

    /* renamed from: n0  reason: collision with root package name */
    private final String f22532n0;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f22533o;

    /* renamed from: o0  reason: collision with root package name */
    private final Drawable f22534o0;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final View f22535p;

    /* renamed from: p0  reason: collision with root package name */
    private final Drawable f22536p0;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final View f22537q;

    /* renamed from: q0  reason: collision with root package name */
    private final float f22538q0;

    /* renamed from: r  reason: collision with root package name */
    private final TextView f22539r;

    /* renamed from: r0  reason: collision with root package name */
    private final float f22540r0;

    /* renamed from: s  reason: collision with root package name */
    private final TextView f22541s;

    /* renamed from: s0  reason: collision with root package name */
    private final String f22542s0;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f22543t;

    /* renamed from: t0  reason: collision with root package name */
    private final String f22544t0;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f22545u;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public final Drawable f22546u0;

    /* renamed from: v  reason: collision with root package name */
    private final ImageView f22547v;
    /* access modifiers changed from: private */

    /* renamed from: v0  reason: collision with root package name */
    public final Drawable f22548v0;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f22549w;
    /* access modifiers changed from: private */

    /* renamed from: w0  reason: collision with root package name */
    public final String f22550w0;

    /* renamed from: x  reason: collision with root package name */
    private final ImageView f22551x;
    /* access modifiers changed from: private */

    /* renamed from: x0  reason: collision with root package name */
    public final String f22552x0;

    /* renamed from: y  reason: collision with root package name */
    private final ImageView f22553y;

    /* renamed from: y0  reason: collision with root package name */
    private final Drawable f22554y0;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final View f22555z;

    /* renamed from: z0  reason: collision with root package name */
    private final Drawable f22556z0;

    /* renamed from: i3.j$b */
    private final class b extends l {
        private b() {
            super();
        }

        private boolean H(K k10) {
            for (int i10 = 0; i10 < this.f22577d.size(); i10++) {
                if (k10.f19827A.containsKey(((k) this.f22577d.get(i10)).f22574a.a())) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void J(View view) {
            if (C2099j.this.f22487C0 != null && C2099j.this.f22487C0.L(29)) {
                ((C1964E) L.h(C2099j.this.f22487C0)).Y(C2099j.this.f22487C0.N().a().D(1).J(1, false).C());
                C2099j.this.f22515f.C(1, C2099j.this.getResources().getString(Z.f22360w));
                C2099j.this.f22525k.dismiss();
            }
        }

        public void D(i iVar) {
            int i10;
            iVar.f22571u.setText(Z.f22360w);
            boolean H10 = H(((C1964E) C2076a.e(C2099j.this.f22487C0)).N());
            View view = iVar.f22572v;
            if (H10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view.setVisibility(i10);
            iVar.f18066a.setOnClickListener(new C2100k(this));
        }

        public void F(String str) {
            C2099j.this.f22515f.C(1, str);
        }

        public void I(List list) {
            this.f22577d = list;
            K N10 = ((C1964E) C2076a.e(C2099j.this.f22487C0)).N();
            if (list.isEmpty()) {
                C2099j.this.f22515f.C(1, C2099j.this.getResources().getString(Z.f22361x));
            } else if (!H(N10)) {
                C2099j.this.f22515f.C(1, C2099j.this.getResources().getString(Z.f22360w));
            } else {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    k kVar = (k) list.get(i10);
                    if (kVar.a()) {
                        C2099j.this.f22515f.C(1, kVar.f22576c);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: i3.j$c */
    private final class c implements C1964E.d, d0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        public void O(d0 d0Var, long j10) {
            boolean unused = C2099j.this.f22500J0 = true;
            if (C2099j.this.f22488D != null) {
                C2099j.this.f22488D.setText(L.k0(C2099j.this.f22492F, C2099j.this.f22494G, j10));
            }
            C2099j.this.f22510a.V();
        }

        public void T(d0 d0Var, long j10, boolean z10) {
            boolean unused = C2099j.this.f22500J0 = false;
            if (!z10 && C2099j.this.f22487C0 != null) {
                C2099j jVar = C2099j.this;
                jVar.l0(jVar.f22487C0, j10);
            }
            C2099j.this.f22510a.W();
        }

        public void h0(C1964E e10, C1964E.c cVar) {
            if (cVar.a(4, 5, 13)) {
                C2099j.this.u0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                C2099j.this.w0();
            }
            if (cVar.a(8, 13)) {
                C2099j.this.x0();
            }
            if (cVar.a(9, 13)) {
                C2099j.this.B0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                C2099j.this.t0();
            }
            if (cVar.a(11, 0, 13)) {
                C2099j.this.C0();
            }
            if (cVar.a(12, 13)) {
                C2099j.this.v0();
            }
            if (cVar.a(2, 13)) {
                C2099j.this.D0();
            }
        }

        public void onClick(View view) {
            C1964E j10 = C2099j.this.f22487C0;
            if (j10 != null) {
                C2099j.this.f22510a.W();
                if (C2099j.this.f22531n == view) {
                    if (j10.L(9)) {
                        j10.O();
                    }
                } else if (C2099j.this.f22529m == view) {
                    if (j10.L(7)) {
                        j10.J();
                    }
                } else if (C2099j.this.f22535p == view) {
                    if (j10.k() != 4 && j10.L(12)) {
                        j10.b0();
                    }
                } else if (C2099j.this.f22537q == view) {
                    if (j10.L(11)) {
                        j10.c0();
                    }
                } else if (C2099j.this.f22533o == view) {
                    L.t0(j10, C2099j.this.f22497H0);
                } else if (C2099j.this.f22543t == view) {
                    if (j10.L(15)) {
                        j10.C(C2074B.a(j10.n(), C2099j.this.f22503M0));
                    }
                } else if (C2099j.this.f22545u == view) {
                    if (j10.L(14)) {
                        j10.R(!j10.D());
                    }
                } else if (C2099j.this.f22555z == view) {
                    C2099j.this.f22510a.V();
                    C2099j jVar = C2099j.this;
                    jVar.V(jVar.f22515f, C2099j.this.f22555z);
                } else if (C2099j.this.f22482A == view) {
                    C2099j.this.f22510a.V();
                    C2099j jVar2 = C2099j.this;
                    jVar2.V(jVar2.f22517g, C2099j.this.f22482A);
                } else if (C2099j.this.f22484B == view) {
                    C2099j.this.f22510a.V();
                    C2099j jVar3 = C2099j.this;
                    jVar3.V(jVar3.f22521i, C2099j.this.f22484B);
                } else if (C2099j.this.f22549w == view) {
                    C2099j.this.f22510a.V();
                    C2099j jVar4 = C2099j.this;
                    jVar4.V(jVar4.f22519h, C2099j.this.f22549w);
                }
            }
        }

        public void onDismiss() {
            if (C2099j.this.f22509S0) {
                C2099j.this.f22510a.W();
            }
        }

        public void w(d0 d0Var, long j10) {
            if (C2099j.this.f22488D != null) {
                C2099j.this.f22488D.setText(L.k0(C2099j.this.f22492F, C2099j.this.f22494G, j10));
            }
        }
    }

    /* renamed from: i3.j$d */
    public interface d {
        void O(boolean z10);
    }

    /* renamed from: i3.j$e */
    private final class e extends RecyclerView.h {

        /* renamed from: d  reason: collision with root package name */
        private final String[] f22559d;

        /* renamed from: e  reason: collision with root package name */
        private final float[] f22560e;

        /* renamed from: f  reason: collision with root package name */
        private int f22561f;

        public e(String[] strArr, float[] fArr) {
            this.f22559d = strArr;
            this.f22560e = fArr;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void B(int i10, View view) {
            if (i10 != this.f22561f) {
                C2099j.this.setPlaybackSpeed(this.f22560e[i10]);
            }
            C2099j.this.f22525k.dismiss();
        }

        public String A() {
            return this.f22559d[this.f22561f];
        }

        /* renamed from: C */
        public void o(i iVar, int i10) {
            String[] strArr = this.f22559d;
            if (i10 < strArr.length) {
                iVar.f22571u.setText(strArr[i10]);
            }
            if (i10 == this.f22561f) {
                iVar.f18066a.setSelected(true);
                iVar.f22572v.setVisibility(0);
            } else {
                iVar.f18066a.setSelected(false);
                iVar.f22572v.setVisibility(4);
            }
            iVar.f18066a.setOnClickListener(new C2101l(this, i10));
        }

        /* renamed from: D */
        public i q(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2099j.this.getContext()).inflate(X.f22330e, viewGroup, false));
        }

        public void E(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f22560e;
                if (i10 < fArr.length) {
                    float abs = Math.abs(f10 - fArr[i10]);
                    if (abs < f11) {
                        i11 = i10;
                        f11 = abs;
                    }
                    i10++;
                } else {
                    this.f22561f = i11;
                    return;
                }
            }
        }

        public int e() {
            return this.f22559d.length;
        }
    }

    /* renamed from: i3.j$f */
    public interface f {
    }

    /* renamed from: i3.j$g */
    private final class g extends RecyclerView.F {
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public final TextView f22563u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public final TextView f22564v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public final ImageView f22565w;

        public g(View view) {
            super(view);
            if (L.f22072a < 26) {
                view.setFocusable(true);
            }
            this.f22563u = (TextView) view.findViewById(V.f22319v);
            this.f22564v = (TextView) view.findViewById(V.f22292O);
            this.f22565w = (ImageView) view.findViewById(V.f22317t);
            view.setOnClickListener(new C2102m(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void R(View view) {
            C2099j.this.i0(k());
        }
    }

    /* renamed from: i3.j$h */
    private class h extends RecyclerView.h {

        /* renamed from: d  reason: collision with root package name */
        private final String[] f22567d;

        /* renamed from: e  reason: collision with root package name */
        private final String[] f22568e;

        /* renamed from: f  reason: collision with root package name */
        private final Drawable[] f22569f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f22567d = strArr;
            this.f22568e = new String[strArr.length];
            this.f22569f = drawableArr;
        }

        private boolean D(int i10) {
            if (C2099j.this.f22487C0 == null) {
                return false;
            }
            if (i10 == 0) {
                return C2099j.this.f22487C0.L(13);
            }
            if (i10 != 1) {
                return true;
            }
            if (!C2099j.this.f22487C0.L(30) || !C2099j.this.f22487C0.L(29)) {
                return false;
            }
            return true;
        }

        /* renamed from: A */
        public void o(g gVar, int i10) {
            if (D(i10)) {
                gVar.f18066a.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.f18066a.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f22563u.setText(this.f22567d[i10]);
            if (this.f22568e[i10] == null) {
                gVar.f22564v.setVisibility(8);
            } else {
                gVar.f22564v.setText(this.f22568e[i10]);
            }
            if (this.f22569f[i10] == null) {
                gVar.f22565w.setVisibility(8);
            } else {
                gVar.f22565w.setImageDrawable(this.f22569f[i10]);
            }
        }

        /* renamed from: B */
        public g q(ViewGroup viewGroup, int i10) {
            return new g(LayoutInflater.from(C2099j.this.getContext()).inflate(X.f22329d, viewGroup, false));
        }

        public void C(int i10, String str) {
            this.f22568e[i10] = str;
        }

        public int e() {
            return this.f22567d.length;
        }

        public long f(int i10) {
            return (long) i10;
        }

        public boolean z() {
            if (D(1) || D(0)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i3.j$i */
    private static class i extends RecyclerView.F {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f22571u;

        /* renamed from: v  reason: collision with root package name */
        public final View f22572v;

        public i(View view) {
            super(view);
            if (L.f22072a < 26) {
                view.setFocusable(true);
            }
            this.f22571u = (TextView) view.findViewById(V.f22295R);
            this.f22572v = view.findViewById(V.f22305h);
        }
    }

    /* renamed from: i3.j$k */
    private static final class k {

        /* renamed from: a  reason: collision with root package name */
        public final L.a f22574a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22575b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22576c;

        public k(f2.L l10, int i10, int i11, String str) {
            this.f22574a = (L.a) l10.a().get(i10);
            this.f22575b = i11;
            this.f22576c = str;
        }

        public boolean a() {
            return this.f22574a.f(this.f22575b);
        }
    }

    /* renamed from: i3.j$l */
    private abstract class l extends RecyclerView.h {

        /* renamed from: d  reason: collision with root package name */
        protected List f22577d = new ArrayList();

        protected l() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void B(C1964E e10, I i10, k kVar, View view) {
            if (e10.L(29)) {
                e10.Y(e10.N().a().H(new J(i10, C4770v.H(Integer.valueOf(kVar.f22575b)))).J(kVar.f22574a.c(), false).C());
                F(kVar.f22576c);
                C2099j.this.f22525k.dismiss();
            }
        }

        /* access modifiers changed from: protected */
        public void A() {
            this.f22577d = Collections.emptyList();
        }

        /* renamed from: C */
        public void o(i iVar, int i10) {
            C1964E j10 = C2099j.this.f22487C0;
            if (j10 != null) {
                if (i10 == 0) {
                    D(iVar);
                    return;
                }
                boolean z10 = true;
                k kVar = (k) this.f22577d.get(i10 - 1);
                I a10 = kVar.f22574a.a();
                int i11 = 0;
                if (j10.N().f19827A.get(a10) == null || !kVar.a()) {
                    z10 = false;
                }
                iVar.f22571u.setText(kVar.f22576c);
                View view = iVar.f22572v;
                if (!z10) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                iVar.f18066a.setOnClickListener(new C2104o(this, j10, a10, kVar));
            }
        }

        /* access modifiers changed from: protected */
        public abstract void D(i iVar);

        /* renamed from: E */
        public i q(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2099j.this.getContext()).inflate(X.f22330e, viewGroup, false));
        }

        /* access modifiers changed from: protected */
        public abstract void F(String str);

        public int e() {
            if (this.f22577d.isEmpty()) {
                return 0;
            }
            return this.f22577d.size() + 1;
        }
    }

    /* renamed from: i3.j$m */
    public interface m {
        void w(int i10);
    }

    static {
        x.a("media3.ui");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2099j(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i21;
        int i22;
        int i23;
        C2099j jVar;
        int i24;
        int i25;
        int i26;
        int i27;
        ImageView imageView;
        c cVar;
        int i28;
        boolean z18;
        boolean z19;
        int i29;
        int i30;
        C2099j jVar2;
        boolean z20;
        boolean z21;
        Context context2 = context;
        AttributeSet attributeSet3 = attributeSet2;
        int i31 = X.f22326a;
        int i32 = T.f22264g;
        int i33 = T.f22263f;
        int i34 = T.f22262e;
        int i35 = T.f22271n;
        int i36 = T.f22265h;
        int i37 = T.f22272o;
        int i38 = T.f22261d;
        int i39 = T.f22260c;
        int i40 = T.f22267j;
        int i41 = T.f22268k;
        int i42 = T.f22266i;
        int i43 = T.f22270m;
        int i44 = T.f22269l;
        int i45 = T.f22275r;
        int i46 = T.f22274q;
        int i47 = T.f22276s;
        if (attributeSet3 != null) {
            int i48 = i42;
            int i49 = i43;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, b0.f22431x, i10, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(b0.f22433z, i31);
                int resourceId2 = obtainStyledAttributes.getResourceId(b0.f22370F, i32);
                int resourceId3 = obtainStyledAttributes.getResourceId(b0.f22369E, i33);
                int resourceId4 = obtainStyledAttributes.getResourceId(b0.f22368D, i34);
                int resourceId5 = obtainStyledAttributes.getResourceId(b0.f22365A, i35);
                int resourceId6 = obtainStyledAttributes.getResourceId(b0.f22371G, i36);
                int resourceId7 = obtainStyledAttributes.getResourceId(b0.f22376L, i37);
                int resourceId8 = obtainStyledAttributes.getResourceId(b0.f22367C, i38);
                int resourceId9 = obtainStyledAttributes.getResourceId(b0.f22366B, i39);
                int resourceId10 = obtainStyledAttributes.getResourceId(b0.f22373I, i40);
                int resourceId11 = obtainStyledAttributes.getResourceId(b0.f22374J, i41);
                int resourceId12 = obtainStyledAttributes.getResourceId(b0.f22372H, i48);
                int resourceId13 = obtainStyledAttributes.getResourceId(b0.f22386V, i49);
                int i50 = resourceId;
                int resourceId14 = obtainStyledAttributes.getResourceId(b0.f22385U, i44);
                int resourceId15 = obtainStyledAttributes.getResourceId(b0.f22388X, i45);
                int resourceId16 = obtainStyledAttributes.getResourceId(b0.f22387W, i46);
                int resourceId17 = obtainStyledAttributes.getResourceId(b0.f22390Z, i47);
                int i51 = resourceId4;
                jVar = this;
                try {
                    jVar.f22501K0 = obtainStyledAttributes.getInt(b0.f22383S, jVar.f22501K0);
                    jVar.f22503M0 = X(obtainStyledAttributes, jVar.f22503M0);
                    boolean z22 = obtainStyledAttributes.getBoolean(b0.f22380P, true);
                    boolean z23 = obtainStyledAttributes.getBoolean(b0.f22377M, true);
                    boolean z24 = obtainStyledAttributes.getBoolean(b0.f22379O, true);
                    boolean z25 = obtainStyledAttributes.getBoolean(b0.f22378N, true);
                    boolean z26 = obtainStyledAttributes.getBoolean(b0.f22381Q, false);
                    boolean z27 = obtainStyledAttributes.getBoolean(b0.f22382R, false);
                    boolean z28 = obtainStyledAttributes.getBoolean(b0.f22384T, false);
                    jVar.setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(b0.f22389Y, jVar.f22502L0));
                    boolean z29 = obtainStyledAttributes.getBoolean(b0.f22432y, true);
                    obtainStyledAttributes.recycle();
                    i26 = resourceId14;
                    i25 = i50;
                    z10 = z29;
                    i11 = resourceId6;
                    i18 = resourceId7;
                    i17 = resourceId8;
                    i16 = resourceId9;
                    i15 = resourceId10;
                    i14 = resourceId11;
                    i13 = resourceId12;
                    i12 = resourceId13;
                    i22 = resourceId15;
                    i21 = resourceId16;
                    i27 = resourceId17;
                    z17 = z22;
                    z16 = z23;
                    z15 = z24;
                    z14 = z25;
                    z13 = z26;
                    z12 = z27;
                    z11 = z28;
                    i20 = resourceId2;
                    i19 = resourceId3;
                    i24 = resourceId5;
                    i23 = i51;
                } catch (Throwable th2) {
                    th = th2;
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i27 = i47;
            int i52 = i46;
            int i53 = i45;
            int i54 = i34;
            jVar = this;
            int i55 = i31;
            int i56 = i44;
            i11 = i36;
            i18 = i37;
            i17 = i38;
            i16 = i39;
            i15 = i40;
            i14 = i41;
            i13 = i42;
            i12 = i43;
            i22 = i53;
            i21 = i52;
            z17 = true;
            z16 = true;
            z15 = true;
            z14 = true;
            z13 = false;
            z12 = false;
            z11 = false;
            z10 = true;
            i20 = i32;
            i19 = i33;
            i24 = i35;
            i23 = i54;
            int i57 = i56;
            i25 = i55;
            i26 = i57;
        }
        LayoutInflater.from(context).inflate(i25, jVar);
        jVar.setDescendantFocusability(262144);
        c cVar2 = new c();
        jVar.f22512c = cVar2;
        jVar.f22513d = new CopyOnWriteArrayList();
        jVar.f22496H = new H.b();
        jVar.f22498I = new H.c();
        StringBuilder sb2 = new StringBuilder();
        jVar.f22492F = sb2;
        int i58 = i24;
        jVar.f22494G = new Formatter(sb2, Locale.getDefault());
        jVar.f22504N0 = new long[0];
        jVar.f22505O0 = new boolean[0];
        jVar.f22506P0 = new long[0];
        jVar.f22507Q0 = new boolean[0];
        jVar.f22516f0 = new C2096g(jVar);
        jVar.f22486C = (TextView) jVar.findViewById(V.f22310m);
        jVar.f22488D = (TextView) jVar.findViewById(V.f22282E);
        ImageView imageView2 = (ImageView) jVar.findViewById(V.f22293P);
        jVar.f22549w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar2);
        }
        ImageView imageView3 = (ImageView) jVar.findViewById(V.f22316s);
        jVar.f22551x = imageView3;
        b0(imageView3, new C2097h(jVar));
        ImageView imageView4 = (ImageView) jVar.findViewById(V.f22321x);
        jVar.f22553y = imageView4;
        b0(imageView4, new C2097h(jVar));
        View findViewById = jVar.findViewById(V.f22289L);
        jVar.f22555z = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(cVar2);
        }
        View findViewById2 = jVar.findViewById(V.f22281D);
        jVar.f22482A = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar2);
        }
        View findViewById3 = jVar.findViewById(V.f22300c);
        jVar.f22484B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar2);
        }
        d0 d0Var = (d0) jVar.findViewById(V.f22284G);
        View findViewById4 = jVar.findViewById(V.f22285H);
        if (d0Var != null) {
            jVar.f22490E = d0Var;
            i28 = i11;
            cVar = cVar2;
            jVar2 = jVar;
            imageView = imageView2;
            z18 = z14;
            i29 = i58;
            z19 = z15;
            i30 = i23;
        } else if (findViewById4 != null) {
            C2094e eVar = r2;
            i28 = i11;
            cVar = cVar2;
            View view = findViewById4;
            z18 = z14;
            i29 = i58;
            imageView = imageView2;
            z19 = z15;
            i30 = i23;
            C2094e eVar2 = new C2094e(context, (AttributeSet) null, 0, attributeSet2, a0.f22364a);
            C2094e eVar3 = eVar;
            eVar3.setId(V.f22284G);
            eVar3.setLayoutParams(view.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            View view2 = view;
            int indexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeView(view2);
            viewGroup.addView(eVar3, indexOfChild);
            jVar2 = this;
            jVar2.f22490E = eVar3;
        } else {
            i28 = i11;
            cVar = cVar2;
            jVar2 = jVar;
            imageView = imageView2;
            z18 = z14;
            i29 = i58;
            z19 = z15;
            i30 = i23;
            jVar2.f22490E = null;
        }
        d0 d0Var2 = jVar2.f22490E;
        c cVar3 = cVar;
        if (d0Var2 != null) {
            d0Var2.a(cVar3);
        }
        Resources resources = context.getResources();
        jVar2.f22511b = resources;
        ImageView imageView5 = (ImageView) jVar2.findViewById(V.f22280C);
        jVar2.f22533o = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar3);
        }
        ImageView imageView6 = (ImageView) jVar2.findViewById(V.f22283F);
        jVar2.f22529m = imageView6;
        Context context3 = context;
        if (imageView6 != null) {
            imageView6.setImageDrawable(i2.L.U(context3, resources, i28));
            imageView6.setOnClickListener(cVar3);
        }
        ImageView imageView7 = (ImageView) jVar2.findViewById(V.f22322y);
        jVar2.f22531n = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(i2.L.U(context3, resources, i30));
            imageView7.setOnClickListener(cVar3);
        }
        Typeface h10 = o1.h.h(context3, U.f22277a);
        ImageView imageView8 = imageView7;
        ImageView imageView9 = (ImageView) jVar2.findViewById(V.f22287J);
        ImageView imageView10 = imageView6;
        TextView textView = (TextView) jVar2.findViewById(V.f22288K);
        if (imageView9 != null) {
            z20 = z17;
            imageView9.setImageDrawable(i2.L.U(context3, resources, i18));
            jVar2.f22537q = imageView9;
            jVar2.f22541s = null;
        } else {
            z20 = z17;
            if (textView != null) {
                textView.setTypeface(h10);
                jVar2.f22541s = textView;
                jVar2.f22537q = textView;
            } else {
                jVar2.f22541s = null;
                jVar2.f22537q = null;
            }
        }
        View view3 = jVar2.f22537q;
        if (view3 != null) {
            view3.setOnClickListener(cVar3);
        }
        ImageView imageView11 = (ImageView) jVar2.findViewById(V.f22314q);
        TextView textView2 = (TextView) jVar2.findViewById(V.f22315r);
        if (imageView11 != null) {
            imageView11.setImageDrawable(i2.L.U(context3, resources, i29));
            jVar2.f22535p = imageView11;
            jVar2.f22539r = null;
        } else if (textView2 != null) {
            textView2.setTypeface(h10);
            jVar2.f22539r = textView2;
            jVar2.f22535p = textView2;
        } else {
            jVar2.f22539r = null;
            jVar2.f22535p = null;
        }
        View view4 = jVar2.f22535p;
        if (view4 != null) {
            view4.setOnClickListener(cVar3);
        }
        ImageView imageView12 = (ImageView) jVar2.findViewById(V.f22286I);
        jVar2.f22543t = imageView12;
        if (imageView12 != null) {
            imageView12.setOnClickListener(cVar3);
        }
        ImageView imageView13 = (ImageView) jVar2.findViewById(V.f22290M);
        jVar2.f22545u = imageView13;
        if (imageView13 != null) {
            imageView13.setOnClickListener(cVar3);
        }
        jVar2.f22538q0 = ((float) resources.getInteger(W.f22325b)) / 100.0f;
        jVar2.f22540r0 = ((float) resources.getInteger(W.f22324a)) / 100.0f;
        ImageView imageView14 = (ImageView) jVar2.findViewById(V.f22297T);
        jVar2.f22547v = imageView14;
        if (imageView14 != null) {
            imageView14.setImageDrawable(i2.L.U(context3, resources, i27));
            jVar2.p0(false, imageView14);
        }
        C c10 = new C(jVar2);
        jVar2.f22510a = c10;
        c10.X(z10);
        ImageView imageView15 = imageView12;
        h hVar = new h(new String[]{resources.getString(Z.f22345h), resources.getString(Z.f22362y)}, new Drawable[]{i2.L.U(context3, resources, T.f22273p), i2.L.U(context3, resources, T.f22259b)});
        jVar2.f22515f = hVar;
        jVar2.f22527l = resources.getDimensionPixelSize(S.f22254a);
        ImageView imageView16 = imageView14;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(X.f22328c, (ViewGroup) null);
        jVar2.f22514e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow(recyclerView, -2, -2, true);
        jVar2.f22525k = popupWindow;
        if (i2.L.f22072a < 23) {
            z21 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z21 = false;
        }
        popupWindow.setOnDismissListener(cVar3);
        jVar2.f22509S0 = true;
        jVar2.f22523j = new C2095f(getResources());
        jVar2.f22546u0 = i2.L.U(context3, resources, i22);
        jVar2.f22548v0 = i2.L.U(context3, resources, i21);
        jVar2.f22550w0 = resources.getString(Z.f22339b);
        jVar2.f22552x0 = resources.getString(Z.f22338a);
        jVar2.f22519h = new C0360j();
        jVar2.f22521i = new b();
        jVar2.f22517g = new e(resources.getStringArray(P.f22252a), f22481T0);
        jVar2.f22518g0 = i2.L.U(context3, resources, i20);
        jVar2.f22520h0 = i2.L.U(context3, resources, i19);
        jVar2.f22554y0 = i2.L.U(context3, resources, i17);
        jVar2.f22556z0 = i2.L.U(context3, resources, i16);
        jVar2.f22522i0 = i2.L.U(context3, resources, i15);
        jVar2.f22524j0 = i2.L.U(context3, resources, i14);
        jVar2.f22526k0 = i2.L.U(context3, resources, i13);
        jVar2.f22534o0 = i2.L.U(context3, resources, i12);
        jVar2.f22536p0 = i2.L.U(context3, resources, i26);
        jVar2.f22483A0 = resources.getString(Z.f22341d);
        jVar2.f22485B0 = resources.getString(Z.f22340c);
        jVar2.f22528l0 = resources.getString(Z.f22347j);
        jVar2.f22530m0 = resources.getString(Z.f22348k);
        jVar2.f22532n0 = resources.getString(Z.f22346i);
        jVar2.f22542s0 = resources.getString(Z.f22351n);
        jVar2.f22544t0 = resources.getString(Z.f22350m);
        c10.Y((ViewGroup) jVar2.findViewById(V.f22302e), true);
        c10.Y(jVar2.f22535p, z16);
        c10.Y(jVar2.f22537q, z20);
        c10.Y(imageView10, z19);
        c10.Y(imageView8, z18);
        c10.Y(imageView13, z13);
        c10.Y(imageView, z12);
        c10.Y(imageView16, z11);
        c10.Y(imageView15, jVar2.f22503M0 != 0 ? true : z21);
        jVar2.addOnLayoutChangeListener(new C2098i(jVar2));
    }

    private void A0() {
        this.f22514e.measure(0, 0);
        this.f22525k.setWidth(Math.min(this.f22514e.getMeasuredWidth(), getWidth() - (this.f22527l * 2)));
        this.f22525k.setHeight(Math.min(getHeight() - (this.f22527l * 2), this.f22514e.getMeasuredHeight()));
    }

    /* access modifiers changed from: private */
    public void B0() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (e0() && this.f22493F0 && (imageView = this.f22545u) != null) {
            C1964E e10 = this.f22487C0;
            if (!this.f22510a.A(imageView)) {
                p0(false, this.f22545u);
            } else if (e10 == null || !e10.L(14)) {
                p0(false, this.f22545u);
                this.f22545u.setImageDrawable(this.f22536p0);
                this.f22545u.setContentDescription(this.f22544t0);
            } else {
                p0(true, this.f22545u);
                ImageView imageView2 = this.f22545u;
                if (e10.D()) {
                    drawable = this.f22534o0;
                } else {
                    drawable = this.f22536p0;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f22545u;
                if (e10.D()) {
                    str = this.f22542s0;
                } else {
                    str = this.f22544t0;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public void C0() {
        boolean z10;
        H h10;
        int i10;
        long j10;
        int i11;
        int i12;
        H.c cVar;
        int i13;
        C1964E e10 = this.f22487C0;
        if (e10 != null) {
            boolean z11 = true;
            if (!this.f22495G0 || !T(e10, this.f22498I)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f22499I0 = z10;
            this.f22508R0 = 0;
            if (e10.L(17)) {
                h10 = e10.s();
            } else {
                h10 = H.f19735a;
            }
            if (!h10.q()) {
                int B10 = e10.B();
                boolean z12 = this.f22499I0;
                if (z12) {
                    i11 = 0;
                } else {
                    i11 = B10;
                }
                if (z12) {
                    i12 = h10.p() - 1;
                } else {
                    i12 = B10;
                }
                long j11 = 0;
                i10 = 0;
                while (true) {
                    if (i11 > i12) {
                        break;
                    }
                    if (i11 == B10) {
                        this.f22508R0 = i2.L.h1(j11);
                    }
                    h10.n(i11, this.f22498I);
                    H.c cVar2 = this.f22498I;
                    if (cVar2.f19779m == -9223372036854775807L) {
                        C2076a.g(this.f22499I0 ^ z11);
                        break;
                    }
                    int i14 = cVar2.f19780n;
                    while (true) {
                        cVar = this.f22498I;
                        if (i14 > cVar.f19781o) {
                            break;
                        }
                        h10.f(i14, this.f22496H);
                        int c10 = this.f22496H.c();
                        for (int o10 = this.f22496H.o(); o10 < c10; o10++) {
                            long f10 = this.f22496H.f(o10);
                            if (f10 == Long.MIN_VALUE) {
                                long j12 = this.f22496H.f19747d;
                                if (j12 == -9223372036854775807L) {
                                } else {
                                    f10 = j12;
                                }
                            }
                            long n10 = f10 + this.f22496H.n();
                            if (n10 >= 0) {
                                long[] jArr = this.f22504N0;
                                if (i10 == jArr.length) {
                                    if (jArr.length == 0) {
                                        i13 = 1;
                                    } else {
                                        i13 = jArr.length * 2;
                                    }
                                    this.f22504N0 = Arrays.copyOf(jArr, i13);
                                    this.f22505O0 = Arrays.copyOf(this.f22505O0, i13);
                                }
                                this.f22504N0[i10] = i2.L.h1(j11 + n10);
                                this.f22505O0[i10] = this.f22496H.p(o10);
                                i10++;
                            }
                        }
                        i14++;
                    }
                    j11 += cVar.f19779m;
                    i11++;
                    z11 = true;
                }
                j10 = j11;
            } else {
                if (e10.L(16)) {
                    long T10 = e10.T();
                    if (T10 != -9223372036854775807L) {
                        j10 = i2.L.L0(T10);
                        i10 = 0;
                    }
                }
                j10 = 0;
                i10 = 0;
            }
            long h12 = i2.L.h1(j10);
            TextView textView = this.f22486C;
            if (textView != null) {
                textView.setText(i2.L.k0(this.f22492F, this.f22494G, h12));
            }
            d0 d0Var = this.f22490E;
            if (d0Var != null) {
                d0Var.setDuration(h12);
                int length = this.f22506P0.length;
                int i15 = i10 + length;
                long[] jArr2 = this.f22504N0;
                if (i15 > jArr2.length) {
                    this.f22504N0 = Arrays.copyOf(jArr2, i15);
                    this.f22505O0 = Arrays.copyOf(this.f22505O0, i15);
                }
                System.arraycopy(this.f22506P0, 0, this.f22504N0, i10, length);
                System.arraycopy(this.f22507Q0, 0, this.f22505O0, i10, length);
                this.f22490E.b(this.f22504N0, this.f22505O0, i15);
            }
            w0();
        }
    }

    /* access modifiers changed from: private */
    public void D0() {
        boolean z10;
        a0();
        if (this.f22519h.e() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0(z10, this.f22549w);
        z0();
    }

    private static boolean T(C1964E e10, H.c cVar) {
        H s10;
        int p10;
        if (!e10.L(17) || (p10 = s10.p()) <= 1 || p10 > 100) {
            return false;
        }
        for (int i10 = 0; i10 < p10; i10++) {
            if ((s10 = e10.s()).n(i10, cVar).f19779m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void V(RecyclerView.h hVar, View view) {
        this.f22514e.setAdapter(hVar);
        A0();
        this.f22509S0 = false;
        this.f22525k.dismiss();
        this.f22509S0 = true;
        this.f22525k.showAsDropDown(view, (getWidth() - this.f22525k.getWidth()) - this.f22527l, (-this.f22525k.getHeight()) - this.f22527l);
    }

    private C4770v W(f2.L l10, int i10) {
        C4770v.a aVar = new C4770v.a();
        C4770v a10 = l10.a();
        for (int i11 = 0; i11 < a10.size(); i11++) {
            L.a aVar2 = (L.a) a10.get(i11);
            if (aVar2.c() == i10) {
                for (int i12 = 0; i12 < aVar2.f19900a; i12++) {
                    if (aVar2.g(i12)) {
                        s b10 = aVar2.b(i12);
                        if ((b10.f20074e & 2) == 0) {
                            aVar.a(new k(l10, i11, i12, this.f22523j.a(b10)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(b0.f22375K, i10);
    }

    private void a0() {
        this.f22519h.A();
        this.f22521i.A();
        C1964E e10 = this.f22487C0;
        if (e10 != null && e10.L(30) && this.f22487C0.L(29)) {
            f2.L m10 = this.f22487C0.m();
            this.f22521i.I(W(m10, 1));
            if (this.f22510a.A(this.f22549w)) {
                this.f22519h.H(W(m10, 3));
            } else {
                this.f22519h.H(C4770v.E());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener(onClickListener);
        }
    }

    private static boolean d0(int i10) {
        if (i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void g0(View view) {
        if (this.f22489D0 != null) {
            boolean z10 = !this.f22491E0;
            this.f22491E0 = z10;
            r0(this.f22551x, z10);
            r0(this.f22553y, this.f22491E0);
            d dVar = this.f22489D0;
            if (dVar != null) {
                dVar.O(this.f22491E0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f22525k.isShowing()) {
            A0();
            this.f22525k.update(view, (getWidth() - this.f22525k.getWidth()) - this.f22527l, (-this.f22525k.getHeight()) - this.f22527l, -1, -1);
        }
    }

    /* access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f22517g, (View) C2076a.e(this.f22555z));
        } else if (i10 == 1) {
            V(this.f22521i, (View) C2076a.e(this.f22555z));
        } else {
            this.f22525k.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void l0(C1964E e10, long j10) {
        if (this.f22499I0) {
            if (e10.L(17) && e10.L(10)) {
                H s10 = e10.s();
                int p10 = s10.p();
                int i10 = 0;
                while (true) {
                    long d10 = s10.n(i10, this.f22498I).d();
                    if (j10 < d10) {
                        break;
                    } else if (i10 == p10 - 1) {
                        j10 = d10;
                        break;
                    } else {
                        j10 -= d10;
                        i10++;
                    }
                }
                e10.t(i10, j10);
            }
        } else if (e10.L(5)) {
            e10.y(j10);
        }
        w0();
    }

    private boolean m0() {
        C1964E e10 = this.f22487C0;
        if (e10 == null || !e10.L(1) || (this.f22487C0.L(17) && this.f22487C0.s().q())) {
            return false;
        }
        return true;
    }

    private void p0(boolean z10, View view) {
        float f10;
        if (view != null) {
            view.setEnabled(z10);
            if (z10) {
                f10 = this.f22538q0;
            } else {
                f10 = this.f22540r0;
            }
            view.setAlpha(f10);
        }
    }

    private void q0() {
        long j10;
        C1964E e10 = this.f22487C0;
        if (e10 != null) {
            j10 = e10.X();
        } else {
            j10 = 15000;
        }
        int i10 = (int) (j10 / 1000);
        TextView textView = this.f22539r;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
        View view = this.f22535p;
        if (view != null) {
            view.setContentDescription(this.f22511b.getQuantityString(Y.f22331a, i10, new Object[]{Integer.valueOf(i10)}));
        }
    }

    private void r0(ImageView imageView, boolean z10) {
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(this.f22554y0);
                imageView.setContentDescription(this.f22483A0);
                return;
            }
            imageView.setImageDrawable(this.f22556z0);
            imageView.setContentDescription(this.f22485B0);
        }
    }

    private static void s0(View view, boolean z10) {
        if (view != null) {
            if (z10) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        C1964E e10 = this.f22487C0;
        if (e10 != null && e10.L(13)) {
            C1964E e11 = this.f22487C0;
            e11.f(e11.c().b(f10));
        }
    }

    /* access modifiers changed from: private */
    public void t0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (e0() && this.f22493F0) {
            C1964E e10 = this.f22487C0;
            if (e10 != null) {
                if (!this.f22495G0 || !T(e10, this.f22498I)) {
                    z13 = e10.L(5);
                } else {
                    z13 = e10.L(10);
                }
                z12 = e10.L(7);
                z11 = e10.L(11);
                z10 = e10.L(12);
                z14 = e10.L(9);
            } else {
                z13 = false;
                z14 = false;
                z12 = false;
                z11 = false;
                z10 = false;
            }
            if (z11) {
                y0();
            }
            if (z10) {
                q0();
            }
            p0(z12, this.f22529m);
            p0(z11, this.f22537q);
            p0(z10, this.f22535p);
            p0(z14, this.f22531n);
            d0 d0Var = this.f22490E;
            if (d0Var != null) {
                d0Var.setEnabled(z13);
            }
        }
    }

    /* access modifiers changed from: private */
    public void u0() {
        Drawable drawable;
        int i10;
        if (e0() && this.f22493F0 && this.f22533o != null) {
            boolean Z02 = i2.L.Z0(this.f22487C0, this.f22497H0);
            if (Z02) {
                drawable = this.f22518g0;
            } else {
                drawable = this.f22520h0;
            }
            if (Z02) {
                i10 = Z.f22344g;
            } else {
                i10 = Z.f22343f;
            }
            this.f22533o.setImageDrawable(drawable);
            this.f22533o.setContentDescription(this.f22511b.getString(i10));
            p0(m0(), this.f22533o);
        }
    }

    /* access modifiers changed from: private */
    public void v0() {
        C1964E e10 = this.f22487C0;
        if (e10 != null) {
            this.f22517g.E(e10.c().f19709a);
            this.f22515f.C(0, this.f22517g.A());
            z0();
        }
    }

    /* access modifiers changed from: private */
    public void w0() {
        long j10;
        long j11;
        int i10;
        long j12;
        if (e0() && this.f22493F0) {
            C1964E e10 = this.f22487C0;
            if (e10 == null || !e10.L(16)) {
                j11 = 0;
                j10 = 0;
            } else {
                j11 = this.f22508R0 + e10.z();
                j10 = this.f22508R0 + e10.a0();
            }
            TextView textView = this.f22488D;
            if (textView != null && !this.f22500J0) {
                textView.setText(i2.L.k0(this.f22492F, this.f22494G, j11));
            }
            d0 d0Var = this.f22490E;
            if (d0Var != null) {
                d0Var.setPosition(j11);
                this.f22490E.setBufferedPosition(j10);
            }
            removeCallbacks(this.f22516f0);
            if (e10 == null) {
                i10 = 1;
            } else {
                i10 = e10.k();
            }
            long j13 = 1000;
            if (e10 != null && e10.isPlaying()) {
                d0 d0Var2 = this.f22490E;
                if (d0Var2 != null) {
                    j12 = d0Var2.getPreferredUpdateDelay();
                } else {
                    j12 = 1000;
                }
                long min = Math.min(j12, 1000 - (j11 % 1000));
                float f10 = e10.c().f19709a;
                if (f10 > 0.0f) {
                    j13 = (long) (((float) min) / f10);
                }
                postDelayed(this.f22516f0, i2.L.p(j13, (long) this.f22502L0, 1000));
            } else if (i10 != 4 && i10 != 1) {
                postDelayed(this.f22516f0, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void x0() {
        ImageView imageView;
        if (e0() && this.f22493F0 && (imageView = this.f22543t) != null) {
            if (this.f22503M0 == 0) {
                p0(false, imageView);
                return;
            }
            C1964E e10 = this.f22487C0;
            if (e10 == null || !e10.L(15)) {
                p0(false, this.f22543t);
                this.f22543t.setImageDrawable(this.f22522i0);
                this.f22543t.setContentDescription(this.f22528l0);
                return;
            }
            p0(true, this.f22543t);
            int n10 = e10.n();
            if (n10 == 0) {
                this.f22543t.setImageDrawable(this.f22522i0);
                this.f22543t.setContentDescription(this.f22528l0);
            } else if (n10 == 1) {
                this.f22543t.setImageDrawable(this.f22524j0);
                this.f22543t.setContentDescription(this.f22530m0);
            } else if (n10 == 2) {
                this.f22543t.setImageDrawable(this.f22526k0);
                this.f22543t.setContentDescription(this.f22532n0);
            }
        }
    }

    private void y0() {
        long j10;
        C1964E e10 = this.f22487C0;
        if (e10 != null) {
            j10 = e10.f0();
        } else {
            j10 = 5000;
        }
        int i10 = (int) (j10 / 1000);
        TextView textView = this.f22541s;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
        View view = this.f22537q;
        if (view != null) {
            view.setContentDescription(this.f22511b.getQuantityString(Y.f22332b, i10, new Object[]{Integer.valueOf(i10)}));
        }
    }

    private void z0() {
        p0(this.f22515f.z(), this.f22555z);
    }

    public void S(m mVar) {
        C2076a.e(mVar);
        this.f22513d.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C1964E e10 = this.f22487C0;
        if (e10 == null || !d0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (e10.k() == 4 || !e10.L(12)) {
                return true;
            }
            e10.b0();
            return true;
        } else if (keyCode == 89 && e10.L(11)) {
            e10.c0();
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                i2.L.t0(e10, this.f22497H0);
                return true;
            } else if (keyCode != 87) {
                if (keyCode != 88) {
                    if (keyCode == 126) {
                        i2.L.s0(e10);
                        return true;
                    } else if (keyCode != 127) {
                        return true;
                    } else {
                        i2.L.r0(e10);
                        return true;
                    }
                } else if (!e10.L(7)) {
                    return true;
                } else {
                    e10.J();
                    return true;
                }
            } else if (!e10.L(9)) {
                return true;
            } else {
                e10.O();
                return true;
            }
        }
    }

    public void Y() {
        this.f22510a.C();
    }

    public void Z() {
        this.f22510a.F();
    }

    public boolean c0() {
        return this.f22510a.I();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (U(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean e0() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        Iterator it = this.f22513d.iterator();
        while (it.hasNext()) {
            ((m) it.next()).w(getVisibility());
        }
    }

    public C1964E getPlayer() {
        return this.f22487C0;
    }

    public int getRepeatToggleModes() {
        return this.f22503M0;
    }

    public boolean getShowShuffleButton() {
        return this.f22510a.A(this.f22545u);
    }

    public boolean getShowSubtitleButton() {
        return this.f22510a.A(this.f22549w);
    }

    public int getShowTimeoutMs() {
        return this.f22501K0;
    }

    public boolean getShowVrButton() {
        return this.f22510a.A(this.f22547v);
    }

    public void j0(m mVar) {
        this.f22513d.remove(mVar);
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        ImageView imageView = this.f22533o;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void n0() {
        this.f22510a.b0();
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        u0();
        t0();
        x0();
        B0();
        D0();
        v0();
        C0();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22510a.O();
        this.f22493F0 = true;
        if (c0()) {
            this.f22510a.W();
        }
        o0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22510a.P();
        this.f22493F0 = false;
        removeCallbacks(this.f22516f0);
        this.f22510a.V();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22510a.Q(z10, i10, i11, i12, i13);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f22510a.X(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        boolean z10;
        this.f22489D0 = dVar;
        ImageView imageView = this.f22551x;
        boolean z11 = false;
        if (dVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s0(imageView, z10);
        ImageView imageView2 = this.f22553y;
        if (dVar != null) {
            z11 = true;
        }
        s0(imageView2, z11);
    }

    public void setPlayer(C1964E e10) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (e10 == null || e10.M() == Looper.getMainLooper()) {
            z11 = true;
        }
        C2076a.a(z11);
        C1964E e11 = this.f22487C0;
        if (e11 != e10) {
            if (e11 != null) {
                e11.F(this.f22512c);
            }
            this.f22487C0 = e10;
            if (e10 != null) {
                e10.e0(this.f22512c);
            }
            o0();
        }
    }

    public void setRepeatToggleModes(int i10) {
        this.f22503M0 = i10;
        C1964E e10 = this.f22487C0;
        boolean z10 = false;
        if (e10 != null && e10.L(15)) {
            int n10 = this.f22487C0.n();
            if (i10 == 0 && n10 != 0) {
                this.f22487C0.C(0);
            } else if (i10 == 1 && n10 == 2) {
                this.f22487C0.C(1);
            } else if (i10 == 2 && n10 == 1) {
                this.f22487C0.C(2);
            }
        }
        C c10 = this.f22510a;
        ImageView imageView = this.f22543t;
        if (i10 != 0) {
            z10 = true;
        }
        c10.Y(imageView, z10);
        x0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f22510a.Y(this.f22535p, z10);
        t0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f22495G0 = z10;
        C0();
    }

    public void setShowNextButton(boolean z10) {
        this.f22510a.Y(this.f22531n, z10);
        t0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f22497H0 = z10;
        u0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f22510a.Y(this.f22529m, z10);
        t0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f22510a.Y(this.f22537q, z10);
        t0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f22510a.Y(this.f22545u, z10);
        B0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f22510a.Y(this.f22549w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f22501K0 = i10;
        if (c0()) {
            this.f22510a.W();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f22510a.Y(this.f22547v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f22502L0 = i2.L.o(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z10;
        ImageView imageView = this.f22547v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p0(z10, this.f22547v);
        }
    }

    /* renamed from: i3.j$j  reason: collision with other inner class name */
    private final class C0360j extends l {
        private C0360j() {
            super();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void I(View view) {
            if (C2099j.this.f22487C0 != null && C2099j.this.f22487C0.L(29)) {
                C2099j.this.f22487C0.Y(C2099j.this.f22487C0.N().a().D(3).G(-3).C());
                C2099j.this.f22525k.dismiss();
            }
        }

        /* renamed from: C */
        public void o(i iVar, int i10) {
            int i11;
            super.o(iVar, i10);
            if (i10 > 0) {
                View view = iVar.f22572v;
                if (((k) this.f22577d.get(i10 - 1)).a()) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                view.setVisibility(i11);
            }
        }

        public void D(i iVar) {
            boolean z10;
            iVar.f22571u.setText(Z.f22361x);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f22577d.size()) {
                    z10 = true;
                    break;
                } else if (((k) this.f22577d.get(i11)).a()) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            View view = iVar.f22572v;
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
            iVar.f18066a.setOnClickListener(new C2103n(this));
        }

        public void H(List list) {
            Drawable drawable;
            String str;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (((k) list.get(i10)).a()) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (C2099j.this.f22549w != null) {
                ImageView D10 = C2099j.this.f22549w;
                C2099j jVar = C2099j.this;
                if (z10) {
                    drawable = jVar.f22546u0;
                } else {
                    drawable = jVar.f22548v0;
                }
                D10.setImageDrawable(drawable);
                ImageView D11 = C2099j.this.f22549w;
                if (z10) {
                    str = C2099j.this.f22550w0;
                } else {
                    str = C2099j.this.f22552x0;
                }
                D11.setContentDescription(str);
            }
            this.f22577d = list;
        }

        public void F(String str) {
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }
}
