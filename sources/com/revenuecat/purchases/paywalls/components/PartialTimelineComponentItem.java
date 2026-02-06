package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "connector", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "getConnector", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialTimelineComponentItem implements PartialComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final TimelineComponent.Connector connector;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialTimelineComponentItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTimelineComponentItem() {
        this((Boolean) null, (TimelineComponent.Connector) null, 3, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void write$Self(PartialTimelineComponentItem partialTimelineComponentItem, d dVar, f fVar) {
        if (dVar.q(fVar, 0) || partialTimelineComponentItem.visible != null) {
            dVar.p(fVar, 0, C6455i.f71663a, partialTimelineComponentItem.visible);
        }
        if (dVar.q(fVar, 1) || partialTimelineComponentItem.connector != null) {
            dVar.p(fVar, 1, TimelineComponent$Connector$$serializer.INSTANCE, partialTimelineComponentItem.connector);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTimelineComponentItem)) {
            return false;
        }
        PartialTimelineComponentItem partialTimelineComponentItem = (PartialTimelineComponentItem) obj;
        return C6496s.c(this.visible, partialTimelineComponentItem.visible) && C6496s.c(this.connector, partialTimelineComponentItem.connector);
    }

    public final /* synthetic */ TimelineComponent.Connector getConnector() {
        return this.connector;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        TimelineComponent.Connector connector2 = this.connector;
        if (connector2 != null) {
            i10 = connector2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PartialTimelineComponentItem(visible=" + this.visible + ", connector=" + this.connector + ')';
    }

    @C6521e
    public /* synthetic */ PartialTimelineComponentItem(int i10, Boolean bool, TimelineComponent.Connector connector2, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 2) == 0) {
            this.connector = null;
        } else {
            this.connector = connector2;
        }
    }

    public PartialTimelineComponentItem(Boolean bool, TimelineComponent.Connector connector2) {
        this.visible = bool;
        this.connector = connector2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialTimelineComponentItem(Boolean bool, TimelineComponent.Connector connector2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : connector2);
    }
}
