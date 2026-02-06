package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import k4.C3667i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m4.e;
import qf.C6658d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/GrayscaleTransformation;", "Lm4/e;", "<init>", "()V", "Landroid/graphics/Bitmap;", "input", "Lk4/i;", "size", "transform", "(Landroid/graphics/Bitmap;Lk4/i;Lqf/d;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getCacheKey", "cacheKey", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GrayscaleTransformation implements e {
    public static final int $stable = 0;
    /* access modifiers changed from: private */
    public static final ColorMatrixColorFilter COLOR_FILTER;
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/GrayscaleTransformation$Companion;", "", "<init>", "()V", "COLOR_FILTER", "Landroid/graphics/ColorMatrixColorFilter;", "getCOLOR_FILTER", "()Landroid/graphics/ColorMatrixColorFilter;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ColorMatrixColorFilter getCOLOR_FILTER() {
            return GrayscaleTransformation.COLOR_FILTER;
        }

        private Companion() {
        }
    }

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        COLOR_FILTER = new ColorMatrixColorFilter(colorMatrix);
    }

    public boolean equals(Object obj) {
        return obj instanceof GrayscaleTransformation;
    }

    public String getCacheKey() {
        String name = GrayscaleTransformation.class.getName();
        C6496s.g(name, "getName(...)");
        return name;
    }

    public int hashCode() {
        return GrayscaleTransformation.class.hashCode();
    }

    public String toString() {
        return "GrayscaleTransformation()";
    }

    public Object transform(Bitmap bitmap, C3667i iVar, C6658d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        paint.setColorFilter(COLOR_FILTER);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        C6496s.g(createBitmap, "createBitmap(...)");
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
