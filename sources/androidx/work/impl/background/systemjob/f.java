package androidx.work.impl.background.systemjob;

import P3.u;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C1834a;
import androidx.work.C1835b;
import androidx.work.C1838e;
import androidx.work.s;
import androidx.work.t;

class f {

    /* renamed from: c  reason: collision with root package name */
    private static final String f18891c = s.i("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f18892a;

    /* renamed from: b  reason: collision with root package name */
    private final C1835b f18893b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18894a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.t[] r0 = androidx.work.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18894a = r0
                androidx.work.t r1 = androidx.work.t.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18894a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.t r1 = androidx.work.t.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18894a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.t r1 = androidx.work.t.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18894a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.t r1 = androidx.work.t.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18894a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.t r1 = androidx.work.t.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.f.a.<clinit>():void");
        }
    }

    f(Context context, C1835b bVar) {
        this.f18893b = bVar;
        this.f18892a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(C1838e.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(t tVar) {
        int i10 = a.f18894a[tVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        s e10 = s.e();
        String str = f18891c;
        e10.a(str, "API version too low. Cannot convert network type value " + tVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, t tVar) {
        if (Build.VERSION.SDK_INT < 30 || tVar != t.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(tVar));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(u uVar, int i10) {
        boolean z10;
        int i11;
        C1838e eVar = uVar.f5100j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f5091a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.m());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f18892a).setRequiresCharging(eVar.g()).setRequiresDeviceIdle(eVar.h()).setExtras(persistableBundle);
        d(extras, eVar.d());
        boolean z11 = false;
        if (!eVar.h()) {
            if (uVar.f5102l == C1834a.LINEAR) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            extras.setBackoffCriteria(uVar.f5103m, i11);
        }
        long max = Math.max(uVar.c() - this.f18893b.currentTimeMillis(), 0);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f5107q) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (eVar.e()) {
            for (C1838e.c b10 : eVar.c()) {
                extras.addTriggerContentUri(b(b10));
            }
            extras.setTriggerContentUpdateDelay(eVar.b());
            extras.setTriggerContentMaxDelay(eVar.a());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            JobInfo.Builder unused2 = extras.setRequiresBatteryNotLow(eVar.f());
            JobInfo.Builder unused3 = extras.setRequiresStorageNotLow(eVar.i());
        }
        if (uVar.f5101k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (max > 0) {
            z11 = true;
        }
        if (i12 >= 31 && uVar.f5107q && !z10 && !z11) {
            JobInfo.Builder unused4 = extras.setExpedited(true);
        }
        return extras.build();
    }
}
