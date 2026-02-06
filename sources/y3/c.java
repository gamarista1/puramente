package y3;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import com.amazon.a.a.o.b;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28725a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        C6496s.h(cursor, b.f37479b);
        Uri notificationUri = cursor.getNotificationUri();
        C6496s.g(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        C6496s.h(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
