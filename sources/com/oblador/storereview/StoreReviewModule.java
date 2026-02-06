package com.oblador.storereview;

import com.facebook.react.bridge.ReactApplicationContext;

public class StoreReviewModule extends NativeRNStoreReviewSpec {
    StoreReviewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NativeRNStoreReviewSpec.NAME;
    }

    public void requestReview() {
        b.c(getReactApplicationContext());
    }
}
