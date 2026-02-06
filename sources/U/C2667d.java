package u;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

/* renamed from: u.d  reason: case insensitive filesystem */
public abstract class C2667d {
    public static final void a(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        throw new IllegalStateException(str);
    }
}
