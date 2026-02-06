package com.google.firebase.messaging;

import Ea.n;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.o;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C4823d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f  reason: case insensitive filesystem */
class C4825f {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f57520a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f57521b;

    /* renamed from: c  reason: collision with root package name */
    private final N f57522c;

    public C4825f(Context context, N n10, ExecutorService executorService) {
        this.f57520a = executorService;
        this.f57521b = context;
        this.f57522c = n10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f57521b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!n.f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f57521b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private void c(C4823d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f57521b.getSystemService("notification")).notify(aVar.f57506b, aVar.f57507c, aVar.f57505a.c());
    }

    private J d() {
        J n10 = J.n(this.f57522c.p("gcm.n.image"));
        if (n10 != null) {
            n10.t(this.f57520a);
        }
        return n10;
    }

    private void e(o.f fVar, J j10) {
        if (j10 != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(j10.o(), 5, TimeUnit.SECONDS);
                fVar.u(bitmap);
                fVar.H(new o.c().i(bitmap).h((Bitmap) null));
            } catch (ExecutionException e10) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                j10.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                j10.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.f57522c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        J d10 = d();
        C4823d.a e10 = C4823d.e(this.f57521b, this.f57522c);
        e(e10.f57505a, d10);
        c(e10);
        return true;
    }
}
