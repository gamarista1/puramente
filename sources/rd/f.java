package Rd;

import android.util.Log;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.PrintStream;
import kotlin.jvm.internal.C6496s;
import lf.C6523g;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f52354a;

    public f(String str) {
        C6496s.h(str, "category");
        this.f52354a = str;
    }

    public void a(c cVar, String str, Throwable th2) {
        C6496s.h(cVar, "type");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (!g.f52355a) {
            String str2 = "[" + cVar.b() + "] " + this.f52354a + "\t" + str;
            PrintStream printStream = System.out;
            printStream.println(str2);
            if (th2 != null) {
                printStream.println(e.a(th2) + "\n" + C6523g.b(th2));
                return;
            }
            return;
        }
        int a10 = c.f52339b.a(cVar);
        if (a10 == 3) {
            Log.d(this.f52354a, str, th2);
        } else if (a10 == 4) {
            Log.i(this.f52354a, str, th2);
        } else if (a10 == 5) {
            Log.w(this.f52354a, str, th2);
        } else if (a10 == 6) {
            Log.e(this.f52354a, str, th2);
        } else if (a10 == 7) {
            Log.e(this.f52354a, str, th2);
        }
    }
}
