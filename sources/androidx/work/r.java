package androidx.work;

import R3.b;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.g;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class r {
    private Context mAppContext;
    private volatile int mStopReason = -256;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* renamed from: androidx.work.r$a$a  reason: collision with other inner class name */
        public static final class C0325a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C1840g f19026a;

            public C0325a() {
                this(C1840g.f18737c);
            }

            public C1840g e() {
                return this.f19026a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0325a.class != obj.getClass()) {
                    return false;
                }
                return this.f19026a.equals(((C0325a) obj).f19026a);
            }

            public int hashCode() {
                return (C0325a.class.getName().hashCode() * 31) + this.f19026a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f19026a + '}';
            }

            public C0325a(C1840g gVar) {
                this.f19026a = gVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || b.class != obj.getClass()) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C1840g f19027a;

            public c() {
                this(C1840g.f18737c);
            }

            public C1840g e() {
                return this.f19027a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f19027a.equals(((c) obj).f19027a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f19027a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f19027a + '}';
            }

            public c(C1840g gVar) {
                this.f19027a = gVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0325a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(C1840g gVar) {
            return new c(gVar);
        }
    }

    public r(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public g getForegroundInfoAsync() {
        c t10 = c.t();
        t10.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t10;
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final C1840g getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public G getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public final boolean isStopped() {
        if (this.mStopReason != -256) {
            return true;
        }
        return false;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final g setForegroundAsync(j jVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), jVar);
    }

    public g setProgressAsync(C1840g gVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), gVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract g startWork();

    public final void stop(int i10) {
        this.mStopReason = i10;
        onStopped();
    }
}
