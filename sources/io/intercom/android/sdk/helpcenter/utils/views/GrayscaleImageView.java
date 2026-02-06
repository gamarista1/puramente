package io.intercom.android.sdk.helpcenter.utils.views;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/views/GrayscaleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "percentage", "Llf/M;", "setGrayscale", "(I)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GrayscaleImageView extends AppCompatImageView {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrayscaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6496s.h(context, "context");
        C6496s.h(attributeSet, "attributeSet");
    }

    public final void setGrayscale(int i10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(((float) 1) - (((float) i10) / ((float) 100)));
        setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
