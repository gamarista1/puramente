package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import xa.C5268a;
import xa.C5270c;

public class FirebaseMessagingService extends C4828i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C5270c rpc;

    private boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        }
    }

    private void h(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (N.t(extras)) {
            N n10 = new N(extras);
            ExecutorService e10 = C4834o.e();
            try {
                if (!new C4825f(this, n10, e10).a()) {
                    e10.shutdown();
                    if (L.E(intent)) {
                        L.w(intent);
                    }
                } else {
                    return;
                }
            } finally {
                e10.shutdown();
            }
        }
        onMessageReceived(new W(extras));
    }

    private String i(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private C5270c j(Context context) {
        if (this.rpc == null) {
            this.rpc = new C5270c(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void k(Intent intent) {
        if (!g(intent.getStringExtra("google.message_id"))) {
            l(intent);
        }
        j(this).b(new C5268a(intent));
    }

    private void l(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                L.y(intent);
                h(intent);
                return;
            case 2:
                onSendError(i(intent), new a0(intent.getStringExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR)));
                return;
            case 3:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    /* access modifiers changed from: protected */
    public Intent getStartCommandIntent(Intent intent) {
        return b0.b().c();
    }

    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            k(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(W w10) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    /* access modifiers changed from: package-private */
    public void setRpcForTesting(C5270c cVar) {
        this.rpc = cVar;
    }
}
