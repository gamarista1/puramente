package com.google.firebase.perf.session.gauges;

import Ac.l;
import Bc.b;
import Bc.d;
import Bc.e;
import Bc.f;
import Bc.g;
import Eb.w;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import uc.C5233a;
import yc.C5293a;
import zc.C5313k;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final C5233a logger = C5233a.e();
    private d applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final w cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final w gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final w memoryGaugeCollector;
    private String sessionId;
    private final C5313k transportManager;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                Bc.d[] r0 = Bc.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57735a = r0
                Bc.d r1 = Bc.d.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57735a     // Catch:{ NoSuchFieldError -> 0x001d }
                Bc.d r1 = Bc.d.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.a.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new w(new f()), C5313k.k(), com.google.firebase.perf.config.a.g(), (i) null, new w(new g()), new w(new h()));
    }

    private long getCpuGaugeCollectionFrequencyMs(d dVar) {
        long j10;
        int i10 = a.f57735a[dVar.ordinal()];
        if (i10 == 1) {
            j10 = this.configResolver.y();
        } else if (i10 != 2) {
            j10 = -1;
        } else {
            j10 = this.configResolver.z();
        }
        if (c.f(j10)) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j10;
    }

    private f getGaugeMetadata() {
        return (f) f.Z().z(this.gaugeMetadataManager.a()).A(this.gaugeMetadataManager.b()).B(this.gaugeMetadataManager.c()).q();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(d dVar) {
        long j10;
        int i10 = a.f57735a[dVar.ordinal()];
        if (i10 == 1) {
            j10 = this.configResolver.B();
        } else if (i10 != 2) {
            j10 = -1;
        } else {
            j10 = this.configResolver.C();
        }
        if (l.e(j10)) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j10, l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((c) this.cpuGaugeCollector.get()).k(j10, lVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((l) this.memoryGaugeCollector.get()).j(j10, lVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, d dVar) {
        g.b i02 = g.i0();
        while (!((c) this.cpuGaugeCollector.get()).f57742a.isEmpty()) {
            i02.A((e) ((c) this.cpuGaugeCollector.get()).f57742a.poll());
        }
        while (!((l) this.memoryGaugeCollector.get()).f57765b.isEmpty()) {
            i02.z((b) ((l) this.memoryGaugeCollector.get()).f57765b.poll());
        }
        i02.C(str);
        this.transportManager.A((g) i02.q(), dVar);
    }

    public void collectGaugeMetricOnce(l lVar) {
        collectGaugeMetricOnce((c) this.cpuGaugeCollector.get(), (l) this.memoryGaugeCollector.get(), lVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.A((g) g.i0().C(str).B(getGaugeMetadata()).q(), dVar);
        return true;
    }

    public void startCollectingGauges(C5293a aVar, d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, aVar.d());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String h10 = aVar.h();
        this.sessionId = h10;
        this.applicationProcessState = dVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new e(this, h10, dVar), j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            C5233a aVar2 = logger;
            aVar2.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            d dVar = this.applicationProcessState;
            ((c) this.cpuGaugeCollector.get()).l();
            ((l) this.memoryGaugeCollector.get()).k();
            ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new d(this, str, dVar), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    GaugeManager(w wVar, C5313k kVar, com.google.firebase.perf.config.a aVar, i iVar, w wVar2, w wVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = wVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = wVar2;
        this.memoryGaugeCollector = wVar3;
    }

    private long startCollectingGauges(d dVar, l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}
