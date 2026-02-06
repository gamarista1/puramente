package vd;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.google.android.gms.common.api.a;
import com.swmansion.gesturehandler.react.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;

public final class i {

    /* renamed from: m  reason: collision with root package name */
    public static final a f61880m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private static final PointF f61881n = new PointF();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f61882o = new float[2];
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f61883p = new Matrix();

    /* renamed from: q  reason: collision with root package name */
    private static final float[] f61884q = new float[2];

    /* renamed from: r  reason: collision with root package name */
    private static final Comparator f61885r = new f();

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f61886a;

    /* renamed from: b  reason: collision with root package name */
    private final j f61887b;

    /* renamed from: c  reason: collision with root package name */
    private final D f61888c;

    /* renamed from: d  reason: collision with root package name */
    private float f61889d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f61890e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f61891f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f61892g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final HashSet f61893h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    private boolean f61894i;

    /* renamed from: j  reason: collision with root package name */
    private int f61895j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f61896k;

    /* renamed from: l  reason: collision with root package name */
    private int f61897l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean h(C5260d dVar, C5260d dVar2) {
            if (dVar == dVar2 || dVar.L0(dVar2) || dVar2.L0(dVar)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean i(int i10) {
            if (i10 == 3 || i10 == 1 || i10 == 5) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean j(float f10, float f11, View view) {
            if (0.0f > f10 || f10 > ((float) view.getWidth()) || 0.0f > f11 || f11 > ((float) view.getHeight())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean k(C5260d dVar, C5260d dVar2) {
            if (!dVar.Y(dVar2) || h(dVar, dVar2)) {
                return false;
            }
            if (dVar == dVar2 || (!dVar.a0() && dVar.S() != 4)) {
                return true;
            }
            return dVar.K0(dVar2);
        }

        /* access modifiers changed from: private */
        public final boolean l(C5260d dVar, C5260d dVar2) {
            if (dVar == dVar2 || (!dVar.N0(dVar2) && !dVar2.M0(dVar))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean m(View view, float[] fArr) {
            if ((!(view instanceof ViewGroup) || view.getBackground() != null) && j(fArr[0], fArr[1], view)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final void n(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f10 + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
            float scrollY = (f11 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] e10 = i.f61882o;
                e10[0] = scrollX;
                e10[1] = scrollY;
                matrix.invert(i.f61883p);
                i.f61883p.mapPoints(e10);
                float f12 = e10[0];
                scrollY = e10[1];
                scrollX = f12;
            }
            pointF.set(scrollX, scrollY);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61898a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                vd.v[] r0 = vd.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vd.v r1 = vd.v.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vd.v r1 = vd.v.BOX_ONLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                vd.v r1 = vd.v.BOX_NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                vd.v r1 = vd.v.AUTO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f61898a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vd.i.b.<clinit>():void");
        }
    }

    public i(ViewGroup viewGroup, j jVar, D d10) {
        C6496s.h(viewGroup, "wrapperView");
        C6496s.h(jVar, "handlerRegistry");
        C6496s.h(d10, "viewConfigHelper");
        this.f61886a = viewGroup;
        this.f61887b = jVar;
        this.f61888c = d10;
    }

    private final void C(C5260d dVar, View view) {
        if (!this.f61890e.contains(dVar)) {
            this.f61890e.add(dVar);
            dVar.w0(false);
            dVar.x0(false);
            dVar.v0(a.e.API_PRIORITY_OTHER);
            dVar.q0(view, this);
        }
    }

    private final boolean D(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        ArrayList a10 = this.f61887b.a(view);
        if (a10 != null) {
            synchronized (a10) {
                try {
                    Iterator it = a10.iterator();
                    C6496s.g(it, "iterator(...)");
                    z10 = false;
                    while (it.hasNext()) {
                        C5260d dVar = (C5260d) it.next();
                        if (dVar.d0()) {
                            if (dVar.g0(view, fArr[0], fArr[1])) {
                                if (!I(dVar, motionEvent.getAction())) {
                                    C(dVar, view);
                                    dVar.O0(i10);
                                    z10 = true;
                                }
                            }
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                } finally {
                }
            }
        } else {
            z10 = false;
        }
        float width = (float) view.getWidth();
        float f10 = fArr[0];
        if (0.0f <= f10 && f10 <= width) {
            float height = (float) view.getHeight();
            float f11 = fArr[1];
            if (0.0f <= f11 && f11 <= height && y(view) && p(view, fArr, i10)) {
                return true;
            }
        }
        return z10;
    }

    private final void E() {
        if (this.f61894i || this.f61895j != 0) {
            this.f61896k = true;
        } else {
            l();
        }
    }

    private final boolean G(C5260d dVar) {
        ArrayList<C5260d> arrayList = this.f61890e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C5260d dVar2 : arrayList) {
            if (dVar.Y(dVar2) && dVar2.S() == 4 && !f61880m.h(dVar, dVar2) && dVar.c0(dVar2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(C5260d dVar) {
        ArrayList<C5260d> arrayList = this.f61890e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C5260d dVar2 : arrayList) {
            if (f61880m.l(dVar, dVar2) && dVar2.S() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean I(C5260d dVar, int i10) {
        if ((dVar instanceof m) || (dVar instanceof k.b) || !C6565s.q(10, 9, 7).contains(Integer.valueOf(i10))) {
            return false;
        }
        return true;
    }

    private final boolean L(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        int i11 = b.f61898a[this.f61888c.a(view).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        if (view instanceof ViewGroup) {
                            z10 = r((ViewGroup) view, fArr, i10, motionEvent);
                        } else {
                            z10 = false;
                        }
                        if (D(view, fArr, i10, motionEvent) || z10 || f61880m.m(view, fArr)) {
                            return true;
                        }
                    } else {
                        throw new C6535s();
                    }
                } else if (view instanceof ViewGroup) {
                    boolean r10 = r((ViewGroup) view, fArr, i10, motionEvent);
                    if (!r10) {
                        return r10;
                    }
                    D(view, fArr, i10, motionEvent);
                    return r10;
                } else if (view instanceof EditText) {
                    return D(view, fArr, i10, motionEvent);
                }
            } else if (D(view, fArr, i10, motionEvent) || f61880m.m(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    private final void M(C5260d dVar) {
        if (H(dVar) || G(dVar)) {
            dVar.q();
        } else if (u(dVar)) {
            h(dVar);
        } else {
            z(dVar);
            dVar.x0(false);
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M g(C5260d dVar) {
        dVar.p();
        dVar.k();
        dVar.B();
        return C6514M.f71813a;
    }

    private final void h(C5260d dVar) {
        if (!this.f61891f.contains(dVar)) {
            this.f61891f.add(dVar);
            this.f61893h.add(Integer.valueOf(dVar.T()));
            dVar.x0(true);
            int i10 = this.f61897l;
            this.f61897l = i10 + 1;
            dVar.v0(i10);
        }
    }

    private final boolean i(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() < this.f61889d) {
            return false;
        }
        return true;
    }

    private final void j() {
        for (C5260d q10 : C6565s.e1(C6565s.V(this.f61891f))) {
            q10.q();
        }
        this.f61892g.clear();
        this.f61892g.addAll(this.f61890e);
        for (C5260d q11 : C6565s.V(this.f61890e)) {
            q11.q();
        }
    }

    private final void k() {
        for (C5260d dVar : C6565s.e1(this.f61891f)) {
            if (!dVar.a0()) {
                this.f61891f.remove(dVar);
                this.f61893h.remove(Integer.valueOf(dVar.T()));
            }
        }
    }

    private final void l() {
        for (C5260d dVar : C6565s.V(this.f61890e)) {
            if (f61880m.i(dVar.S()) && !dVar.a0()) {
                dVar.r0();
                dVar.w0(false);
                dVar.x0(false);
                dVar.v0(a.e.API_PRIORITY_OTHER);
            }
        }
        C6565s.K(this.f61890e, new g());
        this.f61896k = false;
    }

    /* access modifiers changed from: private */
    public static final boolean m(C5260d dVar) {
        C6496s.h(dVar, "it");
        if (!f61880m.i(dVar.S()) || dVar.a0()) {
            return false;
        }
        return true;
    }

    private final void n(C5260d dVar, MotionEvent motionEvent) {
        boolean z10;
        if (!x(dVar.W())) {
            dVar.q();
        } else if (dVar.S0(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            View W10 = dVar.W();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            C6496s.g(obtain, "obtain(...)");
            MotionEvent J10 = J(W10, obtain);
            if (dVar.N() && dVar.S() != 0) {
                dVar.R0(J10, motionEvent);
            }
            if (!dVar.a0() || actionMasked != 2) {
                if (dVar.S() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.X(J10, motionEvent);
                if (dVar.Z()) {
                    if (dVar.R()) {
                        dVar.H0(false);
                        dVar.t0();
                    }
                    dVar.v(J10);
                }
                if (dVar.N() && z10) {
                    dVar.R0(J10, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    dVar.P0(J10.getPointerId(J10.getActionIndex()));
                }
            }
            J10.recycle();
        }
    }

    private final void o(MotionEvent motionEvent) {
        this.f61892g.clear();
        this.f61892g.addAll(this.f61890e);
        C6565s.C(this.f61892g, f61885r);
        Iterator it = this.f61892g.iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            n((C5260d) it.next(), motionEvent);
        }
    }

    private final boolean p(View view, float[] fArr, int i10) {
        boolean z10 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList a10 = this.f61887b.a((View) parent);
                if (a10 != null) {
                    synchronized (a10) {
                        try {
                            Iterator it = a10.iterator();
                            C6496s.g(it, "iterator(...)");
                            while (it.hasNext()) {
                                C5260d dVar = (C5260d) it.next();
                                if (dVar.d0() && dVar.g0(view, fArr[0], fArr[1])) {
                                    C(dVar, viewGroup);
                                    dVar.O0(i10);
                                    z10 = true;
                                }
                            }
                            C6514M m10 = C6514M.f71813a;
                        } finally {
                        }
                    }
                }
            }
        }
        return z10;
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f61884q;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        L(this.f61886a, fArr, pointerId, motionEvent);
        r(this.f61886a, fArr, pointerId, motionEvent);
    }

    private final boolean r(ViewGroup viewGroup, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        float[] fArr2 = fArr;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View c10 = this.f61888c.c(viewGroup, childCount);
            if (i(c10)) {
                PointF pointF = f61881n;
                a aVar = f61880m;
                aVar.n(fArr2[0], fArr2[1], viewGroup, c10, pointF);
                float f10 = fArr2[0];
                float f11 = fArr2[1];
                fArr2[0] = pointF.x;
                fArr2[1] = pointF.y;
                if (!w(c10) || aVar.j(fArr2[0], fArr2[1], c10)) {
                    z10 = L(c10, fArr2, i10, motionEvent);
                } else {
                    int i11 = i10;
                    MotionEvent motionEvent2 = motionEvent;
                    z10 = false;
                }
                fArr2[0] = f10;
                fArr2[1] = f11;
                if (z10) {
                    return true;
                }
            } else {
                int i12 = i10;
                MotionEvent motionEvent3 = motionEvent;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final int t(C5260d dVar, C5260d dVar2) {
        if ((dVar.Z() && dVar2.Z()) || (dVar.a0() && dVar2.a0())) {
            return Integer.signum(dVar2.G() - dVar.G());
        }
        if (!dVar.Z()) {
            if (!dVar2.Z()) {
                if (!dVar.a0()) {
                    if (!dVar2.a0()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    private final boolean u(C5260d dVar) {
        ArrayList<C5260d> arrayList = this.f61890e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C5260d dVar2 : arrayList) {
            a aVar = f61880m;
            if (!aVar.i(dVar2.S()) && aVar.l(dVar, dVar2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(View view) {
        if (!(view instanceof ViewGroup) || this.f61888c.b((ViewGroup) view)) {
            return true;
        }
        return false;
    }

    private final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f61886a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f61886a) {
            parent = parent.getParent();
        }
        if (parent == this.f61886a) {
            return true;
        }
        return false;
    }

    private final boolean y(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f61882o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + ((float) view.getLeft());
        float top = fArr[1] + ((float) view.getTop());
        if (left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight())) {
            return true;
        }
        return false;
    }

    private final void z(C5260d dVar) {
        int S10 = dVar.S();
        dVar.x0(false);
        dVar.w0(true);
        dVar.H0(true);
        int i10 = this.f61897l;
        this.f61897l = i10 + 1;
        dVar.v0(i10);
        for (C5260d dVar2 : C6565s.V(this.f61890e)) {
            if (f61880m.k(dVar2, dVar)) {
                dVar2.q();
            }
        }
        for (C5260d dVar3 : C6565s.V(this.f61891f)) {
            if (f61880m.k(dVar3, dVar)) {
                dVar3.x0(false);
            }
        }
        k();
        if (S10 != 1 && S10 != 3) {
            dVar.w(4, 2);
            if (S10 != 4) {
                dVar.w(5, 4);
                if (S10 != 5) {
                    dVar.w(0, 5);
                }
            }
        }
    }

    public final void A(C5260d dVar, int i10, int i11) {
        C6496s.h(dVar, "handler");
        this.f61895j++;
        if (f61880m.i(i10)) {
            for (C5260d dVar2 : C6565s.e1(this.f61891f)) {
                if (f61880m.l(dVar2, dVar) && this.f61893h.contains(Integer.valueOf(dVar2.T()))) {
                    if (i10 == 5) {
                        dVar2.q();
                        if (dVar2.S() == 5) {
                            dVar2.w(3, 2);
                        }
                        dVar2.x0(false);
                    } else {
                        M(dVar2);
                    }
                }
            }
            k();
        }
        if (i10 == 4) {
            M(dVar);
        } else if (i11 == 4 || i11 == 5) {
            if (dVar.Z()) {
                dVar.w(i10, i11);
            } else if (i11 == 4 && (i10 == 3 || i10 == 1)) {
                dVar.w(i10, 2);
            }
        } else if (!(i11 == 0 && i10 == 3)) {
            dVar.w(i10, i11);
        }
        this.f61895j--;
        E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 7) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r0 = 1
            r3.f61894i = r0
            int r1 = r4.getActionMasked()
            if (r1 == 0) goto L_0x001c
            r2 = 3
            if (r1 == r2) goto L_0x0018
            r2 = 5
            if (r1 == r2) goto L_0x001c
            r2 = 7
            if (r1 == r2) goto L_0x001c
            goto L_0x001f
        L_0x0018:
            r3.j()
            goto L_0x001f
        L_0x001c:
            r3.q(r4)
        L_0x001f:
            r3.o(r4)
            r4 = 0
            r3.f61894i = r4
            boolean r4 = r3.f61896k
            if (r4 == 0) goto L_0x0030
            int r4 = r3.f61895j
            if (r4 != 0) goto L_0x0030
            r3.l()
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.i.B(android.view.MotionEvent):boolean");
    }

    public final void F(float f10) {
        this.f61889d = f10;
    }

    public final MotionEvent J(View view, MotionEvent motionEvent) {
        ViewGroup viewGroup;
        C6496s.h(motionEvent, "event");
        if (view == null) {
            return motionEvent;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (!C6496s.c(viewGroup, this.f61886a)) {
            J(viewGroup, motionEvent);
        }
        if (viewGroup != null) {
            motionEvent.setLocation((motionEvent.getX() + ((float) viewGroup.getScrollX())) - ((float) view.getLeft()), (motionEvent.getY() + ((float) viewGroup.getScrollY())) - ((float) view.getTop()));
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f61883p;
            matrix.invert(matrix2);
            motionEvent.transform(matrix2);
        }
        return motionEvent;
    }

    public final PointF K(View view, PointF pointF) {
        ViewGroup viewGroup;
        C6496s.h(pointF, "point");
        if (view == null) {
            return pointF;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (!C6496s.c(viewGroup, this.f61886a)) {
            K(viewGroup, pointF);
        }
        if (viewGroup != null) {
            pointF.x += (float) (viewGroup.getScrollX() - view.getLeft());
            pointF.y += (float) (viewGroup.getScrollY() - view.getTop());
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f61883p;
            matrix.invert(matrix2);
            float[] fArr = f61884q;
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
            matrix2.mapPoints(fArr);
            pointF.x = fArr[0];
            pointF.y = fArr[1];
        }
        return pointF;
    }

    public final void f(View view) {
        C6496s.h(view, "view");
        ArrayList<C5260d> a10 = this.f61887b.a(view);
        if (a10 != null) {
            for (C5260d dVar : a10) {
                if (dVar instanceof q) {
                    C(dVar, view);
                    dVar.T0(new h(dVar));
                }
            }
        }
    }

    public final ArrayList s(View view) {
        C6496s.h(view, "view");
        return this.f61887b.a(view);
    }

    public final boolean v() {
        ArrayList<C5260d> arrayList = this.f61890e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (C5260d S10 : arrayList) {
            if (S10.S() == 4) {
                return true;
            }
        }
        return false;
    }
}
