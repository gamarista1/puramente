package com.google.android.material.textfield;

import Ua.a;
import Ua.i;
import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C1573l;
import com.google.android.material.internal.g;
import com.google.android.material.internal.l;
import jb.C5041a;

public class TextInputEditText extends C1573l {

    /* renamed from: g  reason: collision with root package name */
    private final Rect f56116g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f56117h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f52735m);
    }

    private boolean e(TextInputLayout textInputLayout) {
        if (textInputLayout == null || !this.f56117h) {
            return false;
        }
        return true;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (e(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f56116g);
            rect.bottom = this.f56116g.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (e(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.O()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.O() && super.getHint() == null && g.c()) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f56116g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f56116g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f56117h = z10;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(C5041a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f56116g = new Rect();
        TypedArray h10 = l.h(context, attributeSet, j.f53148d5, i10, i.f52915e, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h10.getBoolean(j.f53156e5, false));
        h10.recycle();
    }
}
