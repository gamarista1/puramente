package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.k  reason: case insensitive filesystem */
public interface C4529k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends zzb implements C4529k {
        public static C4529k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C4529k) {
                return (C4529k) queryLocalInterface;
            }
            return new C0(iBinder);
        }
    }

    Account zzb();
}
