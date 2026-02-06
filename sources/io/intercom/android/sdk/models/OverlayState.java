package io.intercom.android.sdk.models;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 52\u00020\u0001:\u00015Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÇ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u00020\u0007H×\u0001J\t\u00104\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$¨\u00066"}, d2 = {"Lio/intercom/android/sdk/models/OverlayState;", "", "surveyData", "Lio/intercom/android/sdk/survey/model/SurveyData;", "carousel", "Lio/intercom/android/sdk/models/carousel/Carousel;", "bottomPadding", "", "launcherVisibility", "Lio/intercom/android/sdk/Intercom$Visibility;", "inAppNotificationsVisibility", "conversations", "", "Lio/intercom/android/sdk/models/Conversation;", "dismissedPartIds", "", "", "resumedHostActivity", "Landroid/app/Activity;", "pausedHostActivity", "<init>", "(Lio/intercom/android/sdk/survey/model/SurveyData;Lio/intercom/android/sdk/models/carousel/Carousel;ILio/intercom/android/sdk/Intercom$Visibility;Lio/intercom/android/sdk/Intercom$Visibility;Ljava/util/List;Ljava/util/Set;Landroid/app/Activity;Landroid/app/Activity;)V", "getSurveyData", "()Lio/intercom/android/sdk/survey/model/SurveyData;", "getCarousel", "()Lio/intercom/android/sdk/models/carousel/Carousel;", "getBottomPadding", "()I", "getLauncherVisibility", "()Lio/intercom/android/sdk/Intercom$Visibility;", "getInAppNotificationsVisibility", "getConversations", "()Ljava/util/List;", "getDismissedPartIds", "()Ljava/util/Set;", "getResumedHostActivity", "()Landroid/app/Activity;", "getPausedHostActivity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OverlayState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final OverlayState NULL = new OverlayState((SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 511, (DefaultConstructorMarker) null);
    private final int bottomPadding;
    private final Carousel carousel;
    private final List<Conversation> conversations;
    private final Set<String> dismissedPartIds;
    private final Intercom.Visibility inAppNotificationsVisibility;
    private final Intercom.Visibility launcherVisibility;
    private final Activity pausedHostActivity;
    private final Activity resumedHostActivity;
    private final SurveyData surveyData;

    @SuppressLint({"StaticFieldLeak"})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/OverlayState$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/OverlayState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OverlayState() {
        this((SurveyData) null, (Carousel) null, 0, (Intercom.Visibility) null, (Intercom.Visibility) null, (List) null, (Set) null, (Activity) null, (Activity) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OverlayState copy$default(OverlayState overlayState, SurveyData surveyData2, Carousel carousel2, int i10, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i11, Object obj) {
        OverlayState overlayState2 = overlayState;
        int i12 = i11;
        return overlayState.copy((i12 & 1) != 0 ? overlayState2.surveyData : surveyData2, (i12 & 2) != 0 ? overlayState2.carousel : carousel2, (i12 & 4) != 0 ? overlayState2.bottomPadding : i10, (i12 & 8) != 0 ? overlayState2.launcherVisibility : visibility, (i12 & 16) != 0 ? overlayState2.inAppNotificationsVisibility : visibility2, (i12 & 32) != 0 ? overlayState2.conversations : list, (i12 & 64) != 0 ? overlayState2.dismissedPartIds : set, (i12 & 128) != 0 ? overlayState2.resumedHostActivity : activity, (i12 & 256) != 0 ? overlayState2.pausedHostActivity : activity2);
    }

    public final SurveyData component1() {
        return this.surveyData;
    }

    public final Carousel component2() {
        return this.carousel;
    }

    public final int component3() {
        return this.bottomPadding;
    }

    public final Intercom.Visibility component4() {
        return this.launcherVisibility;
    }

    public final Intercom.Visibility component5() {
        return this.inAppNotificationsVisibility;
    }

    public final List<Conversation> component6() {
        return this.conversations;
    }

    public final Set<String> component7() {
        return this.dismissedPartIds;
    }

    public final Activity component8() {
        return this.resumedHostActivity;
    }

    public final Activity component9() {
        return this.pausedHostActivity;
    }

    public final OverlayState copy(SurveyData surveyData2, Carousel carousel2, int i10, Intercom.Visibility visibility, Intercom.Visibility visibility2, List<Conversation> list, Set<String> set, Activity activity, Activity activity2) {
        C6496s.h(surveyData2, "surveyData");
        C6496s.h(carousel2, "carousel");
        C6496s.h(visibility, "launcherVisibility");
        Intercom.Visibility visibility3 = visibility2;
        C6496s.h(visibility3, "inAppNotificationsVisibility");
        List<Conversation> list2 = list;
        C6496s.h(list2, "conversations");
        Set<String> set2 = set;
        C6496s.h(set2, "dismissedPartIds");
        return new OverlayState(surveyData2, carousel2, i10, visibility, visibility3, list2, set2, activity, activity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayState)) {
            return false;
        }
        OverlayState overlayState = (OverlayState) obj;
        return C6496s.c(this.surveyData, overlayState.surveyData) && C6496s.c(this.carousel, overlayState.carousel) && this.bottomPadding == overlayState.bottomPadding && this.launcherVisibility == overlayState.launcherVisibility && this.inAppNotificationsVisibility == overlayState.inAppNotificationsVisibility && C6496s.c(this.conversations, overlayState.conversations) && C6496s.c(this.dismissedPartIds, overlayState.dismissedPartIds) && C6496s.c(this.resumedHostActivity, overlayState.resumedHostActivity) && C6496s.c(this.pausedHostActivity, overlayState.pausedHostActivity);
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final Carousel getCarousel() {
        return this.carousel;
    }

    public final List<Conversation> getConversations() {
        return this.conversations;
    }

    public final Set<String> getDismissedPartIds() {
        return this.dismissedPartIds;
    }

    public final Intercom.Visibility getInAppNotificationsVisibility() {
        return this.inAppNotificationsVisibility;
    }

    public final Intercom.Visibility getLauncherVisibility() {
        return this.launcherVisibility;
    }

    public final Activity getPausedHostActivity() {
        return this.pausedHostActivity;
    }

    public final Activity getResumedHostActivity() {
        return this.resumedHostActivity;
    }

    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.surveyData.hashCode() * 31) + this.carousel.hashCode()) * 31) + Integer.hashCode(this.bottomPadding)) * 31) + this.launcherVisibility.hashCode()) * 31) + this.inAppNotificationsVisibility.hashCode()) * 31) + this.conversations.hashCode()) * 31) + this.dismissedPartIds.hashCode()) * 31;
        Activity activity = this.resumedHostActivity;
        int i10 = 0;
        int hashCode2 = (hashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Activity activity2 = this.pausedHostActivity;
        if (activity2 != null) {
            i10 = activity2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "OverlayState(surveyData=" + this.surveyData + ", carousel=" + this.carousel + ", bottomPadding=" + this.bottomPadding + ", launcherVisibility=" + this.launcherVisibility + ", inAppNotificationsVisibility=" + this.inAppNotificationsVisibility + ", conversations=" + this.conversations + ", dismissedPartIds=" + this.dismissedPartIds + ", resumedHostActivity=" + this.resumedHostActivity + ", pausedHostActivity=" + this.pausedHostActivity + ')';
    }

    public OverlayState(SurveyData surveyData2, Carousel carousel2, int i10, Intercom.Visibility visibility, Intercom.Visibility visibility2, List<Conversation> list, Set<String> set, Activity activity, Activity activity2) {
        C6496s.h(surveyData2, "surveyData");
        C6496s.h(carousel2, "carousel");
        C6496s.h(visibility, "launcherVisibility");
        C6496s.h(visibility2, "inAppNotificationsVisibility");
        C6496s.h(list, "conversations");
        C6496s.h(set, "dismissedPartIds");
        this.surveyData = surveyData2;
        this.carousel = carousel2;
        this.bottomPadding = i10;
        this.launcherVisibility = visibility;
        this.inAppNotificationsVisibility = visibility2;
        this.conversations = list;
        this.dismissedPartIds = set;
        this.resumedHostActivity = activity;
        this.pausedHostActivity = activity2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OverlayState(io.intercom.android.sdk.survey.model.SurveyData r11, io.intercom.android.sdk.models.carousel.Carousel r12, int r13, io.intercom.android.sdk.Intercom.Visibility r14, io.intercom.android.sdk.Intercom.Visibility r15, java.util.List r16, java.util.Set r17, android.app.Activity r18, android.app.Activity r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            io.intercom.android.sdk.survey.model.SurveyData$Companion r1 = io.intercom.android.sdk.survey.model.SurveyData.Companion
            io.intercom.android.sdk.survey.model.SurveyData r1 = r1.getNULL()
            goto L_0x000e
        L_0x000d:
            r1 = r11
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0015
            io.intercom.android.sdk.models.carousel.Carousel r2 = io.intercom.android.sdk.models.carousel.Carousel.NULL
            goto L_0x0016
        L_0x0015:
            r2 = r12
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001c
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = r13
        L_0x001d:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0024
            io.intercom.android.sdk.Intercom$Visibility r4 = io.intercom.android.sdk.Intercom.Visibility.GONE
            goto L_0x0025
        L_0x0024:
            r4 = r14
        L_0x0025:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002c
            io.intercom.android.sdk.Intercom$Visibility r5 = io.intercom.android.sdk.Intercom.Visibility.VISIBLE
            goto L_0x002d
        L_0x002c:
            r5 = r15
        L_0x002d:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0036
            java.util.List r6 = mf.C6565s.n()
            goto L_0x0038
        L_0x0036:
            r6 = r16
        L_0x0038:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0041
            java.util.Set r7 = mf.Y.e()
            goto L_0x0043
        L_0x0041:
            r7 = r17
        L_0x0043:
            r8 = r0 & 128(0x80, float:1.794E-43)
            r9 = 0
            if (r8 == 0) goto L_0x004a
            r8 = r9
            goto L_0x004c
        L_0x004a:
            r8 = r18
        L_0x004c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r9 = r19
        L_0x0053:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.OverlayState.<init>(io.intercom.android.sdk.survey.model.SurveyData, io.intercom.android.sdk.models.carousel.Carousel, int, io.intercom.android.sdk.Intercom$Visibility, io.intercom.android.sdk.Intercom$Visibility, java.util.List, java.util.Set, android.app.Activity, android.app.Activity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
