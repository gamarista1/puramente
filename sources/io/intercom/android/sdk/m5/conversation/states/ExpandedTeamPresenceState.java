package io.intercom.android.sdk.m5.conversation.states;

import com.amazon.a.a.o.b;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 +2\u00020\u0001:\u0001+BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003Jg\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\u0013\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010(\u001a\u00020)H×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "", "title", "", "body", "", "Lio/intercom/android/sdk/models/Header$Expanded$Body;", "avatarType", "Lio/intercom/android/sdk/models/AvatarType;", "avatars", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "footers", "Lio/intercom/android/sdk/models/Header$Expanded$Footer;", "socialAccounts", "Lio/intercom/android/sdk/models/Header$Expanded$SocialAccount;", "displayActiveIndicator", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/models/AvatarType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Ljava/util/List;", "getAvatarType", "()Lio/intercom/android/sdk/models/AvatarType;", "getAvatars", "getFooters", "getSocialAccounts", "getDisplayActiveIndicator", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpandedTeamPresenceState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: default  reason: not valid java name */
    public static final ExpandedTeamPresenceState f82default = new ExpandedTeamPresenceState("", C6565s.n(), AvatarType.UNKNOWN, C6565s.n(), C6565s.n(), C6565s.n(), false);
    private final AvatarType avatarType;
    private final List<AvatarWrapper> avatars;
    private final List<Header.Expanded.Body> body;
    private final boolean displayActiveIndicator;
    private final List<Header.Expanded.Footer> footers;
    private final List<Header.Expanded.SocialAccount> socialAccounts;
    private final String title;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState$Companion;", "", "<init>", "()V", "default", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "getDefault", "()Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExpandedTeamPresenceState getDefault() {
            return ExpandedTeamPresenceState.f82default;
        }

        private Companion() {
        }
    }

    public ExpandedTeamPresenceState(String str, List<Header.Expanded.Body> list, AvatarType avatarType2, List<AvatarWrapper> list2, List<Header.Expanded.Footer> list3, List<Header.Expanded.SocialAccount> list4, boolean z10) {
        C6496s.h(str, b.f37461S);
        C6496s.h(list, "body");
        C6496s.h(avatarType2, "avatarType");
        C6496s.h(list2, "avatars");
        C6496s.h(list3, "footers");
        C6496s.h(list4, "socialAccounts");
        this.title = str;
        this.body = list;
        this.avatarType = avatarType2;
        this.avatars = list2;
        this.footers = list3;
        this.socialAccounts = list4;
        this.displayActiveIndicator = z10;
    }

    public static /* synthetic */ ExpandedTeamPresenceState copy$default(ExpandedTeamPresenceState expandedTeamPresenceState, String str, List<Header.Expanded.Body> list, AvatarType avatarType2, List<AvatarWrapper> list2, List<Header.Expanded.Footer> list3, List<Header.Expanded.SocialAccount> list4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = expandedTeamPresenceState.title;
        }
        if ((i10 & 2) != 0) {
            list = expandedTeamPresenceState.body;
        }
        List<Header.Expanded.Body> list5 = list;
        if ((i10 & 4) != 0) {
            avatarType2 = expandedTeamPresenceState.avatarType;
        }
        AvatarType avatarType3 = avatarType2;
        if ((i10 & 8) != 0) {
            list2 = expandedTeamPresenceState.avatars;
        }
        List<AvatarWrapper> list6 = list2;
        if ((i10 & 16) != 0) {
            list3 = expandedTeamPresenceState.footers;
        }
        List<Header.Expanded.Footer> list7 = list3;
        if ((i10 & 32) != 0) {
            list4 = expandedTeamPresenceState.socialAccounts;
        }
        List<Header.Expanded.SocialAccount> list8 = list4;
        if ((i10 & 64) != 0) {
            z10 = expandedTeamPresenceState.displayActiveIndicator;
        }
        return expandedTeamPresenceState.copy(str, list5, avatarType3, list6, list7, list8, z10);
    }

    public final String component1() {
        return this.title;
    }

    public final List<Header.Expanded.Body> component2() {
        return this.body;
    }

    public final AvatarType component3() {
        return this.avatarType;
    }

    public final List<AvatarWrapper> component4() {
        return this.avatars;
    }

    public final List<Header.Expanded.Footer> component5() {
        return this.footers;
    }

    public final List<Header.Expanded.SocialAccount> component6() {
        return this.socialAccounts;
    }

    public final boolean component7() {
        return this.displayActiveIndicator;
    }

    public final ExpandedTeamPresenceState copy(String str, List<Header.Expanded.Body> list, AvatarType avatarType2, List<AvatarWrapper> list2, List<Header.Expanded.Footer> list3, List<Header.Expanded.SocialAccount> list4, boolean z10) {
        C6496s.h(str, b.f37461S);
        C6496s.h(list, "body");
        C6496s.h(avatarType2, "avatarType");
        C6496s.h(list2, "avatars");
        C6496s.h(list3, "footers");
        C6496s.h(list4, "socialAccounts");
        return new ExpandedTeamPresenceState(str, list, avatarType2, list2, list3, list4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandedTeamPresenceState)) {
            return false;
        }
        ExpandedTeamPresenceState expandedTeamPresenceState = (ExpandedTeamPresenceState) obj;
        return C6496s.c(this.title, expandedTeamPresenceState.title) && C6496s.c(this.body, expandedTeamPresenceState.body) && this.avatarType == expandedTeamPresenceState.avatarType && C6496s.c(this.avatars, expandedTeamPresenceState.avatars) && C6496s.c(this.footers, expandedTeamPresenceState.footers) && C6496s.c(this.socialAccounts, expandedTeamPresenceState.socialAccounts) && this.displayActiveIndicator == expandedTeamPresenceState.displayActiveIndicator;
    }

    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    public final List<Header.Expanded.Body> getBody() {
        return this.body;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<Header.Expanded.Footer> getFooters() {
        return this.footers;
    }

    public final List<Header.Expanded.SocialAccount> getSocialAccounts() {
        return this.socialAccounts;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.avatarType.hashCode()) * 31) + this.avatars.hashCode()) * 31) + this.footers.hashCode()) * 31) + this.socialAccounts.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator);
    }

    public String toString() {
        return "ExpandedTeamPresenceState(title=" + this.title + ", body=" + this.body + ", avatarType=" + this.avatarType + ", avatars=" + this.avatars + ", footers=" + this.footers + ", socialAccounts=" + this.socialAccounts + ", displayActiveIndicator=" + this.displayActiveIndicator + ')';
    }
}
