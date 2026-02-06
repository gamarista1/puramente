package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s3.C2595c;
import s3.C2596d;
import s3.C2597e;

public class ProfileInstallerInitializer implements B3.a {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Context context, long j10) {
        g(context);
    }

    /* access modifiers changed from: private */
    public static void k(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C2597e(context));
    }

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: f */
    public b b(Context context) {
        Choreographer.getInstance().postFrameCallback(new C2595c(this, context.getApplicationContext()));
        return new b();
    }

    /* access modifiers changed from: package-private */
    public void g(Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = a.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new C2596d(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
