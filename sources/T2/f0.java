package t2;

import android.util.SparseArray;
import i2.C2076a;
import i2.C2082g;

final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private int f26246a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f26247b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    private final C2082g f26248c;

    public f0(C2082g gVar) {
        this.f26248c = gVar;
        this.f26246a = -1;
    }

    public void a(int i10, Object obj) {
        boolean z10;
        boolean z11 = false;
        if (this.f26246a == -1) {
            if (this.f26247b.size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            this.f26246a = 0;
        }
        if (this.f26247b.size() > 0) {
            SparseArray sparseArray = this.f26247b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z11 = true;
            }
            C2076a.a(z11);
            if (keyAt == i10) {
                C2082g gVar = this.f26248c;
                SparseArray sparseArray2 = this.f26247b;
                gVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f26247b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f26247b.size(); i10++) {
            this.f26248c.accept(this.f26247b.valueAt(i10));
        }
        this.f26246a = -1;
        this.f26247b.clear();
    }

    public void c(int i10) {
        int i11;
        int size = this.f26247b.size() - 1;
        while (size >= 0 && i10 < this.f26247b.keyAt(size)) {
            this.f26248c.accept(this.f26247b.valueAt(size));
            this.f26247b.removeAt(size);
            size--;
        }
        if (this.f26247b.size() > 0) {
            i11 = Math.min(this.f26246a, this.f26247b.size() - 1);
        } else {
            i11 = -1;
        }
        this.f26246a = i11;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f26247b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f26247b.keyAt(i12)) {
                this.f26248c.accept(this.f26247b.valueAt(i11));
                this.f26247b.removeAt(i11);
                int i13 = this.f26246a;
                if (i13 > 0) {
                    this.f26246a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public Object e(int i10) {
        if (this.f26246a == -1) {
            this.f26246a = 0;
        }
        while (true) {
            int i11 = this.f26246a;
            if (i11 > 0 && i10 < this.f26247b.keyAt(i11)) {
                this.f26246a--;
            }
        }
        while (this.f26246a < this.f26247b.size() - 1 && i10 >= this.f26247b.keyAt(this.f26246a + 1)) {
            this.f26246a++;
        }
        return this.f26247b.valueAt(this.f26246a);
    }

    public Object f() {
        SparseArray sparseArray = this.f26247b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        if (this.f26247b.size() == 0) {
            return true;
        }
        return false;
    }
}
