package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

public final class Y1 extends C4645k5 {
    public Y1(q5 q5Var) {
        super(q5Var);
    }

    /* access modifiers changed from: private */
    public static byte[] u(HttpURLConnection httpURLConnection) {
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

    public final /* bridge */ /* synthetic */ x5 j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ J5 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ C4646l l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4681q2 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Q4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ o5 o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    public final boolean v() {
        p();
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
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
