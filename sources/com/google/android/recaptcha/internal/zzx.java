package com.google.android.recaptcha.internal;

import com.adjust.sdk.network.ErrorCodes;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class zzx {
    public static final zzw zza = new zzw((DefaultConstructorMarker) null);
    public static final zzx zzb = new zzx(9999);
    public static final zzx zzc = new zzx(1000);
    public static final zzx zzd = new zzx(ErrorCodes.SERVER_RETRY_IN);
    public static final zzx zze = new zzx(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
    public static final zzx zzf = new zzx(ErrorCodes.MALFORMED_URL_EXCEPTION);
    public static final zzx zzg = new zzx(ErrorCodes.PROTOCOL_EXCEPTION);
    public static final zzx zzh = new zzx(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);
    public static final zzx zzi = new zzx(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
    public static final zzx zzj = new zzx(ErrorCodes.IO_EXCEPTION);
    public static final zzx zzk = new zzx(1008);
    public static final zzx zzl = new zzx(1009);
    public static final zzx zzm = new zzx(1010);
    private final int zzn;

    private zzx(int i10) {
        this.zzn = i10;
    }

    public final int zza() {
        return this.zzn;
    }
}
