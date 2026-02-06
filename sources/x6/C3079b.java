package X6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X6.b  reason: case insensitive filesystem */
public final class C3079b implements C3093p {

    /* renamed from: f  reason: collision with root package name */
    public static final a f35129f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Executor f35130a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f35131b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f35132c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f35133d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f35134e;

    /* renamed from: X6.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3079b(int i10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new A(10, "FrescoIoBoundExecutor", true));
        C6496s.g(newFixedThreadPool, "newFixedThreadPool(...)");
        this.f35130a = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i10, new A(10, "FrescoDecodeExecutor", true));
        C6496s.g(newFixedThreadPool2, "newFixedThreadPool(...)");
        this.f35131b = newFixedThreadPool2;
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i10, new A(10, "FrescoBackgroundExecutor", true));
        C6496s.g(newFixedThreadPool3, "newFixedThreadPool(...)");
        this.f35132c = newFixedThreadPool3;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new A(10, "FrescoLightWeightBackgroundExecutor", true));
        C6496s.g(newFixedThreadPool4, "newFixedThreadPool(...)");
        this.f35133d = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i10, new A(10, "FrescoBackgroundExecutor", true));
        C6496s.g(newScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f35134e = newScheduledThreadPool;
    }

    public Executor a() {
        return this.f35133d;
    }

    public Executor b() {
        return this.f35130a;
    }

    public ScheduledExecutorService c() {
        return this.f35134e;
    }

    public Executor d() {
        return this.f35131b;
    }

    public Executor e() {
        return this.f35132c;
    }

    public Executor f() {
        return this.f35130a;
    }

    public Executor g() {
        return this.f35130a;
    }
}
