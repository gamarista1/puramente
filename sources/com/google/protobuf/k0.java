package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f58507a = D();

    /* renamed from: b  reason: collision with root package name */
    private static final Class f58508b = C4866d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f58509c = o(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f58510d = o(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f58511e = B();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f58512f = T();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f58513g = S();

    /* renamed from: h  reason: collision with root package name */
    static final long f58514h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f58515i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f58516j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f58517k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f58518l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f58519m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f58520n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f58521o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f58522p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f58523q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f58524r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f58525s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f58526t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f58527u = q(n());

    /* renamed from: v  reason: collision with root package name */
    private static final int f58528v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f58529w;

    class a implements PrivilegedExceptionAction {
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
            if (k0.f58529w) {
                return k0.s(obj, j10);
            }
            return k0.t(obj, j10);
        }

        public byte d(Object obj, long j10) {
            if (k0.f58529w) {
                return k0.v(obj, j10);
            }
            return k0.w(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (k0.f58529w) {
                k0.I(obj, j10, z10);
            } else {
                k0.J(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (k0.f58529w) {
                k0.L(obj, j10, b10);
            } else {
                k0.M(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean s() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            if (k0.f58529w) {
                return k0.s(obj, j10);
            }
            return k0.t(obj, j10);
        }

        public byte d(Object obj, long j10) {
            if (k0.f58529w) {
                return k0.v(obj, j10);
            }
            return k0.w(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (k0.f58529w) {
                k0.I(obj, j10, z10);
            } else {
                k0.J(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (k0.f58529w) {
                k0.L(obj, j10, b10);
            } else {
                k0.M(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean s() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return this.f58530a.getBoolean(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return this.f58530a.getByte(obj, j10);
        }

        public double e(Object obj, long j10) {
            return this.f58530a.getDouble(obj, j10);
        }

        public float f(Object obj, long j10) {
            return this.f58530a.getFloat(obj, j10);
        }

        public void k(Object obj, long j10, boolean z10) {
            this.f58530a.putBoolean(obj, j10, z10);
        }

        public void l(Object obj, long j10, byte b10) {
            this.f58530a.putByte(obj, j10, b10);
        }

        public void m(Object obj, long j10, double d10) {
            this.f58530a.putDouble(obj, j10, d10);
        }

        public void n(Object obj, long j10, float f10) {
            this.f58530a.putFloat(obj, j10, f10);
        }

        public boolean r() {
            Class<Object> cls = Object.class;
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f58530a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th2) {
                k0.G(th2);
                return false;
            }
        }

        public boolean s() {
            Class<Object> cls = Object.class;
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f58530a.getClass();
                Class cls3 = Long.TYPE;
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
                k0.G(th2);
                return false;
            }
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f58530a;

        e(Unsafe unsafe) {
            this.f58530a = unsafe;
        }

        public final int a(Class cls) {
            return this.f58530a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f58530a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f58530a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f58530a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f58530a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f58530a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f58530a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f58530a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f58530a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f58530a;
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
                return true;
            } catch (Throwable th2) {
                k0.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f58530a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (k0.n() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                k0.G(th2);
                return false;
            }
        }
    }

    static {
        boolean z10;
        long l10 = (long) l(byte[].class);
        f58514h = l10;
        Class<boolean[]> cls = boolean[].class;
        f58515i = (long) l(cls);
        f58516j = (long) m(cls);
        Class<int[]> cls2 = int[].class;
        f58517k = (long) l(cls2);
        f58518l = (long) m(cls2);
        Class<long[]> cls3 = long[].class;
        f58519m = (long) l(cls3);
        f58520n = (long) m(cls3);
        Class<float[]> cls4 = float[].class;
        f58521o = (long) l(cls4);
        f58522p = (long) m(cls4);
        Class<double[]> cls5 = double[].class;
        f58523q = (long) l(cls5);
        f58524r = (long) m(cls5);
        Class<Object[]> cls6 = Object[].class;
        f58525s = (long) l(cls6);
        f58526t = (long) m(cls6);
        f58528v = (int) (l10 & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        f58529w = z10;
    }

    static long A(Object obj, long j10) {
        return f58511e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f58507a;
        if (unsafe == null) {
            return null;
        }
        if (!C4866d.c()) {
            return new d(unsafe);
        }
        if (f58509c) {
            return new c(unsafe);
        }
        if (f58510d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j10) {
        return f58511e.i(obj, j10);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f58513g;
    }

    static boolean F() {
        return f58512f;
    }

    /* access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger logger = Logger.getLogger(k0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void H(Object obj, long j10, boolean z10) {
        f58511e.k(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void K(byte[] bArr, long j10, byte b10) {
        f58511e.l(bArr, f58514h + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int z10 = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z10 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    static void N(Object obj, long j10, double d10) {
        f58511e.m(obj, j10, d10);
    }

    static void O(Object obj, long j10, float f10) {
        f58511e.n(obj, j10, f10);
    }

    static void P(Object obj, long j10, int i10) {
        f58511e.o(obj, j10, i10);
    }

    static void Q(Object obj, long j10, long j11) {
        f58511e.p(obj, j10, j11);
    }

    static void R(Object obj, long j10, Object obj2) {
        f58511e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f58511e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f58511e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static Object k(Class cls) {
        try {
            return f58507a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class cls) {
        if (f58513g) {
            return f58511e.a(cls);
        }
        return -1;
    }

    private static int m(Class cls) {
        if (f58513g) {
            return f58511e.b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static Field n() {
        Field p10;
        Class<Buffer> cls = Buffer.class;
        if (C4866d.c() && (p10 = p(cls, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(cls, "address");
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    static boolean o(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C4866d.c()) {
            return false;
        }
        try {
            Class cls3 = f58508b;
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

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f58511e) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j10) {
        return f58511e.c(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        if (v(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        if (w(obj, j10) != 0) {
            return true;
        }
        return false;
    }

    static byte u(byte[] bArr, long j10) {
        return f58511e.d(bArr, f58514h + j10);
    }

    /* access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double x(Object obj, long j10) {
        return f58511e.e(obj, j10);
    }

    static float y(Object obj, long j10) {
        return f58511e.f(obj, j10);
    }

    static int z(Object obj, long j10) {
        return f58511e.g(obj, j10);
    }
}
