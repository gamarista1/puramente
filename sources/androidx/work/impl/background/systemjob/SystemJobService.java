package androidx.work.impl.background.systemjob;

import P3.m;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.A;
import androidx.work.impl.B;
import androidx.work.impl.C1846f;
import androidx.work.impl.C1860u;
import androidx.work.impl.N;
import androidx.work.impl.O;
import androidx.work.impl.P;
import androidx.work.s;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C1846f {

    /* renamed from: e  reason: collision with root package name */
    private static final String f18886e = s.i("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    private P f18887a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f18888b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final B f18889c = new B();

    /* renamed from: d  reason: collision with root package name */
    private N f18890d;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.a(jobParameters.getStopReason());
        }
    }

    static int a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL /*14*/:
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return i10;
            default:
                return -512;
        }
    }

    private static m c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void b(m mVar, boolean z10) {
        JobParameters jobParameters;
        s e10 = s.e();
        String str = f18886e;
        e10.a(str, mVar.b() + " executed on JobScheduler");
        synchronized (this.f18888b) {
            jobParameters = (JobParameters) this.f18888b.remove(mVar);
        }
        this.f18889c.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            P i10 = P.i(getApplicationContext());
            this.f18887a = i10;
            C1860u k10 = i10.k();
            this.f18890d = new O(k10, this.f18887a.o());
            k10.e(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                s.e().k(f18886e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        P p10 = this.f18887a;
        if (p10 != null) {
            p10.k().p(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.b(r8) == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r3.f18677b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.a(r8) == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r3.f18676a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r2 < 28) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r3.f18678c = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r7.f18890d.a(r7.f18889c.d(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            androidx.work.impl.P r0 = r7.f18887a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            androidx.work.s r0 = androidx.work.s.e()
            java.lang.String r3 = f18886e
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.a(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L_0x0015:
            P3.m r0 = c(r8)
            if (r0 != 0) goto L_0x0027
            androidx.work.s r8 = androidx.work.s.e()
            java.lang.String r0 = f18886e
            java.lang.String r1 = "WorkSpec id not found!"
            r8.c(r0, r1)
            return r2
        L_0x0027:
            java.util.Map r3 = r7.f18888b
            monitor-enter(r3)
            java.util.Map r4 = r7.f18888b     // Catch:{ all -> 0x004e }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            androidx.work.s r8 = androidx.work.s.e()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = f18886e     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Job is already being executed by SystemJobService: "
            r4.append(r5)     // Catch:{ all -> 0x004e }
            r4.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x004e }
            r8.a(r1, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            return r2
        L_0x004e:
            r8 = move-exception
            goto L_0x00ad
        L_0x0050:
            androidx.work.s r2 = androidx.work.s.e()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = f18886e     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r5.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "onStartJob for "
            r5.append(r6)     // Catch:{ all -> 0x004e }
            r5.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004e }
            r2.a(r4, r5)     // Catch:{ all -> 0x004e }
            java.util.Map r2 = r7.f18888b     // Catch:{ all -> 0x004e }
            r2.put(r0, r8)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            if (r4 == 0) goto L_0x0087
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f18677b = r4
        L_0x0087:
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            if (r4 == 0) goto L_0x0097
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f18676a = r4
        L_0x0097:
            r4 = 28
            if (r2 < r4) goto L_0x00a1
            android.net.Network r8 = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8)
            r3.f18678c = r8
        L_0x00a1:
            androidx.work.impl.N r8 = r7.f18890d
            androidx.work.impl.B r2 = r7.f18889c
            androidx.work.impl.A r0 = r2.d(r0)
            r8.a(r0, r3)
            return r1
        L_0x00ad:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        int i10;
        if (this.f18887a == null) {
            s.e().a(f18886e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m c10 = c(jobParameters);
        if (c10 == null) {
            s.e().c(f18886e, "WorkSpec id not found!");
            return false;
        }
        s e10 = s.e();
        String str = f18886e;
        e10.a(str, "onStopJob for " + c10);
        synchronized (this.f18888b) {
            this.f18888b.remove(c10);
        }
        A b10 = this.f18889c.b(c10);
        if (b10 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = c.a(jobParameters);
            } else {
                i10 = -512;
            }
            this.f18890d.b(b10, i10);
        }
        return !this.f18887a.k().j(c10.b());
    }
}
