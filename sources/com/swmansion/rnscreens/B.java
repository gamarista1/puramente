package com.swmansion.rnscreens;

import Ef.m;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.swmansion.rnscreens.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import mf.C6565s;
import xd.d;

public final class B extends C4935t {

    /* renamed from: r  reason: collision with root package name */
    public static final a f59646r = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList f59647h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final Set f59648i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final List f59649j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List f59650k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private F f59651l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f59652m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f59653n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f59654o;

    /* renamed from: p  reason: collision with root package name */
    private int f59655p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f59656q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b(z zVar) {
            if (Build.VERSION.SDK_INT >= 33 || zVar.g().getStackAnimation() == r.d.SLIDE_FROM_BOTTOM || zVar.g().getStackAnimation() == r.d.FADE_FROM_BOTTOM || zVar.g().getStackAnimation() == r.d.IOS_FROM_RIGHT || zVar.g().getStackAnimation() == r.d.IOS_FROM_LEFT) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }

    private final class b {

        /* renamed from: a  reason: collision with root package name */
        private Canvas f59657a;

        /* renamed from: b  reason: collision with root package name */
        private View f59658b;

        /* renamed from: c  reason: collision with root package name */
        private long f59659c;

        public b() {
        }

        public final void a() {
            B.this.J(this);
            this.f59657a = null;
            this.f59658b = null;
            this.f59659c = 0;
        }

        public final Canvas b() {
            return this.f59657a;
        }

        public final View c() {
            return this.f59658b;
        }

        public final long d() {
            return this.f59659c;
        }

        public final void e(Canvas canvas) {
            this.f59657a = canvas;
        }

        public final void f(View view) {
            this.f59658b = view;
        }

        public final void g(long j10) {
            this.f59659c = j10;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59661a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f59662b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0057 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                com.swmansion.rnscreens.r$e[] r0 = com.swmansion.rnscreens.r.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.swmansion.rnscreens.r$e r2 = com.swmansion.rnscreens.r.e.FORM_SHEET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f59661a = r0
                com.swmansion.rnscreens.r$d[] r0 = com.swmansion.rnscreens.r.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.swmansion.rnscreens.r$d r2 = com.swmansion.rnscreens.r.d.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.NONE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.FADE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.SLIDE_FROM_RIGHT     // Catch:{ NoSuchFieldError -> 0x003c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.SLIDE_FROM_LEFT     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.SLIDE_FROM_BOTTOM     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.FADE_FROM_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0057 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0057 }
            L_0x0057:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.IOS_FROM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                com.swmansion.rnscreens.r$d r1 = com.swmansion.rnscreens.r.d.IOS_FROM_LEFT     // Catch:{ NoSuchFieldError -> 0x006b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006b }
            L_0x006b:
                f59662b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.B.c.<clinit>():void");
        }
    }

    public B(Context context) {
        super(context);
    }

    private final void E() {
        int f10 = n0.f(this);
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = n0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.h(new yd.r(f10, getId()));
        }
    }

    private final void F() {
        List<b> list = this.f59650k;
        this.f59650k = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f59649j.add(bVar);
        }
    }

    private final b G() {
        if (this.f59649j.isEmpty()) {
            return new b();
        }
        List list = this.f59649j;
        return (b) list.remove(C6565s.p(list));
    }

    /* access modifiers changed from: private */
    public static final void H(z zVar) {
        r g10;
        if (zVar != null && (g10 = zVar.g()) != null) {
            g10.bringToFront();
        }
    }

    /* access modifiers changed from: private */
    public final void J(b bVar) {
        Canvas b10 = bVar.b();
        C6496s.e(b10);
        super.drawChild(b10, bVar.c(), bVar.d());
    }

    private final void K(z zVar) {
        F f10;
        if (this.f59905a.size() > 1 && zVar != null && (f10 = this.f59651l) != null && f10.g().l()) {
            ArrayList arrayList = this.f59905a;
            for (z zVar2 : C6565s.U(C6565s.S0(arrayList, m.u(0, arrayList.size() - 1)))) {
                zVar2.g().d(4);
                if (C6496s.c(zVar2, zVar)) {
                    break;
                }
            }
        }
        r topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.d(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public F c(r rVar) {
        C6496s.h(rVar, "screen");
        if (c.f59661a[rVar.getStackPresentation().ordinal()] == 1) {
            return new d(new E(rVar));
        }
        return new E(rVar);
    }

    public final void D(F f10) {
        C6496s.h(f10, "screenFragment");
        this.f59648i.add(f10);
        v();
    }

    public final void I() {
        if (!this.f59652m) {
            E();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C6496s.h(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f59650k.size() < this.f59655p) {
            this.f59654o = false;
        }
        this.f59655p = this.f59650k.size();
        if (this.f59654o && this.f59650k.size() >= 2) {
            List list = this.f59650k;
            Collections.swap(list, list.size() - 1, this.f59650k.size() - 2);
        }
        F();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        C6496s.h(canvas, "canvas");
        C6496s.h(view, "child");
        List list = this.f59650k;
        b G10 = G();
        G10.e(canvas);
        G10.f(view);
        G10.g(j10);
        list.add(G10);
        return true;
    }

    public void endViewTransition(View view) {
        C6496s.h(view, "view");
        super.endViewTransition(view);
        if (this.f59652m) {
            this.f59652m = false;
            E();
        }
    }

    public final ArrayList<F> getFragments() {
        return this.f59647h;
    }

    public final boolean getGoingForward() {
        return this.f59656q;
    }

    public final r getRootScreen() {
        Object obj;
        r g10;
        Iterator it = this.f59905a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!C6565s.e0(this.f59648i, (z) obj)) {
                break;
            }
        }
        z zVar = (z) obj;
        if (zVar != null && (g10 = zVar.g()) != null) {
            return g10;
        }
        throw new IllegalStateException("[RNScreens] Stack has no root screen set");
    }

    public r getTopScreen() {
        F f10 = this.f59651l;
        if (f10 != null) {
            return f10.g();
        }
        return null;
    }

    public boolean n(z zVar) {
        if (!super.n(zVar) || C6565s.e0(this.f59648i, zVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void p() {
        for (F l10 : this.f59647h) {
            l10.l();
        }
    }

    public void removeView(View view) {
        C6496s.h(view, "view");
        if (this.f59653n) {
            this.f59653n = false;
            this.f59654o = true;
        }
        super.removeView(view);
    }

    public final void setGoingForward(boolean z10) {
        this.f59656q = z10;
    }

    public void startViewTransition(View view) {
        C6496s.h(view, "view");
        super.startViewTransition(view);
        this.f59652m = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026d A[LOOP:4: B:129:0x0267->B:131:0x026d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t() {
        /*
            r12 = this;
            r0 = 0
            r12.f59653n = r0
            java.util.ArrayList r1 = r12.f59905a
            int r1 = r1.size()
            int r1 = r1 + -1
            r2 = 0
            r3 = r2
            r4 = r3
            if (r1 < 0) goto L_0x0041
        L_0x0010:
            int r5 = r1 + -1
            com.swmansion.rnscreens.z r1 = r12.m(r1)
            java.util.Set r6 = r12.f59648i
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r6 = mf.C6565s.e0(r6, r1)
            if (r6 != 0) goto L_0x003c
            com.swmansion.rnscreens.r r6 = r1.g()
            com.swmansion.rnscreens.r$a r6 = r6.getActivityState()
            com.swmansion.rnscreens.r$a r7 = com.swmansion.rnscreens.r.a.INACTIVE
            if (r6 == r7) goto L_0x003c
            if (r3 != 0) goto L_0x0030
            r3 = r1
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            com.swmansion.rnscreens.r r1 = r1.g()
            boolean r1 = r1.l()
            if (r1 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            if (r5 >= 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r1 = r5
            goto L_0x0010
        L_0x0041:
            java.util.ArrayList r1 = r12.f59647h
            boolean r1 = mf.C6565s.e0(r1, r3)
            r5 = 1
            if (r1 != 0) goto L_0x0096
            com.swmansion.rnscreens.F r1 = r12.f59651l
            if (r1 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            if (r1 == 0) goto L_0x005c
            java.util.ArrayList r6 = r12.f59905a
            boolean r1 = r6.contains(r1)
            if (r1 != r5) goto L_0x005c
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = r0
        L_0x005d:
            com.swmansion.rnscreens.r r6 = r3.g()
            com.swmansion.rnscreens.r$c r6 = r6.getReplaceAnimation()
            com.swmansion.rnscreens.r$c r7 = com.swmansion.rnscreens.r.c.PUSH
            if (r6 != r7) goto L_0x006b
            r6 = r5
            goto L_0x006c
        L_0x006b:
            r6 = r0
        L_0x006c:
            if (r1 != 0) goto L_0x0073
            if (r6 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r1 = r0
            goto L_0x0074
        L_0x0073:
            r1 = r5
        L_0x0074:
            if (r1 == 0) goto L_0x007f
            com.swmansion.rnscreens.r r6 = r3.g()
        L_0x007a:
            com.swmansion.rnscreens.r$d r6 = r6.getStackAnimation()
            goto L_0x00b5
        L_0x007f:
            com.swmansion.rnscreens.F r6 = r12.f59651l
            if (r6 == 0) goto L_0x008a
            com.swmansion.rnscreens.r r6 = r6.g()
            if (r6 == 0) goto L_0x008a
            goto L_0x007a
        L_0x008a:
            r6 = r2
            goto L_0x00b5
        L_0x008c:
            if (r1 != 0) goto L_0x00b3
            if (r3 == 0) goto L_0x00b3
            com.swmansion.rnscreens.r$d r6 = com.swmansion.rnscreens.r.d.NONE
            r12.f59656q = r5
        L_0x0094:
            r1 = r5
            goto L_0x00b5
        L_0x0096:
            com.swmansion.rnscreens.F r1 = r12.f59651l
            if (r1 == 0) goto L_0x00b3
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x00b3
            com.swmansion.rnscreens.F r1 = r12.f59651l
            if (r1 == 0) goto L_0x00b0
            com.swmansion.rnscreens.r r1 = r1.g()
            if (r1 == 0) goto L_0x00b0
            com.swmansion.rnscreens.r$d r1 = r1.getStackAnimation()
            r6 = r1
            goto L_0x00b1
        L_0x00b0:
            r6 = r2
        L_0x00b1:
            r1 = r0
            goto L_0x00b5
        L_0x00b3:
            r6 = r2
            goto L_0x0094
        L_0x00b5:
            androidx.fragment.app.T r7 = r12.g()
            if (r6 == 0) goto L_0x0170
            if (r1 == 0) goto L_0x011a
            int[] r8 = com.swmansion.rnscreens.B.c.f59662b
            int r6 = r6.ordinal()
            r6 = r8[r6]
            switch(r6) {
                case 1: goto L_0x0112;
                case 2: goto L_0x010c;
                case 3: goto L_0x0104;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f2;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00e0;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00ce;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x00ce:
            int r6 = com.swmansion.rnscreens.C4931o.f59817l
            int r8 = com.swmansion.rnscreens.C4931o.f59815j
            r7.t(r6, r8)
            goto L_0x0170
        L_0x00d7:
            int r6 = com.swmansion.rnscreens.C4931o.f59821p
            int r8 = com.swmansion.rnscreens.C4931o.f59819n
            r7.t(r6, r8)
            goto L_0x0170
        L_0x00e0:
            int r6 = com.swmansion.rnscreens.C4931o.f59810e
            int r8 = com.swmansion.rnscreens.C4931o.f59824s
            r7.t(r6, r8)
            goto L_0x0170
        L_0x00e9:
            int r6 = com.swmansion.rnscreens.C4931o.f59826u
            int r8 = com.swmansion.rnscreens.C4931o.f59825t
            r7.t(r6, r8)
            goto L_0x0170
        L_0x00f2:
            int r6 = com.swmansion.rnscreens.C4931o.f59827v
            int r8 = com.swmansion.rnscreens.C4931o.f59831z
            r7.t(r6, r8)
            goto L_0x0170
        L_0x00fb:
            int r6 = com.swmansion.rnscreens.C4931o.f59828w
            int r8 = com.swmansion.rnscreens.C4931o.f59830y
            r7.t(r6, r8)
            goto L_0x0170
        L_0x0104:
            int r6 = com.swmansion.rnscreens.C4931o.f59811f
            int r8 = com.swmansion.rnscreens.C4931o.f59812g
            r7.t(r6, r8)
            goto L_0x0170
        L_0x010c:
            int r6 = com.swmansion.rnscreens.C4931o.f59822q
            r7.t(r6, r6)
            goto L_0x0170
        L_0x0112:
            int r6 = com.swmansion.rnscreens.C4931o.f59806a
            int r8 = com.swmansion.rnscreens.C4931o.f59807b
            r7.t(r6, r8)
            goto L_0x0170
        L_0x011a:
            int[] r8 = com.swmansion.rnscreens.B.c.f59662b
            int r6 = r6.ordinal()
            r6 = r8[r6]
            switch(r6) {
                case 1: goto L_0x0169;
                case 2: goto L_0x0163;
                case 3: goto L_0x015b;
                case 4: goto L_0x0153;
                case 5: goto L_0x014b;
                case 6: goto L_0x0143;
                case 7: goto L_0x013b;
                case 8: goto L_0x0133;
                case 9: goto L_0x012b;
                default: goto L_0x0125;
            }
        L_0x0125:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x012b:
            int r6 = com.swmansion.rnscreens.C4931o.f59814i
            int r8 = com.swmansion.rnscreens.C4931o.f59816k
            r7.t(r6, r8)
            goto L_0x0170
        L_0x0133:
            int r6 = com.swmansion.rnscreens.C4931o.f59818m
            int r8 = com.swmansion.rnscreens.C4931o.f59820o
            r7.t(r6, r8)
            goto L_0x0170
        L_0x013b:
            int r6 = com.swmansion.rnscreens.C4931o.f59823r
            int r8 = com.swmansion.rnscreens.C4931o.f59813h
            r7.t(r6, r8)
            goto L_0x0170
        L_0x0143:
            int r6 = com.swmansion.rnscreens.C4931o.f59825t
            int r8 = com.swmansion.rnscreens.C4931o.f59829x
            r7.t(r6, r8)
            goto L_0x0170
        L_0x014b:
            int r6 = com.swmansion.rnscreens.C4931o.f59828w
            int r8 = com.swmansion.rnscreens.C4931o.f59830y
            r7.t(r6, r8)
            goto L_0x0170
        L_0x0153:
            int r6 = com.swmansion.rnscreens.C4931o.f59827v
            int r8 = com.swmansion.rnscreens.C4931o.f59831z
            r7.t(r6, r8)
            goto L_0x0170
        L_0x015b:
            int r6 = com.swmansion.rnscreens.C4931o.f59811f
            int r8 = com.swmansion.rnscreens.C4931o.f59812g
            r7.t(r6, r8)
            goto L_0x0170
        L_0x0163:
            int r6 = com.swmansion.rnscreens.C4931o.f59822q
            r7.t(r6, r6)
            goto L_0x0170
        L_0x0169:
            int r6 = com.swmansion.rnscreens.C4931o.f59808c
            int r8 = com.swmansion.rnscreens.C4931o.f59809d
            r7.t(r6, r8)
        L_0x0170:
            r12.f59656q = r1
            if (r1 == 0) goto L_0x0182
            if (r3 == 0) goto L_0x0182
            com.swmansion.rnscreens.B$a r1 = f59646r
            boolean r1 = r1.b(r3)
            if (r1 == 0) goto L_0x0182
            if (r4 != 0) goto L_0x0182
            r12.f59653n = r5
        L_0x0182:
            java.util.ArrayList r1 = r12.f59647h
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r6 = "iterator(...)"
            kotlin.jvm.internal.C6496s.g(r1, r6)
        L_0x018d:
            boolean r8 = r1.hasNext()
            java.lang.String r9 = "next(...)"
            if (r8 == 0) goto L_0x01b6
            java.lang.Object r8 = r1.next()
            kotlin.jvm.internal.C6496s.g(r8, r9)
            com.swmansion.rnscreens.F r8 = (com.swmansion.rnscreens.F) r8
            java.util.ArrayList r9 = r12.f59905a
            boolean r9 = r9.contains(r8)
            if (r9 == 0) goto L_0x01ae
            java.util.Set r9 = r12.f59648i
            boolean r9 = r9.contains(r8)
            if (r9 == 0) goto L_0x018d
        L_0x01ae:
            androidx.fragment.app.q r8 = r8.c()
            r7.o(r8)
            goto L_0x018d
        L_0x01b6:
            java.util.ArrayList r1 = r12.f59905a
            java.util.Iterator r1 = r1.iterator()
            kotlin.jvm.internal.C6496s.g(r1, r6)
        L_0x01bf:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x01f1
            java.lang.Object r8 = r1.next()
            kotlin.jvm.internal.C6496s.g(r8, r9)
            com.swmansion.rnscreens.z r8 = (com.swmansion.rnscreens.z) r8
            if (r8 != r4) goto L_0x01d1
            goto L_0x01f1
        L_0x01d1:
            if (r8 == r3) goto L_0x01dd
            java.util.Set r10 = r12.f59648i
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r10 = mf.C6565s.e0(r10, r8)
            if (r10 == 0) goto L_0x01e9
        L_0x01dd:
            com.swmansion.rnscreens.r r10 = r8.g()
            com.swmansion.rnscreens.r$a r10 = r10.getActivityState()
            com.swmansion.rnscreens.r$a r11 = com.swmansion.rnscreens.r.a.INACTIVE
            if (r10 != r11) goto L_0x01bf
        L_0x01e9:
            androidx.fragment.app.q r8 = r8.c()
            r7.o(r8)
            goto L_0x01bf
        L_0x01f1:
            if (r4 == 0) goto L_0x022f
            androidx.fragment.app.q r1 = r4.c()
            boolean r1 = r1.isAdded()
            if (r1 != 0) goto L_0x022f
            java.util.ArrayList r1 = r12.f59905a
            java.util.Iterator r1 = r1.iterator()
            kotlin.jvm.internal.C6496s.g(r1, r6)
        L_0x0206:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0246
            java.lang.Object r6 = r1.next()
            kotlin.jvm.internal.C6496s.g(r6, r9)
            com.swmansion.rnscreens.z r6 = (com.swmansion.rnscreens.z) r6
            if (r5 == 0) goto L_0x021a
            if (r6 != r4) goto L_0x0206
            r5 = r0
        L_0x021a:
            int r8 = r12.getId()
            androidx.fragment.app.q r6 = r6.c()
            androidx.fragment.app.T r6 = r7.b(r8, r6)
            com.swmansion.rnscreens.A r8 = new com.swmansion.rnscreens.A
            r8.<init>(r3)
            r6.r(r8)
            goto L_0x0206
        L_0x022f:
            if (r3 == 0) goto L_0x0246
            androidx.fragment.app.q r0 = r3.c()
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L_0x0246
            int r0 = r12.getId()
            androidx.fragment.app.q r1 = r3.c()
            r7.b(r0, r1)
        L_0x0246:
            boolean r0 = r3 instanceof com.swmansion.rnscreens.F
            if (r0 == 0) goto L_0x024d
            r2 = r3
            com.swmansion.rnscreens.F r2 = (com.swmansion.rnscreens.F) r2
        L_0x024d:
            r12.f59651l = r2
            java.util.ArrayList r0 = r12.f59647h
            r0.clear()
            java.util.ArrayList r0 = r12.f59647h
            java.util.ArrayList r1 = r12.f59905a
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = mf.C6565s.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0267:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x027e
            java.lang.Object r3 = r1.next()
            com.swmansion.rnscreens.z r3 = (com.swmansion.rnscreens.z) r3
            java.lang.String r5 = "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragmentWrapper"
            kotlin.jvm.internal.C6496s.f(r3, r5)
            com.swmansion.rnscreens.F r3 = (com.swmansion.rnscreens.F) r3
            r2.add(r3)
            goto L_0x0267
        L_0x027e:
            r0.addAll(r2)
            r12.K(r4)
            r7.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.B.t():void");
    }

    public void w() {
        this.f59648i.clear();
        super.w();
    }

    public void y(int i10) {
        V.a(this.f59648i).remove(m(i10));
        super.y(i10);
    }
}
