package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfv;
import java.io.IOException;
import java.util.List;

public abstract class zzfv<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzim {
    protected int zza = 0;

    protected static void zzg(Iterable iterable, List list) {
        zzfu.zzc(iterable, list);
    }

    /* access modifiers changed from: package-private */
    public int zze(zzix zzix) {
        throw null;
    }

    public final zzgk zzf() {
        try {
            int zzk = zzk();
            zzgk zzgk = zzgk.zzb;
            byte[] bArr = new byte[zzk];
            zzgo zzgo = new zzgo(bArr, 0, zzk);
            zzJ(zzgo);
            zzgo.zzB();
            return new zzgi(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzh() {
        try {
            int zzk = zzk();
            byte[] bArr = new byte[zzk];
            zzgo zzgo = new zzgo(bArr, 0, zzk);
            zzJ(zzgo);
            zzgo.zzB();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
