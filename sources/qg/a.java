package Qg;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f64723a = new ConcurrentHashMap();

    public static final Void a(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
