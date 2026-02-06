package Bc;

import Bc.c;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class i extends r implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile T PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50357a;

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
                f50357a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50357a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50357a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50357a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50357a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50357a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50357a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.i.a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(g gVar) {
            t();
            ((i) this.f58648b).c0(gVar);
            return this;
        }

        public b B(h hVar) {
            t();
            ((i) this.f58648b).d0(hVar);
            return this;
        }

        public b C(m mVar) {
            t();
            ((i) this.f58648b).e0(mVar);
            return this;
        }

        public boolean e() {
            return ((i) this.f58648b).e();
        }

        public boolean g() {
            return ((i) this.f58648b).g();
        }

        public h h() {
            return ((i) this.f58648b).h();
        }

        public boolean j() {
            return ((i) this.f58648b).j();
        }

        public m k() {
            return ((i) this.f58648b).k();
        }

        public g l() {
            return ((i) this.f58648b).l();
        }

        public b z(c.b bVar) {
            t();
            ((i) this.f58648b).b0((c) bVar.q());
            return this;
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        r.Q(i.class, iVar);
    }

    private i() {
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void b0(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void c0(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void d0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void e0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    public c Y() {
        c cVar = this.applicationInfo_;
        if (cVar == null) {
            return c.a0();
        }
        return cVar;
    }

    public boolean Z() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public h h() {
        h hVar = this.networkRequestMetric_;
        if (hVar == null) {
            return h.m0();
        }
        return hVar;
    }

    public boolean j() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public m k() {
        m mVar = this.traceMetric_;
        if (mVar == null) {
            return m.n0();
        }
        return mVar;
    }

    public g l() {
        g gVar = this.gaugeMetric_;
        if (gVar == null) {
            return g.e0();
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (a.f50357a[cVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (i.class) {
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
