package io.intercom.android.sdk.models.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

@AutoValue
public abstract class Appearance implements Parcelable {
    public static final Parcelable.Creator<Appearance> CREATOR = new Parcelable.Creator<Appearance>() {
        public Appearance createFromParcel(Parcel parcel) {
            return Appearance.create(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Appearance[] newArray(int i10) {
            return new Appearance[i10];
        }
    };
    public static Appearance NULL = new Builder().build();

    public static final class Builder {
        String alignment;
        String text_color;
        String type;

        public Appearance build() {
            return Appearance.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.alignment), NullSafety.valueOrEmpty(this.text_color));
        }

        public Builder withTextAlignment(String str) {
            this.alignment = str;
            return this;
        }

        public Builder withTextColor(String str) {
            this.text_color = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    static Appearance create(String str, String str2, String str3) {
        return new AutoValue_Appearance(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public abstract String getAlignment();

    public abstract String getTextColor();

    public abstract String getType();

    public Builder toBuilder() {
        return new Builder().withType(getType()).withTextAlignment(getAlignment()).withTextColor(getTextColor());
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getType());
        parcel.writeString(getAlignment());
        parcel.writeString(getTextColor());
    }
}
