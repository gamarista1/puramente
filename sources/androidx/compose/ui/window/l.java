package androidx.compose.ui.window;

import H0.C1197s;
import H0.C1198t;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import Y.p1;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.C1613a;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import c1.o;
import c1.p;
import c1.q;
import c1.r;
import c1.s;
import c1.t;
import com.adjust.sdk.network.ErrorCodes;
import i0.u;
import java.util.UUID;
import k0.m;
import k0.n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;
import lf.C6514M;
import lf.C6535s;
import q0.C2421g;
import x3.C2915g;
import yf.C6787a;
import yf.C6798l;

public final class l extends C1613a implements A1 {

    /* renamed from: u  reason: collision with root package name */
    private static final c f14295u = new c((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f14296v = 8;

    /* renamed from: w  reason: collision with root package name */
    private static final C6798l f14297w = b.f14318a;

    /* renamed from: a  reason: collision with root package name */
    private C6787a f14298a;

    /* renamed from: b  reason: collision with root package name */
    private s f14299b;

    /* renamed from: c  reason: collision with root package name */
    private String f14300c;

    /* renamed from: d  reason: collision with root package name */
    private final View f14301d;

    /* renamed from: e  reason: collision with root package name */
    private final n f14302e;

    /* renamed from: f  reason: collision with root package name */
    private final WindowManager f14303f;

    /* renamed from: g  reason: collision with root package name */
    private final WindowManager.LayoutParams f14304g;

    /* renamed from: h  reason: collision with root package name */
    private r f14305h;

    /* renamed from: i  reason: collision with root package name */
    private t f14306i;

    /* renamed from: j  reason: collision with root package name */
    private final C1510r0 f14307j;

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f14308k;

    /* renamed from: l  reason: collision with root package name */
    private p f14309l;

    /* renamed from: m  reason: collision with root package name */
    private final Y.A1 f14310m;

    /* renamed from: n  reason: collision with root package name */
    private final float f14311n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f14312o;

    /* renamed from: p  reason: collision with root package name */
    private final u f14313p;

    /* renamed from: q  reason: collision with root package name */
    private Object f14314q;

    /* renamed from: r  reason: collision with root package name */
    private final C1510r0 f14315r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f14316s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f14317t;

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
        public static final b f14318a = new b();

        b() {
            super(1);
        }

        public final void a(l lVar) {
            if (lVar.isAttachedToWindow()) {
                lVar.t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C6514M.f71813a;
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14320b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, int i10) {
            super(2);
            this.f14319a = lVar;
            this.f14320b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f14319a.Content(mVar, M0.a(this.f14320b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14321a;

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
                f14321a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.l.e.<clinit>():void");
        }
    }

    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14322a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(0);
            this.f14322a = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            boolean z10;
            C1197s g10 = this.f14322a.getParentLayoutCoordinates();
            if (g10 == null || !g10.G()) {
                g10 = null;
            }
            if (g10 == null || this.f14322a.m9getPopupContentSizebOM6tXw() == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f14323a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar) {
            super(1);
            this.f14323a = lVar;
        }

        /* access modifiers changed from: private */
        public static final void c(C6787a aVar) {
            aVar.invoke();
        }

        public final void b(C6787a aVar) {
            Looper looper;
            Handler handler = this.f14323a.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = this.f14323a.getHandler();
            if (handler2 != null) {
                handler2.post(new m(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C6787a) obj);
            return C6514M.f71813a;
        }
    }

    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M f14324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f14325b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f14326c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f14327d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f14328e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(M m10, l lVar, p pVar, long j10, long j11) {
            super(0);
            this.f14324a = m10;
            this.f14325b = lVar;
            this.f14326c = pVar;
            this.f14327d = j10;
            this.f14328e = j11;
        }

        public final void invoke() {
            this.f14324a.f71758a = this.f14325b.getPositionProvider().a(this.f14326c, this.f14327d, this.f14325b.getParentLayoutDirection(), this.f14328e);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l(yf.C6787a r11, androidx.compose.ui.window.s r12, java.lang.String r13, android.view.View r14, c1.d r15, androidx.compose.ui.window.r r16, java.util.UUID r17, androidx.compose.ui.window.n r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.p r0 = new androidx.compose.ui.window.p
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.window.q r0 = new androidx.compose.ui.window.q
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.l.<init>(yf.a, androidx.compose.ui.window.s, java.lang.String, android.view.View, c1.d, androidx.compose.ui.window.r, java.util.UUID, androidx.compose.ui.window.n, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final yf.p getContent() {
        return (yf.p) this.f14315r.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final C1197s getParentLayoutCoordinates() {
        return (C1197s) this.f14308k.getValue();
    }

    private final WindowManager.LayoutParams h() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = b.h(this.f14299b, b.i(this.f14301d));
        layoutParams.type = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
        layoutParams.token = this.f14301d.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f14301d.getContext().getResources().getString(n.f23132c));
        return layoutParams;
    }

    private final void j() {
        if (this.f14299b.a() && Build.VERSION.SDK_INT >= 33) {
            if (this.f14314q == null) {
                this.f14314q = e.b(this.f14298a);
            }
            e.d(this, this.f14314q);
        }
    }

    private final void k() {
        if (Build.VERSION.SDK_INT >= 33) {
            e.e(this, this.f14314q);
        }
        this.f14314q = null;
    }

    private final void o(t tVar) {
        int i10 = e.f14321a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new C6535s();
        }
        super.setLayoutDirection(i11);
    }

    private final void s(s sVar) {
        if (!C6496s.c(this.f14299b, sVar)) {
            if (sVar.f() && !this.f14299b.f()) {
                WindowManager.LayoutParams layoutParams = this.f14304g;
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f14299b = sVar;
            this.f14304g.flags = b.h(sVar, b.i(this.f14301d));
            this.f14302e.b(this.f14303f, this, this.f14304g);
        }
    }

    private final void setContent(yf.p pVar) {
        this.f14315r.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(C1197s sVar) {
        this.f14308k.setValue(sVar);
    }

    public void Content(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(-857613600);
        if ((i10 & 6) == 0) {
            if (h10.C(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(this, i10));
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f14299b.a()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C6787a aVar = this.f14298a;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f14310m.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f14304g;
    }

    public final t getParentLayoutDirection() {
        return this.f14306i;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final r m9getPopupContentSizebOM6tXw() {
        return (r) this.f14307j.getValue();
    }

    public final r getPositionProvider() {
        return this.f14305h;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14316s;
    }

    public C1613a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f14300c;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final void i() {
        f0.b(this, (C1798v) null);
        this.f14303f.removeViewImmediate(this);
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (!this.f14299b.f() && (childAt = getChildAt(0)) != null) {
            this.f14304g.width = childAt.getMeasuredWidth();
            this.f14304g.height = childAt.getMeasuredHeight();
            this.f14302e.b(this.f14303f, this, this.f14304g);
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.f14299b.f()) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void l() {
        int[] iArr = this.f14317t;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f14301d.getLocationOnScreen(iArr);
        int[] iArr2 = this.f14317t;
        if (i10 != iArr2[0] || i11 != iArr2[1]) {
            q();
        }
    }

    public final void m(Y.r rVar, yf.p pVar) {
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f14316s = true;
    }

    public final void n() {
        this.f14303f.addView(this, this.f14304g);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14313p.s();
        j();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14313p.t();
        this.f14313p.j();
        k();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f14299b.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((float) getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((float) getHeight()))) {
            C6787a aVar = this.f14298a;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        } else if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            C6787a aVar2 = this.f14298a;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
    }

    public final void p(C6787a aVar, s sVar, String str, t tVar) {
        this.f14298a = aVar;
        this.f14300c = str;
        s(sVar);
        o(tVar);
    }

    public final void q() {
        C1197s parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.G()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long b10 = parentLayoutCoordinates.b();
                long f10 = C1198t.f(parentLayoutCoordinates);
                p a10 = q.a(o.a(Math.round(C2421g.m(f10)), Math.round(C2421g.n(f10))), b10);
                if (!C6496s.c(a10, this.f14309l)) {
                    this.f14309l = a10;
                    t();
                }
            }
        }
    }

    public final void r(C1197s sVar) {
        setParentLayoutCoordinates(sVar);
        q();
    }

    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(t tVar) {
        this.f14306i = tVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m10setPopupContentSizefhxjrPA(r rVar) {
        this.f14307j.setValue(rVar);
    }

    public final void setPositionProvider(r rVar) {
        this.f14305h = rVar;
    }

    public final void setTestTag(String str) {
        this.f14300c = str;
    }

    public final void t() {
        r r02;
        p pVar = this.f14309l;
        if (pVar != null && (r02 = m9getPopupContentSizebOM6tXw()) != null) {
            long j10 = r02.j();
            Rect rect = this.f14312o;
            this.f14302e.a(this.f14301d, rect);
            p f10 = b.j(rect);
            long a10 = s.a(f10.k(), f10.f());
            M m10 = new M();
            m10.f71758a = c1.n.f19226b.a();
            this.f14313p.o(this, f14297w, new h(m10, this, pVar, a10, j10));
            this.f14304g.x = c1.n.j(m10.f71758a);
            this.f14304g.y = c1.n.k(m10.f71758a);
            if (this.f14299b.c()) {
                this.f14302e.c(this, r.g(a10), r.f(a10));
            }
            this.f14302e.b(this.f14303f, this, this.f14304g);
        }
    }

    public l(C6787a aVar, s sVar, String str, View view, c1.d dVar, r rVar, UUID uuid, n nVar) {
        super(view.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.f14298a = aVar;
        this.f14299b = sVar;
        this.f14300c = str;
        this.f14301d = view;
        this.f14302e = nVar;
        Object systemService = view.getContext().getSystemService("window");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f14303f = (WindowManager) systemService;
        this.f14304g = h();
        this.f14305h = rVar;
        this.f14306i = t.Ltr;
        this.f14307j = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f14308k = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f14310m = p1.e(new f(this));
        float j10 = c1.h.j((float) 8);
        this.f14311n = j10;
        this.f14312o = new Rect();
        this.f14313p = new u(new g(this));
        setId(16908290);
        f0.b(this, f0.a(view));
        g0.b(this, g0.a(view));
        C2915g.b(this, C2915g.a(view));
        int i10 = m.f23099H;
        setTag(i10, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.t1(j10));
        setOutlineProvider(new a());
        this.f14315r = u1.d(g.f14273a.a(), (o1) null, 2, (Object) null);
        this.f14317t = new int[2];
    }
}
