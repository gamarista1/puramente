package io.intercom.android.sdk.utilities.coil;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import m4.C3772a;
import m4.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/RoundedCornersAnimatedTransformation;", "Lm4/a;", "", "radius", "<init>", "(F)V", "Landroid/graphics/Canvas;", "canvas", "Lm4/c;", "transform", "(Landroid/graphics/Canvas;)Lm4/c;", "F", "getRadius", "()F", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoundedCornersAnimatedTransformation implements C3772a {
    public static final int $stable = 0;
    private final float radius;

    public RoundedCornersAnimatedTransformation(float f10) {
        this.radius = f10;
    }

    public final float getRadius() {
        return this.radius;
    }

    public c transform(Canvas canvas) {
        C6496s.h(canvas, "canvas");
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        float f10 = this.radius;
        path.addRoundRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), f10, f10, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return c.TRANSLUCENT;
    }
}
