package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.view.View;
import com.facebook.react.views.view.e;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f72450a = null;

    /* renamed from: b  reason: collision with root package name */
    private Paint f72451b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffXfermode f72452c;

    public a(Context context) {
        super(context);
        setLayerType(1, (Paint) null);
        this.f72451b = new Paint(1);
        this.f72452c = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap l(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private void m() {
        Bitmap bitmap = this.f72450a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        View childAt = getChildAt(0);
        childAt.setVisibility(0);
        this.f72450a = l(childAt);
        childAt.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m();
        if (this.f72450a != null) {
            this.f72451b.setXfermode(this.f72452c);
            canvas.drawBitmap(this.f72450a, 0.0f, 0.0f, this.f72451b);
            this.f72451b.setXfermode((Xfermode) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m();
        }
    }
}
