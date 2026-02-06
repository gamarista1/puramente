package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockType;
import java.util.HashMap;
import java.util.Map;

public class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() {
        public Link createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }

        public Link[] newArray(int i10) {
            return new Link[i10];
        }
    };
    private final String articleId;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final Image image;
    private final String linkType;
    private final String siteName;
    private final String text;
    private final String title;
    private final BlockType type;
    private final String url;

    public static final class Builder {
        String articleId;
        Author author;
        Map<String, String> data;
        String description;
        Image image;
        String linkType;
        String siteName;
        String text;
        String title;
        String type;
        String url;

        public Link build() {
            return new Link(this);
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAuthor(Author author2) {
            this.author = author2;
            return this;
        }

        public Builder withData(Map<String, String> map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder withImage(Image image2) {
            this.image = image2;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public static Link fromBlock(Block block) {
        if (block == null) {
            return new Link();
        }
        Builder builder = new Builder();
        builder.type = block.getType().name();
        builder.text = block.getText();
        builder.title = block.getTitle();
        builder.description = block.getDescription();
        builder.linkType = block.getLinkType();
        builder.author = block.getAuthor();
        builder.image = block.getImage();
        builder.data = block.getData();
        builder.siteName = block.getSiteName();
        builder.articleId = block.getArticleId();
        builder.url = block.getUrl();
        return new Link(builder);
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
        Link link = (Link) obj;
        if (this.type != link.type) {
            return false;
        }
        String str = this.text;
        if (str == null ? link.text != null : !str.equals(link.text)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null ? link.title != null : !str2.equals(link.title)) {
            return false;
        }
        String str3 = this.description;
        if (str3 == null ? link.description != null : !str3.equals(link.description)) {
            return false;
        }
        String str4 = this.linkType;
        if (str4 == null ? link.linkType != null : !str4.equals(link.linkType)) {
            return false;
        }
        Author author2 = this.author;
        if (author2 == null ? link.author != null : !author2.equals(link.author)) {
            return false;
        }
        Image image2 = this.image;
        if (image2 == null ? link.image != null : !image2.equals(link.image)) {
            return false;
        }
        Map<String, String> map = this.data;
        if (map == null ? link.data != null : !map.equals(link.data)) {
            return false;
        }
        String str5 = this.siteName;
        if (str5 == null ? link.siteName != null : !str5.equals(link.siteName)) {
            return false;
        }
        String str6 = this.articleId;
        if (str6 == null ? link.articleId != null : !str6.equals(link.articleId)) {
            return false;
        }
        String str7 = this.url;
        String str8 = link.url;
        if (str7 != null) {
            return str7.equals(str8);
        }
        if (str8 == null) {
            return true;
        }
        return false;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public Image getImage() {
        return this.image;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        BlockType blockType = this.type;
        int i20 = 0;
        if (blockType != null) {
            i10 = blockType.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = i10 * 31;
        String str = this.text;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i13 = str3.hashCode();
        } else {
            i13 = 0;
        }
        int i24 = (i23 + i13) * 31;
        String str4 = this.linkType;
        if (str4 != null) {
            i14 = str4.hashCode();
        } else {
            i14 = 0;
        }
        int i25 = (i24 + i14) * 31;
        Author author2 = this.author;
        if (author2 != null) {
            i15 = author2.hashCode();
        } else {
            i15 = 0;
        }
        int i26 = (i25 + i15) * 31;
        Image image2 = this.image;
        if (image2 != null) {
            i16 = image2.hashCode();
        } else {
            i16 = 0;
        }
        int i27 = (i26 + i16) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i17 = map.hashCode();
        } else {
            i17 = 0;
        }
        int i28 = (i27 + i17) * 31;
        String str5 = this.siteName;
        if (str5 != null) {
            i18 = str5.hashCode();
        } else {
            i18 = 0;
        }
        int i29 = (i28 + i18) * 31;
        String str6 = this.articleId;
        if (str6 != null) {
            i19 = str6.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (i29 + i19) * 31;
        String str7 = this.url;
        if (str7 != null) {
            i20 = str7.hashCode();
        }
        return i30 + i20;
    }

    public String toString() {
        return "LinkCard{type=" + this.type + ", text='" + this.text + '\'' + ", title='" + this.title + '\'' + ", description='" + this.description + '\'' + ", linkType='" + this.linkType + '\'' + ", author=" + this.author + ", image=" + this.image + ", data=" + this.data + ", siteName='" + this.siteName + '\'' + ", articleId='" + this.articleId + '\'' + ", url='" + this.url + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.author, i10);
        parcel.writeParcelable(this.image, i10);
        parcel.writeInt(this.data.size());
        for (Map.Entry next : this.data.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    Link() {
        this(new Builder());
    }

    private Link(Builder builder) {
        this.type = BlockType.typeValueOf(builder.type);
        String str = builder.text;
        String str2 = "";
        this.text = str == null ? str2 : str;
        String str3 = builder.title;
        this.title = str3 == null ? str2 : str3;
        String str4 = builder.description;
        this.description = str4 == null ? str2 : str4;
        String str5 = builder.linkType;
        this.linkType = str5 == null ? str2 : str5;
        String str6 = builder.siteName;
        this.siteName = str6 == null ? str2 : str6;
        String str7 = builder.articleId;
        this.articleId = str7 == null ? str2 : str7;
        Author author2 = builder.author;
        this.author = author2 == null ? new Author() : author2;
        Image image2 = builder.image;
        this.image = image2 == null ? new Image() : image2;
        Map<String, String> map = builder.data;
        this.data = map == null ? new HashMap<>() : map;
        String str8 = builder.url;
        this.url = str8 != null ? str8 : str2;
    }

    protected Link(Parcel parcel) {
        this.type = BlockType.typeValueOf(parcel.readString());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.url = parcel.readString();
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.data = new HashMap();
        int readInt = parcel.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
    }
}
