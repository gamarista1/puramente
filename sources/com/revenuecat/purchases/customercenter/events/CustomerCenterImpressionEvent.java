package com.revenuecat.purchases.customercenter.events;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "creationData", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "data", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;", "(Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;)V", "getCreationData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "getData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;", "CreationData", "Data", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class CustomerCenterImpressionEvent implements FeatureEvent {
    private final CreationData creationData;
    private final Data data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "", "id", "Ljava/util/UUID;", "date", "Ljava/util/Date;", "(Ljava/util/UUID;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getId", "()Ljava/util/UUID;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CreationData {
        private final Date date;

        /* renamed from: id  reason: collision with root package name */
        private final UUID f59495id;

        public CreationData() {
            this((UUID) null, (Date) null, 3, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return C6496s.c(this.f59495id, creationData.f59495id) && C6496s.c(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.f59495id;
        }

        public int hashCode() {
            return (this.f59495id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.f59495id + ", date=" + this.date + ')';
        }

        public CreationData(UUID uuid, Date date2) {
            C6496s.h(uuid, "id");
            C6496s.h(date2, AttributeType.DATE);
            this.f59495id = uuid;
            this.date = date2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ CreationData(java.util.UUID r1, java.util.Date r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r0 = this;
                r4 = r3 & 1
                if (r4 == 0) goto L_0x000d
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r4 = "randomUUID()"
                kotlin.jvm.internal.C6496s.g(r1, r4)
            L_0x000d:
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0016
                java.util.Date r2 = new java.util.Date
                r2.<init>()
            L_0x0016:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent.CreationData.<init>(java.util.UUID, java.util.Date, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public CustomerCenterImpressionEvent(CreationData creationData2, Data data2) {
        C6496s.h(creationData2, "creationData");
        C6496s.h(data2, "data");
        this.creationData = creationData2;
        this.data = data2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterImpressionEvent)) {
            return false;
        }
        CustomerCenterImpressionEvent customerCenterImpressionEvent = (CustomerCenterImpressionEvent) obj;
        return C6496s.c(this.creationData, customerCenterImpressionEvent.creationData) && C6496s.c(this.data, customerCenterImpressionEvent.data);
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.creationData.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "CustomerCenterImpressionEvent(creationData=" + this.creationData + ", data=" + this.data + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerCenterImpressionEvent(CreationData creationData2, Data data2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CreationData((UUID) null, (Date) null, 3, (DefaultConstructorMarker) null) : creationData2, data2);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;", "", "timestamp", "Ljava/util/Date;", "darkMode", "", "locale", "", "version", "", "revisionID", "displayMode", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "(Ljava/util/Date;ZLjava/lang/String;IILcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;)V", "getDarkMode", "()Z", "getDisplayMode", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getLocale", "()Ljava/lang/String;", "getRevisionID", "()I", "getTimestamp", "()Ljava/util/Date;", "type", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getVersion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Data {
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String locale;
        private final int revisionID;
        private final Date timestamp;
        private final CustomerCenterEventType type;
        private final int version;

        public Data(Date date, boolean z10, String str, int i10, int i11, CustomerCenterDisplayMode customerCenterDisplayMode) {
            C6496s.h(date, DiagnosticsEntry.TIMESTAMP_KEY);
            C6496s.h(str, "locale");
            C6496s.h(customerCenterDisplayMode, "displayMode");
            this.timestamp = date;
            this.darkMode = z10;
            this.locale = str;
            this.version = i10;
            this.revisionID = i11;
            this.displayMode = customerCenterDisplayMode;
            this.type = CustomerCenterEventType.IMPRESSION;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C6496s.c(this.timestamp, data.timestamp) && this.darkMode == data.darkMode && C6496s.c(this.locale, data.locale) && this.version == data.version && this.revisionID == data.revisionID && this.displayMode == data.displayMode;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return (((((((((this.timestamp.hashCode() * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.locale.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.revisionID)) * 31) + this.displayMode.hashCode();
        }

        public String toString() {
            return "Data(timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", version=" + this.version + ", revisionID=" + this.revisionID + ", displayMode=" + this.displayMode + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(Date date, boolean z10, String str, int i10, int i11, CustomerCenterDisplayMode customerCenterDisplayMode, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(date, z10, str, (i12 & 8) != 0 ? 1 : i10, (i12 & 16) != 0 ? 1 : i11, (i12 & 32) != 0 ? CustomerCenterDisplayMode.FULL_SCREEN : customerCenterDisplayMode);
        }
    }
}
