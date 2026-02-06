package io.intercom.android.sdk.blocks.lib.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Block implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>() {
        public Block createFromParcel(Parcel parcel) {
            return new Block(parcel);
        }

        public Block[] newArray(int i10) {
            return new Block[i10];
        }
    };
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final long duration;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;

    /* renamed from: id  reason: collision with root package name */
    private final String f68541id;
    private final Image image;
    private final int imageHeight;
    private final String imageUrl;
    private final int imageWidth;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final Uri local_uri;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private int ticketTypeId;
    private final TicketType ticket_type;
    private final String ticket_type_title;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final String url;
    private final String username;
    private final int width;

    /* renamed from: io.intercom.android.sdk.blocks.lib.models.Block$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.BlockType[] r0 = io.intercom.android.sdk.blocks.lib.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType = r0
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.LOCALIMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.LOCAL_ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.Block.AnonymousClass2.<clinit>():void");
        }
    }

    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        Map<String, String> data;
        String description;
        Long duration;
        String fallbackUrl;
        Builder footerLink;
        Integer height;

        /* renamed from: id  reason: collision with root package name */
        String f68542id;
        Image image;
        Integer imageHeight;
        String imageUrl;
        Integer imageWidth;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        Uri local_uri;
        List<ConversationRatingOption.Builder> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        TicketType ticket_type;
        int ticket_type_id;
        String ticket_type_title;
        String title;
        String trackingUrl;
        String type;
        String url;
        String username;
        Integer width;

        public Block build() {
            return new Block(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Builder.class != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            String str = this.type;
            if (str == null ? builder.type != null : !str.equals(builder.type)) {
                return false;
            }
            String str2 = this.text;
            if (str2 == null ? builder.text != null : !str2.equals(builder.text)) {
                return false;
            }
            String str3 = this.title;
            if (str3 == null ? builder.title != null : !str3.equals(builder.title)) {
                return false;
            }
            String str4 = this.description;
            if (str4 == null ? builder.description != null : !str4.equals(builder.description)) {
                return false;
            }
            String str5 = this.linkType;
            if (str5 == null ? builder.linkType != null : !str5.equals(builder.linkType)) {
                return false;
            }
            String str6 = this.siteName;
            if (str6 == null ? builder.siteName != null : !str6.equals(builder.siteName)) {
                return false;
            }
            String str7 = this.articleId;
            if (str7 == null ? builder.articleId != null : !str7.equals(builder.articleId)) {
                return false;
            }
            Author author2 = this.author;
            if (author2 == null ? builder.author != null : !author2.equals(builder.author)) {
                return false;
            }
            Image image2 = this.image;
            if (image2 == null ? builder.image != null : !image2.equals(builder.image)) {
                return false;
            }
            Map<String, String> map = this.data;
            if (map == null ? builder.data != null : !map.equals(builder.data)) {
                return false;
            }
            String str8 = this.language;
            if (str8 == null ? builder.language != null : !str8.equals(builder.language)) {
                return false;
            }
            String str9 = this.url;
            if (str9 == null ? builder.url != null : !str9.equals(builder.url)) {
                return false;
            }
            String str10 = this.thumbnailUrl;
            if (str10 == null ? builder.thumbnailUrl != null : !str10.equals(builder.thumbnailUrl)) {
                return false;
            }
            String str11 = this.linkUrl;
            if (str11 == null ? builder.linkUrl != null : !str11.equals(builder.linkUrl)) {
                return false;
            }
            String str12 = this.trackingUrl;
            if (str12 == null ? builder.trackingUrl != null : !str12.equals(builder.trackingUrl)) {
                return false;
            }
            String str13 = this.fallbackUrl;
            if (str13 == null ? builder.fallbackUrl != null : !str13.equals(builder.fallbackUrl)) {
                return false;
            }
            String str14 = this.username;
            if (str14 == null ? builder.username != null : !str14.equals(builder.username)) {
                return false;
            }
            String str15 = this.provider;
            if (str15 == null ? builder.provider != null : !str15.equals(builder.provider)) {
                return false;
            }
            String str16 = this.f68542id;
            if (str16 == null ? builder.f68542id != null : !str16.equals(builder.f68542id)) {
                return false;
            }
            String str17 = this.align;
            if (str17 == null ? builder.align != null : !str17.equals(builder.align)) {
                return false;
            }
            Integer num = this.width;
            if (num == null ? builder.width != null : !num.equals(builder.width)) {
                return false;
            }
            Integer num2 = this.height;
            if (num2 == null ? builder.height != null : !num2.equals(builder.height)) {
                return false;
            }
            Long l10 = this.duration;
            if (l10 == null ? builder.duration != null : !l10.equals(builder.duration)) {
                return false;
            }
            String str18 = this.previewUrl;
            if (str18 == null ? builder.previewUrl != null : !str18.equals(builder.previewUrl)) {
                return false;
            }
            String str19 = this.attribution;
            if (str19 == null ? builder.attribution != null : !str19.equals(builder.attribution)) {
                return false;
            }
            List<BlockAttachment> list = this.attachments;
            if (list == null ? builder.attachments != null : !list.equals(builder.attachments)) {
                return false;
            }
            List<String> list2 = this.items;
            if (list2 == null ? builder.items != null : !list2.equals(builder.items)) {
                return false;
            }
            Integer num3 = this.rating_index;
            if (num3 == null ? builder.rating_index != null : !num3.equals(builder.rating_index)) {
                return false;
            }
            Integer num4 = this.ratingIndex;
            if (num4 == null ? builder.ratingIndex != null : !num4.equals(builder.ratingIndex)) {
                return false;
            }
            String str20 = this.remark;
            if (str20 == null ? builder.remark != null : !str20.equals(builder.remark)) {
                return false;
            }
            List<ConversationRatingOption.Builder> list3 = this.options;
            if (list3 == null ? builder.options != null : !list3.equals(builder.options)) {
                return false;
            }
            List<Builder> list4 = this.links;
            if (list4 == null ? builder.links != null : !list4.equals(builder.links)) {
                return false;
            }
            String str21 = this.imageUrl;
            if (str21 == null ? builder.imageUrl != null : !str21.equals(builder.imageUrl)) {
                return false;
            }
            Integer num5 = this.imageWidth;
            if (num5 == null ? builder.imageWidth != null : !num5.equals(builder.imageWidth)) {
                return false;
            }
            Integer num6 = this.imageHeight;
            if (num6 == null ? builder.imageHeight != null : !num6.equals(builder.imageHeight)) {
                return false;
            }
            String str22 = this.ticket_type_title;
            if (str22 == null ? builder.ticket_type_title != null : !str22.equals(builder.ticket_type_title)) {
                return false;
            }
            TicketType ticketType = this.ticket_type;
            if (ticketType == null ? builder.ticket_type != null : !ticketType.equals(builder.ticket_type)) {
                return false;
            }
            if (!Integer.valueOf(this.ticket_type_id).equals(Integer.valueOf(builder.ticket_type_id))) {
                return false;
            }
            Builder builder2 = this.footerLink;
            Builder builder3 = builder.footerLink;
            if (builder2 != null) {
                return builder2.equals(builder3);
            }
            if (builder3 == null) {
                return true;
            }
            return false;
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
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            String str = this.type;
            int i47 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i48 = i10 * 31;
            String str2 = this.text;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int i49 = (i48 + i11) * 31;
            String str3 = this.title;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i50 = (i49 + i12) * 31;
            String str4 = this.description;
            if (str4 != null) {
                i13 = str4.hashCode();
            } else {
                i13 = 0;
            }
            int i51 = (i50 + i13) * 31;
            String str5 = this.linkType;
            if (str5 != null) {
                i14 = str5.hashCode();
            } else {
                i14 = 0;
            }
            int i52 = (i51 + i14) * 31;
            String str6 = this.siteName;
            if (str6 != null) {
                i15 = str6.hashCode();
            } else {
                i15 = 0;
            }
            int i53 = (i52 + i15) * 31;
            String str7 = this.articleId;
            if (str7 != null) {
                i16 = str7.hashCode();
            } else {
                i16 = 0;
            }
            int i54 = (i53 + i16) * 31;
            Author author2 = this.author;
            if (author2 != null) {
                i17 = author2.hashCode();
            } else {
                i17 = 0;
            }
            int i55 = (i54 + i17) * 31;
            Image image2 = this.image;
            if (image2 != null) {
                i18 = image2.hashCode();
            } else {
                i18 = 0;
            }
            int i56 = (i55 + i18) * 31;
            Map<String, String> map = this.data;
            if (map != null) {
                i19 = map.hashCode();
            } else {
                i19 = 0;
            }
            int i57 = (i56 + i19) * 31;
            String str8 = this.language;
            if (str8 != null) {
                i20 = str8.hashCode();
            } else {
                i20 = 0;
            }
            int i58 = (i57 + i20) * 31;
            String str9 = this.url;
            if (str9 != null) {
                i21 = str9.hashCode();
            } else {
                i21 = 0;
            }
            int i59 = (i58 + i21) * 31;
            String str10 = this.thumbnailUrl;
            if (str10 != null) {
                i22 = str10.hashCode();
            } else {
                i22 = 0;
            }
            int i60 = (i59 + i22) * 31;
            String str11 = this.linkUrl;
            if (str11 != null) {
                i23 = str11.hashCode();
            } else {
                i23 = 0;
            }
            int i61 = (i60 + i23) * 31;
            String str12 = this.trackingUrl;
            if (str12 != null) {
                i24 = str12.hashCode();
            } else {
                i24 = 0;
            }
            int i62 = (i61 + i24) * 31;
            String str13 = this.fallbackUrl;
            if (str13 != null) {
                i25 = str13.hashCode();
            } else {
                i25 = 0;
            }
            int i63 = (i62 + i25) * 31;
            String str14 = this.username;
            if (str14 != null) {
                i26 = str14.hashCode();
            } else {
                i26 = 0;
            }
            int i64 = (i63 + i26) * 31;
            String str15 = this.provider;
            if (str15 != null) {
                i27 = str15.hashCode();
            } else {
                i27 = 0;
            }
            int i65 = (i64 + i27) * 31;
            String str16 = this.f68542id;
            if (str16 != null) {
                i28 = str16.hashCode();
            } else {
                i28 = 0;
            }
            int i66 = (i65 + i28) * 31;
            String str17 = this.align;
            if (str17 != null) {
                i29 = str17.hashCode();
            } else {
                i29 = 0;
            }
            int i67 = (i66 + i29) * 31;
            Integer num = this.width;
            if (num != null) {
                i30 = num.hashCode();
            } else {
                i30 = 0;
            }
            int i68 = (i67 + i30) * 31;
            Integer num2 = this.height;
            if (num2 != null) {
                i31 = num2.hashCode();
            } else {
                i31 = 0;
            }
            int i69 = (i68 + i31) * 31;
            Long l10 = this.duration;
            if (l10 != null) {
                i32 = l10.hashCode();
            } else {
                i32 = 0;
            }
            int i70 = (i69 + i32) * 31;
            String str18 = this.previewUrl;
            if (str18 != null) {
                i33 = str18.hashCode();
            } else {
                i33 = 0;
            }
            int i71 = (i70 + i33) * 31;
            String str19 = this.attribution;
            if (str19 != null) {
                i34 = str19.hashCode();
            } else {
                i34 = 0;
            }
            int i72 = (i71 + i34) * 31;
            List<BlockAttachment> list = this.attachments;
            if (list != null) {
                i35 = list.hashCode();
            } else {
                i35 = 0;
            }
            int i73 = (i72 + i35) * 31;
            List<String> list2 = this.items;
            if (list2 != null) {
                i36 = list2.hashCode();
            } else {
                i36 = 0;
            }
            int i74 = (i73 + i36) * 31;
            Integer num3 = this.rating_index;
            if (num3 != null) {
                i37 = num3.hashCode();
            } else {
                i37 = 0;
            }
            int i75 = (i74 + i37) * 31;
            Integer num4 = this.ratingIndex;
            if (num4 != null) {
                i38 = num4.hashCode();
            } else {
                i38 = 0;
            }
            int i76 = (i75 + i38) * 31;
            String str20 = this.remark;
            if (str20 != null) {
                i39 = str20.hashCode();
            } else {
                i39 = 0;
            }
            int i77 = (i76 + i39) * 31;
            List<ConversationRatingOption.Builder> list3 = this.options;
            if (list3 != null) {
                i40 = list3.hashCode();
            } else {
                i40 = 0;
            }
            int i78 = (i77 + i40) * 31;
            List<Builder> list4 = this.links;
            if (list4 != null) {
                i41 = list4.hashCode();
            } else {
                i41 = 0;
            }
            int i79 = (i78 + i41) * 31;
            Builder builder = this.footerLink;
            if (builder != null) {
                i42 = builder.hashCode();
            } else {
                i42 = 0;
            }
            int i80 = (i79 + i42) * 31;
            String str21 = this.imageUrl;
            if (str21 != null) {
                i43 = str21.hashCode();
            } else {
                i43 = 0;
            }
            int i81 = (i80 + i43) * 31;
            Integer num5 = this.imageWidth;
            if (num5 != null) {
                i44 = num5.hashCode();
            } else {
                i44 = 0;
            }
            int i82 = (i81 + i44) * 31;
            Integer num6 = this.imageHeight;
            if (num6 != null) {
                i45 = num6.hashCode();
            } else {
                i45 = 0;
            }
            int i83 = (i82 + i45) * 31;
            String str22 = this.ticket_type_title;
            if (str22 != null) {
                i46 = str22.hashCode();
            } else {
                i46 = 0;
            }
            int i84 = (i83 + i46) * 31;
            TicketType ticketType = this.ticket_type;
            if (ticketType != null) {
                i47 = ticketType.hashCode();
            }
            return ((i84 + i47) * 31) + this.ticket_type_id;
        }

        public Builder withAlign(String str) {
            this.align = str;
            return this;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAttachments(List<BlockAttachment> list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
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

        public Builder withDuration(long j10) {
            this.duration = Long.valueOf(j10);
            return this;
        }

        public Builder withHeight(int i10) {
            this.height = Integer.valueOf(i10);
            return this;
        }

        public Builder withImage(Image image2) {
            this.image = image2;
            return this;
        }

        public Builder withImageHeight(int i10) {
            this.imageHeight = Integer.valueOf(i10);
            return this;
        }

        public Builder withImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder withImageWidth(int i10) {
            this.imageWidth = Integer.valueOf(i10);
            return this;
        }

        public Builder withItems(List<String> list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withLocalUri(Uri uri) {
            this.local_uri = uri;
            return this;
        }

        public Builder withOptions(List<ConversationRatingOption.Builder> list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withRatingIndex(Integer num) {
            this.ratingIndex = num;
            return this;
        }

        public Builder withRemark(String str) {
            this.remark = str;
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

        public Builder withThumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public Builder withTicketType(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public Builder withTicketTypeTitle(String str) {
            this.ticket_type_title = str;
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

        public Builder withWidth(int i10) {
            this.width = Integer.valueOf(i10);
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
        Block block = (Block) obj;
        if (this.width != block.width || this.height != block.height || this.ratingIndex != block.ratingIndex) {
            return false;
        }
        List<BlockAttachment> list = this.attachments;
        if (list == null ? block.attachments != null : !list.equals(block.attachments)) {
            return false;
        }
        List<String> list2 = this.items;
        if (list2 == null ? block.items != null : !list2.equals(block.items)) {
            return false;
        }
        Map<String, String> map = this.data;
        if (map == null ? block.data != null : !map.equals(block.data)) {
            return false;
        }
        if (this.type != block.type || this.align != block.align) {
            return false;
        }
        Author author2 = this.author;
        if (author2 == null ? block.author != null : !author2.equals(block.author)) {
            return false;
        }
        Image image2 = this.image;
        if (image2 == null ? block.image != null : !image2.equals(block.image)) {
            return false;
        }
        String str = this.text;
        if (str == null ? block.text != null : !str.equals(block.text)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null ? block.title != null : !str2.equals(block.title)) {
            return false;
        }
        String str3 = this.description;
        if (str3 == null ? block.description != null : !str3.equals(block.description)) {
            return false;
        }
        String str4 = this.linkType;
        if (str4 == null ? block.linkType != null : !str4.equals(block.linkType)) {
            return false;
        }
        String str5 = this.siteName;
        if (str5 == null ? block.siteName != null : !str5.equals(block.siteName)) {
            return false;
        }
        String str6 = this.articleId;
        if (str6 == null ? block.articleId != null : !str6.equals(block.articleId)) {
            return false;
        }
        String str7 = this.language;
        if (str7 == null ? block.language != null : !str7.equals(block.language)) {
            return false;
        }
        String str8 = this.url;
        if (str8 == null ? block.url != null : !str8.equals(block.url)) {
            return false;
        }
        String str9 = this.thumbnailUrl;
        if (str9 == null ? block.thumbnailUrl != null : !str9.equals(block.thumbnailUrl)) {
            return false;
        }
        String str10 = this.previewUrl;
        if (str10 == null ? block.previewUrl != null : !str10.equals(block.previewUrl)) {
            return false;
        }
        String str11 = this.attribution;
        if (str11 == null ? block.attribution != null : !str11.equals(block.attribution)) {
            return false;
        }
        String str12 = this.linkUrl;
        if (str12 == null ? block.linkUrl != null : !str12.equals(block.linkUrl)) {
            return false;
        }
        String str13 = this.trackingUrl;
        if (str13 == null ? block.trackingUrl != null : !str13.equals(block.trackingUrl)) {
            return false;
        }
        String str14 = this.fallbackUrl;
        if (str14 == null ? block.fallbackUrl != null : !str14.equals(block.fallbackUrl)) {
            return false;
        }
        String str15 = this.username;
        if (str15 == null ? block.username != null : !str15.equals(block.username)) {
            return false;
        }
        String str16 = this.provider;
        if (str16 == null ? block.provider != null : !str16.equals(block.provider)) {
            return false;
        }
        String str17 = this.f68541id;
        if (str17 == null ? block.f68541id != null : !str17.equals(block.f68541id)) {
            return false;
        }
        String str18 = this.remark;
        if (str18 == null ? block.remark != null : !str18.equals(block.remark)) {
            return false;
        }
        List<ConversationRatingOption> list3 = this.options;
        if (list3 == null ? block.options != null : !list3.equals(block.options)) {
            return false;
        }
        List<Link> list4 = this.links;
        if (list4 == null ? block.links != null : !list4.equals(block.links)) {
            return false;
        }
        Uri uri = this.local_uri;
        if (uri == null ? block.local_uri != null : !uri.equals(block.local_uri)) {
            return false;
        }
        String str19 = this.imageUrl;
        if (str19 == null ? block.imageUrl != null : !str19.equals(block.imageUrl)) {
            return false;
        }
        if (this.imageWidth != block.imageWidth || this.imageHeight != block.imageHeight) {
            return false;
        }
        String str20 = this.ticket_type_title;
        if (str20 == null ? block.ticket_type_title != null : !str20.equals(block.ticket_type_title)) {
            return false;
        }
        TicketType ticketType = this.ticket_type;
        if (ticketType == null ? block.ticket_type != null : !ticketType.equals(block.ticket_type)) {
            return false;
        }
        Link link = this.footerLink;
        Link link2 = block.footerLink;
        if (link != null) {
            return link.equals(link2);
        }
        if (link2 == null) {
            return true;
        }
        return false;
    }

    public BlockAlignment getAlign() {
        return this.align;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public List<BlockAttachment> getAttachments() {
        return this.attachments;
    }

    public String getAttribution() {
        return this.attribution;
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

    public String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f68541id;
    }

    public Image getImage() {
        return this.image;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public Uri getLocalUri() {
        return this.local_uri;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public TicketType getTicketType() {
        return this.ticket_type;
    }

    public int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public String getTicketTypeTitle() {
        return this.ticket_type_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int getWidth() {
        return this.width;
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
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        List<BlockAttachment> list = this.attachments;
        int i41 = 0;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i42 = i10 * 31;
        List<String> list2 = this.items;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i43 = (i42 + i11) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i12 = map.hashCode();
        } else {
            i12 = 0;
        }
        int i44 = (i43 + i12) * 31;
        BlockType blockType = this.type;
        if (blockType != null) {
            i13 = blockType.hashCode();
        } else {
            i13 = 0;
        }
        int i45 = (i44 + i13) * 31;
        BlockAlignment blockAlignment = this.align;
        if (blockAlignment != null) {
            i14 = blockAlignment.hashCode();
        } else {
            i14 = 0;
        }
        int i46 = (i45 + i14) * 31;
        Author author2 = this.author;
        if (author2 != null) {
            i15 = author2.hashCode();
        } else {
            i15 = 0;
        }
        int i47 = (i46 + i15) * 31;
        Image image2 = this.image;
        if (image2 != null) {
            i16 = image2.hashCode();
        } else {
            i16 = 0;
        }
        int i48 = (i47 + i16) * 31;
        String str = this.text;
        if (str != null) {
            i17 = str.hashCode();
        } else {
            i17 = 0;
        }
        int i49 = (i48 + i17) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i18 = str2.hashCode();
        } else {
            i18 = 0;
        }
        int i50 = (i49 + i18) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i19 = str3.hashCode();
        } else {
            i19 = 0;
        }
        int i51 = (i50 + i19) * 31;
        String str4 = this.linkType;
        if (str4 != null) {
            i20 = str4.hashCode();
        } else {
            i20 = 0;
        }
        int i52 = (i51 + i20) * 31;
        String str5 = this.siteName;
        if (str5 != null) {
            i21 = str5.hashCode();
        } else {
            i21 = 0;
        }
        int i53 = (i52 + i21) * 31;
        String str6 = this.articleId;
        if (str6 != null) {
            i22 = str6.hashCode();
        } else {
            i22 = 0;
        }
        int i54 = (i53 + i22) * 31;
        String str7 = this.language;
        if (str7 != null) {
            i23 = str7.hashCode();
        } else {
            i23 = 0;
        }
        int i55 = (i54 + i23) * 31;
        String str8 = this.url;
        if (str8 != null) {
            i24 = str8.hashCode();
        } else {
            i24 = 0;
        }
        int i56 = (i55 + i24) * 31;
        String str9 = this.thumbnailUrl;
        if (str9 != null) {
            i25 = str9.hashCode();
        } else {
            i25 = 0;
        }
        int i57 = (i56 + i25) * 31;
        String str10 = this.previewUrl;
        if (str10 != null) {
            i26 = str10.hashCode();
        } else {
            i26 = 0;
        }
        int i58 = (i57 + i26) * 31;
        String str11 = this.attribution;
        if (str11 != null) {
            i27 = str11.hashCode();
        } else {
            i27 = 0;
        }
        int i59 = (i58 + i27) * 31;
        String str12 = this.linkUrl;
        if (str12 != null) {
            i28 = str12.hashCode();
        } else {
            i28 = 0;
        }
        int i60 = (i59 + i28) * 31;
        String str13 = this.trackingUrl;
        if (str13 != null) {
            i29 = str13.hashCode();
        } else {
            i29 = 0;
        }
        int i61 = (i60 + i29) * 31;
        String str14 = this.fallbackUrl;
        if (str14 != null) {
            i30 = str14.hashCode();
        } else {
            i30 = 0;
        }
        int i62 = (i61 + i30) * 31;
        String str15 = this.username;
        if (str15 != null) {
            i31 = str15.hashCode();
        } else {
            i31 = 0;
        }
        int i63 = (i62 + i31) * 31;
        String str16 = this.provider;
        if (str16 != null) {
            i32 = str16.hashCode();
        } else {
            i32 = 0;
        }
        int i64 = (i63 + i32) * 31;
        String str17 = this.f68541id;
        if (str17 != null) {
            i33 = str17.hashCode();
        } else {
            i33 = 0;
        }
        int i65 = (((((((i64 + i33) * 31) + this.width) * 31) + this.height) * 31) + this.ratingIndex) * 31;
        String str18 = this.remark;
        if (str18 != null) {
            i34 = str18.hashCode();
        } else {
            i34 = 0;
        }
        int i66 = (i65 + i34) * 31;
        List<ConversationRatingOption> list3 = this.options;
        if (list3 != null) {
            i35 = list3.hashCode();
        } else {
            i35 = 0;
        }
        int i67 = (i66 + i35) * 31;
        List<Link> list4 = this.links;
        if (list4 != null) {
            i36 = list4.hashCode();
        } else {
            i36 = 0;
        }
        int i68 = (i67 + i36) * 31;
        Link link = this.footerLink;
        if (link != null) {
            i37 = link.hashCode();
        } else {
            i37 = 0;
        }
        int i69 = (i68 + i37) * 31;
        Uri uri = this.local_uri;
        if (uri != null) {
            i38 = uri.hashCode();
        } else {
            i38 = 0;
        }
        int i70 = (i69 + i38) * 31;
        String str19 = this.imageUrl;
        if (str19 != null) {
            i39 = str19.hashCode();
        } else {
            i39 = 0;
        }
        int i71 = (((((i70 + i39) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str20 = this.ticket_type_title;
        if (str20 != null) {
            i40 = str20.hashCode();
        } else {
            i40 = 0;
        }
        int i72 = (i71 + i40) * 31;
        TicketType ticketType = this.ticket_type;
        if (ticketType != null) {
            i41 = ticketType.hashCode();
        }
        return i72 + i41;
    }

    public Builder toBuilder() {
        String str;
        Builder builder = new Builder();
        int i10 = AnonymousClass2.$SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[this.type.ordinal()];
        if (i10 == 1) {
            builder.withText(this.text).withType(this.type.getSerializedName());
        } else if (i10 == 2 || i10 == 3) {
            Builder withLocalUri = builder.withType(this.type.getSerializedName()).withUrl(this.url).withLocalUri(this.local_uri);
            String str2 = null;
            if (this.attribution.isEmpty()) {
                str = null;
            } else {
                str = this.attribution;
            }
            Builder withAttribution = withLocalUri.withAttribution(str);
            if (!this.previewUrl.isEmpty()) {
                str2 = this.previewUrl;
            }
            withAttribution.withPreviewUrl(str2).withHeight(this.height).withWidth(this.width);
        } else if (i10 == 4) {
            builder.withType(this.type.getSerializedName()).withAttachments(this.attachments);
        }
        return builder;
    }

    public String toString() {
        return "Block{attachments=" + this.attachments + ", items=" + this.items + ", data=" + this.data + ", type=" + this.type + ", align=" + this.align + ", author=" + this.author + ", image=" + this.image + ", text='" + this.text + '\'' + ", title='" + this.title + '\'' + ", description='" + this.description + '\'' + ", linkType='" + this.linkType + '\'' + ", siteName='" + this.siteName + '\'' + ", articleId='" + this.articleId + '\'' + ", language='" + this.language + '\'' + ", url='" + this.url + '\'' + ", thumbnailUrl='" + this.thumbnailUrl + '\'' + ", previewUrl='" + this.previewUrl + '\'' + ", attribution='" + this.attribution + '\'' + ", linkUrl='" + this.linkUrl + '\'' + ", trackingUrl='" + this.trackingUrl + '\'' + ", fallbackUrl='" + this.fallbackUrl + '\'' + ", username='" + this.username + '\'' + ", provider='" + this.provider + '\'' + ", id='" + this.f68541id + '\'' + ", width=" + this.width + ", height=" + this.height + ", ratingIndex=" + this.ratingIndex + ", remark='" + this.remark + '\'' + ", options=" + this.options + ", links=" + this.links + ", footerLink=" + this.footerLink + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", ticket_type_title=" + this.ticket_type_title + ", ticket_type=" + this.ticket_type + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeTypedList(this.attachments);
        parcel.writeStringList(this.items);
        parcel.writeInt(this.data.size());
        for (Map.Entry next : this.data.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        BlockType blockType = this.type;
        int i12 = -1;
        if (blockType == null) {
            i11 = -1;
        } else {
            i11 = blockType.ordinal();
        }
        parcel.writeInt(i11);
        BlockAlignment blockAlignment = this.align;
        if (blockAlignment != null) {
            i12 = blockAlignment.ordinal();
        }
        parcel.writeInt(i12);
        parcel.writeParcelable(this.author, i10);
        parcel.writeParcelable(this.image, i10);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.language);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.provider);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.attribution);
        parcel.writeString(this.f68541id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeTypedList(this.options);
        parcel.writeTypedList(this.links);
        parcel.writeParcelable(this.footerLink, i10);
        parcel.writeParcelable(this.local_uri, i10);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.ticket_type_title);
        parcel.writeParcelable(this.ticket_type, i10);
    }

    Block() {
        this(new Builder());
    }

    private Block(Builder builder) {
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
        this.data = map == null ? Collections.emptyMap() : map;
        String str8 = builder.language;
        this.language = str8 == null ? str2 : str8;
        String str9 = builder.url;
        this.url = str9 == null ? str2 : str9;
        String str10 = builder.thumbnailUrl;
        this.thumbnailUrl = str10 == null ? str2 : str10;
        String str11 = builder.linkUrl;
        this.linkUrl = str11 == null ? str2 : str11;
        String str12 = builder.trackingUrl;
        this.trackingUrl = str12 == null ? str2 : str12;
        String str13 = builder.fallbackUrl;
        this.fallbackUrl = str13 == null ? str2 : str13;
        String str14 = builder.username;
        this.username = str14 == null ? str2 : str14;
        String str15 = builder.provider;
        this.provider = str15 == null ? str2 : str15;
        String str16 = builder.f68542id;
        this.f68541id = str16 == null ? str2 : str16;
        this.align = BlockAlignment.alignValueOf(builder.align);
        Integer num = builder.width;
        int i10 = 0;
        this.width = num == null ? 0 : num.intValue();
        Integer num2 = builder.height;
        this.height = num2 == null ? 0 : num2.intValue();
        Long l10 = builder.duration;
        this.duration = l10 == null ? 0 : l10.longValue();
        String str17 = builder.previewUrl;
        this.previewUrl = str17 == null ? str2 : str17;
        String str18 = builder.attribution;
        this.attribution = str18 == null ? str2 : str18;
        Uri uri = builder.local_uri;
        this.local_uri = uri == null ? Uri.EMPTY : uri;
        String str19 = builder.imageUrl;
        this.imageUrl = str19 == null ? str2 : str19;
        Integer num3 = builder.imageWidth;
        this.imageWidth = num3 == null ? 0 : num3.intValue();
        Integer num4 = builder.imageHeight;
        this.imageHeight = num4 != null ? num4.intValue() : i10;
        this.attachments = new ArrayList();
        List<BlockAttachment> list = builder.attachments;
        if (list != null) {
            for (BlockAttachment next : list) {
                if (next != null) {
                    this.attachments.add(next);
                }
            }
        }
        this.items = new ArrayList();
        List<String> list2 = builder.items;
        if (list2 != null) {
            for (String next2 : list2) {
                if (next2 != null) {
                    this.items.add(next2);
                }
            }
        }
        Integer num5 = builder.ratingIndex;
        if (num5 != null) {
            this.ratingIndex = num5.intValue();
        } else {
            Integer num6 = builder.rating_index;
            if (num6 != null) {
                this.ratingIndex = num6.intValue();
            } else {
                this.ratingIndex = -1;
            }
        }
        String str20 = builder.remark;
        this.remark = str20 == null ? str2 : str20;
        this.options = new ArrayList();
        List<ConversationRatingOption.Builder> list3 = builder.options;
        if (list3 != null) {
            for (ConversationRatingOption.Builder next3 : list3) {
                if (next3 != null) {
                    this.options.add(next3.build());
                }
            }
        }
        this.links = new ArrayList();
        List<Builder> list4 = builder.links;
        if (list4 != null) {
            for (Builder next4 : list4) {
                if (next4 != null) {
                    this.links.add(Link.fromBlock(next4.build()));
                }
            }
        }
        Builder builder2 = builder.footerLink;
        this.footerLink = builder2 == null ? new Link() : Link.fromBlock(builder2.build());
        String str21 = builder.ticket_type_title;
        this.ticket_type_title = str21 != null ? str21 : str2;
        TicketType ticketType = builder.ticket_type;
        this.ticket_type = ticketType == null ? TicketType.Companion.getNULL() : ticketType;
        this.ticketTypeId = builder.ticket_type_id;
    }

    protected Block(Parcel parcel) {
        BlockType blockType;
        this.attachments = parcel.createTypedArrayList(BlockAttachment.CREATOR);
        this.items = parcel.createStringArrayList();
        int readInt = parcel.readInt();
        this.data = new HashMap(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        BlockAlignment blockAlignment = null;
        if (readInt2 == -1) {
            blockType = null;
        } else {
            blockType = BlockType.values()[readInt2];
        }
        this.type = blockType;
        int readInt3 = parcel.readInt();
        this.align = readInt3 != -1 ? BlockAlignment.values()[readInt3] : blockAlignment;
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.language = parcel.readString();
        this.url = parcel.readString();
        this.thumbnailUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.fallbackUrl = parcel.readString();
        this.username = parcel.readString();
        this.provider = parcel.readString();
        this.previewUrl = parcel.readString();
        this.attribution = parcel.readString();
        this.f68541id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.links = arrayList2;
        Class<Link> cls = Link.class;
        parcel.readList(arrayList2, cls.getClassLoader());
        this.footerLink = (Link) parcel.readParcelable(cls.getClassLoader());
        this.local_uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.imageWidth = parcel.readInt();
        this.imageHeight = parcel.readInt();
        this.ticket_type_title = parcel.readString();
        this.ticket_type = (TicketType) parcel.readParcelable(TicketType.class.getClassLoader());
    }
}
