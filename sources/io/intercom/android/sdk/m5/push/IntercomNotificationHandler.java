package io.intercom.android.sdk.m5.push;

import Sg.p;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.n;
import androidx.core.app.r;
import androidx.core.app.u;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.ui.ConversationShortcutKt;
import io.intercom.android.sdk.m5.push.ui.ConversationStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.DeepLinkStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import mf.O;
import n1.C2258t;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJM\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00150\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J3\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010(R.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00158\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010+\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00103\u001a\n 2*\u0004\u0018\u000101018\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomNotificationHandler;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "deepLinkPushData", "Llf/M;", "processDeepLinkPushNotification", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;)V", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "conversationPushData", "", "timestamp", "Landroid/graphics/Bitmap;", "avatarBitmap", "Landroid/net/Uri;", "contentImageUri", "Lkotlin/Pair;", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "", "updateConversations", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;JLandroid/graphics/Bitmap;Landroid/net/Uri;)Lkotlin/Pair;", "conversations", "getOrCreateConversation", "(Landroid/content/Context;Ljava/util/List;Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;JLandroid/graphics/Bitmap;Landroid/net/Uri;)Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "intercomPushData", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "timeProvider", "processIntercomPushNotification$intercom_sdk_base_release", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/push/IntercomPushData;Lio/intercom/android/sdk/utilities/commons/TimeProvider;)V", "processIntercomPushNotification", "", "isSilent", "processConversationPushNotification$intercom_sdk_base_release", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;ZLio/intercom/android/sdk/utilities/commons/TimeProvider;)V", "processConversationPushNotification", "clear", "(Landroid/content/Context;)V", "setUpNotificationChannels$intercom_sdk_base_release", "setUpNotificationChannels", "Ljava/util/List;", "getConversations$intercom_sdk_base_release", "()Ljava/util/List;", "setConversations$intercom_sdk_base_release", "(Ljava/util/List;)V", "getConversations$intercom_sdk_base_release$annotations", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomNotificationHandler {
    public static final int $stable = 8;
    public static final IntercomNotificationHandler INSTANCE = new IntercomNotificationHandler();
    private static List<IntercomPushConversation> conversations = C6565s.n();
    private static final Twig twig = LumberMill.getLogger();

    private IntercomNotificationHandler() {
    }

    public static /* synthetic */ void getConversations$intercom_sdk_base_release$annotations() {
    }

    private final IntercomPushConversation getOrCreateConversation(Context context, List<IntercomPushConversation> list, IntercomPushData.ConversationPushData conversationPushData, long j10, Bitmap bitmap, Uri uri) {
        Object obj;
        List a10;
        String conversationTitle;
        String str;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6496s.c(((IntercomPushConversation) obj).getConversationId(), conversationPushData.getConversationId())) {
                break;
            }
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) obj;
        if (intercomPushConversation == null) {
            String conversationId = conversationPushData.getConversationId();
            String authorName = conversationPushData.getAuthorName();
            if (p.d0(authorName)) {
                authorName = context.getString(R.string.intercom_new_notifications);
                C6496s.g(authorName, "getString(...)");
            }
            return new IntercomPushConversation(conversationId, authorName, C6565s.e(ConversationStylePushUIKt.toMessage(conversationPushData, j10, bitmap, uri)));
        }
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) C6565s.B0(intercomPushConversation.getMessages());
        if (message == null || !message.isCurrentUser() || conversationPushData.isCurrentUser()) {
            List c10 = C6565s.c();
            c10.addAll(intercomPushConversation.getMessages());
            c10.add(ConversationStylePushUIKt.toMessage(conversationPushData, j10, bitmap, uri));
            a10 = C6565s.a(c10);
        } else {
            a10 = C6565s.e(ConversationStylePushUIKt.toMessage(conversationPushData, j10, bitmap, uri));
        }
        List list2 = a10;
        HashSet hashSet = new HashSet();
        ArrayList<IntercomPushConversation.Message> arrayList = new ArrayList<>();
        for (Object next : list2) {
            u person = ((IntercomPushConversation.Message) next).getPerson();
            if (person != null) {
                str = person.c();
            } else {
                str = null;
            }
            if (hashSet.add(str)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (IntercomPushConversation.Message person2 : arrayList) {
            u person3 = person2.getPerson();
            if (person3 != null) {
                arrayList2.add(person3);
            }
        }
        if (arrayList2.size() > 1) {
            conversationTitle = GroupConversationTextFormatter.groupConversationTitle(String.valueOf(((u) C6565s.z0(arrayList2)).d()), C6565s.p(arrayList2), context).toString();
        } else {
            conversationTitle = intercomPushConversation.getConversationTitle();
        }
        return IntercomPushConversation.copy$default(intercomPushConversation, (String) null, conversationTitle, list2, 1, (Object) null);
    }

    public static /* synthetic */ void processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData.ConversationPushData conversationPushData, boolean z10, TimeProvider timeProvider, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release(context, conversationPushData, z10, timeProvider);
    }

    /* access modifiers changed from: private */
    public static final C6514M processConversationPushNotification$lambda$4(Context context, IntercomPushData.ConversationPushData conversationPushData, TimeProvider timeProvider, boolean z10, Bitmap bitmap, Bitmap bitmap2) {
        Uri uri;
        NotificationChannel notificationChannel;
        C6496s.h(context, "$context");
        C6496s.h(conversationPushData, "$conversationPushData");
        C6496s.h(timeProvider, "$timeProvider");
        IntercomNotificationHandler intercomNotificationHandler = INSTANCE;
        long currentTimeMillis = timeProvider.currentTimeMillis();
        Notification notification = null;
        if (bitmap != null) {
            uri = IntercomPushBitmapUtilsKt.getBitmapUri(context, bitmap);
        } else {
            uri = null;
        }
        Pair<IntercomPushConversation, List<IntercomPushConversation>> updateConversations = intercomNotificationHandler.updateConversations(context, conversationPushData, currentTimeMillis, bitmap2, uri);
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) updateConversations.a();
        List list = (List) updateConversations.b();
        Pair<List<C2258t>, C2258t> createTemporaryShortcut = ConversationShortcutKt.createTemporaryShortcut(context, intercomPushConversation.getConversationId(), intercomPushConversation.getConversationTitle(), bitmap2);
        List list2 = (List) createTemporaryShortcut.a();
        C2258t tVar = (C2258t) createTemporaryShortcut.b();
        if (conversationPushData.isNewConversation()) {
            notificationChannel = NotificationChannel.NEW_CHATS_CHANNEL;
        } else {
            notificationChannel = NotificationChannel.CHAT_REPLIES_CHANNEL;
        }
        NotificationChannel notificationChannel2 = notificationChannel;
        Notification buildConversationStyleNotification = ConversationStylePushUIKt.buildConversationStyleNotification(context, intercomPushConversation, tVar, conversationPushData, notificationChannel2, z10);
        if (list.size() > 1) {
            notification = ConversationStylePushUIKt.buildConversationStyleSummaryNotification(context, list, notificationChannel2);
        }
        Map c10 = O.c();
        c10.put(Integer.valueOf(conversationPushData.getNotificationId()), buildConversationStyleNotification);
        if (notification != null) {
            c10.put(Integer.valueOf(ConversationStylePushUIKt.SUMMARY_NOTIFICATION_ID), notification);
        }
        NotificationPermissionCheckerKt.showNotifications(context, O.b(c10));
        Twig twig2 = twig;
        C6496s.g(twig2, "twig");
        ConversationShortcutKt.resetShortcuts(context, list2, tVar, twig2);
        return C6514M.f71813a;
    }

    private final void processDeepLinkPushNotification(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData) {
        twig.i("This is a push only message", new Object[0]);
        MetricTracker metricTracker = Injector.get().getMetricTracker();
        metricTracker.receivedPushOnlyNotification("instance_id:" + deepLinkPushData.getInstanceId(), deepLinkPushData.getInstanceId());
        IntercomPushBitmapUtilsKt.loadBitmaps$default(context, deepLinkPushData.getContentImageUrl(), (String) null, (String) null, new a(context, deepLinkPushData), 12, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M processDeepLinkPushNotification$lambda$0(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, Bitmap bitmap2) {
        C6496s.h(context, "$context");
        C6496s.h(deepLinkPushData, "$deepLinkPushData");
        NotificationPermissionCheckerKt.showNotification(context, deepLinkPushData.getNotificationId(), DeepLinkStylePushUIKt.buildDeepLinkNotification(context, deepLinkPushData, bitmap));
        return C6514M.f71813a;
    }

    public static /* synthetic */ void processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData intercomPushData, TimeProvider timeProvider, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release(context, intercomPushData, timeProvider);
    }

    private final synchronized Pair<IntercomPushConversation, List<IntercomPushConversation>> updateConversations(Context context, IntercomPushData.ConversationPushData conversationPushData, long j10, Bitmap bitmap, Uri uri) {
        IntercomPushConversation orCreateConversation;
        List<IntercomPushConversation> h12;
        orCreateConversation = getOrCreateConversation(context, conversations, conversationPushData, j10, bitmap, uri);
        h12 = C6565s.h1(conversations);
        C6565s.K(h12, new b(orCreateConversation));
        h12.add(orCreateConversation);
        conversations = h12;
        return C6502A.a(orCreateConversation, h12);
    }

    /* access modifiers changed from: private */
    public static final boolean updateConversations$lambda$6(IntercomPushConversation intercomPushConversation, IntercomPushConversation intercomPushConversation2) {
        C6496s.h(intercomPushConversation, "$conversation");
        C6496s.h(intercomPushConversation2, "it");
        return C6496s.c(intercomPushConversation2.getConversationId(), intercomPushConversation.getConversationId());
    }

    public final synchronized void clear(Context context) {
        try {
            C6496s.h(context, "context");
            if (!conversations.isEmpty()) {
                twig.i("Removing Intercom push notifications.", new Object[0]);
            }
            r.f(context).d();
            conversations = C6565s.n();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final List<IntercomPushConversation> getConversations$intercom_sdk_base_release() {
        return conversations;
    }

    public final void processConversationPushNotification$intercom_sdk_base_release(Context context, IntercomPushData.ConversationPushData conversationPushData, boolean z10, TimeProvider timeProvider) {
        String str;
        C6496s.h(context, "context");
        C6496s.h(conversationPushData, "conversationPushData");
        C6496s.h(timeProvider, "timeProvider");
        if (((HostAppState) Injector.get().getDataLayer().getHostAppState().getValue()).isBackgrounded()) {
            twig.i("This is a background push message", new Object[0]);
            Injector.get().getMetricTracker().receivedPushNotification(conversationPushData.getConversationId());
            if (conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Image) {
                str = ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getUrl();
            } else {
                str = "";
            }
            IntercomPushBitmapUtilsKt.loadBitmaps(context, str, conversationPushData.getAvatarUrl(), conversationPushData.getAuthorName(), new c(context, conversationPushData, timeProvider, z10));
            return;
        }
        twig.i("Intercom message received but not displayed in notification bar. This happened because the host app was in the foreground.", new Object[0]);
    }

    public final void processIntercomPushNotification$intercom_sdk_base_release(Context context, IntercomPushData intercomPushData, TimeProvider timeProvider) {
        C6496s.h(context, "context");
        C6496s.h(intercomPushData, "intercomPushData");
        C6496s.h(timeProvider, "timeProvider");
        if (intercomPushData instanceof IntercomPushData.DeepLinkPushData) {
            processDeepLinkPushNotification(context, (IntercomPushData.DeepLinkPushData) intercomPushData);
        } else if (intercomPushData instanceof IntercomPushData.ConversationPushData) {
            processConversationPushNotification$intercom_sdk_base_release$default(this, context, (IntercomPushData.ConversationPushData) intercomPushData, false, timeProvider, 4, (Object) null);
        } else {
            throw new C6535s();
        }
    }

    public final void setConversations$intercom_sdk_base_release(List<IntercomPushConversation> list) {
        C6496s.h(list, "<set-?>");
        conversations = list;
    }

    public final void setUpNotificationChannels$intercom_sdk_base_release(Context context) {
        C6496s.h(context, "context");
        n a10 = new n.c(NotificationChannel.CHAT_REPLIES_CHANNEL.getChannelName(), 4).c(context.getString(R.string.intercom_notification_channel_chat_replies_title)).b(context.getString(R.string.intercom_notification_channel_chat_replies_description)).a();
        C6496s.g(a10, "build(...)");
        n a11 = new n.c(NotificationChannel.NEW_CHATS_CHANNEL.getChannelName(), 4).c(context.getString(R.string.intercom_notification_channel_new_chats_title)).b(context.getString(R.string.intercom_notification_channel_new_chats_description)).a();
        C6496s.g(a11, "build(...)");
        n a12 = new n.c(NotificationChannel.ACTIONS_CHANNEL.getChannelName(), 4).c(context.getString(R.string.intercom_notification_channel_actions_title)).b(context.getString(R.string.intercom_notification_channel_actions_description)).a();
        C6496s.g(a12, "build(...)");
        r.f(context).e(C6565s.q(a10, a11, a12));
    }
}
