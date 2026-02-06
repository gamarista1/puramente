package com.facebook.react.modules.dialog;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogTitle;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Llf/M;", "onMeasure", "(II)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogTitle extends TextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6496s.h(context, "context");
        C6496s.h(attributeSet, "attrs");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int lineCount;
        super.onMeasure(i10, i11);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            super.onMeasure(i10, i11);
        }
    }
}
