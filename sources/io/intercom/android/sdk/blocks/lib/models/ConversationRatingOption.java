package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ConversationRatingOption implements Parcelable {
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new Parcelable.Creator<ConversationRatingOption>() {
        public ConversationRatingOption createFromParcel(Parcel parcel) {
            return new ConversationRatingOption(parcel);
        }

        public ConversationRatingOption[] newArray(int i10) {
            return new ConversationRatingOption[i10];
        }
    };
    private final String emoji;
    private final int index;
    private final String unicode;

    public static final class Builder {
        String emoji;
        Integer index;
        String unicode;

        public ConversationRatingOption build() {
            return new ConversationRatingOption(this);
        }

        public Builder withEmoji(String str) {
            this.emoji = str;
            return this;
        }

        public Builder withIndex(Integer num) {
            this.index = num;
            return this;
        }

        public Builder withUnicode(String str) {
            this.unicode = str;
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
        ConversationRatingOption conversationRatingOption = (ConversationRatingOption) obj;
        if (this.index != conversationRatingOption.index) {
            return false;
        }
        String str = this.emoji;
        if (str == null ? conversationRatingOption.emoji != null : !str.equals(conversationRatingOption.emoji)) {
            return false;
        }
        String str2 = this.unicode;
        String str3 = conversationRatingOption.unicode;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public Integer getIndex() {
        return Integer.valueOf(this.index);
    }

    public String getUnicode() {
        return this.unicode;
    }

    public int hashCode() {
        int i10;
        int i11 = this.index * 31;
        String str = this.emoji;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.unicode;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.index);
        parcel.writeString(this.emoji);
        parcel.writeString(this.unicode);
    }

    private ConversationRatingOption(Builder builder) {
        Integer num = builder.index;
        this.index = num == null ? -1 : num.intValue();
        String str = builder.emoji;
        String str2 = "";
        this.emoji = str == null ? str2 : str;
        String str3 = builder.unicode;
        this.unicode = str3 != null ? str3 : str2;
    }

    protected ConversationRatingOption(Parcel parcel) {
        this.index = parcel.readInt();
        this.emoji = parcel.readString();
        this.unicode = parcel.readString();
    }
}
