package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C3198e;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;

abstract class W {
    static V a(Bundle bundle, String str, String str2) {
        C3198e eVar = O.f38143k;
        if (bundle == null) {
            zze.zzl("BillingClient", String.format("%s got null owned items list", new Object[]{str2}));
            return new V(eVar, 54);
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        String zzh = zze.zzh(bundle, "BillingClient");
        C3198e.a c10 = C3198e.c();
        c10.c(zzb);
        c10.b(zzh);
        C3198e a10 = c10.a();
        if (zzb != 0) {
            zze.zzl("BillingClient", String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(zzb)}));
            return new V(a10, 23);
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zze.zzl("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2}));
            return new V(eVar, 55);
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zze.zzl("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2}));
                return new V(eVar, 56);
            } else if (stringArrayList2 == null) {
                zze.zzl("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2}));
                return new V(eVar, 57);
            } else if (stringArrayList3 != null) {
                return new V(O.f38144l, 1);
            } else {
                zze.zzl("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2}));
                return new V(eVar, 58);
            }
        }
    }
}
