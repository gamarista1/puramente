package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

@AutoValue
public abstract class SocialAccount implements Parcelable {
    public static final Parcelable.Creator<SocialAccount> CREATOR = new Parcelable.Creator<SocialAccount>() {
        public SocialAccount createFromParcel(Parcel parcel) {
            return SocialAccount.create(parcel.readString(), parcel.readString());
        }

        public SocialAccount[] newArray(int i10) {
            return new SocialAccount[i10];
        }
    };
    public static final SocialAccount NULL = create("", "");

    public static final class Builder {
        String profile_url;
        String provider;

        public SocialAccount build() {
            return SocialAccount.create(NullSafety.valueOrEmpty(this.provider), NullSafety.valueOrEmpty(this.profile_url));
        }
    }

    public static SocialAccount create(String str, String str2) {
        return new AutoValue_SocialAccount(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public abstract String getProfileUrl();

    public abstract String getProvider();

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getProvider());
        parcel.writeString(getProfileUrl());
    }
}
