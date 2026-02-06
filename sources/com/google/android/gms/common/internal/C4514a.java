package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C4529k;

/* renamed from: com.google.android.gms.common.internal.a  reason: case insensitive filesystem */
public abstract class C4514a extends C4529k.a {
    public static Account b(C4529k kVar) {
        Account account = null;
        if (kVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = kVar.zzb();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th2;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
