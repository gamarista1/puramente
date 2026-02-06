package Q3;

import P3.u;
import android.os.Build;
import androidx.work.C1834a;
import androidx.work.C1836c;
import androidx.work.C1838e;
import androidx.work.C1840g;
import androidx.work.D;
import androidx.work.F;
import androidx.work.impl.C;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.x;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class d {
    public static final void a(WorkDatabase workDatabase, C1836c cVar, C c10) {
        int i10;
        C6496s.h(workDatabase, "workDatabase");
        C6496s.h(cVar, "configuration");
        C6496s.h(c10, "continuation");
        List t10 = C6565s.t(c10);
        int i11 = 0;
        while (!t10.isEmpty()) {
            C c11 = (C) C6565s.N(t10);
            List f10 = c11.f();
            C6496s.g(f10, "current.work");
            Iterable<F> iterable = f10;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i10 = 0;
                for (F d10 : iterable) {
                    if (d10.d().f5100j.e() && (i10 = i10 + 1) < 0) {
                        C6565s.w();
                    }
                }
            } else {
                i10 = 0;
            }
            i11 += i10;
            List e10 = c11.e();
            if (e10 != null) {
                t10.addAll(e10);
            }
        }
        if (i11 != 0) {
            int y10 = workDatabase.H().y();
            int b10 = cVar.b();
            if (y10 + i11 > b10) {
                throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + b10 + ";\nalready enqueued count: " + y10 + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
            }
        }
    }

    public static final u b(u uVar) {
        u uVar2 = uVar;
        C6496s.h(uVar2, "workSpec");
        C1838e eVar = uVar2.f5100j;
        String str = uVar2.f5093c;
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        if (C6496s.c(str, cls.getName())) {
            return uVar2;
        }
        if (!eVar.f() && !eVar.i()) {
            return uVar2;
        }
        C1840g a10 = new C1840g.a().c(uVar2.f5095e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        C1840g gVar = a10;
        C6496s.g(a10, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = cls.getName();
        C6496s.g(name, "name");
        return u.e(uVar, (String) null, (D) null, name, (String) null, gVar, (C1840g) null, 0, 0, 0, (C1838e) null, 0, (C1834a) null, 0, 0, 0, 0, false, (x) null, 0, 0, 0, 0, 0, 8388587, (Object) null);
    }

    public static final u c(List list, u uVar) {
        C6496s.h(list, "schedulers");
        C6496s.h(uVar, "workSpec");
        if (Build.VERSION.SDK_INT < 26) {
            return b(uVar);
        }
        return uVar;
    }
}
