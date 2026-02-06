package R5;

import android.os.Handler;
import android.os.Looper;

public class i extends e {

    /* renamed from: b  reason: collision with root package name */
    private static i f33703b;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i g() {
        if (f33703b == null) {
            f33703b = new i();
        }
        return f33703b;
    }

    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
