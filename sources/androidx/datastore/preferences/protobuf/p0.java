package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f16419a = Logger.getLogger(p0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f16420b = B();

    /* renamed from: c  reason: collision with root package name */
    private static final Class f16421c = C1731d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f16422d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f16423e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f16424f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f16425g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f16426h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f16427i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f16428j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f16429k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f16430l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f16431m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f16432n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f16433o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f16434p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f16435q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f16436r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f16437s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f16438t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f16439u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f16440v = o(l());

    /* renamed from: w  reason: collision with root package name */
    private static final int f16441w;

    /* renamed from: x  reason: collision with root package name */
    static final boolean f16442x;

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            if (p0.f16442x) {
                return p0.q(obj, j10);
            }
            return p0.r(obj, j10);
        }

        public byte d(Object obj, long j10) {
            if (p0.f16442x) {
                return p0.t(obj, j10);
            }
            return p0.u(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (p0.f16442x) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (p0.f16442x) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            if (p0.f16442x) {
                return p0.q(obj, j10);
            }
            return p0.r(obj, j10);
        }

        public byte d(Object obj, long j10) {
            if (p0.f16442x) {
                return p0.t(obj, j10);
            }
            return p0.u(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (p0.f16442x) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (p0.f16442x) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return this.f16443a.getBoolean(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return this.f16443a.getByte(obj, j10);
        }

        public double e(Object obj, long j10) {
            return this.f16443a.getDouble(obj, j10);
        }

        public float f(Object obj, long j10) {
            return this.f16443a.getFloat(obj, j10);
        }

        public void k(Object obj, long j10, boolean z10) {
            this.f16443a.putBoolean(obj, j10, z10);
        }

        public void l(Object obj, long j10, byte b10) {
            this.f16443a.putByte(obj, j10, b10);
        }

        public void m(Object obj, long j10, double d10) {
            this.f16443a.putDouble(obj, j10, d10);
        }

        public void n(Object obj, long j10, float f10) {
            this.f16443a.putFloat(obj, j10, f10);
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f16443a;

        e(Unsafe unsafe) {
            this.f16443a = unsafe;
        }

        public final int a(Class cls) {
            return this.f16443a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f16443a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f16443a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f16443a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f16443a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f16443a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f16443a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f16443a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f16443a.putObject(obj, j10, obj2);
        }
    }

    static {
        boolean z10;
        long j10 = (long) j(byte[].class);
        f16427i = j10;
        Class<boolean[]> cls = boolean[].class;
        f16428j = (long) j(cls);
        f16429k = (long) k(cls);
        Class<int[]> cls2 = int[].class;
        f16430l = (long) j(cls2);
        f16431m = (long) k(cls2);
        Class<long[]> cls3 = long[].class;
        f16432n = (long) j(cls3);
        f16433o = (long) k(cls3);
        Class<float[]> cls4 = float[].class;
        f16434p = (long) j(cls4);
        f16435q = (long) k(cls4);
        Class<double[]> cls5 = double[].class;
        f16436r = (long) j(cls5);
        f16437s = (long) k(cls5);
        Class<Object[]> cls6 = Object[].class;
        f16438t = (long) j(cls6);
        f16439u = (long) k(cls6);
        f16441w = (int) (j10 & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f16442x = z10;
    }

    static Object A(Object obj, long j10) {
        return f16424f.i(obj, j10);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f16426h;
    }

    static boolean D() {
        return f16425g;
    }

    static void E(Object obj, long j10, boolean z10) {
        f16424f.k(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f16424f.l(bArr, f16427i + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int x10 = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x10 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f16424f.m(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f16424f.n(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f16424f.o(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f16424f.p(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f16424f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f16420b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            if (C1731d.c()) {
                return true;
            }
            cls3.getMethod("getByte", new Class[]{cls2, cls4});
            cls3.getMethod("putByte", new Class[]{cls2, cls4, Byte.TYPE});
            cls3.getMethod("getBoolean", new Class[]{cls2, cls4});
            cls3.getMethod("putBoolean", new Class[]{cls2, cls4, Boolean.TYPE});
            cls3.getMethod("getFloat", new Class[]{cls2, cls4});
            cls3.getMethod("putFloat", new Class[]{cls2, cls4, Float.TYPE});
            cls3.getMethod("getDouble", new Class[]{cls2, cls4});
            cls3.getMethod("putDouble", new Class[]{cls2, cls4, Double.TYPE});
            return true;
        } catch (Throwable th2) {
            Logger logger = f16419a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f16420b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (l() == null) {
                return false;
            }
            if (C1731d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th2) {
            Logger logger = f16419a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    static Object i(Class cls) {
        try {
            return f16420b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f16426h) {
            return f16424f.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f16426h) {
            return f16424f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n10;
        Class<Buffer> cls = Buffer.class;
        if (C1731d.c() && (n10 = n(cls, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(cls, "address");
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    private static boolean m(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C1731d.c()) {
            return false;
        }
        try {
            Class cls3 = f16421c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f16424f) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j10) {
        return f16424f.c(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        if (t(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        if (u(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    static byte s(byte[] bArr, long j10) {
        return f16424f.d(bArr, f16427i + j10);
    }

    /* access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j10) {
        return f16424f.e(obj, j10);
    }

    static float w(Object obj, long j10) {
        return f16424f.f(obj, j10);
    }

    static int x(Object obj, long j10) {
        return f16424f.g(obj, j10);
    }

    static long y(Object obj, long j10) {
        return f16424f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f16420b;
        if (unsafe == null) {
            return null;
        }
        if (!C1731d.c()) {
            return new d(unsafe);
        }
        if (f16422d) {
            return new c(unsafe);
        }
        if (f16423e) {
            return new b(unsafe);
        }
        return null;
    }
}
