package io.intercom.android.sdk.m5.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.w;
import androidx.work.C1838e;
import androidx.work.C1840g;
import androidx.work.E;
import androidx.work.t;
import androidx.work.v;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/push/ConversationReplyReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Llf/M;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationReplyReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    public void onReceive(Context context, Intent intent) {
        String string;
        String stringExtra;
        C6496s.h(context, "context");
        C6496s.h(intent, "intent");
        Bundle j10 = w.j(intent);
        if (j10 != null && (string = j10.getString(ConversationActionHandlerKt.KEY_TEXT_REPLY)) != null && (stringExtra = intent.getStringExtra(ConversationActionHandlerKt.KEY_CONVERSATION_ID)) != null) {
            C1840g a10 = new C1840g.a().e(ConversationActionHandlerKt.KEY_TEXT_REPLY, string).e(ConversationActionHandlerKt.KEY_CONVERSATION_ID, stringExtra).a();
            C6496s.g(a10, "build(...)");
            E.c(context).a(((v.a) ((v.a) new v.a(SendMessageWorker.class).j(a10)).h(new C1838e.a().b(t.CONNECTED).a())).a());
            IntercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, context, new IntercomPushData.ConversationPushData("", "", stringExtra, new IntercomPushData.ConversationPushData.MessageData.Text(string), true, false), true, (TimeProvider) null, 8, (Object) null);
        }
    }
}
