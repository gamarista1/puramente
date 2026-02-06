package io.intercom.android.sdk.survey;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState;", "", "<init>", "()V", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/survey/SurveyState$Content;", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "Lio/intercom/android/sdk/survey/SurveyState$Initial;", "Lio/intercom/android/sdk/survey/SurveyState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SurveyState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002*+BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003JW\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020'H×\u0001J\t\u0010(\u001a\u00020)H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content;", "Lio/intercom/android/sdk/survey/SurveyState;", "stepTitle", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "questions", "Lio/intercom/android/sdk/survey/QuestionState;", "secondaryCtaActions", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "primaryCta", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;)V", "getStepTitle", "()Ljava/util/List;", "getQuestions", "getSecondaryCtaActions", "getPrimaryCta", "()Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SecondaryCta", "PrimaryCta", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends SurveyState {
        public static final int $stable = 8;
        private final PrimaryCta primaryCta;
        private final List<QuestionState> questions;
        private final List<SecondaryCta> secondaryCtaActions;
        private final List<Block.Builder> stepTitle;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "", "<init>", "()V", "Fallback", "Custom", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Custom;", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Fallback;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class PrimaryCta {
            public static final int $stable = 0;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Custom;", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Custom extends PrimaryCta {
                public static final int $stable = 0;
                private final String text;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Custom(String str) {
                    super((DefaultConstructorMarker) null);
                    C6496s.h(str, AttributeType.TEXT);
                    this.text = str;
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = custom.text;
                    }
                    return custom.copy(str);
                }

                public final String component1() {
                    return this.text;
                }

                public final Custom copy(String str) {
                    C6496s.h(str, AttributeType.TEXT);
                    return new Custom(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Custom) && C6496s.c(this.text, ((Custom) obj).text);
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return "Custom(text=" + this.text + ')';
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Fallback;", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "fallbackTextRes", "", "<init>", "(I)V", "getFallbackTextRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Fallback extends PrimaryCta {
                public static final int $stable = 0;
                private final int fallbackTextRes;

                public Fallback(int i10) {
                    super((DefaultConstructorMarker) null);
                    this.fallbackTextRes = i10;
                }

                public static /* synthetic */ Fallback copy$default(Fallback fallback, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = fallback.fallbackTextRes;
                    }
                    return fallback.copy(i10);
                }

                public final int component1() {
                    return this.fallbackTextRes;
                }

                public final Fallback copy(int i10) {
                    return new Fallback(i10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Fallback) && this.fallbackTextRes == ((Fallback) obj).fallbackTextRes;
                }

                public final int getFallbackTextRes() {
                    return this.fallbackTextRes;
                }

                public int hashCode() {
                    return Integer.hashCode(this.fallbackTextRes);
                }

                public String toString() {
                    return "Fallback(fallbackTextRes=" + this.fallbackTextRes + ')';
                }
            }

            public /* synthetic */ PrimaryCta(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private PrimaryCta() {
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "", "buttonText", "", "destination", "isExternalUrl", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getButtonText", "()Ljava/lang/String;", "getDestination", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SecondaryCta {
            public static final int $stable = 0;
            private final String buttonText;
            private final String destination;
            private final boolean isExternalUrl;

            public SecondaryCta(String str, String str2, boolean z10) {
                C6496s.h(str, "buttonText");
                C6496s.h(str2, "destination");
                this.buttonText = str;
                this.destination = str2;
                this.isExternalUrl = z10;
            }

            public static /* synthetic */ SecondaryCta copy$default(SecondaryCta secondaryCta, String str, String str2, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = secondaryCta.buttonText;
                }
                if ((i10 & 2) != 0) {
                    str2 = secondaryCta.destination;
                }
                if ((i10 & 4) != 0) {
                    z10 = secondaryCta.isExternalUrl;
                }
                return secondaryCta.copy(str, str2, z10);
            }

            public final String component1() {
                return this.buttonText;
            }

            public final String component2() {
                return this.destination;
            }

            public final boolean component3() {
                return this.isExternalUrl;
            }

            public final SecondaryCta copy(String str, String str2, boolean z10) {
                C6496s.h(str, "buttonText");
                C6496s.h(str2, "destination");
                return new SecondaryCta(str, str2, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SecondaryCta)) {
                    return false;
                }
                SecondaryCta secondaryCta = (SecondaryCta) obj;
                return C6496s.c(this.buttonText, secondaryCta.buttonText) && C6496s.c(this.destination, secondaryCta.destination) && this.isExternalUrl == secondaryCta.isExternalUrl;
            }

            public final String getButtonText() {
                return this.buttonText;
            }

            public final String getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return (((this.buttonText.hashCode() * 31) + this.destination.hashCode()) * 31) + Boolean.hashCode(this.isExternalUrl);
            }

            public final boolean isExternalUrl() {
                return this.isExternalUrl;
            }

            public String toString() {
                return "SecondaryCta(buttonText=" + this.buttonText + ", destination=" + this.destination + ", isExternalUrl=" + this.isExternalUrl + ')';
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Content(List<Block.Builder> list, List<QuestionState> list2, List<SecondaryCta> list3, PrimaryCta primaryCta2, SurveyUiColors surveyUiColors2, TopBarState topBarState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "stepTitle");
            C6496s.h(list2, "questions");
            C6496s.h(list3, "secondaryCtaActions");
            C6496s.h(primaryCta2, "primaryCta");
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(topBarState2, "topBarState");
            this.stepTitle = list;
            this.questions = list2;
            this.secondaryCtaActions = list3;
            this.primaryCta = primaryCta2;
            this.surveyUiColors = surveyUiColors2;
            this.topBarState = topBarState2;
        }

        public static /* synthetic */ Content copy$default(Content content, List<Block.Builder> list, List<QuestionState> list2, List<SecondaryCta> list3, PrimaryCta primaryCta2, SurveyUiColors surveyUiColors2, TopBarState topBarState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.stepTitle;
            }
            if ((i10 & 2) != 0) {
                list2 = content.questions;
            }
            List<QuestionState> list4 = list2;
            if ((i10 & 4) != 0) {
                list3 = content.secondaryCtaActions;
            }
            List<SecondaryCta> list5 = list3;
            if ((i10 & 8) != 0) {
                primaryCta2 = content.primaryCta;
            }
            PrimaryCta primaryCta3 = primaryCta2;
            if ((i10 & 16) != 0) {
                surveyUiColors2 = content.surveyUiColors;
            }
            SurveyUiColors surveyUiColors3 = surveyUiColors2;
            if ((i10 & 32) != 0) {
                topBarState2 = content.topBarState;
            }
            return content.copy(list, list4, list5, primaryCta3, surveyUiColors3, topBarState2);
        }

        public final List<Block.Builder> component1() {
            return this.stepTitle;
        }

        public final List<QuestionState> component2() {
            return this.questions;
        }

        public final List<SecondaryCta> component3() {
            return this.secondaryCtaActions;
        }

        public final PrimaryCta component4() {
            return this.primaryCta;
        }

        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        public final TopBarState component6() {
            return this.topBarState;
        }

        public final Content copy(List<Block.Builder> list, List<QuestionState> list2, List<SecondaryCta> list3, PrimaryCta primaryCta2, SurveyUiColors surveyUiColors2, TopBarState topBarState2) {
            C6496s.h(list, "stepTitle");
            C6496s.h(list2, "questions");
            C6496s.h(list3, "secondaryCtaActions");
            C6496s.h(primaryCta2, "primaryCta");
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(topBarState2, "topBarState");
            return new Content(list, list2, list3, primaryCta2, surveyUiColors2, topBarState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C6496s.c(this.stepTitle, content.stepTitle) && C6496s.c(this.questions, content.questions) && C6496s.c(this.secondaryCtaActions, content.secondaryCtaActions) && C6496s.c(this.primaryCta, content.primaryCta) && C6496s.c(this.surveyUiColors, content.surveyUiColors) && C6496s.c(this.topBarState, content.topBarState);
        }

        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        public final List<QuestionState> getQuestions() {
            return this.questions;
        }

        public final List<SecondaryCta> getSecondaryCtaActions() {
            return this.secondaryCtaActions;
        }

        public final List<Block.Builder> getStepTitle() {
            return this.stepTitle;
        }

        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return (((((((((this.stepTitle.hashCode() * 31) + this.questions.hashCode()) * 31) + this.secondaryCtaActions.hashCode()) * 31) + this.primaryCta.hashCode()) * 31) + this.surveyUiColors.hashCode()) * 31) + this.topBarState.hashCode();
        }

        public String toString() {
            return "Content(stepTitle=" + this.stepTitle + ", questions=" + this.questions + ", secondaryCtaActions=" + this.secondaryCtaActions + ", primaryCta=" + this.primaryCta + ", surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error;", "Lio/intercom/android/sdk/survey/SurveyState;", "<init>", "()V", "messageResId", "", "getMessageResId", "()I", "WithCTA", "WithoutCTA", "Lio/intercom/android/sdk/survey/SurveyState$Error$WithCTA;", "Lio/intercom/android/sdk/survey/SurveyState$Error$WithoutCTA;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends SurveyState {
        public static final int $stable = 0;

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getMessageResId();

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error$WithCTA;", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "", "messageResId", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "surveyUiColors", "Lio/intercom/android/sdk/survey/TopBarState;", "topBarState", "Lkotlin/Function0;", "Llf/M;", "onClick", "<init>", "(ILio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;Lyf/a;)V", "I", "getMessageResId", "()I", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "Lio/intercom/android/sdk/survey/TopBarState;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "Lyf/a;", "getOnClick", "()Lyf/a;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WithCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final C6787a onClick;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ WithCTA(int i10, SurveyUiColors surveyUiColors2, TopBarState topBarState2, C6787a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i10, surveyUiColors2, topBarState2, aVar);
            }

            public int getMessageResId() {
                return this.messageResId;
            }

            public final C6787a getOnClick() {
                return this.onClick;
            }

            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public WithCTA(int i10, SurveyUiColors surveyUiColors2, TopBarState topBarState2, C6787a aVar) {
                super((DefaultConstructorMarker) null);
                C6496s.h(surveyUiColors2, "surveyUiColors");
                C6496s.h(topBarState2, "topBarState");
                C6496s.h(aVar, "onClick");
                this.messageResId = i10;
                this.surveyUiColors = surveyUiColors2;
                this.topBarState = topBarState2;
                this.onClick = aVar;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error$WithoutCTA;", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "messageResId", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "<init>", "(ILio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;)V", "getMessageResId", "()I", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WithoutCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ WithoutCTA(int i10, SurveyUiColors surveyUiColors2, TopBarState topBarState2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i10, surveyUiColors2, topBarState2);
            }

            public int getMessageResId() {
                return this.messageResId;
            }

            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public WithoutCTA(int i10, SurveyUiColors surveyUiColors2, TopBarState topBarState2) {
                super((DefaultConstructorMarker) null);
                C6496s.h(surveyUiColors2, "surveyUiColors");
                C6496s.h(topBarState2, "topBarState");
                this.messageResId = i10;
                this.surveyUiColors = surveyUiColors2;
                this.topBarState = topBarState2;
            }
        }

        private Error() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Initial;", "Lio/intercom/android/sdk/survey/SurveyState;", "<init>", "()V", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends SurveyState {
        public static final int $stable = 0;
        public static final Initial INSTANCE;
        private static final SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null));
        private static final TopBarState topBarState;

        static {
            Initial initial = new Initial();
            INSTANCE = initial;
            topBarState = new TopBarState.NoTopBarState(true, initial.getSurveyUiColors(), (ProgressBarState) null, 4, (DefaultConstructorMarker) null);
        }

        private Initial() {
            super((DefaultConstructorMarker) null);
        }

        public SurveyUiColors getSurveyUiColors() {
            return surveyUiColors;
        }

        public TopBarState getTopBarState() {
            return topBarState;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Loading;", "Lio/intercom/android/sdk/survey/SurveyState;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "<init>", "(Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;)V", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends SurveyState {
        public static final int $stable = 0;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Loading(SurveyUiColors surveyUiColors2, TopBarState topBarState2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(topBarState2, "topBarState");
            this.surveyUiColors = surveyUiColors2;
            this.topBarState = topBarState2;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, SurveyUiColors surveyUiColors2, TopBarState topBarState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                surveyUiColors2 = loading.surveyUiColors;
            }
            if ((i10 & 2) != 0) {
                topBarState2 = loading.topBarState;
            }
            return loading.copy(surveyUiColors2, topBarState2);
        }

        public final SurveyUiColors component1() {
            return this.surveyUiColors;
        }

        public final TopBarState component2() {
            return this.topBarState;
        }

        public final Loading copy(SurveyUiColors surveyUiColors2, TopBarState topBarState2) {
            C6496s.h(surveyUiColors2, "surveyUiColors");
            C6496s.h(topBarState2, "topBarState");
            return new Loading(surveyUiColors2, topBarState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return C6496s.c(this.surveyUiColors, loading.surveyUiColors) && C6496s.c(this.topBarState, loading.topBarState);
        }

        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return (this.surveyUiColors.hashCode() * 31) + this.topBarState.hashCode();
        }

        public String toString() {
            return "Loading(surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    public /* synthetic */ SurveyState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState getTopBarState();

    private SurveyState() {
    }
}
