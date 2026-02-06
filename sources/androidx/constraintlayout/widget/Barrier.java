package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import i1.C2059a;
import i1.C2063e;
import i1.C2064f;
import i1.C2068j;

public class Barrier extends b {

    /* renamed from: j  reason: collision with root package name */
    private int f14833j;

    /* renamed from: k  reason: collision with root package name */
    private int f14834k;

    /* renamed from: l  reason: collision with root package name */
    private C2059a f14835l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void s(C2063e eVar, int i10, boolean z10) {
        this.f14834k = i10;
        if (z10) {
            int i11 = this.f14833j;
            if (i11 == 5) {
                this.f14834k = 1;
            } else if (i11 == 6) {
                this.f14834k = 0;
            }
        } else {
            int i12 = this.f14833j;
            if (i12 == 5) {
                this.f14834k = 0;
            } else if (i12 == 6) {
                this.f14834k = 1;
            }
        }
        if (eVar instanceof C2059a) {
            ((C2059a) eVar).F1(this.f14834k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f14835l.z1();
    }

    public int getMargin() {
        return this.f14835l.B1();
    }

    public int getType() {
        return this.f14833j;
    }

    /* access modifiers changed from: protected */
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f14835l = new C2059a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f15351V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15424c1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f15413b1) {
                    this.f14835l.E1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == h.f15435d1) {
                    this.f14835l.G1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f14967d = this.f14835l;
        r();
    }

    public void k(d.a aVar, C2068j jVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
        super.k(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof C2059a) {
            C2059a aVar2 = (C2059a) jVar;
            s(aVar2, aVar.f15004e.f15062h0, ((C2064f) jVar.M()).V1());
            aVar2.E1(aVar.f15004e.f15078p0);
            aVar2.G1(aVar.f15004e.f15064i0);
        }
    }

    public void l(C2063e eVar, boolean z10) {
        s(eVar, this.f14833j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f14835l.E1(z10);
    }

    public void setDpMargin(int i10) {
        C2059a aVar = this.f14835l;
        aVar.G1((int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f14835l.G1(i10);
    }

    public void setType(int i10) {
        this.f14833j = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
