package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;
import x1.e;

final class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private e f18210a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList f18211b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f18212c;

    /* renamed from: d  reason: collision with root package name */
    final C0312a f18213d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f18214e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f18215f;

    /* renamed from: g  reason: collision with root package name */
    final h f18216g;

    /* renamed from: h  reason: collision with root package name */
    private int f18217h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    interface C0312a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.F f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f18218a;

        /* renamed from: b  reason: collision with root package name */
        int f18219b;

        /* renamed from: c  reason: collision with root package name */
        Object f18220c;

        /* renamed from: d  reason: collision with root package name */
        int f18221d;

        b(int i10, int i11, int i12, Object obj) {
            this.f18218a = i10;
            this.f18219b = i11;
            this.f18221d = i12;
            this.f18220c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i10 = this.f18218a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 == 4) {
                return "up";
            }
            if (i10 != 8) {
                return "??";
            }
            return "mv";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f18218a;
            if (i10 != bVar.f18218a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f18221d - this.f18219b) == 1 && this.f18221d == bVar.f18219b && this.f18219b == bVar.f18221d) {
                return true;
            }
            if (this.f18221d != bVar.f18221d || this.f18219b != bVar.f18219b) {
                return false;
            }
            Object obj2 = this.f18220c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f18220c)) {
                    return false;
                }
            } else if (bVar.f18220c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f18218a * 31) + this.f18219b) * 31) + this.f18221d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f18219b + "c:" + this.f18221d + ",p:" + this.f18220c + "]";
        }
    }

    a(C0312a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        t(bVar);
    }

    private void d(b bVar) {
        t(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z10;
        boolean z11;
        int i10 = bVar.f18219b;
        int i11 = bVar.f18221d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f18213d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    t(a(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f18221d) {
            b(bVar);
            bVar = a(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f18219b;
        int i11 = bVar.f18221d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f18213d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f18220c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    t(a(4, i13, i12, bVar.f18220c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f18221d) {
            Object obj = bVar.f18220c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (!z10) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f18212c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f18212c.get(i11);
            int i12 = bVar.f18218a;
            if (i12 == 8) {
                if (n(bVar.f18221d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f18219b;
                int i14 = bVar.f18221d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f18218a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int x10 = x(bVar.f18219b, i11);
        int i12 = bVar.f18219b;
        int i13 = bVar.f18218a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f18221d; i15++) {
            int x11 = x(bVar.f18219b + (i10 * i15), bVar.f18218a);
            int i16 = bVar.f18218a;
            if (i16 == 2 ? x11 != x10 : !(i16 == 4 && x11 == x10 + 1)) {
                b a10 = a(i16, x10, i14, bVar.f18220c);
                l(a10, i12);
                b(a10);
                if (bVar.f18218a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                x10 = x11;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f18220c;
        b(bVar);
        if (i14 > 0) {
            b a11 = a(bVar.f18218a, x10, i14, obj);
            l(a11, i12);
            b(a11);
        }
    }

    private void t(b bVar) {
        this.f18212c.add(bVar);
        int i10 = bVar.f18218a;
        if (i10 == 1) {
            this.f18213d.g(bVar.f18219b, bVar.f18221d);
        } else if (i10 == 2) {
            this.f18213d.d(bVar.f18219b, bVar.f18221d);
        } else if (i10 == 4) {
            this.f18213d.e(bVar.f18219b, bVar.f18221d, bVar.f18220c);
        } else if (i10 == 8) {
            this.f18213d.a(bVar.f18219b, bVar.f18221d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int x(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f18212c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f18212c.get(size);
            int i14 = bVar.f18218a;
            if (i14 == 8) {
                int i15 = bVar.f18219b;
                int i16 = bVar.f18221d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f18219b = i15 + 1;
                            bVar.f18221d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f18219b = i15 - 1;
                            bVar.f18221d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f18221d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f18221d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f18219b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f18219b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f18219b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f18221d;
                    } else if (i14 == 2) {
                        i10 += bVar.f18221d;
                    }
                } else if (i11 == 1) {
                    bVar.f18219b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f18219b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f18212c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f18212c.get(size2);
            if (bVar2.f18218a == 8) {
                int i18 = bVar2.f18221d;
                if (i18 == bVar2.f18219b || i18 < 0) {
                    this.f18212c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f18221d <= 0) {
                this.f18212c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f18210a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f18218a = i10;
        bVar.f18219b = i11;
        bVar.f18221d = i12;
        bVar.f18220c = obj;
        return bVar;
    }

    public void b(b bVar) {
        if (!this.f18215f) {
            bVar.f18220c = null;
            this.f18210a.a(bVar);
        }
    }

    public int e(int i10) {
        int size = this.f18211b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f18211b.get(i11);
            int i12 = bVar.f18218a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f18219b;
                    if (i13 <= i10) {
                        int i14 = bVar.f18221d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f18219b;
                    if (i15 == i10) {
                        i10 = bVar.f18221d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f18221d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f18219b <= i10) {
                i10 += bVar.f18221d;
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f18212c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18213d.c((b) this.f18212c.get(i10));
        }
        v(this.f18212c);
        this.f18217h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f18211b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f18211b.get(i10);
            int i11 = bVar.f18218a;
            if (i11 == 1) {
                this.f18213d.c(bVar);
                this.f18213d.g(bVar.f18219b, bVar.f18221d);
            } else if (i11 == 2) {
                this.f18213d.c(bVar);
                this.f18213d.h(bVar.f18219b, bVar.f18221d);
            } else if (i11 == 4) {
                this.f18213d.c(bVar);
                this.f18213d.e(bVar.f18219b, bVar.f18221d, bVar.f18220c);
            } else if (i11 == 8) {
                this.f18213d.c(bVar);
                this.f18213d.a(bVar.f18219b, bVar.f18221d);
            }
            Runnable runnable = this.f18214e;
            if (runnable != null) {
                runnable.run();
            }
        }
        v(this.f18211b);
        this.f18217h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i10) {
        this.f18213d.b(bVar);
        int i11 = bVar.f18218a;
        if (i11 == 2) {
            this.f18213d.h(i10, bVar.f18221d);
        } else if (i11 == 4) {
            this.f18213d.e(i10, bVar.f18221d, bVar.f18220c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i10, int i11) {
        int size = this.f18212c.size();
        while (i11 < size) {
            b bVar = (b) this.f18212c.get(i11);
            int i12 = bVar.f18218a;
            if (i12 == 8) {
                int i13 = bVar.f18219b;
                if (i13 == i10) {
                    i10 = bVar.f18221d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f18221d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f18219b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f18221d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f18221d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i10) {
        if ((i10 & this.f18217h) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        if (this.f18211b.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        if (this.f18212c.isEmpty() || this.f18211b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f18211b.add(a(1, i10, i11, (Object) null));
        this.f18217h |= 1;
        if (this.f18211b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f18211b.add(a(2, i10, i11, (Object) null));
        this.f18217h |= 2;
        if (this.f18211b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.f18216g.b(this.f18211b);
        int size = this.f18211b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f18211b.get(i10);
            int i11 = bVar.f18218a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f18214e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f18211b.clear();
    }

    /* access modifiers changed from: package-private */
    public void v(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void w() {
        v(this.f18211b);
        v(this.f18212c);
        this.f18217h = 0;
    }

    a(C0312a aVar, boolean z10) {
        this.f18210a = new Pools$SimplePool(30);
        this.f18211b = new ArrayList();
        this.f18212c = new ArrayList();
        this.f18217h = 0;
        this.f18213d = aVar;
        this.f18215f = z10;
        this.f18216g = new h(this);
    }
}
