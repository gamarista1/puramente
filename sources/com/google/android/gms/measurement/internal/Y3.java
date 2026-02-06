package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

public final class Y3 extends C4601e3 {
    Y3(E2 e22) {
        super(e22);
    }

    /* access modifiers changed from: private */
    public static byte[] q(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream2.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r2 = this;
            r2.k()
            android.content.Context r0 = r2.zza()
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x0016
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0021
            r0 = 1
            return r0
        L_0x0021:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Y3.r():boolean");
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
