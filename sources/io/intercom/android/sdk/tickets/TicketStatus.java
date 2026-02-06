package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import r0.C2550z0;
import sf.C6714a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketStatus;", "", "Lr0/x0;", "color", "", "iconRes", "<init>", "(Ljava/lang/String;IJI)V", "J", "getColor-0d7_KjU", "()J", "I", "getIconRes", "()I", "Submitted", "InProgress", "WaitingOnCustomer", "Resolved", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TicketStatus {
    Submitted(C2550z0.d(4278212607L), R.drawable.intercom_ticket_submitted_icon),
    InProgress(C2550z0.d(4278212607L), R.drawable.intercom_ticket_submitted_icon),
    WaitingOnCustomer(C2550z0.d(4291644690L), R.drawable.intercom_ticket_waiting_icon),
    Resolved(C2550z0.d(4279072050L), R.drawable.intercom_ticket_resolved_icon);
    
    private final long color;
    private final int iconRes;

    static {
        TicketStatus[] $values;
        $ENTRIES = C6714a.a($values);
    }

    private TicketStatus(long j10, int i10) {
        this.color = j10;
        this.iconRes = i10;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m537getColor0d7_KjU() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }
}
