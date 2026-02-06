package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f17261a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f17262b = new AtomicBoolean(false);

    public static final class a extends C1785h {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            M.f17152b.c(activity);
        }
    }

    private r() {
    }

    public static final void a(Context context) {
        C6496s.h(context, "context");
        if (!f17262b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C6496s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
