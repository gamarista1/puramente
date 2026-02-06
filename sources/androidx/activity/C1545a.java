package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.activity.a  reason: case insensitive filesystem */
public final class C1545a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1545a f10785a = new C1545a();

    private C1545a() {
    }

    public final BackEvent a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    public final float b(BackEvent backEvent) {
        C6496s.h(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        C6496s.h(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        C6496s.h(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        C6496s.h(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
