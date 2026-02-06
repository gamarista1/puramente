package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

public abstract class zzcq {
    private static zzcq zza = new zzcp();

    public static synchronized zzcq zza() {
        zzcq zzcq;
        synchronized (zzcq.class) {
            zzcq = zza;
        }
        return zzcq;
    }

    public abstract URLConnection zza(URL url, String str);
}
