package Jd;

import android.os.Handler;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

public final class b implements e {
    /* access modifiers changed from: private */
    public static final void d(C6787a aVar) {
        aVar.invoke();
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public void b(long j10, C6787a aVar) {
        C6496s.h(aVar, "callback");
        new Handler().postDelayed(new a(aVar), j10);
    }
}
