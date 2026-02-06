package Q3;

import P3.d;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.C6496s;
import y3.g;

public abstract class l {
    public static final void c(Context context, g gVar) {
        C6496s.h(context, "context");
        C6496s.h(gVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.g();
            try {
                gVar.R("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                gVar.R("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                gVar.j();
            } finally {
                gVar.k();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        int i10;
        Long a10 = workDatabase.D().a(str);
        int i11 = 0;
        if (a10 != null) {
            i10 = (int) a10.longValue();
        } else {
            i10 = 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            i11 = i10 + 1;
        }
        e(workDatabase, str, i11);
        return i10;
    }

    /* access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.D().b(new d(str, Long.valueOf((long) i10)));
    }
}
