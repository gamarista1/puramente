package io.intercom.android.sdk.ui.preview.ui;

import Y.r;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.C1554j;
import androidx.activity.M;
import androidx.activity.s;
import androidx.core.view.C1708p0;
import e.C1932e;
import g0.c;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import u1.b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/IntercomPreviewActivity;", "Landroidx/activity/j;", "<init>", "()V", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "getPreviewData", "()Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "", "resultCode", "", "Landroid/net/Uri;", "uris", "Llf/M;", "finishWithResult", "(ILjava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "viewModel", "Companion", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomPreviewActivity extends C1554j {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Lazy viewModel$delegate = C6531o.b(new C6350c(this));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/IntercomPreviewActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "args", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createIntent(Context context, IntercomPreviewArgs intercomPreviewArgs) {
            C6496s.h(context, "context");
            C6496s.h(intercomPreviewArgs, "args");
            Intent intent = new Intent(context, IntercomPreviewActivity.class);
            intent.putExtra("INTERCOM_PREVIEW_ARGS", intercomPreviewArgs);
            return intent;
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: private */
    public final void finishWithResult(int i10, List<? extends Uri> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("MEDIA_RESULT_URIS", new ArrayList(list));
        setResult(i10, intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final IntercomPreviewArgs getPreviewData() {
        IntercomPreviewArgs intercomPreviewArgs;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (intercomPreviewArgs = (IntercomPreviewArgs) b.a(extras, "INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.class)) == null) {
            return new IntercomPreviewArgs((List) null, (DeleteType) null, (String) null, false, (DownloadState) null, 31, (DefaultConstructorMarker) null);
        }
        return intercomPreviewArgs;
    }

    /* access modifiers changed from: private */
    public final PreviewViewModel getViewModel() {
        return (PreviewViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public static final PreviewViewModel viewModel_delegate$lambda$0(IntercomPreviewActivity intercomPreviewActivity) {
        C6496s.h(intercomPreviewActivity, "this$0");
        return PreviewViewModel.Companion.create$intercom_sdk_ui_release(intercomPreviewActivity, intercomPreviewActivity.getPreviewData());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.c(this, (M) null, (M) null, 3, (Object) null);
        C1708p0.a(getWindow(), getWindow().getDecorView()).d(false);
        C1932e.b(this, (r) null, c.c(-2110849940, true, new IntercomPreviewActivity$onCreate$1(this)), 1, (Object) null);
    }
}
