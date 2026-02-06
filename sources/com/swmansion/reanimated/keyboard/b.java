package com.swmansion.reanimated.keyboard;

import android.view.View;
import androidx.core.view.D0;
import androidx.core.view.I;

public final /* synthetic */ class b implements I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowsInsetsManager f59629a;

    public /* synthetic */ b(WindowsInsetsManager windowsInsetsManager) {
        this.f59629a = windowsInsetsManager;
    }

    public final D0 i(View view, D0 d02) {
        return this.f59629a.onApplyWindowInsetsListener(view, d02);
    }
}
