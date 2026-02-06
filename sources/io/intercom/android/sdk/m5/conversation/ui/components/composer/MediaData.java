package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.n.a.a.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "Landroid/os/Parcelable;", "getDataSource", "", "Media", "Gif", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MediaData extends Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "", "width", "height", "", "url", "attribution", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getDataSource", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Ljava/lang/String;", "getUrl", "getAttribution", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gif implements MediaData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Gif> CREATOR = new Creator();
        private final String attribution;
        private final int height;
        private final String url;
        private final int width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Gif> {
            public final Gif createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new Gif(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            public final Gif[] newArray(int i10) {
                return new Gif[i10];
            }
        }

        public Gif(int i10, int i11, String str, String str2) {
            C6496s.h(str, "url");
            C6496s.h(str2, "attribution");
            this.width = i10;
            this.height = i11;
            this.url = str;
            this.attribution = str2;
        }

        public static /* synthetic */ Gif copy$default(Gif gif, int i10, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = gif.width;
            }
            if ((i12 & 2) != 0) {
                i11 = gif.height;
            }
            if ((i12 & 4) != 0) {
                str = gif.url;
            }
            if ((i12 & 8) != 0) {
                str2 = gif.attribution;
            }
            return gif.copy(i10, i11, str, str2);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.attribution;
        }

        public final Gif copy(int i10, int i11, String str, String str2) {
            C6496s.h(str, "url");
            C6496s.h(str2, "attribution");
            return new Gif(i10, i11, str, str2);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gif)) {
                return false;
            }
            Gif gif = (Gif) obj;
            return this.width == gif.width && this.height == gif.height && C6496s.c(this.url, gif.url) && C6496s.c(this.attribution, gif.attribution);
        }

        public final String getAttribution() {
            return this.attribution;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + this.url.hashCode()) * 31) + this.attribution.hashCode();
        }

        public String toString() {
            return "Gif(width=" + this.width + ", height=" + this.height + ", url=" + this.url + ", attribution=" + this.attribution + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeString(this.url);
            parcel.writeString(this.attribution);
        }

        public String getDataSource() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "size", "", "getSize", "()J", "fileName", "getFileName", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getDataSource", "Image", "Video", "Other", "Companion", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Other;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Media extends MediaData {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Companion;", "", "<init>", "()V", "empty", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Image empty() {
                Uri uri = Uri.EMPTY;
                C6496s.g(uri, g.f37322a);
                return new Image("", 0, 0, 0, "", uri);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static Uri getDataSource(Media media) {
                return media.getUri();
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H×\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001e¨\u00062"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "", "mimeType", "", "width", "height", "", "size", "fileName", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;IIJLjava/lang/String;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "component6", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;IIJLjava/lang/String;Landroid/net/Uri;)Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "I", "getWidth", "getHeight", "J", "getSize", "getFileName", "Landroid/net/Uri;", "getUri", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Image implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Image> CREATOR = new Creator();
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Uri uri;
            private final int width;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Image> {
                public final Image createFromParcel(Parcel parcel) {
                    C6496s.h(parcel, "parcel");
                    return new Image(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Image.class.getClassLoader()));
                }

                public final Image[] newArray(int i10) {
                    return new Image[i10];
                }
            }

            public Image(String str, int i10, int i11, long j10, String str2, Uri uri2) {
                C6496s.h(str, "mimeType");
                C6496s.h(str2, "fileName");
                C6496s.h(uri2, "uri");
                this.mimeType = str;
                this.width = i10;
                this.height = i11;
                this.size = j10;
                this.fileName = str2;
                this.uri = uri2;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, int i10, int i11, long j10, String str2, Uri uri2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = image.mimeType;
                }
                if ((i12 & 2) != 0) {
                    i10 = image.width;
                }
                int i13 = i10;
                if ((i12 & 4) != 0) {
                    i11 = image.height;
                }
                int i14 = i11;
                if ((i12 & 8) != 0) {
                    j10 = image.size;
                }
                long j11 = j10;
                if ((i12 & 16) != 0) {
                    str2 = image.fileName;
                }
                String str3 = str2;
                if ((i12 & 32) != 0) {
                    uri2 = image.uri;
                }
                return image.copy(str, i13, i14, j11, str3, uri2);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            public final String component5() {
                return this.fileName;
            }

            public final Uri component6() {
                return this.uri;
            }

            public final Image copy(String str, int i10, int i11, long j10, String str2, Uri uri2) {
                C6496s.h(str, "mimeType");
                C6496s.h(str2, "fileName");
                Uri uri3 = uri2;
                C6496s.h(uri3, "uri");
                return new Image(str, i10, i11, j10, str2, uri3);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return C6496s.c(this.mimeType, image.mimeType) && this.width == image.width && this.height == image.height && this.size == image.size && C6496s.c(this.fileName, image.fileName) && C6496s.c(this.uri, image.uri);
            }

            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            public String getMimeType() {
                return this.mimeType;
            }

            public long getSize() {
                return this.size;
            }

            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return (((((((((this.mimeType.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode();
            }

            public String toString() {
                return "Image(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C6496s.h(parcel, "dest");
                parcel.writeString(this.mimeType);
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
                parcel.writeLong(this.size);
                parcel.writeString(this.fileName);
                parcel.writeParcelable(this.uri, i10);
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Other;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "", "mimeType", "", "size", "fileName", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/String;JLjava/lang/String;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;JLjava/lang/String;Landroid/net/Uri;)Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Other;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "J", "getSize", "getFileName", "Landroid/net/Uri;", "getUri", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Other implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Other> CREATOR = new Creator();
            private final String fileName;
            private final String mimeType;
            private final long size;
            private final Uri uri;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Other> {
                public final Other createFromParcel(Parcel parcel) {
                    C6496s.h(parcel, "parcel");
                    return new Other(parcel.readString(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Other.class.getClassLoader()));
                }

                public final Other[] newArray(int i10) {
                    return new Other[i10];
                }
            }

            public Other(String str, long j10, String str2, Uri uri2) {
                C6496s.h(str, "mimeType");
                C6496s.h(str2, "fileName");
                C6496s.h(uri2, "uri");
                this.mimeType = str;
                this.size = j10;
                this.fileName = str2;
                this.uri = uri2;
            }

            public static /* synthetic */ Other copy$default(Other other, String str, long j10, String str2, Uri uri2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = other.mimeType;
                }
                if ((i10 & 2) != 0) {
                    j10 = other.size;
                }
                long j11 = j10;
                if ((i10 & 4) != 0) {
                    str2 = other.fileName;
                }
                String str3 = str2;
                if ((i10 & 8) != 0) {
                    uri2 = other.uri;
                }
                return other.copy(str, j11, str3, uri2);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final long component2() {
                return this.size;
            }

            public final String component3() {
                return this.fileName;
            }

            public final Uri component4() {
                return this.uri;
            }

            public final Other copy(String str, long j10, String str2, Uri uri2) {
                C6496s.h(str, "mimeType");
                C6496s.h(str2, "fileName");
                C6496s.h(uri2, "uri");
                return new Other(str, j10, str2, uri2);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Other)) {
                    return false;
                }
                Other other = (Other) obj;
                return C6496s.c(this.mimeType, other.mimeType) && this.size == other.size && C6496s.c(this.fileName, other.fileName) && C6496s.c(this.uri, other.uri);
            }

            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public String getFileName() {
                return this.fileName;
            }

            public String getMimeType() {
                return this.mimeType;
            }

            public long getSize() {
                return this.size;
            }

            public Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return (((((this.mimeType.hashCode() * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode();
            }

            public String toString() {
                return "Other(mimeType=" + this.mimeType + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C6496s.h(parcel, "dest");
                parcel.writeString(this.mimeType);
                parcel.writeLong(this.size);
                parcel.writeString(this.fileName);
                parcel.writeParcelable(this.uri, i10);
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$Jb\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H×\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010$¨\u0006;"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "", "mimeType", "", "width", "height", "", "size", "fileName", "Landroid/net/Uri;", "uri", "duration", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "thumbnail", "<init>", "(Ljava/lang/String;IIJLjava/lang/String;Landroid/net/Uri;JLio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;)V", "Landroid/os/Parcel;", "dest", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "component6", "()Landroid/net/Uri;", "component7", "component8", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "copy", "(Ljava/lang/String;IIJLjava/lang/String;Landroid/net/Uri;JLio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;)Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "I", "getWidth", "getHeight", "J", "getSize", "getFileName", "Landroid/net/Uri;", "getUri", "getDuration", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "getThumbnail", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Video implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Video> CREATOR = new Creator();
            private final long duration;
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Image thumbnail;
            private final Uri uri;
            private final int width;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Video> {
                public final Video createFromParcel(Parcel parcel) {
                    C6496s.h(parcel, "parcel");
                    return new Video(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                public final Video[] newArray(int i10) {
                    return new Video[i10];
                }
            }

            public Video(String str, int i10, int i11, long j10, String str2, Uri uri2, long j11, Image image) {
                C6496s.h(str, "mimeType");
                C6496s.h(str2, "fileName");
                C6496s.h(uri2, "uri");
                this.mimeType = str;
                this.width = i10;
                this.height = i11;
                this.size = j10;
                this.fileName = str2;
                this.uri = uri2;
                this.duration = j11;
                this.thumbnail = image;
            }

            public static /* synthetic */ Video copy$default(Video video, String str, int i10, int i11, long j10, String str2, Uri uri2, long j11, Image image, int i12, Object obj) {
                Video video2 = video;
                int i13 = i12;
                return video.copy((i13 & 1) != 0 ? video2.mimeType : str, (i13 & 2) != 0 ? video2.width : i10, (i13 & 4) != 0 ? video2.height : i11, (i13 & 8) != 0 ? video2.size : j10, (i13 & 16) != 0 ? video2.fileName : str2, (i13 & 32) != 0 ? video2.uri : uri2, (i13 & 64) != 0 ? video2.duration : j11, (i13 & 128) != 0 ? video2.thumbnail : image);
            }

            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            public final String component5() {
                return this.fileName;
            }

            public final Uri component6() {
                return this.uri;
            }

            public final long component7() {
                return this.duration;
            }

            public final Image component8() {
                return this.thumbnail;
            }

            public final Video copy(String str, int i10, int i11, long j10, String str2, Uri uri2, long j11, Image image) {
                C6496s.h(str, "mimeType");
                String str3 = str2;
                C6496s.h(str3, "fileName");
                Uri uri3 = uri2;
                C6496s.h(uri3, "uri");
                return new Video(str, i10, i11, j10, str3, uri3, j11, image);
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj;
                return C6496s.c(this.mimeType, video.mimeType) && this.width == video.width && this.height == video.height && this.size == video.size && C6496s.c(this.fileName, video.fileName) && C6496s.c(this.uri, video.uri) && this.duration == video.duration && C6496s.c(this.thumbnail, video.thumbnail);
            }

            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public final long getDuration() {
                return this.duration;
            }

            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            public String getMimeType() {
                return this.mimeType;
            }

            public long getSize() {
                return this.size;
            }

            public final Image getThumbnail() {
                return this.thumbnail;
            }

            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int hashCode = ((((((((((((this.mimeType.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode()) * 31) + Long.hashCode(this.duration)) * 31;
                Image image = this.thumbnail;
                return hashCode + (image == null ? 0 : image.hashCode());
            }

            public String toString() {
                return "Video(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ')';
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C6496s.h(parcel, "dest");
                parcel.writeString(this.mimeType);
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
                parcel.writeLong(this.size);
                parcel.writeString(this.fileName);
                parcel.writeParcelable(this.uri, i10);
                parcel.writeLong(this.duration);
                Image image = this.thumbnail;
                if (image == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                image.writeToParcel(parcel, i10);
            }
        }

        Uri getDataSource();

        String getFileName();

        String getMimeType();

        long getSize();

        Uri getUri();
    }

    Object getDataSource();
}
