package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import h.C2012a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import u1.b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/PreviewMediaContract;", "Lh/a;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewMediaContract extends C2012a {
    public static final int $stable = 0;

    public Intent createIntent(Context context, IntercomPreviewArgs intercomPreviewArgs) {
        C6496s.h(context, "context");
        C6496s.h(intercomPreviewArgs, MetricTracker.Object.INPUT);
        return IntercomPreviewActivity.Companion.createIntent(context, intercomPreviewArgs);
    }

    public List<Uri> parseResult(int i10, Intent intent) {
        List<Uri> list;
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null || (list = b.b(extras, "MEDIA_RESULT_URIS", Uri.class)) == null) {
                list = C6565s.n();
            }
            if (list != null) {
                return list;
            }
        }
        return C6565s.n();
    }
}
