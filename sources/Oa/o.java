package oa;

import Ba.C4246a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4527i;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import ya.C5284a;
import ya.C5288e;
import ya.C5289f;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f61183a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b  reason: collision with root package name */
    public static final String f61184b = "androidPackageName";

    /* renamed from: c  reason: collision with root package name */
    private static final ComponentName f61185c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d  reason: collision with root package name */
    private static final C4246a f61186d = j.a("GoogleAuthUtil");

    public static void a(Context context, String str) {
        g(context, str, 0);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0, (Executor) null).zza();
    }

    public static TokenData d(Context context, Account account, String str, Bundle bundle, long j10, Executor executor) {
        Bundle bundle2;
        C4536s.k("Calling this from your main thread can lead to deadlock");
        C4536s.g(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        n(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f61185c, new l(account, str, bundle2, context), 0, (Executor) null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return h(context, "getTokenWithDetails", zze);
        }
        throw new IOException("Service call returned null");
    }

    public static void g(Context context, String str, long j10) {
        C4536s.k("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && q(context)) {
            zzg zza = zzh.zza(context);
            zzbw zzbw = new zzbw();
            zzbw.zza(str);
            try {
                j(zza.zza(zzbw), "clear token");
                return;
            } catch (b e10) {
                m(e10, "clear token");
            }
        }
        Context context2 = context;
        i(context2, f61185c, new m(str, bundle), 0, (Executor) null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new d("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, n nVar, long j10, Executor executor) {
        C5284a aVar = new C5284a();
        C4527i b10 = C4527i.b(context);
        try {
            if (b10.a(componentName, aVar, "GoogleAuthUtil", (Executor) null)) {
                try {
                    Object a10 = nVar.a(aVar.a());
                    b10.d(componentName, aVar, "GoogleAuthUtil");
                    return a10;
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                } catch (Throwable th2) {
                    b10.d(componentName, aVar, "GoogleAuthUtil");
                    throw th2;
                }
            } else {
                throw new IOException("Could not bind to service.");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", new Object[]{e11.getMessage()}));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof b) {
                throw ((b) cause);
            }
            String format = String.format("Unable to get a result for %s due to ExecutionException.", new Object[]{str});
            f61186d.h(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (InterruptedException e11) {
            String format2 = String.format("Interrupted while waiting for the task of %s to finish.", new Object[]{str});
            f61186d.h(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (CancellationException e12) {
            String format3 = String.format("Canceled while waiting for the task of %s to finish.", new Object[]{str});
            f61186d.h(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    /* access modifiers changed from: private */
    public static Object k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f61186d.h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) {
        try {
            d.a(context.getApplicationContext(), i10);
        } catch (C5289f e10) {
            throw new f(e10.b(), e10.getMessage(), e10.a());
        } catch (GooglePlayServicesIncorrectManifestValueException | C5288e e11) {
            throw new d(e11.getMessage(), e11);
        }
    }

    private static void m(b bVar, String str) {
        f61186d.h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f61184b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        zzby zza = zzby.zza(str2);
        C4246a aVar = f61186d;
        aVar.h(String.format("[GoogleAuthUtil] error status:%s with method:%s", new Object[]{zza, str}), new Object[0]);
        if (zzby.BAD_AUTHENTICATION.equals(zza) || zzby.CAPTCHA.equals(zza) || zzby.NEED_PERMISSION.equals(zza) || zzby.NEED_REMOTE_CONSENT.equals(zza) || zzby.NEEDS_BROWSER.equals(zza) || zzby.USER_CANCEL.equals(zza) || zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza) || zzby.DM_INTERNAL_ERROR.equals(zza) || zzby.DM_SYNC_DISABLED.equals(zza) || zzby.DM_ADMIN_BLOCKED.equals(zza) || zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza) || zzby.DM_STALE_SYNC_REQUIRED.equals(zza) || zzby.DM_DEACTIVATED.equals(zza) || zzby.DM_REQUIRED.equals(zza) || zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza) || zzby.DM_SCREENLOCK_REQUIRED.equals(zza)) {
            zzdc.zzd(context);
            if (!zzht.zzc()) {
                throw new UserRecoverableAuthException(str2, intent);
            } else if (pendingIntent == null || intent == null) {
                if (a.o().a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
                    Integer valueOf = Integer.valueOf(a.e.API_PRIORITY_OTHER);
                    aVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", new Object[]{valueOf, str, valueOf}), new Object[0]);
                }
                if (intent == null) {
                    aVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", new Object[]{str2, str}), new Object[0]);
                }
                throw new UserRecoverableAuthException(str2, intent);
            } else {
                throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
            }
        } else if (zzby.NETWORK_ERROR.equals(zza) || zzby.SERVICE_UNAVAILABLE.equals(zza) || zzby.INTNERNAL_ERROR.equals(zza) || zzby.AUTH_SECURITY_ERROR.equals(zza) || zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
            throw new IOException(str2);
        } else {
            throw new d(str2);
        }
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f61183a;
            int i10 = 0;
            while (i10 < 3) {
                if (!strArr[i10].equals(account.type)) {
                    i10++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    private static boolean q(Context context) {
        if (com.google.android.gms.common.a.o().h(context, 17895000) != 0) {
            return false;
        }
        List<String> zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        for (String equals : zzq) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
