package io.intercom.android.sdk.tickets.list.ui;

import com.amazon.a.a.o.b;
import io.intercom.android.sdk.tickets.TicketStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "", "id", "", "title", "subTitle", "status", "Lio/intercom/android/sdk/tickets/TicketStatus;", "isRead", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/tickets/TicketStatus;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubTitle", "getStatus", "()Lio/intercom/android/sdk/tickets/TicketStatus;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketRowData {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final String f70719id;
    private final boolean isRead;
    private final TicketStatus status;
    private final String subTitle;
    private final String title;

    public TicketRowData(String str, String str2, String str3, TicketStatus ticketStatus, boolean z10) {
        C6496s.h(str, "id");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "subTitle");
        C6496s.h(ticketStatus, "status");
        this.f70719id = str;
        this.title = str2;
        this.subTitle = str3;
        this.status = ticketStatus;
        this.isRead = z10;
    }

    public static /* synthetic */ TicketRowData copy$default(TicketRowData ticketRowData, String str, String str2, String str3, TicketStatus ticketStatus, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketRowData.f70719id;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketRowData.title;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = ticketRowData.subTitle;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            ticketStatus = ticketRowData.status;
        }
        TicketStatus ticketStatus2 = ticketStatus;
        if ((i10 & 16) != 0) {
            z10 = ticketRowData.isRead;
        }
        return ticketRowData.copy(str, str4, str5, ticketStatus2, z10);
    }

    public final String component1() {
        return this.f70719id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    public final TicketStatus component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.isRead;
    }

    public final TicketRowData copy(String str, String str2, String str3, TicketStatus ticketStatus, boolean z10) {
        C6496s.h(str, "id");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "subTitle");
        C6496s.h(ticketStatus, "status");
        return new TicketRowData(str, str2, str3, ticketStatus, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketRowData)) {
            return false;
        }
        TicketRowData ticketRowData = (TicketRowData) obj;
        return C6496s.c(this.f70719id, ticketRowData.f70719id) && C6496s.c(this.title, ticketRowData.title) && C6496s.c(this.subTitle, ticketRowData.subTitle) && this.status == ticketRowData.status && this.isRead == ticketRowData.isRead;
    }

    public final String getId() {
        return this.f70719id;
    }

    public final TicketStatus getStatus() {
        return this.status;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.f70719id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isRead);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        return "TicketRowData(id=" + this.f70719id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", status=" + this.status + ", isRead=" + this.isRead + ')';
    }
}
