package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

public class BlockAttachment implements Parcelable {
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new Parcelable.Creator<BlockAttachment>() {
        public BlockAttachment createFromParcel(Parcel parcel) {
            return new BlockAttachment(parcel);
        }

        public BlockAttachment[] newArray(int i10) {
            return new BlockAttachment[i10];
        }
    };
    private final String contentType;
    private final String humanFileSize;

    /* renamed from: id  reason: collision with root package name */
    private final int f68543id;
    private final String name;
    private final long size;
    private final String url;

    public static final class Builder {
        String contentType;
        String humanFileSize;

        /* renamed from: id  reason: collision with root package name */
        int f68544id;
        String name;
        long size;
        String url;

        public BlockAttachment build() {
            return new BlockAttachment(this);
        }

        public Builder withContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder withHumanFileSize(String str) {
            this.humanFileSize = str;
            return this;
        }

        public Builder withId(int i10) {
            this.f68544id = i10;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withSize(long j10) {
            this.size = j10;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public BlockAttachment() {
        this(new Builder());
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
        BlockAttachment blockAttachment = (BlockAttachment) obj;
        if (this.size != blockAttachment.size || this.f68543id != blockAttachment.f68543id) {
            return false;
        }
        String str = this.name;
        if (str == null ? blockAttachment.name != null : !str.equals(blockAttachment.name)) {
            return false;
        }
        String str2 = this.url;
        if (str2 == null ? blockAttachment.url != null : !str2.equals(blockAttachment.url)) {
            return false;
        }
        String str3 = this.humanFileSize;
        if (str3 == null ? blockAttachment.humanFileSize == null : !str3.equals(blockAttachment.humanFileSize)) {
            return false;
        }
        String str4 = this.contentType;
        String str5 = blockAttachment.contentType;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    public int getId() {
        return this.f68543id;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
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
        String str2 = this.url;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.contentType;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.humanFileSize;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        long j10 = this.size;
        return ((((i16 + i13) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f68543id;
    }

    public Builder toBuilder() {
        return new Builder().withName(this.name).withUrl(this.url).withContentType(this.contentType).withHumanFileSize(this.humanFileSize).withId(this.f68543id).withSize(this.size);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeString(this.humanFileSize);
        parcel.writeInt(this.f68543id);
        parcel.writeLong(this.size);
    }

    public BlockAttachment(Builder builder) {
        String str = builder.name;
        String str2 = "";
        this.name = str == null ? str2 : str;
        String str3 = builder.url;
        this.url = str3 == null ? str2 : str3;
        String str4 = builder.contentType;
        this.contentType = str4 == null ? str2 : str4;
        String str5 = builder.humanFileSize;
        this.humanFileSize = str5 != null ? str5 : str2;
        this.f68543id = builder.f68544id;
        this.size = builder.size;
    }

    protected BlockAttachment(Parcel parcel) {
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.contentType = parcel.readString();
        this.humanFileSize = parcel.readString();
        this.f68543id = parcel.readInt();
        this.size = parcel.readLong();
    }
}
