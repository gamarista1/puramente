package io.intercom.android.sdk.lightcompressor.video;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Result;", "", "index", "", "success", "", "failureMessage", "", "size", "", "path", "<init>", "(IZLjava/lang/String;JLjava/lang/String;)V", "getIndex", "()I", "getSuccess", "()Z", "getFailureMessage", "()Ljava/lang/String;", "getSize", "()J", "getPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Result {
    private final String failureMessage;
    private final int index;
    private final String path;
    private final long size;
    private final boolean success;

    public Result(int i10, boolean z10, String str, long j10, String str2) {
        this.index = i10;
        this.success = z10;
        this.failureMessage = str;
        this.size = j10;
        this.path = str2;
    }

    public static /* synthetic */ Result copy$default(Result result, int i10, boolean z10, String str, long j10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = result.index;
        }
        if ((i11 & 2) != 0) {
            z10 = result.success;
        }
        boolean z11 = z10;
        if ((i11 & 4) != 0) {
            str = result.failureMessage;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            j10 = result.size;
        }
        long j11 = j10;
        if ((i11 & 16) != 0) {
            str2 = result.path;
        }
        return result.copy(i10, z11, str3, j11, str2);
    }

    public final int component1() {
        return this.index;
    }

    public final boolean component2() {
        return this.success;
    }

    public final String component3() {
        return this.failureMessage;
    }

    public final long component4() {
        return this.size;
    }

    public final String component5() {
        return this.path;
    }

    public final Result copy(int i10, boolean z10, String str, long j10, String str2) {
        return new Result(i10, z10, str, j10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.index == result.index && this.success == result.success && C6496s.c(this.failureMessage, result.failureMessage) && this.size == result.size && C6496s.c(this.path, result.path);
    }

    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.success)) * 31;
        String str = this.failureMessage;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.size)) * 31;
        String str2 = this.path;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "Result(index=" + this.index + ", success=" + this.success + ", failureMessage=" + this.failureMessage + ", size=" + this.size + ", path=" + this.path + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Result(int i10, boolean z10, String str, long j10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, str, (i11 & 8) != 0 ? 0 : j10, (i11 & 16) != 0 ? null : str2);
    }
}
