package f9;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f43486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JobParameters f43487b;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f43486a = jobInfoSchedulerService;
        this.f43487b = jobParameters;
    }

    public final void run() {
        this.f43486a.b(this.f43487b);
    }
}
