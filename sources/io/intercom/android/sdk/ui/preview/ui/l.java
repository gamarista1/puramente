package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import yf.C6798l;

public final /* synthetic */ class l implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f70943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntercomPreviewArgs f70944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PreviewViewModel f70945c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PreviewUiState f70946d;

    public /* synthetic */ l(Context context, IntercomPreviewArgs intercomPreviewArgs, PreviewViewModel previewViewModel, PreviewUiState previewUiState) {
        this.f70943a = context;
        this.f70944b = intercomPreviewArgs;
        this.f70945c = previewViewModel;
        this.f70946d = previewUiState;
    }

    public final Object invoke(Object obj) {
        return PreviewRootScreenKt.PreviewRootScreen$lambda$1(this.f70943a, this.f70944b, this.f70945c, this.f70946d, ((Boolean) obj).booleanValue());
    }
}
