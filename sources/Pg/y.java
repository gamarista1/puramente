package pg;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    static final int f72594a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f72595b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f72596c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f72597d = c(3, 2);

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
            public boolean c() {
                return false;
            }
        },
        GROUP(r13, 3) {
            public boolean c() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            public boolean c() {
                return false;
            }
        },
        BYTES(c.BYTE_STRING, 2) {
            public boolean c() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a  reason: collision with root package name */
        private final c f72617a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72618b;

        public c a() {
            return this.f72617a;
        }

        public int b() {
            return this.f72618b;
        }

        public boolean c() {
            return true;
        }

        private b(c cVar, int i10) {
            this.f72617a = cVar;
            this.f72618b = i10;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C6642d.f72492a),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a  reason: collision with root package name */
        private final Object f72629a;

        private c(Object obj) {
            this.f72629a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
