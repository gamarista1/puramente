package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class m extends RecyclerView.m {

    /* renamed from: g  reason: collision with root package name */
    boolean f18357g = true;

    public final void A(RecyclerView.F f10) {
        I(f10);
        h(f10);
    }

    public final void B(RecyclerView.F f10) {
        J(f10);
    }

    public final void C(RecyclerView.F f10, boolean z10) {
        K(f10, z10);
        h(f10);
    }

    public final void D(RecyclerView.F f10, boolean z10) {
        L(f10, z10);
    }

    public final void E(RecyclerView.F f10) {
        M(f10);
        h(f10);
    }

    public final void F(RecyclerView.F f10) {
        N(f10);
    }

    public final void G(RecyclerView.F f10) {
        O(f10);
        h(f10);
    }

    public final void H(RecyclerView.F f10) {
        P(f10);
    }

    public void I(RecyclerView.F f10) {
    }

    public void J(RecyclerView.F f10) {
    }

    public void K(RecyclerView.F f10, boolean z10) {
    }

    public void L(RecyclerView.F f10, boolean z10) {
    }

    public void M(RecyclerView.F f10) {
    }

    public void N(RecyclerView.F f10) {
    }

    public void O(RecyclerView.F f10) {
    }

    public void P(RecyclerView.F f10) {
    }

    public boolean a(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        if (bVar == null || ((i10 = bVar.f18104a) == (i11 = bVar2.f18104a) && bVar.f18105b == bVar2.f18105b)) {
            return w(f10);
        }
        return y(f10, i10, bVar.f18105b, i11, bVar2.f18105b);
    }

    public boolean b(RecyclerView.F f10, RecyclerView.F f11, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f18104a;
        int i13 = bVar.f18105b;
        if (f11.K()) {
            int i14 = bVar.f18104a;
            i10 = bVar.f18105b;
            i11 = i14;
        } else {
            i11 = bVar2.f18104a;
            i10 = bVar2.f18105b;
        }
        return x(f10, f11, i12, i13, i11, i10);
    }

    public boolean c(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f18104a;
        int i13 = bVar.f18105b;
        View view = f10.f18066a;
        if (bVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = bVar2.f18104a;
        }
        int i14 = i10;
        if (bVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = bVar2.f18105b;
        }
        int i15 = i11;
        if (f10.w() || (i12 == i14 && i13 == i15)) {
            return z(f10);
        }
        view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
        return y(f10, i12, i13, i14, i15);
    }

    public boolean d(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i10 = bVar.f18104a;
        int i11 = bVar2.f18104a;
        if (i10 == i11 && bVar.f18105b == bVar2.f18105b) {
            E(f10);
            return false;
        }
        return y(f10, i10, bVar.f18105b, i11, bVar2.f18105b);
    }

    public boolean f(RecyclerView.F f10) {
        if (!this.f18357g || f10.u()) {
            return true;
        }
        return false;
    }

    public abstract boolean w(RecyclerView.F f10);

    public abstract boolean x(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.F f10, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.F f10);
}
