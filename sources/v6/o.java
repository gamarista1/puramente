package V6;

import T5.n;
import android.app.ActivityManager;
import com.google.android.gms.common.api.a;
import java.util.concurrent.TimeUnit;

public class o implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final long f34723b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f34724a;

    public o(ActivityManager activityManager) {
        this.f34724a = activityManager;
    }

    private int b() {
        int min = Math.min(this.f34724a.getMemoryClass() * 1048576, a.e.API_PRIORITY_OTHER);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        return min / 4;
    }

    /* renamed from: a */
    public y get() {
        return new y(b(), 256, a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, f34723b);
    }
}
