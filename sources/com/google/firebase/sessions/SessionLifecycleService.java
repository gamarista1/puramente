package com.google.firebase.sessions;

import Jc.f;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0007\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", "a", "(Landroid/content/Intent;)Landroid/os/Messenger;", "Llf/M;", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "b", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", "c", "Landroid/os/Messenger;", "messenger", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleService extends Service {

    /* renamed from: d  reason: collision with root package name */
    public static final a f57950d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final HandlerThread f57951a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b  reason: collision with root package name */
    private b f57952b;

    /* renamed from: c  reason: collision with root package name */
    private Messenger f57953c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f57954a;

        /* renamed from: b  reason: collision with root package name */
        private long f57955b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList f57956c = new ArrayList();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            C6496s.h(looper, "looper");
        }

        private final void a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Broadcasting new session: ");
            c.b bVar = c.f57961f;
            sb2.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb2.toString());
            b.f57959a.a().a(bVar.a().c());
            for (Messenger messenger : new ArrayList(this.f57956c)) {
                C6496s.g(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f57955b = message.getWhen();
        }

        private final void c(Message message) {
            this.f57956c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            C6496s.g(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f57956c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f57954a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f57954a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f57955b = message.getWhen();
        }

        private final boolean e(long j10) {
            if (j10 - this.f57955b > Tg.a.t(f.f51390c.c().c())) {
                return true;
            }
            return false;
        }

        private final void f(Messenger messenger) {
            if (this.f57954a) {
                h(messenger, c.f57961f.a().c().b());
                return;
            }
            String a10 = a.f57957a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a10);
            if (a10 != null) {
                h(messenger, a10);
            }
        }

        private final void g() {
            c.b bVar = c.f57961f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            a.f57957a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain((Handler) null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f57956c.remove(messenger);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
            }
        }

        public void handleMessage(Message message) {
            C6496s.h(message, "msg");
            if (this.f57955b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f57955b + '.');
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                d(message);
            } else if (i10 == 2) {
                b(message);
            } else if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                super.handleMessage(message);
            } else {
                c(message);
            }
        }
    }

    private final Messenger a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
        }
        return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a10 = a(intent);
        if (a10 != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = a10;
            b bVar = this.f57952b;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f57953c;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f57951a.start();
        Looper looper = this.f57951a.getLooper();
        C6496s.g(looper, "handlerThread.looper");
        this.f57952b = new b(looper);
        this.f57953c = new Messenger(this.f57952b);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57951a.quit();
    }
}
