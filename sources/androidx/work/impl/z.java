package androidx.work.impl;

import P3.m;
import P3.u;
import P3.v;
import Q3.p;
import android.content.Context;
import androidx.work.C1835b;
import androidx.work.C1836c;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.g;
import androidx.work.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19015a = s.i("Schedulers");

    static w c(Context context, WorkDatabase workDatabase, C1836c cVar) {
        g gVar = new g(context, workDatabase, cVar);
        p.c(context, SystemJobService.class, true);
        s.e().a(f19015a, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(List list, m mVar, C1836c cVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(mVar.b());
        }
        h(cVar, workDatabase, list);
    }

    private static void f(v vVar, C1835b bVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = bVar.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vVar.n(((u) it.next()).f5091a, currentTimeMillis);
            }
        }
    }

    public static void g(List list, C1860u uVar, Executor executor, WorkDatabase workDatabase, C1836c cVar) {
        uVar.e(new x(executor, list, cVar, workDatabase));
    }

    public static void h(C1836c cVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            v H10 = workDatabase.H();
            workDatabase.e();
            try {
                List v10 = H10.v();
                f(H10, cVar.a(), v10);
                List p10 = H10.p(cVar.h());
                f(H10, cVar.a(), p10);
                if (v10 != null) {
                    p10.addAll(v10);
                }
                List k10 = H10.k(200);
                workDatabase.A();
                workDatabase.i();
                if (p10.size() > 0) {
                    u[] uVarArr = (u[]) p10.toArray(new u[p10.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w wVar = (w) it.next();
                        if (wVar.c()) {
                            wVar.d(uVarArr);
                        }
                    }
                }
                if (k10.size() > 0) {
                    u[] uVarArr2 = (u[]) k10.toArray(new u[k10.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        w wVar2 = (w) it2.next();
                        if (!wVar2.c()) {
                            wVar2.d(uVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.i();
                throw th2;
            }
        }
    }
}
