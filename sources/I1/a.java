package I1;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends IOException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th2) {
        super(str, th2);
        C6496s.h(str, MetricTracker.Object.MESSAGE);
    }
}
