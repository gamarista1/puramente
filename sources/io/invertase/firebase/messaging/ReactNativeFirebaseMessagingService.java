package io.invertase.firebase.messaging;

import Ue.g;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.W;

public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    public void onDeletedMessages() {
        g.i().o(q.c());
    }

    public void onMessageReceived(W w10) {
    }

    public void onMessageSent(String str) {
        g.i().o(q.b(str));
    }

    public void onNewToken(String str) {
        g.i().o(q.d(str));
    }

    public void onSendError(String str, Exception exc) {
        g.i().o(q.a(str, exc));
    }
}
