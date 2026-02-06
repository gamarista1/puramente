package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.uimanager.p  reason: case insensitive filesystem */
public interface C3423p extends C3424q {
    void addView(View view, View view2, int i10);

    View getChildAt(View view, int i10);

    int getChildCount(View view);

    void removeAllViews(View view) {
        C6496s.h(view, "parent");
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount(view);
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(view, childCount);
            } else {
                return;
            }
        }
    }

    void removeViewAt(View view, int i10);
}
