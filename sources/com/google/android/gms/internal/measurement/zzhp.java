package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import java.io.IOException;

public abstract class zzhp<MessageType extends zzhq<MessageType, BuilderType>, BuilderType extends zzhp<MessageType, BuilderType>> implements zzks {
    /* renamed from: zza */
    public abstract BuilderType zzb(zzio zzio, zzix zzix);

    public BuilderType zza(byte[] bArr, int i10, int i11) {
        try {
            zzio zza = zzio.zza(bArr, 0, i11, false);
            zzb(zza, zzix.zza);
            zza.zzb(0);
            return this;
        } catch (zzjs e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* renamed from: zzaf */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i10, int i11, zzix zzix) {
        try {
            zzio zza = zzio.zza(bArr, 0, i11, false);
            zzb(zza, zzix);
            zza.zzb(0);
            return this;
        } catch (zzjs e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public final /* synthetic */ zzks zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public final /* synthetic */ zzks zza(byte[] bArr, zzix zzix) {
        return zza(bArr, 0, bArr.length, zzix);
    }

    private final String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }
}
