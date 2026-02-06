package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import java.util.Locale;

final class e extends RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    private f.i f18579a;

    /* renamed from: b  reason: collision with root package name */
    private final f f18580b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f18581c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f18582d;

    /* renamed from: e  reason: collision with root package name */
    private int f18583e;

    /* renamed from: f  reason: collision with root package name */
    private int f18584f;

    /* renamed from: g  reason: collision with root package name */
    private a f18585g = new a();

    /* renamed from: h  reason: collision with root package name */
    private int f18586h;

    /* renamed from: i  reason: collision with root package name */
    private int f18587i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f18588j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f18589k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f18590l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f18591m;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f18592a;

        /* renamed from: b  reason: collision with root package name */
        float f18593b;

        /* renamed from: c  reason: collision with root package name */
        int f18594c;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f18592a = -1;
            this.f18593b = 0.0f;
            this.f18594c = 0;
        }
    }

    e(f fVar) {
        this.f18580b = fVar;
        RecyclerView recyclerView = fVar.f18605j;
        this.f18581c = recyclerView;
        this.f18582d = (LinearLayoutManager) recyclerView.getLayoutManager();
        n();
    }

    private void c(int i10, float f10, int i11) {
        f.i iVar = this.f18579a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        f.i iVar = this.f18579a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f18583e != 3 || this.f18584f != 0) && this.f18584f != i10) {
            this.f18584f = i10;
            f.i iVar = this.f18579a;
            if (iVar != null) {
                iVar.a(i10);
            }
        }
    }

    private int f() {
        return this.f18582d.Y1();
    }

    private boolean k() {
        int i10 = this.f18583e;
        if (i10 == 1 || i10 == 4) {
            return true;
        }
        return false;
    }

    private void n() {
        this.f18583e = 0;
        this.f18584f = 0;
        this.f18585g.a();
        this.f18586h = -1;
        this.f18587i = -1;
        this.f18588j = false;
        this.f18589k = false;
        this.f18591m = false;
        this.f18590l = false;
    }

    private void p(boolean z10) {
        int i10;
        this.f18591m = z10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        this.f18583e = i10;
        int i11 = this.f18587i;
        if (i11 != -1) {
            this.f18586h = i11;
            this.f18587i = -1;
        } else if (this.f18586h == -1) {
            this.f18586h = f();
        }
        e(1);
    }

    private void q() {
        int i10;
        float f10;
        a aVar = this.f18585g;
        int Y12 = this.f18582d.Y1();
        aVar.f18592a = Y12;
        if (Y12 == -1) {
            aVar.a();
            return;
        }
        View C10 = this.f18582d.C(Y12);
        if (C10 == null) {
            aVar.a();
            return;
        }
        int a02 = this.f18582d.a0(C10);
        int j02 = this.f18582d.j0(C10);
        int m02 = this.f18582d.m0(C10);
        int H10 = this.f18582d.H(C10);
        ViewGroup.LayoutParams layoutParams = C10.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            a02 += marginLayoutParams.leftMargin;
            j02 += marginLayoutParams.rightMargin;
            m02 += marginLayoutParams.topMargin;
            H10 += marginLayoutParams.bottomMargin;
        }
        int height = C10.getHeight() + m02 + H10;
        int width = C10.getWidth() + a02 + j02;
        if (this.f18582d.l2() == 0) {
            i10 = (C10.getLeft() - a02) - this.f18581c.getPaddingLeft();
            if (this.f18580b.d()) {
                i10 = -i10;
            }
            height = width;
        } else {
            i10 = (C10.getTop() - m02) - this.f18581c.getPaddingTop();
        }
        int i11 = -i10;
        aVar.f18594c = i11;
        if (i11 >= 0) {
            if (height == 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) i11) / ((float) height);
            }
            aVar.f18593b = f10;
        } else if (new a(this.f18582d).d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f18594c)}));
        }
    }

    public void a(RecyclerView recyclerView, int i10) {
        if (!(this.f18583e == 1 && this.f18584f == 1) && i10 == 1) {
            p(false);
        } else if (!k() || i10 != 2) {
            if (k() && i10 == 0) {
                q();
                if (!this.f18589k) {
                    int i11 = this.f18585g.f18592a;
                    if (i11 != -1) {
                        c(i11, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f18585g;
                    if (aVar.f18594c == 0) {
                        int i12 = this.f18586h;
                        int i13 = aVar.f18592a;
                        if (i12 != i13) {
                            d(i13);
                        }
                    }
                }
                e(0);
                n();
            }
            if (this.f18583e == 2 && i10 == 0 && this.f18590l) {
                q();
                a aVar2 = this.f18585g;
                if (aVar2.f18594c == 0) {
                    int i14 = this.f18587i;
                    int i15 = aVar2.f18592a;
                    if (i14 != i15) {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        d(i15);
                    }
                    e(0);
                    n();
                }
            }
        } else if (this.f18589k) {
            e(2);
            this.f18588j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5 == r3.f18580b.d()) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f18589k = r4
            r3.q()
            boolean r0 = r3.f18588j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            r3.f18588j = r2
            if (r6 > 0) goto L_0x001f
            if (r6 != 0) goto L_0x0029
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.f r6 = r3.f18580b
            boolean r6 = r6.d()
            if (r5 != r6) goto L_0x0029
        L_0x001f:
            androidx.viewpager2.widget.e$a r5 = r3.f18585g
            int r6 = r5.f18594c
            if (r6 == 0) goto L_0x0029
            int r5 = r5.f18592a
            int r5 = r5 + r4
            goto L_0x002d
        L_0x0029:
            androidx.viewpager2.widget.e$a r5 = r3.f18585g
            int r5 = r5.f18592a
        L_0x002d:
            r3.f18587i = r5
            int r6 = r3.f18586h
            if (r6 == r5) goto L_0x0045
            r3.d(r5)
            goto L_0x0045
        L_0x0037:
            int r5 = r3.f18583e
            if (r5 != 0) goto L_0x0045
            androidx.viewpager2.widget.e$a r5 = r3.f18585g
            int r5 = r5.f18592a
            if (r5 != r1) goto L_0x0042
            r5 = r2
        L_0x0042:
            r3.d(r5)
        L_0x0045:
            androidx.viewpager2.widget.e$a r5 = r3.f18585g
            int r6 = r5.f18592a
            if (r6 != r1) goto L_0x004c
            r6 = r2
        L_0x004c:
            float r0 = r5.f18593b
            int r5 = r5.f18594c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f18585g
            int r6 = r5.f18592a
            int r0 = r3.f18587i
            if (r6 == r0) goto L_0x005d
            if (r0 != r1) goto L_0x006b
        L_0x005d:
            int r5 = r5.f18594c
            if (r5 != 0) goto L_0x006b
            int r5 = r3.f18584f
            if (r5 == r4) goto L_0x006b
            r3.e(r2)
            r3.n()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public double g() {
        q();
        a aVar = this.f18585g;
        return ((double) aVar.f18592a) + ((double) aVar.f18593b);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f18584f;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f18591m;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        if (this.f18584f == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f18590l = true;
    }

    /* access modifiers changed from: package-private */
    public void m(int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f18583e = i11;
        boolean z11 = false;
        this.f18591m = false;
        if (this.f18587i != i10) {
            z11 = true;
        }
        this.f18587i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(f.i iVar) {
        this.f18579a = iVar;
    }
}
