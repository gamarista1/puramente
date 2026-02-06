package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class zzbo implements zzbn {
    private final String zza;

    public zzbo(String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        for (zznf zznf : zzni.zzk(bArr).zzH()) {
            if (!C6565s.q("INIT_TOTAL", "EXECUTE_TOTAL").contains(zznf.zzj().name()) || !zznf.zzT()) {
                zznf.zzJ();
                zznf.zzK();
                zznf.zzj().name();
                zznf.zzU();
            } else {
                zznf.zzJ();
                zznf.zzK();
                zznf.zzj().name();
                zznf.zzg().zzk();
                zznf.zzg().zzf();
                zznf.zzU();
            }
        }
    }

    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.zza).openConnection());
                C6496s.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnection;
            } else if (URLUtil.isHttpsUrl(this.zza)) {
                URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.zza).openConnection());
                C6496s.f(uRLConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) uRLConnection2;
            } else {
                throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            if (httpURLConnection.getResponseCode() == 200) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            e10.getMessage();
            return false;
        }
    }
}
