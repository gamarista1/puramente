package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1700l0;
import androidx.core.view.C1702m0;
import androidx.core.view.C1704n0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList f11204a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private long f11205b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f11206c;

    /* renamed from: d  reason: collision with root package name */
    C1702m0 f11207d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11208e;

    /* renamed from: f  reason: collision with root package name */
    private final C1704n0 f11209f = new a();

    class a extends C1704n0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11210a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f11211b = 0;

        a() {
        }

        public void b(View view) {
            int i10 = this.f11211b + 1;
            this.f11211b = i10;
            if (i10 == h.this.f11204a.size()) {
                C1702m0 m0Var = h.this.f11207d;
                if (m0Var != null) {
                    m0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f11210a) {
                this.f11210a = true;
                C1702m0 m0Var = h.this.f11207d;
                if (m0Var != null) {
                    m0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f11211b = 0;
            this.f11210a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f11208e) {
            Iterator it = this.f11204a.iterator();
            while (it.hasNext()) {
                ((C1700l0) it.next()).c();
            }
            this.f11208e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f11208e = false;
    }

    public h c(C1700l0 l0Var) {
        if (!this.f11208e) {
            this.f11204a.add(l0Var);
        }
        return this;
    }

    public h d(C1700l0 l0Var, C1700l0 l0Var2) {
        this.f11204a.add(l0Var);
        l0Var2.j(l0Var.d());
        this.f11204a.add(l0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f11208e) {
            this.f11205b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f11208e) {
            this.f11206c = interpolator;
        }
        return this;
    }

    public h g(C1702m0 m0Var) {
        if (!this.f11208e) {
            this.f11207d = m0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f11208e) {
            Iterator it = this.f11204a.iterator();
            while (it.hasNext()) {
                C1700l0 l0Var = (C1700l0) it.next();
                long j10 = this.f11205b;
                if (j10 >= 0) {
                    l0Var.f(j10);
                }
                Interpolator interpolator = this.f11206c;
                if (interpolator != null) {
                    l0Var.g(interpolator);
                }
                if (this.f11207d != null) {
                    l0Var.h(this.f11209f);
                }
                l0Var.l();
            }
            this.f11208e = true;
        }
    }
}
