package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C6496s;
import n7.C3863a;

/* renamed from: com.facebook.react.uimanager.d0  reason: case insensitive filesystem */
public final class C3407d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C3407d0 f41566a = new C3407d0();

    private C3407d0() {
    }

    public static final C3405c0 a(View view) {
        C6496s.h(view, "reactView");
        while (!(view instanceof C3405c0)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            C3863a.a(parent instanceof View);
            view = (View) parent;
        }
        return (C3405c0) view;
    }

    public static final Point b(View view) {
        C6496s.h(view, "v");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
