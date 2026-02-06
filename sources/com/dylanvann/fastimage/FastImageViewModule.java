package com.dylanvann.fastimage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;

class FastImageViewModule extends NativeFastImageViewModuleSpec {
    c impl;

    FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new c(reactApplicationContext);
    }

    public void clearDiskCache(Promise promise) {
        this.impl.a(promise);
    }

    public void clearMemoryCache(Promise promise) {
        this.impl.b(promise);
    }

    public String getName() {
        return NativeFastImageViewModuleSpec.NAME;
    }

    public void preload(ReadableArray readableArray) {
        this.impl.d(readableArray);
    }
}
