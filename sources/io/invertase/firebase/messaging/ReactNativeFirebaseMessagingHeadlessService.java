package io.invertase.firebase.messaging;

import P7.a;
import Ue.i;
import android.content.Intent;
import com.facebook.react.C3361g;
import com.google.firebase.messaging.W;
import io.intercom.android.sdk.metrics.MetricTracker;

public class ReactNativeFirebaseMessagingHeadlessService extends C3361g {
    /* access modifiers changed from: protected */
    public a j(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new a("ReactNativeFirebaseMessagingHeadlessTask", q.i((W) intent.getParcelableExtra(MetricTracker.Object.MESSAGE)), i.g().e("messaging_android_headless_task_timeout", 60000), true);
    }
}
