package io.intercom.android.sdk.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.shimmer.b;
import com.facebook.shimmer.d;

public class IntercomShimmerLayout extends d {
    private static final b SHIMMER_CONFIG = ((b.a) ((b.a) ((b.a) ((b.a) ((b.a) new b.a().t(0.0f)).o(0.01f)).j(1500)).n(0.6f)).q(100)).a();

    public IntercomShimmerLayout(Context context) {
        super(context);
        init();
    }

    private void init() {
        setShimmer(SHIMMER_CONFIG);
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }

    @TargetApi(21)
    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        init();
    }
}
