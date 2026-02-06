package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import i.j;

/* renamed from: androidx.appcompat.widget.s  reason: case insensitive filesystem */
class C1579s extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f12004b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12005a;

    public C1579s(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        g0 v10 = g0.v(context, attributeSet, j.f21548Y1, i10, i11);
        if (v10.s(j.f21557a2)) {
            b(v10.a(j.f21557a2, false));
        }
        setBackgroundDrawable(v10.g(j.f21552Z1));
        v10.x();
    }

    private void b(boolean z10) {
        if (f12004b) {
            this.f12005a = z10;
        } else {
            h.a(this, z10);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f12004b && this.f12005a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f12004b && this.f12005a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f12004b && this.f12005a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
