package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.utils.Event;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "Lcom/revenuecat/purchases/utils/Event;", "name", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "properties", "", "", "", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateTime", "Ljava/util/Date;", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;Ljava/util/Map;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;)V", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDateTime", "()Ljava/util/Date;", "getName", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsEntry implements Event {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String NAME_KEY = "name";
    @Deprecated
    public static final String PROPERTIES_KEY = "properties";
    @Deprecated
    public static final String TIMESTAMP_KEY = "timestamp";
    @Deprecated
    public static final int VERSION = 1;
    @Deprecated
    public static final String VERSION_KEY = "version";
    private final DateProvider dateProvider;
    private final Date dateTime;
    private final DiagnosticsEntryName name;
    private final Map<String, Object> properties;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Companion;", "", "()V", "NAME_KEY", "", "PROPERTIES_KEY", "TIMESTAMP_KEY", "VERSION", "", "VERSION_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsEntry(DiagnosticsEntryName diagnosticsEntryName, Map<String, ? extends Object> map, DateProvider dateProvider2, Date date) {
        C6496s.h(diagnosticsEntryName, "name");
        C6496s.h(map, PROPERTIES_KEY);
        C6496s.h(dateProvider2, "dateProvider");
        C6496s.h(date, "dateTime");
        this.name = diagnosticsEntryName;
        this.properties = map;
        this.dateProvider = dateProvider2;
        this.dateTime = date;
    }

    public static /* synthetic */ DiagnosticsEntry copy$default(DiagnosticsEntry diagnosticsEntry, DiagnosticsEntryName diagnosticsEntryName, Map<String, Object> map, DateProvider dateProvider2, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            diagnosticsEntryName = diagnosticsEntry.name;
        }
        if ((i10 & 2) != 0) {
            map = diagnosticsEntry.properties;
        }
        if ((i10 & 4) != 0) {
            dateProvider2 = diagnosticsEntry.dateProvider;
        }
        if ((i10 & 8) != 0) {
            date = diagnosticsEntry.dateTime;
        }
        return diagnosticsEntry.copy(diagnosticsEntryName, map, dateProvider2, date);
    }

    private final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VERSION_KEY, 1);
        String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject.put("name", lowerCase);
        jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
        jSONObject.put(TIMESTAMP_KEY, Iso8601Utils.format(this.dateTime));
        return jSONObject;
    }

    public final DiagnosticsEntryName component1() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.properties;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.dateTime;
    }

    public final DiagnosticsEntry copy(DiagnosticsEntryName diagnosticsEntryName, Map<String, ? extends Object> map, DateProvider dateProvider2, Date date) {
        C6496s.h(diagnosticsEntryName, "name");
        C6496s.h(map, PROPERTIES_KEY);
        C6496s.h(dateProvider2, "dateProvider");
        C6496s.h(date, "dateTime");
        return new DiagnosticsEntry(diagnosticsEntryName, map, dateProvider2, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticsEntry)) {
            return false;
        }
        DiagnosticsEntry diagnosticsEntry = (DiagnosticsEntry) obj;
        return this.name == diagnosticsEntry.name && C6496s.c(this.properties, diagnosticsEntry.properties) && C6496s.c(this.dateProvider, diagnosticsEntry.dateProvider) && C6496s.c(this.dateTime, diagnosticsEntry.dateTime);
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final Date getDateTime() {
        return this.dateTime;
    }

    public final DiagnosticsEntryName getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.properties.hashCode()) * 31) + this.dateProvider.hashCode()) * 31) + this.dateTime.hashCode();
    }

    public String toString() {
        String jSONObject = toJSONObject().toString();
        C6496s.g(jSONObject, "toJSONObject().toString()");
        return jSONObject;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DiagnosticsEntry(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName r1, java.util.Map r2, com.revenuecat.purchases.common.DateProvider r3, java.util.Date r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0009
            com.revenuecat.purchases.common.DefaultDateProvider r3 = new com.revenuecat.purchases.common.DefaultDateProvider
            r3.<init>()
        L_0x0009:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0011
            java.util.Date r4 = r3.getNow()
        L_0x0011:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.<init>(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName, java.util.Map, com.revenuecat.purchases.common.DateProvider, java.util.Date, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
