package io.intercom.android.sdk.m5.conversation.ui.components.row;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;", "", "", "message", "Lkotlin/Function0;", "Llf/M;", "onRetryMessageClicked", "<init>", "(Ljava/lang/String;Lyf/a;)V", "component1", "()Ljava/lang/String;", "component2", "()Lyf/a;", "copy", "(Ljava/lang/String;Lyf/a;)Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lyf/a;", "getOnRetryMessageClicked", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FailedMessage {
    public static final int $stable = 0;
    private final String message;
    private final C6787a onRetryMessageClicked;

    public FailedMessage(String str, C6787a aVar) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(aVar, "onRetryMessageClicked");
        this.message = str;
        this.onRetryMessageClicked = aVar;
    }

    public static /* synthetic */ FailedMessage copy$default(FailedMessage failedMessage, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = failedMessage.message;
        }
        if ((i10 & 2) != 0) {
            aVar = failedMessage.onRetryMessageClicked;
        }
        return failedMessage.copy(str, aVar);
    }

    public final String component1() {
        return this.message;
    }

    public final C6787a component2() {
        return this.onRetryMessageClicked;
    }

    public final FailedMessage copy(String str, C6787a aVar) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(aVar, "onRetryMessageClicked");
        return new FailedMessage(str, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedMessage)) {
            return false;
        }
        FailedMessage failedMessage = (FailedMessage) obj;
        return C6496s.c(this.message, failedMessage.message) && C6496s.c(this.onRetryMessageClicked, failedMessage.onRetryMessageClicked);
    }

    public final String getMessage() {
        return this.message;
    }

    public final C6787a getOnRetryMessageClicked() {
        return this.onRetryMessageClicked;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.onRetryMessageClicked.hashCode();
    }

    public String toString() {
        return "FailedMessage(message=" + this.message + ", onRetryMessageClicked=" + this.onRetryMessageClicked + ')';
    }
}
