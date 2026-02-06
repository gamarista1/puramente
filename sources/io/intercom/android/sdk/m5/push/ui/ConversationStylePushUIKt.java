package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import androidx.core.app.o;
import androidx.core.app.u;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import n1.C2258t;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001f\u001a\u00020\u001e*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00138\u0000XT¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00158\u0000XT¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroid/content/Context;", "context", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "conversation", "Ln1/t;", "shortcutInfo", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "conversationPushData", "Lio/intercom/android/sdk/m5/push/NotificationChannel;", "notificationChannel", "", "isSilent", "Landroid/app/Notification;", "buildConversationStyleNotification", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;Ln1/t;Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;Lio/intercom/android/sdk/m5/push/NotificationChannel;Z)Landroid/app/Notification;", "", "conversations", "buildConversationStyleSummaryNotification", "(Landroid/content/Context;Ljava/util/List;Lio/intercom/android/sdk/m5/push/NotificationChannel;)Landroid/app/Notification;", "", "messagesCount", "", "getMessagesContentText", "(Landroid/content/Context;I)Ljava/lang/String;", "", "timestamp", "Landroid/graphics/Bitmap;", "avatarBitmap", "Landroid/net/Uri;", "contentImageUri", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "toMessage", "(Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;JLandroid/graphics/Bitmap;Landroid/net/Uri;)Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "SUMMARY_NOTIFICATION_ID", "I", "KEY_GROUP_CONVERSATION", "Ljava/lang/String;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationStylePushUIKt {
    public static final String KEY_GROUP_CONVERSATION = "io.intercom.android.sdk.INTERCOM_KEY_GROUP_CONVERSATION";
    public static final int SUMMARY_NOTIFICATION_ID = 9999997;

    public static final Notification buildConversationStyleNotification(Context context, IntercomPushConversation intercomPushConversation, C2258t tVar, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z10) {
        C6496s.h(context, "context");
        C6496s.h(intercomPushConversation, "conversation");
        C6496s.h(conversationPushData, "conversationPushData");
        C6496s.h(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        C6496s.g(string, "getString(...)");
        String messagesContentText = getMessagesContentText(context, intercomPushConversation.getMessages().size());
        String string2 = context.getString(R.string.intercom_you);
        C6496s.g(string2, "getString(...)");
        o.h hVar = new o.h(new u.c().f(string2).a());
        for (IntercomPushConversation.Message message : intercomPushConversation.getMessages()) {
            o.h.d dVar = new o.h.d(message.getMessage(), message.getTimestamp(), message.getPerson());
            Uri contentImageUri = message.getContentImageUri();
            if (contentImageUri != null) {
                dVar.g("image/", contentImageUri);
            }
            hVar.h(dVar);
        }
        o.f m10 = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel).H(hVar).C(tVar).m(ConversationDeepLinkRouterKt.buildIntentForConversationScreen(context, intercomPushConversation.getConversationId()));
        int i10 = Build.VERSION.SDK_INT;
        m10.b(ConversationActionHandlerKt.buildReplyAction(context, intercomPushConversation.getConversationId()));
        if (conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Attachment) {
            m10.b(ConversationActionHandlerKt.buildContextualAction(context, ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getUrl()));
        }
        if (i10 >= 31) {
            m10.g(BubbleMetaDataKt.getBubbleMetaData(context, intercomPushConversation));
        }
        Notification c10 = m10.s(KEY_GROUP_CONVERSATION).E(z10).c();
        C6496s.g(c10, "build(...)");
        return c10;
    }

    public static final Notification buildConversationStyleSummaryNotification(Context context, List<IntercomPushConversation> list, NotificationChannel notificationChannel) {
        CharSequence d10;
        C6496s.h(context, "context");
        C6496s.h(list, "conversations");
        C6496s.h(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        C6496s.g(string, "getString(...)");
        Iterable<IntercomPushConversation> iterable = list;
        ArrayList arrayList = new ArrayList();
        for (IntercomPushConversation messages : iterable) {
            C6565s.D(arrayList, messages.getMessages());
        }
        String messagesContentText = getMessagesContentText(context, arrayList.size());
        o.g i10 = new o.g().i(string);
        C6496s.g(i10, "setBigContentTitle(...)");
        for (IntercomPushConversation messages2 : iterable) {
            for (IntercomPushConversation.Message message : messages2.getMessages()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                u person = message.getPerson();
                if (!(person == null || (d10 = person.d()) == null)) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(d10);
                    sb2.append(' ');
                    spannableStringBuilder.append(sb2.toString());
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                }
                spannableStringBuilder.append(message.getMessage());
                i10.h(new SpannedString(spannableStringBuilder));
            }
        }
        Notification c10 = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel).m(ConversationDeepLinkRouterKt.buildIntentForMessagesScreen(context)).s(KEY_GROUP_CONVERSATION).t(true).H(i10).c();
        C6496s.g(c10, "build(...)");
        return c10;
    }

    private static final String getMessagesContentText(Context context, int i10) {
        String str;
        if (i10 == 1) {
            str = context.getString(R.string.intercom_one_new_message);
        } else {
            str = Phrase.from(context, R.string.intercom_new_messages).put("n", i10).format().toString();
        }
        C6496s.e(str);
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.core.app.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.core.graphics.drawable.IconCompat} */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.core.app.u] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.intercom.android.sdk.m5.push.ui.IntercomPushConversation.Message toMessage(io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData r8, long r9, android.graphics.Bitmap r11, android.net.Uri r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            boolean r0 = r8.isCurrentUser()
            r1 = 0
            if (r0 == 0) goto L_0x000e
        L_0x000c:
            r3 = r1
            goto L_0x0045
        L_0x000e:
            androidx.core.app.u$c r0 = new androidx.core.app.u$c
            r0.<init>()
            java.lang.String r2 = r8.getAuthorName()
            androidx.core.app.u$c r0 = r0.f(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r8.getAuthorName()
            r2.append(r3)
            java.lang.String r3 = r8.getAvatarUrl()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.core.app.u$c r0 = r0.e(r2)
            if (r11 == 0) goto L_0x003c
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.c(r11)
        L_0x003c:
            androidx.core.app.u$c r11 = r0.c(r1)
            androidx.core.app.u r1 = r11.a()
            goto L_0x000c
        L_0x0045:
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData r11 = r8.getMessageData()
            boolean r0 = r11 instanceof io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData.Text
            if (r0 == 0) goto L_0x0059
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData r8 = r8.getMessageData()
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData$Text r8 = (io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData.Text) r8
            java.lang.String r8 = r8.getMessage()
        L_0x0057:
            r6 = r8
            goto L_0x0077
        L_0x0059:
            boolean r0 = r11 instanceof io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData.Image
            if (r0 == 0) goto L_0x0068
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData r8 = r8.getMessageData()
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData$Image r8 = (io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData.Image) r8
            java.lang.String r8 = r8.getTitle()
            goto L_0x0057
        L_0x0068:
            boolean r11 = r11 instanceof io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData.Attachment
            if (r11 == 0) goto L_0x0080
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData r8 = r8.getMessageData()
            io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData$MessageData$Attachment r8 = (io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData.Attachment) r8
            java.lang.String r8 = r8.getTitle()
            goto L_0x0057
        L_0x0077:
            io.intercom.android.sdk.m5.push.ui.IntercomPushConversation$Message r8 = new io.intercom.android.sdk.m5.push.ui.IntercomPushConversation$Message
            r2 = r8
            r4 = r9
            r7 = r12
            r2.<init>(r3, r4, r6, r7)
            return r8
        L_0x0080:
            lf.s r8 = new lf.s
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.push.ui.ConversationStylePushUIKt.toMessage(io.intercom.android.sdk.m5.push.IntercomPushData$ConversationPushData, long, android.graphics.Bitmap, android.net.Uri):io.intercom.android.sdk.m5.push.ui.IntercomPushConversation$Message");
    }

    public static /* synthetic */ IntercomPushConversation.Message toMessage$default(IntercomPushData.ConversationPushData conversationPushData, long j10, Bitmap bitmap, Uri uri, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bitmap = null;
        }
        if ((i10 & 4) != 0) {
            uri = null;
        }
        return toMessage(conversationPushData, j10, bitmap, uri);
    }
}
