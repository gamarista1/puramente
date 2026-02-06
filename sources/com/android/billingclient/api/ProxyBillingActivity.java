package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f38161a;

    /* renamed from: b  reason: collision with root package name */
    private ResultReceiver f38162b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38163c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38164d;

    /* renamed from: e  reason: collision with root package name */
    private int f38165e;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 100
            r1 = 0
            r2 = 0
            r3 = 110(0x6e, float:1.54E-43)
            java.lang.String r4 = "ProxyBillingActivity"
            if (r8 == r0) goto L_0x0043
            if (r8 != r3) goto L_0x0010
            goto L_0x0043
        L_0x0010:
            r9 = 101(0x65, float:1.42E-43)
            if (r8 != r9) goto L_0x0028
            int r8 = com.google.android.gms.internal.play_billing.zze.zza(r10, r4)
            android.os.ResultReceiver r9 = r7.f38162b
            if (r9 == 0) goto L_0x00f6
            if (r10 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            android.os.Bundle r2 = r10.getExtras()
        L_0x0023:
            r9.send(r8, r2)
            goto L_0x00f6
        L_0x0028:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Got onActivityResult with wrong requestCode: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = "; skipping..."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.google.android.gms.internal.play_billing.zze.zzl(r4, r8)
            goto L_0x00f6
        L_0x0043:
            com.android.billingclient.api.e r0 = com.google.android.gms.internal.play_billing.zze.zzf(r10, r4)
            int r0 = r0.b()
            r5 = -1
            if (r9 != r5) goto L_0x0054
            if (r0 == 0) goto L_0x0052
            r9 = r5
            goto L_0x0054
        L_0x0052:
            r0 = r1
            goto L_0x0070
        L_0x0054:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Activity finished with resultCode "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = " and billing's responseCode: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r9 = r5.toString()
            com.google.android.gms.internal.play_billing.zze.zzl(r4, r9)
        L_0x0070:
            android.os.ResultReceiver r9 = r7.f38161a
            if (r9 == 0) goto L_0x0080
            if (r10 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            android.os.Bundle r2 = r10.getExtras()
        L_0x007b:
            r9.send(r0, r2)
            goto L_0x00f6
        L_0x0080:
            if (r10 == 0) goto L_0x00e7
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r0 = "LAUNCH_BILLING_FLOW"
            java.lang.String r2 = "INTENT_SOURCE"
            if (r9 == 0) goto L_0x00af
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r4 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r9 = r9.getString(r4)
            if (r9 == 0) goto L_0x00a0
            android.content.Intent r9 = r7.a(r9)
            r9.putExtra(r2, r0)
            goto L_0x00eb
        L_0x00a0:
            android.content.Intent r9 = r7.b()
            android.os.Bundle r10 = r10.getExtras()
            r9.putExtras(r10)
            r9.putExtra(r2, r0)
            goto L_0x00eb
        L_0x00af:
            android.content.Intent r9 = r7.b()
            java.lang.String r10 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zze.zzl(r4, r10)
            java.lang.String r10 = "RESPONSE_CODE"
            r4 = 6
            r9.putExtra(r10, r4)
            java.lang.String r10 = "DEBUG_MESSAGE"
            java.lang.String r5 = "An internal error occurred."
            r9.putExtra(r10, r5)
            com.android.billingclient.api.e$a r10 = com.android.billingclient.api.C3198e.c()
            r10.c(r4)
            r10.b(r5)
            com.android.billingclient.api.e r10 = r10.a()
            r4 = 22
            r5 = 2
            com.google.android.gms.internal.play_billing.zzjz r10 = com.android.billingclient.api.M.b(r4, r5, r10)
            byte[] r10 = r10.zzh()
            java.lang.String r4 = "FAILURE_LOGGING_PAYLOAD"
            r9.putExtra(r4, r10)
            r9.putExtra(r2, r0)
            goto L_0x00eb
        L_0x00e7:
            android.content.Intent r9 = r7.b()
        L_0x00eb:
            if (r8 != r3) goto L_0x00f3
            java.lang.String r8 = "IS_FIRST_PARTY_PURCHASE"
            r10 = 1
            r9.putExtra(r8, r10)
        L_0x00f3:
            r7.sendBroadcast(r9)
        L_0x00f6:
            r7.f38163c = r1
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f38165e = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f38164d = true;
                    this.f38165e = 110;
                }
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f38161a = (ResultReceiver) getIntent().getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f38162b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.f38165e = 101;
            } else {
                pendingIntent = null;
            }
            try {
                this.f38163c = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f38165e, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
                ResultReceiver resultReceiver = this.f38161a;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.f38162b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent b10 = b();
                        if (this.f38164d) {
                            b10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        b10.putExtra("RESPONSE_CODE", 6);
                        b10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(b10);
                    }
                }
                this.f38163c = false;
                finish();
            }
        } else {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f38163c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER)) {
                this.f38161a = (ResultReceiver) bundle.getParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f38162b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f38164d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f38165e = bundle.getInt("activity_code", 100);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f38163c) {
            Intent b10 = b();
            b10.putExtra("RESPONSE_CODE", 1);
            b10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i10 = this.f38165e;
            if (i10 == 110 || i10 == 100) {
                b10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f38161a;
        if (resultReceiver != null) {
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f38162b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f38163c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f38164d);
        bundle.putInt("activity_code", this.f38165e);
    }
}
