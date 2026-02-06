package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class b {

    /* renamed from: a  reason: collision with root package name */
    final C0313b f18222a;

    /* renamed from: b  reason: collision with root package name */
    final a f18223b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List f18224c = new ArrayList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f18225a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f18226b;

        a() {
        }

        private void c() {
            if (this.f18226b == null) {
                this.f18226b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f18226b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f18225a &= ~(1 << i10);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            a aVar = this.f18226b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f18225a);
                }
                return Long.bitCount(this.f18225a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f18225a & ((1 << i10) - 1));
            } else {
                return aVar.b(i10 - 64) + Long.bitCount(this.f18225a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (i10 >= 64) {
                c();
                return this.f18226b.d(i10 - 64);
            } else if ((this.f18225a & (1 << i10)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, boolean z10) {
            boolean z11;
            if (i10 >= 64) {
                c();
                this.f18226b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f18225a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i10) - 1;
            this.f18225a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f18226b != null) {
                c();
                this.f18226b.e(0, z11);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i10) {
            boolean z10;
            if (i10 >= 64) {
                c();
                return this.f18226b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f18225a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (~j10);
            this.f18225a = j12;
            long j13 = j10 - 1;
            this.f18225a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f18226b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f18226b.f(0);
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f18225a = 0;
            a aVar = this.f18226b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f18226b.h(i10 - 64);
                return;
            }
            this.f18225a |= 1 << i10;
        }

        public String toString() {
            if (this.f18226b == null) {
                return Long.toBinaryString(this.f18225a);
            }
            return this.f18226b.toString() + "xx" + Long.toBinaryString(this.f18225a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    interface C0313b {
        void a(View view);

        RecyclerView.F b(View view);

        void c(int i10);

        void d(View view, int i10);

        void e();

        int f(View view);

        void g(View view);

        View getChildAt(int i10);

        int getChildCount();

        void h(int i10);

        void i(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(C0313b bVar) {
        this.f18222a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f18222a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int b10 = i10 - (i11 - this.f18223b.b(i11));
            if (b10 == 0) {
                while (this.f18223b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f18224c.add(view);
        this.f18222a.a(view);
    }

    private boolean t(View view) {
        if (!this.f18224c.remove(view)) {
            return false;
        }
        this.f18222a.g(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i10, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = this.f18222a.getChildCount();
        } else {
            i11 = h(i10);
        }
        this.f18223b.e(i11, z10);
        if (z10) {
            l(view);
        }
        this.f18222a.d(view, i11);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = this.f18222a.getChildCount();
        } else {
            i11 = h(i10);
        }
        this.f18223b.e(i11, z10);
        if (z10) {
            l(view);
        }
        this.f18222a.i(view, i11, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        int h10 = h(i10);
        this.f18223b.f(h10);
        this.f18222a.c(h10);
    }

    /* access modifiers changed from: package-private */
    public View e(int i10) {
        int size = this.f18224c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f18224c.get(i11);
            RecyclerView.F b10 = this.f18222a.b(view);
            if (b10.n() == i10 && !b10.u() && !b10.w()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f18222a.getChildAt(h(i10));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f18222a.getChildCount() - this.f18224c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i10) {
        return this.f18222a.getChildAt(i10);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f18222a.getChildCount();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int f10 = this.f18222a.f(view);
        if (f10 >= 0) {
            this.f18223b.h(f10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int f10 = this.f18222a.f(view);
        if (f10 != -1 && !this.f18223b.d(f10)) {
            return f10 - this.f18223b.b(f10);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f18224c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f18223b.g();
        for (int size = this.f18224c.size() - 1; size >= 0; size--) {
            this.f18222a.g((View) this.f18224c.get(size));
            this.f18224c.remove(size);
        }
        this.f18222a.e();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int f10 = this.f18222a.f(view);
        if (f10 >= 0) {
            if (this.f18223b.f(f10)) {
                t(view);
            }
            this.f18222a.h(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        int h10 = h(i10);
        View childAt = this.f18222a.getChildAt(h10);
        if (childAt != null) {
            if (this.f18223b.f(h10)) {
                t(childAt);
            }
            this.f18222a.h(h10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int f10 = this.f18222a.f(view);
        if (f10 == -1) {
            t(view);
            return true;
        } else if (!this.f18223b.d(f10)) {
            return false;
        } else {
            this.f18223b.f(f10);
            t(view);
            this.f18222a.h(f10);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int f10 = this.f18222a.f(view);
        if (f10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f18223b.d(f10)) {
            this.f18223b.a(f10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f18223b.toString() + ", hidden list:" + this.f18224c.size();
    }
}
