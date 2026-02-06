package io.intercom.android.sdk.m5.conversation.states;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "", "name", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketProgressRowState {
    public static final int $stable = 0;
    private final String name;
    private final String status;

    public TicketProgressRowState(String str, String str2) {
        C6496s.h(str, "name");
        C6496s.h(str2, "status");
        this.name = str;
        this.status = str2;
    }

    public static /* synthetic */ TicketProgressRowState copy$default(TicketProgressRowState ticketProgressRowState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketProgressRowState.name;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketProgressRowState.status;
        }
        return ticketProgressRowState.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.status;
    }

    public final TicketProgressRowState copy(String str, String str2) {
        C6496s.h(str, "name");
        C6496s.h(str2, "status");
        return new TicketProgressRowState(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketProgressRowState)) {
            return false;
        }
        TicketProgressRowState ticketProgressRowState = (TicketProgressRowState) obj;
        return C6496s.c(this.name, ticketProgressRowState.name) && C6496s.c(this.status, ticketProgressRowState.status);
    }

    public final String getName() {
        return this.name;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "TicketProgressRowState(name=" + this.name + ", status=" + this.status + ')';
    }
}
