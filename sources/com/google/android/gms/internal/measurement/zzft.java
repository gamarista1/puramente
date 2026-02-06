package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.List;

public final class zzft {

    public static final class zza extends zzjk<zza, C0831zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private zzjt<zzb> zze = zzjk.zzcg();

        /* renamed from: com.google.android.gms.internal.measurement.zzft$zza$zza  reason: collision with other inner class name */
        public static final class C0831zza extends zzjk.zzb<zza, C0831zza> implements zzkv {
            private C0831zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0831zza(zzfu zzfu) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzjk.zza(zza.class, zza);
        }

        private zza() {
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfu.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0831zza((zzfu) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zza> zzlc = zzd;
                    if (zzlc == null) {
                        synchronized (zza.class) {
                            try {
                                zzlc = zzd;
                                if (zzlc == null) {
                                    zzlc = new zzjk.zza<>(zzc);
                                    zzd = zzlc;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return zzlc;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjt<zzd> zzg = zzjk.zzcg();

        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzfu zzfu) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzjk.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfu.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzfu) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzb> zzlc = zzd;
                    if (zzlc == null) {
                        synchronized (zzb.class) {
                            try {
                                zzlc = zzd;
                                if (zzlc == null) {
                                    zzlc = new zzjk.zza<>(zzc);
                                    zzd = zzlc;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return zzlc;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private zzjt<zzd> zzf = zzjk.zzcg();
        private zza zzg;

        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzfu zzfu) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzc = zzc2;
            zzjk.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        public final zza zza() {
            zza zza2 = this.zzg;
            return zza2 == null ? zza.zzc() : zza2;
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfu.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzfu) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzc> zzlc = zzd;
                    if (zzlc == null) {
                        synchronized (zzc.class) {
                            try {
                                zzlc = zzd;
                                if (zzlc == null) {
                                    zzlc = new zzjk.zza<>(zzc);
                                    zzd = zzlc;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return zzlc;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzd extends zzjk<zzd, zzb> implements zzkv {
        /* access modifiers changed from: private */
        public static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private zzjt<zzd> zzg = zzjk.zzcg();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        public enum zza implements zzjp {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);
            
            private final int zzg;

            private zza(int i10) {
                this.zzg = i10;
            }

            public static zzjo zzb() {
                return zzfw.zza;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return STRING;
                }
                if (i10 == 2) {
                    return NUMBER;
                }
                if (i10 == 3) {
                    return BOOLEAN;
                }
                if (i10 != 4) {
                    return null;
                }
                return STATEMENT;
            }
        }

        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            /* synthetic */ zzb(zzfu zzfu) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzc = zzd2;
            zzjk.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        public final double zza() {
            return this.zzk;
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN;
            }
            return zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfu.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb((zzfu) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzd> zzlc = zzd;
                    if (zzlc == null) {
                        synchronized (zzd.class) {
                            try {
                                zzlc = zzd;
                                if (zzlc == null) {
                                    zzlc = new zzjk.zza<>(zzc);
                                    zzd = zzlc;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return zzlc;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
