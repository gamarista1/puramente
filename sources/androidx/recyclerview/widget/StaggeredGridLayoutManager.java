package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A  reason: collision with root package name */
    boolean f18154A = false;

    /* renamed from: B  reason: collision with root package name */
    private BitSet f18155B;

    /* renamed from: C  reason: collision with root package name */
    int f18156C = -1;

    /* renamed from: D  reason: collision with root package name */
    int f18157D = Integer.MIN_VALUE;

    /* renamed from: E  reason: collision with root package name */
    d f18158E = new d();

    /* renamed from: F  reason: collision with root package name */
    private int f18159F = 2;

    /* renamed from: G  reason: collision with root package name */
    private boolean f18160G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f18161H;

    /* renamed from: I  reason: collision with root package name */
    private e f18162I;

    /* renamed from: J  reason: collision with root package name */
    private int f18163J;

    /* renamed from: K  reason: collision with root package name */
    private final Rect f18164K = new Rect();

    /* renamed from: L  reason: collision with root package name */
    private final b f18165L = new b();

    /* renamed from: M  reason: collision with root package name */
    private boolean f18166M = false;

    /* renamed from: N  reason: collision with root package name */
    private boolean f18167N = true;

    /* renamed from: O  reason: collision with root package name */
    private int[] f18168O;

    /* renamed from: P  reason: collision with root package name */
    private final Runnable f18169P = new a();

    /* renamed from: s  reason: collision with root package name */
    private int f18170s = -1;

    /* renamed from: t  reason: collision with root package name */
    f[] f18171t;

    /* renamed from: u  reason: collision with root package name */
    i f18172u;

    /* renamed from: v  reason: collision with root package name */
    i f18173v;

    /* renamed from: w  reason: collision with root package name */
    private int f18174w;

    /* renamed from: x  reason: collision with root package name */
    private int f18175x;

    /* renamed from: y  reason: collision with root package name */
    private final f f18176y;

    /* renamed from: z  reason: collision with root package name */
    boolean f18177z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f18179a;

        /* renamed from: b  reason: collision with root package name */
        int f18180b;

        /* renamed from: c  reason: collision with root package name */
        boolean f18181c;

        /* renamed from: d  reason: collision with root package name */
        boolean f18182d;

        /* renamed from: e  reason: collision with root package name */
        boolean f18183e;

        /* renamed from: f  reason: collision with root package name */
        int[] f18184f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10;
            if (this.f18181c) {
                i10 = StaggeredGridLayoutManager.this.f18172u.i();
            } else {
                i10 = StaggeredGridLayoutManager.this.f18172u.m();
            }
            this.f18180b = i10;
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (this.f18181c) {
                this.f18180b = StaggeredGridLayoutManager.this.f18172u.i() - i10;
            } else {
                this.f18180b = StaggeredGridLayoutManager.this.f18172u.m() + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f18179a = -1;
            this.f18180b = Integer.MIN_VALUE;
            this.f18181c = false;
            this.f18182d = false;
            this.f18183e = false;
            int[] iArr = this.f18184f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f18184f;
            if (iArr == null || iArr.length < length) {
                this.f18184f = new int[StaggeredGridLayoutManager.this.f18171t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f18184f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        f f18186e;

        /* renamed from: f  reason: collision with root package name */
        boolean f18187f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f18187f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f18194a;

        /* renamed from: b  reason: collision with root package name */
        int f18195b;

        /* renamed from: c  reason: collision with root package name */
        int f18196c;

        /* renamed from: d  reason: collision with root package name */
        int[] f18197d;

        /* renamed from: e  reason: collision with root package name */
        int f18198e;

        /* renamed from: f  reason: collision with root package name */
        int[] f18199f;

        /* renamed from: g  reason: collision with root package name */
        List f18200g;

        /* renamed from: h  reason: collision with root package name */
        boolean f18201h;

        /* renamed from: i  reason: collision with root package name */
        boolean f18202i;

        /* renamed from: j  reason: collision with root package name */
        boolean f18203j;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f18197d = null;
            this.f18196c = 0;
            this.f18194a = -1;
            this.f18195b = -1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f18197d = null;
            this.f18196c = 0;
            this.f18198e = 0;
            this.f18199f = null;
            this.f18200g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f18194a);
            parcel.writeInt(this.f18195b);
            parcel.writeInt(this.f18196c);
            if (this.f18196c > 0) {
                parcel.writeIntArray(this.f18197d);
            }
            parcel.writeInt(this.f18198e);
            if (this.f18198e > 0) {
                parcel.writeIntArray(this.f18199f);
            }
            parcel.writeInt(this.f18201h ? 1 : 0);
            parcel.writeInt(this.f18202i ? 1 : 0);
            parcel.writeInt(this.f18203j ? 1 : 0);
            parcel.writeList(this.f18200g);
        }

        e(Parcel parcel) {
            this.f18194a = parcel.readInt();
            this.f18195b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f18196c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f18197d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f18198e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f18199f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f18201h = parcel.readInt() == 1;
            this.f18202i = parcel.readInt() == 1;
            this.f18203j = parcel.readInt() == 1 ? true : z10;
            this.f18200g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f18196c = eVar.f18196c;
            this.f18194a = eVar.f18194a;
            this.f18195b = eVar.f18195b;
            this.f18197d = eVar.f18197d;
            this.f18198e = eVar.f18198e;
            this.f18199f = eVar.f18199f;
            this.f18201h = eVar.f18201h;
            this.f18202i = eVar.f18202i;
            this.f18203j = eVar.f18203j;
            this.f18200g = eVar.f18200g;
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList f18204a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        int f18205b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f18206c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f18207d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f18208e;

        f(int i10) {
            this.f18208e = i10;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n10 = n(view);
            n10.f18186e = this;
            this.f18204a.add(view);
            this.f18206c = Integer.MIN_VALUE;
            if (this.f18204a.size() == 1) {
                this.f18205b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f18207d += StaggeredGridLayoutManager.this.f18172u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10, int i10) {
            int i11;
            if (z10) {
                i11 = l(Integer.MIN_VALUE);
            } else {
                i11 = p(Integer.MIN_VALUE);
            }
            e();
            if (i11 != Integer.MIN_VALUE) {
                if (z10 && i11 < StaggeredGridLayoutManager.this.f18172u.i()) {
                    return;
                }
                if (z10 || i11 <= StaggeredGridLayoutManager.this.f18172u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        i11 += i10;
                    }
                    this.f18206c = i11;
                    this.f18205b = i11;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d.a f10;
            ArrayList arrayList = this.f18204a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f18206c = StaggeredGridLayoutManager.this.f18172u.d(view);
            if (n10.f18187f && (f10 = StaggeredGridLayoutManager.this.f18158E.f(n10.a())) != null && f10.f18191b == 1) {
                this.f18206c += f10.a(this.f18208e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d.a f10;
            View view = (View) this.f18204a.get(0);
            c n10 = n(view);
            this.f18205b = StaggeredGridLayoutManager.this.f18172u.g(view);
            if (n10.f18187f && (f10 = StaggeredGridLayoutManager.this.f18158E.f(n10.a())) != null && f10.f18191b == -1) {
                this.f18205b -= f10.a(this.f18208e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f18204a.clear();
            q();
            this.f18207d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f18177z) {
                return i(this.f18204a.size() - 1, -1, true);
            }
            return i(0, this.f18204a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f18177z) {
                return i(0, this.f18204a.size(), true);
            }
            return i(this.f18204a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int i12;
            boolean z13;
            int m10 = StaggeredGridLayoutManager.this.f18172u.m();
            int i13 = StaggeredGridLayoutManager.this.f18172u.i();
            if (i11 > i10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (i10 != i11) {
                View view = (View) this.f18204a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f18172u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f18172u.d(view);
                boolean z14 = false;
                if (!z12 ? g10 >= i13 : g10 > i13) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z14 = true;
                }
                if (z13 && z14) {
                    if (!z10 || !z11) {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                        if (g10 < m10 || d10 > i13) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (g10 >= m10 && d10 <= i13) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f18207d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i10 = this.f18206c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f18206c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            int i11 = this.f18206c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f18204a.size() == 0) {
                return i10;
            }
            c();
            return this.f18206c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f18204a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f18204a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f18177z && staggeredGridLayoutManager.h0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f18177z && staggeredGridLayoutManager2.h0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f18204a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = (View) this.f18204a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f18177z && staggeredGridLayoutManager3.h0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f18177z && staggeredGridLayoutManager4.h0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i10 = this.f18205b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f18205b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i10) {
            int i11 = this.f18205b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f18204a.size() == 0) {
                return i10;
            }
            d();
            return this.f18205b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f18205b = Integer.MIN_VALUE;
            this.f18206c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            int i11 = this.f18205b;
            if (i11 != Integer.MIN_VALUE) {
                this.f18205b = i11 + i10;
            }
            int i12 = this.f18206c;
            if (i12 != Integer.MIN_VALUE) {
                this.f18206c = i12 + i10;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f18204a.size();
            View view = (View) this.f18204a.remove(size - 1);
            c n10 = n(view);
            n10.f18186e = null;
            if (n10.c() || n10.b()) {
                this.f18207d -= StaggeredGridLayoutManager.this.f18172u.e(view);
            }
            if (size == 1) {
                this.f18205b = Integer.MIN_VALUE;
            }
            this.f18206c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View view = (View) this.f18204a.remove(0);
            c n10 = n(view);
            n10.f18186e = null;
            if (this.f18204a.size() == 0) {
                this.f18206c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f18207d -= StaggeredGridLayoutManager.this.f18172u.e(view);
            }
            this.f18205b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n10 = n(view);
            n10.f18186e = this;
            this.f18204a.add(0, view);
            this.f18205b = Integer.MIN_VALUE;
            if (this.f18204a.size() == 1) {
                this.f18206c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f18207d += StaggeredGridLayoutManager.this.f18172u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10) {
            this.f18205b = i10;
            this.f18206c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d i02 = RecyclerView.p.i0(context, attributeSet, i10, i11);
        H2(i02.f18129a);
        J2(i02.f18130b);
        I2(i02.f18131c);
        this.f18176y = new f();
        a2();
    }

    private void A2(RecyclerView.w wVar, f fVar) {
        int i10;
        int i11;
        if (fVar.f18329a && !fVar.f18337i) {
            if (fVar.f18330b == 0) {
                if (fVar.f18333e == -1) {
                    B2(wVar, fVar.f18335g);
                } else {
                    C2(wVar, fVar.f18334f);
                }
            } else if (fVar.f18333e == -1) {
                int i12 = fVar.f18334f;
                int m22 = i12 - m2(i12);
                if (m22 < 0) {
                    i11 = fVar.f18335g;
                } else {
                    i11 = fVar.f18335g - Math.min(m22, fVar.f18330b);
                }
                B2(wVar, i11);
            } else {
                int n22 = n2(fVar.f18335g) - fVar.f18335g;
                if (n22 < 0) {
                    i10 = fVar.f18334f;
                } else {
                    i10 = Math.min(n22, fVar.f18330b) + fVar.f18334f;
                }
                C2(wVar, i10);
            }
        }
    }

    private void B2(RecyclerView.w wVar, int i10) {
        int J10 = J() - 1;
        while (J10 >= 0) {
            View I10 = I(J10);
            if (this.f18172u.g(I10) >= i10 && this.f18172u.q(I10) >= i10) {
                c cVar = (c) I10.getLayoutParams();
                if (cVar.f18187f) {
                    int i11 = 0;
                    while (i11 < this.f18170s) {
                        if (this.f18171t[i11].f18204a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f18170s; i12++) {
                        this.f18171t[i12].s();
                    }
                } else if (cVar.f18186e.f18204a.size() != 1) {
                    cVar.f18186e.s();
                } else {
                    return;
                }
                m1(I10, wVar);
                J10--;
            } else {
                return;
            }
        }
    }

    private void C2(RecyclerView.w wVar, int i10) {
        while (J() > 0) {
            View I10 = I(0);
            if (this.f18172u.d(I10) <= i10 && this.f18172u.p(I10) <= i10) {
                c cVar = (c) I10.getLayoutParams();
                if (cVar.f18187f) {
                    int i11 = 0;
                    while (i11 < this.f18170s) {
                        if (this.f18171t[i11].f18204a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f18170s; i12++) {
                        this.f18171t[i12].t();
                    }
                } else if (cVar.f18186e.f18204a.size() != 1) {
                    cVar.f18186e.t();
                } else {
                    return;
                }
                m1(I10, wVar);
            } else {
                return;
            }
        }
    }

    private void D2() {
        if (this.f18173v.k() != 1073741824) {
            int J10 = J();
            float f10 = 0.0f;
            for (int i10 = 0; i10 < J10; i10++) {
                View I10 = I(i10);
                float e10 = (float) this.f18173v.e(I10);
                if (e10 >= f10) {
                    if (((c) I10.getLayoutParams()).e()) {
                        e10 = (e10 * 1.0f) / ((float) this.f18170s);
                    }
                    f10 = Math.max(f10, e10);
                }
            }
            int i11 = this.f18175x;
            int round = Math.round(f10 * ((float) this.f18170s));
            if (this.f18173v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f18173v.n());
            }
            P2(round);
            if (this.f18175x != i11) {
                for (int i12 = 0; i12 < J10; i12++) {
                    View I11 = I(i12);
                    c cVar = (c) I11.getLayoutParams();
                    if (!cVar.f18187f) {
                        if (!t2() || this.f18174w != 1) {
                            int i13 = cVar.f18186e.f18208e;
                            int i14 = this.f18175x * i13;
                            int i15 = i13 * i11;
                            if (this.f18174w == 1) {
                                I11.offsetLeftAndRight(i14 - i15);
                            } else {
                                I11.offsetTopAndBottom(i14 - i15);
                            }
                        } else {
                            int i16 = this.f18170s;
                            int i17 = cVar.f18186e.f18208e;
                            I11.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f18175x) - ((-((i16 - 1) - i17)) * i11));
                        }
                    }
                }
            }
        }
    }

    private void E2() {
        if (this.f18174w == 1 || !t2()) {
            this.f18154A = this.f18177z;
        } else {
            this.f18154A = !this.f18177z;
        }
    }

    private void G2(int i10) {
        boolean z10;
        f fVar = this.f18176y;
        fVar.f18333e = i10;
        boolean z11 = this.f18154A;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        fVar.f18332d = i11;
    }

    private void K2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f18170s; i12++) {
            if (!this.f18171t[i12].f18204a.isEmpty()) {
                Q2(this.f18171t[i12], i10, i11);
            }
        }
    }

    private boolean L2(RecyclerView.B b10, b bVar) {
        int i10;
        if (this.f18160G) {
            i10 = g2(b10.b());
        } else {
            i10 = c2(b10.b());
        }
        bVar.f18179a = i10;
        bVar.f18180b = Integer.MIN_VALUE;
        return true;
    }

    private void M1(View view) {
        for (int i10 = this.f18170s - 1; i10 >= 0; i10--) {
            this.f18171t[i10].a(view);
        }
    }

    private void N1(b bVar) {
        int m10;
        e eVar = this.f18162I;
        int i10 = eVar.f18196c;
        if (i10 > 0) {
            if (i10 == this.f18170s) {
                for (int i11 = 0; i11 < this.f18170s; i11++) {
                    this.f18171t[i11].e();
                    e eVar2 = this.f18162I;
                    int i12 = eVar2.f18197d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (eVar2.f18202i) {
                            m10 = this.f18172u.i();
                        } else {
                            m10 = this.f18172u.m();
                        }
                        i12 += m10;
                    }
                    this.f18171t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f18162I;
                eVar3.f18194a = eVar3.f18195b;
            }
        }
        e eVar4 = this.f18162I;
        this.f18161H = eVar4.f18203j;
        I2(eVar4.f18201h);
        E2();
        e eVar5 = this.f18162I;
        int i13 = eVar5.f18194a;
        if (i13 != -1) {
            this.f18156C = i13;
            bVar.f18181c = eVar5.f18202i;
        } else {
            bVar.f18181c = this.f18154A;
        }
        if (eVar5.f18198e > 1) {
            d dVar = this.f18158E;
            dVar.f18188a = eVar5.f18199f;
            dVar.f18189b = eVar5.f18200g;
        }
    }

    private void O2(int i10, RecyclerView.B b10) {
        int i11;
        int i12;
        int c10;
        boolean z10;
        f fVar = this.f18176y;
        boolean z11 = false;
        fVar.f18330b = 0;
        fVar.f18331c = i10;
        if (!x0() || (c10 = b10.c()) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            boolean z12 = this.f18154A;
            if (c10 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                i12 = this.f18172u.n();
                i11 = 0;
            } else {
                i11 = this.f18172u.n();
                i12 = 0;
            }
        }
        if (M()) {
            this.f18176y.f18334f = this.f18172u.m() - i11;
            this.f18176y.f18335g = this.f18172u.i() + i12;
        } else {
            this.f18176y.f18335g = this.f18172u.h() + i12;
            this.f18176y.f18334f = -i11;
        }
        f fVar2 = this.f18176y;
        fVar2.f18336h = false;
        fVar2.f18329a = true;
        if (this.f18172u.k() == 0 && this.f18172u.h() == 0) {
            z11 = true;
        }
        fVar2.f18337i = z11;
    }

    private void Q1(View view, c cVar, f fVar) {
        if (fVar.f18333e == 1) {
            if (cVar.f18187f) {
                M1(view);
            } else {
                cVar.f18186e.a(view);
            }
        } else if (cVar.f18187f) {
            z2(view);
        } else {
            cVar.f18186e.u(view);
        }
    }

    private void Q2(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 <= i11) {
                this.f18155B.set(fVar.f18208e, false);
            }
        } else if (fVar.k() - j10 >= i11) {
            this.f18155B.set(fVar.f18208e, false);
        }
    }

    private int R1(int i10) {
        boolean z10;
        if (J() != 0) {
            if (i10 < j2()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f18154A) {
                return -1;
            }
            return 1;
        } else if (this.f18154A) {
            return 1;
        } else {
            return -1;
        }
    }

    private int R2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
        }
        return i10;
    }

    private boolean T1(f fVar) {
        if (this.f18154A) {
            if (fVar.k() < this.f18172u.i()) {
                ArrayList arrayList = fVar.f18204a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f18187f;
            }
        } else if (fVar.o() > this.f18172u.m()) {
            return !fVar.n((View) fVar.f18204a.get(0)).f18187f;
        }
        return false;
    }

    private int U1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        return l.a(b10, this.f18172u, e2(!this.f18167N), d2(!this.f18167N), this, this.f18167N);
    }

    private int V1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        return l.b(b10, this.f18172u, e2(!this.f18167N), d2(!this.f18167N), this, this.f18167N, this.f18154A);
    }

    private int W1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        return l.c(b10, this.f18172u, e2(!this.f18167N), d2(!this.f18167N), this, this.f18167N);
    }

    private int X1(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f18174w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f18174w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f18174w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f18174w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f18174w != 1 && t2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f18174w != 1 && t2()) {
            return 1;
        } else {
            return -1;
        }
    }

    private d.a Y1(int i10) {
        d.a aVar = new d.a();
        aVar.f18192c = new int[this.f18170s];
        for (int i11 = 0; i11 < this.f18170s; i11++) {
            aVar.f18192c[i11] = i10 - this.f18171t[i11].l(i10);
        }
        return aVar;
    }

    private d.a Z1(int i10) {
        d.a aVar = new d.a();
        aVar.f18192c = new int[this.f18170s];
        for (int i11 = 0; i11 < this.f18170s; i11++) {
            aVar.f18192c[i11] = this.f18171t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void a2() {
        this.f18172u = i.b(this, this.f18174w);
        this.f18173v = i.b(this, 1 - this.f18174w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int b2(RecyclerView.w wVar, f fVar, RecyclerView.B b10) {
        int i10;
        int m10;
        int i11;
        boolean z10;
        f fVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        boolean P12;
        int i18;
        int i19;
        RecyclerView.w wVar2 = wVar;
        f fVar3 = fVar;
        ? r92 = 0;
        this.f18155B.set(0, this.f18170s, true);
        if (this.f18176y.f18337i) {
            if (fVar3.f18333e == 1) {
                i10 = a.e.API_PRIORITY_OTHER;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (fVar3.f18333e == 1) {
            i10 = fVar3.f18335g + fVar3.f18330b;
        } else {
            i10 = fVar3.f18334f - fVar3.f18330b;
        }
        int i20 = i10;
        K2(fVar3.f18333e, i20);
        if (this.f18154A) {
            m10 = this.f18172u.i();
        } else {
            m10 = this.f18172u.m();
        }
        int i21 = m10;
        boolean z12 = false;
        while (fVar.a(b10) && (this.f18176y.f18337i || !this.f18155B.isEmpty())) {
            View b11 = fVar3.b(wVar2);
            c cVar = (c) b11.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.f18158E.g(a10);
            if (g10 == -1) {
                z10 = true;
            } else {
                z10 = r92;
            }
            if (z10) {
                if (cVar.f18187f) {
                    fVar2 = this.f18171t[r92];
                } else {
                    fVar2 = p2(fVar3);
                }
                this.f18158E.n(a10, fVar2);
            } else {
                fVar2 = this.f18171t[g10];
            }
            f fVar4 = fVar2;
            cVar.f18186e = fVar4;
            if (fVar3.f18333e == 1) {
                d(b11);
            } else {
                e(b11, r92);
            }
            v2(b11, cVar, r92);
            if (fVar3.f18333e == 1) {
                if (cVar.f18187f) {
                    i19 = l2(i21);
                } else {
                    i19 = fVar4.l(i21);
                }
                int e10 = this.f18172u.e(b11) + i19;
                if (z10 && cVar.f18187f) {
                    d.a Y12 = Y1(i19);
                    Y12.f18191b = -1;
                    Y12.f18190a = a10;
                    this.f18158E.a(Y12);
                }
                i12 = e10;
                i13 = i19;
            } else {
                if (cVar.f18187f) {
                    i18 = o2(i21);
                } else {
                    i18 = fVar4.p(i21);
                }
                i13 = i18 - this.f18172u.e(b11);
                if (z10 && cVar.f18187f) {
                    d.a Z12 = Z1(i18);
                    Z12.f18191b = 1;
                    Z12.f18190a = a10;
                    this.f18158E.a(Z12);
                }
                i12 = i18;
            }
            if (cVar.f18187f && fVar3.f18332d == -1) {
                if (z10) {
                    this.f18166M = true;
                } else {
                    if (fVar3.f18333e == 1) {
                        P12 = O1();
                    } else {
                        P12 = P1();
                    }
                    if (!P12) {
                        d.a f10 = this.f18158E.f(a10);
                        if (f10 != null) {
                            f10.f18193d = true;
                        }
                        this.f18166M = true;
                    }
                }
            }
            Q1(b11, cVar, fVar3);
            if (!t2() || this.f18174w != 1) {
                if (cVar.f18187f) {
                    i16 = this.f18173v.m();
                } else {
                    i16 = (fVar4.f18208e * this.f18175x) + this.f18173v.m();
                }
                i15 = i16;
                i14 = this.f18173v.e(b11) + i16;
            } else {
                if (cVar.f18187f) {
                    i17 = this.f18173v.i();
                } else {
                    i17 = this.f18173v.i() - (((this.f18170s - 1) - fVar4.f18208e) * this.f18175x);
                }
                i14 = i17;
                i15 = i17 - this.f18173v.e(b11);
            }
            if (this.f18174w == 1) {
                z0(b11, i15, i13, i14, i12);
            } else {
                z0(b11, i13, i15, i12, i14);
            }
            if (cVar.f18187f) {
                K2(this.f18176y.f18333e, i20);
            } else {
                Q2(fVar4, this.f18176y.f18333e, i20);
            }
            A2(wVar2, this.f18176y);
            if (this.f18176y.f18336h && b11.hasFocusable()) {
                if (cVar.f18187f) {
                    this.f18155B.clear();
                } else {
                    z11 = false;
                    this.f18155B.set(fVar4.f18208e, false);
                    r92 = z11;
                    z12 = true;
                }
            }
            z11 = false;
            r92 = z11;
            z12 = true;
        }
        int i22 = r92;
        if (!z12) {
            A2(wVar2, this.f18176y);
        }
        if (this.f18176y.f18333e == -1) {
            i11 = this.f18172u.m() - o2(this.f18172u.m());
        } else {
            i11 = l2(this.f18172u.i()) - this.f18172u.i();
        }
        if (i11 > 0) {
            return Math.min(fVar3.f18330b, i11);
        }
        return i22;
    }

    private int c2(int i10) {
        int J10 = J();
        for (int i11 = 0; i11 < J10; i11++) {
            int h02 = h0(I(i11));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private int g2(int i10) {
        for (int J10 = J() - 1; J10 >= 0; J10--) {
            int h02 = h0(I(J10));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i10;
        int l22 = l2(Integer.MIN_VALUE);
        if (l22 != Integer.MIN_VALUE && (i10 = this.f18172u.i() - l22) > 0) {
            int i11 = i10 - (-F2(-i10, wVar, b10));
            if (z10 && i11 > 0) {
                this.f18172u.r(i11);
            }
        }
    }

    private void i2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int m10;
        int o22 = o2(a.e.API_PRIORITY_OTHER);
        if (o22 != Integer.MAX_VALUE && (m10 = o22 - this.f18172u.m()) > 0) {
            int F22 = m10 - F2(m10, wVar, b10);
            if (z10 && F22 > 0) {
                this.f18172u.r(-F22);
            }
        }
    }

    private int l2(int i10) {
        int l10 = this.f18171t[0].l(i10);
        for (int i11 = 1; i11 < this.f18170s; i11++) {
            int l11 = this.f18171t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int m2(int i10) {
        int p10 = this.f18171t[0].p(i10);
        for (int i11 = 1; i11 < this.f18170s; i11++) {
            int p11 = this.f18171t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int n2(int i10) {
        int l10 = this.f18171t[0].l(i10);
        for (int i11 = 1; i11 < this.f18170s; i11++) {
            int l11 = this.f18171t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int o2(int i10) {
        int p10 = this.f18171t[0].p(i10);
        for (int i11 = 1; i11 < this.f18170s; i11++) {
            int p11 = this.f18171t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private f p2(f fVar) {
        int i10;
        int i11;
        int i12;
        if (x2(fVar.f18333e)) {
            i12 = this.f18170s - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = this.f18170s;
            i12 = 0;
            i10 = 1;
        }
        f fVar2 = null;
        if (fVar.f18333e == 1) {
            int m10 = this.f18172u.m();
            int i13 = a.e.API_PRIORITY_OTHER;
            while (i12 != i11) {
                f fVar3 = this.f18171t[i12];
                int l10 = fVar3.l(m10);
                if (l10 < i13) {
                    fVar2 = fVar3;
                    i13 = l10;
                }
                i12 += i10;
            }
            return fVar2;
        }
        int i14 = this.f18172u.i();
        int i15 = Integer.MIN_VALUE;
        while (i12 != i11) {
            f fVar4 = this.f18171t[i12];
            int p10 = fVar4.p(i14);
            if (p10 > i15) {
                fVar2 = fVar4;
                i15 = p10;
            }
            i12 += i10;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f18154A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0017
            int r2 = r8 + 1
        L_0x0015:
            r3 = r7
            goto L_0x001e
        L_0x0017:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001e
        L_0x001b:
            int r2 = r7 + r8
            goto L_0x0015
        L_0x001e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f18158E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003d
            r5 = 2
            if (r9 == r5) goto L_0x0037
            if (r9 == r1) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f18158E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f18158E
            r7.j(r8, r4)
            goto L_0x0042
        L_0x0037:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f18158E
            r9.k(r7, r8)
            goto L_0x0042
        L_0x003d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f18158E
            r9.j(r7, r8)
        L_0x0042:
            if (r2 > r0) goto L_0x0045
            return
        L_0x0045:
            boolean r7 = r6.f18154A
            if (r7 == 0) goto L_0x004e
            int r7 = r6.j2()
            goto L_0x0052
        L_0x004e:
            int r7 = r6.k2()
        L_0x0052:
            if (r3 > r7) goto L_0x0057
            r6.t1()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, int, int):void");
    }

    private void u2(View view, int i10, int i11, boolean z10) {
        boolean z11;
        j(view, this.f18164K);
        c cVar = (c) view.getLayoutParams();
        int i12 = cVar.leftMargin;
        Rect rect = this.f18164K;
        int R22 = R2(i10, i12 + rect.left, cVar.rightMargin + rect.right);
        int i13 = cVar.topMargin;
        Rect rect2 = this.f18164K;
        int R23 = R2(i11, i13 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z10) {
            z11 = H1(view, R22, R23, cVar);
        } else {
            z11 = F1(view, R22, R23, cVar);
        }
        if (z11) {
            view.measure(R22, R23);
        }
    }

    private void v2(View view, c cVar, boolean z10) {
        if (cVar.f18187f) {
            if (this.f18174w == 1) {
                u2(view, this.f18163J, RecyclerView.p.K(W(), X(), g0() + d0(), cVar.height, true), z10);
            } else {
                u2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), cVar.width, true), this.f18163J, z10);
            }
        } else if (this.f18174w == 1) {
            u2(view, RecyclerView.p.K(this.f18175x, p0(), 0, cVar.width, false), RecyclerView.p.K(W(), X(), g0() + d0(), cVar.height, true), z10);
        } else {
            u2(view, RecyclerView.p.K(o0(), p0(), e0() + f0(), cVar.width, true), RecyclerView.p.K(this.f18175x, X(), 0, cVar.height, false), z10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0152, code lost:
        if (S1() != false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f18165L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f18162I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f18156C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.k1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f18183e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f18156C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f18162I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f18162I
            if (r5 == 0) goto L_0x0037
            r8.N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.E2()
            boolean r5 = r8.f18154A
            r0.f18181c = r5
        L_0x003e:
            r8.N2(r10, r0)
            r0.f18183e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f18162I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f18156C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f18181c
            boolean r6 = r8.f18160G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.t2()
            boolean r6 = r8.f18161H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f18158E
            r5.b()
            r0.f18182d = r4
        L_0x0060:
            int r5 = r8.J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f18162I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f18196c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f18182d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f18170s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f18171t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f18180b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f18171t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f18165L
            int[] r1 = r1.f18184f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f18170s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f18171t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f18165L
            int[] r6 = r6.f18184f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f18170s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f18171t
            r5 = r5[r1]
            boolean r6 = r8.f18154A
            int r7 = r0.f18180b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f18165L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f18171t
            r1.d(r5)
        L_0x00c9:
            r8.w(r9)
            androidx.recyclerview.widget.f r1 = r8.f18176y
            r1.f18329a = r3
            r8.f18166M = r3
            androidx.recyclerview.widget.i r1 = r8.f18173v
            int r1 = r1.n()
            r8.P2(r1)
            int r1 = r0.f18179a
            r8.O2(r1, r10)
            boolean r1 = r0.f18181c
            if (r1 == 0) goto L_0x00fc
            r8.G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f18176y
            r8.b2(r9, r1, r10)
            r8.G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f18176y
            int r2 = r0.f18179a
            int r5 = r1.f18332d
            int r2 = r2 + r5
            r1.f18331c = r2
            r8.b2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f18176y
            r8.b2(r9, r1, r10)
            r8.G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f18176y
            int r2 = r0.f18179a
            int r5 = r1.f18332d
            int r2 = r2 + r5
            r1.f18331c = r2
            r8.b2(r9, r1, r10)
        L_0x0113:
            r8.D2()
            int r1 = r8.J()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f18154A
            if (r1 == 0) goto L_0x0127
            r8.h2(r9, r10, r4)
            r8.i2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.i2(r9, r10, r4)
            r8.h2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x0155
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x0155
            int r11 = r8.f18159F
            if (r11 == 0) goto L_0x0155
            int r11 = r8.J()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f18166M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.r2()
            if (r11 == 0) goto L_0x0155
        L_0x0149:
            java.lang.Runnable r11 = r8.f18169P
            r8.o1(r11)
            boolean r11 = r8.S1()
            if (r11 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r4 = r3
        L_0x0156:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0161
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f18165L
            r11.c()
        L_0x0161:
            boolean r11 = r0.f18181c
            r8.f18160G = r11
            boolean r11 = r8.t2()
            r8.f18161H = r11
            if (r4 == 0) goto L_0x0175
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f18165L
            r11.c()
            r8.w2(r9, r10, r3)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    private boolean x2(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f18174w == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f18154A) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f18154A) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == t2()) {
            return true;
        }
        return false;
    }

    private void z2(View view) {
        for (int i10 = this.f18170s - 1; i10 >= 0; i10--) {
            this.f18171t[i10].u(view);
        }
    }

    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f18170s; i11++) {
            this.f18171t[i11].r(i10);
        }
    }

    public void C1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f18174w == 1) {
            i13 = RecyclerView.p.n(i11, rect.height() + g02, b0());
            i12 = RecyclerView.p.n(i10, (this.f18175x * this.f18170s) + e02, c0());
        } else {
            i12 = RecyclerView.p.n(i10, rect.width() + e02, c0());
            i13 = RecyclerView.p.n(i11, (this.f18175x * this.f18170s) + g02, b0());
        }
        B1(i12, i13);
    }

    public RecyclerView.q D() {
        if (this.f18174w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f18170s; i11++) {
            this.f18171t[i11].r(i10);
        }
    }

    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void E0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f18158E.b();
        for (int i10 = 0; i10 < this.f18170s; i10++) {
            this.f18171t[i10].e();
        }
    }

    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int F2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        y2(i10, b10);
        int b22 = b2(wVar, this.f18176y, b10);
        if (this.f18176y.f18330b >= b22) {
            if (i10 < 0) {
                i10 = -b22;
            } else {
                i10 = b22;
            }
        }
        this.f18172u.r(-i10);
        this.f18160G = this.f18154A;
        f fVar = this.f18176y;
        fVar.f18330b = 0;
        A2(wVar, fVar);
        return i10;
    }

    public void H2(int i10) {
        if (i10 == 0 || i10 == 1) {
            g((String) null);
            if (i10 != this.f18174w) {
                this.f18174w = i10;
                i iVar = this.f18172u;
                this.f18172u = this.f18173v;
                this.f18173v = iVar;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        o1(this.f18169P);
        for (int i10 = 0; i10 < this.f18170s; i10++) {
            this.f18171t[i10].e();
        }
        recyclerView.requestLayout();
    }

    public void I1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public void I2(boolean z10) {
        g((String) null);
        e eVar = this.f18162I;
        if (!(eVar == null || eVar.f18201h == z10)) {
            eVar.f18201h = z10;
        }
        this.f18177z = z10;
        t1();
    }

    public View J0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        View B10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        View m10;
        if (J() == 0 || (B10 = B(view)) == null) {
            return null;
        }
        E2();
        int X12 = X1(i10);
        if (X12 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B10.getLayoutParams();
        boolean z12 = cVar.f18187f;
        f fVar = cVar.f18186e;
        if (X12 == 1) {
            i11 = k2();
        } else {
            i11 = j2();
        }
        O2(i11, b10);
        G2(X12);
        f fVar2 = this.f18176y;
        fVar2.f18331c = fVar2.f18332d + i11;
        fVar2.f18330b = (int) (((float) this.f18172u.n()) * 0.33333334f);
        f fVar3 = this.f18176y;
        fVar3.f18336h = true;
        fVar3.f18329a = false;
        b2(wVar, fVar3, b10);
        this.f18160G = this.f18154A;
        if (!z12 && (m10 = fVar.m(i11, X12)) != null && m10 != B10) {
            return m10;
        }
        if (x2(X12)) {
            for (int i15 = this.f18170s - 1; i15 >= 0; i15--) {
                View m11 = this.f18171t[i15].m(i11, X12);
                if (m11 != null && m11 != B10) {
                    return m11;
                }
            }
        } else {
            for (int i16 = 0; i16 < this.f18170s; i16++) {
                View m12 = this.f18171t[i16].m(i11, X12);
                if (m12 != null && m12 != B10) {
                    return m12;
                }
            }
        }
        boolean z13 = !this.f18177z;
        if (X12 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z12) {
            if (z11) {
                i14 = fVar.f();
            } else {
                i14 = fVar.g();
            }
            View C10 = C(i14);
            if (!(C10 == null || C10 == B10)) {
                return C10;
            }
        }
        if (x2(X12)) {
            for (int i17 = this.f18170s - 1; i17 >= 0; i17--) {
                if (i17 != fVar.f18208e) {
                    if (z11) {
                        i13 = this.f18171t[i17].f();
                    } else {
                        i13 = this.f18171t[i17].g();
                    }
                    View C11 = C(i13);
                    if (!(C11 == null || C11 == B10)) {
                        return C11;
                    }
                }
            }
        } else {
            for (int i18 = 0; i18 < this.f18170s; i18++) {
                if (z11) {
                    i12 = this.f18171t[i18].f();
                } else {
                    i12 = this.f18171t[i18].g();
                }
                View C12 = C(i12);
                if (C12 != null && C12 != B10) {
                    return C12;
                }
            }
        }
        return null;
    }

    public void J2(int i10) {
        g((String) null);
        if (i10 != this.f18170s) {
            s2();
            this.f18170s = i10;
            this.f18155B = new BitSet(this.f18170s);
            this.f18171t = new f[this.f18170s];
            for (int i11 = 0; i11 < this.f18170s; i11++) {
                this.f18171t[i11] = new f(i11);
            }
            t1();
        }
    }

    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 != null && d22 != null) {
                int h02 = h0(e22);
                int h03 = h0(d22);
                if (h02 < h03) {
                    accessibilityEvent.setFromIndex(h02);
                    accessibilityEvent.setToIndex(h03);
                    return;
                }
                accessibilityEvent.setFromIndex(h03);
                accessibilityEvent.setToIndex(h02);
            }
        }
    }

    public boolean L1() {
        if (this.f18162I == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean M2(RecyclerView.B b10, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        if (!b10.e() && (i10 = this.f18156C) != -1) {
            if (i10 < 0 || i10 >= b10.b()) {
                this.f18156C = -1;
                this.f18157D = Integer.MIN_VALUE;
            } else {
                e eVar = this.f18162I;
                if (eVar == null || eVar.f18194a == -1 || eVar.f18196c < 1) {
                    View C10 = C(this.f18156C);
                    if (C10 != null) {
                        if (this.f18154A) {
                            i11 = k2();
                        } else {
                            i11 = j2();
                        }
                        bVar.f18179a = i11;
                        if (this.f18157D != Integer.MIN_VALUE) {
                            if (bVar.f18181c) {
                                bVar.f18180b = (this.f18172u.i() - this.f18157D) - this.f18172u.d(C10);
                            } else {
                                bVar.f18180b = (this.f18172u.m() + this.f18157D) - this.f18172u.g(C10);
                            }
                            return true;
                        } else if (this.f18172u.e(C10) > this.f18172u.n()) {
                            if (bVar.f18181c) {
                                i12 = this.f18172u.i();
                            } else {
                                i12 = this.f18172u.m();
                            }
                            bVar.f18180b = i12;
                            return true;
                        } else {
                            int g10 = this.f18172u.g(C10) - this.f18172u.m();
                            if (g10 < 0) {
                                bVar.f18180b = -g10;
                                return true;
                            }
                            int i13 = this.f18172u.i() - this.f18172u.d(C10);
                            if (i13 < 0) {
                                bVar.f18180b = i13;
                                return true;
                            }
                            bVar.f18180b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i14 = this.f18156C;
                        bVar.f18179a = i14;
                        int i15 = this.f18157D;
                        if (i15 == Integer.MIN_VALUE) {
                            if (R1(i14) == 1) {
                                z10 = true;
                            }
                            bVar.f18181c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i15);
                        }
                        bVar.f18182d = true;
                    }
                } else {
                    bVar.f18180b = Integer.MIN_VALUE;
                    bVar.f18179a = this.f18156C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void N2(RecyclerView.B b10, b bVar) {
        if (!M2(b10, bVar) && !L2(b10, bVar)) {
            bVar.a();
            bVar.f18179a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean O1() {
        int l10 = this.f18171t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f18170s; i10++) {
            if (this.f18171t[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean P1() {
        int p10 = this.f18171t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f18170s; i10++) {
            if (this.f18171t[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void P2(int i10) {
        this.f18175x = i10 / this.f18170s;
        this.f18163J = View.MeasureSpec.makeMeasureSpec(i10, this.f18173v.k());
    }

    public void R0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 1);
    }

    public void S0(RecyclerView recyclerView) {
        this.f18158E.b();
        t1();
    }

    /* access modifiers changed from: package-private */
    public boolean S1() {
        int i10;
        int i11;
        int i12;
        if (J() == 0 || this.f18159F == 0 || !r0()) {
            return false;
        }
        if (this.f18154A) {
            i11 = k2();
            i10 = j2();
        } else {
            i11 = j2();
            i10 = k2();
        }
        if (i11 == 0 && r2() != null) {
            this.f18158E.b();
            u1();
            t1();
            return true;
        } else if (!this.f18166M) {
            return false;
        } else {
            if (this.f18154A) {
                i12 = -1;
            } else {
                i12 = 1;
            }
            int i13 = i10 + 1;
            d.a e10 = this.f18158E.e(i11, i13, i12, true);
            if (e10 == null) {
                this.f18166M = false;
                this.f18158E.d(i13);
                return false;
            }
            d.a e11 = this.f18158E.e(i11, e10.f18190a, i12 * -1, true);
            if (e11 == null) {
                this.f18158E.d(e10.f18190a);
            } else {
                this.f18158E.d(e11.f18190a + 1);
            }
            u1();
            t1();
            return true;
        }
    }

    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        q2(i10, i11, 8);
    }

    public void U0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 2);
    }

    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        q2(i10, i11, 4);
    }

    public void X0(RecyclerView.w wVar, RecyclerView.B b10) {
        w2(wVar, b10, true);
    }

    public void Y0(RecyclerView.B b10) {
        super.Y0(b10);
        this.f18156C = -1;
        this.f18157D = Integer.MIN_VALUE;
        this.f18162I = null;
        this.f18165L.c();
    }

    public PointF a(int i10) {
        int R12 = R1(i10);
        PointF pointF = new PointF();
        if (R12 == 0) {
            return null;
        }
        if (this.f18174w == 0) {
            pointF.x = (float) R12;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R12;
        }
        return pointF;
    }

    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f18162I = eVar;
            if (this.f18156C != -1) {
                eVar.a();
                this.f18162I.b();
            }
            t1();
        }
    }

    public Parcelable d1() {
        int i10;
        int i11;
        int m10;
        int[] iArr;
        if (this.f18162I != null) {
            return new e(this.f18162I);
        }
        e eVar = new e();
        eVar.f18201h = this.f18177z;
        eVar.f18202i = this.f18160G;
        eVar.f18203j = this.f18161H;
        d dVar = this.f18158E;
        if (dVar == null || (iArr = dVar.f18188a) == null) {
            eVar.f18198e = 0;
        } else {
            eVar.f18199f = iArr;
            eVar.f18198e = iArr.length;
            eVar.f18200g = dVar.f18189b;
        }
        if (J() > 0) {
            if (this.f18160G) {
                i10 = k2();
            } else {
                i10 = j2();
            }
            eVar.f18194a = i10;
            eVar.f18195b = f2();
            int i12 = this.f18170s;
            eVar.f18196c = i12;
            eVar.f18197d = new int[i12];
            for (int i13 = 0; i13 < this.f18170s; i13++) {
                if (this.f18160G) {
                    i11 = this.f18171t[i13].l(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        m10 = this.f18172u.i();
                    } else {
                        eVar.f18197d[i13] = i11;
                    }
                } else {
                    i11 = this.f18171t[i13].p(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        m10 = this.f18172u.m();
                    } else {
                        eVar.f18197d[i13] = i11;
                    }
                }
                i11 -= m10;
                eVar.f18197d[i13] = i11;
            }
        } else {
            eVar.f18194a = -1;
            eVar.f18195b = -1;
            eVar.f18196c = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public View d2(boolean z10) {
        int m10 = this.f18172u.m();
        int i10 = this.f18172u.i();
        View view = null;
        for (int J10 = J() - 1; J10 >= 0; J10--) {
            View I10 = I(J10);
            int g10 = this.f18172u.g(I10);
            int d10 = this.f18172u.d(I10);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return I10;
                }
                if (view == null) {
                    view = I10;
                }
            }
        }
        return view;
    }

    public void e1(int i10) {
        if (i10 == 0) {
            S1();
        }
    }

    /* access modifiers changed from: package-private */
    public View e2(boolean z10) {
        int m10 = this.f18172u.m();
        int i10 = this.f18172u.i();
        int J10 = J();
        View view = null;
        for (int i11 = 0; i11 < J10; i11++) {
            View I10 = I(i11);
            int g10 = this.f18172u.g(I10);
            if (this.f18172u.d(I10) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return I10;
                }
                if (view == null) {
                    view = I10;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int f2() {
        View view;
        if (this.f18154A) {
            view = d2(true);
        } else {
            view = e2(true);
        }
        if (view == null) {
            return -1;
        }
        return h0(view);
    }

    public void g(String str) {
        if (this.f18162I == null) {
            super.g(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    public boolean k() {
        if (this.f18174w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int k2() {
        int J10 = J();
        if (J10 == 0) {
            return 0;
        }
        return h0(I(J10 - 1));
    }

    public boolean l() {
        if (this.f18174w == 1) {
            return true;
        }
        return false;
    }

    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public void o(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.f18174w != 0) {
            i10 = i11;
        }
        if (J() != 0 && i10 != 0) {
            y2(i10, b10);
            int[] iArr = this.f18168O;
            if (iArr == null || iArr.length < this.f18170s) {
                this.f18168O = new int[this.f18170s];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f18170s; i14++) {
                f fVar = this.f18176y;
                if (fVar.f18332d == -1) {
                    l10 = fVar.f18334f;
                    i12 = this.f18171t[i14].p(l10);
                } else {
                    l10 = this.f18171t[i14].l(fVar.f18335g);
                    i12 = this.f18176y.f18335g;
                }
                int i15 = l10 - i12;
                if (i15 >= 0) {
                    this.f18168O[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.f18168O, 0, i13);
            for (int i16 = 0; i16 < i13 && this.f18176y.a(b10); i16++) {
                cVar.a(this.f18176y.f18331c, this.f18168O[i16]);
                f fVar2 = this.f18176y;
                fVar2.f18331c += fVar2.f18332d;
            }
        }
    }

    public int q(RecyclerView.B b10) {
        return U1(b10);
    }

    public int r(RecyclerView.B b10) {
        return V1(b10);
    }

    /* access modifiers changed from: package-private */
    public View r2() {
        char c10;
        int i10;
        boolean z10;
        boolean z11;
        int J10 = J();
        int i11 = J10 - 1;
        BitSet bitSet = new BitSet(this.f18170s);
        bitSet.set(0, this.f18170s, true);
        int i12 = -1;
        if (this.f18174w != 1 || !t2()) {
            c10 = 65535;
        } else {
            c10 = 1;
        }
        if (this.f18154A) {
            J10 = -1;
        } else {
            i11 = 0;
        }
        if (i11 < J10) {
            i12 = 1;
        }
        while (i11 != J10) {
            View I10 = I(i11);
            c cVar = (c) I10.getLayoutParams();
            if (bitSet.get(cVar.f18186e.f18208e)) {
                if (T1(cVar.f18186e)) {
                    return I10;
                }
                bitSet.clear(cVar.f18186e.f18208e);
            }
            if (!cVar.f18187f && (i10 = i11 + i12) != J10) {
                View I11 = I(i10);
                if (this.f18154A) {
                    int d10 = this.f18172u.d(I10);
                    int d11 = this.f18172u.d(I11);
                    if (d10 < d11) {
                        return I10;
                    }
                    if (d10 != d11) {
                        continue;
                    }
                } else {
                    int g10 = this.f18172u.g(I10);
                    int g11 = this.f18172u.g(I11);
                    if (g10 > g11) {
                        return I10;
                    }
                    if (g10 != g11) {
                        continue;
                    }
                }
                if (cVar.f18186e.f18208e - ((c) I11.getLayoutParams()).f18186e.f18208e < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c10 < 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    return I10;
                }
            }
            i11 += i12;
        }
        return null;
    }

    public int s(RecyclerView.B b10) {
        return W1(b10);
    }

    public boolean s0() {
        if (this.f18159F != 0) {
            return true;
        }
        return false;
    }

    public void s2() {
        this.f18158E.b();
        t1();
    }

    public int t(RecyclerView.B b10) {
        return U1(b10);
    }

    /* access modifiers changed from: package-private */
    public boolean t2() {
        if (Z() == 1) {
            return true;
        }
        return false;
    }

    public int u(RecyclerView.B b10) {
        return V1(b10);
    }

    public int v(RecyclerView.B b10) {
        return W1(b10);
    }

    public int w1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return F2(i10, wVar, b10);
    }

    public void x1(int i10) {
        e eVar = this.f18162I;
        if (!(eVar == null || eVar.f18194a == i10)) {
            eVar.a();
        }
        this.f18156C = i10;
        this.f18157D = Integer.MIN_VALUE;
        t1();
    }

    public int y1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return F2(i10, wVar, b10);
    }

    /* access modifiers changed from: package-private */
    public void y2(int i10, RecyclerView.B b10) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = k2();
            i11 = 1;
        } else {
            i12 = j2();
            i11 = -1;
        }
        this.f18176y.f18329a = true;
        O2(i12, b10);
        G2(i11);
        f fVar = this.f18176y;
        fVar.f18331c = i12 + fVar.f18332d;
        fVar.f18330b = Math.abs(i10);
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f18188a;

        /* renamed from: b  reason: collision with root package name */
        List f18189b;

        d() {
        }

        private int i(int i10) {
            if (this.f18189b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f18189b.remove(f10);
            }
            int size = this.f18189b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (((a) this.f18189b.get(i11)).f18190a >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f18189b.remove(i11);
            return ((a) this.f18189b.get(i11)).f18190a;
        }

        private void l(int i10, int i11) {
            List list = this.f18189b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f18189b.get(size);
                    int i12 = aVar.f18190a;
                    if (i12 >= i10) {
                        aVar.f18190a = i12 + i11;
                    }
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f18189b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f18189b.get(size);
                    int i13 = aVar.f18190a;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f18189b.remove(size);
                        } else {
                            aVar.f18190a = i13 - i11;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f18189b == null) {
                this.f18189b = new ArrayList();
            }
            int size = this.f18189b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f18189b.get(i10);
                if (aVar2.f18190a == aVar.f18190a) {
                    this.f18189b.remove(i10);
                }
                if (aVar2.f18190a >= aVar.f18190a) {
                    this.f18189b.add(i10, aVar);
                    return;
                }
            }
            this.f18189b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f18188a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f18189b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            int[] iArr = this.f18188a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f18188a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f18188a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f18188a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i10) {
            List list = this.f18189b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f18189b.get(size)).f18190a >= i10) {
                        this.f18189b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f18189b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f18189b.get(i13);
                int i14 = aVar.f18190a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f18191b == i12 || (z10 && aVar.f18193d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f18189b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f18189b.get(size);
                if (aVar.f18190a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i10) {
            int[] iArr = this.f18188a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* access modifiers changed from: package-private */
        public int h(int i10) {
            int[] iArr = this.f18188a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f18188a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f18188a.length;
            }
            int min = Math.min(i11 + 1, this.f18188a.length);
            Arrays.fill(this.f18188a, i10, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            int[] iArr = this.f18188a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f18188a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f18188a, i10, i12, -1);
                l(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i10, int i11) {
            int[] iArr = this.f18188a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f18188a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f18188a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i10, f fVar) {
            c(i10);
            this.f18188a[i10] = fVar.f18208e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i10) {
            int length = this.f18188a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0311a();

            /* renamed from: a  reason: collision with root package name */
            int f18190a;

            /* renamed from: b  reason: collision with root package name */
            int f18191b;

            /* renamed from: c  reason: collision with root package name */
            int[] f18192c;

            /* renamed from: d  reason: collision with root package name */
            boolean f18193d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            class C0311a implements Parcelable.Creator {
                C0311a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f18190a = parcel.readInt();
                this.f18191b = parcel.readInt();
                this.f18193d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f18192c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i10) {
                int[] iArr = this.f18192c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f18190a + ", mGapDir=" + this.f18191b + ", mHasUnwantedGapAfter=" + this.f18193d + ", mGapPerSpan=" + Arrays.toString(this.f18192c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f18190a);
                parcel.writeInt(this.f18191b);
                parcel.writeInt(this.f18193d ? 1 : 0);
                int[] iArr = this.f18192c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f18192c);
            }

            a() {
            }
        }
    }
}
