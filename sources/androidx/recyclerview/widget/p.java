package androidx.recyclerview.widget;

import androidx.collection.C1607v;
import androidx.collection.Y;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import x1.e;

class p {

    /* renamed from: a  reason: collision with root package name */
    final Y f18370a = new Y();

    /* renamed from: b  reason: collision with root package name */
    final C1607v f18371b = new C1607v();

    static class a {

        /* renamed from: d  reason: collision with root package name */
        static e f18372d = new Pools$SimplePool(20);

        /* renamed from: a  reason: collision with root package name */
        int f18373a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.b f18374b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.b f18375c;

        private a() {
        }

        static void a() {
            do {
            } while (f18372d.b() != null);
        }

        static a b() {
            a aVar = (a) f18372d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        static void c(a aVar) {
            aVar.f18373a = 0;
            aVar.f18374b = null;
            aVar.f18375c = null;
            f18372d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void b(RecyclerView.F f10);

        void c(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    p() {
    }

    private RecyclerView.m.b l(RecyclerView.F f10, int i10) {
        a aVar;
        RecyclerView.m.b bVar;
        int e10 = this.f18370a.e(f10);
        if (e10 >= 0 && (aVar = (a) this.f18370a.n(e10)) != null) {
            int i11 = aVar.f18373a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f18373a = i12;
                if (i10 == 4) {
                    bVar = aVar.f18374b;
                } else if (i10 == 8) {
                    bVar = aVar.f18375c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f18370a.k(e10);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.F f10, RecyclerView.m.b bVar) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f18370a.put(f10, aVar);
        }
        aVar.f18373a |= 2;
        aVar.f18374b = bVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.F f10) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f18370a.put(f10, aVar);
        }
        aVar.f18373a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.F f10) {
        this.f18371b.j(j10, f10);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.F f10, RecyclerView.m.b bVar) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f18370a.put(f10, aVar);
        }
        aVar.f18375c = bVar;
        aVar.f18373a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.F f10, RecyclerView.m.b bVar) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f18370a.put(f10, aVar);
        }
        aVar.f18374b = bVar;
        aVar.f18373a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f18370a.clear();
        this.f18371b.a();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.F g(long j10) {
        return (RecyclerView.F) this.f18371b.e(j10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.F f10) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar == null || (aVar.f18373a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.F f10) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar == null || (aVar.f18373a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.F f10) {
        p(f10);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.m.b m(RecyclerView.F f10) {
        return l(f10, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.m.b n(RecyclerView.F f10) {
        return l(f10, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f18370a.size() - 1; size >= 0; size--) {
            RecyclerView.F f10 = (RecyclerView.F) this.f18370a.i(size);
            a aVar = (a) this.f18370a.k(size);
            int i10 = aVar.f18373a;
            if ((i10 & 3) == 3) {
                bVar.b(f10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f18374b;
                if (bVar2 == null) {
                    bVar.b(f10);
                } else {
                    bVar.c(f10, bVar2, aVar.f18375c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(f10, aVar.f18374b, aVar.f18375c);
            } else if ((i10 & 12) == 12) {
                bVar.d(f10, aVar.f18374b, aVar.f18375c);
            } else if ((i10 & 4) != 0) {
                bVar.c(f10, aVar.f18374b, (RecyclerView.m.b) null);
            } else if ((i10 & 8) != 0) {
                bVar.a(f10, aVar.f18374b, aVar.f18375c);
            }
            a.c(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.F f10) {
        a aVar = (a) this.f18370a.get(f10);
        if (aVar != null) {
            aVar.f18373a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.F f10) {
        int m10 = this.f18371b.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (f10 == this.f18371b.o(m10)) {
                this.f18371b.l(m10);
                break;
            } else {
                m10--;
            }
        }
        a aVar = (a) this.f18370a.remove(f10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
