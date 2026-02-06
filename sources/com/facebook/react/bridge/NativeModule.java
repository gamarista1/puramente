package com.facebook.react.bridge;

import B7.a;

@a
public interface NativeModule {
    boolean canOverrideExistingModule() {
        return false;
    }

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    void onCatalystInstanceDestroy() {
    }
}
