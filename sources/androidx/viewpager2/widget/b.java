package androidx.viewpager2.widget;

import androidx.viewpager2.widget.f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

final class b extends f.i {

    /* renamed from: a  reason: collision with root package name */
    private final List f18573a;

    b(int i10) {
        this.f18573a = new ArrayList(i10);
    }

    private void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public void a(int i10) {
        try {
            for (f.i a10 : this.f18573a) {
                a10.a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    public void b(int i10, float f10, int i11) {
        try {
            for (f.i b10 : this.f18573a) {
                b10.b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    public void c(int i10) {
        try {
            for (f.i c10 : this.f18573a) {
                c10.c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(f.i iVar) {
        this.f18573a.add(iVar);
    }
}
