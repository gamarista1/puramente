package androidx.work.impl;

import O3.h;
import O3.n;
import R3.b;
import R3.c;
import android.content.Context;
import androidx.work.C1836c;
import androidx.work.impl.WorkDatabase;
import androidx.work.z;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.t;

public abstract class Q {

    /* synthetic */ class a extends C6494p implements t {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18783a = new a();

        a() {
            super(6, Q.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        /* renamed from: i */
        public final List f(Context context, C1836c cVar, b bVar, WorkDatabase workDatabase, n nVar, C1860u uVar) {
            C6496s.h(context, "p0");
            C6496s.h(cVar, "p1");
            C6496s.h(bVar, "p2");
            C6496s.h(workDatabase, "p3");
            C6496s.h(nVar, "p4");
            C6496s.h(uVar, "p5");
            return Q.b(context, cVar, bVar, workDatabase, nVar, uVar);
        }
    }

    /* access modifiers changed from: private */
    public static final List b(Context context, C1836c cVar, b bVar, WorkDatabase workDatabase, n nVar, C1860u uVar) {
        w c10 = z.c(context, workDatabase, cVar);
        C6496s.g(c10, "createBestAvailableBackg…kDatabase, configuration)");
        return C6565s.q(c10, new L3.b(context, cVar, nVar, uVar, new O(uVar, bVar), bVar));
    }

    public static final P c(Context context, C1836c cVar) {
        C6496s.h(context, "context");
        C6496s.h(cVar, "configuration");
        return e(context, cVar, (b) null, (WorkDatabase) null, (n) null, (C1860u) null, (t) null, 124, (Object) null);
    }

    public static final P d(Context context, C1836c cVar, b bVar, WorkDatabase workDatabase, n nVar, C1860u uVar, t tVar) {
        C6496s.h(context, "context");
        C6496s.h(cVar, "configuration");
        C6496s.h(bVar, "workTaskExecutor");
        C6496s.h(workDatabase, "workDatabase");
        C6496s.h(nVar, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH);
        C6496s.h(uVar, "processor");
        C6496s.h(tVar, "schedulersCreator");
        C1836c cVar2 = cVar;
        b bVar2 = bVar;
        WorkDatabase workDatabase2 = workDatabase;
        C1860u uVar2 = uVar;
        return new P(context.getApplicationContext(), cVar2, bVar2, workDatabase2, (List) tVar.f(context, cVar2, bVar2, workDatabase2, nVar, uVar2), uVar2, nVar);
    }

    public static /* synthetic */ P e(Context context, C1836c cVar, b bVar, WorkDatabase workDatabase, n nVar, C1860u uVar, t tVar, int i10, Object obj) {
        b bVar2;
        WorkDatabase workDatabase2;
        n nVar2;
        C1860u uVar2;
        t tVar2;
        if ((i10 & 4) != 0) {
            bVar2 = new c(cVar.m());
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 8) != 0) {
            WorkDatabase.a aVar = WorkDatabase.f18819p;
            Context applicationContext = context.getApplicationContext();
            C6496s.g(applicationContext, "context.applicationContext");
            R3.a c10 = bVar2.c();
            C6496s.g(c10, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = aVar.b(applicationContext, c10, cVar.a(), context.getResources().getBoolean(z.f19047a));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            C6496s.g(applicationContext2, "context.applicationContext");
            nVar2 = new n(applicationContext2, bVar2, (h) null, (O3.c) null, (h) null, (h) null, 60, (DefaultConstructorMarker) null);
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 32) != 0) {
            C1836c cVar2 = cVar;
            uVar2 = new C1860u(context.getApplicationContext(), cVar, bVar2, workDatabase2);
        } else {
            C1836c cVar3 = cVar;
            uVar2 = uVar;
        }
        if ((i10 & 64) != 0) {
            tVar2 = a.f18783a;
        } else {
            tVar2 = tVar;
        }
        return d(context, cVar, bVar2, workDatabase2, nVar2, uVar2, tVar2);
    }
}
