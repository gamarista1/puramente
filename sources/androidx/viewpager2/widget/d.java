package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.f;
import java.util.Locale;

final class d extends f.i {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayoutManager f18577a;

    /* renamed from: b  reason: collision with root package name */
    private f.k f18578b;

    d(LinearLayoutManager linearLayoutManager) {
        this.f18577a = linearLayoutManager;
    }

    public void a(int i10) {
    }

    public void b(int i10, float f10, int i11) {
        if (this.f18578b != null) {
            float f11 = -f10;
            int i12 = 0;
            while (i12 < this.f18577a.J()) {
                View I10 = this.f18577a.I(i12);
                if (I10 != null) {
                    this.f18578b.a(I10, ((float) (this.f18577a.h0(I10) - i10)) + f11);
                    i12++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i12), Integer.valueOf(this.f18577a.J())}));
                }
            }
        }
    }

    public void c(int i10) {
    }

    /* access modifiers changed from: package-private */
    public f.k d() {
        return this.f18578b;
    }

    /* access modifiers changed from: package-private */
    public void e(f.k kVar) {
        this.f18578b = kVar;
    }
}
