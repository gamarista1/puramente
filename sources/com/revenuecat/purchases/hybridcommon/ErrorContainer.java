package com.revenuecat.purchases.hybridcommon;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "", "code", "", "message", "", "info", "", "(ILjava/lang/String;Ljava/util/Map;)V", "getCode", "()I", "getInfo", "()Ljava/util/Map;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hybridcommon_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ErrorContainer {
    private final int code;
    private final Map<String, Object> info;
    private final String message;

    public ErrorContainer(int i10, String str, Map<String, ? extends Object> map) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(map, "info");
        this.code = i10;
        this.message = str;
        this.info = map;
    }

    public static /* synthetic */ ErrorContainer copy$default(ErrorContainer errorContainer, int i10, String str, Map<String, Object> map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorContainer.code;
        }
        if ((i11 & 2) != 0) {
            str = errorContainer.message;
        }
        if ((i11 & 4) != 0) {
            map = errorContainer.info;
        }
        return errorContainer.copy(i10, str, map);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Map<String, Object> component3() {
        return this.info;
    }

    public final ErrorContainer copy(int i10, String str, Map<String, ? extends Object> map) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(map, "info");
        return new ErrorContainer(i10, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorContainer)) {
            return false;
        }
        ErrorContainer errorContainer = (ErrorContainer) obj;
        return this.code == errorContainer.code && C6496s.c(this.message, errorContainer.message) && C6496s.c(this.info, errorContainer.info);
    }

    public final int getCode() {
        return this.code;
    }

    public final Map<String, Object> getInfo() {
        return this.info;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.info.hashCode();
    }

    public String toString() {
        return "ErrorContainer(code=" + this.code + ", message=" + this.message + ", info=" + this.info + ')';
    }
}
