package We;

import java.util.Calendar;
import java.util.Date;
import kf.C6433a;

/* renamed from: We.g  reason: case insensitive filesystem */
public abstract class C5627g {
    public static Date a() {
        return Calendar.getInstance(C6433a.f71519a).getTime();
    }

    public static Date b(long j10) {
        Calendar instance = Calendar.getInstance(C6433a.f71519a);
        instance.setTimeInMillis(j10);
        return instance.getTime();
    }
}
