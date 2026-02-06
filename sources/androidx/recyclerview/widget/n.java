package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class n extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f18358a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f18359b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.u f18360c = new a();

    class a extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        boolean f18361a = false;

        a() {
        }

        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f18361a) {
                this.f18361a = false;
                n.this.j();
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f18361a = true;
            }
        }
    }

    private void e() {
        this.f18358a.i1(this.f18360c);
        this.f18358a.setOnFlingListener((RecyclerView.s) null);
    }

    private void h() {
        if (this.f18358a.getOnFlingListener() == null) {
            this.f18358a.n(this.f18360c);
            this.f18358a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.A d10;
        int g10;
        if (!(pVar instanceof RecyclerView.A.b) || (d10 = d(pVar)) == null || (g10 = g(pVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        pVar.J1(d10);
        return true;
    }

    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f18358a.getLayoutManager();
        if (layoutManager == null || this.f18358a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f18358a.getMinFlingVelocity();
        if ((Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11)) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f18358a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                e();
            }
            this.f18358a = recyclerView;
            if (recyclerView != null) {
                h();
                this.f18359b = new Scroller(this.f18358a.getContext(), new DecelerateInterpolator());
                j();
            }
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    /* access modifiers changed from: protected */
    public abstract RecyclerView.A d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    /* access modifiers changed from: package-private */
    public void j() {
        RecyclerView.p layoutManager;
        View f10;
        RecyclerView recyclerView = this.f18358a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f10 = f(layoutManager)) != null) {
            int[] c10 = c(layoutManager, f10);
            int i10 = c10[0];
            if (i10 != 0 || c10[1] != 0) {
                this.f18358a.w1(i10, c10[1]);
            }
        }
    }
}
