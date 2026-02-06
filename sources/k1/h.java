package K1;

import K1.g;
import androidx.datastore.preferences.protobuf.C1749w;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;

public final class h extends C1749w implements P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends C1749w.a implements P {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(long j10) {
            q();
            ((h) this.f16561b).d0(j10);
            return this;
        }

        public a B(String str) {
            q();
            ((h) this.f16561b).e0(str);
            return this;
        }

        public a C(g.a aVar) {
            q();
            ((h) this.f16561b).f0(aVar);
            return this;
        }

        public a w(boolean z10) {
            q();
            ((h) this.f16561b).Z(z10);
            return this;
        }

        public a x(double d10) {
            q();
            ((h) this.f16561b).a0(d10);
            return this;
        }

        public a y(float f10) {
            q();
            ((h) this.f16561b).b0(f10);
            return this;
        }

        public a z(int i10) {
            q();
            ((h) this.f16561b).c0(i10);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f4003a;

        private b(int i10) {
            this.f4003a = i10;
        }

        public static b a(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        C1749w.F(h.class, hVar);
    }

    private h() {
    }

    public static h Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a) DEFAULT_INSTANCE.o();
    }

    /* access modifiers changed from: private */
    public void Z(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: private */
    public void a0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* access modifiers changed from: private */
    public void b0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* access modifiers changed from: private */
    public void c0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public void d0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* access modifiers changed from: private */
    public void e0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void f0(g.a aVar) {
        this.value_ = aVar.m();
        this.valueCase_ = 6;
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public String V() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public g W() {
        if (this.valueCase_ == 6) {
            return (g) this.value_;
        }
        return g.L();
    }

    public b X() {
        return b.a(this.valueCase_);
    }

    /* access modifiers changed from: protected */
    public final Object r(C1749w.d dVar, Object obj, Object obj2) {
        switch (e.f3992a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a((e) null);
            case 3:
                return C1749w.C(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x10 = PARSER;
                if (x10 == null) {
                    synchronized (h.class) {
                        try {
                            x10 = PARSER;
                            if (x10 == null) {
                                x10 = new C1749w.b(DEFAULT_INSTANCE);
                                PARSER = x10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return x10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
