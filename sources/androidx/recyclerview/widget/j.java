package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

public class j extends n {

    /* renamed from: d  reason: collision with root package name */
    private i f18350d;

    /* renamed from: e  reason: collision with root package name */
    private i f18351e;

    class a extends g {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
            j jVar = j.this;
            int[] c10 = jVar.c(jVar.f18358a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f18339j);
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, i iVar) {
        int J10 = pVar.J();
        View view = null;
        if (J10 == 0) {
            return null;
        }
        int m10 = iVar.m() + (iVar.n() / 2);
        int i10 = a.e.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < J10; i11++) {
            View I10 = pVar.I(i11);
            int abs = Math.abs((iVar.g(I10) + (iVar.e(I10) / 2)) - m10);
            if (abs < i10) {
                view = I10;
                i10 = abs;
            }
        }
        return view;
    }

    private i m(RecyclerView.p pVar) {
        i iVar = this.f18351e;
        if (iVar == null || iVar.f18347a != pVar) {
            this.f18351e = i.a(pVar);
        }
        return this.f18351e;
    }

    private i n(RecyclerView.p pVar) {
        if (pVar.l()) {
            return o(pVar);
        }
        if (pVar.k()) {
            return m(pVar);
        }
        return null;
    }

    private i o(RecyclerView.p pVar) {
        i iVar = this.f18350d;
        if (iVar == null || iVar.f18347a != pVar) {
            this.f18350d = i.c(pVar);
        }
        return this.f18350d;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        if (pVar.k()) {
            if (i10 > 0) {
                return true;
            }
            return false;
        } else if (i11 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean q(RecyclerView.p pVar) {
        PointF a10;
        int Y10 = pVar.Y();
        if (!(pVar instanceof RecyclerView.A.b) || (a10 = ((RecyclerView.A.b) pVar).a(Y10 - 1)) == null) {
            return false;
        }
        if (a10.x < 0.0f || a10.y < 0.0f) {
            return true;
        }
        return false;
    }

    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.k()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.l()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.A d(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.A.b)) {
            return null;
        }
        return new a(this.f18358a.getContext());
    }

    public View f(RecyclerView.p pVar) {
        if (pVar.l()) {
            return l(pVar, o(pVar));
        }
        if (pVar.k()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    public int g(RecyclerView.p pVar, int i10, int i11) {
        i n10;
        int i12;
        int Y10 = pVar.Y();
        if (Y10 == 0 || (n10 = n(pVar)) == null) {
            return -1;
        }
        int J10 = pVar.J();
        View view = null;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < J10; i15++) {
            View I10 = pVar.I(i15);
            if (I10 != null) {
                int k10 = k(I10, n10);
                if (k10 <= 0 && k10 > i14) {
                    view2 = I10;
                    i14 = k10;
                }
                if (k10 >= 0 && k10 < i13) {
                    view = I10;
                    i13 = k10;
                }
            }
        }
        boolean p10 = p(pVar, i10, i11);
        if (p10 && view != null) {
            return pVar.h0(view);
        }
        if (!p10 && view2 != null) {
            return pVar.h0(view2);
        }
        if (p10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int h02 = pVar.h0(view);
        if (q(pVar) == p10) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i16 = h02 + i12;
        if (i16 < 0 || i16 >= Y10) {
            return -1;
        }
        return i16;
    }
}
