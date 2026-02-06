package io.intercom.android.sdk.models;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class HomeErrorRow {

    public static final class Builder {
        public HomeErrorRow build() {
            return HomeErrorRow.create();
        }
    }

    public static HomeErrorRow create() {
        return new AutoValue_HomeErrorRow();
    }
}
