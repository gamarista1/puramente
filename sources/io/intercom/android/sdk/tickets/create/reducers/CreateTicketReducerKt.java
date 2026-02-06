package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"convertToTicketFormUiState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "ticketData", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "config", "Lio/intercom/android/sdk/identity/AppConfig;", "currentState", "getPlaceholderText", "", "type", "", "getInputType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreateTicketReducerKt {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f6, code lost:
        if (r10.equals(io.intercom.android.sdk.models.AttributeType.INTEGER) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0142, code lost:
        if (r10.equals(io.intercom.android.sdk.models.AttributeType.FLOAT) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01cb, code lost:
        r9 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02f0, code lost:
        if (r10.equals("string") == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02fe, code lost:
        if (kotlin.jvm.internal.C6496s.c(r5.getIdentifier(), "multiline") == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0300, code lost:
        r7 = new io.intercom.android.sdk.survey.QuestionState(new io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel(r5.getId(), mf.C6565s.e(new io.intercom.android.sdk.blocks.lib.models.Block.Builder().withType(io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH.getSerializedName()).withText(r5.getName())), r5.getRequired(), (java.lang.String) null, getInputType(r5.getType()), (java.lang.Integer) null, c1.h.j((float) 120), 0, java.lang.Integer.valueOf(r6), 136, (kotlin.jvm.internal.DefaultConstructorMarker) null), io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(new io.intercom.android.sdk.survey.model.SurveyCustomization((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        r9 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0355, code lost:
        r9 = 3;
        r7 = new io.intercom.android.sdk.survey.QuestionState(new io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel(r5.getId(), mf.C6565s.e(new io.intercom.android.sdk.blocks.lib.models.Block.Builder().withType(io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH.getSerializedName()).withText(r5.getName())), r5.getRequired(), (java.lang.String) null, getInputType(r5.getType()), (java.lang.Integer) null, false, java.lang.Integer.valueOf(r6), (java.lang.Integer) null, 328, (kotlin.jvm.internal.DefaultConstructorMarker) null), io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(new io.intercom.android.sdk.survey.model.SurveyCustomization((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03a3, code lost:
        r1.add(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2 r23, io.intercom.android.sdk.identity.UserIdentity r24, io.intercom.android.sdk.identity.AppConfig r25, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState r26) {
        /*
            r0 = r26
            java.lang.String r1 = "ticketData"
            r2 = r23
            kotlin.jvm.internal.C6496s.h(r2, r1)
            java.lang.String r1 = "userIdentity"
            r3 = r24
            kotlin.jvm.internal.C6496s.h(r3, r1)
            java.lang.String r1 = "config"
            r4 = r25
            kotlin.jvm.internal.C6496s.h(r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r5 = r0 instanceof io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content
            if (r5 == 0) goto L_0x0027
            io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState$Content r0 = (io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content) r0
            java.util.List r0 = r0.getQuestions()
            goto L_0x002b
        L_0x0027:
            java.util.List r0 = mf.C6565s.n()
        L_0x002b:
            java.lang.String r5 = r24.getEmail()
            java.lang.String r6 = "getEmail(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            boolean r5 = Sg.p.d0(r5)
            r7 = 3
            r8 = 0
            if (r5 != 0) goto L_0x0088
            io.intercom.android.sdk.survey.QuestionState r5 = new io.intercom.android.sdk.survey.QuestionState
            java.util.List r11 = mf.C6565s.n()
            int r9 = io.intercom.android.sdk.R.string.intercom_placeholder_email_input
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r14 = io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL
            int r10 = io.intercom.android.sdk.R.string.intercom_get_notified_by_email
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r15 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)
            r19 = 8
            r20 = 0
            java.lang.String r10 = "-1"
            r12 = 1
            r13 = 0
            r16 = 0
            r21 = 0
            r9 = r15
            r22 = r15
            r15 = r16
            r16 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            io.intercom.android.sdk.survey.model.SurveyCustomization r9 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r9.<init>(r8, r8, r7, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r9 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r9)
            r10 = r22
            r5.<init>(r10, r9)
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r9 = new io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer
            java.lang.String r3 = r24.getEmail()
            kotlin.jvm.internal.C6496s.g(r3, r6)
            r9.<init>(r3)
            r5.setAnswer(r9)
            r1.add(r5)
        L_0x0088:
            java.util.List r3 = r23.getFormFields()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0092:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03a9
            java.lang.Object r5 = r3.next()
            io.intercom.android.sdk.blocks.lib.models.FormField r5 = (io.intercom.android.sdk.blocks.lib.models.FormField) r5
            java.lang.String r6 = r5.getType()
            int r6 = getPlaceholderText(r6)
            r9 = r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x00ad:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00cd
            java.lang.Object r10 = r9.next()
            r11 = r10
            io.intercom.android.sdk.survey.QuestionState r11 = (io.intercom.android.sdk.survey.QuestionState) r11
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r11 = r11.getQuestionModel()
            java.lang.String r11 = r11.getId()
            java.lang.String r12 = r5.getId()
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r12)
            if (r11 == 0) goto L_0x00ad
            goto L_0x00ce
        L_0x00cd:
            r10 = r8
        L_0x00ce:
            io.intercom.android.sdk.survey.QuestionState r10 = (io.intercom.android.sdk.survey.QuestionState) r10
            java.lang.String r9 = "list"
            if (r10 == 0) goto L_0x00e4
            java.lang.String r11 = r5.getType()
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r9)
            if (r11 != 0) goto L_0x00e4
            r1.add(r10)
        L_0x00e1:
            r9 = r7
            goto L_0x03a6
        L_0x00e4:
            java.lang.String r10 = r5.getType()
            int r11 = r10.hashCode()
            switch(r11) {
                case -891985903: goto L_0x02ea;
                case 3322014: goto L_0x0220;
                case 64711720: goto L_0x01ce;
                case 97434231: goto L_0x0145;
                case 97526364: goto L_0x013c;
                case 1793702779: goto L_0x00f9;
                case 1958052158: goto L_0x00f0;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            goto L_0x00e1
        L_0x00f0:
            java.lang.String r9 = "integer"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x02f4
            goto L_0x00ef
        L_0x00f9:
            java.lang.String r6 = "datetime"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x0102
            goto L_0x00ef
        L_0x0102:
            io.intercom.android.sdk.survey.QuestionState r6 = new io.intercom.android.sdk.survey.QuestionState
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$DatePickerQuestionModel r9 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$DatePickerQuestionModel
            java.lang.String r10 = r5.getId()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r11 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r11.<init>()
            io.intercom.android.sdk.blocks.lib.BlockType r12 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH
            java.lang.String r12 = r12.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r11 = r11.withType(r12)
            java.lang.String r12 = r5.getName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r11 = r11.withText(r12)
            java.util.List r11 = mf.C6565s.e(r11)
            boolean r5 = r5.getRequired()
            r9.<init>(r10, r11, r5)
            io.intercom.android.sdk.survey.model.SurveyCustomization r5 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r5.<init>(r8, r8, r7, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r5 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r5)
            r6.<init>(r9, r5)
            r1.add(r6)
            goto L_0x00e1
        L_0x013c:
            java.lang.String r9 = "float"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x02f4
            goto L_0x00ef
        L_0x0145:
            java.lang.String r6 = "files"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x014e
            goto L_0x00ef
        L_0x014e:
            io.intercom.android.sdk.survey.QuestionState r6 = new io.intercom.android.sdk.survey.QuestionState
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$UploadFileQuestionModel r9 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$UploadFileQuestionModel
            java.lang.String r14 = r5.getId()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r10 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r10.<init>()
            io.intercom.android.sdk.blocks.lib.BlockType r11 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH
            java.lang.String r11 = r11.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r10 = r10.withType(r11)
            java.lang.String r11 = r5.getName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r10 = r10.withText(r11)
            java.util.List r15 = mf.C6565s.e(r10)
            java.lang.String r10 = r5.getIdentifier()
            java.lang.String r11 = "single"
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r11)
            if (r10 == 0) goto L_0x0187
            io.intercom.android.sdk.ui.common.StringProvider$ActualString r10 = new io.intercom.android.sdk.ui.common.StringProvider$ActualString
            java.lang.String r13 = ""
            r10.<init>(r13)
        L_0x0184:
            r16 = r10
            goto L_0x019b
        L_0x0187:
            io.intercom.android.sdk.ui.common.StringProvider$StringRes r10 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
            int r13 = io.intercom.android.sdk.R.string.intercom_file_max_limit
            java.lang.String r12 = "limit"
            java.lang.String r7 = "10"
            kotlin.Pair r7 = lf.C6502A.a(r12, r7)
            java.util.List r7 = mf.C6565s.e(r7)
            r10.<init>(r13, r7)
            goto L_0x0184
        L_0x019b:
            boolean r17 = r5.getRequired()
            java.lang.String r5 = r5.getIdentifier()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r11)
            if (r5 == 0) goto L_0x01ad
            r12 = 1
            r18 = r12
            goto L_0x01af
        L_0x01ad:
            r18 = 10
        L_0x01af:
            io.intercom.android.sdk.models.AttachmentSettings r5 = r25.getAttachmentSettings()
            java.util.Set r19 = r5.getTrustedFileExtensions()
            r13 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            io.intercom.android.sdk.survey.model.SurveyCustomization r5 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r7 = 3
            r5.<init>(r8, r8, r7, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r5 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r5)
            r6.<init>(r9, r5)
            r1.add(r6)
        L_0x01cb:
            r9 = 3
            goto L_0x03a6
        L_0x01ce:
            java.lang.String r6 = "boolean"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x01d7
        L_0x01d6:
            goto L_0x01cb
        L_0x01d7:
            io.intercom.android.sdk.survey.QuestionState r6 = new io.intercom.android.sdk.survey.QuestionState
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$SingleChoiceQuestionModel r7 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$SingleChoiceQuestionModel
            java.lang.String r10 = r5.getId()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r9.<init>()
            io.intercom.android.sdk.blocks.lib.BlockType r11 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH
            java.lang.String r11 = r11.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = r9.withType(r11)
            java.lang.String r11 = r5.getName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = r9.withText(r11)
            java.util.List r11 = mf.C6565s.e(r9)
            boolean r12 = r5.getRequired()
            java.lang.String r5 = "True"
            java.lang.String r9 = "False"
            java.lang.String[] r5 = new java.lang.String[]{r5, r9}
            java.util.List r13 = mf.C6565s.q(r5)
            r14 = 0
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            io.intercom.android.sdk.survey.model.SurveyCustomization r5 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r9 = 3
            r5.<init>(r8, r8, r9, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r5 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r5)
            r6.<init>(r7, r5)
            r1.add(r6)
            goto L_0x01cb
        L_0x0220:
            boolean r7 = r10.equals(r9)
            if (r7 != 0) goto L_0x0227
            goto L_0x01d6
        L_0x0227:
            java.lang.String r10 = r5.getId()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r7.<init>()
            io.intercom.android.sdk.blocks.lib.BlockType r9 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH
            java.lang.String r9 = r9.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withType(r9)
            java.lang.String r9 = r5.getName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r7 = r7.withText(r9)
            java.util.List r11 = mf.C6565s.e(r7)
            boolean r12 = r5.getRequired()
            io.intercom.android.sdk.blocks.lib.models.Options r7 = r5.getOptions()
            if (r7 == 0) goto L_0x027d
            java.util.List r7 = r7.getListOptions()
            if (r7 == 0) goto L_0x027d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r13 = 10
            int r13 = mf.C6565s.y(r7, r13)
            r9.<init>(r13)
            java.util.Iterator r7 = r7.iterator()
        L_0x0267:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x027b
            java.lang.Object r13 = r7.next()
            io.intercom.android.sdk.blocks.lib.models.ListOption r13 = (io.intercom.android.sdk.blocks.lib.models.ListOption) r13
            java.lang.String r13 = r13.getLabel()
            r9.add(r13)
            goto L_0x0267
        L_0x027b:
            r13 = r9
            goto L_0x0282
        L_0x027d:
            java.util.List r7 = mf.C6565s.n()
            r13 = r7
        L_0x0282:
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$DropDownQuestionModel r7 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$DropDownQuestionModel
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            r16 = 16
            r17 = 0
            r14 = 0
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            io.intercom.android.sdk.survey.model.SurveyCustomization r6 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r9 = 3
            r6.<init>(r8, r8, r9, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r6 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r6)
            io.intercom.android.sdk.survey.QuestionState r9 = new io.intercom.android.sdk.survey.QuestionState
            r9.<init>(r7, r6)
            java.lang.String r6 = r5.getValue()
            if (r6 == 0) goto L_0x02e5
            io.intercom.android.sdk.blocks.lib.models.Options r6 = r5.getOptions()
            if (r6 == 0) goto L_0x02e5
            java.util.List r6 = r6.getListOptions()
            if (r6 == 0) goto L_0x02e5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x02b8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x02d4
            java.lang.Object r7 = r6.next()
            r10 = r7
            io.intercom.android.sdk.blocks.lib.models.ListOption r10 = (io.intercom.android.sdk.blocks.lib.models.ListOption) r10
            java.lang.String r10 = r10.getId()
            java.lang.String r11 = r5.getValue()
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r11)
            if (r10 == 0) goto L_0x02b8
            goto L_0x02d5
        L_0x02d4:
            r7 = r8
        L_0x02d5:
            io.intercom.android.sdk.blocks.lib.models.ListOption r7 = (io.intercom.android.sdk.blocks.lib.models.ListOption) r7
            if (r7 == 0) goto L_0x02e5
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r5 = new io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer
            java.lang.String r6 = r7.getLabel()
            r5.<init>(r6)
            r9.setAnswer(r5)
        L_0x02e5:
            r1.add(r9)
            goto L_0x01cb
        L_0x02ea:
            java.lang.String r7 = "string"
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x02f4
            goto L_0x01d6
        L_0x02f4:
            java.lang.String r7 = r5.getIdentifier()
            java.lang.String r9 = "multiline"
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r9)
            if (r7 == 0) goto L_0x0355
            io.intercom.android.sdk.survey.QuestionState r7 = new io.intercom.android.sdk.survey.QuestionState
            java.lang.String r10 = r5.getId()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r9.<init>()
            io.intercom.android.sdk.blocks.lib.BlockType r11 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH
            java.lang.String r11 = r11.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = r9.withType(r11)
            java.lang.String r11 = r5.getName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = r9.withText(r11)
            java.util.List r11 = mf.C6565s.e(r9)
            boolean r12 = r5.getRequired()
            java.lang.String r5 = r5.getType()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r14 = getInputType(r5)
            r5 = 120(0x78, float:1.68E-43)
            float r5 = (float) r5
            float r16 = c1.h.j(r5)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$LongTextQuestionModel r5 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$LongTextQuestionModel
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            r19 = 136(0x88, float:1.9E-43)
            r20 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            io.intercom.android.sdk.survey.model.SurveyCustomization r6 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r9 = 3
            r6.<init>(r8, r8, r9, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r6 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r6)
            r7.<init>(r5, r6)
            r9 = 3
            goto L_0x03a3
        L_0x0355:
            io.intercom.android.sdk.survey.QuestionState r7 = new io.intercom.android.sdk.survey.QuestionState
            java.lang.String r10 = r5.getId()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = new io.intercom.android.sdk.blocks.lib.models.Block$Builder
            r9.<init>()
            io.intercom.android.sdk.blocks.lib.BlockType r11 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH
            java.lang.String r11 = r11.getSerializedName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = r9.withType(r11)
            java.lang.String r11 = r5.getName()
            io.intercom.android.sdk.blocks.lib.models.Block$Builder r9 = r9.withText(r11)
            java.util.List r11 = mf.C6565s.e(r9)
            boolean r12 = r5.getRequired()
            java.lang.String r5 = r5.getType()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType r14 = getInputType(r5)
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel r5 = new io.intercom.android.sdk.survey.model.SurveyData$Step$Question$ShortTextQuestionModel
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            r19 = 328(0x148, float:4.6E-43)
            r20 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            io.intercom.android.sdk.survey.model.SurveyCustomization r6 = new io.intercom.android.sdk.survey.model.SurveyCustomization
            r9 = 3
            r6.<init>(r8, r8, r9, r8)
            io.intercom.android.sdk.survey.SurveyUiColors r6 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r6)
            r7.<init>(r5, r6)
        L_0x03a3:
            r1.add(r7)
        L_0x03a6:
            r7 = r9
            goto L_0x0092
        L_0x03a9:
            io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState$Content r0 = new io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState$Content
            java.lang.String r3 = r23.getName()
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r2 = r0
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt.convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState):io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState");
    }

    private static final SurveyData.Step.Question.QuestionValidation.ValidationType getInputType(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 96619420) {
            if (hashCode != 97526364) {
                if (hashCode == 1958052158 && str.equals(AttributeType.INTEGER)) {
                    return SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER;
                }
            } else if (str.equals(AttributeType.FLOAT)) {
                return SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT;
            }
        } else if (str.equals("email")) {
            return SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        }
        return SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT;
    }

    private static final int getPlaceholderText(String str) {
        switch (str.hashCode()) {
            case 3322014:
                if (str.equals(AttributeType.LIST)) {
                    return R.string.intercom_please_select;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return R.string.intercom_placeholder_email_input;
                }
                break;
            case 97526364:
                if (str.equals(AttributeType.FLOAT)) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
            case 1958052158:
                if (str.equals(AttributeType.INTEGER)) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
        }
        return R.string.intercom_placeholder_text_inputs;
    }
}
