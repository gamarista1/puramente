package androidx.core.view;

import android.view.ViewConfiguration;
import x1.i;

/* renamed from: androidx.core.view.c0  reason: case insensitive filesystem */
public final /* synthetic */ class C1682c0 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f16060a;

    public /* synthetic */ C1682c0(ViewConfiguration viewConfiguration) {
        this.f16060a = viewConfiguration;
    }

    public final Object get() {
        return Integer.valueOf(this.f16060a.getScaledMaximumFlingVelocity());
    }
}
