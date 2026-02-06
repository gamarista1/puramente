package androidx.work.impl.background.systemjob;

import P3.i;
import P3.l;
import P3.m;
import P3.u;
import P3.v;
import P3.x;
import Q3.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.C1836c;
import androidx.work.D;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.w;
import androidx.work.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x1.C2896a;

public class g implements w {

    /* renamed from: f  reason: collision with root package name */
    private static final String f18895f = s.i("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f18896a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f18897b;

    /* renamed from: c  reason: collision with root package name */
    private final f f18898c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkDatabase f18899d;

    /* renamed from: e  reason: collision with root package name */
    private final C1836c f18900e;

    public g(Context context, WorkDatabase workDatabase, C1836c cVar) {
        this(context, workDatabase, cVar, (JobScheduler) context.getSystemService("jobscheduler"), new f(context, cVar.a()));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g10 = g(context, jobScheduler)) != null && !g10.isEmpty()) {
            for (JobInfo id2 : g10) {
                e(jobScheduler, id2.getId());
            }
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            s.e().d(f18895f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)}), th2);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            m h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            s.e().d(f18895f, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        int i10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> d10 = workDatabase.E().d();
        boolean z10 = false;
        if (g10 != null) {
            i10 = g10.size();
        } else {
            i10 = 0;
        }
        HashSet hashSet = new HashSet(i10);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                m h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = d10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    s.e().a(f18895f, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            workDatabase.e();
            try {
                v H10 = workDatabase.H();
                for (String n10 : d10) {
                    H10.n(n10, -1);
                }
                workDatabase.A();
                workDatabase.i();
            } catch (Throwable th2) {
                workDatabase.i();
                throw th2;
            }
        }
        return z10;
    }

    public void a(String str) {
        List<Integer> f10 = f(this.f18896a, this.f18897b, str);
        if (f10 != null && !f10.isEmpty()) {
            for (Integer intValue : f10) {
                e(this.f18897b, intValue.intValue());
            }
            this.f18899d.E().i(str);
        }
    }

    public boolean c() {
        return true;
    }

    public void d(u... uVarArr) {
        int i10;
        k kVar = new k(this.f18899d);
        int length = uVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            u uVar = uVarArr[i11];
            this.f18899d.e();
            try {
                u h10 = this.f18899d.H().h(uVar.f5091a);
                if (h10 == null) {
                    s e10 = s.e();
                    String str = f18895f;
                    e10.k(str, "Skipping scheduling " + uVar.f5091a + " because it's no longer in the DB");
                    this.f18899d.A();
                } else if (h10.f5092b != D.ENQUEUED) {
                    s e11 = s.e();
                    String str2 = f18895f;
                    e11.k(str2, "Skipping scheduling " + uVar.f5091a + " because it is no longer enqueued");
                    this.f18899d.A();
                } else {
                    m a10 = x.a(uVar);
                    i a11 = this.f18899d.E().a(a10);
                    if (a11 != null) {
                        i10 = a11.f5064c;
                    } else {
                        i10 = kVar.e(this.f18900e.i(), this.f18900e.g());
                    }
                    if (a11 == null) {
                        this.f18899d.E().c(l.a(a10, i10));
                    }
                    j(uVar, i10);
                    this.f18899d.A();
                }
                i11++;
            } finally {
                this.f18899d.i();
            }
        }
    }

    public void j(u uVar, int i10) {
        JobInfo a10 = this.f18898c.a(uVar, i10);
        s e10 = s.e();
        String str = f18895f;
        e10.a(str, "Scheduling work ID " + uVar.f5091a + "Job ID " + i10);
        int i11 = 0;
        try {
            if (this.f18897b.schedule(a10) == 0) {
                s e11 = s.e();
                e11.k(str, "Unable to schedule work ID " + uVar.f5091a);
                if (uVar.f5107q && uVar.f5108r == androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f5107q = false;
                    s.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{uVar.f5091a}));
                    j(uVar, i10);
                }
            }
        } catch (IllegalStateException e12) {
            List g10 = g(this.f18896a, this.f18897b);
            if (g10 != null) {
                i11 = g10.size();
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i11), Integer.valueOf(this.f18899d.H().e().size()), Integer.valueOf(this.f18900e.h())});
            s.e().c(f18895f, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e12);
            C2896a l10 = this.f18900e.l();
            if (l10 != null) {
                l10.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th2) {
            s e13 = s.e();
            String str2 = f18895f;
            e13.d(str2, "Unable to schedule " + uVar, th2);
        }
    }

    public g(Context context, WorkDatabase workDatabase, C1836c cVar, JobScheduler jobScheduler, f fVar) {
        this.f18896a = context;
        this.f18897b = jobScheduler;
        this.f18898c = fVar;
        this.f18899d = workDatabase;
        this.f18900e = cVar;
    }
}
