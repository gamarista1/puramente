package androidx.datastore.preferences.protobuf;

public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    static final int f16447a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f16448b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f16449c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f16450d = c(3, 2);

    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a  reason: collision with root package name */
        private final c f16470a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16471b;

        public c a() {
            return this.f16470a;
        }

        public int b() {
            return this.f16471b;
        }

        private b(c cVar, int i10) {
            this.f16470a = cVar;
            this.f16471b = i10;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C1734g.f16324b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a  reason: collision with root package name */
        private final Object f16482a;

        private c(Object obj) {
            this.f16482a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
