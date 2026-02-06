package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import com.facebook.yoga.h;

public interface U {
    void addChildAt(U u10, int i10);

    void addNativeChildAt(U u10, int i10);

    void calculateLayout();

    void calculateLayout(float f10, float f11);

    Iterable calculateLayoutOnChildren();

    void dirty();

    void dispatchUpdates(float f10, float f11, s0 s0Var, D d10);

    boolean dispatchUpdatesWillChangeLayout(float f10, float f11);

    void dispose();

    U getChildAt(int i10);

    int getChildCount();

    Integer getHeightMeasureSpec();

    h getLayoutDirection();

    float getLayoutHeight();

    U getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    B getNativeKind();

    int getNativeOffsetForChild(U u10);

    U getNativeParent();

    U getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStyleWidth();

    C3415h0 getThemedContext();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasUpdates();

    int indexOf(U u10);

    int indexOfNativeChild(U u10);

    boolean isDescendantOf(U u10);

    boolean isLayoutOnly();

    boolean isVirtual();

    void markUpdateSeen();

    void onBeforeLayout(D d10);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    U removeChildAt(int i10);

    U removeNativeChildAt(int i10);

    void setIsLayoutOnly(boolean z10);

    void setLayoutDirection(h hVar);

    void setLayoutParent(U u10);

    void setLocalData(Object obj);

    void setMeasureSpecs(int i10, int i11);

    void setPadding(int i10, float f10);

    void setReactTag(int i10);

    void setRootTag(int i10);

    void setStyleHeight(float f10);

    void setStyleWidth(float f10);

    void setThemedContext(C3415h0 h0Var);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(W w10);
}
