package Bc;

import com.google.protobuf.C4863a;
import com.google.protobuf.C4881t;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class m extends r implements L {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile T PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private E counters_ = E.g();
    private E customAttributes_ = E.g();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private C4881t.e perfSessions_ = r.z();
    private C4881t.e subtraces_ = r.z();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50365a;

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
                f50365a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50365a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50365a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50365a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50365a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50365a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50365a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.m.a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements L {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(Iterable iterable) {
            t();
            ((m) this.f58648b).e0(iterable);
            return this;
        }

        public b B(k kVar) {
            t();
            ((m) this.f58648b).f0(kVar);
            return this;
        }

        public b C(m mVar) {
            t();
            ((m) this.f58648b).g0(mVar);
            return this;
        }

        public b D(Map map) {
            t();
            ((m) this.f58648b).p0().putAll(map);
            return this;
        }

        public b E(Map map) {
            t();
            ((m) this.f58648b).q0().putAll(map);
            return this;
        }

        public b F(String str, long j10) {
            str.getClass();
            t();
            ((m) this.f58648b).p0().put(str, Long.valueOf(j10));
            return this;
        }

        public b G(String str, String str2) {
            str.getClass();
            str2.getClass();
            t();
            ((m) this.f58648b).q0().put(str, str2);
            return this;
        }

        public b H(long j10) {
            t();
            ((m) this.f58648b).A0(j10);
            return this;
        }

        public b I(long j10) {
            t();
            ((m) this.f58648b).B0(j10);
            return this;
        }

        public b J(String str) {
            t();
            ((m) this.f58648b).C0(str);
            return this;
        }

        public b z(Iterable iterable) {
            t();
            ((m) this.f58648b).d0(iterable);
            return this;
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final D f50366a = D.d(m0.b.STRING, "", m0.b.INT64, 0L);
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final D f50367a;

        static {
            m0.b bVar = m0.b.STRING;
            f50367a = D.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        r.Q(m.class, mVar);
    }

    private m() {
    }

    /* access modifiers changed from: private */
    public void A0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void B0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void C0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void d0(Iterable iterable) {
        i0();
        C4863a.b(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void e0(Iterable iterable) {
        j0();
        C4863a.b(iterable, this.subtraces_);
    }

    /* access modifiers changed from: private */
    public void f0(k kVar) {
        kVar.getClass();
        i0();
        this.perfSessions_.add(kVar);
    }

    /* access modifiers changed from: private */
    public void g0(m mVar) {
        mVar.getClass();
        j0();
        this.subtraces_.add(mVar);
    }

    private void i0() {
        C4881t.e eVar = this.perfSessions_;
        if (!eVar.o()) {
            this.perfSessions_ = r.M(eVar);
        }
    }

    private void j0() {
        C4881t.e eVar = this.subtraces_;
        if (!eVar.o()) {
            this.subtraces_ = r.M(eVar);
        }
    }

    public static m n0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map p0() {
        return x0();
    }

    /* access modifiers changed from: private */
    public Map q0() {
        return y0();
    }

    private E v0() {
        return this.counters_;
    }

    private E w0() {
        return this.customAttributes_;
    }

    private E x0() {
        if (!this.counters_.l()) {
            this.counters_ = this.counters_.q();
        }
        return this.counters_;
    }

    private E y0() {
        if (!this.customAttributes_.l()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b z0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public boolean h0(String str) {
        str.getClass();
        return w0().containsKey(str);
    }

    public int k0() {
        return v0().size();
    }

    public Map l0() {
        return Collections.unmodifiableMap(v0());
    }

    public Map m0() {
        return Collections.unmodifiableMap(w0());
    }

    public long o0() {
        return this.durationUs_;
    }

    public String r0() {
        return this.name_;
    }

    public List s0() {
        return this.perfSessions_;
    }

    public List t0() {
        return this.subtraces_;
    }

    public boolean u0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (a.f50365a[cVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f50366a, "subtraces_", m.class, "customAttributes_", d.f50367a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (m.class) {
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
