package io.intercom.android.sdk.lightcompressor.video;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Sample;", "", "offset", "", "size", "<init>", "(JJ)V", "getOffset", "()J", "setOffset", "(J)V", "getSize", "setSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Sample {
    private long offset;
    private long size;

    public Sample(long j10, long j11) {
        this.offset = j10;
        this.size = j11;
    }

    public static /* synthetic */ Sample copy$default(Sample sample, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sample.offset;
        }
        if ((i10 & 2) != 0) {
            j11 = sample.size;
        }
        return sample.copy(j10, j11);
    }

    public final long component1() {
        return this.offset;
    }

    public final long component2() {
        return this.size;
    }

    public final Sample copy(long j10, long j11) {
        return new Sample(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sample)) {
            return false;
        }
        Sample sample = (Sample) obj;
        return this.offset == sample.offset && this.size == sample.size;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return (Long.hashCode(this.offset) * 31) + Long.hashCode(this.size);
    }

    public final void setOffset(long j10) {
        this.offset = j10;
    }

    public final void setSize(long j10) {
        this.size = j10;
    }

    public String toString() {
        return "Sample(offset=" + this.offset + ", size=" + this.size + ')';
    }
}
