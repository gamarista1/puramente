package io.intercom.android.sdk.m5.push.ui;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.o;
import androidx.core.app.u;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "conversation", "Landroidx/core/app/o$e;", "getBubbleMetaData", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;)Landroidx/core/app/o$e;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BubbleMetaDataKt {
    public static final o.e getBubbleMetaData(Context context, IntercomPushConversation intercomPushConversation) {
        IconCompat iconCompat;
        u person;
        C6496s.h(context, "context");
        C6496s.h(intercomPushConversation, "conversation");
        PendingIntent activity = PendingIntent.getActivity(context, 2, ConversationScreenOpenerKt.getComposerIntent$default(context, (String) null, false, (ArticleMetadata) null, intercomPushConversation.getConversationId(), IntercomBubbleActivity.class, 2, (Object) null), 33554432);
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) C6565s.q0(intercomPushConversation.getMessages());
        if (message == null || (person = message.getPerson()) == null) {
            iconCompat = null;
        } else {
            iconCompat = person.b();
        }
        if (iconCompat == null) {
            iconCompat = IconCompat.d(context, R.drawable.intercom_ic_avatar_person);
            C6496s.g(iconCompat, "createWithResource(...)");
        }
        o.e.c d10 = new o.e.c(activity, iconCompat).b(600).d(true);
        C6496s.g(d10, "setSuppressNotification(...)");
        o.e a10 = d10.a();
        C6496s.g(a10, "build(...)");
        return a10;
    }
}
