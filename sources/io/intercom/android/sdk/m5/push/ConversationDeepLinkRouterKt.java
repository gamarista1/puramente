package io.intercom.android.sdk.m5.push;

import Sg.p;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.y;
import io.intercom.android.sdk.m5.navigation.BackstackManager;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import u1.c;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\"\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a0\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002\"\u000e\u0010\u0011\u001a\u00020\fXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"buildIntentForConversationScreen", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "conversationId", "", "buildIntentForDeepLinkScreen", "uri", "instanceId", "buildIntentForMessagesScreen", "buildBasePendingIntent", "requestCode", "", "finalIntent", "Landroid/content/Intent;", "extras", "Landroid/os/Bundle;", "DEFAULT_REQUEST_CODE", "INTERCOM_PUSH_INSTANCE_ID", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationDeepLinkRouterKt {
    private static final int DEFAULT_REQUEST_CODE = 0;
    public static final String INTERCOM_PUSH_INSTANCE_ID = "io.intercom.android.sdk.INTERCOM_PUSH_INSTANCE_ID";

    private static final PendingIntent buildBasePendingIntent(Context context, int i10, Intent intent, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        if (bundle != null) {
            if (intent != null) {
                intent.putExtras(bundle);
            }
            launchIntentForPackage.putExtras(bundle);
        }
        y h10 = y.h(context);
        BackstackManager backstackManager = BackstackManager.INSTANCE;
        if (backstackManager.hasBackstackItem()) {
            Class<? extends Activity> backstackItem = backstackManager.getBackstackItem();
            C6496s.e(backstackItem);
            Intent intent2 = new Intent(context, backstackItem);
            intent2.addFlags(268435456);
            h10.a(intent2);
        }
        if (intent != null) {
            h10.a(intent);
        }
        if (intent == null && !backstackManager.hasBackstackItem()) {
            h10.a(launchIntentForPackage);
        }
        if (intent == null) {
            i10 = 0;
        }
        return h10.n(i10, 201326592);
    }

    static /* synthetic */ PendingIntent buildBasePendingIntent$default(Context context, int i10, Intent intent, Bundle bundle, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            bundle = null;
        }
        return buildBasePendingIntent(context, i10, intent, bundle);
    }

    public static final PendingIntent buildIntentForConversationScreen(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "conversationId");
        Intent intent = null;
        if (!p.d0(str)) {
            intent = IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, "", false, (String) null, (String) null, (TransitionArgs) null, 48, (DefaultConstructorMarker) null), (Class) null, 4, (Object) null);
        }
        return buildBasePendingIntent$default(context, str.hashCode(), intent, (Bundle) null, 8, (Object) null);
    }

    public static final PendingIntent buildIntentForDeepLinkScreen(Context context, String str, String str2) {
        Intent intent;
        C6496s.h(context, "context");
        C6496s.h(str, "uri");
        C6496s.h(str2, "instanceId");
        if (!p.d0(str)) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = null;
        }
        return buildBasePendingIntent(context, str.hashCode(), intent, c.a(C6502A.a(INTERCOM_PUSH_INSTANCE_ID, str2)));
    }

    public static final PendingIntent buildIntentForMessagesScreen(Context context) {
        C6496s.h(context, "context");
        return buildBasePendingIntent$default(context, 0, IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, (Class) null, 4, (Object) null), (Bundle) null, 8, (Object) null);
    }
}
