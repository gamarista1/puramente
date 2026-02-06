package xa;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.Y;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.revenuecat.purchases.common.Constants;
import io.branch.rnbranch.RNBranchModule;
import io.jsonwebtoken.JwsHeader;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: xa.c  reason: case insensitive filesystem */
public class C5270c {

    /* renamed from: h  reason: collision with root package name */
    private static int f62156h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f62157i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f62158j = G.f62150a;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f62159k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    private final Y f62160a = new Y();

    /* renamed from: b  reason: collision with root package name */
    private final Context f62161b;

    /* renamed from: c  reason: collision with root package name */
    private final E f62162c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f62163d;

    /* renamed from: e  reason: collision with root package name */
    private final Messenger f62164e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f62165f;

    /* renamed from: g  reason: collision with root package name */
    private l f62166g;

    public C5270c(Context context) {
        this.f62161b = context;
        this.f62162c = new E(context);
        this.f62164e = new Messenger(new i(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f62163d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task e(Bundle bundle) {
        if (m(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C5270c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        cVar.f62166g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f62165f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                        if (stringExtra2 == null) {
                            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                        }
                        if (stringExtra2.startsWith(f.f37531c)) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                                Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
                                str2 = str2.substring(1);
                            }
                            cVar.l(str, intent2.putExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, str2).getExtras());
                            return;
                        }
                        synchronized (cVar.f62160a) {
                            int i10 = 0;
                            while (i10 < cVar.f62160a.size()) {
                                try {
                                    cVar.l((String) cVar.f62160a.i(i10), intent2.getExtras());
                                    i10++;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = f62159k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            cVar.l(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task i(Bundle bundle) {
        String j10 = j();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f62160a) {
            this.f62160a.put(j10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f62162c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f62161b, intent);
        intent.putExtra(JwsHeader.KEY_ID, "|ID|" + j10 + f.f37531c);
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f62164e);
        if (!(this.f62165f == null && this.f62166g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f62165f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f62166g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(f62158j, new C5275h(this, j10, this.f62163d.schedule(new C5274g(taskCompletionSource), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f62162c.b() == 2) {
            this.f62161b.sendBroadcast(intent);
        } else {
            this.f62161b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(f62158j, new C5275h(this, j10, this.f62163d.schedule(new C5274g(taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    private static synchronized String j() {
        String num;
        synchronized (C5270c.class) {
            int i10 = f62156h;
            f62156h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void k(Context context, Intent intent) {
        synchronized (C5270c.class) {
            try {
                if (f62157i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f62157i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f62157i);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f62160a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f62160a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    public Task a() {
        if (this.f62162c.a() >= 241100000) {
            return D.b(this.f62161b).d(5, Bundle.EMPTY).continueWith(f62158j, C5273f.f62168a);
        }
        return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C5268a aVar) {
        if (this.f62162c.a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.p0());
        Integer q02 = aVar.q0();
        if (q02 != null) {
            bundle.putInt("google.product_id", q02.intValue());
        }
        return D.b(this.f62161b).c(3, bundle);
    }

    public Task c(Bundle bundle) {
        if (this.f62162c.a() >= 12000000) {
            return D.b(this.f62161b).d(1, bundle).continueWith(f62158j, C5272e.f62167a);
        }
        if (this.f62162c.b() != 0) {
            return i(bundle).continueWithTask(f62158j, new H(this, bundle));
        }
        return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    public Task d(boolean z10) {
        if (this.f62162c.a() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return D.b(this.f62161b).c(4, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        if (task.isSuccessful() && m((Bundle) task.getResult())) {
            return i(bundle).onSuccessTask(f62158j, F.f62149a);
        }
        return task;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f62160a) {
            this.f62160a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
