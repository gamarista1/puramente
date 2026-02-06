package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.view.f0  reason: case insensitive filesystem */
public final /* synthetic */ class C1688f0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowInsets[] f16077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View.OnApplyWindowInsetsListener f16078b;

    public /* synthetic */ C1688f0(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f16077a = windowInsetsArr;
        this.f16078b = onApplyWindowInsetsListener;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return C1690g0.d(this.f16077a, this.f16078b, view, windowInsets);
    }
}
