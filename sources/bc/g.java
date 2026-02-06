package Bc;

import com.google.protobuf.C4881t;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class g extends r implements L {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile T PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private C4881t.e androidMemoryReadings_ = r.z();
    private int bitField0_;
    private C4881t.e cpuMetricReadings_ = r.z();
    private f gaugeMetadata_;
    private String sessionId_ = "";

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50334a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.r$c[] r0 = com.google.protobuf.r.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50334a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50334a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50334a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50334a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50334a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50334a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50334a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.g.a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements L {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(e eVar) {
            t();
            ((g) this.f58648b).Z(eVar);
            return this;
        }

        public b B(f fVar) {
            t();
            ((g) this.f58648b).j0(fVar);
            return this;
        }

        public b C(String str) {
            t();
            ((g) this.f58648b).k0(str);
            return this;
        }

        public b z(b bVar) {
            t();
            ((g) this.f58648b).Y(bVar);
            return this;
        }

        private b() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        r.Q(g.class, gVar);
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public void Y(b bVar) {
        bVar.getClass();
        a0();
        this.androidMemoryReadings_.add(bVar);
    }

    /* access modifiers changed from: private */
    public void Z(e eVar) {
        eVar.getClass();
        b0();
        this.cpuMetricReadings_.add(eVar);
    }

    private void a0() {
        C4881t.e eVar = this.androidMemoryReadings_;
        if (!eVar.o()) {
            this.androidMemoryReadings_ = r.M(eVar);
        }
    }

    private void b0() {
        C4881t.e eVar = this.cpuMetricReadings_;
        if (!eVar.o()) {
            this.cpuMetricReadings_ = r.M(eVar);
        }
    }

    public static g e0() {
        return DEFAULT_INSTANCE;
    }

    public static b i0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void j0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public int c0() {
        return this.androidMemoryReadings_.size();
    }

    public int d0() {
        return this.cpuMetricReadings_.size();
    }

    public f f0() {
        f fVar = this.gaugeMetadata_;
        if (fVar == null) {
            return f.X();
        }
        return fVar;
    }

    public boolean g0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean h0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (a.f50334a[cVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (g.class) {
                        try {
                            t10 = PARSER;
                            if (t10 == null) {
                                t10 = new r.b(DEFAULT_INSTANCE);
                                PARSER = t10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return t10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
