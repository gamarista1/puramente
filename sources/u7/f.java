package U7;

import com.facebook.react.modules.core.JavaTimerManager;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JavaTimerManager f34422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f34423b;

    public /* synthetic */ f(JavaTimerManager javaTimerManager, boolean z10) {
        this.f34422a = javaTimerManager;
        this.f34423b = z10;
    }

    public final void run() {
        JavaTimerManager.A(this.f34422a, this.f34423b);
    }
}
