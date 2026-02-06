package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f56455a;

    private final void a() {
        ResultReceiver resultReceiver = this.f56455a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && (resultReceiver = this.f56455a) != null) {
            if (i11 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i11 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f56455a = (ResultReceiver) getIntent().getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                a();
                finish();
            }
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                a();
                finish();
            }
        } else {
            this.f56455a = (ResultReceiver) bundle.getParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, this.f56455a);
    }
}
