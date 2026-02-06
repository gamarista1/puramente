package Q3;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.C6496s;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f5465a;

    public k(WorkDatabase workDatabase) {
        C6496s.h(workDatabase, "workDatabase");
        this.f5465a = workDatabase;
    }

    /* access modifiers changed from: private */
    public static final Integer d(k kVar) {
        C6496s.h(kVar, "this$0");
        return Integer.valueOf(l.d(kVar.f5465a, "next_alarm_manager_id"));
    }

    /* access modifiers changed from: private */
    public static final Integer f(k kVar, int i10, int i11) {
        C6496s.h(kVar, "this$0");
        int a10 = l.d(kVar.f5465a, "next_job_scheduler_id");
        if (i10 > a10 || a10 > i11) {
            l.e(kVar.f5465a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = a10;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object z10 = this.f5465a.z(new i(this));
        C6496s.g(z10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) z10).intValue();
    }

    public final int e(int i10, int i11) {
        Object z10 = this.f5465a.z(new j(this, i10, i11));
        C6496s.g(z10, "workDatabase.runInTransa…            id\n        })");
        return ((Number) z10).intValue();
    }
}
