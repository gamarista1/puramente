package io.intercom.android.sdk.models;

import io.intercom.android.sdk.m5.components.avatar.AvatarShape;

final class AutoValue_Avatar extends Avatar {
    private final String imageUrl;
    private final String initials;
    private final String label;
    private final AvatarShape shape;

    AutoValue_Avatar(String str, String str2, AvatarShape avatarShape, String str3) {
        if (str != null) {
            this.imageUrl = str;
            if (str2 != null) {
                this.initials = str2;
                if (avatarShape != null) {
                    this.shape = avatarShape;
                    if (str3 != null) {
                        this.label = str3;
                        return;
                    }
                    throw new NullPointerException("Null label");
                }
                throw new NullPointerException("Null shape");
            }
            throw new NullPointerException("Null initials");
        }
        throw new NullPointerException("Null imageUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        if (!this.imageUrl.equals(avatar.getImageUrl()) || !this.initials.equals(avatar.getInitials()) || !this.shape.equals(avatar.getShape()) || !this.label.equals(avatar.getLabel())) {
            return false;
        }
        return true;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getInitials() {
        return this.initials;
    }

    public String getLabel() {
        return this.label;
    }

    public AvatarShape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return ((((((this.imageUrl.hashCode() ^ 1000003) * 1000003) ^ this.initials.hashCode()) * 1000003) ^ this.shape.hashCode()) * 1000003) ^ this.label.hashCode();
    }

    public String toString() {
        return "Avatar{imageUrl=" + this.imageUrl + ", initials=" + this.initials + ", shape=" + this.shape + ", label=" + this.label + "}";
    }
}
