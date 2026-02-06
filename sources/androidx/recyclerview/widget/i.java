package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.p f18347a;

    /* renamed from: b  reason: collision with root package name */
    private int f18348b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f18349c;

    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, (a) null);
        }

        public int d(View view) {
            return this.f18347a.T(view) + ((RecyclerView.q) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f18347a.S(view) + qVar.leftMargin + qVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f18347a.R(view) + qVar.topMargin + qVar.bottomMargin;
        }

        public int g(View view) {
            return this.f18347a.Q(view) - ((RecyclerView.q) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f18347a.o0();
        }

        public int i() {
            return this.f18347a.o0() - this.f18347a.f0();
        }

        public int j() {
            return this.f18347a.f0();
        }

        public int k() {
            return this.f18347a.p0();
        }

        public int l() {
            return this.f18347a.X();
        }

        public int m() {
            return this.f18347a.e0();
        }

        public int n() {
            return (this.f18347a.o0() - this.f18347a.e0()) - this.f18347a.f0();
        }

        public int p(View view) {
            this.f18347a.n0(view, true, this.f18349c);
            return this.f18349c.right;
        }

        public int q(View view) {
            this.f18347a.n0(view, true, this.f18349c);
            return this.f18349c.left;
        }

        public void r(int i10) {
            this.f18347a.C0(i10);
        }
    }

    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, (a) null);
        }

        public int d(View view) {
            return this.f18347a.O(view) + ((RecyclerView.q) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f18347a.R(view) + qVar.topMargin + qVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f18347a.S(view) + qVar.leftMargin + qVar.rightMargin;
        }

        public int g(View view) {
            return this.f18347a.U(view) - ((RecyclerView.q) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f18347a.W();
        }

        public int i() {
            return this.f18347a.W() - this.f18347a.d0();
        }

        public int j() {
            return this.f18347a.d0();
        }

        public int k() {
            return this.f18347a.X();
        }

        public int l() {
            return this.f18347a.p0();
        }

        public int m() {
            return this.f18347a.g0();
        }

        public int n() {
            return (this.f18347a.W() - this.f18347a.g0()) - this.f18347a.d0();
        }

        public int p(View view) {
            this.f18347a.n0(view, true, this.f18349c);
            return this.f18349c.bottom;
        }

        public int q(View view) {
            this.f18347a.n0(view, true, this.f18349c);
            return this.f18349c.top;
        }

        public void r(int i10) {
            this.f18347a.D0(i10);
        }
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f18348b) {
            return 0;
        }
        return n() - this.f18348b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f18348b = n();
    }

    private i(RecyclerView.p pVar) {
        this.f18348b = Integer.MIN_VALUE;
        this.f18349c = new Rect();
        this.f18347a = pVar;
    }
}
