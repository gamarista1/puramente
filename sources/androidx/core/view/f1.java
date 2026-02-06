package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.Y;

public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private final g f16079a;

    private static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f16080a;

        /* renamed from: b  reason: collision with root package name */
        private final O f16081b;

        a(Window window, O o10) {
            this.f16080a = window;
            this.f16081b = o10;
        }

        private void g(int i10) {
            if (i10 == 1) {
                h(4);
            } else if (i10 == 2) {
                h(2);
            } else if (i10 == 8) {
                this.f16081b.a();
            }
        }

        private void j(int i10) {
            if (i10 == 1) {
                k(4);
                l(1024);
            } else if (i10 == 2) {
                k(2);
            } else if (i10 == 8) {
                this.f16081b.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            this.f16080a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                k(6144);
            } else if (i10 == 1) {
                k(4096);
                h(2048);
            } else if (i10 == 2) {
                k(2048);
                h(4096);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    j(i11);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            View decorView = this.f16080a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void i(int i10) {
            this.f16080a.addFlags(i10);
        }

        /* access modifiers changed from: protected */
        public void k(int i10) {
            View decorView = this.f16080a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void l(int i10) {
            this.f16080a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, O o10) {
            super(window, o10);
        }

        public boolean b() {
            if ((this.f16080a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        public void d(boolean z10) {
            if (z10) {
                l(67108864);
                i(Integer.MIN_VALUE);
                h(8192);
                return;
            }
            k(8192);
        }
    }

    private static class c extends b {
        c(Window window, O o10) {
            super(window, o10);
        }

        public void c(boolean z10) {
            if (z10) {
                l(134217728);
                i(Integer.MIN_VALUE);
                h(16);
                return;
            }
            k(16);
        }
    }

    private static class e extends d {
        e(Window window, f1 f1Var, O o10) {
            super(window, f1Var, o10);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            this.f16083b.setSystemBarsBehavior(i10);
        }
    }

    private static class f extends e {
        f(Window window, f1 f1Var, O o10) {
            super(window, f1Var, o10);
        }

        public boolean b() {
            if ((this.f16083b.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    private static class g {
        g() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(int i10);

        public abstract boolean b();

        public void c(boolean z10) {
        }

        public abstract void d(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void e(int i10);

        /* access modifiers changed from: package-private */
        public abstract void f(int i10);
    }

    public f1(Window window, View view) {
        O o10 = new O(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f16079a = new f(window, this, o10);
        } else if (i10 >= 30) {
            this.f16079a = new d(window, this, o10);
        } else if (i10 >= 26) {
            this.f16079a = new c(window, o10);
        } else {
            this.f16079a = new b(window, o10);
        }
    }

    public void a(int i10) {
        this.f16079a.a(i10);
    }

    public boolean b() {
        return this.f16079a.b();
    }

    public void c(boolean z10) {
        this.f16079a.c(z10);
    }

    public void d(boolean z10) {
        this.f16079a.d(z10);
    }

    public void e(int i10) {
        this.f16079a.e(i10);
    }

    public void f(int i10) {
        this.f16079a.f(i10);
    }

    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        final f1 f16082a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f16083b;

        /* renamed from: c  reason: collision with root package name */
        final O f16084c;

        /* renamed from: d  reason: collision with root package name */
        private final Y f16085d;

        /* renamed from: e  reason: collision with root package name */
        protected Window f16086e;

        d(Window window, f1 f1Var, O o10) {
            this(window.getInsetsController(), f1Var, o10);
            this.f16086e = window;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f16084c.a();
            }
            this.f16083b.hide(i10 & -9);
        }

        public boolean b() {
            this.f16083b.setSystemBarsAppearance(0, 0);
            if ((this.f16083b.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
            return false;
        }

        public void c(boolean z10) {
            if (z10) {
                if (this.f16086e != null) {
                    g(16);
                }
                this.f16083b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f16086e != null) {
                h(16);
            }
            this.f16083b.setSystemBarsAppearance(0, 16);
        }

        public void d(boolean z10) {
            if (z10) {
                if (this.f16086e != null) {
                    g(8192);
                }
                this.f16083b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f16086e != null) {
                h(8192);
            }
            this.f16083b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            Window window = this.f16086e;
            if (window != null) {
                window.getDecorView().setTag(356039078, Integer.valueOf(i10));
                if (i10 == 0) {
                    h(6144);
                } else if (i10 == 1) {
                    h(4096);
                    g(2048);
                } else if (i10 == 2) {
                    h(2048);
                    g(4096);
                }
            } else {
                this.f16083b.setSystemBarsBehavior(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10) {
            if ((i10 & 8) != 0) {
                this.f16084c.b();
            }
            this.f16083b.show(i10 & -9);
        }

        /* access modifiers changed from: protected */
        public void g(int i10) {
            View decorView = this.f16086e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            View decorView = this.f16086e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, f1 f1Var, O o10) {
            this.f16085d = new Y();
            this.f16083b = windowInsetsController;
            this.f16082a = f1Var;
            this.f16084c = o10;
        }
    }
}
