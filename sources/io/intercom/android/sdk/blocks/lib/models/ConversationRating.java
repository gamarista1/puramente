package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class ConversationRating implements Parcelable {
    public static final Parcelable.Creator<ConversationRating> CREATOR = new Parcelable.Creator<ConversationRating>() {
        public ConversationRating createFromParcel(Parcel parcel) {
            return new ConversationRating(parcel);
        }

        public ConversationRating[] newArray(int i10) {
            return new ConversationRating[i10];
        }
    };
    private final List<ConversationRatingOption> options;
    private int ratingIndex;
    private String remark;

    ConversationRating(int i10, String str, List<ConversationRatingOption> list) {
        this.ratingIndex = i10;
        this.remark = str;
        this.options = list;
    }

    public static ConversationRating fromBlock(Block block) {
        if (block == null) {
            return new ConversationRating(-1, "", new ArrayList());
        }
        return new ConversationRating(block.getRatingIndex(), block.getRemark(), block.getOptions());
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
        ConversationRating conversationRating = (ConversationRating) obj;
        if (this.ratingIndex != conversationRating.ratingIndex) {
            return false;
        }
        String str = this.remark;
        if (str == null ? conversationRating.remark != null : !str.equals(conversationRating.remark)) {
            return false;
        }
        List<ConversationRatingOption> list = this.options;
        List<ConversationRatingOption> list2 = conversationRating.options;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public Integer getRatingIndex() {
        return Integer.valueOf(this.ratingIndex);
    }

    public String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        int i10;
        int i11 = this.ratingIndex * 31;
        String str = this.remark;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        List<ConversationRatingOption> list = this.options;
        if (list != null) {
            i12 = list.hashCode();
        }
        return i13 + i12;
    }

    public void setRatingIndex(int i10) {
        this.ratingIndex = i10;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeList(this.options);
    }

    protected ConversationRating(Parcel parcel) {
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
    }
}
