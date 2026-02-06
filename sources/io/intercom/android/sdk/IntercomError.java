package io.intercom.android.sdk;

import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/IntercomError;", "", "errorCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMessage;

    public IntercomError() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = intercomError.errorCode;
        }
        if ((i11 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i10, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final IntercomError copy(int i10, String str) {
        C6496s.h(str, b.f37483f);
        return new IntercomError(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) obj;
        return this.errorCode == intercomError.errorCode && C6496s.c(this.errorMessage, intercomError.errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return (Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "IntercomError(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
    }

    public IntercomError(int i10, String str) {
        C6496s.h(str, b.f37483f);
        this.errorCode = i10;
        this.errorMessage = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntercomError(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str);
    }
}
