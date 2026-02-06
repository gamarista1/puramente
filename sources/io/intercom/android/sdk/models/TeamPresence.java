package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\bH×\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/models/TeamPresence;", "", "activeAdmins", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "activeBot", "Lio/intercom/android/sdk/models/ActiveBot;", "expectedResponseDelayShortText", "", "expectedResponseDelayLongText", "<init>", "(Ljava/util/List;Lio/intercom/android/sdk/models/ActiveBot;Ljava/lang/String;Ljava/lang/String;)V", "getActiveAdmins", "()Ljava/util/List;", "getActiveBot", "()Lio/intercom/android/sdk/models/ActiveBot;", "getExpectedResponseDelayShortText", "()Ljava/lang/String;", "getExpectedResponseDelayLongText", "builtActiveAdmins", "Lio/intercom/android/sdk/models/Participant;", "getBuiltActiveAdmins", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeamPresence {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final TeamPresence NULL = new TeamPresence((List) null, (ActiveBot) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    @c("active_admins")
    private final List<Participant.Builder> activeAdmins;
    @c("active_bot")
    private final ActiveBot activeBot;
    @c("expected_response_delay_long_text")
    private final String expectedResponseDelayLongText;
    @c("expected_response_delay_short_text")
    private final String expectedResponseDelayShortText;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/TeamPresence$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/TeamPresence;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TeamPresence() {
        this((List) null, (ActiveBot) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TeamPresence copy$default(TeamPresence teamPresence, List<Participant.Builder> list, ActiveBot activeBot2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = teamPresence.activeAdmins;
        }
        if ((i10 & 2) != 0) {
            activeBot2 = teamPresence.activeBot;
        }
        if ((i10 & 4) != 0) {
            str = teamPresence.expectedResponseDelayShortText;
        }
        if ((i10 & 8) != 0) {
            str2 = teamPresence.expectedResponseDelayLongText;
        }
        return teamPresence.copy(list, activeBot2, str, str2);
    }

    public final List<Participant.Builder> component1() {
        return this.activeAdmins;
    }

    public final ActiveBot component2() {
        return this.activeBot;
    }

    public final String component3() {
        return this.expectedResponseDelayShortText;
    }

    public final String component4() {
        return this.expectedResponseDelayLongText;
    }

    public final TeamPresence copy(List<Participant.Builder> list, ActiveBot activeBot2, String str, String str2) {
        return new TeamPresence(list, activeBot2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPresence)) {
            return false;
        }
        TeamPresence teamPresence = (TeamPresence) obj;
        return C6496s.c(this.activeAdmins, teamPresence.activeAdmins) && C6496s.c(this.activeBot, teamPresence.activeBot) && C6496s.c(this.expectedResponseDelayShortText, teamPresence.expectedResponseDelayShortText) && C6496s.c(this.expectedResponseDelayLongText, teamPresence.expectedResponseDelayLongText);
    }

    public final List<Participant.Builder> getActiveAdmins() {
        return this.activeAdmins;
    }

    public final ActiveBot getActiveBot() {
        return this.activeBot;
    }

    public final List<Participant> getBuiltActiveAdmins() {
        List<Participant.Builder> list = this.activeAdmins;
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<Participant.Builder> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Participant.Builder build : iterable) {
            arrayList.add(build.build());
        }
        return arrayList;
    }

    public final String getExpectedResponseDelayLongText() {
        return this.expectedResponseDelayLongText;
    }

    public final String getExpectedResponseDelayShortText() {
        return this.expectedResponseDelayShortText;
    }

    public int hashCode() {
        List<Participant.Builder> list = this.activeAdmins;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ActiveBot activeBot2 = this.activeBot;
        int hashCode2 = (hashCode + (activeBot2 == null ? 0 : activeBot2.hashCode())) * 31;
        String str = this.expectedResponseDelayShortText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expectedResponseDelayLongText;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "TeamPresence(activeAdmins=" + this.activeAdmins + ", activeBot=" + this.activeBot + ", expectedResponseDelayShortText=" + this.expectedResponseDelayShortText + ", expectedResponseDelayLongText=" + this.expectedResponseDelayLongText + ')';
    }

    public TeamPresence(List<Participant.Builder> list, ActiveBot activeBot2, String str, String str2) {
        this.activeAdmins = list;
        this.activeBot = activeBot2;
        this.expectedResponseDelayShortText = str;
        this.expectedResponseDelayLongText = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamPresence(List list, ActiveBot activeBot2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : activeBot2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
