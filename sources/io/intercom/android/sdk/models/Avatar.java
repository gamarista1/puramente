package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Objects;

@AutoValue
public abstract class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new Parcelable.Creator<Avatar>() {
        public Avatar createFromParcel(Parcel parcel) {
            return Avatar.create(parcel.readString(), parcel.readString(), AvatarShape.Companion.fromName(parcel.readString()), parcel.readString());
        }

        public Avatar[] newArray(int i10) {
            return new Avatar[i10];
        }
    };
    public static final Avatar NULL = create("", "", AvatarShape.CIRCLE, "");

    public static final class Builder {
        String image_url;
        String initials;
        String label;
        AvatarShape shape;
        String square_128;

        public Avatar build() {
            String str = this.image_url;
            if (str == null) {
                str = this.square_128;
            }
            AvatarShape avatarShape = this.shape;
            if (avatarShape == null) {
                avatarShape = AvatarShape.CIRCLE;
            }
            String valueOrEmpty = NullSafety.valueOrEmpty(this.initials);
            String str2 = this.label;
            if (str2 == null) {
                str2 = valueOrEmpty;
            }
            return Avatar.create(NullSafety.valueOrEmpty(str), valueOrEmpty, avatarShape, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Builder.class != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (!Objects.equals(this.image_url, builder.image_url) || !Objects.equals(this.initials, builder.initials) || !Objects.equals(this.square_128, builder.square_128) || !Objects.equals(this.shape, builder.shape) || !Objects.equals(this.label, builder.label)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.image_url, this.initials, this.square_128, this.shape});
        }

        public Builder withImageUrl(String str) {
            this.image_url = str;
            return this;
        }

        public Builder withInitials(String str) {
            this.initials = str;
            return this;
        }

        public Builder withShape(AvatarShape avatarShape) {
            this.shape = avatarShape;
            return this;
        }
    }

    public static Avatar create(String str, String str2, AvatarShape avatarShape, String str3) {
        return new AutoValue_Avatar(str, str2, avatarShape, str3);
    }

    public int describeContents() {
        return 0;
    }

    public abstract String getImageUrl();

    public abstract String getInitials();

    public abstract String getLabel();

    public abstract AvatarShape getShape();

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getImageUrl());
        parcel.writeString(getInitials());
        parcel.writeString(getShape().name());
        parcel.writeString(getLabel());
    }

    public static Avatar create(String str, String str2, AvatarShape avatarShape) {
        return new AutoValue_Avatar(str, str2, avatarShape, str2);
    }

    public static Avatar create(String str, String str2) {
        return new AutoValue_Avatar(str, str2, AvatarShape.CIRCLE, str2);
    }
}
