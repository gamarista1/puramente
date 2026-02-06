package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.List;

public final class zzff {

    public static final class zza extends zzjk<zza, C0825zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private int zzf;
        private zzjt<zze> zzg = zzjk.zzcg();
        private zzjt<zzb> zzh = zzjk.zzcg();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzff$zza$zza  reason: collision with other inner class name */
        public static final class C0825zza extends zzjk.zzb<zza, C0825zza> implements zzkv {
            private C0825zza() {
                super(zza.zzc);
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            /* synthetic */ C0825zza(zzfg zzfg) {
                this();
            }

            public final C0825zza zza(int i10, zzb.zza zza) {
                zzak();
                ((zza) this.zza).zza(i10, (zzb) ((zzjk) zza.zzai()));
                return this;
            }

            public final zze zzb(int i10) {
                return ((zza) this.zza).zzb(i10);
            }

            public final C0825zza zza(int i10, zze.zza zza) {
                zzak();
                ((zza) this.zza).zza(i10, (zze) ((zzjk) zza.zzai()));
                return this;
            }

            public final zzb zza(int i10) {
                return ((zza) this.zza).zza(i10);
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzjk.zza(zza.class, zza);
        }

        private zza() {
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final zzb zza(int i10) {
            return this.zzh.get(i10);
        }

        public final zze zzb(int i10) {
            return this.zzg.get(i10);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfg.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0825zza((zzfg) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        /* access modifiers changed from: private */
        public final void zza(int i10, zzb zzb) {
            zzb.getClass();
            zzjt<zzb> zzjt = this.zzh;
            if (!zzjt.zzc()) {
                this.zzh = zzjk.zza(zzjt);
            }
            this.zzh.set(i10, zzb);
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zze zze2) {
            zze2.getClass();
            zzjt<zze> zzjt = this.zzg;
            if (!zzjt.zzc()) {
                this.zzg = zzjk.zza(zzjt);
            }
            this.zzg.set(i10, zze2);
        }
    }

    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzjt<zzc> zzh = zzjk.zzcg();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            /* synthetic */ zza(zzfg zzfg) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i10, zzc zzc) {
                zzak();
                ((zzb) this.zza).zza(i10, zzc);
                return this;
            }

            public final zzc zza(int i10) {
                return ((zzb) this.zza).zza(i10);
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzjk.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        public static zza zzc() {
            return (zza) zzc.zzcb();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzd2 = this.zzj;
            if (zzd2 == null) {
                return zzd.zzc();
            }
            return zzd2;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzm() {
            if ((this.zze & 64) != 0) {
                return true;
            }
            return false;
        }

        public final zzc zza(int i10) {
            return this.zzh.get(i10);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfg.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzfg) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* access modifiers changed from: private */
        public final void zza(int i10, zzc zzc2) {
            zzc2.getClass();
            zzjt<zzc> zzjt = this.zzh;
            if (!zzjt.zzc()) {
                this.zzh = zzjk.zza(zzjt);
            }
            this.zzh.set(i10, zzc2);
        }
    }

    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                zzak();
                ((zzc) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzfg zzfg) {
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

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzd2 = this.zzg;
            if (zzd2 == null) {
                return zzd.zzc();
            }
            return zzd2;
        }

        public final zzf zzd() {
            zzf zzf2 = this.zzf;
            if (zzf2 == null) {
                return zzf.zzd();
            }
            return zzf2;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfg.zza[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzfg) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }
    }

    public static final class zze extends zzjk<zze, zza> implements zzkv {
        /* access modifiers changed from: private */
        public static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        public static final class zza extends zzjk.zzb<zze, zza> implements zzkv {
            private zza() {
                super(zze.zzc);
            }

            public final zza zza(String str) {
                zzak();
                ((zze) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzfg zzfg) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzc = zze2;
            zzjk.zza(zze.class, zze2);
        }

        private zze() {
        }

        public static zza zzc() {
            return (zza) zzc.zzcb();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzc2 = this.zzh;
            if (zzc2 == null) {
                return zzc.zzb();
            }
            return zzc2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfg.zza[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzfg) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zze> zzlc = zzd;
                    if (zzlc == null) {
                        synchronized (zze.class) {
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

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }
    }

    public static final class zzf extends zzjk<zzf, zzb> implements zzkv {
        /* access modifiers changed from: private */
        public static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private boolean zzh;
        private zzjt<String> zzi = zzjk.zzcg();

        public enum zza implements zzjp {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private final int zzi;

            private zza(int i10) {
                this.zzi = i10;
            }

            public static zzjo zzb() {
                return zzfj.zza;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzi;
            }

            public static zza zza(int i10) {
                switch (i10) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        public static final class zzb extends zzjk.zzb<zzf, zzb> implements zzkv {
            private zzb() {
                super(zzf.zzc);
            }

            /* synthetic */ zzb(zzfg zzfg) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzc = zzf2;
            zzjk.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN_MATCH_TYPE;
            }
            return zza2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfg.zza[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb((zzfg) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzf> zzlc = zzd;
                    if (zzlc == null) {
                        synchronized (zzf.class) {
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
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        public enum zza implements zzjp {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private final int zzg;

            private zza(int i10) {
                this.zzg = i10;
            }

            public static zzjo zzb() {
                return zzfh.zza;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i10) {
                if (i10 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i10 == 1) {
                    return LESS_THAN;
                }
                if (i10 == 2) {
                    return GREATER_THAN;
                }
                if (i10 == 3) {
                    return EQUAL;
                }
                if (i10 != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            /* synthetic */ zzb(zzfg zzfg) {
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

        public static zzd zzc() {
            return zzc;
        }

        public final zza zza() {
            zza zza2 = zza.zza(this.zzf);
            return zza2 == null ? zza.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzk() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzfg.zza[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb((zzfg) null);
                case 3:
                    return zzjk.zza((zzkt) zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi", "zzj"});
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
