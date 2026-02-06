package io.intercom.android.sdk.blocks.lib.models;

import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.utilities.NullSafety;

@AutoValue
public abstract class BlockMetadata {
    public static BlockMetadata NULL = new Builder().build();

    public static final class Builder {
        Appearance.Builder appearance;
        Boolean isFirstObject;
        Boolean isLastObject;

        public BlockMetadata build() {
            Appearance appearance2;
            Appearance.Builder builder = this.appearance;
            if (builder == null) {
                appearance2 = Appearance.NULL;
            } else {
                appearance2 = builder.build();
            }
            return BlockMetadata.create(NullSafety.valueOrDefault(this.isFirstObject, false), NullSafety.valueOrDefault(this.isLastObject, false), appearance2);
        }

        public Builder isFirstObject(Boolean bool) {
            this.isFirstObject = bool;
            return this;
        }

        public Builder isLastObject(Boolean bool) {
            this.isLastObject = bool;
            return this;
        }

        public Builder withAppearance(Appearance.Builder builder) {
            this.appearance = builder;
            return this;
        }
    }

    static BlockMetadata create(boolean z10, boolean z11, Appearance appearance) {
        return new AutoValue_BlockMetadata(z10, z11, appearance);
    }

    public abstract Appearance getAppearance();

    public abstract boolean isFirstObject();

    public abstract boolean isLastObject();

    public boolean isSingleObject() {
        if (!isFirstObject() || !isLastObject()) {
            return false;
        }
        return true;
    }
}
