package com.google.android.gms.internal.play_billing;

import J4.C3043i;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.android.billingclient.api.C3198e;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class zze {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzl("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            zzl(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static Bundle zzc(Bundle bundle, String str, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle zzd(boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j10);
        if (z10 && z12) {
            bundle.putBoolean(b.f37472ac, true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zze(String str, long j10) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j10);
        return bundle;
    }

    public static C3198e zzf(Intent intent, String str) {
        if (intent == null) {
            zzl("BillingHelper", "Got null intent!");
            C3198e.a c10 = C3198e.c();
            c10.c(6);
            c10.b("An internal error occurred.");
            return c10.a();
        }
        C3198e.a c11 = C3198e.c();
        c11.c(zzb(intent.getExtras(), str));
        c11.b(zzh(intent.getExtras(), str));
        return c11.a();
    }

    public static C3043i zzg(Bundle bundle, String str) {
        if (bundle == null) {
            return new C3043i(0, (String) null);
        }
        return new C3043i(zzp(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static String zzi(int i10) {
        return zzd.zza(i10).toString();
    }

    public static List zzj(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq);
        } else {
            int size = stringArrayList.size();
            zzk("BillingHelper", "Found purchase list of " + size + " items");
            int i10 = 0;
            while (i10 < stringArrayList.size() && i10 < stringArrayList2.size()) {
                Purchase zzq2 = zzq(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (zzq2 != null) {
                    arrayList.add(zzq2);
                }
                i10++;
            }
        }
        return arrayList;
    }

    public static void zzk(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (!str2.isEmpty()) {
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i10 -= min;
            }
            return;
        }
        Log.v(str, str2);
    }

    public static void zzl(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzm(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle zzn(C3198e eVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", eVar.b());
        bundle.putString("DEBUG_MESSAGE", eVar.a());
        bundle.putInt("LOG_REASON", i10 - 1);
        return bundle;
    }

    public static Bundle zzo(C3198e eVar, int i10, String str) {
        Bundle zzn = zzn(eVar, 5);
        if (str != null) {
            zzn.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return zzn;
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzl(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzq(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
