package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0000H&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState;", "", "<init>", "()V", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "progressBarState", "Lio/intercom/android/sdk/survey/ProgressBarState;", "getProgressBarState", "()Lio/intercom/android/sdk/survey/ProgressBarState;", "showDismissButton", "", "getShowDismissButton", "()Z", "enableDismissButton", "withProgressBarState", "SenderTopBarState", "NoTopBarState", "Lio/intercom/android/sdk/survey/TopBarState$NoTopBarState;", "Lio/intercom/android/sdk/survey/TopBarState$SenderTopBarState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TopBarState {
    public static final int $stable = 0;

    public /* synthetic */ TopBarState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TopBarState enableDismissButton();

    public abstract ProgressBarState getProgressBarState();

    public abstract boolean getShowDismissButton();

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState withProgressBarState(ProgressBarState progressBarState);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0001H\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState$NoTopBarState;", "Lio/intercom/android/sdk/survey/TopBarState;", "showDismissButton", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "progressBarState", "Lio/intercom/android/sdk/survey/ProgressBarState;", "<init>", "(ZLio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ProgressBarState;)V", "getShowDismissButton", "()Z", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getProgressBarState", "()Lio/intercom/android/sdk/survey/ProgressBarState;", "enableDismissButton", "withProgressBarState", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoTopBarState extends TopBarState {
        public static final int $stable = 0;
        private final ProgressBarState progressBarState;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NoTopBarState(boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, surveyUiColors2, (i10 & 4) != 0 ? new ProgressBarState(false, 0.0f, 3, (DefaultConstructorMarker) null) : progressBarState2);
        }

        public static /* synthetic */ NoTopBarState copy$default(NoTopBarState noTopBarState, boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = noTopBarState.showDismissButton;
            }
            if ((i10 & 2) != 0) {
                surveyUiColors2 = noTopBarState.surveyUiColors;
            }
            if ((i10 & 4) != 0) {
                progressBarState2 = noTopBarState.progressBarState;
            }
            return noTopBarState.copy(z10, surveyUiColors2, progressBarState2);
        }

        public final boolean component1() {
            return this.showDismissButton;
        }

        public final SurveyUiColors component2() {
            return this.surveyUiColors;
        }

        public final ProgressBarState component3() {
            return this.progressBarState;
        }

        public final NoTopBarState copy(boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2) {
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(progressBarState2, "progressBarState");
            return new NoTopBarState(z10, surveyUiColors2, progressBarState2);
        }

        public TopBarState enableDismissButton() {
            return copy$default(this, true, (SurveyUiColors) null, (ProgressBarState) null, 6, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoTopBarState)) {
                return false;
            }
            NoTopBarState noTopBarState = (NoTopBarState) obj;
            return this.showDismissButton == noTopBarState.showDismissButton && C6496s.c(this.surveyUiColors, noTopBarState.surveyUiColors) && C6496s.c(this.progressBarState, noTopBarState.progressBarState);
        }

        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.showDismissButton) * 31) + this.surveyUiColors.hashCode()) * 31) + this.progressBarState.hashCode();
        }

        public String toString() {
            return "NoTopBarState(showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        public TopBarState withProgressBarState(ProgressBarState progressBarState2) {
            C6496s.h(progressBarState2, "progressBarState");
            return copy$default(this, false, (SurveyUiColors) null, progressBarState2, 3, (Object) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NoTopBarState(boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(progressBarState2, "progressBarState");
            this.showDismissButton = z10;
            this.surveyUiColors = surveyUiColors2;
            this.progressBarState = progressBarState2;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u0001H\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020)H×\u0001J\t\u0010*\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState$SenderTopBarState;", "Lio/intercom/android/sdk/survey/TopBarState;", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "senderName", "", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "showDismissButton", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "progressBarState", "Lio/intercom/android/sdk/survey/ProgressBarState;", "<init>", "(Lio/intercom/android/sdk/models/Avatar;Ljava/lang/String;Lio/intercom/android/sdk/identity/AppConfig;ZLio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ProgressBarState;)V", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "getSenderName", "()Ljava/lang/String;", "getAppConfig", "()Lio/intercom/android/sdk/identity/AppConfig;", "getShowDismissButton", "()Z", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getProgressBarState", "()Lio/intercom/android/sdk/survey/ProgressBarState;", "enableDismissButton", "withProgressBarState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SenderTopBarState extends TopBarState {
        public static final int $stable = 8;
        private final AppConfig appConfig;
        private final Avatar avatar;
        private final ProgressBarState progressBarState;
        private final String senderName;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SenderTopBarState(Avatar avatar2, String str, AppConfig appConfig2, boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(avatar2, str, appConfig2, z10, surveyUiColors2, (i10 & 32) != 0 ? new ProgressBarState(false, 0.0f, 3, (DefaultConstructorMarker) null) : progressBarState2);
        }

        public static /* synthetic */ SenderTopBarState copy$default(SenderTopBarState senderTopBarState, Avatar avatar2, String str, AppConfig appConfig2, boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatar2 = senderTopBarState.avatar;
            }
            if ((i10 & 2) != 0) {
                str = senderTopBarState.senderName;
            }
            String str2 = str;
            if ((i10 & 4) != 0) {
                appConfig2 = senderTopBarState.appConfig;
            }
            AppConfig appConfig3 = appConfig2;
            if ((i10 & 8) != 0) {
                z10 = senderTopBarState.showDismissButton;
            }
            boolean z11 = z10;
            if ((i10 & 16) != 0) {
                surveyUiColors2 = senderTopBarState.surveyUiColors;
            }
            SurveyUiColors surveyUiColors3 = surveyUiColors2;
            if ((i10 & 32) != 0) {
                progressBarState2 = senderTopBarState.progressBarState;
            }
            return senderTopBarState.copy(avatar2, str2, appConfig3, z11, surveyUiColors3, progressBarState2);
        }

        public final Avatar component1() {
            return this.avatar;
        }

        public final String component2() {
            return this.senderName;
        }

        public final AppConfig component3() {
            return this.appConfig;
        }

        public final boolean component4() {
            return this.showDismissButton;
        }

        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        public final ProgressBarState component6() {
            return this.progressBarState;
        }

        public final SenderTopBarState copy(Avatar avatar2, String str, AppConfig appConfig2, boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2) {
            C6496s.h(avatar2, "avatar");
            C6496s.h(str, "senderName");
            C6496s.h(appConfig2, "appConfig");
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(progressBarState2, "progressBarState");
            return new SenderTopBarState(avatar2, str, appConfig2, z10, surveyUiColors2, progressBarState2);
        }

        public TopBarState enableDismissButton() {
            return copy$default(this, (Avatar) null, (String) null, (AppConfig) null, true, (SurveyUiColors) null, (ProgressBarState) null, 55, (Object) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SenderTopBarState)) {
                return false;
            }
            SenderTopBarState senderTopBarState = (SenderTopBarState) obj;
            return C6496s.c(this.avatar, senderTopBarState.avatar) && C6496s.c(this.senderName, senderTopBarState.senderName) && C6496s.c(this.appConfig, senderTopBarState.appConfig) && this.showDismissButton == senderTopBarState.showDismissButton && C6496s.c(this.surveyUiColors, senderTopBarState.surveyUiColors) && C6496s.c(this.progressBarState, senderTopBarState.progressBarState);
        }

        public final AppConfig getAppConfig() {
            return this.appConfig;
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        public final String getSenderName() {
            return this.senderName;
        }

        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return (((((((((this.avatar.hashCode() * 31) + this.senderName.hashCode()) * 31) + this.appConfig.hashCode()) * 31) + Boolean.hashCode(this.showDismissButton)) * 31) + this.surveyUiColors.hashCode()) * 31) + this.progressBarState.hashCode();
        }

        public String toString() {
            return "SenderTopBarState(avatar=" + this.avatar + ", senderName=" + this.senderName + ", appConfig=" + this.appConfig + ", showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        public TopBarState withProgressBarState(ProgressBarState progressBarState2) {
            C6496s.h(progressBarState2, "progressBarState");
            return copy$default(this, (Avatar) null, (String) null, (AppConfig) null, false, (SurveyUiColors) null, progressBarState2, 31, (Object) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SenderTopBarState(Avatar avatar2, String str, AppConfig appConfig2, boolean z10, SurveyUiColors surveyUiColors2, ProgressBarState progressBarState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(avatar2, "avatar");
            C6496s.h(str, "senderName");
            C6496s.h(appConfig2, "appConfig");
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(progressBarState2, "progressBarState");
            this.avatar = avatar2;
            this.senderName = str;
            this.appConfig = appConfig2;
            this.showDismissButton = z10;
            this.surveyUiColors = surveyUiColors2;
            this.progressBarState = progressBarState2;
        }
    }

    private TopBarState() {
    }
}
