package io.intercom.android.sdk.models;

final class AutoValue_Reaction extends Reaction {
    private final String imageUrl;
    private final int index;

    AutoValue_Reaction(int i10, String str) {
        this.index = i10;
        if (str != null) {
            this.imageUrl = str;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        if (this.index != reaction.getIndex() || !this.imageUrl.equals(reaction.getImageUrl())) {
            return false;
        }
        return true;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return ((this.index ^ 1000003) * 1000003) ^ this.imageUrl.hashCode();
    }

    public String toString() {
        return "Reaction{index=" + this.index + ", imageUrl=" + this.imageUrl + "}";
    }
}
