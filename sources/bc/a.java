package Bc;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class a extends r implements L {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile T PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: Bc.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0767a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50320a;

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
                f50320a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50320a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50320a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50320a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50320a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50320a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50320a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.a.C0767a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements L {
        /* synthetic */ b(C0767a aVar) {
            this();
        }

        public b A(String str) {
            t();
            ((a) this.f58648b).c0(str);
            return this;
        }

        public b B(String str) {
            t();
            ((a) this.f58648b).d0(str);
            return this;
        }

        public b z(String str) {
            t();
            ((a) this.f58648b).b0(str);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        r.Q(a.class, aVar);
    }

    private a() {
    }

    public static a X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void b0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* access modifiers changed from: private */
    public void c0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void d0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    public boolean Y() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (C0767a.f50320a[cVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b((C0767a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (a.class) {
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
