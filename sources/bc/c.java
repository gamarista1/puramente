package Bc;

import Bc.a;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.Map;

public final class c extends r implements L {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    private a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private E customAttributes_ = E.g();
    private String googleAppId_ = "";

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50322a;

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
                f50322a = r0
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50322a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f50322a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f50322a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f50322a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f50322a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50322a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.r$c r1 = com.google.protobuf.r.c.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bc.c.a.<clinit>():void");
        }
    }

    public static final class b extends r.a implements L {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(Map map) {
            t();
            ((c) this.f58648b).b0().putAll(map);
            return this;
        }

        public b B(a.b bVar) {
            t();
            ((c) this.f58648b).i0((a) bVar.q());
            return this;
        }

        public b C(String str) {
            t();
            ((c) this.f58648b).j0(str);
            return this;
        }

        public b D(d dVar) {
            t();
            ((c) this.f58648b).k0(dVar);
            return this;
        }

        public b E(String str) {
            t();
            ((c) this.f58648b).l0(str);
            return this;
        }

        public boolean z() {
            return ((c) this.f58648b).d0();
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: Bc.c$c  reason: collision with other inner class name */
    private static final class C0769c {

        /* renamed from: a  reason: collision with root package name */
        static final D f50323a;

        static {
            m0.b bVar = m0.b.STRING;
            f50323a = D.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        r.Q(c.class, cVar);
    }

    private c() {
    }

    public static c a0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map b0() {
        return g0();
    }

    private E g0() {
        if (!this.customAttributes_.l()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b h0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* access modifiers changed from: private */
    public void i0(a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* access modifiers changed from: private */
    public void k0(d dVar) {
        this.applicationProcessState_ = dVar.d();
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    public a Z() {
        a aVar = this.androidAppInfo_;
        if (aVar == null) {
            return a.X();
        }
        return aVar;
    }

    public boolean c0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean d0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean e0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean f0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Object x(r.c cVar, Object obj, Object obj2) {
        switch (a.f50322a[cVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b((a) null);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.b(), "customAttributes_", C0769c.f50323a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 == null) {
                    synchronized (c.class) {
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
