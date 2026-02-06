package f9;

import Y8.o;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import c9.C3193a;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g9.C3546d;
import j9.C3644a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class d implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f43483a;

    /* renamed from: b  reason: collision with root package name */
    private final C3546d f43484b;

    /* renamed from: c  reason: collision with root package name */
    private final f f43485c;

    public d(Context context, C3546d dVar, f fVar) {
        this.f43483a = context;
        this.f43484b = dVar;
        this.f43485c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void a(o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f43483a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f43483a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (z10 || !d(jobScheduler, c10, i10)) {
            long s12 = this.f43484b.s1(oVar);
            JobInfo.Builder c11 = this.f43485c.c(new JobInfo.Builder(c10, componentName), oVar.d(), s12, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", oVar.b());
            persistableBundle.putInt("priority", C3644a.a(oVar.d()));
            if (oVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            C3193a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f43485c.g(oVar.d(), s12, i10)), Long.valueOf(s12), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        C3193a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    public void b(o oVar, int i10) {
        a(oVar, i10, false);
    }

    /* access modifiers changed from: package-private */
    public int c(o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f43483a.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(oVar.b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(C3644a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
