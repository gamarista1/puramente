package androidx.core.view;

import android.view.ViewConfiguration;
import x1.i;

/* renamed from: androidx.core.view.d0  reason: case insensitive filesystem */
public final /* synthetic */ class C1684d0 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f16075a;

    public /* synthetic */ C1684d0(ViewConfiguration viewConfiguration) {
        this.f16075a = viewConfiguration;
    }

    public final Object get() {
        return Integer.valueOf(this.f16075a.getScaledMinimumFlingVelocity());
    }
}
