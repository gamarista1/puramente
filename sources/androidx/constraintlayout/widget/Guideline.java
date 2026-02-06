package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14946a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f14946a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f14946a || bVar.f14888a != i10) {
            bVar.f14888a = i10;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f14946a || bVar.f14890b != i10) {
            bVar.f14890b = i10;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f14946a || bVar.f14892c != f10) {
            bVar.f14892c = f10;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
