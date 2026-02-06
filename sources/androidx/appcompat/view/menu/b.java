package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.U;
import androidx.appcompat.widget.V;
import androidx.core.view.C1712s;
import i.C2040d;
import i.C2043g;
import java.util.ArrayList;
import java.util.List;

final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B  reason: collision with root package name */
    private static final int f11256B = C2043g.f21398e;

    /* renamed from: A  reason: collision with root package name */
    boolean f11257A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11258b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11259c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11260d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11261e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11262f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f11263g;

    /* renamed from: h  reason: collision with root package name */
    private final List f11264h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List f11265i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f11266j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f11267k = new C0212b();

    /* renamed from: l  reason: collision with root package name */
    private final U f11268l = new c();

    /* renamed from: m  reason: collision with root package name */
    private int f11269m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f11270n = 0;

    /* renamed from: o  reason: collision with root package name */
    private View f11271o;

    /* renamed from: p  reason: collision with root package name */
    View f11272p;

    /* renamed from: q  reason: collision with root package name */
    private int f11273q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11274r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11275s;

    /* renamed from: t  reason: collision with root package name */
    private int f11276t;

    /* renamed from: u  reason: collision with root package name */
    private int f11277u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11278v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f11279w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f11280x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f11281y;

    /* renamed from: z  reason: collision with root package name */
    private PopupWindow.OnDismissListener f11282z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (b.this.c() && b.this.f11265i.size() > 0 && !((d) b.this.f11265i.get(0)).f11290a.B()) {
                View view = b.this.f11272p;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f11265i) {
                    dVar.f11290a.b();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    class C0212b implements View.OnAttachStateChangeListener {
        C0212b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f11281y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f11281y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f11281y.removeGlobalOnLayoutListener(bVar.f11266j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements U {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f11286a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f11287b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f11288c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f11286a = dVar;
                this.f11287b = menuItem;
                this.f11288c = eVar;
            }

            public void run() {
                d dVar = this.f11286a;
                if (dVar != null) {
                    b.this.f11257A = true;
                    dVar.f11291b.e(false);
                    b.this.f11257A = false;
                }
                if (this.f11287b.isEnabled() && this.f11287b.hasSubMenu()) {
                    this.f11288c.M(this.f11287b, 4);
                }
            }
        }

        c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(androidx.appcompat.view.menu.e r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r0 = r0.f11263g
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List r0 = r0.f11265i
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.b.this
                java.util.List r4 = r4.f11265i
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
                androidx.appcompat.view.menu.e r4 = r4.f11291b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List r0 = r0.f11265i
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List r0 = r0.f11265i
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            L_0x0041:
                androidx.appcompat.view.menu.b$c$a r0 = new androidx.appcompat.view.menu.b$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.b.this
                android.os.Handler r7 = r7.f11263g
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.d(androidx.appcompat.view.menu.e, android.view.MenuItem):void");
        }

        public void n(e eVar, MenuItem menuItem) {
            b.this.f11263g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final V f11290a;

        /* renamed from: b  reason: collision with root package name */
        public final e f11291b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11292c;

        public d(V v10, e eVar, int i10) {
            this.f11290a = v10;
            this.f11291b = eVar;
            this.f11292c = i10;
        }

        public ListView a() {
            return this.f11290a.o();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f11258b = context;
        this.f11271o = view;
        this.f11260d = i10;
        this.f11261e = i11;
        this.f11262f = z10;
        this.f11278v = false;
        this.f11273q = D();
        Resources resources = context.getResources();
        this.f11259c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2040d.f21294b));
        this.f11263g = new Handler();
    }

    private int A(e eVar) {
        int size = this.f11265i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f11265i.get(i10)).f11291b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        int i10;
        d dVar2;
        int firstVisiblePosition;
        MenuItem B10 = B(dVar.f11291b, eVar);
        if (B10 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (B10 == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        if (this.f11271o.getLayoutDirection() == 1) {
            return 0;
        }
        return 1;
    }

    private int E(int i10) {
        List list = this.f11265i;
        ListView a10 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f11272p.getWindowVisibleDisplayFrame(rect);
        if (this.f11273q == 1) {
            if (iArr[0] + a10.getWidth() + i10 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i10 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void F(e eVar) {
        View view;
        d dVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f11258b);
        d dVar2 = new d(eVar, from, this.f11262f, f11256B);
        if (!c() && this.f11278v) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int n10 = h.n(dVar2, (ViewGroup) null, this.f11258b, this.f11259c);
        V z11 = z();
        z11.m(dVar2);
        z11.F(n10);
        z11.G(this.f11270n);
        if (this.f11265i.size() > 0) {
            List list = this.f11265i;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z11.U(false);
            z11.R((Object) null);
            int E10 = E(n10);
            if (E10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11273q = E10;
            if (Build.VERSION.SDK_INT >= 26) {
                z11.D(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f11271o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f11270n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f11271o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f11270n & 5) != 5) {
                if (z10) {
                    n10 = view.getWidth();
                }
                i12 = i10 - n10;
                z11.e(i12);
                z11.M(true);
                z11.i(i11);
            } else if (!z10) {
                n10 = view.getWidth();
                i12 = i10 - n10;
                z11.e(i12);
                z11.M(true);
                z11.i(i11);
            }
            i12 = i10 + n10;
            z11.e(i12);
            z11.M(true);
            z11.i(i11);
        } else {
            if (this.f11274r) {
                z11.e(this.f11276t);
            }
            if (this.f11275s) {
                z11.i(this.f11277u);
            }
            z11.H(m());
        }
        this.f11265i.add(new d(z11, eVar, this.f11273q));
        z11.b();
        ListView o10 = z11.o();
        o10.setOnKeyListener(this);
        if (dVar == null && this.f11279w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C2043g.f21405l, o10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            o10.addHeaderView(frameLayout, (Object) null, false);
            z11.b();
        }
    }

    private V z() {
        V v10 = new V(this.f11258b, (AttributeSet) null, this.f11260d, this.f11261e);
        v10.T(this.f11268l);
        v10.L(this);
        v10.K(this);
        v10.D(this.f11271o);
        v10.G(this.f11270n);
        v10.J(true);
        v10.I(2);
        return v10;
    }

    public void a(e eVar, boolean z10) {
        int A10 = A(eVar);
        if (A10 >= 0) {
            int i10 = A10 + 1;
            if (i10 < this.f11265i.size()) {
                ((d) this.f11265i.get(i10)).f11291b.e(false);
            }
            d dVar = (d) this.f11265i.remove(A10);
            dVar.f11291b.P(this);
            if (this.f11257A) {
                dVar.f11290a.S((Object) null);
                dVar.f11290a.E(0);
            }
            dVar.f11290a.dismiss();
            int size = this.f11265i.size();
            if (size > 0) {
                this.f11273q = ((d) this.f11265i.get(size - 1)).f11292c;
            } else {
                this.f11273q = D();
            }
            if (size == 0) {
                dismiss();
                j.a aVar = this.f11280x;
                if (aVar != null) {
                    aVar.a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f11281y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f11281y.removeGlobalOnLayoutListener(this.f11266j);
                    }
                    this.f11281y = null;
                }
                this.f11272p.removeOnAttachStateChangeListener(this.f11267k);
                this.f11282z.onDismiss();
            } else if (z10) {
                ((d) this.f11265i.get(0)).f11291b.e(false);
            }
        }
    }

    public void b() {
        boolean z10;
        if (!c()) {
            for (e F10 : this.f11264h) {
                F(F10);
            }
            this.f11264h.clear();
            View view = this.f11271o;
            this.f11272p = view;
            if (view != null) {
                if (this.f11281y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f11281y = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f11266j);
                }
                this.f11272p.addOnAttachStateChangeListener(this.f11267k);
            }
        }
    }

    public boolean c() {
        if (this.f11265i.size() <= 0 || !((d) this.f11265i.get(0)).f11290a.c()) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        int size = this.f11265i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f11265i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f11290a.c()) {
                    dVar.f11290a.dismiss();
                }
            }
        }
    }

    public void e(j.a aVar) {
        this.f11280x = aVar;
    }

    public boolean f(m mVar) {
        for (d dVar : this.f11265i) {
            if (mVar == dVar.f11291b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.f11280x;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    public void g(boolean z10) {
        for (d a10 : this.f11265i) {
            h.y(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public void k(e eVar) {
        eVar.c(this, this.f11258b);
        if (c()) {
            F(eVar);
        } else {
            this.f11264h.add(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    public ListView o() {
        if (this.f11265i.isEmpty()) {
            return null;
        }
        List list = this.f11265i;
        return ((d) list.get(list.size() - 1)).a();
    }

    public void onDismiss() {
        d dVar;
        int size = this.f11265i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f11265i.get(i10);
            if (!dVar.f11290a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f11291b.e(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(View view) {
        if (this.f11271o != view) {
            this.f11271o = view;
            this.f11270n = C1712s.b(this.f11269m, view.getLayoutDirection());
        }
    }

    public void r(boolean z10) {
        this.f11278v = z10;
    }

    public void s(int i10) {
        if (this.f11269m != i10) {
            this.f11269m = i10;
            this.f11270n = C1712s.b(i10, this.f11271o.getLayoutDirection());
        }
    }

    public void t(int i10) {
        this.f11274r = true;
        this.f11276t = i10;
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f11282z = onDismissListener;
    }

    public void v(boolean z10) {
        this.f11279w = z10;
    }

    public void w(int i10) {
        this.f11275s = true;
        this.f11277u = i10;
    }
}
