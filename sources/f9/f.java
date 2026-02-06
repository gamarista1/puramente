package f9;

import W8.e;
import android.app.job.JobInfo;
import f9.C3522c;
import i9.C3597a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class f {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private C3597a f43488a;

        /* renamed from: b  reason: collision with root package name */
        private Map f43489b = new HashMap();

        public a a(e eVar, b bVar) {
            this.f43489b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f43488a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f43489b.keySet().size() >= e.values().length) {
                Map map = this.f43489b;
                this.f43489b = new HashMap();
                return f.d(this.f43488a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        public a c(C3597a aVar) {
            this.f43488a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new C3522c.b().c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        long j11;
        int i11 = i10 - 1;
        if (j10 > 1) {
            j11 = j10;
        } else {
            j11 = 2;
        }
        return (long) (Math.pow(3.0d, (double) i11) * ((double) j10) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j11 * ((long) i11)))));
    }

    public static a b() {
        return new a();
    }

    static f d(C3597a aVar, Map map) {
        return new C3521b(aVar, map);
    }

    public static f f(C3597a aVar) {
        return b().a(e.DEFAULT, b.a().b(30000).d(86400000).a()).a(e.HIGHEST, b.a().b(1000).d(86400000).a()).a(e.VERY_LOW, b.a().b(86400000).d(86400000).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, e eVar, long j10, int i10) {
        builder.setMinimumLatency(g(eVar, j10, i10));
        j(builder, ((b) h().get(eVar)).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract C3597a e();

    public long g(e eVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = (b) h().get(eVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map h();
}
