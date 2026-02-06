package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1677a;
import com.facebook.react.C3367m;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.I;
import y1.C2930A;

class g extends C1677a {

    /* renamed from: a  reason: collision with root package name */
    private final String f42031a = g.class.getSimpleName();

    g() {
    }

    private void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        View childAt;
        ReadableMap readableMap;
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C3367m.f40926b);
        if (readableMap2 != null) {
            accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
            if (view instanceof ViewGroup) {
                View childAt2 = ((ViewGroup) view).getChildAt(0);
                if (childAt2 instanceof ViewGroup) {
                    Integer num = null;
                    int i10 = 0;
                    Integer num2 = null;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt2;
                        if (i10 < viewGroup.getChildCount()) {
                            View childAt3 = viewGroup.getChildAt(i10);
                            if (view instanceof f) {
                                z10 = ((f) view).x(childAt3);
                            } else if (view instanceof e) {
                                z10 = ((e) view).A(childAt3);
                            } else {
                                return;
                            }
                            ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(C3367m.f40927c);
                            if (childAt3 instanceof ViewGroup) {
                                ViewGroup viewGroup2 = (ViewGroup) childAt3;
                                if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(C3367m.f40927c)) != null) {
                                    readableMap3 = readableMap;
                                }
                                if (z10 && readableMap3 != null) {
                                    if (num == null) {
                                        num = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                    }
                                    num2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                }
                                if (!(num == null || num2 == null)) {
                                    accessibilityEvent.setFromIndex(num.intValue());
                                    accessibilityEvent.setToIndex(num2.intValue());
                                }
                                i10++;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void d(View view, C2930A a10) {
        I.e e10 = I.e.e(view);
        if (e10 != null) {
            I.a0(a10, e10, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C3367m.f40926b);
        if (readableMap != null) {
            a10.v0(C2930A.e.a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof f) {
            a10.V0(((f) view).getScrollEnabled());
        } else if (view instanceof e) {
            a10.V0(((e) view).getScrollEnabled());
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof f) || (view instanceof e)) {
            c(view, accessibilityEvent);
            return;
        }
        String str = this.f42031a;
        ReactSoftExceptionLogger.logSoftException(str, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        super.onInitializeAccessibilityNodeInfo(view, a10);
        if ((view instanceof f) || (view instanceof e)) {
            d(view, a10);
            return;
        }
        String str = this.f42031a;
        ReactSoftExceptionLogger.logSoftException(str, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }
}
