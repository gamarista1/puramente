package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.G;
import androidx.activity.r;
import androidx.compose.ui.platform.A1;
import c1.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

final class k extends r implements A1 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C6787a f14287d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public i f14288e;

    /* renamed from: f  reason: collision with root package name */
    private final View f14289f;

    /* renamed from: g  reason: collision with root package name */
    private final h f14290g;

    /* renamed from: h  reason: collision with root package name */
    private final float f14291h;

    /* renamed from: i  reason: collision with root package name */
    private final int f14292i;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f14293a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(1);
            this.f14293a = kVar;
        }

        public final void a(G g10) {
            if (this.f14293a.f14288e.b()) {
                this.f14293a.f14287d.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14294a;

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
                f14294a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.k.c.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(yf.C6787a r7, androidx.compose.ui.window.i r8, android.view.View r9, c1.t r10, c1.d r11, java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L_0x0016
            boolean r2 = r8.a()
            if (r2 == 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            int r2 = k0.o.f23144b
            goto L_0x0018
        L_0x0016:
            int r2 = k0.o.f23143a
        L_0x0018:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.f14287d = r7
            r6.f14288e = r8
            r6.f14289f = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            r6.f14291h = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto L_0x00c6
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.f14292i = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.i r0 = r6.f14288e
            boolean r0 = r0.a()
            androidx.core.view.C1708p0.b(r8, r0)
            androidx.compose.ui.window.h r0 = new androidx.compose.ui.window.h
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1, r8)
            int r1 = k0.m.f23099H
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.t1(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.k$a r7 = new androidx.compose.ui.window.k$a
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.f14290g = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0091
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0091:
            if (r3 == 0) goto L_0x0096
            e(r3)
        L_0x0096:
            r6.setContentView((android.view.View) r0)
            androidx.lifecycle.v r7 = androidx.lifecycle.f0.a(r9)
            androidx.lifecycle.f0.b(r0, r7)
            androidx.lifecycle.e0 r7 = androidx.lifecycle.g0.a(r9)
            androidx.lifecycle.g0.b(r0, r7)
            x3.f r7 = x3.C2915g.a(r9)
            x3.C2915g.b(r0, r7)
            yf.a r7 = r6.f14287d
            androidx.compose.ui.window.i r8 = r6.f14288e
            r6.l(r7, r8, r10)
            androidx.activity.H r0 = r6.getOnBackPressedDispatcher()
            androidx.compose.ui.window.k$b r3 = new androidx.compose.ui.window.k$b
            r3.<init>(r6)
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.J.b(r0, r1, r2, r3, r4, r5)
            return
        L_0x00c6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.k.<init>(yf.a, androidx.compose.ui.window.i, android.view.View, c1.t, c1.d, java.util.UUID):void");
    }

    private static final void e(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof h)) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    e(viewGroup2);
                }
            }
        }
    }

    private final void j(t tVar) {
        h hVar = this.f14290g;
        int i10 = c.f14294a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new C6535s();
        }
        hVar.setLayoutDirection(i11);
    }

    private final void k(t tVar) {
        int i10;
        boolean a10 = u.a(tVar, b.i(this.f14289f));
        Window window = getWindow();
        C6496s.e(window);
        if (a10) {
            i10 = 8192;
        } else {
            i10 = -8193;
        }
        window.setFlags(i10, 8192);
    }

    public void cancel() {
    }

    public final void h() {
        this.f14290g.disposeComposition();
    }

    public final void i(Y.r rVar, p pVar) {
        this.f14290g.h(rVar, pVar);
    }

    public final void l(C6787a aVar, i iVar, t tVar) {
        Window window;
        this.f14287d = aVar;
        this.f14288e = iVar;
        k(iVar.d());
        j(tVar);
        if (iVar.e() && !this.f14290g.g() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.f14290g.i(iVar.e());
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        if (iVar.a()) {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(this.f14292i);
                return;
            }
            return;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f14288e.c()) {
            this.f14287d.invoke();
        }
        return onTouchEvent;
    }
}
