package U;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import k0.m;
import mf.C6565s;

public final class j extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final int f6257a = 5;

    /* renamed from: b  reason: collision with root package name */
    private final List f6258b;

    /* renamed from: c  reason: collision with root package name */
    private final List f6259c;

    /* renamed from: d  reason: collision with root package name */
    private final l f6260d;

    /* renamed from: e  reason: collision with root package name */
    private int f6261e;

    public j(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f6258b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6259c = arrayList2;
        this.f6260d = new l();
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f6261e = 1;
        setTag(m.f23101J, Boolean.TRUE);
    }

    public final void a(k kVar) {
        kVar.k1();
        n b10 = this.f6260d.b(kVar);
        if (b10 != null) {
            b10.d();
            this.f6260d.c(kVar);
            this.f6259c.add(b10);
        }
    }

    public final n b(k kVar) {
        n b10 = this.f6260d.b(kVar);
        if (b10 != null) {
            return b10;
        }
        n nVar = (n) C6565s.M(this.f6259c);
        if (nVar == null) {
            if (this.f6261e > C6565s.p(this.f6258b)) {
                nVar = new n(getContext());
                addView(nVar);
                this.f6258b.add(nVar);
            } else {
                nVar = (n) this.f6258b.get(this.f6261e);
                k a10 = this.f6260d.a(nVar);
                if (a10 != null) {
                    a10.k1();
                    this.f6260d.c(a10);
                    nVar.d();
                }
            }
            int i10 = this.f6261e;
            if (i10 < this.f6257a - 1) {
                this.f6261e = i10 + 1;
            } else {
                this.f6261e = 0;
            }
        }
        this.f6260d.d(kVar, nVar);
        return nVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
