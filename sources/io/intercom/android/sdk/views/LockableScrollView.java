package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import io.intercom.android.sdk.R;

public class LockableScrollView extends ScrollView {
    private boolean interceptTouch = false;
    private boolean isExpanded = true;
    private int maxHeight = 0;
    private boolean scrollable = true;

    public LockableScrollView(Context context) {
        super(context);
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.interceptTouch;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (!this.isExpanded) {
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.maxHeight), mode);
            } else {
                i11 = View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.scrollable || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void scrollTo(int i10, int i11) {
        if (this.scrollable) {
            super.scrollTo(i10, i11);
        }
    }

    public void setExpanded(boolean z10) {
        if (z10 != this.isExpanded) {
            this.isExpanded = z10;
            requestLayout();
            invalidate();
        }
    }

    public void setScrollingEnabled(boolean z10) {
        this.scrollable = z10;
    }

    public void setUp(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LockableScrollView);
        this.maxHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LockableScrollView_intercomHeightLimit, 0);
        this.isExpanded = obtainStyledAttributes.getBoolean(R.styleable.LockableScrollView_intercomExpanded, true);
        this.interceptTouch = obtainStyledAttributes.getBoolean(R.styleable.LockableScrollView_intercomInterceptTouch, true);
        obtainStyledAttributes.recycle();
    }

    public void toggleExpanded() {
        setExpanded(!this.isExpanded);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUp(attributeSet);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setUp(attributeSet);
    }
}
