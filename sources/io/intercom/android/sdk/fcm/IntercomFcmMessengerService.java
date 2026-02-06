package io.intercom.android.sdk.fcm;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.W;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.push.IntercomPushClient;
import java.util.Map;

public class IntercomFcmMessengerService extends FirebaseMessagingService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f68553a = 0;
    private static final IntercomPushClient pushClient = new IntercomPushClient();
    private static final Twig twig = LumberMill.getLogger();

    public static void initialize(Application application) {
        FirebaseMessaging.u().x().addOnCompleteListener(new a(application));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(Application application, Task task) {
        if (!task.isSuccessful()) {
            twig.w("Fetching FCM registration token failed", task.getException());
            return;
        }
        String str = (String) task.getResult();
        Twig twig2 = twig;
        twig2.internal("FCM registration token fetched: " + str);
        pushClient.sendTokenToIntercom(application, str);
    }

    public void onMessageReceived(W w10) {
        Twig twig2 = twig;
        twig2.d("Intercom push received: " + w10.p0(), new Object[0]);
        pushClient.handlePush(getApplication(), (Map<String, String>) w10.p0());
    }

    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            twig.e("Intercom push registration failed. Please make sure you have added a google-services.json file", new Object[0]);
        } else {
            pushClient.sendTokenToIntercom(getApplication(), str);
        }
    }
}
