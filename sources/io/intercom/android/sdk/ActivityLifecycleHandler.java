package io.intercom.android.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;

class ActivityLifecycleHandler extends Handler {
    private static final int ESTIMATED_ACTIVITY_TRANSITION_DURATION_MS = 500;
    static final int PAUSED_CODE = 2;
    static final int READY_FOR_VIEW_CODE = 1;
    static final int RESUMED_CODE = 0;
    static final int STOPPED_CODE = 3;
    private final IntercomDataLayer dataLayer;
    private final long readyForViewDelayMs;
    private final Twig twig = LumberMill.getLogger();

    ActivityLifecycleHandler(Looper looper, float f10, IntercomDataLayer intercomDataLayer) {
        super(looper);
        this.readyForViewDelayMs = (long) (f10 * 500.0f);
        this.dataLayer = intercomDataLayer;
    }

    static Message getMessage(int i10, Activity activity) {
        Message obtain = Message.obtain();
        obtain.what = i10;
        obtain.obj = activity;
        return obtain;
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity) message.obj;
        int i10 = message.what;
        if (i10 == 0) {
            sendMessageAfterDelay(getMessage(1, activity), this.readyForViewDelayMs);
        } else if (i10 == 1) {
            Twig twig2 = this.twig;
            twig2.i("Ready to show in-app messages in " + activity, new Object[0]);
            this.dataLayer.emitEvent(new IntercomEvent.ActivityReadyForViewAttachment(activity));
            this.dataLayer.activityReadyForViewAttachment(activity);
        } else if (i10 == 2) {
            Twig twig3 = this.twig;
            twig3.i(activity + " was paused", new Object[0]);
            this.dataLayer.emitEvent(new IntercomEvent.ActivityPaused(activity));
            this.dataLayer.activityPaused(activity);
        } else if (i10 == 3) {
            this.dataLayer.emitEvent(new IntercomEvent.ActivityStopped(activity));
            this.dataLayer.activityStopped(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public void sendMessageAfterDelay(Message message, long j10) {
        sendMessageDelayed(message, j10);
    }
}
