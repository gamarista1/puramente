package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityLauncher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Llf/M;", "startHome", "(Landroid/content/Context;)V", "startMessages", "startTickets", "", "ticketId", "from", "startTicketDetails", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "", "collectionIds", "metricPlace", "startHelpCenterCollections", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V", "collectionId", "place", "startHelpCenterCollection", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomRootActivityLauncher {
    public static final int $stable = 0;
    public static final IntercomRootActivityLauncher INSTANCE = new IntercomRootActivityLauncher();

    private IntercomRootActivityLauncher() {
    }

    public static /* synthetic */ void startHelpCenterCollections$default(IntercomRootActivityLauncher intercomRootActivityLauncher, Context context, List list, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = C6565s.n();
        }
        intercomRootActivityLauncher.startHelpCenterCollections(context, list, str);
    }

    public final void startHelpCenterCollection(Context context, String str, String str2) {
        C6496s.h(context, "context");
        C6496s.h(str, "collectionId");
        C6496s.h(str2, "place");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionArgs(str, str2), (Class) null, 4, (Object) null));
    }

    public final void startHelpCenterCollections(Context context, List<String> list, String str) {
        C6496s.h(context, "context");
        C6496s.h(list, "collectionIds");
        C6496s.h(str, "metricPlace");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionsArgs(list, str), (Class) null, 4, (Object) null));
    }

    public final void startHome(Context context) {
        C6496s.h(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.HomeScreenArgs.INSTANCE, (Class) null, 4, (Object) null));
    }

    public final void startMessages(Context context) {
        C6496s.h(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, (Class) null, 4, (Object) null));
    }

    public final void startTicketDetails(Context context, String str, String str2) {
        C6496s.h(context, "context");
        C6496s.h(str, "ticketId");
        C6496s.h(str2, TicketDetailDestinationKt.LAUNCHED_FROM);
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.TicketDetailsScreenArgs(str, str2), (Class) null, 4, (Object) null));
    }

    public final void startTickets(Context context) {
        C6496s.h(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.TicketsScreenArgs.INSTANCE, (Class) null, 4, (Object) null));
    }
}
