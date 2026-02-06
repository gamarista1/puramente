package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.O;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class W implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f16028a;

    public /* synthetic */ W(AtomicBoolean atomicBoolean) {
        this.f16028a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
        O.b.f(this.f16028a, windowInsetsController, i10);
    }
}
