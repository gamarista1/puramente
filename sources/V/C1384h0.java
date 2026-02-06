package V;

import Ug.K;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.G;
import androidx.activity.J;
import androidx.activity.r;
import androidx.compose.ui.platform.A1;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import c1.d;
import c1.h;
import c1.t;
import java.util.UUID;
import k0.m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import w.C2782a;
import x3.C2915g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: V.h0  reason: case insensitive filesystem */
final class C1384h0 extends r implements A1 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C6787a f7520d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C1388j0 f7521e;

    /* renamed from: f  reason: collision with root package name */
    private final View f7522f;

    /* renamed from: g  reason: collision with root package name */
    private final C1382g0 f7523g;

    /* renamed from: h  reason: collision with root package name */
    private final float f7524h;

    /* renamed from: V.h0$a */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* renamed from: V.h0$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1384h0 f7525a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1384h0 h0Var) {
            super(1);
            this.f7525a = h0Var;
        }

        public final void a(G g10) {
            if (this.f7525a.f7521e.b()) {
                this.f7525a.f7520d.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.h0$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7526a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c1.t[] r0 = c1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c1.t r1 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c1.t r1 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f7526a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.C1384h0.c.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1384h0(C6787a aVar, C1388j0 j0Var, View view, t tVar, d dVar, UUID uuid, C2782a aVar2, K k10, boolean z10) {
        super(new ContextThemeWrapper(view.getContext(), C1403r0.f8008a), 0, 2, (DefaultConstructorMarker) null);
        this.f7520d = aVar;
        this.f7521e = j0Var;
        this.f7522f = view;
        float j10 = h.j((float) 8);
        this.f7524h = j10;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            C1708p0.b(window, false);
            C1382g0 g0Var = new C1382g0(getContext(), window, this.f7521e.b(), this.f7520d, aVar2, k10);
            int i10 = m.f23099H;
            g0Var.setTag(i10, "Dialog:" + uuid);
            g0Var.setClipChildren(false);
            g0Var.setElevation(dVar.t1(j10));
            g0Var.setOutlineProvider(new a());
            this.f7523g = g0Var;
            setContentView((View) g0Var);
            f0.b(g0Var, f0.a(view));
            g0.b(g0Var, g0.a(view));
            C2915g.b(g0Var, C2915g.a(view));
            k(this.f7520d, this.f7521e, tVar);
            f1 a10 = C1708p0.a(window, window.getDecorView());
            a10.d(!z10);
            a10.c(!z10);
            J.b(getOnBackPressedDispatcher(), this, false, new b(this), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }

    private final void i(t tVar) {
        C1382g0 g0Var = this.f7523g;
        int i10 = c.f7526a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new C6535s();
        }
        g0Var.setLayoutDirection(i11);
    }

    private final void j(androidx.compose.ui.window.t tVar) {
        int i10;
        boolean d10 = C1390k0.f(tVar, C1390k0.e(this.f7522f));
        Window window = getWindow();
        C6496s.e(window);
        if (d10) {
            i10 = 8192;
        } else {
            i10 = -8193;
        }
        window.setFlags(i10, 8192);
    }

    public final void g() {
        this.f7523g.disposeComposition();
    }

    public final void h(Y.r rVar, p pVar) {
        this.f7523g.i(rVar, pVar);
    }

    public final void k(C6787a aVar, C1388j0 j0Var, t tVar) {
        int i10;
        this.f7520d = aVar;
        this.f7521e = j0Var;
        j(j0Var.a());
        i(tVar);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                i10 = 48;
            } else {
                i10 = 16;
            }
            window2.setSoftInputMode(i10);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f7520d.invoke();
        }
        return onTouchEvent;
    }

    public void cancel() {
    }
}
