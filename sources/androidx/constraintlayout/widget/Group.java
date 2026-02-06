package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f14968e = false;
    }

    public void m(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f14931v0.p1(0);
        bVar.f14931v0.Q0(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
