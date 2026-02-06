package io.intercom.android.sdk.blocks;

import android.text.TextUtils;
import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/blocks/CarouselImageClickListener;", "Lio/intercom/android/sdk/blocks/ImageClickListener;", "Lio/intercom/android/sdk/api/Api;", "api", "<init>", "(Lio/intercom/android/sdk/api/Api;)V", "", "imageUrl", "linkUrl", "Landroid/view/View;", "imageView", "", "width", "height", "Llf/M;", "onImageClicked", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;II)V", "Lio/intercom/android/sdk/api/Api;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CarouselImageClickListener implements ImageClickListener {
    public static final int $stable = 8;
    private final Api api;

    public CarouselImageClickListener(Api api2) {
        C6496s.h(api2, MetricTracker.Place.API);
        this.api = api2;
    }

    public void onImageClicked(String str, String str2, View view, int i10, int i11) {
        C6496s.h(str, "imageUrl");
        C6496s.h(str2, "linkUrl");
        C6496s.h(view, "imageView");
        if (!TextUtils.isEmpty(str2)) {
            LinkOpener.handleUrl(str2, view.getContext(), this.api);
        }
    }
}
