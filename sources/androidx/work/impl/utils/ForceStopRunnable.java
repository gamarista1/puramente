package androidx.work.impl.utils;

import P3.r;
import P3.u;
import P3.v;
import Q3.f;
import Q3.q;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1836c;
import androidx.work.D;
import androidx.work.impl.F;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.g;
import androidx.work.impl.z;
import androidx.work.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u1.p;
import x1.C2896a;

public class ForceStopRunnable implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f18965e = s.i("ForceStopRunnable");

    /* renamed from: f  reason: collision with root package name */
    private static final long f18966f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f18967a;

    /* renamed from: b  reason: collision with root package name */
    private final P f18968b;

    /* renamed from: c  reason: collision with root package name */
    private final q f18969c;

    /* renamed from: d  reason: collision with root package name */
    private int f18970d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f18971a = s.i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                s.e().j(f18971a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, P p10) {
        this.f18967a = context.getApplicationContext();
        this.f18968b = p10;
        this.f18969c = p10.j();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        PendingIntent d10 = d(context, i10);
        long currentTimeMillis = System.currentTimeMillis() + f18966f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean z10;
        boolean i10 = g.i(this.f18967a, this.f18968b.n());
        WorkDatabase n10 = this.f18968b.n();
        v H10 = n10.H();
        r G10 = n10.G();
        n10.e();
        try {
            List<u> t10 = H10.t();
            if (t10 == null || t10.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                for (u uVar : t10) {
                    H10.q(D.ENQUEUED, uVar.f5091a);
                    H10.d(uVar.f5091a, -512);
                    H10.n(uVar.f5091a, -1);
                }
            }
            G10.c();
            n10.A();
            n10.i();
            if (z10 || i10) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            n10.i();
            throw th2;
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            s.e().a(f18965e, "Rescheduling Workers.");
            this.f18968b.q();
            this.f18968b.j().e(false);
        } else if (e()) {
            s.e().a(f18965e, "Application was force-stopped, rescheduling.");
            this.f18968b.q();
            this.f18969c.d(this.f18968b.g().a().currentTimeMillis());
        } else if (a10) {
            s.e().a(f18965e, "Found unfinished work, scheduling it.");
            z.h(this.f18968b.g(), this.f18968b.n(), this.f18968b.l());
        }
    }

    public boolean e() {
        int i10;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                i10 = 570425344;
            } else {
                i10 = 536870912;
            }
            PendingIntent d10 = d(this.f18967a, i10);
            if (i11 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List a10 = ((ActivityManager) this.f18967a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a10 != null && !a10.isEmpty()) {
                    long a11 = this.f18969c.a();
                    for (int i12 = 0; i12 < a10.size(); i12++) {
                        ApplicationExitInfo a12 = f.a(a10.get(i12));
                        if (a12.getReason() == 10 && a12.getTimestamp() >= a11) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f18967a);
                return true;
            }
            return false;
        } catch (SecurityException e10) {
            e = e10;
            s.e().l(f18965e, "Ignoring exception", e);
            return true;
        } catch (IllegalArgumentException e11) {
            e = e11;
            s.e().l(f18965e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        C1836c g10 = this.f18968b.g();
        if (TextUtils.isEmpty(g10.c())) {
            s.e().a(f18965e, "The default process name was not specified.");
            return true;
        }
        boolean b10 = Q3.r.b(this.f18967a, g10);
        s e10 = s.e();
        String str = f18965e;
        e10.a(str, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f18968b.j().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        String str;
        try {
            if (!f()) {
                this.f18968b.p();
                return;
            }
            while (true) {
                F.d(this.f18967a);
                s.e().a(f18965e, "Performing cleanup operations.");
                b();
                break;
            }
            this.f18968b.p();
        } catch (SQLiteException e10) {
            s.e().c(f18965e, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
            C2896a e11 = this.f18968b.g().e();
            if (e11 != null) {
                e11.accept(illegalStateException);
            } else {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e12) {
            int i10 = this.f18970d + 1;
            this.f18970d = i10;
            if (i10 >= 3) {
                if (p.a(this.f18967a)) {
                    str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                } else {
                    str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                }
                s e13 = s.e();
                String str2 = f18965e;
                e13.d(str2, str, e12);
                IllegalStateException illegalStateException2 = new IllegalStateException(str, e12);
                C2896a e14 = this.f18968b.g().e();
                if (e14 != null) {
                    s.e().b(str2, "Routing exception to the specified exception handler", illegalStateException2);
                    e14.accept(illegalStateException2);
                } else {
                    throw illegalStateException2;
                }
            } else {
                s e15 = s.e();
                String str3 = f18965e;
                e15.b(str3, "Retrying after " + (((long) i10) * 300), e12);
                i(((long) this.f18970d) * 300);
            }
        } catch (Throwable th2) {
            this.f18968b.p();
            throw th2;
        }
    }
}
