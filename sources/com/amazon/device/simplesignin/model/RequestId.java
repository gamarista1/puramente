package com.amazon.device.simplesignin.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

public final class RequestId implements Parcelable {
    public static final Parcelable.Creator<RequestId> CREATOR = new Parcelable.Creator<RequestId>() {
        public RequestId createFromParcel(Parcel parcel) {
            return new RequestId(parcel.readString());
        }

        public RequestId[] newArray(int i10) {
            return new RequestId[i10];
        }
    };

    /* renamed from: id  reason: collision with root package name */
    private final String f38092id;

    public RequestId(String str) {
        this.f38092id = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f38092id;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f38092id);
    }

    public RequestId() {
        this.f38092id = UUID.randomUUID().toString();
    }
}
