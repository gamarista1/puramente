package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import r0.C2544x0;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002¨\u0006\u0017"}, d2 = {"reduceTopAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "isNewConversation", "", "hasPendingMessages", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "openResponseHeader", "Lio/intercom/android/sdk/models/Header;", "config", "Lio/intercom/android/sdk/identity/AppConfig;", "unreadConversationsCount", "", "unreadTicketsCount", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "reduceHeaderMenuItems", "", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "getNavIcon", "getCappedUnreadCountString", "", "unreadCount", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HeaderReducerKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.models.Header$Collapsed$HeaderIconType[] r0 = io.intercom.android.sdk.models.Header.Collapsed.HeaderIconType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.Header$Collapsed$HeaderIconType r1 = io.intercom.android.sdk.models.Header.Collapsed.HeaderIconType.CLOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.Header$Collapsed$HeaderIconType r1 = io.intercom.android.sdk.models.Header.Collapsed.HeaderIconType.AI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.reducers.HeaderReducerKt.WhenMappings.<clinit>():void");
        }
    }

    private static final String getCappedUnreadCountString(int i10) {
        if (i10 > 9) {
            return "9+";
        }
        if (i10 == 0) {
            return "";
        }
        return String.valueOf(i10);
    }

    private static final int getNavIcon(LaunchMode launchMode) {
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            return R.drawable.intercom_ic_close;
        }
        return R.drawable.intercom_ic_back;
    }

    public static final List<HeaderMenuItem> reduceHeaderMenuItems(AppConfig appConfig, int i10, boolean z10, LaunchMode launchMode, int i11) {
        HeaderMenuItem.TotalCountIndicator totalCountIndicator;
        StringProvider.ActualString actualString;
        boolean z11;
        StringProvider stringProvider;
        C6496s.h(appConfig, "config");
        C6496s.h(launchMode, "launchMode");
        List c10 = C6565s.c();
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            String cappedUnreadCountString = getCappedUnreadCountString(i10);
            if (i10 == 0 && i11 > 0) {
                totalCountIndicator = HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator.INSTANCE;
            } else if (i10 > 0) {
                totalCountIndicator = new HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator(cappedUnreadCountString);
            } else {
                totalCountIndicator = HeaderMenuItem.TotalCountIndicator.NoIndicator.INSTANCE;
            }
            HeaderMenuItem.TotalCountIndicator totalCountIndicator2 = totalCountIndicator;
            String spaceLabelIfExists = appConfig.getSpaceLabelIfExists(Space.Type.MESSAGES);
            if (spaceLabelIfExists != null) {
                actualString = new StringProvider.ActualString(spaceLabelIfExists);
            } else {
                actualString = new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_messages_space_title, (List) null, 2, (DefaultConstructorMarker) null);
            }
            c10.add(new HeaderMenuItem.Messages(totalCountIndicator2, cappedUnreadCountString, false, actualString, 4, (DefaultConstructorMarker) null));
            if (AppConfigExtensionsKt.canStartNewConversation(appConfig)) {
                c10.add(new HeaderMenuItem.StartNewConversation(!z10, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_new_conversation, (List) null, 2, (DefaultConstructorMarker) null)));
            }
            if (appConfig.isSpaceEnabled(Space.Type.HELP)) {
                c10.add(new HeaderMenuItem.Help(true, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_help_space_title, (List) null, 2, (DefaultConstructorMarker) null)));
            }
            Space.Type type = Space.Type.TICKETS;
            if (appConfig.isSpaceEnabled(type)) {
                if (i11 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String spaceLabelIfExists2 = appConfig.getSpaceLabelIfExists(type);
                if (spaceLabelIfExists2 != null) {
                    stringProvider = new StringProvider.ActualString(spaceLabelIfExists2);
                } else {
                    stringProvider = new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_tickets_space_title, (List) null, 2, (DefaultConstructorMarker) null);
                }
                c10.add(new HeaderMenuItem.Tickets(z11, true, stringProvider));
            }
        }
        return C6565s.a(c10);
    }

    public static final TopAppBarUiState reduceTopAppBarUiState(boolean z10, boolean z11, Conversation conversation, Header header, AppConfig appConfig, int i10, int i11, LaunchMode launchMode) {
        Header header2;
        Ticket ticket;
        TicketProgressRowState ticketProgressRowState;
        StringProvider.ActualString actualString;
        Integer num;
        List<HeaderMenuItem> list;
        List list2;
        List<Avatar.Builder> avatars;
        int i12;
        boolean z12 = z10;
        AppConfig appConfig2 = appConfig;
        LaunchMode launchMode2 = launchMode;
        C6496s.h(appConfig2, "config");
        C6496s.h(launchMode2, "launchMode");
        List<HeaderMenuItem> reduceHeaderMenuItems = reduceHeaderMenuItems(appConfig2, i10, z12, launchMode2, i11);
        if (z12 && header == null) {
            return TopAppBarUiState.m216copyd8CKnI4$default(TopAppBarUiState.Companion.getDefault(), (StringProvider) null, Integer.valueOf(getNavIcon(launchMode)), (StringProvider) null, (Integer) null, (List) null, false, (TicketProgressRowState) null, reduceHeaderMenuItems, (C2544x0) null, (C2544x0) null, (C2544x0) null, 1917, (Object) null);
        }
        if (conversation == null || (header2 = conversation.getHeader()) == null) {
            if (header == null) {
                return TopAppBarUiState.m216copyd8CKnI4$default(TopAppBarUiState.Companion.getDefault(), (StringProvider) null, Integer.valueOf(getNavIcon(launchMode)), (StringProvider) null, (Integer) null, (List) null, false, (TicketProgressRowState) null, reduceHeaderMenuItems, (C2544x0) null, (C2544x0) null, (C2544x0) null, 1917, (Object) null);
            }
            header2 = header;
        }
        long composeColor$default = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColor(), 0.0f, 1, (Object) null);
        long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColor(), 0.0f, 1, (Object) null);
        long composeColor$default3 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColor(), 0.0f, 1, (Object) null);
        if (conversation != null) {
            ticket = conversation.getTicket();
        } else {
            ticket = null;
        }
        if (ticket == null || (!ConversationExtensionsKt.hasNonTicketParts(conversation) && !z11)) {
            ticketProgressRowState = null;
        } else {
            ticketProgressRowState = new TicketProgressRowState(conversation.getTicket().getTitle(), conversation.getTicket().getCurrentStatus().getTitle());
        }
        Header.Collapsed collapsed = header2.getCollapsed();
        StringProvider.ActualString actualString2 = new StringProvider.ActualString(collapsed.getTitle());
        Integer valueOf = Integer.valueOf(getNavIcon(launchMode));
        String subtitle = collapsed.getSubtitle();
        if (subtitle != null) {
            actualString = new StringProvider.ActualString(subtitle);
        } else {
            actualString = null;
        }
        Header.Collapsed.HeaderIconType icon = collapsed.getIcon();
        if (icon != null) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i13 == 1) {
                i12 = io.intercom.android.sdk.R.drawable.intercom_clock;
            } else if (i13 == 2) {
                i12 = io.intercom.android.sdk.R.drawable.intercom_ic_ai;
            } else {
                throw new C6535s();
            }
            num = Integer.valueOf(i12);
        } else {
            num = null;
        }
        AvatarDetails avatarDetails = collapsed.getAvatarDetails();
        if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
            list = reduceHeaderMenuItems;
            list2 = C6565s.n();
        } else {
            Iterable iterable = avatars;
            list2 = new ArrayList(C6565s.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Avatar build = ((Avatar.Builder) it.next()).build();
                C6496s.g(build, "build(...)");
                list2.add(new AvatarWrapper(build, header2.getUseBotHeader()));
                it = it;
                reduceHeaderMenuItems = reduceHeaderMenuItems;
            }
            list = reduceHeaderMenuItems;
        }
        return new TopAppBarUiState(actualString2, valueOf, actualString, num, list2, header2.getDisplayActiveIndicator(), ticketProgressRowState, list, C2544x0.k(composeColor$default), C2544x0.k(composeColor$default2), C2544x0.k(composeColor$default3), (DefaultConstructorMarker) null);
    }
}
