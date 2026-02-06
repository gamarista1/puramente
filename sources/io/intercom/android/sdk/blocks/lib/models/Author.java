package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Author implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>() {
        public Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        public Author[] newArray(int i10) {
            return new Author[i10];
        }
    };
    private final String avatar;
    private final String firstName;
    private final String lastName;
    private final String name;

    public static final class Builder {
        String avatar;
        String firstName;
        String lastName;
        String name;

        public Author build() {
            return new Author(this);
        }

        public Builder withAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder withLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        String str = this.name;
        if (str == null ? author.name != null : !str.equals(author.name)) {
            return false;
        }
        String str2 = this.firstName;
        if (str2 == null ? author.firstName != null : !str2.equals(author.firstName)) {
            return false;
        }
        String str3 = this.lastName;
        if (str3 == null ? author.lastName != null : !str3.equals(author.lastName)) {
            return false;
        }
        String str4 = this.avatar;
        String str5 = author.avatar;
        if (str4 != null) {
            if (str4.equals(str5)) {
                return true;
            }
        } else if (str5 == null) {
            return true;
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.name;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        String str2 = this.firstName;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.lastName;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.avatar;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.name);
        parcel.writeString(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    Author() {
        this(new Builder());
    }

    private Author(Builder builder) {
        String str = builder.name;
        String str2 = "";
        this.name = str == null ? str2 : str;
        String str3 = builder.avatar;
        this.avatar = str3 == null ? str2 : str3;
        String str4 = builder.firstName;
        this.firstName = str4 == null ? str2 : str4;
        String str5 = builder.lastName;
        this.lastName = str5 != null ? str5 : str2;
    }

    protected Author(Parcel parcel) {
        this.name = parcel.readString();
        this.avatar = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }
}
