package com.google.android.gms.measurement.internal;

import Ea.e;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import androidx.core.content.c;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.w  reason: case insensitive filesystem */
public final class C4713w extends C4601e3 {

    /* renamed from: c  reason: collision with root package name */
    private long f55379c;

    /* renamed from: d  reason: collision with root package name */
    private String f55380d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f55381e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f55382f;

    /* renamed from: g  reason: collision with root package name */
    private long f55383g;

    C4713w(E2 e22) {
        super(e22);
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
        Calendar instance = Calendar.getInstance();
        this.f55379c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f55380d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long p() {
        i();
        return this.f55383g;
    }

    public final long q() {
        k();
        return this.f55379c;
    }

    public final String r() {
        k();
        return this.f55380d;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        i();
        this.f55382f = null;
        this.f55383g = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean t() {
        i();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (currentTimeMillis - this.f55383g > 86400000) {
            this.f55382f = null;
        }
        Boolean bool = this.f55382f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (c.checkSelfPermission(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            zzj().I().a("Permission error checking for dasher/unicorn accounts");
            this.f55383g = currentTimeMillis;
            this.f55382f = Boolean.FALSE;
            return false;
        }
        if (this.f55381e == null) {
            this.f55381e = AccountManager.get(zza());
        }
        try {
            Account[] result = this.f55381e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f55381e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f55382f = Boolean.TRUE;
                    this.f55383g = currentTimeMillis;
                    return true;
                }
                this.f55383g = currentTimeMillis;
                this.f55382f = Boolean.FALSE;
                return false;
            }
            this.f55382f = Boolean.TRUE;
            this.f55383g = currentTimeMillis;
            return true;
        } catch (AuthenticatorException e10) {
            e = e10;
            zzj().D().b("Exception checking account types", e);
            this.f55383g = currentTimeMillis;
            this.f55382f = Boolean.FALSE;
            return false;
        } catch (IOException e11) {
            e = e11;
            zzj().D().b("Exception checking account types", e);
            this.f55383g = currentTimeMillis;
            this.f55382f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e12) {
            e = e12;
            zzj().D().b("Exception checking account types", e);
            this.f55383g = currentTimeMillis;
            this.f55382f = Boolean.FALSE;
            return false;
        }
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
