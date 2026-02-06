package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

@AutoValue
public abstract class Attachments implements Parcelable {
    public static final Parcelable.Creator<Attachments> CREATOR = new Parcelable.Creator<Attachments>() {
        public Attachments createFromParcel(Parcel parcel) {
            return Attachments.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Attachments[] newArray(int i10) {
            return new Attachments[i10];
        }
    };

    public static final class Builder {
        String content_type;
        String human_file_size;
        String name;
        String url;

        public Attachments build() {
            return Attachments.create(NullSafety.valueOrEmpty(this.name), NullSafety.valueOrEmpty(this.url), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.human_file_size));
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    static Attachments create(String str, String str2, String str3, String str4) {
        return new AutoValue_Attachments(str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public abstract String getContentType();

    public abstract String getHumanFileSize();

    public abstract String getName();

    public abstract String getUrl();

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getName());
        parcel.writeString(getUrl());
        parcel.writeString(getContentType());
        parcel.writeString(getHumanFileSize());
    }
}
