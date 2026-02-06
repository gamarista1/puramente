package com.facebook.react.uimanager;

import android.graphics.Rect;

public interface K {
    void getClippingRect(Rect rect);

    boolean getRemoveClippedSubviews();

    void updateClippingRect();
}
