package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import i.C2037a;

/* renamed from: androidx.appcompat.widget.v  reason: case insensitive filesystem */
public class C1582v extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    private final C1580t f12013a;

    public C1582v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21250E);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.f12013a.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public C1582v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c0.a(this, getContext());
        C1580t tVar = new C1580t(this);
        this.f12013a = tVar;
        tVar.c(attributeSet, i10);
    }
}
