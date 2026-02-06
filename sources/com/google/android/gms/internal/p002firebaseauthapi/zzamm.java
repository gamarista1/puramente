package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamm  reason: invalid package */
final class zzamm {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc = zzahl.zza();
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamm$zza */
    private static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        public final boolean zzc(Object obj, long j10) {
            if (zzamm.zza) {
                return zzamm.zzf(obj, j10);
            }
            return zzamm.zzg(obj, j10);
        }

        public final void zza(Object obj, long j10, boolean z10) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                zzamm.zzd(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final void zza(Object obj, long j10, byte b10) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j10, b10);
            } else {
                zzamm.zzd(obj, j10, b10);
            }
        }

        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamm$zzb */
    private static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        public final boolean zzc(Object obj, long j10) {
            if (zzamm.zza) {
                return zzamm.zzf(obj, j10);
            }
            return zzamm.zzg(obj, j10);
        }

        public final void zza(Object obj, long j10, boolean z10) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                zzamm.zzd(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final void zza(Object obj, long j10, byte b10) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j10, b10);
            } else {
                zzamm.zzd(obj, j10, b10);
            }
        }

        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamm$zzc */
    private static abstract class zzc {
        Unsafe zza;

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j10);

        public abstract void zza(Object obj, long j10, byte b10);

        public abstract void zza(Object obj, long j10, double d10);

        public abstract void zza(Object obj, long j10, float f10);

        public final void zza(Object obj, long j10, int i10) {
            this.zza.putInt(obj, j10, i10);
        }

        public abstract void zza(Object obj, long j10, boolean z10);

        public abstract float zzb(Object obj, long j10);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (zzamm.zze() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                zzamm.zza(th2);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j10);

        public final int zzd(Object obj, long j10) {
            return this.zza.getInt(obj, j10);
        }

        public final long zze(Object obj, long j10) {
            return this.zza.getLong(obj, j10);
        }

        public final void zza(Object obj, long j10, long j11) {
            this.zza.putLong(obj, j10, j11);
        }

        public final boolean zza() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.zza;
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
                zzamm.zza(th2);
                return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.p002firebaseauthapi.zzahl.zza()
            zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            zze = r2
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.firebase-auth-api.zzamm$zza r1 = new com.google.android.gms.internal.firebase-auth-api.zzamm$zza
            r1.<init>(r0)
            goto L_0x002f
        L_0x0026:
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.internal.firebase-auth-api.zzamm$zzb r1 = new com.google.android.gms.internal.firebase-auth-api.zzamm$zzb
            r1.<init>(r0)
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            zzf = r1
            r0 = 0
            if (r1 != 0) goto L_0x0036
            r2 = r0
            goto L_0x003a
        L_0x0036:
            boolean r2 = r1.zzb()
        L_0x003a:
            zzg = r2
            if (r1 != 0) goto L_0x0040
            r2 = r0
            goto L_0x0044
        L_0x0040:
            boolean r2 = r1.zza()
        L_0x0044:
            zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            zzi = r2
            java.lang.Class<boolean[]> r4 = boolean[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzj = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzk = r4
            java.lang.Class<int[]> r4 = int[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzl = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzm = r4
            java.lang.Class<long[]> r4 = long[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzn = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzo = r4
            java.lang.Class<float[]> r4 = float[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzp = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzq = r4
            java.lang.Class<double[]> r4 = double[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzr = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzs = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzt = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzu = r4
            java.lang.reflect.Field r4 = zze()
            if (r4 == 0) goto L_0x00bf
            if (r1 != 0) goto L_0x00b8
            goto L_0x00bf
        L_0x00b8:
            sun.misc.Unsafe r1 = r1.zza
            long r4 = r1.objectFieldOffset(r4)
            goto L_0x00c1
        L_0x00bf:
            r4 = -1
        L_0x00c1:
            zzv = r4
            r4 = 7
            long r1 = r2 & r4
            int r1 = (int) r1
            zzw = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L_0x00d3
            r0 = 1
        L_0x00d3:
            zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamm.<clinit>():void");
    }

    private zzamm() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static long zzd(Object obj, long j10) {
        return zzf.zze(obj, j10);
    }

    static Object zze(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    static /* synthetic */ boolean zzf(Object obj, long j10) {
        if (((byte) (zzc(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean zzg(Object obj, long j10) {
        if (((byte) (zzc(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    static boolean zzh(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }

    static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc(obj, j11) & (~(255 << i10))));
    }

    static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    /* access modifiers changed from: private */
    public static Field zze() {
        Class<Buffer> cls = Buffer.class;
        Field zza2 = zza((Class<?>) cls, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) cls, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static void zzc(Object obj, long j10, boolean z10) {
        zzf.zza(obj, j10, z10);
    }

    private static boolean zzd(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class<?> cls3 = zzc;
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

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaml());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int zzc2 = zzc(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc2 & (~(255 << i10))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th2) {
        Logger logger = Logger.getLogger(zzamm.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th2);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + valueOf);
    }

    static boolean zzc() {
        return zzh;
    }

    static void zza(byte[] bArr, long j10, byte b10) {
        zzf.zza((Object) bArr, zzi + j10, b10);
    }

    static void zza(Object obj, long j10, double d10) {
        zzf.zza(obj, j10, d10);
    }

    static void zza(Object obj, long j10, float f10) {
        zzf.zza(obj, j10, f10);
    }

    static void zza(Object obj, long j10, int i10) {
        zzf.zza(obj, j10, i10);
    }

    static boolean zzd() {
        return zzg;
    }

    static void zza(Object obj, long j10, long j11) {
        zzf.zza(obj, j10, j11);
    }

    static void zza(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }
}
