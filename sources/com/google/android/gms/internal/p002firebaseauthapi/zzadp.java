package com.google.android.gms.internal.p002firebaseauthapi;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.C4536s;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadp  reason: invalid package */
public final class zzadp {
    private static final boolean zza(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzadm<?> zzadm, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (zza(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Constants.ENCODING));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
            String sb3 = sb2.toString();
            if (!zza(responseCode)) {
                zzadm.zza((String) zzacs.zza(sb3, String.class));
            } else {
                zzadm.zza((zzacu) zzacs.zza(sb3, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            zzadm.zza("TIMEOUT");
            httpURLConnection.disconnect();
            return;
        } catch (IOException e10) {
            e = e10;
            try {
                zzadm.zza(e.getMessage());
                httpURLConnection.disconnect();
                return;
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (zzaah e11) {
            e = e11;
            zzadm.zza(e.getMessage());
            httpURLConnection.disconnect();
            return;
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public static void zza(String str, zzadm<?> zzadm, Type type, zzacv zzacv) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzacv.zza((URLConnection) httpURLConnection);
            zza(httpURLConnection, zzadm, type);
        } catch (SocketTimeoutException unused) {
            zzadm.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzadm.zza("<<Network Error>>");
        } catch (IOException e10) {
            zzadm.zza(e10.getMessage());
        }
    }

    public static void zza(String str, zzacr zzacr, zzadm<?> zzadm, Type type, zzacv zzacv) {
        BufferedOutputStream bufferedOutputStream;
        try {
            C4536s.l(zzacr);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzacr.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzacv.zza((URLConnection) httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            bufferedOutputStream.close();
            zza(httpURLConnection, zzadm, type);
            return;
        } catch (SocketTimeoutException unused) {
            zzadm.zza("TIMEOUT");
            return;
        } catch (UnknownHostException unused2) {
            zzadm.zza("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e10) {
            zzadm.zza(e10.getMessage());
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
