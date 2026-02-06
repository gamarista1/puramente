package io.intercom.android.sdk.tickets.create.reducers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"reduceAttributeList", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "updatedQuestionId", "", "currentTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "currentUiState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConditionalAttributesReducerKt {
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x004d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest> reduceAttributeList(java.lang.String r7, io.intercom.android.sdk.blocks.lib.models.TicketTypeV2 r8, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState r9) {
        /*
            java.lang.String r0 = "updatedQuestionId"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "currentUiState"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            if (r8 == 0) goto L_0x0125
            java.util.List r0 = r8.getFormFields()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()
            r3 = r1
            io.intercom.android.sdk.blocks.lib.models.FormField r3 = (io.intercom.android.sdk.blocks.lib.models.FormField) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r7)
            if (r3 == 0) goto L_0x0016
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            io.intercom.android.sdk.blocks.lib.models.FormField r1 = (io.intercom.android.sdk.blocks.lib.models.FormField) r1
            if (r1 != 0) goto L_0x0039
            java.util.List r7 = mf.C6565s.n()
            return r7
        L_0x0039:
            boolean r7 = r1.isControllingAttribute()
            if (r7 == 0) goto L_0x0125
            java.util.List r7 = mf.C6565s.c()
            java.util.List r8 = r8.getFormFields()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r8.next()
            io.intercom.android.sdk.blocks.lib.models.FormField r0 = (io.intercom.android.sdk.blocks.lib.models.FormField) r0
            java.lang.String r1 = r0.getId()
            boolean r3 = r9 instanceof io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content
            if (r3 == 0) goto L_0x0096
            r3 = r9
            io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState$Content r3 = (io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content) r3
            java.util.List r3 = r3.getQuestions()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x006e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r3.next()
            r5 = r4
            io.intercom.android.sdk.survey.QuestionState r5 = (io.intercom.android.sdk.survey.QuestionState) r5
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r5 = r5.getQuestionModel()
            java.lang.String r5 = r5.getId()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r1)
            if (r5 == 0) goto L_0x006e
            goto L_0x008b
        L_0x008a:
            r4 = r2
        L_0x008b:
            io.intercom.android.sdk.survey.QuestionState r4 = (io.intercom.android.sdk.survey.QuestionState) r4
            if (r4 == 0) goto L_0x0094
            io.intercom.android.sdk.survey.ui.models.Answer r3 = r4.getAnswer()
            goto L_0x0098
        L_0x0094:
            r3 = r2
            goto L_0x0098
        L_0x0096:
            r3 = r2
            r4 = r3
        L_0x0098:
            if (r3 == 0) goto L_0x004d
            boolean r5 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer
            if (r5 == 0) goto L_0x00a1
        L_0x009e:
            r0 = r2
            goto L_0x010e
        L_0x00a1:
            boolean r5 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer
            if (r5 == 0) goto L_0x00a6
            goto L_0x009e
        L_0x00a6:
            boolean r5 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer
            if (r5 == 0) goto L_0x00ab
            goto L_0x009e
        L_0x00ab:
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r5 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
            boolean r5 = kotlin.jvm.internal.C6496s.c(r3, r5)
            if (r5 == 0) goto L_0x00b4
            goto L_0x009e
        L_0x00b4:
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$ResetNoAnswer r5 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.ResetNoAnswer.INSTANCE
            boolean r5 = kotlin.jvm.internal.C6496s.c(r3, r5)
            if (r5 == 0) goto L_0x00bd
            goto L_0x009e
        L_0x00bd:
            boolean r5 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r5 == 0) goto L_0x011a
            if (r4 == 0) goto L_0x00c8
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r4 = r4.getQuestionModel()
            goto L_0x00c9
        L_0x00c8:
            r4 = r2
        L_0x00c9:
            boolean r4 = r4 instanceof io.intercom.android.sdk.survey.model.SurveyData.Step.Question.DropDownQuestionModel
            if (r4 == 0) goto L_0x0108
            io.intercom.android.sdk.blocks.lib.models.Options r0 = r0.getOptions()
            if (r0 == 0) goto L_0x009e
            java.util.List r0 = r0.getListOptions()
            if (r0 == 0) goto L_0x009e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00df:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00fe
            java.lang.Object r4 = r0.next()
            r5 = r4
            io.intercom.android.sdk.blocks.lib.models.ListOption r5 = (io.intercom.android.sdk.blocks.lib.models.ListOption) r5
            java.lang.String r5 = r5.getLabel()
            r6 = r3
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r6 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r6
            java.lang.String r6 = r6.getAnswer()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r6)
            if (r5 == 0) goto L_0x00df
            goto L_0x00ff
        L_0x00fe:
            r4 = r2
        L_0x00ff:
            io.intercom.android.sdk.blocks.lib.models.ListOption r4 = (io.intercom.android.sdk.blocks.lib.models.ListOption) r4
            if (r4 == 0) goto L_0x009e
            java.lang.String r0 = r4.getId()
            goto L_0x010e
        L_0x0108:
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r3 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r3
            java.lang.String r0 = r3.getAnswer()
        L_0x010e:
            if (r0 == 0) goto L_0x004d
            io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest r3 = new io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest
            r3.<init>(r1, r0)
            r7.add(r3)
            goto L_0x004d
        L_0x011a:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        L_0x0120:
            java.util.List r7 = mf.C6565s.a(r7)
            return r7
        L_0x0125:
            java.util.List r7 = mf.C6565s.n()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.reducers.ConditionalAttributesReducerKt.reduceAttributeList(java.lang.String, io.intercom.android.sdk.blocks.lib.models.TicketTypeV2, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState):java.util.List");
    }
}
