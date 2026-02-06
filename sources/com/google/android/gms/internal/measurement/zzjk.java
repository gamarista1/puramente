package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjk.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhq<MessageType, BuilderType> {
    private static Map<Object, zzjk<?, ?>> zzc = new ConcurrentHashMap();
    protected zzme zzb = zzme.zzc();
    private int zzd = -1;

    protected static class zza<T extends zzjk<T, ?>> extends zzhr<T> {
        public zza(T t10) {
        }
    }

    public static abstract class zzb<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhp<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzcn()) {
                this.zza = messagetype.zzcd();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private final BuilderType zzb(byte[] bArr, int i10, int i11, zzix zzix) {
            if (!this.zza.zzcn()) {
                zzal();
            }
            try {
                zzlh.zza().zza(this.zza).zza(this.zza, bArr, 0, i11, new zzhv(zzix));
                return this;
            } catch (zzjs e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw zzjs.zzh();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzc */
        public final BuilderType zzb(zzio zzio, zzix zzix) {
            if (!this.zza.zzcn()) {
                zzal();
            }
            try {
                zzlh.zza().zza(this.zza).zza(this.zza, zzis.zza(zzio), zzix);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public /* synthetic */ Object clone() {
            zzb zzb2 = (zzb) this.zzb.zza(zze.zze, (Object) null, (Object) null);
            zzb2.zza = (zzjk) zzaj();
            return zzb2;
        }

        public final /* synthetic */ zzhp zza(zzio zzio, zzix zzix) {
            return (zzb) zzb(zzio, zzix);
        }

        public final /* synthetic */ zzhp zzaf() {
            return (zzb) clone();
        }

        /* renamed from: zzag */
        public final MessageType zzai() {
            MessageType messagetype = (zzjk) zzaj();
            if (zzjk.zza(messagetype, true)) {
                return messagetype;
            }
            throw new zzmc(messagetype);
        }

        /* renamed from: zzah */
        public MessageType zzaj() {
            if (!this.zza.zzcn()) {
                return this.zza;
            }
            this.zza.zzck();
            return this.zza;
        }

        /* access modifiers changed from: protected */
        public final void zzak() {
            if (!this.zza.zzcn()) {
                zzal();
            }
        }

        /* access modifiers changed from: protected */
        public void zzal() {
            MessageType zzcd = this.zzb.zzcd();
            zza(zzcd, this.zza);
            this.zza = zzcd;
        }

        public final /* synthetic */ zzkt zzcj() {
            return this.zzb;
        }

        public final boolean zzcm() {
            return zzjk.zza(this.zza, false);
        }

        public final /* synthetic */ zzhp zza(byte[] bArr, int i10, int i11) {
            return zzb(bArr, 0, i11, zzix.zza);
        }

        public final /* synthetic */ zzhp zza(byte[] bArr, int i10, int i11, zzix zzix) {
            return zzb(bArr, 0, i11, zzix);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcn()) {
                zzal();
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzlh.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    static final class zzc implements zzjf<zzc> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzmn zzb() {
            throw new NoSuchMethodError();
        }

        public final zzmx zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzks zza(zzks zzks, zzkt zzkt) {
            throw new NoSuchMethodError();
        }

        public final zzky zza(zzky zzky, zzky zzky2) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzjk<MessageType, BuilderType> implements zzkv {
        protected zzjd<zzc> zzc = zzjd.zzb();

        /* access modifiers changed from: package-private */
        public final zzjd<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzjd) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    public static final class zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    public static class zzf<ContainingType extends zzkt, Type> extends zziy<ContainingType, Type> {
    }

    private final int zza() {
        return zzlh.zza().zza(this).zzb(this);
    }

    private final int zzb(zzll<?> zzll) {
        if (zzll == null) {
            return zzlh.zza().zza(this).zza(this);
        }
        return zzll.zza(this);
    }

    protected static zzjr zzce() {
        return zzjn.zzd();
    }

    protected static zzjq zzcf() {
        return zzke.zzd();
    }

    protected static <E> zzjt<E> zzcg() {
        return zzlg.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlh.zza().zza(this).zzb(this, (zzjk) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzcn()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzku.zza((zzkt) this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i10, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzbx() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public final int zzca() {
        return zza((zzll) null);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzcb() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzcc() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    /* access modifiers changed from: package-private */
    public final MessageType zzcd() {
        return (zzjk) zza(zze.zzd, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzks zzch() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzks zzci() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final /* synthetic */ zzkt zzcj() {
        return (zzjk) zza(zze.zzf, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzck() {
        zzlh.zza().zza(this).zzc(this);
        zzcl();
    }

    /* access modifiers changed from: package-private */
    public final void zzcl() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzcm() {
        return zza(this, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzcn() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzll zzll) {
        if (zzcn()) {
            int zzb2 = zzb(zzll);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        } else if (zzbx() != Integer.MAX_VALUE) {
            return zzbx();
        } else {
            int zzb3 = zzb(zzll);
            zzc(zzb3);
            return zzb3;
        }
    }

    static <T extends zzjk<?, ?>> T zza(Class<T> cls) {
        T t10 = (zzjk) zzc.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzjk) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzjk) ((zzjk) zzmg.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (t10 != null) {
                zzc.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static zzjq zza(zzjq zzjq) {
        int size = zzjq.size();
        return zzjq.zzc(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzjt<E> zza(zzjt<E> zzjt) {
        int size = zzjt.size();
        return zzjt.zza(size == 0 ? 10 : size << 1);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zza(zzkt zzkt, String str, Object[] objArr) {
        return new zzlj(zzkt, str, objArr);
    }

    protected static <T extends zzjk<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzcl();
        zzc.put(cls, t10);
    }

    public final void zza(zzit zzit) {
        zzlh.zza().zza(this).zza(this, (zzna) zziw.zza(zzit));
    }

    protected static final <T extends zzjk<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zze.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzlh.zza().zza(t10).zzd(t10);
        if (z10) {
            t10.zza(zze.zzb, (Object) zzd2 ? t10 : null, (Object) null);
        }
        return zzd2;
    }
}
