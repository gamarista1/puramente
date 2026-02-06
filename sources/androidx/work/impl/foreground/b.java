package androidx.work.impl.foreground;

import M3.b;
import M3.d;
import M3.e;
import M3.f;
import P3.m;
import P3.u;
import P3.x;
import Ug.C5600w0;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.C1846f;
import androidx.work.impl.P;
import androidx.work.j;
import androidx.work.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

public class b implements d, C1846f {

    /* renamed from: k  reason: collision with root package name */
    static final String f18919k = s.i("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f18920a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public P f18921b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final R3.b f18922c;

    /* renamed from: d  reason: collision with root package name */
    final Object f18923d = new Object();

    /* renamed from: e  reason: collision with root package name */
    m f18924e;

    /* renamed from: f  reason: collision with root package name */
    final Map f18925f;

    /* renamed from: g  reason: collision with root package name */
    final Map f18926g;

    /* renamed from: h  reason: collision with root package name */
    final Map f18927h;

    /* renamed from: i  reason: collision with root package name */
    final e f18928i;

    /* renamed from: j  reason: collision with root package name */
    private C0322b f18929j;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18930a;

        a(String str) {
            this.f18930a = str;
        }

        public void run() {
            u g10 = b.this.f18921b.k().g(this.f18930a);
            if (g10 != null && g10.k()) {
                synchronized (b.this.f18923d) {
                    b.this.f18926g.put(x.a(g10), g10);
                    b bVar = b.this;
                    b.this.f18927h.put(x.a(g10), f.b(bVar.f18928i, g10, bVar.f18922c.b(), b.this));
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b  reason: collision with other inner class name */
    interface C0322b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    b(Context context) {
        this.f18920a = context;
        P i10 = P.i(context);
        this.f18921b = i10;
        this.f18922c = i10.o();
        this.f18924e = null;
        this.f18925f = new LinkedHashMap();
        this.f18927h = new HashMap();
        this.f18926g = new HashMap();
        this.f18928i = new e(this.f18921b.m());
        this.f18921b.k().e(this);
    }

    public static Intent d(Context context, m mVar, j jVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar.a());
        intent.putExtra("KEY_NOTIFICATION", jVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, m mVar, j jVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", jVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar.a());
        intent.putExtra("KEY_NOTIFICATION", jVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        s e10 = s.e();
        String str = f18919k;
        e10.f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f18921b.e(UUID.fromString(stringExtra));
        }
    }

    private void i(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s e10 = s.e();
        String str = f18919k;
        e10.a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f18929j != null) {
            this.f18925f.put(mVar, new j(intExtra, notification, intExtra2));
            if (this.f18924e == null) {
                this.f18924e = mVar;
                this.f18929j.c(intExtra, intExtra2, notification);
                return;
            }
            this.f18929j.a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f18925f.entrySet()) {
                    i10 |= ((j) value.getValue()).a();
                }
                j jVar = (j) this.f18925f.get(this.f18924e);
                if (jVar != null) {
                    this.f18929j.c(jVar.c(), i10, jVar.b());
                }
            }
        }
    }

    private void j(Intent intent) {
        s e10 = s.e();
        String str = f18919k;
        e10.f(str, "Started foreground service " + intent);
        this.f18922c.d(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void b(m mVar, boolean z10) {
        C5600w0 w0Var;
        Map.Entry entry;
        synchronized (this.f18923d) {
            try {
                if (((u) this.f18926g.remove(mVar)) != null) {
                    w0Var = (C5600w0) this.f18927h.remove(mVar);
                } else {
                    w0Var = null;
                }
                if (w0Var != null) {
                    w0Var.n((CancellationException) null);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        j jVar = (j) this.f18925f.remove(mVar);
        if (mVar.equals(this.f18924e)) {
            if (this.f18925f.size() > 0) {
                Iterator it = this.f18925f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.f18924e = (m) entry.getKey();
                if (this.f18929j != null) {
                    j jVar2 = (j) entry.getValue();
                    this.f18929j.c(jVar2.c(), jVar2.a(), jVar2.b());
                    this.f18929j.d(jVar2.c());
                }
            } else {
                this.f18924e = null;
            }
        }
        C0322b bVar = this.f18929j;
        if (jVar != null && bVar != null) {
            s.e().a(f18919k, "Removing Notification (id: " + jVar.c() + ", workSpecId: " + mVar + ", notificationType: " + jVar.a());
            bVar.d(jVar.c());
        }
    }

    public void e(u uVar, M3.b bVar) {
        if (bVar instanceof b.C0106b) {
            String str = uVar.f5091a;
            s e10 = s.e();
            String str2 = f18919k;
            e10.a(str2, "Constraints unmet for WorkSpec " + str);
            this.f18921b.s(x.a(uVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Intent intent) {
        s.e().f(f18919k, "Stopping foreground service");
        C0322b bVar = this.f18929j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f18929j = null;
        synchronized (this.f18923d) {
            try {
                for (C5600w0 n10 : this.f18927h.values()) {
                    n10.n((CancellationException) null);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f18921b.k().p(this);
    }

    /* access modifiers changed from: package-private */
    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(C0322b bVar) {
        if (this.f18929j != null) {
            s.e().c(f18919k, "A callback already exists.");
        } else {
            this.f18929j = bVar;
        }
    }
}
