package io.intercom.android.sdk.tickets;

import M0.i;
import Y.C1500m;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6535s;
import r0.C2544x0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u000234BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJd\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005H×\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010\"\u001a\u00020!H×\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b/\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c¨\u00065"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "adminAvatars", "", "statusTitle", "statusSubtitle", "Lr0/x0;", "progressColor", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ProgressSection;", "progressSections", "statusLabel", "", "timestamp", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4-0d7_KjU", "()J", "component4", "component5", "component6", "component7", "()Ljava/lang/Long;", "copy-ww6aTOc", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;)Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "copy", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAdminAvatars", "Ljava/lang/String;", "getStatusTitle", "getStatusSubtitle", "J", "getProgressColor-0d7_KjU", "getProgressSections", "getStatusLabel", "Ljava/lang/Long;", "getTimestamp", "ProgressSection", "ActualStringOrRes", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketTimelineCardState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> adminAvatars;
    private final long progressColor;
    private final List<ProgressSection> progressSections;
    private final String statusLabel;
    private final String statusSubtitle;
    private final String statusTitle;
    private final Long timestamp;

    @C6521e
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "", "<init>", "()V", "", "getText", "(LY/m;I)Ljava/lang/String;", "StringRes", "ActualString", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$ActualString;", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$StringRes;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActualStringOrRes {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$ActualString;", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "string", "", "<init>", "(Ljava/lang/String;)V", "getString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ActualString extends ActualStringOrRes {
            public static final int $stable = 0;
            private final String string;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ActualString(String str) {
                super((DefaultConstructorMarker) null);
                C6496s.h(str, "string");
                this.string = str;
            }

            public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = actualString.string;
                }
                return actualString.copy(str);
            }

            public final String component1() {
                return this.string;
            }

            public final ActualString copy(String str) {
                C6496s.h(str, "string");
                return new ActualString(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActualString) && C6496s.c(this.string, ((ActualString) obj).string);
            }

            public final String getString() {
                return this.string;
            }

            public int hashCode() {
                return this.string.hashCode();
            }

            public String toString() {
                return "ActualString(string=" + this.string + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes$StringRes;", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "stringRes", "", "<init>", "(I)V", "getStringRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StringRes extends ActualStringOrRes {
            public static final int $stable = 0;
            private final int stringRes;

            public StringRes(int i10) {
                super((DefaultConstructorMarker) null);
                this.stringRes = i10;
            }

            public static /* synthetic */ StringRes copy$default(StringRes stringRes2, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = stringRes2.stringRes;
                }
                return stringRes2.copy(i10);
            }

            public final int component1() {
                return this.stringRes;
            }

            public final StringRes copy(int i10) {
                return new StringRes(i10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringRes) && this.stringRes == ((StringRes) obj).stringRes;
            }

            public final int getStringRes() {
                return this.stringRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.stringRes);
            }

            public String toString() {
                return "StringRes(stringRes=" + this.stringRes + ')';
            }
        }

        public /* synthetic */ ActualStringOrRes(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getText(C1500m mVar, int i10) {
            String str;
            mVar.T(796462681);
            if (this instanceof ActualString) {
                str = ((ActualString) this).getString();
            } else if (this instanceof StringRes) {
                str = i.a(((StringRes) this).getStringRes(), mVar, 0);
            } else {
                throw new C6535s();
            }
            mVar.M();
            return str;
        }

        private ActualStringOrRes() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ProgressSection;", "", "isDone", "", "isLoading", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProgressSection {
        public static final int $stable = 0;
        private final boolean isDone;
        private final boolean isLoading;

        public ProgressSection(boolean z10, boolean z11) {
            this.isDone = z10;
            this.isLoading = z11;
        }

        public static /* synthetic */ ProgressSection copy$default(ProgressSection progressSection, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = progressSection.isDone;
            }
            if ((i10 & 2) != 0) {
                z11 = progressSection.isLoading;
            }
            return progressSection.copy(z10, z11);
        }

        public final boolean component1() {
            return this.isDone;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final ProgressSection copy(boolean z10, boolean z11) {
            return new ProgressSection(z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) obj;
            return this.isDone == progressSection.isDone && this.isLoading == progressSection.isLoading;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isDone) * 31) + Boolean.hashCode(this.isLoading);
        }

        public final boolean isDone() {
            return this.isDone;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return "ProgressSection(isDone=" + this.isDone + ", isLoading=" + this.isLoading + ')';
        }
    }

    public /* synthetic */ TicketTimelineCardState(List list, String str, String str2, long j10, List list2, String str3, Long l10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, j10, list2, str3, l10);
    }

    /* renamed from: copy-ww6aTOc$default  reason: not valid java name */
    public static /* synthetic */ TicketTimelineCardState m538copyww6aTOc$default(TicketTimelineCardState ticketTimelineCardState, List list, String str, String str2, long j10, List list2, String str3, Long l10, int i10, Object obj) {
        TicketTimelineCardState ticketTimelineCardState2 = ticketTimelineCardState;
        return ticketTimelineCardState.m540copyww6aTOc((i10 & 1) != 0 ? ticketTimelineCardState2.adminAvatars : list, (i10 & 2) != 0 ? ticketTimelineCardState2.statusTitle : str, (i10 & 4) != 0 ? ticketTimelineCardState2.statusSubtitle : str2, (i10 & 8) != 0 ? ticketTimelineCardState2.progressColor : j10, (i10 & 16) != 0 ? ticketTimelineCardState2.progressSections : list2, (i10 & 32) != 0 ? ticketTimelineCardState2.statusLabel : str3, (i10 & 64) != 0 ? ticketTimelineCardState2.timestamp : l10);
    }

    public final List<AvatarWrapper> component1() {
        return this.adminAvatars;
    }

    public final String component2() {
        return this.statusTitle;
    }

    public final String component3() {
        return this.statusSubtitle;
    }

    /* renamed from: component4-0d7_KjU  reason: not valid java name */
    public final long m539component40d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> component5() {
        return this.progressSections;
    }

    public final String component6() {
        return this.statusLabel;
    }

    public final Long component7() {
        return this.timestamp;
    }

    /* renamed from: copy-ww6aTOc  reason: not valid java name */
    public final TicketTimelineCardState m540copyww6aTOc(List<AvatarWrapper> list, String str, String str2, long j10, List<ProgressSection> list2, String str3, Long l10) {
        C6496s.h(list, "adminAvatars");
        C6496s.h(str, "statusTitle");
        C6496s.h(str2, "statusSubtitle");
        List<ProgressSection> list3 = list2;
        C6496s.h(list3, "progressSections");
        String str4 = str3;
        C6496s.h(str4, "statusLabel");
        return new TicketTimelineCardState(list, str, str2, j10, list3, str4, l10, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTimelineCardState)) {
            return false;
        }
        TicketTimelineCardState ticketTimelineCardState = (TicketTimelineCardState) obj;
        return C6496s.c(this.adminAvatars, ticketTimelineCardState.adminAvatars) && C6496s.c(this.statusTitle, ticketTimelineCardState.statusTitle) && C6496s.c(this.statusSubtitle, ticketTimelineCardState.statusSubtitle) && C2544x0.q(this.progressColor, ticketTimelineCardState.progressColor) && C6496s.c(this.progressSections, ticketTimelineCardState.progressSections) && C6496s.c(this.statusLabel, ticketTimelineCardState.statusLabel) && C6496s.c(this.timestamp, ticketTimelineCardState.timestamp);
    }

    public final List<AvatarWrapper> getAdminAvatars() {
        return this.adminAvatars;
    }

    /* renamed from: getProgressColor-0d7_KjU  reason: not valid java name */
    public final long m541getProgressColor0d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> getProgressSections() {
        return this.progressSections;
    }

    public final String getStatusLabel() {
        return this.statusLabel;
    }

    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.adminAvatars.hashCode() * 31) + this.statusTitle.hashCode()) * 31) + this.statusSubtitle.hashCode()) * 31) + C2544x0.w(this.progressColor)) * 31) + this.progressSections.hashCode()) * 31) + this.statusLabel.hashCode()) * 31;
        Long l10 = this.timestamp;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "TicketTimelineCardState(adminAvatars=" + this.adminAvatars + ", statusTitle=" + this.statusTitle + ", statusSubtitle=" + this.statusSubtitle + ", progressColor=" + C2544x0.x(this.progressColor) + ", progressSections=" + this.progressSections + ", statusLabel=" + this.statusLabel + ", timestamp=" + this.timestamp + ')';
    }

    private TicketTimelineCardState(List<AvatarWrapper> list, String str, String str2, long j10, List<ProgressSection> list2, String str3, Long l10) {
        C6496s.h(list, "adminAvatars");
        C6496s.h(str, "statusTitle");
        C6496s.h(str2, "statusSubtitle");
        C6496s.h(list2, "progressSections");
        C6496s.h(str3, "statusLabel");
        this.adminAvatars = list;
        this.statusTitle = str;
        this.statusSubtitle = str2;
        this.progressColor = j10;
        this.progressSections = list2;
        this.statusLabel = str3;
        this.timestamp = l10;
    }
}
