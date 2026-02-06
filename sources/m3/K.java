package m3;

import android.os.Build;
import android.util.Log;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final K f23844a = new K();

    private K() {
    }

    public final boolean a(int i10) {
        if (Build.ID == null || !Log.isLoggable("Paging", i10)) {
            return false;
        }
        return true;
    }

    public final void b(int i10, String str, Throwable th2) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (i10 == 2) {
            Log.v("Paging", str, th2);
        } else if (i10 == 3) {
            Log.d("Paging", str, th2);
        } else {
            throw new IllegalArgumentException("debug level " + i10 + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
        }
    }
}
