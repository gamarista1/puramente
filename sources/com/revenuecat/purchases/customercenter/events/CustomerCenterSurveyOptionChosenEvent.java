package com.revenuecat.purchases.customercenter.events;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "creationData", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;", "data", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;", "(Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;)V", "getCreationData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;", "getData", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;", "Companion", "CreationData", "Data", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class CustomerCenterSurveyOptionChosenEvent implements FeatureEvent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C6538b.a json = C6538b.f71951d;
    private final CreationData creationData;
    private final Data data;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Companion;", "", "<init>", "()V", "Llh/b$a;", "json", "Llh/b$a;", "getJson$purchases_defaultsRelease", "()Llh/b$a;", "getJson$purchases_defaultsRelease$annotations", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }

        public final C6538b.a getJson$purchases_defaultsRelease() {
            return CustomerCenterSurveyOptionChosenEvent.json;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;", "", "id", "Ljava/util/UUID;", "date", "Ljava/util/Date;", "(Ljava/util/UUID;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getId", "()Ljava/util/UUID;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final class CreationData {
        private final Date date;

        /* renamed from: id  reason: collision with root package name */
        private final UUID f59496id;

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
            return C6496s.c(this.f59496id, creationData.f59496id) && C6496s.c(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.f59496id;
        }

        public int hashCode() {
            return (this.f59496id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.f59496id + ", date=" + this.date + ')';
        }

        public CreationData(UUID uuid, Date date2) {
            C6496s.h(uuid, "id");
            C6496s.h(date2, AttributeType.DATE);
            this.f59496id = uuid;
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
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent.CreationData.<init>(java.util.UUID, java.util.Date, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public CustomerCenterSurveyOptionChosenEvent(CreationData creationData2, Data data2) {
        C6496s.h(creationData2, "creationData");
        C6496s.h(data2, "data");
        this.creationData = creationData2;
        this.data = data2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterSurveyOptionChosenEvent)) {
            return false;
        }
        CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent = (CustomerCenterSurveyOptionChosenEvent) obj;
        return C6496s.c(this.creationData, customerCenterSurveyOptionChosenEvent.creationData) && C6496s.c(this.data, customerCenterSurveyOptionChosenEvent.data);
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
        return "CustomerCenterSurveyOptionChosenEvent(creationData=" + this.creationData + ", data=" + this.data + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerCenterSurveyOptionChosenEvent(CreationData creationData2, Data data2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CreationData((UUID) null, (Date) null, 3, (DefaultConstructorMarker) null) : creationData2, data2);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0013R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001e¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;", "", "timestamp", "Ljava/util/Date;", "darkMode", "", "locale", "", "version", "", "revisionID", "displayMode", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "path", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "url", "surveyOptionID", "surveyOptionTitleKey", "additionalContext", "(Ljava/util/Date;ZLjava/lang/String;IILcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalContext", "()Ljava/lang/String;", "getDarkMode", "()Z", "getDisplayMode", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getLocale", "getPath", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getRevisionID", "()I", "getSurveyOptionID", "getSurveyOptionTitleKey", "getTimestamp", "()Ljava/util/Date;", "type", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getUrl", "getVersion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final class Data {
        private final String additionalContext;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final String surveyOptionTitleKey;
        private final Date timestamp;
        private final CustomerCenterEventType type;
        private final String url;
        private final int version;

        public Data(Date date, boolean z10, String str, int i10, int i11, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str2, String str3, String str4, String str5) {
            C6496s.h(date, DiagnosticsEntry.TIMESTAMP_KEY);
            C6496s.h(str, "locale");
            C6496s.h(customerCenterDisplayMode, "displayMode");
            C6496s.h(pathType, "path");
            C6496s.h(str3, "surveyOptionID");
            C6496s.h(str4, "surveyOptionTitleKey");
            this.timestamp = date;
            this.darkMode = z10;
            this.locale = str;
            this.version = i10;
            this.revisionID = i11;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str2;
            this.surveyOptionID = str3;
            this.surveyOptionTitleKey = str4;
            this.additionalContext = str5;
            this.type = CustomerCenterEventType.SURVEY_OPTION_CHOSEN;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C6496s.c(this.timestamp, data.timestamp) && this.darkMode == data.darkMode && C6496s.c(this.locale, data.locale) && this.version == data.version && this.revisionID == data.revisionID && this.displayMode == data.displayMode && this.path == data.path && C6496s.c(this.url, data.url) && C6496s.c(this.surveyOptionID, data.surveyOptionID) && C6496s.c(this.surveyOptionTitleKey, data.surveyOptionTitleKey) && C6496s.c(this.additionalContext, data.additionalContext);
        }

        public final String getAdditionalContext() {
            return this.additionalContext;
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

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final String getSurveyOptionTitleKey() {
            return this.surveyOptionTitleKey;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.timestamp.hashCode() * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.locale.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.revisionID)) * 31) + this.displayMode.hashCode()) * 31) + this.path.hashCode()) * 31;
            String str = this.url;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.surveyOptionID.hashCode()) * 31) + this.surveyOptionTitleKey.hashCode()) * 31;
            String str2 = this.additionalContext;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "Data(timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", version=" + this.version + ", revisionID=" + this.revisionID + ", displayMode=" + this.displayMode + ", path=" + this.path + ", url=" + this.url + ", surveyOptionID=" + this.surveyOptionID + ", surveyOptionTitleKey=" + this.surveyOptionTitleKey + ", additionalContext=" + this.additionalContext + ')';
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Data(java.util.Date r16, boolean r17, java.lang.String r18, int r19, int r20, com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode r21, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 8
                r2 = 1
                if (r1 == 0) goto L_0x0009
                r7 = r2
                goto L_0x000b
            L_0x0009:
                r7 = r19
            L_0x000b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0011
                r8 = r2
                goto L_0x0013
            L_0x0011:
                r8 = r20
            L_0x0013:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x001b
                com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode r1 = com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.FULL_SCREEN
                r9 = r1
                goto L_0x001d
            L_0x001b:
                r9 = r21
            L_0x001d:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0024
                r0 = 0
                r14 = r0
                goto L_0x0026
            L_0x0024:
                r14 = r26
            L_0x0026:
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r10 = r22
                r11 = r23
                r12 = r24
                r13 = r25
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent.Data.<init>(java.util.Date, boolean, java.lang.String, int, int, com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
