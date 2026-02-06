package If;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

public final class Y0 extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y0(String str) {
        super(str);
        C6496s.h(str, MetricTracker.Object.MESSAGE);
    }
}
