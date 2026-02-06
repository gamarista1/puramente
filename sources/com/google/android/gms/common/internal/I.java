package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.C4498j;

public abstract class I implements DialogInterface.OnClickListener {
    public static I b(Activity activity, Intent intent, int i10) {
        return new G(intent, activity, i10);
    }

    public static I c(C4498j jVar, Intent intent, int i10) {
        return new H(intent, jVar, 2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            a();
        } catch (ActivityNotFoundException e10) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e10);
        } catch (Throwable th2) {
            dialogInterface.dismiss();
            throw th2;
        }
        dialogInterface.dismiss();
    }
}
