package Bc;

import com.google.protobuf.C4863a;
import com.google.protobuf.C4881t;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.List;
import java.util.Map;

public final class h extends r implements L {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile T PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private E customAttributes_ = E.g();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private C4881t.e perfSessions_ = r.z();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50335a;

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
                f50335a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50335a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50335a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50335a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50335a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50335a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50335a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.h.a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements L {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A() {
            t();
            ((h) this.f58648b).p0().clear();
            return this;
        }

        public b B() {
            t();
            ((h) this.f58648b).j0();
            return this;
        }

        public long C() {
            return ((h) this.f58648b).w0();
        }

        public String D() {
            return ((h) this.f58648b).x0();
        }

        public boolean E() {
            return ((h) this.f58648b).y0();
        }

        public boolean F() {
            return ((h) this.f58648b).A0();
        }

        public boolean G() {
            return ((h) this.f58648b).E0();
        }

        public b H(Map map) {
            t();
            ((h) this.f58648b).p0().putAll(map);
            return this;
        }

        public b I(long j10) {
            t();
            ((h) this.f58648b).I0(j10);
            return this;
        }

        public b J(d dVar) {
            t();
            ((h) this.f58648b).J0(dVar);
            return this;
        }

        public b K(int i10) {
            t();
            ((h) this.f58648b).K0(i10);
            return this;
        }

        public b L(e eVar) {
            t();
            ((h) this.f58648b).L0(eVar);
            return this;
        }

        public b M(long j10) {
            t();
            ((h) this.f58648b).M0(j10);
            return this;
        }

        public b N(String str) {
            t();
            ((h) this.f58648b).N0(str);
            return this;
        }

        public b O(long j10) {
            t();
            ((h) this.f58648b).O0(j10);
            return this;
        }

        public b P(long j10) {
            t();
            ((h) this.f58648b).P0(j10);
            return this;
        }

        public b Q(long j10) {
            t();
            ((h) this.f58648b).Q0(j10);
            return this;
        }

        public b R(long j10) {
            t();
            ((h) this.f58648b).R0(j10);
            return this;
        }

        public b S(String str) {
            t();
            ((h) this.f58648b).S0(str);
            return this;
        }

        public b z(Iterable iterable) {
            t();
            ((h) this.f58648b).i0(iterable);
            return this;
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final D f50336a;

        static {
            m0.b bVar = m0.b.STRING;
            f50336a = D.d(bVar, "", bVar, "");
        }
    }

    public enum d implements C4881t.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: l  reason: collision with root package name */
        private static final C4881t.b f50347l = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f50349a;

        class a implements C4881t.b {
            a() {
            }
        }

        private static final class b implements C4881t.c {

            /* renamed from: a  reason: collision with root package name */
            static final C4881t.c f50350a = null;

            static {
                f50350a = new b();
            }

            private b() {
            }
        }

        static {
            f50347l = new a();
        }

        private d(int i10) {
            this.f50349a = i10;
        }

        public static d b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static C4881t.c c() {
            return b.f50350a;
        }

        public final int d() {
            return this.f50349a;
        }
    }

    public enum e implements C4881t.a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: d  reason: collision with root package name */
        private static final C4881t.b f50353d = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f50355a;

        class a implements C4881t.b {
            a() {
            }
        }

        private static final class b implements C4881t.c {

            /* renamed from: a  reason: collision with root package name */
            static final C4881t.c f50356a = null;

            static {
                f50356a = new b();
            }

            private b() {
            }
        }

        static {
            f50353d = new a();
        }

        private e(int i10) {
            this.f50355a = i10;
        }

        public static C4881t.c b() {
            return b.f50356a;
        }

        public final int d() {
            return this.f50355a;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        r.Q(h.class, hVar);
    }

    private h() {
    }

    private E G0() {
        if (!this.customAttributes_.l()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b H0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void I0(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void J0(d dVar) {
        this.httpMethod_ = dVar.d();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void K0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* access modifiers changed from: private */
    public void L0(e eVar) {
        this.networkClientErrorReason_ = eVar.d();
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    public void M0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* access modifiers changed from: private */
    public void N0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* access modifiers changed from: private */
    public void O0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* access modifiers changed from: private */
    public void P0(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void Q0(long j10) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void R0(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void S0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* access modifiers changed from: private */
    public void i0(Iterable iterable) {
        k0();
        C4863a.b(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void j0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m0().s0();
    }

    private void k0() {
        C4881t.e eVar = this.perfSessions_;
        if (!eVar.o()) {
            this.perfSessions_ = r.M(eVar);
        }
    }

    public static h m0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map p0() {
        return G0();
    }

    public boolean A0() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean B0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean C0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean D0() {
        if ((this.bitField0_ & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean E0() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    public boolean F0() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    public long l0() {
        return this.clientStartTimeUs_;
    }

    public d n0() {
        d b10 = d.b(this.httpMethod_);
        if (b10 == null) {
            return d.HTTP_METHOD_UNKNOWN;
        }
        return b10;
    }

    public int o0() {
        return this.httpResponseCode_;
    }

    public List q0() {
        return this.perfSessions_;
    }

    public long r0() {
        return this.requestPayloadBytes_;
    }

    public String s0() {
        return this.responseContentType_;
    }

    public long t0() {
        return this.responsePayloadBytes_;
    }

    public long u0() {
        return this.timeToRequestCompletedUs_;
    }

    public long v0() {
        return this.timeToResponseCompletedUs_;
    }

    public long w0() {
        return this.timeToResponseInitiatedUs_;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (a.f50335a[cVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.c(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.b(), "customAttributes_", c.f50336a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (h.class) {
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

    public String x0() {
        return this.url_;
    }

    public boolean y0() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }
}
