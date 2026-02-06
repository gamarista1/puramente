package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.util.Map;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lh.C6538b;

@C5985i
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b%\b\b\u0018\u0000 <2\u00020\u0001:\u0002=<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB_\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001fR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\"R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010\u001dR \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\u001d¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "", "", "sessionID", "", "revision", "displayMode", "", "darkMode", "localeIdentifier", "offeringId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Ljh/d;Lih/f;)V", "", "toMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionID", "getSessionID$annotations", "()V", "I", "getRevision", "getRevision$annotations", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getOfferingId", "getOfferingId$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallPostReceiptData {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C6538b.a json = C6538b.f71951d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final int revision;
    private final String sessionID;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "serializer", "()Lgh/b;", "Llh/b$a;", "json", "Llh/b$a;", "getJson", "()Llh/b$a;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6538b.a getJson() {
            return PaywallPostReceiptData.json;
        }

        public final C5978b serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PaywallPostReceiptData(int i10, String str, int i11, String str2, boolean z10, String str3, String str4, t0 t0Var) {
        if (63 != (i10 & 63)) {
            C6456i0.a(i10, 63, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionID = str;
        this.revision = i11;
        this.displayMode = str2;
        this.darkMode = z10;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, int i10, String str2, boolean z10, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallPostReceiptData.sessionID;
        }
        if ((i11 & 2) != 0) {
            i10 = paywallPostReceiptData.revision;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = paywallPostReceiptData.displayMode;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            z10 = paywallPostReceiptData.darkMode;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str3 = paywallPostReceiptData.localeIdentifier;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            str4 = paywallPostReceiptData.offeringId;
        }
        return paywallPostReceiptData.copy(str, i12, str5, z11, str6, str4);
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallPostReceiptData paywallPostReceiptData, d dVar, f fVar) {
        dVar.t(fVar, 0, paywallPostReceiptData.sessionID);
        dVar.i(fVar, 1, paywallPostReceiptData.revision);
        dVar.t(fVar, 2, paywallPostReceiptData.displayMode);
        dVar.A(fVar, 3, paywallPostReceiptData.darkMode);
        dVar.t(fVar, 4, paywallPostReceiptData.localeIdentifier);
        dVar.t(fVar, 5, paywallPostReceiptData.offeringId);
    }

    public final String component1() {
        return this.sessionID;
    }

    public final int component2() {
        return this.revision;
    }

    public final String component3() {
        return this.displayMode;
    }

    public final boolean component4() {
        return this.darkMode;
    }

    public final String component5() {
        return this.localeIdentifier;
    }

    public final String component6() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String str, int i10, String str2, boolean z10, String str3, String str4) {
        C6496s.h(str, "sessionID");
        C6496s.h(str2, "displayMode");
        C6496s.h(str3, "localeIdentifier");
        C6496s.h(str4, "offeringId");
        return new PaywallPostReceiptData(str, i10, str2, z10, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) obj;
        return C6496s.c(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && C6496s.c(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && C6496s.c(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && C6496s.c(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        int hashCode = ((((this.sessionID.hashCode() * 31) + Integer.hashCode(this.revision)) * 31) + this.displayMode.hashCode()) * 31;
        boolean z10 = this.darkMode;
        if (z10) {
            z10 = true;
        }
        return ((((hashCode + (z10 ? 1 : 0)) * 31) + this.localeIdentifier.hashCode()) * 31) + this.offeringId.hashCode();
    }

    public final Map<String, Object> toMap() {
        C6538b.a aVar = json;
        aVar.a();
        Map<String, Object> asMap = JsonElementExtensionsKt.asMap(aVar.e(Companion.serializer(), this));
        if (asMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(asMap);
    }

    public String toString() {
        return "PaywallPostReceiptData(sessionID=" + this.sessionID + ", revision=" + this.revision + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", offeringId=" + this.offeringId + ')';
    }

    public PaywallPostReceiptData(String str, int i10, String str2, boolean z10, String str3, String str4) {
        C6496s.h(str, "sessionID");
        C6496s.h(str2, "displayMode");
        C6496s.h(str3, "localeIdentifier");
        C6496s.h(str4, "offeringId");
        this.sessionID = str;
        this.revision = i10;
        this.displayMode = str2;
        this.darkMode = z10;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }
}
