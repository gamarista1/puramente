package Bc;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class f extends r implements L {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile T PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50333a;

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
                f50333a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50333a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50333a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50333a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50333a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50333a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50333a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.f.a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements L {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i10) {
            t();
            ((f) this.f58648b).b0(i10);
            return this;
        }

        public b B(int i10) {
            t();
            ((f) this.f58648b).c0(i10);
            return this;
        }

        public b z(int i10) {
            t();
            ((f) this.f58648b).a0(i10);
            return this;
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        r.Q(f.class, fVar);
    }

    private f() {
    }

    public static f X() {
        return DEFAULT_INSTANCE;
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void a0(int i10) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i10;
    }

    /* access modifiers changed from: private */
    public void b0(int i10) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i10;
    }

    /* access modifiers changed from: private */
    public void c0(int i10) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i10;
    }

    public boolean Y() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (a.f50333a[cVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (f.class) {
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
