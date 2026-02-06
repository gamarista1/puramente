package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import y1.C2930A;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I  reason: collision with root package name */
    boolean f17881I = false;

    /* renamed from: J  reason: collision with root package name */
    int f17882J = -1;

    /* renamed from: K  reason: collision with root package name */
    int[] f17883K;

    /* renamed from: L  reason: collision with root package name */
    View[] f17884L;

    /* renamed from: M  reason: collision with root package name */
    final SparseIntArray f17885M = new SparseIntArray();

    /* renamed from: N  reason: collision with root package name */
    final SparseIntArray f17886N = new SparseIntArray();

    /* renamed from: O  reason: collision with root package name */
    c f17887O = new a();

    /* renamed from: P  reason: collision with root package name */
    final Rect f17888P = new Rect();

    /* renamed from: Q  reason: collision with root package name */
    private boolean f17889Q;

    public static final class a extends c {
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f17892a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f17893b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f17894c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f17895d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10, int i11) {
            if (!this.f17895d) {
                return d(i10, i11);
            }
            int i12 = this.f17893b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f17893b.put(i10, d10);
            return d10;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (!this.f17894c) {
                return e(i10, i11);
            }
            int i12 = this.f17892a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f17892a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f17895d || (a10 = a(this.f17893b, i10)) == -1) {
                i14 = 0;
                i13 = 0;
                i12 = 0;
            } else {
                i14 = this.f17893b.get(a10);
                i13 = a10 + 1;
                i12 = c(a10, i11) + f(a10);
                if (i12 == i11) {
                    i14++;
                    i12 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                int i15 = i12 + f11;
                if (i15 == i11) {
                    i14++;
                    i15 = 0;
                } else if (i15 > i11) {
                    i14++;
                    i15 = f11;
                }
                i13++;
            }
            if (i12 + f10 > i11) {
                return i14 + 1;
            }
            return i14;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f17893b.clear();
        }

        public void h() {
            this.f17892a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a3(RecyclerView.p.i0(context, attributeSet, i10, i11).f18130b);
    }

    private void J2(RecyclerView.w wVar, RecyclerView.B b10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i11 = i10;
            i12 = 0;
        } else {
            i12 = i10 - 1;
            i11 = -1;
            i13 = -1;
        }
        while (i12 != i11) {
            View view = this.f17884L[i12];
            b bVar = (b) view.getLayoutParams();
            int W22 = W2(wVar, b10, h0(view));
            bVar.f17891f = W22;
            bVar.f17890e = i14;
            i14 += W22;
            i12 += i13;
        }
    }

    private void K2() {
        int J10 = J();
        for (int i10 = 0; i10 < J10; i10++) {
            b bVar = (b) I(i10).getLayoutParams();
            int a10 = bVar.a();
            this.f17885M.put(a10, bVar.f());
            this.f17886N.put(a10, bVar.e());
        }
    }

    private void L2(int i10) {
        this.f17883K = M2(this.f17883K, this.f17882J, i10);
    }

    static int[] M2(int[] iArr, int i10, int i11) {
        int i12;
        if (!(iArr != null && iArr.length == i10 + 1 && iArr[iArr.length - 1] == i11)) {
            iArr = new int[(i10 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void N2() {
        this.f17885M.clear();
        this.f17886N.clear();
    }

    private int O2(RecyclerView.B b10) {
        int i10;
        if (!(J() == 0 || b10.b() == 0)) {
            T1();
            boolean n22 = n2();
            View X12 = X1(!n22, true);
            View W12 = W1(!n22, true);
            if (!(X12 == null || W12 == null)) {
                int b11 = this.f17887O.b(h0(X12), this.f17882J);
                int b12 = this.f17887O.b(h0(W12), this.f17882J);
                int min = Math.min(b11, b12);
                int max = Math.max(b11, b12);
                int b13 = this.f17887O.b(b10.b() - 1, this.f17882J) + 1;
                if (this.f17909x) {
                    i10 = Math.max(0, (b13 - max) - 1);
                } else {
                    i10 = Math.max(0, min);
                }
                if (!n22) {
                    return i10;
                }
                return Math.round((((float) i10) * (((float) Math.abs(this.f17906u.d(W12) - this.f17906u.g(X12))) / ((float) ((this.f17887O.b(h0(W12), this.f17882J) - this.f17887O.b(h0(X12), this.f17882J)) + 1)))) + ((float) (this.f17906u.m() - this.f17906u.g(X12))));
            }
        }
        return 0;
    }

    private int P2(RecyclerView.B b10) {
        if (!(J() == 0 || b10.b() == 0)) {
            T1();
            View X12 = X1(!n2(), true);
            View W12 = W1(!n2(), true);
            if (!(X12 == null || W12 == null)) {
                if (!n2()) {
                    return this.f17887O.b(b10.b() - 1, this.f17882J) + 1;
                }
                int d10 = this.f17906u.d(W12) - this.f17906u.g(X12);
                int b11 = this.f17887O.b(h0(X12), this.f17882J);
                return (int) ((((float) d10) / ((float) ((this.f17887O.b(h0(W12), this.f17882J) - b11) + 1))) * ((float) (this.f17887O.b(b10.b() - 1, this.f17882J) + 1)));
            }
        }
        return 0;
    }

    private void Q2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int V22 = V2(wVar, b10, aVar.f17913b);
        if (z10) {
            while (V22 > 0) {
                int i11 = aVar.f17913b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    aVar.f17913b = i12;
                    V22 = V2(wVar, b10, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int b11 = b10.b() - 1;
        int i13 = aVar.f17913b;
        while (i13 < b11) {
            int i14 = i13 + 1;
            int V23 = V2(wVar, b10, i14);
            if (V23 <= V22) {
                break;
            }
            i13 = i14;
            V22 = V23;
        }
        aVar.f17913b = i13;
    }

    private void R2() {
        View[] viewArr = this.f17884L;
        if (viewArr == null || viewArr.length != this.f17882J) {
            this.f17884L = new View[this.f17882J];
        }
    }

    private int U2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f17887O.b(i10, this.f17882J);
        }
        int f10 = wVar.f(i10);
        if (f10 != -1) {
            return this.f17887O.b(f10, this.f17882J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int V2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f17887O.c(i10, this.f17882J);
        }
        int i11 = this.f17886N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 != -1) {
            return this.f17887O.c(f10, this.f17882J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int W2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f17887O.f(i10);
        }
        int i11 = this.f17885M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 != -1) {
            return this.f17887O.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void X2(float f10, int i10) {
        L2(Math.max(Math.round(f10 * ((float) this.f17882J)), i10));
    }

    private void Y2(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f18134b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int S22 = S2(bVar.f17890e, bVar.f17891f);
        if (this.f17904s == 1) {
            i11 = RecyclerView.p.K(S22, i10, i14, bVar.width, false);
            i12 = RecyclerView.p.K(this.f17906u.n(), X(), i13, bVar.height, true);
        } else {
            int K10 = RecyclerView.p.K(S22, i10, i13, bVar.height, false);
            int K11 = RecyclerView.p.K(this.f17906u.n(), p0(), i14, bVar.width, true);
            i12 = K10;
            i11 = K11;
        }
        Z2(view, i11, i12, z10);
    }

    private void Z2(View view, int i10, int i11, boolean z10) {
        boolean z11;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10) {
            z11 = H1(view, i10, i11, qVar);
        } else {
            z11 = F1(view, i10, i11, qVar);
        }
        if (z11) {
            view.measure(i10, i11);
        }
    }

    private void b3() {
        int W10;
        int g02;
        if (l2() == 1) {
            W10 = o0() - f0();
            g02 = e0();
        } else {
            W10 = W() - d0();
            g02 = g0();
        }
        L2(W10 - g02);
    }

    public void A2(boolean z10) {
        if (!z10) {
            super.A2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void C1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.f17883K == null) {
            super.C1(rect, i10, i11);
        }
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f17904s == 1) {
            i13 = RecyclerView.p.n(i11, rect.height() + g02, b0());
            int[] iArr = this.f17883K;
            i12 = RecyclerView.p.n(i10, iArr[iArr.length - 1] + e02, c0());
        } else {
            i12 = RecyclerView.p.n(i10, rect.width() + e02, c0());
            int[] iArr2 = this.f17883K;
            i13 = RecyclerView.p.n(i11, iArr2[iArr2.length - 1] + g02, b0());
        }
        B1(i12, i13);
    }

    public RecyclerView.q D() {
        if (this.f17904s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        if (r13 == r7) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r13 == r10) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.B r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f17890e
            int r5 = r5.f17891f
            int r5 = r5 + r6
            android.view.View r7 = super.J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f17909x
            r11 = -1
            if (r7 == r10) goto L_0x0039
            int r7 = r23.J()
            int r7 = r7 - r9
            r10 = r11
            r12 = r10
            goto L_0x0040
        L_0x0039:
            int r7 = r23.J()
            r10 = r7
            r12 = r9
            r7 = 0
        L_0x0040:
            int r13 = r0.f17904s
            if (r13 != r9) goto L_0x004c
            boolean r13 = r23.m2()
            if (r13 == 0) goto L_0x004c
            r13 = r9
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.U2(r1, r2, r7)
            r15 = r11
            r16 = r15
            r8 = 0
            r17 = 0
            r11 = r7
            r7 = r4
        L_0x0059:
            if (r11 == r10) goto L_0x0065
            int r9 = r0.U2(r1, r2, r11)
            android.view.View r1 = r0.I(r11)
            if (r1 != r3) goto L_0x0069
        L_0x0065:
            r21 = r7
            goto L_0x0137
        L_0x0069:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0082
            if (r9 == r14) goto L_0x0082
            if (r4 == 0) goto L_0x0074
            goto L_0x0065
        L_0x0074:
            r18 = r3
            r21 = r7
        L_0x0078:
            r19 = r8
            r20 = r10
        L_0x007c:
            r7 = r16
            r8 = r17
            goto L_0x0123
        L_0x0082:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f17890e
            r18 = r3
            int r3 = r9.f17891f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009a
            if (r2 != r6) goto L_0x009a
            if (r3 != r5) goto L_0x009a
            return r1
        L_0x009a:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a2
            if (r4 == 0) goto L_0x00aa
        L_0x00a2:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
        L_0x00aa:
            r21 = r7
        L_0x00ac:
            r19 = r8
            r20 = r10
            r7 = r16
            r8 = r17
            goto L_0x00f3
        L_0x00b5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d4
            if (r7 <= r8) goto L_0x00ca
        L_0x00c9:
            goto L_0x00ac
        L_0x00ca:
            if (r7 != r8) goto L_0x0078
            if (r2 <= r15) goto L_0x00d0
            r7 = 1
            goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            if (r13 != r7) goto L_0x0078
            goto L_0x00c9
        L_0x00d4:
            if (r4 != 0) goto L_0x0078
            r19 = r8
            r20 = r10
            r8 = 0
            r10 = 1
            boolean r22 = r0.y0(r1, r8, r10)
            if (r22 == 0) goto L_0x007c
            r8 = r17
            if (r7 <= r8) goto L_0x00e9
            r7 = r16
            goto L_0x00f3
        L_0x00e9:
            if (r7 != r8) goto L_0x0121
            r7 = r16
            if (r2 <= r7) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            if (r13 != r10) goto L_0x0123
        L_0x00f3:
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x010f
            int r4 = r9.f17890e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x012b
        L_0x010f:
            int r7 = r9.f17890e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x012b
        L_0x0121:
            r7 = r16
        L_0x0123:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x012b:
            int r11 = r11 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r10 = r20
            r9 = 1
            goto L_0x0059
        L_0x0137:
            if (r4 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r4 = r21
        L_0x013c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    public boolean L1() {
        if (this.f17899D != null || this.f17881I) {
            return false;
        }
        return true;
    }

    public void M0(RecyclerView.w wVar, RecyclerView.B b10, C2930A a10) {
        super.M0(wVar, b10, a10);
        a10.t0(GridView.class.getName());
    }

    public int N(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17904s == 1) {
            return this.f17882J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return U2(wVar, b10, b10.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public void N1(RecyclerView.B b10, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.f17882J;
        for (int i11 = 0; i11 < this.f17882J && cVar.c(b10) && i10 > 0; i11++) {
            int i12 = cVar.f17924d;
            cVar2.a(i12, Math.max(0, cVar.f17927g));
            i10 -= this.f17887O.f(i12);
            cVar.f17924d += cVar.f17925e;
        }
    }

    public void P0(RecyclerView.w wVar, RecyclerView.B b10, View view, C2930A a10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, a10);
            return;
        }
        b bVar = (b) layoutParams;
        int U22 = U2(wVar, b10, bVar.a());
        if (this.f17904s == 0) {
            a10.w0(C2930A.f.b(bVar.e(), bVar.f(), U22, 1, false, false));
            return;
        }
        a10.w0(C2930A.f.b(U22, 1, bVar.e(), bVar.f(), false, false));
    }

    public void R0(RecyclerView recyclerView, int i10, int i11) {
        this.f17887O.h();
        this.f17887O.g();
    }

    public void S0(RecyclerView recyclerView) {
        this.f17887O.h();
        this.f17887O.g();
    }

    /* access modifiers changed from: package-private */
    public int S2(int i10, int i11) {
        if (this.f17904s != 1 || !m2()) {
            int[] iArr = this.f17883K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f17883K;
        int i12 = this.f17882J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f17887O.h();
        this.f17887O.g();
    }

    public int T2() {
        return this.f17882J;
    }

    public void U0(RecyclerView recyclerView, int i10, int i11) {
        this.f17887O.h();
        this.f17887O.g();
    }

    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f17887O.h();
        this.f17887O.g();
    }

    public void X0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (b10.e()) {
            K2();
        }
        super.X0(wVar, b10);
        N2();
    }

    public void Y0(RecyclerView.B b10) {
        super.Y0(b10);
        this.f17881I = false;
    }

    public void a3(int i10) {
        if (i10 != this.f17882J) {
            this.f17881I = true;
            if (i10 >= 1) {
                this.f17882J = i10;
                this.f17887O.h();
                t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public View f2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int J10 = J();
        int i12 = 1;
        if (z11) {
            i11 = J() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = J10;
            i11 = 0;
        }
        int b11 = b10.b();
        T1();
        int m10 = this.f17906u.m();
        int i13 = this.f17906u.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View I10 = I(i11);
            int h02 = h0(I10);
            if (h02 >= 0 && h02 < b11 && V2(wVar, b10, h02) == 0) {
                if (((RecyclerView.q) I10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I10;
                    }
                } else if (this.f17906u.g(I10) < i13 && this.f17906u.d(I10) >= m10) {
                    return I10;
                } else {
                    if (view == null) {
                        view = I10;
                    }
                }
            }
            i11 += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public int k0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f17904s == 0) {
            return this.f17882J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return U2(wVar, b10, b10.b() - 1) + 1;
    }

    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* access modifiers changed from: package-private */
    public void o2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        View d10;
        RecyclerView.w wVar2 = wVar;
        RecyclerView.B b11 = b10;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int l10 = this.f17906u.l();
        if (l10 != 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (J() > 0) {
            i10 = this.f17883K[this.f17882J];
        } else {
            i10 = 0;
        }
        if (z10) {
            b3();
        }
        if (cVar2.f17925e == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i24 = this.f17882J;
        if (!z11) {
            i24 = V2(wVar2, b11, cVar2.f17924d) + W2(wVar2, b11, cVar2.f17924d);
        }
        int i25 = 0;
        while (i25 < this.f17882J && cVar2.c(b11) && i24 > 0) {
            int i26 = cVar2.f17924d;
            int W22 = W2(wVar2, b11, i26);
            if (W22 <= this.f17882J) {
                i24 -= W22;
                if (i24 < 0 || (d10 = cVar2.d(wVar2)) == null) {
                    break;
                }
                this.f17884L[i25] = d10;
                i25++;
            } else {
                throw new IllegalArgumentException("Item at position " + i26 + " requires " + W22 + " spans but GridLayoutManager has only " + this.f17882J + " spans.");
            }
        }
        if (i25 == 0) {
            bVar2.f17918b = true;
            return;
        }
        J2(wVar2, b11, i25, z11);
        float f10 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i25; i28++) {
            View view = this.f17884L[i28];
            if (cVar2.f17932l == null) {
                if (z11) {
                    d(view);
                } else {
                    e(view, 0);
                }
            } else if (z11) {
                b(view);
            } else {
                c(view, 0);
            }
            j(view, this.f17888P);
            Y2(view, l10, false);
            int e10 = this.f17906u.e(view);
            if (e10 > i27) {
                i27 = e10;
            }
            float f11 = (((float) this.f17906u.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f17891f);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            X2(f10, i10);
            i27 = 0;
            for (int i29 = 0; i29 < i25; i29++) {
                View view2 = this.f17884L[i29];
                Y2(view2, 1073741824, true);
                int e11 = this.f17906u.e(view2);
                if (e11 > i27) {
                    i27 = e11;
                }
            }
        }
        for (int i30 = 0; i30 < i25; i30++) {
            View view3 = this.f17884L[i30];
            if (this.f17906u.e(view3) != i27) {
                b bVar3 = (b) view3.getLayoutParams();
                Rect rect = bVar3.f18134b;
                int i31 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i32 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int S22 = S2(bVar3.f17890e, bVar3.f17891f);
                if (this.f17904s == 1) {
                    i23 = RecyclerView.p.K(S22, 1073741824, i32, bVar3.width, false);
                    i22 = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    i22 = RecyclerView.p.K(S22, 1073741824, i31, bVar3.height, false);
                    i23 = makeMeasureSpec;
                }
                Z2(view3, i23, i22, true);
            }
        }
        bVar2.f17917a = i27;
        if (this.f17904s == 1) {
            if (cVar2.f17926f == -1) {
                i14 = cVar2.f17922b;
                i21 = i14 - i27;
            } else {
                i21 = cVar2.f17922b;
                i14 = i21 + i27;
            }
            i11 = i21;
            i13 = 0;
            i12 = 0;
        } else {
            if (cVar2.f17926f == -1) {
                i20 = cVar2.f17922b;
                i19 = i20 - i27;
            } else {
                i19 = cVar2.f17922b;
                i20 = i19 + i27;
            }
            i12 = i19;
            i11 = 0;
            i13 = i20;
            i14 = 0;
        }
        int i33 = 0;
        while (i33 < i25) {
            View view4 = this.f17884L[i33];
            b bVar4 = (b) view4.getLayoutParams();
            if (this.f17904s == 1) {
                if (m2()) {
                    int e02 = e0() + this.f17883K[this.f17882J - bVar4.f17890e];
                    i18 = i14;
                    i17 = e02;
                    i16 = e02 - this.f17906u.f(view4);
                } else {
                    int e03 = e0() + this.f17883K[bVar4.f17890e];
                    i18 = i14;
                    i16 = e03;
                    i17 = this.f17906u.f(view4) + e03;
                }
                i15 = i11;
            } else {
                int g02 = g0() + this.f17883K[bVar4.f17890e];
                i15 = g02;
                i17 = i13;
                i16 = i12;
                i18 = this.f17906u.f(view4) + g02;
            }
            z0(view4, i16, i15, i17, i18);
            if (bVar4.c() || bVar4.b()) {
                bVar2.f17919c = true;
            }
            bVar2.f17920d |= view4.hasFocusable();
            i33++;
            i14 = i18;
            i13 = i17;
            i12 = i16;
            i11 = i15;
        }
        Arrays.fill(this.f17884L, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public void q2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        super.q2(wVar, b10, aVar, i10);
        b3();
        if (b10.b() > 0 && !b10.e()) {
            Q2(wVar, b10, aVar, i10);
        }
        R2();
    }

    public int r(RecyclerView.B b10) {
        if (this.f17889Q) {
            return O2(b10);
        }
        return super.r(b10);
    }

    public int s(RecyclerView.B b10) {
        if (this.f17889Q) {
            return P2(b10);
        }
        return super.s(b10);
    }

    public int u(RecyclerView.B b10) {
        if (this.f17889Q) {
            return O2(b10);
        }
        return super.u(b10);
    }

    public int v(RecyclerView.B b10) {
        if (this.f17889Q) {
            return P2(b10);
        }
        return super.v(b10);
    }

    public int w1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        b3();
        R2();
        return super.w1(i10, wVar, b10);
    }

    public int y1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        b3();
        R2();
        return super.y1(i10, wVar, b10);
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        int f17890e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f17891f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.f17890e;
        }

        public int f() {
            return this.f17891f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        a3(i10);
    }
}
