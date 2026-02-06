package io.intercom.android.sdk.survey.model;

import Ef.i;
import Oc.c;
import com.amazon.a.a.o.b;
import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.h;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import mf.L;
import sf.C6714a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u0000 :2\u00020\u0001:\u00056789:BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003Jk\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÇ\u0001J\u0013\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00104\u001a\u00020\u000eH×\u0001J\t\u00105\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006;"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData;", "", "_format", "", "id", "steps", "", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "surveyProgressId", "customization", "Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "sender", "Lio/intercom/android/sdk/survey/model/SurveySenderData;", "stepCount", "", "isDismissible", "", "showProgressBar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/intercom/android/sdk/survey/model/SurveyCustomization;Lio/intercom/android/sdk/survey/model/SurveySenderData;IZZ)V", "get_format", "()Ljava/lang/String;", "getId", "getSteps", "()Ljava/util/List;", "getSurveyProgressId", "getCustomization", "()Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "getSender", "()Lio/intercom/android/sdk/survey/model/SurveySenderData;", "getStepCount", "()I", "()Z", "getShowProgressBar", "format", "Lio/intercom/android/sdk/survey/model/SurveyData$SurveyFormat;", "getFormat", "()Lio/intercom/android/sdk/survey/model/SurveyData$SurveyFormat;", "formatMetric", "getFormatMetric", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "StepType", "SurveyFormat", "SurveyActions", "Step", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final SurveyData NULL = new SurveyData("1", "", C6565s.n(), "0", new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null), new SurveySenderData((String) null, (String) null, (String) null, (SurveySenderAvatar) null, 15, (DefaultConstructorMarker) null), 0, true, false, 256, (DefaultConstructorMarker) null);
    @c("format")
    private final String _format;
    @c("customization_options")
    private final SurveyCustomization customization;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f70224id;
    @c("dismissible")
    private final boolean isDismissible;
    @c("sender")
    private final SurveySenderData sender;
    @c("show_progress_bar")
    private final boolean showProgressBar;
    @c("step_count")
    private final int stepCount;
    @c("steps")
    private final List<Step> steps;
    @c("survey_progress_id")
    private final String surveyProgressId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/survey/model/SurveyData;", "getNULL", "()Lio/intercom/android/sdk/survey/model/SurveyData;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SurveyData getNULL() {
            return SurveyData.NULL;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$StepType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT", "QUESTION", "INTRO", "THANK_YOU", "UNSUPPORTED", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum StepType {
        CONTENT,
        QUESTION,
        INTRO,
        THANK_YOU,
        UNSUPPORTED;

        static {
            StepType[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$SurveyFormat;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL_FORMAT", "LARGE_FORMAT", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum SurveyFormat {
        SMALL_FORMAT,
        LARGE_FORMAT;

        static {
            SurveyFormat[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.survey.model.SurveyData$SurveyFormat[] r0 = io.intercom.android.sdk.survey.model.SurveyData.SurveyFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.survey.model.SurveyData$SurveyFormat r1 = io.intercom.android.sdk.survey.model.SurveyData.SurveyFormat.SMALL_FORMAT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.survey.model.SurveyData$SurveyFormat r1 = io.intercom.android.sdk.survey.model.SurveyData.SurveyFormat.LARGE_FORMAT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.model.SurveyData.WhenMappings.<clinit>():void");
        }
    }

    public SurveyData(String str, String str2, List<Step> list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11) {
        C6496s.h(str, "_format");
        C6496s.h(str2, "id");
        C6496s.h(list, "steps");
        C6496s.h(str3, "surveyProgressId");
        C6496s.h(surveyCustomization, "customization");
        this._format = str;
        this.f70224id = str2;
        this.steps = list;
        this.surveyProgressId = str3;
        this.customization = surveyCustomization;
        this.sender = surveySenderData;
        this.stepCount = i10;
        this.isDismissible = z10;
        this.showProgressBar = z11;
    }

    public static /* synthetic */ SurveyData copy$default(SurveyData surveyData, String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11, int i11, Object obj) {
        SurveyData surveyData2 = surveyData;
        int i12 = i11;
        return surveyData.copy((i12 & 1) != 0 ? surveyData2._format : str, (i12 & 2) != 0 ? surveyData2.f70224id : str2, (i12 & 4) != 0 ? surveyData2.steps : list, (i12 & 8) != 0 ? surveyData2.surveyProgressId : str3, (i12 & 16) != 0 ? surveyData2.customization : surveyCustomization, (i12 & 32) != 0 ? surveyData2.sender : surveySenderData, (i12 & 64) != 0 ? surveyData2.stepCount : i10, (i12 & 128) != 0 ? surveyData2.isDismissible : z10, (i12 & 256) != 0 ? surveyData2.showProgressBar : z11);
    }

    public final String component1() {
        return this._format;
    }

    public final String component2() {
        return this.f70224id;
    }

    public final List<Step> component3() {
        return this.steps;
    }

    public final String component4() {
        return this.surveyProgressId;
    }

    public final SurveyCustomization component5() {
        return this.customization;
    }

    public final SurveySenderData component6() {
        return this.sender;
    }

    public final int component7() {
        return this.stepCount;
    }

    public final boolean component8() {
        return this.isDismissible;
    }

    public final boolean component9() {
        return this.showProgressBar;
    }

    public final SurveyData copy(String str, String str2, List<Step> list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11) {
        C6496s.h(str, "_format");
        C6496s.h(str2, "id");
        C6496s.h(list, "steps");
        C6496s.h(str3, "surveyProgressId");
        SurveyCustomization surveyCustomization2 = surveyCustomization;
        C6496s.h(surveyCustomization2, "customization");
        return new SurveyData(str, str2, list, str3, surveyCustomization2, surveySenderData, i10, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) obj;
        return C6496s.c(this._format, surveyData._format) && C6496s.c(this.f70224id, surveyData.f70224id) && C6496s.c(this.steps, surveyData.steps) && C6496s.c(this.surveyProgressId, surveyData.surveyProgressId) && C6496s.c(this.customization, surveyData.customization) && C6496s.c(this.sender, surveyData.sender) && this.stepCount == surveyData.stepCount && this.isDismissible == surveyData.isDismissible && this.showProgressBar == surveyData.showProgressBar;
    }

    public final SurveyCustomization getCustomization() {
        return this.customization;
    }

    public final SurveyFormat getFormat() {
        if (Integer.parseInt(this._format) == 0) {
            return SurveyFormat.SMALL_FORMAT;
        }
        return SurveyFormat.LARGE_FORMAT;
    }

    public final String getFormatMetric() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getFormat().ordinal()];
        if (i10 == 1) {
            return "small_full_screen";
        }
        if (i10 == 2) {
            return "large_full_screen";
        }
        throw new C6535s();
    }

    public final String getId() {
        return this.f70224id;
    }

    public final SurveySenderData getSender() {
        return this.sender;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final List<Step> getSteps() {
        return this.steps;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public final String get_format() {
        return this._format;
    }

    public int hashCode() {
        int hashCode = ((((((((this._format.hashCode() * 31) + this.f70224id.hashCode()) * 31) + this.steps.hashCode()) * 31) + this.surveyProgressId.hashCode()) * 31) + this.customization.hashCode()) * 31;
        SurveySenderData surveySenderData = this.sender;
        return ((((((hashCode + (surveySenderData == null ? 0 : surveySenderData.hashCode())) * 31) + Integer.hashCode(this.stepCount)) * 31) + Boolean.hashCode(this.isDismissible)) * 31) + Boolean.hashCode(this.showProgressBar);
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    public String toString() {
        return "SurveyData(_format=" + this._format + ", id=" + this.f70224id + ", steps=" + this.steps + ", surveyProgressId=" + this.surveyProgressId + ", customization=" + this.customization + ", sender=" + this.sender + ", stepCount=" + this.stepCount + ", isDismissible=" + this.isDismissible + ", showProgressBar=" + this.showProgressBar + ')';
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$SurveyActions;", "", "actionTitle", "", "id", "", "webUrl", "androidUri", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getActionTitle", "()Ljava/lang/String;", "getId", "()I", "getWebUrl", "getAndroidUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SurveyActions {
        public static final int $stable = 0;
        @c("action_title")
        private final String actionTitle;
        @c("android_uri")
        private final String androidUri;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final int f70228id;
        @c("web_url")
        private final String webUrl;

        public SurveyActions(String str, int i10, String str2, String str3) {
            C6496s.h(str, "actionTitle");
            this.actionTitle = str;
            this.f70228id = i10;
            this.webUrl = str2;
            this.androidUri = str3;
        }

        public static /* synthetic */ SurveyActions copy$default(SurveyActions surveyActions, String str, int i10, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = surveyActions.actionTitle;
            }
            if ((i11 & 2) != 0) {
                i10 = surveyActions.f70228id;
            }
            if ((i11 & 4) != 0) {
                str2 = surveyActions.webUrl;
            }
            if ((i11 & 8) != 0) {
                str3 = surveyActions.androidUri;
            }
            return surveyActions.copy(str, i10, str2, str3);
        }

        public final String component1() {
            return this.actionTitle;
        }

        public final int component2() {
            return this.f70228id;
        }

        public final String component3() {
            return this.webUrl;
        }

        public final String component4() {
            return this.androidUri;
        }

        public final SurveyActions copy(String str, int i10, String str2, String str3) {
            C6496s.h(str, "actionTitle");
            return new SurveyActions(str, i10, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyActions)) {
                return false;
            }
            SurveyActions surveyActions = (SurveyActions) obj;
            return C6496s.c(this.actionTitle, surveyActions.actionTitle) && this.f70228id == surveyActions.f70228id && C6496s.c(this.webUrl, surveyActions.webUrl) && C6496s.c(this.androidUri, surveyActions.androidUri);
        }

        public final String getActionTitle() {
            return this.actionTitle;
        }

        public final String getAndroidUri() {
            return this.androidUri;
        }

        public final int getId() {
            return this.f70228id;
        }

        public final String getWebUrl() {
            return this.webUrl;
        }

        public int hashCode() {
            int hashCode = ((this.actionTitle.hashCode() * 31) + Integer.hashCode(this.f70228id)) * 31;
            String str = this.webUrl;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.androidUri;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "SurveyActions(actionTitle=" + this.actionTitle + ", id=" + this.f70228id + ", webUrl=" + this.webUrl + ", androidUri=" + this.androidUri + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SurveyActions(String str, int i10, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001'BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÂ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003JY\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020\nH×\u0001J\t\u0010&\u001a\u00020\u0006H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "id", "", "questions", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question;", "_type", "", "actions", "Lio/intercom/android/sdk/survey/model/SurveyData$SurveyActions;", "customButtonText", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Ljava/lang/String;)V", "getBlocks", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getQuestions", "getActions", "getCustomButtonText", "type", "Lio/intercom/android/sdk/survey/model/SurveyData$StepType;", "getType", "()Lio/intercom/android/sdk/survey/model/SurveyData$StepType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Question", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Step {
        public static final int $stable = 8;
        @c("step_type")
        private final int _type;
        @c("actions")
        private final List<SurveyActions> actions;
        @c("blocks")
        private final List<Block.Builder> blocks;
        @c("custom_button_text")
        private final String customButtonText;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final String f70225id;
        @c("questions")
        private final List<Question> questions;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001:\r\u001d\u001e\u001f !\"#$%&'()B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÂ\u0003J\t\u0010\u0016\u001a\u00020\nHÂ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\bH×\u0001J\t\u0010\u001c\u001a\u00020\u0006H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question;", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "id", "", "questionType", "", "questionData", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;", "<init>", "(Ljava/util/List;Ljava/lang/String;ILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;)V", "getBlocks", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "QuestionType", "QuestionValidation", "QuestionData", "QuestionModel", "DropDownQuestionModel", "SingleChoiceQuestionModel", "MultipleChoiceQuestionModel", "ShortTextQuestionModel", "DatePickerQuestionModel", "LongTextQuestionModel", "NumericRatingQuestionModel", "UploadFileQuestionModel", "UnsupportedQuestion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Question {
            public static final int $stable = 8;
            @c("blocks")
            private final List<Block.Builder> blocks;
            @c("id")

            /* renamed from: id  reason: collision with root package name */
            private final String f70226id;
            @c("data")
            private final QuestionData questionData;
            @c("question_type")
            private final int questionType;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DatePickerQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class DatePickerQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public DatePickerQuestionModel(String str, List<Block.Builder> list, boolean z10) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b#\u0010\u001c¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$LongTextQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "", "id", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "title", "", "isRequired", "placeholder", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "validationType", "", "characterLimit", "Lc1/h;", "minHeight", "maxLine", "placeHolderStringRes", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;Ljava/lang/Integer;FILjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "getValidationType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "Ljava/lang/Integer;", "getCharacterLimit", "()Ljava/lang/Integer;", "F", "getMinHeight-D9Ej5fM", "()F", "I", "getMaxLine", "()I", "getPlaceHolderStringRes", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class LongTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;
                private final Integer characterLimit;
                private final int maxLine;
                private final float minHeight;
                private final Integer placeHolderStringRes;
                private final String placeholder;
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType2, Integer num, float f10, int i10, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z10, str2, validationType2, num, f10, i10, num2);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final int getMaxLine() {
                    return this.maxLine;
                }

                /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
                public final float m464getMinHeightD9Ej5fM() {
                    return this.minHeight;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public /* synthetic */ LongTextQuestionModel(java.lang.String r14, java.util.List r15, boolean r16, java.lang.String r17, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType r18, java.lang.Integer r19, float r20, int r21, java.lang.Integer r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
                    /*
                        r13 = this;
                        r0 = r23
                        r1 = r0 & 8
                        if (r1 == 0) goto L_0x000a
                        java.lang.String r1 = ""
                        r6 = r1
                        goto L_0x000c
                    L_0x000a:
                        r6 = r17
                    L_0x000c:
                        r1 = r0 & 64
                        if (r1 == 0) goto L_0x0018
                        c1.h$a r1 = c1.h.f19213b
                        float r1 = r1.c()
                        r9 = r1
                        goto L_0x001a
                    L_0x0018:
                        r9 = r20
                    L_0x001a:
                        r1 = r0 & 128(0x80, float:1.794E-43)
                        if (r1 == 0) goto L_0x0021
                        r1 = 6
                        r10 = r1
                        goto L_0x0023
                    L_0x0021:
                        r10 = r21
                    L_0x0023:
                        r0 = r0 & 256(0x100, float:3.59E-43)
                        if (r0 == 0) goto L_0x002a
                        r0 = 0
                        r11 = r0
                        goto L_0x002c
                    L_0x002a:
                        r11 = r22
                    L_0x002c:
                        r12 = 0
                        r2 = r13
                        r3 = r14
                        r4 = r15
                        r5 = r16
                        r7 = r18
                        r8 = r19
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel.<init>(java.lang.String, java.util.List, boolean, java.lang.String, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType, java.lang.Integer, float, int, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                private LongTextQuestionModel(String str, List<Block.Builder> list, boolean z10, String str2, QuestionValidation.ValidationType validationType2, Integer num, float f10, int i10, Integer num2) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(str2, "placeholder");
                    C6496s.h(validationType2, "validationType");
                    this.placeholder = str2;
                    this.validationType = validationType2;
                    this.characterLimit = num;
                    this.minHeight = f10;
                    this.maxLine = i10;
                    this.placeHolderStringRes = num2;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$MultipleChoiceQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "includeOther", "minSelection", "", "maxSelection", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;ZII)V", "getOptions", "()Ljava/util/List;", "getIncludeOther", "()Z", "getMinSelection", "()I", "getMaxSelection", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class MultipleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final int maxSelection;
                private final int minSelection;
                private final List<String> options;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public MultipleChoiceQuestionModel(String str, List<Block.Builder> list, boolean z10, List<String> list2, boolean z11, int i10, int i11) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(list2, "options");
                    this.options = list2;
                    this.includeOther = z11;
                    this.minSelection = i10;
                    this.maxSelection = i11;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                public final List<String> getOptions() {
                    return this.options;
                }
            }

            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "lowerLabel", "upperLabel", "scaleStart", "", "scaleEnd", "questionSubType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;IILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;)V", "getOptions", "()Ljava/util/List;", "getLowerLabel", "()Ljava/lang/String;", "getUpperLabel", "getScaleStart", "()I", "getScaleEnd", "getQuestionSubType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "RatingOption", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class NumericRatingQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final String lowerLabel;
                private final List<RatingOption> options;
                private final QuestionData.QuestionSubType questionSubType;
                private final int scaleEnd;
                private final int scaleStart;
                private final String upperLabel;

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "", "<init>", "()V", "EmojiRatingOption", "NumericRatingOption", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$NumericRatingOption;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static abstract class RatingOption {
                    public static final int $stable = 0;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "value", "", "emojiUrl", "", "unicode", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()I", "getEmojiUrl", "()Ljava/lang/String;", "getUnicode", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final class EmojiRatingOption extends RatingOption {
                        public static final int $stable = 0;
                        @c("image_url")
                        private final String emojiUrl;
                        @c("unicodeEmoticon")
                        private final String unicode;
                        @c("value")
                        private final int value;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public EmojiRatingOption(int i10, String str, String str2) {
                            super((DefaultConstructorMarker) null);
                            C6496s.h(str, "emojiUrl");
                            C6496s.h(str2, "unicode");
                            this.value = i10;
                            this.emojiUrl = str;
                            this.unicode = str2;
                        }

                        public final String getEmojiUrl() {
                            return this.emojiUrl;
                        }

                        public final String getUnicode() {
                            return this.unicode;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$NumericRatingOption;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "value", "", "<init>", "(I)V", "getValue", "()I", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final class NumericRatingOption extends RatingOption {
                        public static final int $stable = 0;
                        private final int value;

                        public NumericRatingOption(int i10) {
                            super((DefaultConstructorMarker) null);
                            this.value = i10;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    public /* synthetic */ RatingOption(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private RatingOption() {
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public NumericRatingQuestionModel(String str, List<Block.Builder> list, boolean z10, List<? extends RatingOption> list2, String str2, String str3, int i10, int i11, QuestionData.QuestionSubType questionSubType2) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    List<? extends RatingOption> list3 = list2;
                    String str4 = str2;
                    String str5 = str3;
                    QuestionData.QuestionSubType questionSubType3 = questionSubType2;
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(list3, "options");
                    C6496s.h(str4, "lowerLabel");
                    C6496s.h(str5, "upperLabel");
                    C6496s.h(questionSubType3, "questionSubType");
                    this.options = list3;
                    this.lowerLabel = str4;
                    this.upperLabel = str5;
                    this.scaleStart = i10;
                    this.scaleEnd = i11;
                    this.questionSubType = questionSubType3;
                }

                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final List<RatingOption> getOptions() {
                    return this.options;
                }

                public final QuestionData.QuestionSubType getQuestionSubType() {
                    return this.questionSubType;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                public final String getUpperLabel() {
                    return this.upperLabel;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionType;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "TEXT", "DROPDOWN", "RATING_SCALE", "MULTI_SELECT", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public enum QuestionType {
                INPUT,
                TEXT,
                DROPDOWN,
                RATING_SCALE,
                MULTI_SELECT;

                static {
                    QuestionType[] $values;
                    $ENTRIES = C6714a.a($values);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000f\u001a\u00020\u0003H×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "", "_type", "", "<init>", "(I)V", "validationType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "getValidationType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ValidationType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class QuestionValidation {
                public static final int $stable = 0;
                @c("type")
                private final int _type;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "NUMBER", "EMAIL", "PHONE", "NO_VALIDATION", "FLOAT", "INTEGER", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public enum ValidationType {
                    TEXT,
                    NUMBER,
                    EMAIL,
                    PHONE,
                    NO_VALIDATION,
                    FLOAT,
                    INTEGER;

                    static {
                        ValidationType[] $values;
                        $ENTRIES = C6714a.a($values);
                    }

                    public static EnumEntries getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionValidation(int i10) {
                    this._type = i10;
                }

                private final int component1() {
                    return this._type;
                }

                public static /* synthetic */ QuestionValidation copy$default(QuestionValidation questionValidation, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = questionValidation._type;
                    }
                    return questionValidation.copy(i10);
                }

                public final QuestionValidation copy(int i10) {
                    return new QuestionValidation(i10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof QuestionValidation) && this._type == ((QuestionValidation) obj)._type;
                }

                public final ValidationType getValidationType() {
                    int i10 = this._type;
                    ValidationType validationType = ValidationType.TEXT;
                    if (i10 == validationType.ordinal()) {
                        return validationType;
                    }
                    ValidationType validationType2 = ValidationType.NUMBER;
                    if (i10 == validationType2.ordinal()) {
                        return validationType2;
                    }
                    ValidationType validationType3 = ValidationType.EMAIL;
                    if (i10 == validationType3.ordinal()) {
                        return validationType3;
                    }
                    ValidationType validationType4 = ValidationType.PHONE;
                    if (i10 == validationType4.ordinal()) {
                        return validationType4;
                    }
                    ValidationType validationType5 = ValidationType.FLOAT;
                    if (i10 == validationType5.ordinal()) {
                        return validationType5;
                    }
                    ValidationType validationType6 = ValidationType.INTEGER;
                    if (i10 == validationType6.ordinal()) {
                        return validationType6;
                    }
                    return ValidationType.NO_VALIDATION;
                }

                public int hashCode() {
                    return Integer.hashCode(this._type);
                }

                public String toString() {
                    return "QuestionValidation(_type=" + this._type + ')';
                }
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$SingleChoiceQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "includeOther", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Z)V", "getOptions", "()Ljava/util/List;", "getIncludeOther", "()Z", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class SingleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final List<String> options;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public SingleChoiceQuestionModel(String str, List<Block.Builder> list, boolean z10, List<String> list2, boolean z11) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(list2, "options");
                    this.options = list2;
                    this.includeOther = z11;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final List<String> getOptions() {
                    return this.options;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UnsupportedQuestion;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UnsupportedQuestion extends QuestionModel {
                public static final int $stable = 0;
                public static final UnsupportedQuestion INSTANCE = new UnsupportedQuestion();

                private UnsupportedQuestion() {
                    super("", C6565s.n(), (StringProvider) null, false, 4, (DefaultConstructorMarker) null);
                }
            }

            public Question(List<Block.Builder> list, String str, int i10, QuestionData questionData2) {
                C6496s.h(list, "blocks");
                C6496s.h(str, "id");
                C6496s.h(questionData2, "questionData");
                this.blocks = list;
                this.f70226id = str;
                this.questionType = i10;
                this.questionData = questionData2;
            }

            private final int component3() {
                return this.questionType;
            }

            private final QuestionData component4() {
                return this.questionData;
            }

            public static /* synthetic */ Question copy$default(Question question, List<Block.Builder> list, String str, int i10, QuestionData questionData2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = question.blocks;
                }
                if ((i11 & 2) != 0) {
                    str = question.f70226id;
                }
                if ((i11 & 4) != 0) {
                    i10 = question.questionType;
                }
                if ((i11 & 8) != 0) {
                    questionData2 = question.questionData;
                }
                return question.copy(list, str, i10, questionData2);
            }

            public final List<Block.Builder> component1() {
                return this.blocks;
            }

            public final String component2() {
                return this.f70226id;
            }

            public final Question copy(List<Block.Builder> list, String str, int i10, QuestionData questionData2) {
                C6496s.h(list, "blocks");
                C6496s.h(str, "id");
                C6496s.h(questionData2, "questionData");
                return new Question(list, str, i10, questionData2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Question)) {
                    return false;
                }
                Question question = (Question) obj;
                return C6496s.c(this.blocks, question.blocks) && C6496s.c(this.f70226id, question.f70226id) && this.questionType == question.questionType && C6496s.c(this.questionData, question.questionData);
            }

            public final List<Block.Builder> getBlocks() {
                return this.blocks;
            }

            public final String getId() {
                return this.f70226id;
            }

            public final QuestionModel getQuestionModel() {
                ArrayList arrayList;
                QuestionData.QuestionSubType questionSubType;
                QuestionValidation.ValidationType validationType;
                QuestionValidation.ValidationType validationType2;
                int i10 = this.questionType;
                if (i10 == QuestionType.DROPDOWN.ordinal()) {
                    String str = this.f70226id;
                    List<Block.Builder> list = this.blocks;
                    boolean required = this.questionData.getRequired();
                    String placeholder = this.questionData.getPlaceholder();
                    g<h> options = this.questionData.getOptions();
                    ArrayList arrayList2 = new ArrayList(C6565s.y(options, 10));
                    for (h g10 : options) {
                        arrayList2.add(g10.g());
                    }
                    return new DropDownQuestionModel(str, list, required, arrayList2, placeholder, (Integer) null, 32, (DefaultConstructorMarker) null);
                } else if (i10 == QuestionType.INPUT.ordinal()) {
                    String str2 = this.f70226id;
                    List<Block.Builder> list2 = this.blocks;
                    boolean required2 = this.questionData.getRequired();
                    String placeholder2 = this.questionData.getPlaceholder();
                    if (this.questionData.getValidation() != null) {
                        validationType2 = this.questionData.getValidation().getValidationType();
                    } else {
                        validationType2 = QuestionValidation.ValidationType.NO_VALIDATION;
                    }
                    return new ShortTextQuestionModel(str2, list2, required2, placeholder2, validationType2, this.questionData.getCharacterLimit(), false, (Integer) null, (Integer) null, 448, (DefaultConstructorMarker) null);
                } else if (i10 == QuestionType.TEXT.ordinal()) {
                    String str3 = this.f70226id;
                    List<Block.Builder> list3 = this.blocks;
                    boolean required3 = this.questionData.getRequired();
                    String placeholder3 = this.questionData.getPlaceholder();
                    if (this.questionData.getValidation() != null) {
                        validationType = this.questionData.getValidation().getValidationType();
                    } else {
                        validationType = QuestionValidation.ValidationType.NO_VALIDATION;
                    }
                    return new LongTextQuestionModel(str3, list3, required3, placeholder3, validationType, this.questionData.getCharacterLimit(), 0.0f, 0, (Integer) null, 448, (DefaultConstructorMarker) null);
                } else if (i10 == QuestionType.RATING_SCALE.ordinal()) {
                    String str4 = this.f70226id;
                    List<Block.Builder> list4 = this.blocks;
                    boolean required4 = this.questionData.getRequired();
                    String lowerLabel = this.questionData.getLowerLabel();
                    String upperLabel = this.questionData.getUpperLabel();
                    int scaleStart = this.questionData.getScaleStart();
                    int scaleEnd = this.questionData.getScaleEnd();
                    if (this.questionData.getQuestionSubtype() == QuestionData.QuestionSubType.EMOJI.ordinal()) {
                        e eVar = new e();
                        g<h> options2 = this.questionData.getOptions();
                        ArrayList arrayList3 = new ArrayList(C6565s.y(options2, 10));
                        for (h i11 : options2) {
                            arrayList3.add((NumericRatingQuestionModel.RatingOption.EmojiRatingOption) eVar.i(i11, NumericRatingQuestionModel.RatingOption.EmojiRatingOption.class));
                        }
                        arrayList = arrayList3;
                    } else {
                        i iVar = new i(this.questionData.getScaleStart(), this.questionData.getScaleEnd());
                        ArrayList arrayList4 = new ArrayList(C6565s.y(iVar, 10));
                        Iterator it = iVar.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new NumericRatingQuestionModel.RatingOption.NumericRatingOption(((L) it).a()));
                        }
                        arrayList = arrayList4;
                    }
                    int questionSubtype = this.questionData.getQuestionSubtype();
                    QuestionData.QuestionSubType questionSubType2 = QuestionData.QuestionSubType.NUMERIC;
                    if (questionSubtype != questionSubType2.ordinal()) {
                        questionSubType2 = QuestionData.QuestionSubType.STARS;
                        if (questionSubtype != questionSubType2.ordinal()) {
                            questionSubType2 = QuestionData.QuestionSubType.EMOJI;
                            if (questionSubtype != questionSubType2.ordinal()) {
                                questionSubType2 = QuestionData.QuestionSubType.NPS;
                                if (questionSubtype != questionSubType2.ordinal()) {
                                    questionSubType = QuestionData.QuestionSubType.UNSUPPORTED;
                                    return new NumericRatingQuestionModel(str4, list4, required4, arrayList, lowerLabel, upperLabel, scaleStart, scaleEnd, questionSubType);
                                }
                            }
                        }
                    }
                    questionSubType = questionSubType2;
                    return new NumericRatingQuestionModel(str4, list4, required4, arrayList, lowerLabel, upperLabel, scaleStart, scaleEnd, questionSubType);
                } else if (i10 != QuestionType.MULTI_SELECT.ordinal()) {
                    return UnsupportedQuestion.INSTANCE;
                } else {
                    if (this.questionData.getMaxSelection() == 1) {
                        String str5 = this.f70226id;
                        List<Block.Builder> list5 = this.blocks;
                        boolean required5 = this.questionData.getRequired();
                        g<h> options3 = this.questionData.getOptions();
                        ArrayList arrayList5 = new ArrayList(C6565s.y(options3, 10));
                        for (h g11 : options3) {
                            arrayList5.add(g11.g());
                        }
                        return new SingleChoiceQuestionModel(str5, list5, required5, arrayList5, this.questionData.getIncludeOther());
                    }
                    String str6 = this.f70226id;
                    List<Block.Builder> list6 = this.blocks;
                    boolean required6 = this.questionData.getRequired();
                    g<h> options4 = this.questionData.getOptions();
                    ArrayList arrayList6 = new ArrayList(C6565s.y(options4, 10));
                    for (h g12 : options4) {
                        arrayList6.add(g12.g());
                    }
                    return new MultipleChoiceQuestionModel(str6, list6, required6, arrayList6, this.questionData.getIncludeOther(), this.questionData.getMinSelection(), this.questionData.getMaxSelection());
                }
            }

            public int hashCode() {
                return (((((this.blocks.hashCode() * 31) + this.f70226id.hashCode()) * 31) + Integer.hashCode(this.questionType)) * 31) + this.questionData.hashCode();
            }

            public String toString() {
                return "Question(blocks=" + this.blocks + ", id=" + this.f70226id + ", questionType=" + this.questionType + ", questionData=" + this.questionData + ')';
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "placeholder", "placeHolderStringRes", "", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getOptions", "()Ljava/util/List;", "getPlaceholder", "()Ljava/lang/String;", "getPlaceHolderStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class DropDownQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final List<String> options;
                private final Integer placeHolderStringRes;
                private final String placeholder;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ DropDownQuestionModel(String str, List list, boolean z10, List list2, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z10, list2, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? null : num);
                }

                public final List<String> getOptions() {
                    return this.options;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public DropDownQuestionModel(String str, List<Block.Builder> list, boolean z10, List<String> list2, String str2, Integer num) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(list2, "options");
                    C6496s.h(str2, "placeholder");
                    this.options = list2;
                    this.placeholder = str2;
                    this.placeHolderStringRes = num;
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$ShortTextQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "placeholder", "validationType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "characterLimit", "", "enabled", "placeHolderStringRes", "titleStringRes", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getPlaceholder", "()Ljava/lang/String;", "getValidationType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "getCharacterLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Z", "getPlaceHolderStringRes", "getTitleStringRes", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ShortTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;
                private final Integer characterLimit;
                private final boolean enabled;
                private final Integer placeHolderStringRes;
                private final String placeholder;
                private final Integer titleStringRes;
                private final QuestionValidation.ValidationType validationType;

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public /* synthetic */ ShortTextQuestionModel(java.lang.String r13, java.util.List r14, boolean r15, java.lang.String r16, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType r17, java.lang.Integer r18, boolean r19, java.lang.Integer r20, java.lang.Integer r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
                    /*
                        r12 = this;
                        r0 = r22
                        r1 = r0 & 8
                        if (r1 == 0) goto L_0x000a
                        java.lang.String r1 = ""
                        r6 = r1
                        goto L_0x000c
                    L_0x000a:
                        r6 = r16
                    L_0x000c:
                        r1 = r0 & 64
                        if (r1 == 0) goto L_0x0013
                        r1 = 1
                        r9 = r1
                        goto L_0x0015
                    L_0x0013:
                        r9 = r19
                    L_0x0015:
                        r1 = r0 & 128(0x80, float:1.794E-43)
                        r2 = 0
                        if (r1 == 0) goto L_0x001c
                        r10 = r2
                        goto L_0x001e
                    L_0x001c:
                        r10 = r20
                    L_0x001e:
                        r0 = r0 & 256(0x100, float:3.59E-43)
                        if (r0 == 0) goto L_0x0024
                        r11 = r2
                        goto L_0x0026
                    L_0x0024:
                        r11 = r21
                    L_0x0026:
                        r2 = r12
                        r3 = r13
                        r4 = r14
                        r5 = r15
                        r7 = r17
                        r8 = r18
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel.<init>(java.lang.String, java.util.List, boolean, java.lang.String, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType, java.lang.Integer, boolean, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getEnabled() {
                    return this.enabled;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public final Integer getTitleStringRes() {
                    return this.titleStringRes;
                }

                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public ShortTextQuestionModel(String str, List<Block.Builder> list, boolean z10, String str2, QuestionValidation.ValidationType validationType2, Integer num, boolean z11, Integer num2, Integer num3) {
                    super(str, list, (StringProvider) null, z10, 4, (DefaultConstructorMarker) null);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(str2, "placeholder");
                    C6496s.h(validationType2, "validationType");
                    this.placeholder = str2;
                    this.validationType = validationType2;
                    this.characterLimit = num;
                    this.enabled = z11;
                    this.placeHolderStringRes = num2;
                    this.titleStringRes = num3;
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UploadFileQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isRequired", "", "maxSelection", "", "supportedFileType", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/ui/common/StringProvider;ZILjava/util/Set;)V", "getMaxSelection", "()I", "getSupportedFileType", "()Ljava/util/Set;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UploadFileQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final int maxSelection;
                private final Set<String> supportedFileType;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ UploadFileQuestionModel(String str, List list, StringProvider stringProvider, boolean z10, int i10, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i11 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z10, i10, set);
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final Set<String> getSupportedFileType() {
                    return this.supportedFileType;
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public UploadFileQuestionModel(String str, List<Block.Builder> list, StringProvider stringProvider, boolean z10, int i10, Set<String> set) {
                    super(str, list, stringProvider, z10);
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(stringProvider, b.f37480c);
                    C6496s.h(set, "supportedFileType");
                    this.maxSelection = i10;
                    this.supportedFileType = set;
                }
            }

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/ui/common/StringProvider;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "()Ljava/util/List;", "getDescription", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "()Z", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static class QuestionModel {
                public static final int $stable = 8;
                private final StringProvider description;

                /* renamed from: id  reason: collision with root package name */
                private final String f70227id;
                private final boolean isRequired;
                private final List<Block.Builder> title;

                public QuestionModel(String str, List<Block.Builder> list, StringProvider stringProvider, boolean z10) {
                    C6496s.h(str, "id");
                    C6496s.h(list, b.f37461S);
                    C6496s.h(stringProvider, b.f37480c);
                    this.f70227id = str;
                    this.title = list;
                    this.description = stringProvider;
                    this.isRequired = z10;
                }

                public final StringProvider getDescription() {
                    return this.description;
                }

                public final String getId() {
                    return this.f70227id;
                }

                public final List<Block.Builder> getTitle() {
                    return this.title;
                }

                public final boolean isRequired() {
                    return this.isRequired;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ QuestionModel(String str, List list, StringProvider stringProvider, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i10 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z10);
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b4\b\b\u0018\u00002\u00020\u0001:\u0001DBw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b+\u0010\u0017J\u0010\u0010,\u001a\u00020\nH×\u0001¢\u0006\u0004\b,\u0010\u001fJ\u001a\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b5\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001fR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b9\u0010\u001fR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b;\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b<\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b=\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010(R\u0011\u0010C\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bB\u0010\u0017¨\u0006E"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;", "", "", "_placeholder", "", "required", "Lcom/google/gson/g;", "options", "lowerLabel", "upperLabel", "", "scaleStart", "scaleEnd", "includeOther", "maxSelection", "minSelection", "questionSubtype", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "validation", "characterLimit", "<init>", "(Ljava/lang/String;ZLcom/google/gson/g;Ljava/lang/String;Ljava/lang/String;IIZIIILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/google/gson/g;", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "component13", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ZLcom/google/gson/g;Ljava/lang/String;Ljava/lang/String;IIZIIILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;Ljava/lang/Integer;)Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Z", "getRequired", "Lcom/google/gson/g;", "getOptions", "getLowerLabel", "getUpperLabel", "I", "getScaleStart", "getScaleEnd", "getIncludeOther", "getMaxSelection", "getMinSelection", "getQuestionSubtype", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "getValidation", "Ljava/lang/Integer;", "getCharacterLimit", "getPlaceholder", "placeholder", "QuestionSubType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class QuestionData {
                public static final int $stable = 8;
                @c("placeholder")
                private final String _placeholder;
                @c("character_limit")
                private final Integer characterLimit;
                @c("include_other")
                private final boolean includeOther;
                @c("lower_label")
                private final String lowerLabel;
                @c("maximum_selection")
                private final int maxSelection;
                @c("minimum_selection")
                private final int minSelection;
                @c("options")
                private final g options;
                @c("type")
                private final int questionSubtype;
                @c("required")
                private final boolean required;
                @c("scale_end")
                private final int scaleEnd;
                @c("scale_start")
                private final int scaleStart;
                @c("upper_label")
                private final String upperLabel;
                @c("validation")
                private final QuestionValidation validation;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMERIC", "STARS", "EMOJI", "NPS", "UNSUPPORTED", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public enum QuestionSubType {
                    NUMERIC,
                    STARS,
                    EMOJI,
                    NPS,
                    UNSUPPORTED;

                    static {
                        QuestionSubType[] $values;
                        $ENTRIES = C6714a.a($values);
                    }

                    public static EnumEntries getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionData(String str, boolean z10, g gVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num) {
                    C6496s.h(gVar, "options");
                    C6496s.h(str2, "lowerLabel");
                    C6496s.h(str3, "upperLabel");
                    this._placeholder = str;
                    this.required = z10;
                    this.options = gVar;
                    this.lowerLabel = str2;
                    this.upperLabel = str3;
                    this.scaleStart = i10;
                    this.scaleEnd = i11;
                    this.includeOther = z11;
                    this.maxSelection = i12;
                    this.minSelection = i13;
                    this.questionSubtype = i14;
                    this.validation = questionValidation;
                    this.characterLimit = num;
                }

                private final String component1() {
                    return this._placeholder;
                }

                public static /* synthetic */ QuestionData copy$default(QuestionData questionData, String str, boolean z10, g gVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num, int i15, Object obj) {
                    QuestionData questionData2 = questionData;
                    int i16 = i15;
                    return questionData.copy((i16 & 1) != 0 ? questionData2._placeholder : str, (i16 & 2) != 0 ? questionData2.required : z10, (i16 & 4) != 0 ? questionData2.options : gVar, (i16 & 8) != 0 ? questionData2.lowerLabel : str2, (i16 & 16) != 0 ? questionData2.upperLabel : str3, (i16 & 32) != 0 ? questionData2.scaleStart : i10, (i16 & 64) != 0 ? questionData2.scaleEnd : i11, (i16 & 128) != 0 ? questionData2.includeOther : z11, (i16 & 256) != 0 ? questionData2.maxSelection : i12, (i16 & 512) != 0 ? questionData2.minSelection : i13, (i16 & 1024) != 0 ? questionData2.questionSubtype : i14, (i16 & 2048) != 0 ? questionData2.validation : questionValidation, (i16 & 4096) != 0 ? questionData2.characterLimit : num);
                }

                public final int component10() {
                    return this.minSelection;
                }

                public final int component11() {
                    return this.questionSubtype;
                }

                public final QuestionValidation component12() {
                    return this.validation;
                }

                public final Integer component13() {
                    return this.characterLimit;
                }

                public final boolean component2() {
                    return this.required;
                }

                public final g component3() {
                    return this.options;
                }

                public final String component4() {
                    return this.lowerLabel;
                }

                public final String component5() {
                    return this.upperLabel;
                }

                public final int component6() {
                    return this.scaleStart;
                }

                public final int component7() {
                    return this.scaleEnd;
                }

                public final boolean component8() {
                    return this.includeOther;
                }

                public final int component9() {
                    return this.maxSelection;
                }

                public final QuestionData copy(String str, boolean z10, g gVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num) {
                    g gVar2 = gVar;
                    C6496s.h(gVar2, "options");
                    String str4 = str2;
                    C6496s.h(str4, "lowerLabel");
                    String str5 = str3;
                    C6496s.h(str5, "upperLabel");
                    return new QuestionData(str, z10, gVar2, str4, str5, i10, i11, z11, i12, i13, i14, questionValidation, num);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QuestionData)) {
                        return false;
                    }
                    QuestionData questionData = (QuestionData) obj;
                    return C6496s.c(this._placeholder, questionData._placeholder) && this.required == questionData.required && C6496s.c(this.options, questionData.options) && C6496s.c(this.lowerLabel, questionData.lowerLabel) && C6496s.c(this.upperLabel, questionData.upperLabel) && this.scaleStart == questionData.scaleStart && this.scaleEnd == questionData.scaleEnd && this.includeOther == questionData.includeOther && this.maxSelection == questionData.maxSelection && this.minSelection == questionData.minSelection && this.questionSubtype == questionData.questionSubtype && C6496s.c(this.validation, questionData.validation) && C6496s.c(this.characterLimit, questionData.characterLimit);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                public final g getOptions() {
                    return this.options;
                }

                public final String getPlaceholder() {
                    String str = this._placeholder;
                    if (str == null) {
                        return "";
                    }
                    return str;
                }

                public final int getQuestionSubtype() {
                    return this.questionSubtype;
                }

                public final boolean getRequired() {
                    return this.required;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                public final QuestionValidation getValidation() {
                    return this.validation;
                }

                public int hashCode() {
                    String str = this._placeholder;
                    int i10 = 0;
                    int hashCode = (((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31) + this.options.hashCode()) * 31) + this.lowerLabel.hashCode()) * 31) + this.upperLabel.hashCode()) * 31) + Integer.hashCode(this.scaleStart)) * 31) + Integer.hashCode(this.scaleEnd)) * 31) + Boolean.hashCode(this.includeOther)) * 31) + Integer.hashCode(this.maxSelection)) * 31) + Integer.hashCode(this.minSelection)) * 31) + Integer.hashCode(this.questionSubtype)) * 31;
                    QuestionValidation questionValidation = this.validation;
                    int hashCode2 = (hashCode + (questionValidation == null ? 0 : questionValidation.hashCode())) * 31;
                    Integer num = this.characterLimit;
                    if (num != null) {
                        i10 = num.hashCode();
                    }
                    return hashCode2 + i10;
                }

                public String toString() {
                    return "QuestionData(_placeholder=" + this._placeholder + ", required=" + this.required + ", options=" + this.options + ", lowerLabel=" + this.lowerLabel + ", upperLabel=" + this.upperLabel + ", scaleStart=" + this.scaleStart + ", scaleEnd=" + this.scaleEnd + ", includeOther=" + this.includeOther + ", maxSelection=" + this.maxSelection + ", minSelection=" + this.minSelection + ", questionSubtype=" + this.questionSubtype + ", validation=" + this.validation + ", characterLimit=" + this.characterLimit + ')';
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ QuestionData(String str, boolean z10, g gVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, z10, (i15 & 4) != 0 ? new g() : gVar, str2, str3, i10, i11, z11, i12, i13, i14, questionValidation, num);
                }
            }
        }

        public Step(List<Block.Builder> list, String str, List<Question> list2, int i10, List<SurveyActions> list3, String str2) {
            C6496s.h(list, "blocks");
            C6496s.h(str, "id");
            C6496s.h(list2, "questions");
            C6496s.h(list3, "actions");
            this.blocks = list;
            this.f70225id = str;
            this.questions = list2;
            this._type = i10;
            this.actions = list3;
            this.customButtonText = str2;
        }

        private final int component4() {
            return this._type;
        }

        public static /* synthetic */ Step copy$default(Step step, List<Block.Builder> list, String str, List<Question> list2, int i10, List<SurveyActions> list3, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = step.blocks;
            }
            if ((i11 & 2) != 0) {
                str = step.f70225id;
            }
            String str3 = str;
            if ((i11 & 4) != 0) {
                list2 = step.questions;
            }
            List<Question> list4 = list2;
            if ((i11 & 8) != 0) {
                i10 = step._type;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                list3 = step.actions;
            }
            List<SurveyActions> list5 = list3;
            if ((i11 & 32) != 0) {
                str2 = step.customButtonText;
            }
            return step.copy(list, str3, list4, i12, list5, str2);
        }

        public final List<Block.Builder> component1() {
            return this.blocks;
        }

        public final String component2() {
            return this.f70225id;
        }

        public final List<Question> component3() {
            return this.questions;
        }

        public final List<SurveyActions> component5() {
            return this.actions;
        }

        public final String component6() {
            return this.customButtonText;
        }

        public final Step copy(List<Block.Builder> list, String str, List<Question> list2, int i10, List<SurveyActions> list3, String str2) {
            C6496s.h(list, "blocks");
            C6496s.h(str, "id");
            C6496s.h(list2, "questions");
            C6496s.h(list3, "actions");
            return new Step(list, str, list2, i10, list3, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return C6496s.c(this.blocks, step.blocks) && C6496s.c(this.f70225id, step.f70225id) && C6496s.c(this.questions, step.questions) && this._type == step._type && C6496s.c(this.actions, step.actions) && C6496s.c(this.customButtonText, step.customButtonText);
        }

        public final List<SurveyActions> getActions() {
            return this.actions;
        }

        public final List<Block.Builder> getBlocks() {
            return this.blocks;
        }

        public final String getCustomButtonText() {
            return this.customButtonText;
        }

        public final String getId() {
            return this.f70225id;
        }

        public final List<Question> getQuestions() {
            return this.questions;
        }

        public final StepType getType() {
            int i10 = this._type;
            if (i10 == 0) {
                return StepType.CONTENT;
            }
            if (i10 == 1) {
                return StepType.QUESTION;
            }
            if (i10 == 2) {
                return StepType.INTRO;
            }
            if (i10 != 3) {
                return StepType.UNSUPPORTED;
            }
            return StepType.THANK_YOU;
        }

        public int hashCode() {
            int hashCode = ((((((((this.blocks.hashCode() * 31) + this.f70225id.hashCode()) * 31) + this.questions.hashCode()) * 31) + Integer.hashCode(this._type)) * 31) + this.actions.hashCode()) * 31;
            String str = this.customButtonText;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Step(blocks=" + this.blocks + ", id=" + this.f70225id + ", questions=" + this.questions + ", _type=" + this._type + ", actions=" + this.actions + ", customButtonText=" + this.customButtonText + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Step(List list, String str, List list2, int i10, List list3, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, list2, i10, (i11 & 16) != 0 ? C6565s.n() : list3, (i11 & 32) != 0 ? null : str2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SurveyData(String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, surveyCustomization, surveySenderData, i10, z10, (i11 & 256) != 0 ? true : z11);
    }
}
