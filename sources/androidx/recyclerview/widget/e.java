package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import u1.o;

final class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal f18314e = new ThreadLocal();

    /* renamed from: f  reason: collision with root package name */
    static Comparator f18315f = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f18316a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    long f18317b;

    /* renamed from: c  reason: collision with root package name */
    long f18318c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f18319d = new ArrayList();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            boolean z10;
            boolean z11;
            RecyclerView recyclerView = cVar.f18327d;
            if (recyclerView == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar2.f18327d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                boolean z12 = cVar.f18324a;
                if (z12 == cVar2.f18324a) {
                    int i10 = cVar2.f18325b - cVar.f18325b;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = cVar.f18326c - cVar2.f18326c;
                    if (i11 != 0) {
                        return i11;
                    }
                    return 0;
                } else if (z12) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static class b implements RecyclerView.p.c {

        /* renamed from: a  reason: collision with root package name */
        int f18320a;

        /* renamed from: b  reason: collision with root package name */
        int f18321b;

        /* renamed from: c  reason: collision with root package name */
        int[] f18322c;

        /* renamed from: d  reason: collision with root package name */
        int f18323d;

        b() {
        }

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f18323d;
                int i13 = i12 * 2;
                int[] iArr = this.f18322c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f18322c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 4)];
                    this.f18322c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f18322c;
                iArr4[i13] = i10;
                iArr4[i13 + 1] = i11;
                this.f18323d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f18322c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f18323d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z10) {
            this.f18323d = 0;
            int[] iArr = this.f18322c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f18000n;
            if (recyclerView.f17998m != null && pVar != null && pVar.u0()) {
                if (z10) {
                    if (!recyclerView.f17983e.p()) {
                        pVar.p(recyclerView.f17998m.e(), this);
                    }
                } else if (!recyclerView.t0()) {
                    pVar.o(this.f18320a, this.f18321b, recyclerView.f17953B0, this);
                }
                int i10 = this.f18323d;
                if (i10 > pVar.f18121m) {
                    pVar.f18121m = i10;
                    pVar.f18122n = z10;
                    recyclerView.f17981c.P();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (this.f18322c != null) {
                int i11 = this.f18323d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f18322c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11) {
            this.f18320a = i10;
            this.f18321b = i11;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18324a;

        /* renamed from: b  reason: collision with root package name */
        public int f18325b;

        /* renamed from: c  reason: collision with root package name */
        public int f18326c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f18327d;

        /* renamed from: e  reason: collision with root package name */
        public int f18328e;

        c() {
        }

        public void a() {
            this.f18324a = false;
            this.f18325b = 0;
            this.f18326c = 0;
            this.f18327d = null;
            this.f18328e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        boolean z10;
        int size = this.f18316a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f18316a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f17951A0.c(recyclerView, false);
                i10 += recyclerView.f17951A0.f18323d;
            }
        }
        this.f18319d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f18316a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f17951A0;
                int abs = Math.abs(bVar.f18320a) + Math.abs(bVar.f18321b);
                for (int i14 = 0; i14 < bVar.f18323d * 2; i14 += 2) {
                    if (i12 >= this.f18319d.size()) {
                        cVar = new c();
                        this.f18319d.add(cVar);
                    } else {
                        cVar = (c) this.f18319d.get(i12);
                    }
                    int[] iArr = bVar.f18322c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f18324a = z10;
                    cVar.f18325b = abs;
                    cVar.f18326c = i15;
                    cVar.f18327d = recyclerView2;
                    cVar.f18328e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f18319d, f18315f);
    }

    private void c(c cVar, long j10) {
        long j11;
        if (cVar.f18324a) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j10;
        }
        RecyclerView.F i10 = i(cVar.f18327d, cVar.f18328e, j11);
        if (i10 != null && i10.f18067b != null && i10.t() && !i10.u()) {
            h((RecyclerView) i10.f18067b.get(), j10);
        }
    }

    private void d(long j10) {
        int i10 = 0;
        while (i10 < this.f18319d.size()) {
            c cVar = (c) this.f18319d.get(i10);
            if (cVar.f18327d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.f17984f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.F m02 = RecyclerView.m0(recyclerView.f17984f.i(i11));
            if (m02.f18068c == i10 && !m02.u()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView != null) {
            if (recyclerView.f17958E && recyclerView.f17984f.j() != 0) {
                recyclerView.e1();
            }
            b bVar = recyclerView.f17951A0;
            bVar.c(recyclerView, true);
            if (bVar.f18323d != 0) {
                try {
                    o.a("RV Nested Prefetch");
                    recyclerView.f17953B0.f(recyclerView.f17998m);
                    for (int i10 = 0; i10 < bVar.f18323d * 2; i10 += 2) {
                        i(recyclerView, bVar.f18322c[i10], j10);
                    }
                } finally {
                    o.b();
                }
            }
        }
    }

    private RecyclerView.F i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f17981c;
        try {
            recyclerView.O0();
            RecyclerView.F N10 = wVar.N(i10, false, j10);
            if (N10 != null) {
                if (!N10.t() || N10.u()) {
                    wVar.a(N10, false);
                } else {
                    wVar.G(N10.f18066a);
                }
            }
            return N10;
        } finally {
            recyclerView.Q0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        if (!RecyclerView.f17937U0 || !this.f18316a.contains(recyclerView)) {
            this.f18316a.add(recyclerView);
            return;
        }
        throw new IllegalStateException("RecyclerView already present in worker list!");
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f17937U0 && !this.f18316a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.f18317b == 0) {
                this.f18317b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f17951A0.e(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f18316a.remove(recyclerView);
        if (RecyclerView.f17937U0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void run() {
        try {
            o.a("RV Prefetch");
            if (!this.f18316a.isEmpty()) {
                int size = this.f18316a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f18316a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f18318c);
                    this.f18317b = 0;
                    o.b();
                }
            }
        } finally {
            this.f18317b = 0;
            o.b();
        }
    }
}
