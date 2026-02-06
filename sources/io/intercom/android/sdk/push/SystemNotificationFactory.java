package io.intercom.android.sdk.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.core.app.o;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.List;

class SystemNotificationFactory {
    private static final String CONVERSATION_URI = "conversation_id=%s";
    private static final String INTERCOM_SDK_PUSH = "intercom_sdk_push";
    private static final Twig twig = LumberMill.getLogger();

    SystemNotificationFactory() {
    }

    private String getConversationChannelId(PushPayload pushPayload) {
        if (pushPayload.isFirstPart()) {
            return SystemNotificationManager.NEW_CHATS_CHANNEL;
        }
        return SystemNotificationManager.CHAT_REPLIES_CHANNEL;
    }

    private CharSequence groupMessageBody(PushPayload pushPayload) {
        String message = pushPayload.getMessage();
        if (!TextUtils.isEmpty(message)) {
            return message;
        }
        return pushPayload.getAuthorName() + ": " + pushPayload.getBody();
    }

    /* access modifiers changed from: package-private */
    public o.f baseNotificationBuilder(Context context, String str, AppConfig appConfig, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        if (DeviceUtils.hasPermission(context, "android.permission.VIBRATE")) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int primaryColor = appConfig.getPrimaryColor();
        o.f p10 = new o.f(context, str).n(charSequence).o(charSequence2).F(R.drawable.intercom_push_icon).h("msg").f(true).j(primaryColor).v(primaryColor, 500, 2000).m(pendingIntent).q(pendingIntent2).p(1 | i10);
        if (bitmap != null) {
            p10.H(new o.c().i(bitmap).j(charSequence2).k(charSequence).h((Bitmap) null));
            p10.u(bitmap);
        } else {
            p10.H(new o.d().i(charSequence2).h(charSequence));
        }
        return p10;
    }

    /* access modifiers changed from: package-private */
    public o.f createBuilder(Context context, Uri uri, String str, String str2, int i10, String str3, AppConfig appConfig, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        int i11 = i10;
        Intent intent = new Intent(context, IntercomPushTrampolineActivity.class);
        Intent component = new Intent("io.intercom.android.sdk.INTERCOM_PUSH_DISMISSED").setComponent(new ComponentName(context, IntercomPushBroadcastReceiver.class));
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent();
            Twig twig2 = twig;
            twig2.e("Couldn't get launch Intent for package '" + packageName + "' - tapping on notification will do nothing", new Object[0]);
        } else {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            Uri uri2 = uri;
            launchIntentForPackage.setData(uri);
            launchIntentForPackage.putExtra(IntercomPushManager.INTERCOM_PUSH_KEY, INTERCOM_SDK_PUSH);
            if (str4 != null) {
                launchIntentForPackage.putExtra(IntercomPushManager.PUSH_ONLY_CONVO_ID, str);
            }
            if (str5 != null) {
                launchIntentForPackage.putExtra(IntercomPushManager.PUSH_ONLY_INSTANCE_ID, str2);
            }
        }
        intent.putExtra(IntercomPushManager.HOST_APP_INTENT, launchIntentForPackage);
        component.putExtra(IntercomPushManager.HOST_APP_INTENT, launchIntentForPackage);
        return baseNotificationBuilder(context, str3, appConfig, PendingIntent.getActivity(context, i10, intent, 201326592), PendingIntent.getBroadcast(context, i10, component, 201326592), bitmap, charSequence, charSequence2);
    }

    /* access modifiers changed from: package-private */
    public Notification createGroupedNotification(List<PushPayload> list, Context context, AppConfig appConfig) {
        CharSequence format;
        List<PushPayload> list2 = list;
        Context context2 = context;
        Uri parse = Uri.parse("intercom_sdk/multiple_notifications");
        if (list.size() == 1) {
            format = context2.getString(R.string.intercom_one_new_message);
        } else {
            format = Phrase.from(context2, R.string.intercom_new_messages).put("n", list.size()).format();
        }
        CharSequence charSequence = format;
        o.g gVar = new o.g();
        gVar.i(context2.getString(R.string.intercom_new_notifications));
        for (PushPayload next : list) {
            SpannableString spannableString = new SpannableString(groupMessageBody(next));
            spannableString.setSpan(new StyleSpan(1), 0, next.getAuthorName().length(), 33);
            gVar.h(spannableString);
        }
        return createBuilder(context, parse, (String) null, (String) null, -1, getConversationChannelId(list2.get(list.size() - 1)), appConfig, (Bitmap) null, charSequence, context2.getString(R.string.intercom_new_notifications)).A(list2.get(list.size() - 1).getPriority()).H(gVar).c();
    }

    /* access modifiers changed from: package-private */
    public Notification createPushOnlyNotification(PushPayload pushPayload, Context context, AppConfig appConfig, Bitmap bitmap) {
        int hashCode;
        String pushOnlyConversationId = pushPayload.getPushOnlyConversationId();
        String instanceId = pushPayload.getInstanceId();
        if (TextUtils.isEmpty(instanceId)) {
            hashCode = pushOnlyConversationId.hashCode();
        } else {
            hashCode = instanceId.hashCode();
        }
        int i10 = hashCode;
        String messageOrBody = pushPayload.messageOrBody();
        CharSequence title = getTitle(context, pushPayload);
        return createBuilder(context, Uri.parse(pushPayload.getUri()), pushOnlyConversationId, instanceId, i10, SystemNotificationManager.ACTIONS_CHANNEL, appConfig, bitmap, messageOrBody, title).A(pushPayload.getPriority()).c();
    }

    /* access modifiers changed from: package-private */
    public Notification createSingleNotification(PushPayload pushPayload, Context context, AppConfig appConfig, Bitmap bitmap, Bitmap bitmap2) {
        PushPayload pushPayload2 = pushPayload;
        return createBuilder(context, Uri.parse(String.format("intercom_sdk/conversation_id=%s", new Object[]{pushPayload.getConversationId()})), (String) null, (String) null, -1, getConversationChannelId(pushPayload), appConfig, bitmap2, pushPayload.getBody(), getTitle(context, pushPayload)).A(pushPayload.getPriority()).u(bitmap).c();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"PrivateResource"})
    public CharSequence getTitle(Context context, PushPayload pushPayload) {
        String title = pushPayload.getTitle();
        if (!title.isEmpty()) {
            return title;
        }
        String authorName = pushPayload.getAuthorName();
        String appName = pushPayload.getAppName();
        if (!authorName.isEmpty() && !appName.isEmpty()) {
            return Phrase.from(context, R.string.intercom_teammate_from_company).put("name", (CharSequence) authorName).put("company", (CharSequence) appName).format();
        }
        if (authorName.isEmpty()) {
            return appName;
        }
        return authorName;
    }
}
