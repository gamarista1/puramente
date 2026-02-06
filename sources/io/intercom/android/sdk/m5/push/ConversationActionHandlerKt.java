package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.o;
import androidx.core.app.w;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u001a\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\t\"\u0014\u0010\r\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "context", "", "conversationId", "Landroidx/core/app/o$b;", "buildReplyAction", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/core/app/o$b;", "Landroid/app/PendingIntent;", "getReplyIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "url", "buildContextualAction", "getAttachmentIntent", "KEY_TEXT_REPLY", "Ljava/lang/String;", "KEY_CONVERSATION_ID", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationActionHandlerKt {
    public static final String KEY_CONVERSATION_ID = "io.intercom.android.sdk.INTERCOM_KEY_CONVERSATION_ID";
    public static final String KEY_TEXT_REPLY = "io.intercom.android.sdk.INTERCOM_KEY_TEXT_REPLY";

    public static final o.b buildContextualAction(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "url");
        IconCompat d10 = IconCompat.d(context, R.drawable.intercom_ic_attachment);
        C6496s.g(d10, "createWithResource(...)");
        o.b b10 = new o.b.a(d10, (CharSequence) "Open Attachment", getAttachmentIntent(context, str)).e(true).b();
        C6496s.g(b10, "build(...)");
        return b10;
    }

    public static final o.b buildReplyAction(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "conversationId");
        w a10 = new w.d(KEY_TEXT_REPLY).b(context.getString(R.string.intercom_reply)).a();
        C6496s.g(a10, "build(...)");
        o.b b10 = new o.b.a(io.intercom.android.sdk.ui.R.drawable.intercom_send, (CharSequence) context.getString(R.string.intercom_reply), getReplyIntent(context, str)).a(a10).b();
        C6496s.g(b10, "build(...)");
        return b10;
    }

    private static final PendingIntent getAttachmentIntent(Context context, String str) {
        int hashCode = str.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 201326592);
        C6496s.g(activity, "getActivity(...)");
        return activity;
    }

    private static final PendingIntent getReplyIntent(Context context, String str) {
        int i10;
        int hashCode = str.hashCode();
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent(context, ConversationReplyReceiver.class);
        intent.putExtra(KEY_CONVERSATION_ID, str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, hashCode, intent, i10);
        C6496s.g(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
