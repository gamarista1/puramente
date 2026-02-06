package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

public final class X implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewConfiguration f13684a;

    public X(ViewConfiguration viewConfiguration) {
        this.f13684a = viewConfiguration;
    }

    public long a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public long b() {
        return 40;
    }

    public long c() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    public float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1614a0.f13686a.b(this.f13684a);
        }
        return super.d();
    }

    public float f() {
        return (float) this.f13684a.getScaledMaximumFlingVelocity();
    }

    public float g() {
        return (float) this.f13684a.getScaledTouchSlop();
    }

    public float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1614a0.f13686a.a(this.f13684a);
        }
        return super.h();
    }
}
