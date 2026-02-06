package io.intercom.android.sdk.m5.components;

import V0.p;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "", "", "title", "LV0/p;", "fontWeight", "<init>", "(Ljava/lang/String;LV0/p;)V", "component1", "()Ljava/lang/String;", "component2", "()LV0/p;", "copy", "(Ljava/lang/String;LV0/p;)Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "LV0/p;", "getFontWeight", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketStatusHeaderArgs {
    public static final int $stable = 0;
    private final p fontWeight;
    private final String title;

    public TicketStatusHeaderArgs(String str, p pVar) {
        C6496s.h(str, b.f37461S);
        C6496s.h(pVar, "fontWeight");
        this.title = str;
        this.fontWeight = pVar;
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String str, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketStatusHeaderArgs.title;
        }
        if ((i10 & 2) != 0) {
            pVar = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy(str, pVar);
    }

    public final String component1() {
        return this.title;
    }

    public final p component2() {
        return this.fontWeight;
    }

    public final TicketStatusHeaderArgs copy(String str, p pVar) {
        C6496s.h(str, b.f37461S);
        C6496s.h(pVar, "fontWeight");
        return new TicketStatusHeaderArgs(str, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        TicketStatusHeaderArgs ticketStatusHeaderArgs = (TicketStatusHeaderArgs) obj;
        return C6496s.c(this.title, ticketStatusHeaderArgs.title) && C6496s.c(this.fontWeight, ticketStatusHeaderArgs.fontWeight);
    }

    public final p getFontWeight() {
        return this.fontWeight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fontWeight.hashCode();
    }

    public String toString() {
        return "TicketStatusHeaderArgs(title=" + this.title + ", fontWeight=" + this.fontWeight + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TicketStatusHeaderArgs(String str, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? p.f8210b.c() : pVar);
    }
}
