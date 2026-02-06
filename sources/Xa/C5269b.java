package xa;

import Fa.C4287b;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xa.b  reason: case insensitive filesystem */
public abstract class C5269b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference f62154a;

    /* renamed from: b  reason: collision with root package name */
    private static SoftReference f62155b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* access modifiers changed from: protected */
    public Executor a() {
        ExecutorService executorService;
        synchronized (C5269b.class) {
            try {
                SoftReference softReference = f62154a;
                if (softReference != null) {
                    executorService = (ExecutorService) softReference.get();
                } else {
                    executorService = null;
                }
                if (executorService == null) {
                    zze.zza();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new C4287b("firebase-iid-executor")));
                    f62154a = new SoftReference(executorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Context context, C5268a aVar);

    /* access modifiers changed from: protected */
    public abstract void c(Context context, Bundle bundle);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int i10;
        Intent intent3 = intent;
        Context context2 = context;
        BroadcastReceiver.PendingResult pendingResult2 = pendingResult;
        try {
            Parcelable parcelableExtra = intent3.getParcelableExtra("wrapped_intent");
            Executor executor = null;
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                i10 = e(context2, intent2);
            } else if (intent.getExtras() == null) {
                i10 = 500;
            } else {
                C5268a aVar = new C5268a(intent3);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (C5269b.class) {
                    SoftReference softReference = f62155b;
                    if (softReference != null) {
                        executor = (Executor) softReference.get();
                    }
                    if (executor == null) {
                        zze.zza();
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4287b("pscm-ack-executor"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                        f62155b = new SoftReference(executor);
                    }
                }
                executor.execute(new o(context2, aVar, countDownLatch));
                int b10 = b(context2, aVar);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e10) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                }
                i10 = b10;
            }
            if (z10 && pendingResult2 != null) {
                pendingResult2.setResultCode(i10);
            }
            if (pendingResult2 != null) {
                pendingResult.finish();
            }
        } catch (Throwable th2) {
            if (pendingResult2 != null) {
                pendingResult.finish();
            }
            throw th2;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a().execute(new p(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
