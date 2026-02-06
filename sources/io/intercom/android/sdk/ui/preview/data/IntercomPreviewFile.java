package io.intercom.android.sdk.ui.preview.data;

import Sg.p;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "Landroid/os/Parcelable;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "getMimeType", "", "context", "Landroid/content/Context;", "isImage", "", "isVideo", "LocalFile", "NetworkFile", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class IntercomPreviewFile implements Parcelable {
    public static final int $stable = 8;
    private final Uri uri;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "Landroid/net/Uri;", "fileUri", "<init>", "(Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getFileUri", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalFile extends IntercomPreviewFile {
        public static final int $stable = 8;
        public static final Parcelable.Creator<LocalFile> CREATOR = new Creator();
        private final Uri fileUri;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalFile> {
            public final LocalFile createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new LocalFile((Uri) parcel.readParcelable(LocalFile.class.getClassLoader()));
            }

            public final LocalFile[] newArray(int i10) {
                return new LocalFile[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LocalFile(Uri uri) {
            super(uri, (DefaultConstructorMarker) null);
            C6496s.h(uri, "fileUri");
            this.fileUri = uri;
        }

        public static /* synthetic */ LocalFile copy$default(LocalFile localFile, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = localFile.fileUri;
            }
            return localFile.copy(uri);
        }

        public final Uri component1() {
            return this.fileUri;
        }

        public final LocalFile copy(Uri uri) {
            C6496s.h(uri, "fileUri");
            return new LocalFile(uri);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalFile) && C6496s.c(this.fileUri, ((LocalFile) obj).fileUri);
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        public String toString() {
            return "LocalFile(fileUri=" + this.fileUri + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeParcelable(this.fileUri, i10);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "", "url", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getMimeType", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkFile extends IntercomPreviewFile {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NetworkFile> CREATOR = new Creator();
        private final String mimeType;
        private final String url;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NetworkFile> {
            public final NetworkFile createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new NetworkFile(parcel.readString(), parcel.readString());
            }

            public final NetworkFile[] newArray(int i10) {
                return new NetworkFile[i10];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NetworkFile(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.C6496s.h(r3, r0)
                java.lang.String r0 = "mimeType"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                android.net.Uri r0 = android.net.Uri.parse(r3)
                java.lang.String r1 = "parse(...)"
                kotlin.jvm.internal.C6496s.g(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.url = r3
                r2.mimeType = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile.NetworkFile.<init>(java.lang.String, java.lang.String):void");
        }

        public static /* synthetic */ NetworkFile copy$default(NetworkFile networkFile, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = networkFile.url;
            }
            if ((i10 & 2) != 0) {
                str2 = networkFile.mimeType;
            }
            return networkFile.copy(str, str2);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.mimeType;
        }

        public final NetworkFile copy(String str, String str2) {
            C6496s.h(str, "url");
            C6496s.h(str2, "mimeType");
            return new NetworkFile(str, str2);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkFile)) {
                return false;
            }
            NetworkFile networkFile = (NetworkFile) obj;
            return C6496s.c(this.url, networkFile.url) && C6496s.c(this.mimeType, networkFile.mimeType);
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.mimeType.hashCode();
        }

        public String toString() {
            return "NetworkFile(url=" + this.url + ", mimeType=" + this.mimeType + ')';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "dest");
            parcel.writeString(this.url);
            parcel.writeString(this.mimeType);
        }
    }

    public /* synthetic */ IntercomPreviewFile(Uri uri2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri2);
    }

    public final String getMimeType(Context context) {
        C6496s.h(context, "context");
        if (this instanceof LocalFile) {
            String type = context.getContentResolver().getType(this.uri);
            if (type == null) {
                return "application/*";
            }
            return type;
        } else if (this instanceof NetworkFile) {
            return ((NetworkFile) this).getMimeType();
        } else {
            throw new C6535s();
        }
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isImage(Context context) {
        C6496s.h(context, "context");
        return p.O(getMimeType(context), AppearanceType.IMAGE, false, 2, (Object) null);
    }

    public final boolean isVideo(Context context) {
        C6496s.h(context, "context");
        return p.O(getMimeType(context), "video", false, 2, (Object) null);
    }

    private IntercomPreviewFile(Uri uri2) {
        this.uri = uri2;
    }
}
