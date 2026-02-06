package N9;

import android.util.SparseArray;
import ja.C3645a;
import ja.C3652h;

final class Q {

    /* renamed from: a  reason: collision with root package name */
    private int f33185a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f33186b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    private final C3652h f33187c;

    public Q(C3652h hVar) {
        this.f33187c = hVar;
        this.f33185a = -1;
    }

    public void a(int i10, Object obj) {
        boolean z10;
        boolean z11 = false;
        if (this.f33185a == -1) {
            if (this.f33186b.size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            this.f33185a = 0;
        }
        if (this.f33186b.size() > 0) {
            SparseArray sparseArray = this.f33186b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z11 = true;
            }
            C3645a.a(z11);
            if (keyAt == i10) {
                C3652h hVar = this.f33187c;
                SparseArray sparseArray2 = this.f33186b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f33186b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f33186b.size(); i10++) {
            this.f33187c.accept(this.f33186b.valueAt(i10));
        }
        this.f33185a = -1;
        this.f33186b.clear();
    }

    public void c(int i10) {
        int i11;
        int size = this.f33186b.size() - 1;
        while (size >= 0 && i10 < this.f33186b.keyAt(size)) {
            this.f33187c.accept(this.f33186b.valueAt(size));
            this.f33186b.removeAt(size);
            size--;
        }
        if (this.f33186b.size() > 0) {
            i11 = Math.min(this.f33185a, this.f33186b.size() - 1);
        } else {
            i11 = -1;
        }
        this.f33185a = i11;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f33186b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f33186b.keyAt(i12)) {
                this.f33187c.accept(this.f33186b.valueAt(i11));
                this.f33186b.removeAt(i11);
                int i13 = this.f33185a;
                if (i13 > 0) {
                    this.f33185a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public Object e(int i10) {
        if (this.f33185a == -1) {
            this.f33185a = 0;
        }
        while (true) {
            int i11 = this.f33185a;
            if (i11 > 0 && i10 < this.f33186b.keyAt(i11)) {
                this.f33185a--;
            }
        }
        while (this.f33185a < this.f33186b.size() - 1 && i10 >= this.f33186b.keyAt(this.f33185a + 1)) {
            this.f33185a++;
        }
        return this.f33186b.valueAt(this.f33185a);
    }

    public Object f() {
        SparseArray sparseArray = this.f33186b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        if (this.f33186b.size() == 0) {
            return true;
        }
        return false;
    }
}
