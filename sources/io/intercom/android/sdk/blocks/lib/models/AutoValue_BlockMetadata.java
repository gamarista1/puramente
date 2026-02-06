package io.intercom.android.sdk.blocks.lib.models;

import io.intercom.android.sdk.models.carousel.Appearance;

final class AutoValue_BlockMetadata extends BlockMetadata {
    private final Appearance appearance;
    private final boolean firstObject;
    private final boolean lastObject;

    AutoValue_BlockMetadata(boolean z10, boolean z11, Appearance appearance2) {
        this.firstObject = z10;
        this.lastObject = z11;
        if (appearance2 != null) {
            this.appearance = appearance2;
            return;
        }
        throw new NullPointerException("Null appearance");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockMetadata)) {
            return false;
        }
        BlockMetadata blockMetadata = (BlockMetadata) obj;
        if (this.firstObject == blockMetadata.isFirstObject() && this.lastObject == blockMetadata.isLastObject() && this.appearance.equals(blockMetadata.getAppearance())) {
            return true;
        }
        return false;
    }

    public Appearance getAppearance() {
        return this.appearance;
    }

    public int hashCode() {
        int i10;
        int i11 = 1237;
        if (this.firstObject) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        if (this.lastObject) {
            i11 = 1231;
        }
        return ((i12 ^ i11) * 1000003) ^ this.appearance.hashCode();
    }

    public boolean isFirstObject() {
        return this.firstObject;
    }

    public boolean isLastObject() {
        return this.lastObject;
    }

    public String toString() {
        return "BlockMetadata{firstObject=" + this.firstObject + ", lastObject=" + this.lastObject + ", appearance=" + this.appearance + "}";
    }
}
