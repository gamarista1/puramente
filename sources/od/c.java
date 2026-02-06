package Od;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c extends CancellationException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        C6496s.h(str, MetricTracker.Object.MESSAGE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Module destroyed. All coroutines are cancelled." : str);
    }
}
