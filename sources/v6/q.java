package V6;

import T5.n;
import com.google.android.gms.common.api.a;
import java.util.concurrent.TimeUnit;

public class q implements n {

    /* renamed from: a  reason: collision with root package name */
    private static final long f34726a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        if (min < 33554432) {
            return 2097152;
        }
        return 4194304;
    }

    /* renamed from: a */
    public y get() {
        int b10 = b();
        return new y(b10, a.e.API_PRIORITY_OTHER, b10, a.e.API_PRIORITY_OTHER, b10 / 8, f34726a);
    }
}
