package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, C3428v> implements C3423p {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public ViewGroupManager() {
        super((ReactApplicationContext) null);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i10) {
        mZIndexHash.put(view, Integer.valueOf(i10));
    }

    public void addViews(T t10, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            addView(t10, list.get(i10), i10);
        }
    }

    public Class<? extends C3428v> getShadowNodeClass() {
        return C3428v.class;
    }

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeView(T t10, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i10 = 0; i10 < getChildCount(t10); i10++) {
            if (getChildAt(t10, i10) == view) {
                removeViewAt(t10, i10);
                return;
            }
        }
    }

    public void updateExtraData(T t10, Object obj) {
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void addView(T t10, View view, int i10) {
        t10.addView(view, i10);
    }

    public C3428v createShadowNodeInstance() {
        return new C3428v();
    }

    public View getChildAt(T t10, int i10) {
        return t10.getChildAt(i10);
    }

    public int getChildCount(T t10) {
        return t10.getChildCount();
    }

    public void removeViewAt(T t10, int i10) {
        UiThreadUtil.assertOnUiThread();
        t10.removeViewAt(i10);
    }
}
