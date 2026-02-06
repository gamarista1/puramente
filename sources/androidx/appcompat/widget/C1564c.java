package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C1679b;
import i.C2037a;
import i.C2043g;
import java.util.ArrayList;
import q1.C2429a;

/* renamed from: androidx.appcompat.widget.c  reason: case insensitive filesystem */
class C1564c extends androidx.appcompat.view.menu.a implements C1679b.a {

    /* renamed from: A  reason: collision with root package name */
    C0214c f11837A;

    /* renamed from: B  reason: collision with root package name */
    private b f11838B;

    /* renamed from: C  reason: collision with root package name */
    final f f11839C = new f();

    /* renamed from: D  reason: collision with root package name */
    int f11840D;

    /* renamed from: k  reason: collision with root package name */
    d f11841k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f11842l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11843m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11844n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11845o;

    /* renamed from: p  reason: collision with root package name */
    private int f11846p;

    /* renamed from: q  reason: collision with root package name */
    private int f11847q;

    /* renamed from: r  reason: collision with root package name */
    private int f11848r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11849s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11850t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11851u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11852v;

    /* renamed from: w  reason: collision with root package name */
    private int f11853w;

    /* renamed from: x  reason: collision with root package name */
    private final SparseBooleanArray f11854x = new SparseBooleanArray();

    /* renamed from: y  reason: collision with root package name */
    e f11855y;

    /* renamed from: z  reason: collision with root package name */
    a f11856z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, C2037a.f21266i);
            if (!((g) mVar.getItem()).l()) {
                View view2 = C1564c.this.f11841k;
                f(view2 == null ? (View) C1564c.this.f11254i : view2);
            }
            j(C1564c.this.f11839C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            C1564c cVar = C1564c.this;
            cVar.f11856z = null;
            cVar.f11840D = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        public n.e a() {
            a aVar = C1564c.this.f11856z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    private class C0214c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f11859a;

        public C0214c(e eVar) {
            this.f11859a = eVar;
        }

        public void run() {
            if (C1564c.this.f11248c != null) {
                C1564c.this.f11248c.d();
            }
            View view = (View) C1564c.this.f11254i;
            if (!(view == null || view.getWindowToken() == null || !this.f11859a.m())) {
                C1564c.this.f11855y = this.f11859a;
            }
            C1564c.this.f11837A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends Q {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C1564c f11862j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, C1564c cVar) {
                super(view);
                this.f11862j = cVar;
            }

            public n.e b() {
                e eVar = C1564c.this.f11855y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                C1564c.this.K();
                return true;
            }

            public boolean d() {
                C1564c cVar = C1564c.this;
                if (cVar.f11837A != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, C2037a.f21265h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            l0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C1564c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1564c.this.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C2429a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, C2037a.f21266i);
            h(8388613);
            j(C1564c.this.f11839C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (C1564c.this.f11248c != null) {
                C1564c.this.f11248c.close();
            }
            C1564c.this.f11855y = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements j.a {
        f() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof m) {
                eVar.D().e(false);
            }
            j.a m10 = C1564c.this.m();
            if (m10 != null) {
                m10.a(eVar, z10);
            }
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == C1564c.this.f11248c) {
                return false;
            }
            C1564c.this.f11840D = ((m) eVar).getItem().getItemId();
            j.a m10 = C1564c.this.m();
            if (m10 != null) {
                return m10.b(eVar);
            }
            return false;
        }
    }

    public C1564c(Context context) {
        super(context, C2043g.f21396c, C2043g.f21395b);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f11254i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f11841k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f11843m) {
            return this.f11842l;
        }
        return null;
    }

    public boolean B() {
        k kVar;
        C0214c cVar = this.f11837A;
        if (cVar == null || (kVar = this.f11254i) == null) {
            e eVar = this.f11855y;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f11837A = null;
        return true;
    }

    public boolean C() {
        a aVar = this.f11856z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        if (this.f11837A != null || E()) {
            return true;
        }
        return false;
    }

    public boolean E() {
        e eVar = this.f11855y;
        if (eVar == null || !eVar.d()) {
            return false;
        }
        return true;
    }

    public void F(Configuration configuration) {
        if (!this.f11849s) {
            this.f11848r = androidx.appcompat.view.a.b(this.f11247b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f11248c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z10) {
        this.f11852v = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f11254i = actionMenuView;
        actionMenuView.a(this.f11248c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f11841k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f11843m = true;
        this.f11842l = drawable;
    }

    public void J(boolean z10) {
        this.f11844n = z10;
        this.f11845o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f11844n || E() || (eVar = this.f11248c) == null || this.f11254i == null || this.f11837A != null || eVar.z().isEmpty()) {
            return false;
        }
        C0214c cVar = new C0214c(new e(this.f11247b, this.f11248c, this.f11841k, true));
        this.f11837A = cVar;
        ((View) this.f11254i).post(cVar);
        return true;
    }

    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.a(eVar, z10);
    }

    public void c(g gVar, k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f11254i);
        if (this.f11838B == null) {
            this.f11838B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f11838B);
    }

    public boolean f(m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (mVar2.f0() != this.f11248c) {
            mVar2 = (m) mVar2.f0();
        }
        View z11 = z(mVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.f11840D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f11247b, mVar, z11);
        this.f11856z = aVar;
        aVar.g(z10);
        this.f11856z.k();
        super.f(mVar);
        return true;
    }

    public void g(boolean z10) {
        ArrayList arrayList;
        k kVar;
        super.g(z10);
        ((View) this.f11254i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f11248c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1679b a10 = ((g) s10.get(i10)).a();
                if (a10 != null) {
                    a10.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f11248c;
        if (eVar2 != null) {
            arrayList = eVar2.z();
        } else {
            arrayList = null;
        }
        if (this.f11844n && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z11 = !((g) arrayList.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f11841k == null) {
                this.f11841k = new d(this.f11246a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f11841k.getParent();
            if (viewGroup != this.f11254i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f11841k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f11254i;
                actionMenuView.addView(this.f11841k, actionMenuView.F());
            }
        } else {
            d dVar = this.f11841k;
            if (dVar != null && dVar.getParent() == (kVar = this.f11254i)) {
                ((ViewGroup) kVar).removeView(this.f11841k);
            }
        }
        ((ActionMenuView) this.f11254i).setOverflowReserved(this.f11844n);
    }

    public boolean h() {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        C1564c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f11248c;
        View view = null;
        boolean z13 = false;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = cVar.f11848r;
        int i15 = cVar.f11847q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f11254i;
        boolean z14 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            g gVar = (g) arrayList.get(i18);
            if (gVar.o()) {
                i16++;
            } else if (gVar.n()) {
                i17++;
            } else {
                z14 = true;
            }
            if (cVar.f11852v && gVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (cVar.f11844n && (z14 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = cVar.f11854x;
        sparseBooleanArray.clear();
        if (cVar.f11850t) {
            int i20 = cVar.f11853w;
            i11 = i15 / i20;
            i12 = i20 + ((i15 % i20) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            g gVar2 = (g) arrayList.get(i21);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.f11850t) {
                    i11 -= ActionMenuView.L(n10, i12, i11, makeMeasureSpec, z13 ? 1 : 0);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = z13;
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z15 = sparseBooleanArray.get(groupId2);
                if ((i19 > 0 || z15) && i15 > 0 && (!cVar.f11850t || i11 > 0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z16 = z11;
                i13 = i10;
                if (z11) {
                    View n11 = cVar.n(gVar2, (View) null, viewGroup);
                    if (cVar.f11850t) {
                        int L10 = ActionMenuView.L(n11, i12, i11, makeMeasureSpec, 0);
                        i11 -= L10;
                        if (L10 == 0) {
                            z16 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z17 = z16;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    if (!cVar.f11850t ? i15 + i22 <= 0 : i15 < 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    z11 = z17 & z12;
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z15) {
                    sparseBooleanArray.put(groupId2, false);
                    int i23 = 0;
                    while (i23 < i21) {
                        g gVar3 = (g) arrayList.get(i23);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i19++;
                            }
                            gVar3.u(false);
                        }
                        i23++;
                    }
                }
                if (z11) {
                    i19--;
                }
                gVar2.u(z11);
                z10 = false;
            } else {
                z10 = z13;
                i13 = i10;
                gVar2.u(z10);
            }
            i21++;
            z13 = z10;
            i10 = i13;
            view = null;
            cVar = this;
        }
        return true;
    }

    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        super.j(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f11845o) {
            this.f11844n = b10.f();
        }
        if (!this.f11851u) {
            this.f11846p = b10.c();
        }
        if (!this.f11849s) {
            this.f11848r = b10.d();
        }
        int i10 = this.f11846p;
        if (this.f11844n) {
            if (this.f11841k == null) {
                d dVar = new d(this.f11246a);
                this.f11841k = dVar;
                if (this.f11843m) {
                    dVar.setImageDrawable(this.f11842l);
                    this.f11842l = null;
                    this.f11843m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f11841k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f11841k.getMeasuredWidth();
        } else {
            this.f11841k = null;
        }
        this.f11847q = i10;
        this.f11853w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f11841k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        int i10;
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        if (gVar.isActionViewExpanded()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        actionView.setVisibility(i10);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public k o(ViewGroup viewGroup) {
        k kVar = this.f11254i;
        k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    public boolean q(int i10, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
