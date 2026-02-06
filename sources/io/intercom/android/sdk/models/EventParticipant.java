package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.NullSafety;

public class EventParticipant implements Parcelable {
    public static final Parcelable.Creator<EventParticipant> CREATOR = new Parcelable.Creator<EventParticipant>() {
        public EventParticipant createFromParcel(Parcel parcel) {
            return new EventParticipant(parcel);
        }

        public EventParticipant[] newArray(int i10) {
            return new EventParticipant[i10];
        }
    };
    public static final EventParticipant NULL = new EventParticipant(new Builder());
    private final Avatar avatar;

    /* renamed from: id  reason: collision with root package name */
    private final String f70033id;
    private final String initial;
    private final String label;
    private final String type;

    public static final class Builder {
        Avatar.Builder avatar;

        /* renamed from: id  reason: collision with root package name */
        String f70034id;
        String initial;
        String label;
        String type;

        public EventParticipant build() {
            return new EventParticipant(this);
        }
    }

    public int describeContents() {
        return 0;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getId() {
        return this.f70033id;
    }

    public String getInitial() {
        return this.initial;
    }

    public String getLabel() {
        return this.label;
    }

    public String getType() {
        return this.type;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f70033id);
        parcel.writeString(this.initial);
        parcel.writeString(this.label);
        parcel.writeString(this.type);
        parcel.writeValue(this.avatar);
    }

    private EventParticipant(Builder builder) {
        this.f70033id = NullSafety.valueOrEmpty(builder.f70034id);
        this.initial = NullSafety.valueOrEmpty(builder.initial);
        this.label = NullSafety.valueOrEmpty(builder.label);
        this.type = NullSafety.valueOrEmpty(builder.type);
        Avatar.Builder builder2 = builder.avatar;
        this.avatar = (builder2 == null ? new Avatar.Builder() : builder2).build();
    }

    protected EventParticipant(Parcel parcel) {
        this.f70033id = parcel.readString();
        this.initial = parcel.readString();
        this.label = parcel.readString();
        this.type = parcel.readString();
        this.avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
    }
}
