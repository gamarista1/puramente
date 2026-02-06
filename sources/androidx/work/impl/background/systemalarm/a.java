package androidx.work.impl.background.systemalarm;

import P3.i;
import P3.j;
import P3.l;
import P3.m;
import Q3.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.s;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18839a = s.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a  reason: collision with other inner class name */
    static class C0321a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j E10 = workDatabase.E();
        i a10 = E10.a(mVar);
        if (a10 != null) {
            b(context, mVar, a10.f5064c);
            s e10 = s.e();
            String str = f18839a;
            e10.a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            E10.f(mVar);
        }
    }

    private static void b(Context context, m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            s e10 = s.e();
            String str = f18839a;
            e10.a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j10) {
        j E10 = workDatabase.E();
        i a10 = E10.a(mVar);
        if (a10 != null) {
            b(context, mVar, a10.f5064c);
            d(context, mVar, a10.f5064c, j10);
            return;
        }
        int c10 = new k(workDatabase).c();
        E10.c(l.a(mVar, c10));
        d(context, mVar, c10, j10);
    }

    private static void d(Context context, m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, mVar), 201326592);
        if (alarmManager != null) {
            C0321a.a(alarmManager, 0, j10, service);
        }
    }
}
