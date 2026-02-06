package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

final class zzdv {
    private final Deque zza = new ArrayDeque(16);

    private zzdv(boolean z10) {
    }

    public static zzdv zza() {
        return new zzdv(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j10) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j10));
    }

    public final void zzb() {
        if (!this.zza.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", new Object[]{Integer.valueOf(this.zza.size()), Long.valueOf(zzh())}));
        }
    }

    public final void zzc() {
        long zzh = zzh();
        if (zzh >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", new Object[]{Long.valueOf(zzh)}));
        } else if (zzh != -5) {
            this.zza.pop();
        } else {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
    }

    public final void zzd() {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh == -2) {
                zzh = -2;
            } else {
                return;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", new Object[]{Long.valueOf(zzh)}));
    }

    public final void zze(long j10) {
        long zzh = zzh();
        if (zzh != j10) {
            if (zzh != -1) {
                if (zzh == -2) {
                    zzh = -2;
                } else {
                    return;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", new Object[]{Long.valueOf(j10), Long.valueOf(zzh)}));
        }
    }

    public final void zzf() {
        long zzh = zzh();
        int i10 = (zzh > 1 ? 1 : (zzh == 1 ? 0 : -1));
        if (i10 == 0) {
            this.zza.pop();
        } else if (i10 > 0) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5);
        } else if (zzh == -5) {
            zzi(-4);
        }
    }

    public final void zzg(long j10) {
        this.zza.push(Long.valueOf(j10));
    }
}
