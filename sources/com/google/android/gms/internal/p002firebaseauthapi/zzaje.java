package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import com.google.android.gms.internal.p002firebaseauthapi.zzaje.zza;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje  reason: invalid package */
public abstract class zzaje<MessageType extends zzaje<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
    private static Map<Object, zzaje<?, ?>> zzc = new ConcurrentHashMap();
    protected zzamf zzb = zzamf.zzc();
    private int zzd = -1;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje$zzb */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzaje<MessageType, BuilderType> implements zzakr {
        protected zzaix<zze> zzc = zzaix.zzb();

        /* access modifiers changed from: package-private */
        public final zzaix<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzaix) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje$zzc */
    protected static class zzc<T extends zzaje<T, ?>> extends zzahj<T> {
        private final T zza;

        public zzc(T t10) {
            this.zza = t10;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje$zzd */
    public static class zzd<ContainingType extends zzakp, Type> extends zzair<ContainingType, Type> {
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje$zze */
    static final class zze implements zzaiz<zze> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzamt zzb() {
            throw new NoSuchMethodError();
        }

        public final zzand zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzako zza(zzako zzako, zzakp zzakp) {
            throw new NoSuchMethodError();
        }

        public final zzaku zza(zzaku zzaku, zzaku zzaku2) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje$zzf */
    public static final class zzf {
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

    private final int zza() {
        return zzald.zza().zza(this).zzb(this);
    }

    private final int zzb(zzalh<?> zzalh) {
        if (zzalh == null) {
            return zzald.zza().zza(this).zza(this);
        }
        return zzalh.zza(this);
    }

    protected static <E> zzajl<E> zzp() {
        return zzalc.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzald.zza().zza(this).zzb(this, (zzaje) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzakq.zza((zzakp) this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i10, Object obj, Object obj2);

    public final /* synthetic */ zzakp zzh() {
        return (zzaje) zza(zzf.zzf, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int zzi() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzk() {
        return zza(this, true);
    }

    public final int zzl() {
        return zza((zzalh) null);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzaje<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    /* access modifiers changed from: package-private */
    public final MessageType zzo() {
        return (zzaje) zza(zzf.zzd, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzako zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzako zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        zzald.zza().zza(this).zzc(this);
        zzt();
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzu() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzalh zzalh) {
        if (zzu()) {
            int zzb2 = zzb((zzalh<?>) zzalh);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        } else if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        } else {
            int zzb3 = zzb((zzalh<?>) zzalh);
            zzb(zzb3);
            return zzb3;
        }
    }

    private static <T extends zzaje<T, ?>> T zzb(T t10, zzaho zzaho, zzaiq zzaiq) {
        zzaic zzc2 = zzaho.zzc();
        T zza2 = zza(t10, zzc2, zzaiq);
        try {
            zzc2.zzc(0);
            return zza2;
        } catch (zzajk e10) {
            throw e10.zza(zza2);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaje$zza */
    public static abstract class zza<MessageType extends zzaje<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahh<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzu()) {
                this.zza = messagetype.zzo();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public /* synthetic */ Object clone() {
            zza zza2 = (zza) this.zzb.zza(zzf.zze, (Object) null, (Object) null);
            zza2.zza = (zzaje) zzg();
            return zza2;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzj();
            }
            zza(this.zza, messagetype);
            return this;
        }

        public final /* synthetic */ zzahh zzc() {
            return (zza) clone();
        }

        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (zzaje) zzg();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzame(messagetype);
        }

        /* renamed from: zze */
        public MessageType zzg() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        public final /* synthetic */ zzakp zzh() {
            return this.zzb;
        }

        /* access modifiers changed from: protected */
        public final void zzi() {
            if (!this.zza.zzu()) {
                zzj();
            }
        }

        /* access modifiers changed from: protected */
        public void zzj() {
            MessageType zzo = this.zzb.zzo();
            zza(zzo, this.zza);
            this.zza = zzo;
        }

        public final boolean zzk() {
            return zzaje.zza(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzald.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    private static <T extends zzaje<T, ?>> T zza(T t10) {
        if (t10 == null || t10.zzk()) {
            return t10;
        }
        throw new zzame(t10).zza().zza(t10);
    }

    static <T extends zzaje<?, ?>> T zza(Class<T> cls) {
        T t10 = (zzaje) zzc.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzaje) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzaje) ((zzaje) zzamm.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (t10 != null) {
                zzc.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static <T extends zzaje<T, ?>> T zza(T t10, zzaho zzaho, zzaiq zzaiq) {
        return zza(zzb(t10, zzaho, zzaiq));
    }

    protected static <T extends zzaje<T, ?>> T zza(T t10, InputStream inputStream, zzaiq zzaiq) {
        zzaic zzaic;
        if (inputStream == null) {
            byte[] bArr = zzajh.zzb;
            zzaic = zzaic.zza(bArr, 0, bArr.length, false);
        } else {
            zzaic = new zzaih(inputStream);
        }
        return zza(zza(t10, zzaic, zzaiq));
    }

    protected static <T extends zzaje<T, ?>> T zza(T t10, byte[] bArr, zzaiq zzaiq) {
        return zza(zza(t10, bArr, 0, bArr.length, zzaiq));
    }

    private static <T extends zzaje<T, ?>> T zza(T t10, zzaic zzaic, zzaiq zzaiq) {
        T zzo = t10.zzo();
        try {
            zzalh zza2 = zzald.zza().zza(zzo);
            zza2.zza(zzo, zzail.zza(zzaic), zzaiq);
            zza2.zzc(zzo);
            return zzo;
        } catch (zzajk e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzajk((IOException) e);
            }
            throw e.zza(zzo);
        } catch (zzame e11) {
            throw e11.zza().zza(zzo);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzajk) {
                throw ((zzajk) e12.getCause());
            }
            throw new zzajk(e12).zza(zzo);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzajk) {
                throw ((zzajk) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends zzaje<T, ?>> T zza(T t10, byte[] bArr, int i10, int i11, zzaiq zzaiq) {
        T zzo = t10.zzo();
        try {
            zzalh zza2 = zzald.zza().zza(zzo);
            zza2.zza(zzo, bArr, 0, i11, new zzahn(zzaiq));
            zza2.zzc(zzo);
            return zzo;
        } catch (zzajk e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzajk((IOException) e);
            }
            throw e.zza(zzo);
        } catch (zzame e11) {
            throw e11.zza().zza(zzo);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzajk) {
                throw ((zzajk) e12.getCause());
            }
            throw new zzajk(e12).zza(zzo);
        } catch (IndexOutOfBoundsException unused) {
            throw zzajk.zzi().zza(zzo);
        }
    }

    protected static <E> zzajl<E> zza(zzajl<E> zzajl) {
        int size = zzajl.size();
        return zzajl.zza(size == 0 ? 10 : size << 1);
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

    protected static Object zza(zzakp zzakp, String str, Object[] objArr) {
        return new zzalf(zzakp, str, objArr);
    }

    protected static <T extends zzaje<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzt();
        zzc.put(cls, t10);
    }

    public final void zza(zzaim zzaim) {
        zzald.zza().zza(this).zza(this, (zzanc) zzaip.zza(zzaim));
    }

    protected static final <T extends zzaje<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zzf.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzald.zza().zza(t10).zzd(t10);
        if (z10) {
            t10.zza(zzf.zzb, (Object) zzd2 ? t10 : null, (Object) null);
        }
        return zzd2;
    }
}
