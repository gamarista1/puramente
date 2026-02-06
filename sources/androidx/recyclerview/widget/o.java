package androidx.recyclerview.widget;

import android.view.View;

class o {

    /* renamed from: a  reason: collision with root package name */
    final b f18363a;

    /* renamed from: b  reason: collision with root package name */
    a f18364b = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f18365a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f18366b;

        /* renamed from: c  reason: collision with root package name */
        int f18367c;

        /* renamed from: d  reason: collision with root package name */
        int f18368d;

        /* renamed from: e  reason: collision with root package name */
        int f18369e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f18365a = i10 | this.f18365a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = this.f18365a;
            if ((i10 & 7) != 0 && (i10 & c(this.f18368d, this.f18366b)) == 0) {
                return false;
            }
            int i11 = this.f18365a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f18368d, this.f18367c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f18365a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f18369e, this.f18366b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f18365a;
            if ((i13 & 28672) == 0 || (i13 & (c(this.f18369e, this.f18367c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f18365a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11, int i12, int i13) {
            this.f18366b = i10;
            this.f18367c = i11;
            this.f18368d = i12;
            this.f18369e = i13;
        }
    }

    interface b {
        int a(View view);

        int b();

        int c();

        int d(View view);

        View getChildAt(int i10);
    }

    o(b bVar) {
        this.f18363a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int i14;
        int b10 = this.f18363a.b();
        int c10 = this.f18363a.c();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View childAt = this.f18363a.getChildAt(i10);
            this.f18364b.e(b10, c10, this.f18363a.a(childAt), this.f18363a.d(childAt));
            if (i12 != 0) {
                this.f18364b.d();
                this.f18364b.a(i12);
                if (this.f18364b.b()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                this.f18364b.d();
                this.f18364b.a(i13);
                if (this.f18364b.b()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f18364b.e(this.f18363a.b(), this.f18363a.c(), this.f18363a.a(view), this.f18363a.d(view));
        if (i10 == 0) {
            return false;
        }
        this.f18364b.d();
        this.f18364b.a(i10);
        return this.f18364b.b();
    }
}
