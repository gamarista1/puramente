package V0;

import android.content.Context;
import android.os.Build;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f8231a = new q();

    private q() {
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return r.f8232a.a(context);
        }
        return 0;
    }
}
