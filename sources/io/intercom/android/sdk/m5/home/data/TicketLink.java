package io.intercom.android.sdk.m5.home.data;

import Oc.c;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/TicketLink;", "", "ticketTypeId", "", "ticketTypeName", "", "iconUrl", "displayOrder", "ticketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILio/intercom/android/sdk/blocks/lib/models/TicketType;)V", "getTicketTypeId", "()I", "getTicketTypeName", "()Ljava/lang/String;", "getIconUrl", "getDisplayOrder", "getTicketType", "()Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketLink {
    public static final int $stable = 8;
    @c("display_order")
    private final int displayOrder;
    @c("icon_url")
    private final String iconUrl;
    @c("ticket_type")
    private final TicketType ticketType;
    @c("ticket_type_id")
    private final int ticketTypeId;
    @c("ticket_type_name")
    private final String ticketTypeName;

    public TicketLink(int i10, String str, String str2, int i11, TicketType ticketType2) {
        C6496s.h(str, "ticketTypeName");
        C6496s.h(str2, b.f37487j);
        C6496s.h(ticketType2, "ticketType");
        this.ticketTypeId = i10;
        this.ticketTypeName = str;
        this.iconUrl = str2;
        this.displayOrder = i11;
        this.ticketType = ticketType2;
    }

    public static /* synthetic */ TicketLink copy$default(TicketLink ticketLink, int i10, String str, String str2, int i11, TicketType ticketType2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = ticketLink.ticketTypeId;
        }
        if ((i12 & 2) != 0) {
            str = ticketLink.ticketTypeName;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = ticketLink.iconUrl;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            i11 = ticketLink.displayOrder;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            ticketType2 = ticketLink.ticketType;
        }
        return ticketLink.copy(i10, str3, str4, i13, ticketType2);
    }

    public final int component1() {
        return this.ticketTypeId;
    }

    public final String component2() {
        return this.ticketTypeName;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final int component4() {
        return this.displayOrder;
    }

    public final TicketType component5() {
        return this.ticketType;
    }

    public final TicketLink copy(int i10, String str, String str2, int i11, TicketType ticketType2) {
        C6496s.h(str, "ticketTypeName");
        C6496s.h(str2, b.f37487j);
        C6496s.h(ticketType2, "ticketType");
        return new TicketLink(i10, str, str2, i11, ticketType2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketLink)) {
            return false;
        }
        TicketLink ticketLink = (TicketLink) obj;
        return this.ticketTypeId == ticketLink.ticketTypeId && C6496s.c(this.ticketTypeName, ticketLink.ticketTypeName) && C6496s.c(this.iconUrl, ticketLink.iconUrl) && this.displayOrder == ticketLink.displayOrder && C6496s.c(this.ticketType, ticketLink.ticketType);
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final TicketType getTicketType() {
        return this.ticketType;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTicketTypeName() {
        return this.ticketTypeName;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.ticketTypeId) * 31) + this.ticketTypeName.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + Integer.hashCode(this.displayOrder)) * 31) + this.ticketType.hashCode();
    }

    public String toString() {
        return "TicketLink(ticketTypeId=" + this.ticketTypeId + ", ticketTypeName=" + this.ticketTypeName + ", iconUrl=" + this.iconUrl + ", displayOrder=" + this.displayOrder + ", ticketType=" + this.ticketType + ')';
    }
}
