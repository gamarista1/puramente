package io.intercom.android.sdk.survey.ui.questiontype.files;

import Y.C1500m;
import io.intercom.android.sdk.survey.ui.models.Answer;
import yf.p;

public final /* synthetic */ class n implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Answer.MediaAnswer.FileUploadStatus f70476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f70477b;

    public /* synthetic */ n(Answer.MediaAnswer.FileUploadStatus fileUploadStatus, int i10) {
        this.f70476a = fileUploadStatus;
        this.f70477b = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        return FileActionSheetKt.FileActionSheetPreviewForStatus$lambda$7(this.f70476a, this.f70477b, (C1500m) obj, ((Integer) obj2).intValue());
    }
}
