package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaek  reason: invalid package */
public class zzaek implements zzacu<zzaek> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaek";
    private String zzb;
    private int zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR));
            this.zzc = jSONObject.getInt("code");
            this.zzb = jSONObject.getString(MetricTracker.Object.MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e10) {
            String str2 = zza;
            String message = e10.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzaah("Failed to parse error for string [" + str + "]", e10);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
