package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class H {

    /* renamed from: a  reason: collision with root package name */
    private int f16016a;

    /* renamed from: b  reason: collision with root package name */
    private int f16017b;

    public H(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f16016a | this.f16017b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f16017b = i10;
        } else {
            this.f16016a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f16017b = 0;
        } else {
            this.f16016a = 0;
        }
    }
}
