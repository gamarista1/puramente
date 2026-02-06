package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C4495g;
import com.google.android.gms.common.internal.C4536s;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    protected int f53903a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f53903a = 1;
            } catch (ActivityNotFoundException e10) {
                if (extras.getBoolean("notify_manager", true)) {
                    C4495g.u(this).F(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", str, e10);
                }
                this.f53903a = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                finish();
            }
        } else {
            a.o().q(this, ((Integer) C4536s.l(num)).intValue(), 2, this);
            this.f53903a = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f53903a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C4495g u10 = C4495g.u(this);
                if (i11 == -1) {
                    u10.G();
                } else if (i11 == 0) {
                    u10.F(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f53903a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f53903a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f53903a = bundle.getInt("resolution");
        }
        if (this.f53903a != 1) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f53903a);
        super.onSaveInstanceState(bundle);
    }
}
