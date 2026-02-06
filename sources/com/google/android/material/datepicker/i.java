package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import y1.C2930A;

public final class i<S> extends q {

    /* renamed from: l  reason: collision with root package name */
    static final Object f55823l = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: m  reason: collision with root package name */
    static final Object f55824m = "NAVIGATION_PREV_TAG";

    /* renamed from: n  reason: collision with root package name */
    static final Object f55825n = "NAVIGATION_NEXT_TAG";

    /* renamed from: o  reason: collision with root package name */
    static final Object f55826o = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b  reason: collision with root package name */
    private int f55827b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public e f55828c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f55829d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public m f55830e;

    /* renamed from: f  reason: collision with root package name */
    private k f55831f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public c f55832g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f55833h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public RecyclerView f55834i;

    /* renamed from: j  reason: collision with root package name */
    private View f55835j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public View f55836k;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55837a;

        a(int i10) {
            this.f55837a = i10;
        }

        public void run() {
            i.this.f55834i.A1(this.f55837a);
        }
    }

    class b extends C1677a {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.v0((Object) null);
        }
    }

    class c extends s {

        /* renamed from: I  reason: collision with root package name */
        final /* synthetic */ int f55840I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f55840I = i11;
        }

        /* access modifiers changed from: protected */
        public void M1(RecyclerView.B b10, int[] iArr) {
            if (this.f55840I == 0) {
                iArr[0] = i.this.f55834i.getWidth();
                iArr[1] = i.this.f55834i.getWidth();
                return;
            }
            iArr[0] = i.this.f55834i.getHeight();
            iArr[1] = i.this.f55834i.getHeight();
        }
    }

    class d implements l {
        d() {
        }

        public void a(long j10) {
            if (i.this.f55829d.f().D(j10)) {
                i.this.f55828c.l0(j10);
                Iterator it = i.this.f55927a.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).b(i.this.f55828c.i0());
                }
                i.this.f55834i.getAdapter().j();
                if (i.this.f55833h != null) {
                    i.this.f55833h.getAdapter().j();
                }
            }
        }
    }

    class e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f55843a = u.l();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f55844b = u.l();

        e() {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            int i10;
            int i11;
            if ((recyclerView.getAdapter() instanceof v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                v vVar = (v) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (x1.d dVar : i.this.f55828c.Q()) {
                    Object obj = dVar.f28213a;
                    if (!(obj == null || dVar.f28214b == null)) {
                        this.f55843a.setTimeInMillis(((Long) obj).longValue());
                        this.f55844b.setTimeInMillis(((Long) dVar.f28214b).longValue());
                        int B10 = vVar.B(this.f55843a.get(1));
                        int B11 = vVar.B(this.f55844b.get(1));
                        View C10 = gridLayoutManager.C(B10);
                        View C11 = gridLayoutManager.C(B11);
                        int T22 = B10 / gridLayoutManager.T2();
                        int T23 = B11 / gridLayoutManager.T2();
                        for (int i12 = T22; i12 <= T23; i12++) {
                            View C12 = gridLayoutManager.C(gridLayoutManager.T2() * i12);
                            if (C12 != null) {
                                int top = C12.getTop() + i.this.f55832g.f55803d.c();
                                int bottom = C12.getBottom() - i.this.f55832g.f55803d.b();
                                if (i12 == T22) {
                                    i10 = C10.getLeft() + (C10.getWidth() / 2);
                                } else {
                                    i10 = 0;
                                }
                                if (i12 == T23) {
                                    i11 = C11.getLeft() + (C11.getWidth() / 2);
                                } else {
                                    i11 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) i10, (float) top, (float) i11, (float) bottom, i.this.f55832g.f55807h);
                            }
                        }
                    }
                }
            }
        }
    }

    class f extends C1677a {
        f() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            String str;
            super.onInitializeAccessibilityNodeInfo(view, a10);
            if (i.this.f55836k.getVisibility() == 0) {
                str = i.this.getString(Ua.h.f52883G);
            } else {
                str = i.this.getString(Ua.h.f52881E);
            }
            a10.F0(str);
        }
    }

    class g extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f55847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f55848b;

        g(o oVar, MaterialButton materialButton) {
            this.f55847a = oVar;
            this.f55848b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f55848b.getText());
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            int i12;
            if (i10 < 0) {
                i12 = i.this.T().Y1();
            } else {
                i12 = i.this.T().a2();
            }
            m unused = i.this.f55830e = this.f55847a.A(i12);
            this.f55848b.setText(this.f55847a.B(i12));
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            i.this.Y();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$i  reason: collision with other inner class name */
    class C0834i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f55851a;

        C0834i(o oVar) {
            this.f55851a = oVar;
        }

        public void onClick(View view) {
            int Y12 = i.this.T().Y1() + 1;
            if (Y12 < i.this.f55834i.getAdapter().e()) {
                i.this.W(this.f55851a.A(Y12));
            }
        }
    }

    class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f55853a;

        j(o oVar) {
            this.f55853a = oVar;
        }

        public void onClick(View view) {
            int a22 = i.this.T().a2() - 1;
            if (a22 >= 0) {
                i.this.W(this.f55853a.A(a22));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j10);
    }

    private void L(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(Ua.e.f52854z);
        materialButton.setTag(f55826o);
        C1680b0.o0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(Ua.e.f52806B);
        materialButton2.setTag(f55824m);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(Ua.e.f52805A);
        materialButton3.setTag(f55825n);
        this.f55835j = view.findViewById(Ua.e.f52813I);
        this.f55836k = view.findViewById(Ua.e.f52808D);
        X(k.DAY);
        materialButton.setText(this.f55830e.l());
        this.f55834i.n(new g(oVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new C0834i(oVar));
        materialButton2.setOnClickListener(new j(oVar));
    }

    private RecyclerView.o M() {
        return new e();
    }

    static int R(Context context) {
        return context.getResources().getDimensionPixelSize(Ua.c.f52797z);
    }

    private static int S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(Ua.c.f52761G) + resources.getDimensionPixelOffset(Ua.c.f52762H) + resources.getDimensionPixelOffset(Ua.c.f52760F);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(Ua.c.f52756B);
        int i10 = n.f55913f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(Ua.c.f52797z) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(Ua.c.f52759E)) + resources.getDimensionPixelOffset(Ua.c.f52795x);
    }

    public static i U(e eVar, int i10, a aVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", eVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.i());
        iVar.setArguments(bundle);
        return iVar;
    }

    private void V(int i10) {
        this.f55834i.post(new a(i10));
    }

    public boolean C(p pVar) {
        return super.C(pVar);
    }

    /* access modifiers changed from: package-private */
    public a N() {
        return this.f55829d;
    }

    /* access modifiers changed from: package-private */
    public c O() {
        return this.f55832g;
    }

    /* access modifiers changed from: package-private */
    public m P() {
        return this.f55830e;
    }

    public e Q() {
        return this.f55828c;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager T() {
        return (LinearLayoutManager) this.f55834i.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void W(m mVar) {
        boolean z10;
        o oVar = (o) this.f55834i.getAdapter();
        int C10 = oVar.C(mVar);
        int C11 = C10 - oVar.C(this.f55830e);
        boolean z11 = false;
        if (Math.abs(C11) > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (C11 > 0) {
            z11 = true;
        }
        this.f55830e = mVar;
        if (z10 && z11) {
            this.f55834i.r1(C10 - 3);
            V(C10);
        } else if (z10) {
            this.f55834i.r1(C10 + 3);
            V(C10);
        } else {
            V(C10);
        }
    }

    /* access modifiers changed from: package-private */
    public void X(k kVar) {
        this.f55831f = kVar;
        if (kVar == k.YEAR) {
            this.f55833h.getLayoutManager().x1(((v) this.f55833h.getAdapter()).B(this.f55830e.f55908c));
            this.f55835j.setVisibility(0);
            this.f55836k.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f55835j.setVisibility(8);
            this.f55836k.setVisibility(0);
            W(this.f55830e);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        k kVar = this.f55831f;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            X(k.DAY);
        } else if (kVar == k.DAY) {
            X(kVar2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f55827b = bundle.getInt("THEME_RES_ID_KEY");
        this.f55828c = (e) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f55829d = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f55830e = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f55827b);
        this.f55832g = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m j10 = this.f55829d.j();
        if (j.l0(contextThemeWrapper)) {
            i11 = Ua.g.f52872p;
            i10 = 1;
        } else {
            i11 = Ua.g.f52870n;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(S(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(Ua.e.f52809E);
        C1680b0.o0(gridView, new b());
        gridView.setAdapter(new h());
        gridView.setNumColumns(j10.f55909d);
        gridView.setEnabled(false);
        this.f55834i = (RecyclerView) inflate.findViewById(Ua.e.f52812H);
        this.f55834i.setLayoutManager(new c(getContext(), i10, false, i10));
        this.f55834i.setTag(f55823l);
        o oVar = new o(contextThemeWrapper, this.f55828c, this.f55829d, new d());
        this.f55834i.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(Ua.f.f52856b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(Ua.e.f52813I);
        this.f55833h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f55833h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f55833h.setAdapter(new v(this));
            this.f55833h.j(M());
        }
        if (inflate.findViewById(Ua.e.f52854z) != null) {
            L(inflate, oVar);
        }
        if (!j.l0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f55834i);
        }
        this.f55834i.r1(oVar.C(this.f55830e));
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f55827b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f55828c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f55829d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f55830e);
    }
}
