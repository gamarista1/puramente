package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.c;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/PaddedDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$B;", "state", "Llf/M;", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$B;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "padding", "I", "Landroid/graphics/drawable/Drawable;", "dividerDrawable", "Landroid/graphics/drawable/Drawable;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaddedDividerItemDecoration extends RecyclerView.o {
    public static final int $stable = 8;
    private final Context context;
    private Drawable dividerDrawable;
    private final int padding;

    public PaddedDividerItemDecoration(Context context2) {
        C6496s.h(context2, "context");
        this.context = context2;
        this.padding = (int) TypedValue.applyDimension(1, 16.0f, context2.getResources().getDisplayMetrics());
        this.dividerDrawable = c.getDrawable(context2, R.drawable.intercom_list_divider);
    }

    public final Context getContext() {
        return this.context;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        int i10;
        C6496s.h(canvas, "canvas");
        C6496s.h(recyclerView, "parent");
        C6496s.h(b10, "state");
        int paddingLeft = recyclerView.getPaddingLeft() + this.padding;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.padding;
        if (recyclerView.getAdapter() != null) {
            int childCount = recyclerView.getChildCount() - 1;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = recyclerView.getChildAt(i11);
                if (recyclerView.j0(childAt) != -1) {
                    int bottom = childAt.getBottom();
                    Drawable drawable = this.dividerDrawable;
                    if (drawable != null) {
                        i10 = drawable.getIntrinsicHeight();
                    } else {
                        i10 = 0;
                    }
                    int i12 = i10 + bottom;
                    Drawable drawable2 = this.dividerDrawable;
                    if (drawable2 != null) {
                        drawable2.setBounds(paddingLeft, bottom, width, i12);
                    }
                    Drawable drawable3 = this.dividerDrawable;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }
}
