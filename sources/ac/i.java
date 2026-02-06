package Ac;

import java.util.concurrent.TimeUnit;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f50245a;

    /* renamed from: b  reason: collision with root package name */
    private long f50246b;

    /* renamed from: c  reason: collision with root package name */
    private TimeUnit f50247c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50248a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50248a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50248a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50248a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ac.i.a.<clinit>():void");
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f50245a = j10;
        this.f50246b = j11;
        this.f50247c = timeUnit;
    }

    public double a() {
        int i10 = a.f50248a[this.f50247c.ordinal()];
        if (i10 == 1) {
            return (((double) this.f50245a) / ((double) this.f50246b)) * ((double) TimeUnit.SECONDS.toNanos(1));
        }
        if (i10 == 2) {
            return (((double) this.f50245a) / ((double) this.f50246b)) * ((double) TimeUnit.SECONDS.toMicros(1));
        }
        if (i10 != 3) {
            return ((double) this.f50245a) / ((double) this.f50247c.toSeconds(this.f50246b));
        }
        return (((double) this.f50245a) / ((double) this.f50246b)) * ((double) TimeUnit.SECONDS.toMillis(1));
    }
}
