package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A  reason: collision with root package name */
    int f17896A;

    /* renamed from: B  reason: collision with root package name */
    int f17897B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f17898C;

    /* renamed from: D  reason: collision with root package name */
    d f17899D;

    /* renamed from: E  reason: collision with root package name */
    final a f17900E;

    /* renamed from: F  reason: collision with root package name */
    private final b f17901F;

    /* renamed from: G  reason: collision with root package name */
    private int f17902G;

    /* renamed from: H  reason: collision with root package name */
    private int[] f17903H;

    /* renamed from: s  reason: collision with root package name */
    int f17904s;

    /* renamed from: t  reason: collision with root package name */
    private c f17905t;

    /* renamed from: u  reason: collision with root package name */
    i f17906u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f17907v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f17908w;

    /* renamed from: x  reason: collision with root package name */
    boolean f17909x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f17910y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f17911z;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        i f17912a;

        /* renamed from: b  reason: collision with root package name */
        int f17913b;

        /* renamed from: c  reason: collision with root package name */
        int f17914c;

        /* renamed from: d  reason: collision with root package name */
        boolean f17915d;

        /* renamed from: e  reason: collision with root package name */
        boolean f17916e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10;
            if (this.f17915d) {
                i10 = this.f17912a.i();
            } else {
                i10 = this.f17912a.m();
            }
            this.f17914c = i10;
        }

        public void b(View view, int i10) {
            if (this.f17915d) {
                this.f17914c = this.f17912a.d(view) + this.f17912a.o();
            } else {
                this.f17914c = this.f17912a.g(view);
            }
            this.f17913b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f17912a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f17913b = i10;
            if (this.f17915d) {
                int i11 = (this.f17912a.i() - o10) - this.f17912a.d(view);
                this.f17914c = this.f17912a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f17914c - this.f17912a.e(view);
                    int m10 = this.f17912a.m();
                    int min = e10 - (m10 + Math.min(this.f17912a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f17914c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f17912a.g(view);
            int m11 = g10 - this.f17912a.m();
            this.f17914c = g10;
            if (m11 > 0) {
                int i12 = (this.f17912a.i() - Math.min(0, (this.f17912a.i() - o10) - this.f17912a.d(view))) - (g10 + this.f17912a.e(view));
                if (i12 < 0) {
                    this.f17914c -= Math.min(m11, -i12);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.B b10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (qVar.c() || qVar.a() < 0 || qVar.a() >= b10.b()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f17913b = -1;
            this.f17914c = Integer.MIN_VALUE;
            this.f17915d = false;
            this.f17916e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f17913b + ", mCoordinate=" + this.f17914c + ", mLayoutFromEnd=" + this.f17915d + ", mValid=" + this.f17916e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f17917a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17918b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17919c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17920d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f17917a = 0;
            this.f17918b = false;
            this.f17919c = false;
            this.f17920d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f17921a = true;

        /* renamed from: b  reason: collision with root package name */
        int f17922b;

        /* renamed from: c  reason: collision with root package name */
        int f17923c;

        /* renamed from: d  reason: collision with root package name */
        int f17924d;

        /* renamed from: e  reason: collision with root package name */
        int f17925e;

        /* renamed from: f  reason: collision with root package name */
        int f17926f;

        /* renamed from: g  reason: collision with root package name */
        int f17927g;

        /* renamed from: h  reason: collision with root package name */
        int f17928h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f17929i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f17930j = false;

        /* renamed from: k  reason: collision with root package name */
        int f17931k;

        /* renamed from: l  reason: collision with root package name */
        List f17932l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f17933m;

        c() {
        }

        private View e() {
            int size = this.f17932l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.F) this.f17932l.get(i10)).f18066a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f17924d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f17924d = -1;
            } else {
                this.f17924d = ((RecyclerView.q) f10.getLayoutParams()).a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.B b10) {
            int i10 = this.f17924d;
            if (i10 < 0 || i10 >= b10.b()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.w wVar) {
            if (this.f17932l != null) {
                return e();
            }
            View o10 = wVar.o(this.f17924d);
            this.f17924d += this.f17925e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f17932l.size();
            View view2 = null;
            int i10 = a.e.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.F) this.f17932l.get(i11)).f18066a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a10 = (qVar.a() - this.f17924d) * this.f17925e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f17934a;

        /* renamed from: b  reason: collision with root package name */
        int f17935b;

        /* renamed from: c  reason: collision with root package name */
        boolean f17936c;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.f17934a >= 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f17934a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17934a);
            parcel.writeInt(this.f17935b);
            parcel.writeInt(this.f17936c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f17934a = parcel.readInt();
            this.f17935b = parcel.readInt();
            this.f17936c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f17934a = dVar.f17934a;
            this.f17935b = dVar.f17935b;
            this.f17936c = dVar.f17936c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private boolean B2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        View f22;
        boolean z10;
        boolean z11 = false;
        if (J() == 0) {
            return false;
        }
        View V10 = V();
        if (V10 == null || !aVar.d(V10, b10)) {
            boolean z12 = this.f17907v;
            boolean z13 = this.f17910y;
            if (z12 != z13 || (f22 = f2(wVar, b10, aVar.f17915d, z13)) == null) {
                return false;
            }
            aVar.b(f22, h0(f22));
            if (!b10.e() && L1()) {
                int g10 = this.f17906u.g(f22);
                int d10 = this.f17906u.d(f22);
                int m10 = this.f17906u.m();
                int i10 = this.f17906u.i();
                if (d10 > m10 || g10 >= m10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (g10 >= i10 && d10 > i10) {
                    z11 = true;
                }
                if (z10 || z11) {
                    if (aVar.f17915d) {
                        m10 = i10;
                    }
                    aVar.f17914c = m10;
                }
            }
            return true;
        }
        aVar.c(V10, h0(V10));
        return true;
    }

    private boolean C2(RecyclerView.B b10, a aVar) {
        int i10;
        boolean z10;
        int i11;
        boolean z11 = false;
        if (!b10.e() && (i10 = this.f17896A) != -1) {
            if (i10 < 0 || i10 >= b10.b()) {
                this.f17896A = -1;
                this.f17897B = Integer.MIN_VALUE;
            } else {
                aVar.f17913b = this.f17896A;
                d dVar = this.f17899D;
                if (dVar != null && dVar.a()) {
                    boolean z12 = this.f17899D.f17936c;
                    aVar.f17915d = z12;
                    if (z12) {
                        aVar.f17914c = this.f17906u.i() - this.f17899D.f17935b;
                    } else {
                        aVar.f17914c = this.f17906u.m() + this.f17899D.f17935b;
                    }
                    return true;
                } else if (this.f17897B == Integer.MIN_VALUE) {
                    View C10 = C(this.f17896A);
                    if (C10 == null) {
                        if (J() > 0) {
                            if (this.f17896A < h0(I(0))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 == this.f17909x) {
                                z11 = true;
                            }
                            aVar.f17915d = z11;
                        }
                        aVar.a();
                    } else if (this.f17906u.e(C10) > this.f17906u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f17906u.g(C10) - this.f17906u.m() < 0) {
                        aVar.f17914c = this.f17906u.m();
                        aVar.f17915d = false;
                        return true;
                    } else if (this.f17906u.i() - this.f17906u.d(C10) < 0) {
                        aVar.f17914c = this.f17906u.i();
                        aVar.f17915d = true;
                        return true;
                    } else {
                        if (aVar.f17915d) {
                            i11 = this.f17906u.d(C10) + this.f17906u.o();
                        } else {
                            i11 = this.f17906u.g(C10);
                        }
                        aVar.f17914c = i11;
                    }
                    return true;
                } else {
                    boolean z13 = this.f17909x;
                    aVar.f17915d = z13;
                    if (z13) {
                        aVar.f17914c = this.f17906u.i() - this.f17897B;
                    } else {
                        aVar.f17914c = this.f17906u.m() + this.f17897B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void D2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        int i10;
        if (!C2(b10, aVar) && !B2(wVar, b10, aVar)) {
            aVar.a();
            if (this.f17910y) {
                i10 = b10.b() - 1;
            } else {
                i10 = 0;
            }
            aVar.f17913b = i10;
        }
    }

    private void E2(int i10, int i11, boolean z10, RecyclerView.B b10) {
        int i12;
        int i13;
        this.f17905t.f17933m = v2();
        this.f17905t.f17926f = i10;
        int[] iArr = this.f17903H;
        boolean z11 = false;
        iArr[0] = 0;
        int i14 = 1;
        iArr[1] = 0;
        M1(b10, iArr);
        int max = Math.max(0, this.f17903H[0]);
        int max2 = Math.max(0, this.f17903H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f17905t;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar.f17928h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f17929i = max;
        if (z11) {
            cVar.f17928h = i12 + this.f17906u.j();
            View i22 = i2();
            c cVar2 = this.f17905t;
            if (this.f17909x) {
                i14 = -1;
            }
            cVar2.f17925e = i14;
            int h02 = h0(i22);
            c cVar3 = this.f17905t;
            cVar2.f17924d = h02 + cVar3.f17925e;
            cVar3.f17922b = this.f17906u.d(i22);
            i13 = this.f17906u.d(i22) - this.f17906u.i();
        } else {
            View j22 = j2();
            this.f17905t.f17928h += this.f17906u.m();
            c cVar4 = this.f17905t;
            if (!this.f17909x) {
                i14 = -1;
            }
            cVar4.f17925e = i14;
            int h03 = h0(j22);
            c cVar5 = this.f17905t;
            cVar4.f17924d = h03 + cVar5.f17925e;
            cVar5.f17922b = this.f17906u.g(j22);
            i13 = (-this.f17906u.g(j22)) + this.f17906u.m();
        }
        c cVar6 = this.f17905t;
        cVar6.f17923c = i11;
        if (z10) {
            cVar6.f17923c = i11 - i13;
        }
        cVar6.f17927g = i13;
    }

    private void F2(int i10, int i11) {
        int i12;
        this.f17905t.f17923c = this.f17906u.i() - i11;
        c cVar = this.f17905t;
        if (this.f17909x) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        cVar.f17925e = i12;
        cVar.f17924d = i10;
        cVar.f17926f = 1;
        cVar.f17922b = i11;
        cVar.f17927g = Integer.MIN_VALUE;
    }

    private void G2(a aVar) {
        F2(aVar.f17913b, aVar.f17914c);
    }

    private void H2(int i10, int i11) {
        int i12;
        this.f17905t.f17923c = i11 - this.f17906u.m();
        c cVar = this.f17905t;
        cVar.f17924d = i10;
        if (this.f17909x) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        cVar.f17925e = i12;
        cVar.f17926f = -1;
        cVar.f17922b = i11;
        cVar.f17927g = Integer.MIN_VALUE;
    }

    private void I2(a aVar) {
        H2(aVar.f17913b, aVar.f17914c);
    }

    private int O1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        T1();
        i iVar = this.f17906u;
        View X12 = X1(!this.f17911z, true);
        return l.a(b10, iVar, X12, W1(!this.f17911z, true), this, this.f17911z);
    }

    private int P1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        T1();
        i iVar = this.f17906u;
        View X12 = X1(!this.f17911z, true);
        return l.b(b10, iVar, X12, W1(!this.f17911z, true), this, this.f17911z, this.f17909x);
    }

    private int Q1(RecyclerView.B b10) {
        if (J() == 0) {
            return 0;
        }
        T1();
        i iVar = this.f17906u;
        View X12 = X1(!this.f17911z, true);
        return l.c(b10, iVar, X12, W1(!this.f17911z, true), this, this.f17911z);
    }

    private View V1() {
        return b2(0, J());
    }

    private View Z1() {
        return b2(J() - 1, -1);
    }

    private View d2() {
        if (this.f17909x) {
            return V1();
        }
        return Z1();
    }

    private View e2() {
        if (this.f17909x) {
            return Z1();
        }
        return V1();
    }

    private int g2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int i12 = this.f17906u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -x2(-i12, wVar, b10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f17906u.i() - i14) <= 0) {
            return i13;
        }
        this.f17906u.r(i11);
        return i11 + i13;
    }

    private int h2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int m10;
        int m11 = i10 - this.f17906u.m();
        if (m11 <= 0) {
            return 0;
        }
        int i11 = -x2(m11, wVar, b10);
        int i12 = i10 + i11;
        if (!z10 || (m10 = i12 - this.f17906u.m()) <= 0) {
            return i11;
        }
        this.f17906u.r(-m10);
        return i11 - m10;
    }

    private View i2() {
        int i10;
        if (this.f17909x) {
            i10 = 0;
        } else {
            i10 = J() - 1;
        }
        return I(i10);
    }

    private View j2() {
        int i10;
        if (this.f17909x) {
            i10 = J() - 1;
        } else {
            i10 = 0;
        }
        return I(i10);
    }

    private void p2(RecyclerView.w wVar, RecyclerView.B b10, int i10, int i11) {
        boolean z10;
        if (b10.g() && J() != 0 && !b10.e() && L1()) {
            List k10 = wVar.k();
            int size = k10.size();
            int h02 = h0(I(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.F f10 = (RecyclerView.F) k10.get(i14);
                if (!f10.w()) {
                    if (f10.n() < h02) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != this.f17909x) {
                        i12 += this.f17906u.e(f10.f18066a);
                    } else {
                        i13 += this.f17906u.e(f10.f18066a);
                    }
                }
            }
            this.f17905t.f17932l = k10;
            if (i12 > 0) {
                H2(h0(j2()), i10);
                c cVar = this.f17905t;
                cVar.f17928h = i12;
                cVar.f17923c = 0;
                cVar.a();
                U1(wVar, this.f17905t, b10, false);
            }
            if (i13 > 0) {
                F2(h0(i2()), i11);
                c cVar2 = this.f17905t;
                cVar2.f17928h = i13;
                cVar2.f17923c = 0;
                cVar2.a();
                U1(wVar, this.f17905t, b10, false);
            }
            this.f17905t.f17932l = null;
        }
    }

    private void r2(RecyclerView.w wVar, c cVar) {
        if (cVar.f17921a && !cVar.f17933m) {
            int i10 = cVar.f17927g;
            int i11 = cVar.f17929i;
            if (cVar.f17926f == -1) {
                t2(wVar, i10, i11);
            } else {
                u2(wVar, i10, i11);
            }
        }
    }

    private void s2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    n1(i12, wVar);
                }
                return;
            }
            while (i10 > i11) {
                n1(i10, wVar);
                i10--;
            }
        }
    }

    private void t2(RecyclerView.w wVar, int i10, int i11) {
        int J10 = J();
        if (i10 >= 0) {
            int h10 = (this.f17906u.h() - i10) + i11;
            if (this.f17909x) {
                for (int i12 = 0; i12 < J10; i12++) {
                    View I10 = I(i12);
                    if (this.f17906u.g(I10) < h10 || this.f17906u.q(I10) < h10) {
                        s2(wVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = J10 - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View I11 = I(i14);
                if (this.f17906u.g(I11) < h10 || this.f17906u.q(I11) < h10) {
                    s2(wVar, i13, i14);
                    return;
                }
            }
        }
    }

    private void u2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int J10 = J();
            if (this.f17909x) {
                int i13 = J10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View I10 = I(i14);
                    if (this.f17906u.d(I10) > i12 || this.f17906u.p(I10) > i12) {
                        s2(wVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < J10; i15++) {
                View I11 = I(i15);
                if (this.f17906u.d(I11) > i12 || this.f17906u.p(I11) > i12) {
                    s2(wVar, 0, i15);
                    return;
                }
            }
        }
    }

    private void w2() {
        if (this.f17904s == 1 || !m2()) {
            this.f17909x = this.f17908w;
        } else {
            this.f17909x = !this.f17908w;
        }
    }

    public void A2(boolean z10) {
        g((String) null);
        if (this.f17910y != z10) {
            this.f17910y = z10;
            t1();
        }
    }

    public View C(int i10) {
        int J10 = J();
        if (J10 == 0) {
            return null;
        }
        int h02 = i10 - h0(I(0));
        if (h02 >= 0 && h02 < J10) {
            View I10 = I(h02);
            if (h0(I10) == i10) {
                return I10;
            }
        }
        return super.C(i10);
    }

    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public boolean G1() {
        if (X() == 1073741824 || p0() == 1073741824 || !q0()) {
            return false;
        }
        return true;
    }

    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        if (this.f17898C) {
            k1(wVar);
            wVar.c();
        }
    }

    public void I1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public View J0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int R12;
        View view2;
        View view3;
        w2();
        if (J() == 0 || (R12 = R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        E2(R12, (int) (((float) this.f17906u.n()) * 0.33333334f), false, b10);
        c cVar = this.f17905t;
        cVar.f17927g = Integer.MIN_VALUE;
        cVar.f17921a = false;
        U1(wVar, cVar, b10, true);
        if (R12 == -1) {
            view2 = e2();
        } else {
            view2 = d2();
        }
        if (R12 == -1) {
            view3 = j2();
        } else {
            view3 = i2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Y1());
            accessibilityEvent.setToIndex(a2());
        }
    }

    public boolean L1() {
        if (this.f17899D == null && this.f17907v == this.f17910y) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void M1(RecyclerView.B b10, int[] iArr) {
        int i10;
        int k22 = k2(b10);
        if (this.f17905t.f17926f == -1) {
            i10 = 0;
        } else {
            i10 = k22;
            k22 = 0;
        }
        iArr[0] = k22;
        iArr[1] = i10;
    }

    /* access modifiers changed from: package-private */
    public void N1(RecyclerView.B b10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f17924d;
        if (i10 >= 0 && i10 < b10.b()) {
            cVar2.a(i10, Math.max(0, cVar.f17927g));
        }
    }

    /* access modifiers changed from: package-private */
    public int R1(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f17904s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f17904s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f17904s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f17904s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f17904s != 1 && m2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f17904s != 1 && m2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public c S1() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void T1() {
        if (this.f17905t == null) {
            this.f17905t = S1();
        }
    }

    /* access modifiers changed from: package-private */
    public int U1(RecyclerView.w wVar, c cVar, RecyclerView.B b10, boolean z10) {
        int i10 = cVar.f17923c;
        int i11 = cVar.f17927g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f17927g = i11 + i10;
            }
            r2(wVar, cVar);
        }
        int i12 = cVar.f17923c + cVar.f17928h;
        b bVar = this.f17901F;
        while (true) {
            if ((!cVar.f17933m && i12 <= 0) || !cVar.c(b10)) {
                break;
            }
            bVar.a();
            o2(wVar, b10, cVar, bVar);
            if (!bVar.f17918b) {
                cVar.f17922b += bVar.f17917a * cVar.f17926f;
                if (!bVar.f17919c || cVar.f17932l != null || !b10.e()) {
                    int i13 = cVar.f17923c;
                    int i14 = bVar.f17917a;
                    cVar.f17923c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f17927g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f17917a;
                    cVar.f17927g = i16;
                    int i17 = cVar.f17923c;
                    if (i17 < 0) {
                        cVar.f17927g = i16 + i17;
                    }
                    r2(wVar, cVar);
                }
                if (z10 && bVar.f17920d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f17923c;
    }

    /* access modifiers changed from: package-private */
    public View W1(boolean z10, boolean z11) {
        if (this.f17909x) {
            return c2(0, J(), z10, z11);
        }
        return c2(J() - 1, -1, z10, z11);
    }

    public void X0(RecyclerView.w wVar, RecyclerView.B b10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int g22;
        int i15;
        View C10;
        int g10;
        int i16;
        int i17 = -1;
        if (!(this.f17899D == null && this.f17896A == -1) && b10.b() == 0) {
            k1(wVar);
            return;
        }
        d dVar = this.f17899D;
        if (dVar != null && dVar.a()) {
            this.f17896A = this.f17899D.f17934a;
        }
        T1();
        this.f17905t.f17921a = false;
        w2();
        View V10 = V();
        a aVar = this.f17900E;
        if (!aVar.f17916e || this.f17896A != -1 || this.f17899D != null) {
            aVar.e();
            a aVar2 = this.f17900E;
            aVar2.f17915d = this.f17909x ^ this.f17910y;
            D2(wVar, b10, aVar2);
            this.f17900E.f17916e = true;
        } else if (V10 != null && (this.f17906u.g(V10) >= this.f17906u.i() || this.f17906u.d(V10) <= this.f17906u.m())) {
            this.f17900E.c(V10, h0(V10));
        }
        c cVar = this.f17905t;
        if (cVar.f17931k >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        cVar.f17926f = i10;
        int[] iArr = this.f17903H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(b10, iArr);
        int max = Math.max(0, this.f17903H[0]) + this.f17906u.m();
        int max2 = Math.max(0, this.f17903H[1]) + this.f17906u.j();
        if (!(!b10.e() || (i15 = this.f17896A) == -1 || this.f17897B == Integer.MIN_VALUE || (C10 = C(i15)) == null)) {
            if (this.f17909x) {
                i16 = this.f17906u.i() - this.f17906u.d(C10);
                g10 = this.f17897B;
            } else {
                g10 = this.f17906u.g(C10) - this.f17906u.m();
                i16 = this.f17897B;
            }
            int i18 = i16 - g10;
            if (i18 > 0) {
                max += i18;
            } else {
                max2 -= i18;
            }
        }
        a aVar3 = this.f17900E;
        if (!aVar3.f17915d ? !this.f17909x : this.f17909x) {
            i17 = 1;
        }
        q2(wVar, b10, aVar3, i17);
        w(wVar);
        this.f17905t.f17933m = v2();
        this.f17905t.f17930j = b10.e();
        this.f17905t.f17929i = 0;
        a aVar4 = this.f17900E;
        if (aVar4.f17915d) {
            I2(aVar4);
            c cVar2 = this.f17905t;
            cVar2.f17928h = max;
            U1(wVar, cVar2, b10, false);
            c cVar3 = this.f17905t;
            i12 = cVar3.f17922b;
            int i19 = cVar3.f17924d;
            int i20 = cVar3.f17923c;
            if (i20 > 0) {
                max2 += i20;
            }
            G2(this.f17900E);
            c cVar4 = this.f17905t;
            cVar4.f17928h = max2;
            cVar4.f17924d += cVar4.f17925e;
            U1(wVar, cVar4, b10, false);
            c cVar5 = this.f17905t;
            i11 = cVar5.f17922b;
            int i21 = cVar5.f17923c;
            if (i21 > 0) {
                H2(i19, i12);
                c cVar6 = this.f17905t;
                cVar6.f17928h = i21;
                U1(wVar, cVar6, b10, false);
                i12 = this.f17905t.f17922b;
            }
        } else {
            G2(aVar4);
            c cVar7 = this.f17905t;
            cVar7.f17928h = max2;
            U1(wVar, cVar7, b10, false);
            c cVar8 = this.f17905t;
            i11 = cVar8.f17922b;
            int i22 = cVar8.f17924d;
            int i23 = cVar8.f17923c;
            if (i23 > 0) {
                max += i23;
            }
            I2(this.f17900E);
            c cVar9 = this.f17905t;
            cVar9.f17928h = max;
            cVar9.f17924d += cVar9.f17925e;
            U1(wVar, cVar9, b10, false);
            c cVar10 = this.f17905t;
            i12 = cVar10.f17922b;
            int i24 = cVar10.f17923c;
            if (i24 > 0) {
                F2(i22, i11);
                c cVar11 = this.f17905t;
                cVar11.f17928h = i24;
                U1(wVar, cVar11, b10, false);
                i11 = this.f17905t.f17922b;
            }
        }
        if (J() > 0) {
            if (this.f17909x ^ this.f17910y) {
                int g23 = g2(i11, wVar, b10, true);
                i13 = i12 + g23;
                i14 = i11 + g23;
                g22 = h2(i13, wVar, b10, false);
            } else {
                int h22 = h2(i12, wVar, b10, true);
                i13 = i12 + h22;
                i14 = i11 + h22;
                g22 = g2(i14, wVar, b10, false);
            }
            i12 = i13 + g22;
            i11 = i14 + g22;
        }
        p2(wVar, b10, i12, i11);
        if (!b10.e()) {
            this.f17906u.s();
        } else {
            this.f17900E.e();
        }
        this.f17907v = this.f17910y;
    }

    /* access modifiers changed from: package-private */
    public View X1(boolean z10, boolean z11) {
        if (this.f17909x) {
            return c2(J() - 1, -1, z10, z11);
        }
        return c2(0, J(), z10, z11);
    }

    public void Y0(RecyclerView.B b10) {
        super.Y0(b10);
        this.f17899D = null;
        this.f17896A = -1;
        this.f17897B = Integer.MIN_VALUE;
        this.f17900E.e();
    }

    public int Y1() {
        View c22 = c2(0, J(), false, true);
        if (c22 == null) {
            return -1;
        }
        return h0(c22);
    }

    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < h0(I(0))) {
            z10 = true;
        }
        if (z10 != this.f17909x) {
            i11 = -1;
        }
        if (this.f17904s == 0) {
            return new PointF((float) i11, 0.0f);
        }
        return new PointF(0.0f, (float) i11);
    }

    public int a2() {
        View c22 = c2(J() - 1, -1, false, true);
        if (c22 == null) {
            return -1;
        }
        return h0(c22);
    }

    /* access modifiers changed from: package-private */
    public View b2(int i10, int i11) {
        int i12;
        int i13;
        T1();
        if (i11 <= i10 && i11 >= i10) {
            return I(i10);
        }
        if (this.f17906u.g(I(i10)) < this.f17906u.m()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        if (this.f17904s == 0) {
            return this.f18113e.a(i10, i11, i13, i12);
        }
        return this.f18114f.a(i10, i11, i13, i12);
    }

    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f17899D = dVar;
            if (this.f17896A != -1) {
                dVar.b();
            }
            t1();
        }
    }

    /* access modifiers changed from: package-private */
    public View c2(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        T1();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.f17904s == 0) {
            return this.f18113e.a(i10, i11, i12, i13);
        }
        return this.f18114f.a(i10, i11, i12, i13);
    }

    public Parcelable d1() {
        if (this.f17899D != null) {
            return new d(this.f17899D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z10 = this.f17907v ^ this.f17909x;
            dVar.f17936c = z10;
            if (z10) {
                View i22 = i2();
                dVar.f17935b = this.f17906u.i() - this.f17906u.d(i22);
                dVar.f17934a = h0(i22);
            } else {
                View j22 = j2();
                dVar.f17934a = h0(j22);
                dVar.f17935b = this.f17906u.g(j22) - this.f17906u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public View f2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        T1();
        int J10 = J();
        if (z11) {
            i12 = J() - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = J10;
            i12 = 0;
            i10 = 1;
        }
        int b11 = b10.b();
        int m10 = this.f17906u.m();
        int i13 = this.f17906u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i12 != i11) {
            View I10 = I(i12);
            int h02 = h0(I10);
            int g10 = this.f17906u.g(I10);
            int d10 = this.f17906u.d(I10);
            if (h02 >= 0 && h02 < b11) {
                if (!((RecyclerView.q) I10.getLayoutParams()).c()) {
                    if (d10 > m10 || g10 >= m10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (g10 < i13 || d10 <= i13) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z12 && !z13) {
                        return I10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = I10;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = I10;
                    }
                    view2 = I10;
                } else if (view3 == null) {
                    view3 = I10;
                }
            }
            i12 += i10;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public void g(String str) {
        if (this.f17899D == null) {
            super.g(str);
        }
    }

    public boolean k() {
        if (this.f17904s == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int k2(RecyclerView.B b10) {
        if (b10.d()) {
            return this.f17906u.n();
        }
        return 0;
    }

    public boolean l() {
        if (this.f17904s == 1) {
            return true;
        }
        return false;
    }

    public int l2() {
        return this.f17904s;
    }

    /* access modifiers changed from: protected */
    public boolean m2() {
        if (Z() == 1) {
            return true;
        }
        return false;
    }

    public boolean n2() {
        return this.f17911z;
    }

    public void o(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        int i12;
        if (this.f17904s != 0) {
            i10 = i11;
        }
        if (J() != 0 && i10 != 0) {
            T1();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            E2(i12, Math.abs(i10), true, b10);
            N1(b10, this.f17905t, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void o2(RecyclerView.w wVar, RecyclerView.B b10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        View d10 = cVar.d(wVar);
        if (d10 == null) {
            bVar.f17918b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f17932l == null) {
            boolean z12 = this.f17909x;
            if (cVar.f17926f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                d(d10);
            } else {
                e(d10, 0);
            }
        } else {
            boolean z13 = this.f17909x;
            if (cVar.f17926f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                b(d10);
            } else {
                c(d10, 0);
            }
        }
        A0(d10, 0, 0);
        bVar.f17917a = this.f17906u.e(d10);
        if (this.f17904s == 1) {
            if (m2()) {
                i14 = o0() - f0();
                i13 = i14 - this.f17906u.f(d10);
            } else {
                i13 = e0();
                i14 = this.f17906u.f(d10) + i13;
            }
            if (cVar.f17926f == -1) {
                int i15 = cVar.f17922b;
                i10 = i15;
                i11 = i14;
                i12 = i15 - bVar.f17917a;
            } else {
                int i16 = cVar.f17922b;
                i12 = i16;
                i11 = i14;
                i10 = bVar.f17917a + i16;
            }
        } else {
            int g02 = g0();
            int f10 = this.f17906u.f(d10) + g02;
            if (cVar.f17926f == -1) {
                int i17 = cVar.f17922b;
                i11 = i17;
                i12 = g02;
                i10 = f10;
                i13 = i17 - bVar.f17917a;
            } else {
                int i18 = cVar.f17922b;
                i12 = g02;
                i11 = bVar.f17917a + i18;
                i10 = f10;
                i13 = i18;
            }
        }
        z0(d10, i13, i12, i11, i10);
        if (qVar.c() || qVar.b()) {
            bVar.f17919c = true;
        }
        bVar.f17920d = d10.hasFocusable();
    }

    public void p(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f17899D;
        int i12 = -1;
        if (dVar == null || !dVar.a()) {
            w2();
            z10 = this.f17909x;
            i11 = this.f17896A;
            if (i11 == -1) {
                if (z10) {
                    i11 = i10 - 1;
                } else {
                    i11 = 0;
                }
            }
        } else {
            d dVar2 = this.f17899D;
            z10 = dVar2.f17936c;
            i11 = dVar2.f17934a;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.f17902G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public int q(RecyclerView.B b10) {
        return O1(b10);
    }

    /* access modifiers changed from: package-private */
    public void q2(RecyclerView.w wVar, RecyclerView.B b10, a aVar, int i10) {
    }

    public int r(RecyclerView.B b10) {
        return P1(b10);
    }

    public int s(RecyclerView.B b10) {
        return Q1(b10);
    }

    public boolean s0() {
        return true;
    }

    public int t(RecyclerView.B b10) {
        return O1(b10);
    }

    public int u(RecyclerView.B b10) {
        return P1(b10);
    }

    public int v(RecyclerView.B b10) {
        return Q1(b10);
    }

    /* access modifiers changed from: package-private */
    public boolean v2() {
        if (this.f17906u.k() == 0 && this.f17906u.h() == 0) {
            return true;
        }
        return false;
    }

    public int w1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17904s == 1) {
            return 0;
        }
        return x2(i10, wVar, b10);
    }

    public void x1(int i10) {
        this.f17896A = i10;
        this.f17897B = Integer.MIN_VALUE;
        d dVar = this.f17899D;
        if (dVar != null) {
            dVar.b();
        }
        t1();
    }

    /* access modifiers changed from: package-private */
    public int x2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int i11;
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        T1();
        this.f17905t.f17921a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        E2(i11, abs, true, b10);
        c cVar = this.f17905t;
        int U12 = cVar.f17927g + U1(wVar, cVar, b10, false);
        if (U12 < 0) {
            return 0;
        }
        if (abs > U12) {
            i10 = i11 * U12;
        }
        this.f17906u.r(-i10);
        this.f17905t.f17931k = i10;
        return i10;
    }

    public int y1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17904s == 0) {
            return 0;
        }
        return x2(i10, wVar, b10);
    }

    public void y2(int i10) {
        if (i10 == 0 || i10 == 1) {
            g((String) null);
            if (i10 != this.f17904s || this.f17906u == null) {
                i b10 = i.b(this, i10);
                this.f17906u = b10;
                this.f17900E.f17912a = b10;
                this.f17904s = i10;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void z2(boolean z10) {
        g((String) null);
        if (z10 != this.f17908w) {
            this.f17908w = z10;
            t1();
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f17904s = 1;
        this.f17908w = false;
        this.f17909x = false;
        this.f17910y = false;
        this.f17911z = true;
        this.f17896A = -1;
        this.f17897B = Integer.MIN_VALUE;
        this.f17899D = null;
        this.f17900E = new a();
        this.f17901F = new b();
        this.f17902G = 2;
        this.f17903H = new int[2];
        y2(i10);
        z2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f17904s = 1;
        this.f17908w = false;
        this.f17909x = false;
        this.f17910y = false;
        this.f17911z = true;
        this.f17896A = -1;
        this.f17897B = Integer.MIN_VALUE;
        this.f17899D = null;
        this.f17900E = new a();
        this.f17901F = new b();
        this.f17902G = 2;
        this.f17903H = new int[2];
        RecyclerView.p.d i02 = RecyclerView.p.i0(context, attributeSet, i10, i11);
        y2(i02.f18129a);
        z2(i02.f18131c);
        A2(i02.f18132d);
    }
}
