package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Objects;

@AutoValue
public abstract class Participant implements Parcelable {
    public static final String ADMIN_TYPE = "admin";
    public static final Parcelable.Creator<Participant> CREATOR = new Parcelable.Creator<Participant>() {
        public Participant createFromParcel(Parcel parcel) {
            return Participant.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Avatar) parcel.readValue(Avatar.class.getClassLoader()), Boolean.valueOf(parcel.readByte() == 0));
        }

        public Participant[] newArray(int i10) {
            return new Participant[i10];
        }
    };
    public static final Participant NULL = create("", "", "", "", Avatar.create("", ""), Boolean.FALSE);
    public static final String USER_TYPE = "user";

    public static final class Builder {
        Avatar.Builder avatar;
        String email;

        /* renamed from: id  reason: collision with root package name */
        String f70039id;
        Boolean is_bot;
        String name;
        String type;

        public Participant build() {
            String str;
            String str2;
            Avatar build;
            String str3;
            String str4 = this.type;
            if (str4 == null) {
                str4 = Participant.USER_TYPE;
            }
            String str5 = str4;
            String valueOrEmpty = NullSafety.valueOrEmpty(this.name);
            String valueOrEmpty2 = NullSafety.valueOrEmpty(this.email);
            Avatar.Builder builder = this.avatar;
            if (builder != null) {
                str = builder.initials;
            } else {
                str = null;
            }
            if (NullSafety.valueOrEmpty(str).isEmpty()) {
                if (valueOrEmpty.isEmpty()) {
                    str3 = valueOrEmpty2;
                } else {
                    str3 = valueOrEmpty;
                }
                str2 = NameUtils.getInitial(str3);
            } else {
                str2 = this.avatar.initials;
            }
            Avatar.Builder builder2 = this.avatar;
            if (builder2 == null) {
                build = Avatar.create("", str2);
            } else {
                build = builder2.withInitials(str2).build();
            }
            return Participant.create(NullSafety.valueOrEmpty(this.f70039id), valueOrEmpty, str5, valueOrEmpty2, build, Boolean.valueOf(NullSafety.valueOrDefault(this.is_bot, false)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Builder.class != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (!Objects.equals(this.f70039id, builder.f70039id) || !Objects.equals(this.name, builder.name) || !Objects.equals(this.type, builder.type) || !Objects.equals(this.email, builder.email) || !Objects.equals(this.avatar, builder.avatar) || !Objects.equals(this.is_bot, builder.is_bot)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f70039id, this.name, this.type, this.email, this.avatar, this.is_bot});
        }

        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withId(String str) {
            this.f70039id = str;
            return this;
        }

        public Builder withIsBot(boolean z10) {
            this.is_bot = Boolean.valueOf(z10);
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    public static Participant create(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        return new AutoValue_Participant(str, str2, str3, str4, avatar, bool);
    }

    public int describeContents() {
        return 0;
    }

    public abstract Avatar getAvatar();

    public abstract String getEmail();

    public String getForename() {
        return nameOrEmail().trim().split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)[0];
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getType();

    public boolean isAdmin() {
        return ADMIN_TYPE.equals(getType());
    }

    public abstract Boolean isBot();

    public boolean isUserWithId(String str) {
        if (!USER_TYPE.equals(getType()) || !getId().equals(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public String nameOrEmail() {
        if (getName().isEmpty()) {
            return getEmail();
        }
        return getName();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(getId());
        parcel.writeString(getName());
        parcel.writeString(getType());
        parcel.writeString(getEmail());
        parcel.writeValue(getAvatar());
        parcel.writeByte(isBot().booleanValue() ? (byte) 1 : 0);
    }
}
