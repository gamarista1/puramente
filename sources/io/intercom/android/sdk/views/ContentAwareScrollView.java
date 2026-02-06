package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ContentAwareScrollView extends ScrollView {
    private Listener listener;

    public interface Listener {
        void onBottomReached();

        void onScrollChanged(int i10);
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public Listener getListener() {
        return this.listener;
    }

    public boolean isAtBottom() {
        int bottom = getChildAt(0).getBottom();
        if (bottom != 0 && getBottom() + getScrollY() >= bottom) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void notifyListenerIfAtBottom() {
        if (this.listener != null && isAtBottom()) {
            this.listener.onBottomReached();
        }
    }

    /* access modifiers changed from: protected */
    public void notifyListenerScrollChanged(int i10) {
        Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onScrollChanged(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        notifyListenerIfAtBottom();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        notifyListenerIfAtBottom();
        notifyListenerScrollChanged(i11);
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
        notifyListenerIfAtBottom();
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentAwareScrollView(Context context) {
        super(context);
    }
}
