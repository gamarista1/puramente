package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"reduceTeamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "openMessengerResponse", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TeamPresenceReducerKt {
    public static final TeamPresenceState reduceTeamPresenceState(Conversation conversation, OpenMessengerResponse openMessengerResponse) {
        OpenMessengerResponse.NewConversationData newConversationData;
        Header.Expanded expanded;
        ExpandedTeamPresenceState expandedTeamPresenceState;
        String str;
        String specialNotice;
        Header header;
        AvatarType avatarType;
        List list;
        boolean z10;
        List<Avatar.Builder> avatars;
        Header header2;
        Header header3;
        String str2 = null;
        if (openMessengerResponse != null) {
            newConversationData = openMessengerResponse.getNewConversationData();
        } else {
            newConversationData = null;
        }
        if (conversation == null || (header3 = conversation.getHeader()) == null || (expanded = header3.getExpanded()) == null) {
            if (newConversationData == null || (header2 = newConversationData.getHeader()) == null) {
                expanded = null;
            } else {
                expanded = header2.getExpanded();
            }
        }
        if (expanded != null) {
            if (conversation == null || (header = conversation.getHeader()) == null) {
                if (newConversationData != null) {
                    header = newConversationData.getHeader();
                } else {
                    header = null;
                }
            }
            String title = expanded.getTitle();
            List<Header.Expanded.Body> body = expanded.getBody();
            AvatarDetails avatarDetails = expanded.getAvatarDetails();
            if (avatarDetails == null || (avatarType = avatarDetails.getAvatarType()) == null) {
                avatarType = AvatarType.UNKNOWN;
            }
            AvatarType avatarType2 = avatarType;
            AvatarDetails avatarDetails2 = expanded.getAvatarDetails();
            if (avatarDetails2 == null || (avatars = avatarDetails2.getAvatars()) == null) {
                list = C6565s.n();
            } else {
                Iterable<Avatar.Builder> iterable = avatars;
                list = new ArrayList(C6565s.y(iterable, 10));
                for (Avatar.Builder build : iterable) {
                    Avatar build2 = build.build();
                    C6496s.g(build2, "build(...)");
                    list.add(new AvatarWrapper(build2, false));
                }
            }
            List<Header.Expanded.Footer> footer = expanded.getFooter();
            List<Header.Expanded.SocialAccount> socialAccounts = expanded.getSocialAccounts();
            if (header != null) {
                z10 = header.getDisplayActiveIndicator();
            } else {
                z10 = false;
            }
            expandedTeamPresenceState = new ExpandedTeamPresenceState(title, body, avatarType2, list, footer, socialAccounts, z10);
        } else {
            expandedTeamPresenceState = ExpandedTeamPresenceState.Companion.getDefault();
        }
        String str3 = "";
        if (conversation == null || (str = conversation.getTeamIntro()) == null) {
            if (newConversationData != null) {
                str = newConversationData.getTeamIntro();
            } else {
                str = null;
            }
            if (str == null) {
                str = str3;
            }
        }
        if (conversation == null || (specialNotice = conversation.getSpecialNotice()) == null) {
            if (newConversationData != null) {
                str2 = newConversationData.getSpecialNotice();
            }
            if (str2 != null) {
                str3 = str2;
            }
        } else {
            str3 = specialNotice;
        }
        return new TeamPresenceState(expandedTeamPresenceState, str, str3);
    }
}
