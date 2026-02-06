package io.intercom.android.sdk.push;

import Sg.p;
import Ug.C5585o0;
import Ug.C5600w0;
import Ug.M;
import Ug.Z;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import com.tanguyantoine.react.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import j4.C3622i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import m4.C3773b;
import mf.C6565s;
import qf.C6658d;
import s5.i;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016JC\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\n )*\u0004\u0018\u00010(0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lio/intercom/android/sdk/push/SystemNotificationManager;", "", "Landroid/app/NotificationManager;", "androidNotificationManager", "Lio/intercom/android/sdk/push/SystemNotificationFactory;", "systemNotificationFactory", "<init>", "(Landroid/app/NotificationManager;Lio/intercom/android/sdk/push/SystemNotificationFactory;)V", "(Landroid/app/NotificationManager;)V", "Landroid/content/Context;", "context", "Llf/M;", "setUpNotificationChannels", "(Landroid/content/Context;)V", "setUpNotificationChannelsIfSupported", "clear", "()V", "Lio/intercom/android/sdk/push/PushPayload;", "payload", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "createPushOnlyNotification", "(Lio/intercom/android/sdk/push/PushPayload;Landroid/content/Context;Lio/intercom/android/sdk/identity/AppConfig;)V", "createNotification", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "onComplete", "downloadImages", "(Lio/intercom/android/sdk/push/PushPayload;Landroid/content/Context;Lio/intercom/android/sdk/identity/AppConfig;Lyf/p;)V", "downloadContentImage", "(Lio/intercom/android/sdk/push/PushPayload;Landroid/content/Context;Lio/intercom/android/sdk/identity/AppConfig;)Landroid/graphics/Bitmap;", "generateAvatar", "Landroid/app/NotificationManager;", "Lio/intercom/android/sdk/push/SystemNotificationFactory;", "", "receivedPayloads", "Ljava/util/List;", "getReceivedPayloads", "()Ljava/util/List;", "getReceivedPayloads$annotations", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "twig", "Lcom/intercom/twig/Twig;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SystemNotificationManager {
    public static final int $stable = 8;
    public static final String ACTIONS_CHANNEL = "intercom_actions_channel";
    public static final String CHAT_REPLIES_CHANNEL = "intercom_chat_replies_channel";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final float LARGE_ICON_SIZE_IN_DP = 48.0f;
    public static final String NEW_CHATS_CHANNEL = "intercom_new_chats_channel";
    private static final int NOTIFICATION_ID = 9999997;
    private final NotificationManager androidNotificationManager;
    private final List<PushPayload> receivedPayloads;
    private final SystemNotificationFactory systemNotificationFactory;
    private final Twig twig;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/push/SystemNotificationManager$Companion;", "", "<init>", "()V", "NOTIFICATION_ID", "", "LARGE_ICON_SIZE_IN_DP", "", "CHAT_REPLIES_CHANNEL", "", "NEW_CHATS_CHANNEL", "ACTIONS_CHANNEL", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SystemNotificationManager(NotificationManager notificationManager, SystemNotificationFactory systemNotificationFactory2) {
        C6496s.h(notificationManager, "androidNotificationManager");
        C6496s.h(systemNotificationFactory2, "systemNotificationFactory");
        this.androidNotificationManager = notificationManager;
        this.systemNotificationFactory = systemNotificationFactory2;
        List<PushPayload> synchronizedList = Collections.synchronizedList(new ArrayList());
        C6496s.g(synchronizedList, "synchronizedList(...)");
        this.receivedPayloads = synchronizedList;
        this.twig = LumberMill.getLogger();
    }

    /* access modifiers changed from: private */
    public static final C6514M createNotification$lambda$1(SystemNotificationManager systemNotificationManager, PushPayload pushPayload, Context context, AppConfig appConfig, Bitmap bitmap, Bitmap bitmap2) {
        C6496s.h(systemNotificationManager, "this$0");
        C6496s.h(pushPayload, "$payload");
        C6496s.h(context, "$context");
        C6496s.h(appConfig, "$appConfig");
        systemNotificationManager.androidNotificationManager.notify(9999997, systemNotificationManager.systemNotificationFactory.createSingleNotification(pushPayload, context, appConfig, bitmap, bitmap2));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M createPushOnlyNotification$lambda$0(SystemNotificationManager systemNotificationManager, PushPayload pushPayload, Context context, AppConfig appConfig, Bitmap bitmap, Bitmap bitmap2) {
        C6496s.h(systemNotificationManager, "this$0");
        C6496s.h(pushPayload, "$payload");
        C6496s.h(context, "$context");
        C6496s.h(appConfig, "$appConfig");
        Notification createPushOnlyNotification = systemNotificationManager.systemNotificationFactory.createPushOnlyNotification(pushPayload, context, appConfig, bitmap2);
        String pushOnlyConversationId = pushPayload.getPushOnlyConversationId();
        systemNotificationManager.androidNotificationManager.notify(pushOnlyConversationId, pushOnlyConversationId.hashCode(), createPushOnlyNotification);
        return C6514M.f71813a;
    }

    public static /* synthetic */ void getReceivedPayloads$annotations() {
    }

    @TargetApi(26)
    private final void setUpNotificationChannels(Context context) {
        h.a();
        NotificationChannel a10 = i.a(CHAT_REPLIES_CHANNEL, context.getString(R.string.intercom_notification_channel_chat_replies_title), 4);
        a10.setDescription(context.getString(R.string.intercom_notification_channel_chat_replies_description));
        h.a();
        NotificationChannel a11 = i.a(NEW_CHATS_CHANNEL, context.getString(R.string.intercom_notification_channel_new_chats_title), 4);
        a11.setDescription(context.getString(R.string.intercom_notification_channel_new_chats_description));
        h.a();
        NotificationChannel a12 = i.a(ACTIONS_CHANNEL, context.getString(R.string.intercom_notification_channel_actions_title), 4);
        a12.setDescription(context.getString(R.string.intercom_notification_channel_actions_description));
        this.androidNotificationManager.createNotificationChannels(C6565s.q(a10, a11, a12));
    }

    public final void clear() {
        if (!this.receivedPayloads.isEmpty()) {
            this.twig.i("Removing Intercom push notifications.", new Object[0]);
        }
        this.androidNotificationManager.cancel(9999997);
        this.receivedPayloads.clear();
    }

    public final void createNotification(PushPayload pushPayload, Context context, AppConfig appConfig) {
        C6496s.h(pushPayload, "payload");
        C6496s.h(context, "context");
        C6496s.h(appConfig, "appConfig");
        if (!this.receivedPayloads.contains(pushPayload)) {
            this.receivedPayloads.add(pushPayload);
            if (this.receivedPayloads.size() == 1) {
                downloadImages(pushPayload, context, appConfig, new c(this, pushPayload, context, appConfig));
                return;
            }
            this.androidNotificationManager.notify(9999997, this.systemNotificationFactory.createGroupedNotification(this.receivedPayloads, context, appConfig));
        }
    }

    public final void createPushOnlyNotification(PushPayload pushPayload, Context context, AppConfig appConfig) {
        C6496s.h(pushPayload, "payload");
        C6496s.h(context, "context");
        C6496s.h(appConfig, "appConfig");
        downloadImages(pushPayload, context, appConfig, new b(this, pushPayload, context, appConfig));
    }

    public final Bitmap downloadContentImage(PushPayload pushPayload, Context context, AppConfig appConfig) {
        C6496s.h(pushPayload, "payload");
        C6496s.h(context, "context");
        C6496s.h(appConfig, "appConfig");
        int dpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_IN_DP, context);
        String contentImageUrl = pushPayload.getContentImageUrl();
        if (contentImageUrl == null || p.d0(contentImageUrl)) {
            return null;
        }
        Drawable loadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new C3622i.a(context).g(Z.b()).d(pushPayload.getContentImageUrl()).a());
        if (loadIntercomImageBlocking == null) {
            loadIntercomImageBlocking = new BitmapDrawable(context.getResources(), PushAvatarUtils.getNotificationDefaultBitmap(context, appConfig));
        }
        return BitmapUtilsKt.drawableToBitmap(loadIntercomImageBlocking, dpToPx, dpToPx);
    }

    public final void downloadImages(PushPayload pushPayload, Context context, AppConfig appConfig, yf.p pVar) {
        C6496s.h(pushPayload, "payload");
        C6496s.h(context, "context");
        C6496s.h(appConfig, "appConfig");
        yf.p pVar2 = pVar;
        C6496s.h(pVar2, "onComplete");
        N n10 = new N();
        N n11 = new N();
        C5600w0 unused = C5576k.d(C5585o0.f65402a, Z.b(), (M) null, new SystemNotificationManager$downloadImages$1(pVar2, n11, n10, this, pushPayload, context, appConfig, (C6658d<? super SystemNotificationManager$downloadImages$1>) null), 2, (Object) null);
    }

    public final Bitmap generateAvatar(PushPayload pushPayload, Context context, AppConfig appConfig) {
        C6496s.h(pushPayload, "payload");
        C6496s.h(context, "context");
        C6496s.h(appConfig, "appConfig");
        if (TextUtils.isEmpty(pushPayload.getImageUrl()) && !TextUtils.isEmpty(pushPayload.getAuthorName())) {
            return PushAvatarUtils.getNotificationInitialsBitmap(context, pushPayload.getAuthorName(), appConfig);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), PushAvatarUtils.getNotificationDefaultBitmap(context, appConfig));
        try {
            int dpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_IN_DP, context);
            Drawable loadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new C3622i.a(context).i(bitmapDrawable).E(new C3773b()).d(pushPayload.getImageUrl()).g(Z.b()).y(dpToPx, dpToPx).a());
            C6496s.e(loadIntercomImageBlocking);
            return BitmapUtilsKt.drawableToBitmap(loadIntercomImageBlocking, dpToPx, dpToPx);
        } catch (Exception unused) {
            this.twig.d("Failed to retrieve the notification image", new Object[0]);
            return bitmapDrawable.getBitmap();
        }
    }

    public final List<PushPayload> getReceivedPayloads() {
        return this.receivedPayloads;
    }

    public final void setUpNotificationChannelsIfSupported(Context context) {
        C6496s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            setUpNotificationChannels(context);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SystemNotificationManager(NotificationManager notificationManager) {
        this(notificationManager, new SystemNotificationFactory());
        C6496s.h(notificationManager, "androidNotificationManager");
    }
}
