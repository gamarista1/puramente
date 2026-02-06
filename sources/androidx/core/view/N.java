package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f16023a;

    public /* synthetic */ N(View view) {
        this.f16023a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f16023a.getContext().getSystemService("input_method")).showSoftInput(this.f16023a, 0);
    }
}
