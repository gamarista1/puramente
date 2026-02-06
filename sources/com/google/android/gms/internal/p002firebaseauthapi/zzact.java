package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4533o;
import com.revenuecat.purchases.common.UtilsKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzact  reason: invalid package */
public final class zzact {
    private final int zza;

    private zzact(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza2 = zzac.zza("[.-]").zza((CharSequence) str);
            if (zza2.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza2.size() >= 3) {
                return (Integer.parseInt(zza2.get(0)) * UtilsKt.MICROS_MULTIPLIER) + (Integer.parseInt(zza2.get(1)) * 1000) + Integer.parseInt(zza2.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e10}));
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", new Object[]{Integer.toString(this.zza)});
    }

    public static zzact zza() {
        String b10 = C4533o.a().b("firebase-auth");
        if (TextUtils.isEmpty(b10) || b10.equals("UNKNOWN")) {
            b10 = CreateTicketViewModelKt.EmailId;
        }
        return new zzact(b10);
    }
}
