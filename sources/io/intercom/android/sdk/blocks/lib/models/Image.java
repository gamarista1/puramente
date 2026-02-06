package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() {
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        public Image[] newArray(int i10) {
            return new Image[i10];
        }
    };
    private final String alt;
    private final String attribution;
    private final int height;
    private final String previewUrl;
    private final String url;
    private final int width;

    public static final class Builder {
        String alt;
        String attribution;
        int height;
        String previewUrl;
        String url;
        int width;

        public Image build() {
            return new Image(this);
        }

        public Builder withAlt(String str) {
            this.alt = str;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withHeight(int i10) {
            this.height = i10;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i10) {
            this.width = i10;
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
        Image image = (Image) obj;
        String str = this.alt;
        if (str == null ? image.alt != null : !str.equals(image.alt)) {
            return false;
        }
        String str2 = this.previewUrl;
        if (str2 == null ? image.previewUrl != null : !str2.equals(image.previewUrl)) {
            return false;
        }
        String str3 = this.attribution;
        if (str3 == null ? image.attribution != null : !str3.equals(image.attribution)) {
            return false;
        }
        if (this.width != image.width || this.height != image.height) {
            return false;
        }
        String str4 = this.url;
        String str5 = image.url;
        if (str4 != null) {
            if (str4.equals(str5)) {
                return true;
            }
        } else if (str5 == null) {
            return true;
        }
        return false;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.alt;
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
        String str3 = this.previewUrl;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.attribution;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return ((((i16 + i13) * 31) + this.width) * 31) + this.height;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.attribution);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.alt);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    Image() {
        this(new Builder());
    }

    private Image(Builder builder) {
        String str = builder.alt;
        String str2 = "";
        this.alt = str == null ? str2 : str;
        String str3 = builder.url;
        this.url = str3 == null ? str2 : str3;
        String str4 = builder.previewUrl;
        this.previewUrl = str4 == null ? str2 : str4;
        String str5 = builder.attribution;
        this.attribution = str5 != null ? str5 : str2;
        this.width = builder.width;
        this.height = builder.height;
    }

    protected Image(Parcel parcel) {
        this.attribution = parcel.readString();
        this.previewUrl = parcel.readString();
        this.alt = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
