package com.revenuecat.purchases.common;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "", "keyName", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributeError {
    private final String keyName;
    private final String message;

    public SubscriberAttributeError(String str, String str2) {
        C6496s.h(str, "keyName");
        C6496s.h(str2, MetricTracker.Object.MESSAGE);
        this.keyName = str;
        this.message = str2;
    }

    public static /* synthetic */ SubscriberAttributeError copy$default(SubscriberAttributeError subscriberAttributeError, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriberAttributeError.keyName;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriberAttributeError.message;
        }
        return subscriberAttributeError.copy(str, str2);
    }

    public final String component1() {
        return this.keyName;
    }

    public final String component2() {
        return this.message;
    }

    public final SubscriberAttributeError copy(String str, String str2) {
        C6496s.h(str, "keyName");
        C6496s.h(str2, MetricTracker.Object.MESSAGE);
        return new SubscriberAttributeError(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberAttributeError)) {
            return false;
        }
        SubscriberAttributeError subscriberAttributeError = (SubscriberAttributeError) obj;
        return C6496s.c(this.keyName, subscriberAttributeError.keyName) && C6496s.c(this.message, subscriberAttributeError.message);
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.keyName.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        return "SubscriberAttributeError(keyName=" + this.keyName + ", message=" + this.message + ')';
    }
}
