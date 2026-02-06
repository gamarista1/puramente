package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzhk<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfv<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzjk zzc = zzjk.zzc();
    private int zzd = -1;

    private static zzhk zzB(zzhk zzhk, byte[] bArr, int i10, int i11, zzgw zzgw) {
        if (i11 == 0) {
            return zzhk;
        }
        zzhk zzp = zzhk.zzp();
        try {
            zzix zzb2 = zziu.zza().zzb(zzp.getClass());
            zzb2.zzh(zzp, bArr, 0, i11, new zzfz(zzgw));
            zzb2.zzf(zzp);
            return zzp;
        } catch (zzhr e10) {
            throw e10;
        } catch (zzji e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzhr) {
                throw ((zzhr) e12.getCause());
            }
            throw new zzhr(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final int zzc(zzix zzix) {
        return zziu.zza().zzb(getClass()).zza(this);
    }

    static zzhk zzo(Class cls) {
        Map map = zzb;
        zzhk zzhk = (zzhk) map.get(cls);
        if (zzhk == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhk = (zzhk) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzhk == null) {
            zzhk = (zzhk) ((zzhk) zzjq.zze(cls)).zzd(6, (Object) null, (Object) null);
            if (zzhk != null) {
                map.put(cls, zzhk);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzhk;
    }

    protected static zzhk zzq(zzhk zzhk, byte[] bArr, zzgw zzgw) {
        zzhk zzB = zzB(zzhk, bArr, 0, bArr.length, zzgw);
        if (zzB == null || zzz(zzB, true)) {
            return zzB;
        }
        throw new zzji(zzB).zza();
    }

    protected static zzhn zzr() {
        return zzhl.zzf();
    }

    protected static zzho zzs() {
        return zziv.zze();
    }

    static Object zzt(Method method, Object obj, Object... objArr) {
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

    protected static Object zzu(zzim zzim, String str, Object[] objArr) {
        return new zziw(zzim, str, objArr);
    }

    protected static void zzx(Class cls, zzhk zzhk) {
        zzhk.zzw();
        zzb.put(cls, zzhk);
    }

    protected static final boolean zzz(zzhk zzhk, boolean z10) {
        zzhk zzhk2;
        byte byteValue = ((Byte) zzhk.zzd(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zziu.zza().zzb(zzhk.getClass()).zzk(zzhk);
        if (z10) {
            if (true != zzk) {
                zzhk2 = null;
            } else {
                zzhk2 = zzhk;
            }
            zzhk.zzd(2, zzhk2, (Object) null);
        }
        return zzk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zziu.zza().zzb(getClass()).zzj(this, (zzhk) obj);
    }

    public final int hashCode() {
        if (zzA()) {
            return zzj();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    public final String toString() {
        return zzio.zza(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public final boolean zzA() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final /* synthetic */ zzil zzI() {
        return (zzhg) zzd(5, (Object) null, (Object) null);
    }

    public final void zzJ(zzgr zzgr) {
        zziu.zza().zzb(getClass()).zzi(this, zzgs.zza(zzgr));
    }

    /* access modifiers changed from: protected */
    public abstract Object zzd(int i10, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zze(zzix zzix) {
        if (zzA()) {
            int zza = zzix.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzix.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    public final /* synthetic */ zzim zzi() {
        return (zzhk) zzd(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int zzj() {
        return zziu.zza().zzb(getClass()).zzb(this);
    }

    public final int zzk() {
        int i10;
        if (zzA()) {
            i10 = zzc((zzix) null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & a.e.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzc((zzix) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    public final boolean zzl() {
        return zzz(this, true);
    }

    /* access modifiers changed from: protected */
    public final zzhg zzm() {
        return (zzhg) zzd(5, (Object) null, (Object) null);
    }

    public final zzhg zzn() {
        zzhg zzhg = (zzhg) zzd(5, (Object) null, (Object) null);
        zzhg.zze(this);
        return zzhg;
    }

    /* access modifiers changed from: package-private */
    public final zzhk zzp() {
        return (zzhk) zzd(4, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        zziu.zza().zzb(getClass()).zzf(this);
        zzw();
    }

    /* access modifiers changed from: package-private */
    public final void zzw() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final void zzy(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }
}
