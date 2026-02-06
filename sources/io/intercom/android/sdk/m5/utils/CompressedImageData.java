package io.intercom.android.sdk.m5.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/utils/CompressedImageData;", "", "uri", "Landroid/net/Uri;", "width", "", "height", "size", "", "<init>", "(Landroid/net/Uri;IIJ)V", "getUri", "()Landroid/net/Uri;", "getWidth", "()I", "getHeight", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CompressedImageData {
    private final int height;
    private final long size;
    private final Uri uri;
    private final int width;

    public CompressedImageData(Uri uri2, int i10, int i11, long j10) {
        C6496s.h(uri2, "uri");
        this.uri = uri2;
        this.width = i10;
        this.height = i11;
        this.size = j10;
    }

    public static /* synthetic */ CompressedImageData copy$default(CompressedImageData compressedImageData, Uri uri2, int i10, int i11, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri2 = compressedImageData.uri;
        }
        if ((i12 & 2) != 0) {
            i10 = compressedImageData.width;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = compressedImageData.height;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            j10 = compressedImageData.size;
        }
        return compressedImageData.copy(uri2, i13, i14, j10);
    }

    public final Uri component1() {
        return this.uri;
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

    public final CompressedImageData copy(Uri uri2, int i10, int i11, long j10) {
        C6496s.h(uri2, "uri");
        return new CompressedImageData(uri2, i10, i11, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressedImageData)) {
            return false;
        }
        CompressedImageData compressedImageData = (CompressedImageData) obj;
        return C6496s.c(this.uri, compressedImageData.uri) && this.width == compressedImageData.width && this.height == compressedImageData.height && this.size == compressedImageData.size;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((this.uri.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "CompressedImageData(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ')';
    }
}
