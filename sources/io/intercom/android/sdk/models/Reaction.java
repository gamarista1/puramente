package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

@AutoValue
public abstract class Reaction implements Parcelable {
    public static final Parcelable.Creator<Reaction> CREATOR = new Parcelable.Creator<Reaction>() {
        public Reaction createFromParcel(Parcel parcel) {
            return Reaction.create(parcel.readInt(), parcel.readString());
        }

        public Reaction[] newArray(int i10) {
            return new Reaction[i10];
        }
    };

    public static final class Builder {
        String image_url;
        int index;

        public Reaction build() {
            return Reaction.create(this.index, NullSafety.valueOrEmpty(this.image_url));
        }
    }

    public static Reaction create(int i10, String str) {
        return new AutoValue_Reaction(i10, str);
    }

    public int describeContents() {
        return 0;
    }

    public abstract String getImageUrl();

    public abstract int getIndex();

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(getIndex());
        parcel.writeString(getImageUrl());
    }
}
