package Hc;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import ub.C5230g;

public final class H implements G {

    /* renamed from: b  reason: collision with root package name */
    private static final a f50950b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f50951a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public H(C5230g gVar) {
        C6496s.h(gVar, "firebaseApp");
        this.f50951a = gVar;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return C6514M.f71813a;
        } catch (IllegalArgumentException e10) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e10));
        }
    }

    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean z10;
        C6496s.h(messenger, "callback");
        C6496s.h(serviceConnection, "serviceConnection");
        Context applicationContext = this.f50951a.m().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            z10 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e10) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e10);
            z10 = false;
        }
        if (!z10) {
            C6496s.g(applicationContext, "appContext");
            b(applicationContext, serviceConnection);
            Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
        }
    }
}
