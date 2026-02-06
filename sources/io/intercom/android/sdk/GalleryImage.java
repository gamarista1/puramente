package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0014J~\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b,\u0010\u0014J\u0010\u0010-\u001a\u00020\tH×\u0001¢\u0006\u0004\b-\u0010\u001cJ\u001a\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.H×\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010\u001cR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b\u000e\u0010'R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b\u000f\u0010'R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b>\u0010\u0014¨\u0006?"}, d2 = {"Lio/intercom/android/sdk/GalleryImage;", "Landroid/os/Parcelable;", "", "fileName", "mimeType", "Landroid/net/Uri;", "uri", "previewPath", "attribution", "", "imageWidth", "imageHeight", "fileSize", "", "isGif", "isVideo", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/String;)V", "getImageWidthXHeight", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "()Landroid/net/Uri;", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/String;)Lio/intercom/android/sdk/GalleryImage;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "getMimeType", "Landroid/net/Uri;", "getUri", "getPreviewPath", "getAttribution", "I", "getImageWidth", "getImageHeight", "getFileSize", "Z", "getDuration", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GalleryImage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();
    private final String attribution;
    private final String duration;
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;
    private final String mimeType;
    private final String previewPath;
    private final Uri uri;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryImage> {
        public final GalleryImage createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(GalleryImage.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            boolean z10 = true;
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z10 = false;
            }
            return new GalleryImage(readString, readString2, uri, readString3, readString4, readInt, readInt2, readInt3, z11, z10, parcel.readString());
        }

        public final GalleryImage[] newArray(int i10) {
            return new GalleryImage[i10];
        }
    }

    public GalleryImage() {
        this((String) null, (String) null, (Uri) null, (String) null, (String) null, 0, 0, 0, false, false, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, String str, String str2, Uri uri2, String str3, String str4, int i10, int i11, int i12, boolean z10, boolean z11, String str5, int i13, Object obj) {
        GalleryImage galleryImage2 = galleryImage;
        int i14 = i13;
        return galleryImage.copy((i14 & 1) != 0 ? galleryImage2.fileName : str, (i14 & 2) != 0 ? galleryImage2.mimeType : str2, (i14 & 4) != 0 ? galleryImage2.uri : uri2, (i14 & 8) != 0 ? galleryImage2.previewPath : str3, (i14 & 16) != 0 ? galleryImage2.attribution : str4, (i14 & 32) != 0 ? galleryImage2.imageWidth : i10, (i14 & 64) != 0 ? galleryImage2.imageHeight : i11, (i14 & 128) != 0 ? galleryImage2.fileSize : i12, (i14 & 256) != 0 ? galleryImage2.isGif : z10, (i14 & 512) != 0 ? galleryImage2.isVideo : z11, (i14 & 1024) != 0 ? galleryImage2.duration : str5);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component10() {
        return this.isVideo;
    }

    public final String component11() {
        return this.duration;
    }

    public final String component2() {
        return this.mimeType;
    }

    public final Uri component3() {
        return this.uri;
    }

    public final String component4() {
        return this.previewPath;
    }

    public final String component5() {
        return this.attribution;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final int component8() {
        return this.fileSize;
    }

    public final boolean component9() {
        return this.isGif;
    }

    public final GalleryImage copy(String str, String str2, Uri uri2, String str3, String str4, int i10, int i11, int i12, boolean z10, boolean z11, String str5) {
        C6496s.h(str, "fileName");
        C6496s.h(str2, "mimeType");
        Uri uri3 = uri2;
        C6496s.h(uri3, "uri");
        String str6 = str3;
        C6496s.h(str6, "previewPath");
        String str7 = str4;
        C6496s.h(str7, "attribution");
        String str8 = str5;
        C6496s.h(str8, "duration");
        return new GalleryImage(str, str2, uri3, str6, str7, i10, i11, i12, z10, z11, str8);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryImage)) {
            return false;
        }
        GalleryImage galleryImage = (GalleryImage) obj;
        return C6496s.c(this.fileName, galleryImage.fileName) && C6496s.c(this.mimeType, galleryImage.mimeType) && C6496s.c(this.uri, galleryImage.uri) && C6496s.c(this.previewPath, galleryImage.previewPath) && C6496s.c(this.attribution, galleryImage.attribution) && this.imageWidth == galleryImage.imageWidth && this.imageHeight == galleryImage.imageHeight && this.fileSize == galleryImage.fileSize && this.isGif == galleryImage.isGif && this.isVideo == galleryImage.isVideo && C6496s.c(this.duration, galleryImage.duration);
    }

    public final String getAttribution() {
        return this.attribution;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getImageWidthXHeight() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.imageWidth);
        sb2.append('x');
        sb2.append(this.imageHeight);
        return sb2.toString();
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPreviewPath() {
        return this.previewPath;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((((((((((((this.fileName.hashCode() * 31) + this.mimeType.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.previewPath.hashCode()) * 31) + this.attribution.hashCode()) * 31) + Integer.hashCode(this.imageWidth)) * 31) + Integer.hashCode(this.imageHeight)) * 31) + Integer.hashCode(this.fileSize)) * 31) + Boolean.hashCode(this.isGif)) * 31) + Boolean.hashCode(this.isVideo)) * 31) + this.duration.hashCode();
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        return "GalleryImage(fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", uri=" + this.uri + ", previewPath=" + this.previewPath + ", attribution=" + this.attribution + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", fileSize=" + this.fileSize + ", isGif=" + this.isGif + ", isVideo=" + this.isVideo + ", duration=" + this.duration + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.fileName);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable(this.uri, i10);
        parcel.writeString(this.previewPath);
        parcel.writeString(this.attribution);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.isGif ? 1 : 0);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.duration);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r13 = 2046(0x7fe, float:2.867E-42)
            r14 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            r13 = 2044(0x7fc, float:2.864E-42)
            r14 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r13 = 2040(0x7f8, float:2.859E-42)
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r13 = 2032(0x7f0, float:2.847E-42)
            r14 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "attribution"
            r6 = r20
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r13 = 2016(0x7e0, float:2.825E-42)
            r14 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "attribution"
            r6 = r20
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r13 = 1984(0x7c0, float:2.78E-42)
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20, int r21, int r22) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "attribution"
            r6 = r20
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r13 = 1920(0x780, float:2.69E-42)
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "attribution"
            r6 = r20
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r13 = 1792(0x700, float:2.511E-42)
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r7 = r21
            r8 = r22
            r9 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23, boolean r24) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "attribution"
            r6 = r20
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r13 = 1536(0x600, float:2.152E-42)
            r14 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, int, int, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryImage(java.lang.String r16, java.lang.String r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23, boolean r24, boolean r25) {
        /*
            r15 = this;
            java.lang.String r0 = "fileName"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "mimeType"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "uri"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "previewPath"
            r5 = r19
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "attribution"
            r6 = r20
            kotlin.jvm.internal.C6496s.h(r6, r0)
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 0
            r12 = 0
            r1 = r15
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, int, int, boolean, boolean):void");
    }

    public GalleryImage(String str, String str2, Uri uri2, String str3, String str4, int i10, int i11, int i12, boolean z10, boolean z11, String str5) {
        C6496s.h(str, "fileName");
        C6496s.h(str2, "mimeType");
        C6496s.h(uri2, "uri");
        C6496s.h(str3, "previewPath");
        C6496s.h(str4, "attribution");
        C6496s.h(str5, "duration");
        this.fileName = str;
        this.mimeType = str2;
        this.uri = uri2;
        this.previewPath = str3;
        this.attribution = str4;
        this.imageWidth = i10;
        this.imageHeight = i11;
        this.fileSize = i12;
        this.isGif = z10;
        this.isVideo = z11;
        this.duration = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GalleryImage(java.lang.String r14, java.lang.String r15, android.net.Uri r16, java.lang.String r17, java.lang.String r18, int r19, int r20, int r21, boolean r22, boolean r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r25
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r14
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r15
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            android.net.Uri r4 = android.net.Uri.EMPTY
            goto L_0x001b
        L_0x0019:
            r4 = r16
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r17
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r18
        L_0x002b:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0032
            r7 = r8
            goto L_0x0034
        L_0x0032:
            r7 = r19
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r8
            goto L_0x003c
        L_0x003a:
            r9 = r20
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r8
            goto L_0x0044
        L_0x0042:
            r10 = r21
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r8
            goto L_0x004c
        L_0x004a:
            r11 = r22
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r8 = r23
        L_0x0053:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = r24
        L_0x005a:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r8
            r25 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.GalleryImage.<init>(java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, int, int, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
