package io.intercom.android.sdk.m5.conversation.states;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "", "expandedTeamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "teamIntro", "", "specialNotice", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;Ljava/lang/String;Ljava/lang/String;)V", "getExpandedTeamPresenceState", "()Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "getTeamIntro", "()Ljava/lang/String;", "getSpecialNotice", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeamPresenceState {
    public static final int $stable = 8;
    private final ExpandedTeamPresenceState expandedTeamPresenceState;
    private final String specialNotice;
    private final String teamIntro;

    public TeamPresenceState(ExpandedTeamPresenceState expandedTeamPresenceState2, String str, String str2) {
        C6496s.h(expandedTeamPresenceState2, "expandedTeamPresenceState");
        C6496s.h(str, "teamIntro");
        C6496s.h(str2, "specialNotice");
        this.expandedTeamPresenceState = expandedTeamPresenceState2;
        this.teamIntro = str;
        this.specialNotice = str2;
    }

    public final ExpandedTeamPresenceState getExpandedTeamPresenceState() {
        return this.expandedTeamPresenceState;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }
}
