package com.reactnativecommunity.picker;

import Q7.a;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import m8.C3825q;
import m8.r;

@a(name = "RNCAndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager implements r {
    public static final String REACT_CLASS = "RNCAndroidDialogPicker";
    private final w0 mDelegate = new C3825q(this);

    public /* bridge */ /* synthetic */ void blur(View view) {
        super.blur((j) view);
    }

    public /* bridge */ /* synthetic */ void focus(View view) {
        super.focus((j) view);
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
        super.setColor((j) view, num);
    }

    @C3500a(name = "dropdownIconColor")
    public /* bridge */ /* synthetic */ void setDropdownIconColor(View view, int i10) {
        super.setDropdownIconColor((j) view, i10);
    }

    @C3500a(name = "dropdownIconRippleColor")
    public /* bridge */ /* synthetic */ void setDropdownIconRippleColor(View view, int i10) {
        super.setDropdownIconRippleColor((j) view, i10);
    }

    @C3500a(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z10) {
        super.setEnabled((j) view, z10);
    }

    @C3500a(name = "items")
    public /* bridge */ /* synthetic */ void setItems(View view, ReadableArray readableArray) {
        super.setItems((j) view, readableArray);
    }

    public /* bridge */ /* synthetic */ void setNativeSelected(View view, int i10) {
        super.setNativeSelected((j) view, i10);
    }

    @C3500a(defaultInt = 1, name = "numberOfLines")
    public /* bridge */ /* synthetic */ void setNumberOfLines(View view, int i10) {
        super.setNumberOfLines((j) view, i10);
    }

    @C3500a(name = "prompt")
    public /* bridge */ /* synthetic */ void setPrompt(View view, String str) {
        super.setPrompt((j) view, str);
    }

    @C3500a(name = "selected")
    public /* bridge */ /* synthetic */ void setSelected(View view, int i10) {
        super.setSelected((j) view, i10);
    }

    /* access modifiers changed from: protected */
    public j createViewInstance(C3415h0 h0Var) {
        return new j(h0Var, 0);
    }
}
