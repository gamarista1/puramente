package Bc;

import com.google.protobuf.C4881t;
import com.google.protobuf.C4882u;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class k extends r implements L {
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final C4882u sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C4881t.d sessionVerbosity_ = r.y();

    class a implements C4882u {
        a() {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50358a;

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
                f50358a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50358a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50358a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50358a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50358a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50358a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50358a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.k.b.<clinit>():void");
        }
    }

    public static final class c extends r.a implements L {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c A(String str) {
            t();
            ((k) this.f58648b).b0(str);
            return this;
        }

        public c z(l lVar) {
            t();
            ((k) this.f58648b).W(lVar);
            return this;
        }

        private c() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        r.Q(k.class, kVar);
    }

    private k() {
    }

    /* access modifiers changed from: private */
    public void W(l lVar) {
        lVar.getClass();
        X();
        this.sessionVerbosity_.T(lVar.d());
    }

    private void X() {
        C4881t.d dVar = this.sessionVerbosity_;
        if (!dVar.o()) {
            this.sessionVerbosity_ = r.L(dVar);
        }
    }

    public static c a0() {
        return (c) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void b0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public l Y(int i10) {
        l b10 = l.b(this.sessionVerbosity_.getInt(i10));
        if (b10 == null) {
            return l.SESSION_VERBOSITY_NONE;
        }
        return b10;
    }

    public int Z() {
        return this.sessionVerbosity_.size();
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (b.f50358a[cVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.c()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (k.class) {
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
