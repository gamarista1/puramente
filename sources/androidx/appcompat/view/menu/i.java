package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C1712s;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11374a;

    /* renamed from: b  reason: collision with root package name */
    private final e f11375b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11376c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11377d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11378e;

    /* renamed from: f  reason: collision with root package name */
    private View f11379f;

    /* renamed from: g  reason: collision with root package name */
    private int f11380g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11381h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f11382i;

    /* renamed from: j  reason: collision with root package name */
    private h f11383j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f11384k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f11385l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.h a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f11374a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f11374a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = i.C2040d.f21293a
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r3 = r15.f11374a
            android.view.View r4 = r15.f11379f
            int r5 = r15.f11377d
            int r6 = r15.f11378e
            boolean r7 = r15.f11376c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x003d:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r9 = r15.f11374a
            androidx.appcompat.view.menu.e r10 = r15.f11375b
            android.view.View r11 = r15.f11379f
            int r12 = r15.f11377d
            int r13 = r15.f11378e
            boolean r14 = r15.f11376c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x004f:
            androidx.appcompat.view.menu.e r1 = r15.f11375b
            r0.k(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f11385l
            r0.u(r1)
            android.view.View r1 = r15.f11379f
            r0.p(r1)
            androidx.appcompat.view.menu.j$a r1 = r15.f11382i
            r0.e(r1)
            boolean r1 = r15.f11381h
            r0.r(r1)
            int r1 = r15.f11380g
            r0.s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():androidx.appcompat.view.menu.h");
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.v(z11);
        if (z10) {
            if ((C1712s.b(this.f11380g, this.f11379f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f11379f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f11374a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.b();
    }

    public void b() {
        if (d()) {
            this.f11383j.dismiss();
        }
    }

    public h c() {
        if (this.f11383j == null) {
            this.f11383j = a();
        }
        return this.f11383j;
    }

    public boolean d() {
        h hVar = this.f11383j;
        if (hVar == null || !hVar.c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f11383j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11384k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f11379f = view;
    }

    public void g(boolean z10) {
        this.f11381h = z10;
        h hVar = this.f11383j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f11380g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f11384k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f11382i = aVar;
        h hVar = this.f11383j;
        if (hVar != null) {
            hVar.e(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f11379f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f11379f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f11380g = 8388611;
        this.f11385l = new a();
        this.f11374a = context;
        this.f11375b = eVar;
        this.f11379f = view;
        this.f11376c = z10;
        this.f11377d = i10;
        this.f11378e = i11;
    }
}
