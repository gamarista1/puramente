package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
import com.revenuecat.purchases.utils.Event;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kh.x0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent;", "Lcom/revenuecat/purchases/utils/Event;", "<init>", "()V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendEvent;Ljh/d;Lih/f;)V", "Companion", "CustomerCenter", "Paywalls", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackendEvent implements Event {
    /* access modifiers changed from: private */
    public static final Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    public static final int CUSTOMER_CENTER_EVENT_SCHEMA_VERSION = 1;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "serializer", "()Lgh/b;", "", "CUSTOMER_CENTER_EVENT_SCHEMA_VERSION", "I", "PAYWALL_EVENT_SCHEMA_VERSION", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) BackendEvent.$cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\"\b\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017B¥\u0001\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010%J\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010%J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010'J\u001a\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010)R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bI\u0010E\u001a\u0004\bH\u0010%R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bK\u0010E\u001a\u0004\bJ\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010-R \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bP\u0010E\u001a\u0004\bO\u0010/R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bQ\u0010%R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010R\u0012\u0004\bT\u0010E\u001a\u0004\bS\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bW\u0010%R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010@\u0012\u0004\bY\u0010E\u001a\u0004\bX\u0010%R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010@\u0012\u0004\b[\u0010E\u001a\u0004\bZ\u0010%¨\u0006^"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", "id", "", "revisionID", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "type", "appUserID", "appSessionID", "", "timestamp", "", "darkMode", "locale", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "displayMode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "path", "url", "surveyOptionID", "surveyOptionTitleKey", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "component4", "component5", "component6", "()J", "component7", "()Z", "component8", "component9", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "component10", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "component11", "component12", "component13", "copy", "(Ljava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getRevisionID", "getRevisionID$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "getAppUserID", "getAppUserID$annotations", "getAppSessionID", "getAppSessionID$annotations", "J", "getTimestamp", "Z", "getDarkMode", "getDarkMode$annotations", "getLocale", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getDisplayMode", "getDisplayMode$annotations", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getPath", "getUrl", "getSurveyOptionID", "getSurveyOptionID$annotations", "getSurveyOptionTitleKey", "getSurveyOptionTitleKey$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomerCenter extends BackendEvent {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {null, null, CustomerCenterEventType.Companion.serializer(), null, null, null, null, null, CustomerCenterDisplayMode.Companion.serializer(), CustomerCenterConfigData.HelpPath.PathType.Companion.serializer(), null, null, null};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String appSessionID;
        private final String appUserID;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;

        /* renamed from: id  reason: collision with root package name */
        private final String f59481id;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final String surveyOptionTitleKey;
        private final long timestamp;
        private final CustomerCenterEventType type;
        private final String url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return BackendEvent$CustomerCenter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C6521e
        public /* synthetic */ CustomerCenter(int i10, String str, int i11, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j10, boolean z10, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, String str7, t0 t0Var) {
            super(i10, t0Var);
            if (8191 != (i10 & 8191)) {
                C6456i0.a(i10, 8191, BackendEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
            }
            this.f59481id = str;
            this.revisionID = i11;
            this.type = customerCenterEventType;
            this.appUserID = str2;
            this.appSessionID = str3;
            this.timestamp = j10;
            this.darkMode = z10;
            this.locale = str4;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str5;
            this.surveyOptionID = str6;
            this.surveyOptionTitleKey = str7;
        }

        public static /* synthetic */ CustomerCenter copy$default(CustomerCenter customerCenter, String str, int i10, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j10, boolean z10, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, String str7, int i11, Object obj) {
            CustomerCenter customerCenter2 = customerCenter;
            int i12 = i11;
            return customerCenter.copy((i12 & 1) != 0 ? customerCenter2.f59481id : str, (i12 & 2) != 0 ? customerCenter2.revisionID : i10, (i12 & 4) != 0 ? customerCenter2.type : customerCenterEventType, (i12 & 8) != 0 ? customerCenter2.appUserID : str2, (i12 & 16) != 0 ? customerCenter2.appSessionID : str3, (i12 & 32) != 0 ? customerCenter2.timestamp : j10, (i12 & 64) != 0 ? customerCenter2.darkMode : z10, (i12 & 128) != 0 ? customerCenter2.locale : str4, (i12 & 256) != 0 ? customerCenter2.displayMode : customerCenterDisplayMode, (i12 & 512) != 0 ? customerCenter2.path : pathType, (i12 & 1024) != 0 ? customerCenter2.url : str5, (i12 & 2048) != 0 ? customerCenter2.surveyOptionID : str6, (i12 & 4096) != 0 ? customerCenter2.surveyOptionTitleKey : str7);
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getDarkMode$annotations() {
        }

        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        public static /* synthetic */ void getRevisionID$annotations() {
        }

        public static /* synthetic */ void getSurveyOptionID$annotations() {
        }

        public static /* synthetic */ void getSurveyOptionTitleKey$annotations() {
        }

        public static final /* synthetic */ void write$Self(CustomerCenter customerCenter, d dVar, f fVar) {
            BackendEvent.write$Self(customerCenter, dVar, fVar);
            C5978b[] bVarArr = $childSerializers;
            dVar.t(fVar, 0, customerCenter.f59481id);
            dVar.i(fVar, 1, customerCenter.revisionID);
            dVar.B(fVar, 2, bVarArr[2], customerCenter.type);
            dVar.t(fVar, 3, customerCenter.appUserID);
            dVar.t(fVar, 4, customerCenter.appSessionID);
            dVar.C(fVar, 5, customerCenter.timestamp);
            dVar.A(fVar, 6, customerCenter.darkMode);
            dVar.t(fVar, 7, customerCenter.locale);
            dVar.B(fVar, 8, bVarArr[8], customerCenter.displayMode);
            dVar.p(fVar, 9, bVarArr[9], customerCenter.path);
            x0 x0Var = x0.f71726a;
            dVar.p(fVar, 10, x0Var, customerCenter.url);
            dVar.p(fVar, 11, x0Var, customerCenter.surveyOptionID);
            dVar.p(fVar, 12, x0Var, customerCenter.surveyOptionTitleKey);
        }

        public final String component1() {
            return this.f59481id;
        }

        public final CustomerCenterConfigData.HelpPath.PathType component10() {
            return this.path;
        }

        public final String component11() {
            return this.url;
        }

        public final String component12() {
            return this.surveyOptionID;
        }

        public final String component13() {
            return this.surveyOptionTitleKey;
        }

        public final int component2() {
            return this.revisionID;
        }

        public final CustomerCenterEventType component3() {
            return this.type;
        }

        public final String component4() {
            return this.appUserID;
        }

        public final String component5() {
            return this.appSessionID;
        }

        public final long component6() {
            return this.timestamp;
        }

        public final boolean component7() {
            return this.darkMode;
        }

        public final String component8() {
            return this.locale;
        }

        public final CustomerCenterDisplayMode component9() {
            return this.displayMode;
        }

        public final CustomerCenter copy(String str, int i10, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j10, boolean z10, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, String str7) {
            String str8 = str;
            C6496s.h(str8, "id");
            CustomerCenterEventType customerCenterEventType2 = customerCenterEventType;
            C6496s.h(customerCenterEventType2, "type");
            String str9 = str2;
            C6496s.h(str9, "appUserID");
            String str10 = str3;
            C6496s.h(str10, "appSessionID");
            String str11 = str4;
            C6496s.h(str11, "locale");
            CustomerCenterDisplayMode customerCenterDisplayMode2 = customerCenterDisplayMode;
            C6496s.h(customerCenterDisplayMode2, "displayMode");
            return new CustomerCenter(str8, i10, customerCenterEventType2, str9, str10, j10, z10, str11, customerCenterDisplayMode2, pathType, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerCenter)) {
                return false;
            }
            CustomerCenter customerCenter = (CustomerCenter) obj;
            return C6496s.c(this.f59481id, customerCenter.f59481id) && this.revisionID == customerCenter.revisionID && this.type == customerCenter.type && C6496s.c(this.appUserID, customerCenter.appUserID) && C6496s.c(this.appSessionID, customerCenter.appSessionID) && this.timestamp == customerCenter.timestamp && this.darkMode == customerCenter.darkMode && C6496s.c(this.locale, customerCenter.locale) && this.displayMode == customerCenter.displayMode && this.path == customerCenter.path && C6496s.c(this.url, customerCenter.url) && C6496s.c(this.surveyOptionID, customerCenter.surveyOptionID) && C6496s.c(this.surveyOptionTitleKey, customerCenter.surveyOptionTitleKey);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getId() {
            return this.f59481id;
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

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f59481id.hashCode() * 31) + Integer.hashCode(this.revisionID)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.appSessionID.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31;
            boolean z10 = this.darkMode;
            if (z10) {
                z10 = true;
            }
            int hashCode2 = (((((hashCode + (z10 ? 1 : 0)) * 31) + this.locale.hashCode()) * 31) + this.displayMode.hashCode()) * 31;
            CustomerCenterConfigData.HelpPath.PathType pathType = this.path;
            int i10 = 0;
            int hashCode3 = (hashCode2 + (pathType == null ? 0 : pathType.hashCode())) * 31;
            String str = this.url;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.surveyOptionID;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.surveyOptionTitleKey;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            return "CustomerCenter(id=" + this.f59481id + ", revisionID=" + this.revisionID + ", type=" + this.type + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", displayMode=" + this.displayMode + ", path=" + this.path + ", url=" + this.url + ", surveyOptionID=" + this.surveyOptionID + ", surveyOptionTitleKey=" + this.surveyOptionTitleKey + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CustomerCenter(String str, int i10, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j10, boolean z10, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, String str7) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            C6496s.h(customerCenterEventType, "type");
            C6496s.h(str2, "appUserID");
            C6496s.h(str3, "appSessionID");
            C6496s.h(str4, "locale");
            C6496s.h(customerCenterDisplayMode, "displayMode");
            this.f59481id = str;
            this.revisionID = i10;
            this.type = customerCenterEventType;
            this.appUserID = str2;
            this.appSessionID = str3;
            this.timestamp = j10;
            this.darkMode = z10;
            this.locale = str4;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str5;
            this.surveyOptionID = str6;
            this.surveyOptionTitleKey = str7;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u001d\b\b\u0018\u0000 M2\u00020\u0001:\u0002NMB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J~\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010 J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\"J\u001a\u00104\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010 R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010 R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010 R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\bA\u0010=\u001a\u0004\b@\u0010 R \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010)R \u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\bG\u0010=\u001a\u0004\bF\u0010 R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bJ\u0010=\u001a\u0004\bI\u0010,R \u0010\u0010\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u00106\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010 ¨\u0006O"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", "id", "", "version", "type", "appUserID", "sessionID", "offeringID", "paywallRevision", "", "timestamp", "displayMode", "", "darkMode", "localeIdentifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()J", "component9", "component10", "()Z", "component11", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getSessionID", "getSessionID$annotations", "getOfferingID", "getOfferingID$annotations", "getPaywallRevision", "getPaywallRevision$annotations", "J", "getTimestamp", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Paywalls extends BackendEvent {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String appUserID;
        private final boolean darkMode;
        private final String displayMode;

        /* renamed from: id  reason: collision with root package name */
        private final String f59482id;
        private final String localeIdentifier;
        private final String offeringID;
        private final int paywallRevision;
        private final String sessionID;
        private final long timestamp;
        private final String type;
        private final int version;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return BackendEvent$Paywalls$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C6521e
        public /* synthetic */ Paywalls(int i10, String str, int i11, String str2, String str3, String str4, String str5, int i12, long j10, String str6, boolean z10, String str7, t0 t0Var) {
            super(i10, t0Var);
            if (2047 != (i10 & 2047)) {
                C6456i0.a(i10, 2047, BackendEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
            }
            this.f59482id = str;
            this.version = i11;
            this.type = str2;
            this.appUserID = str3;
            this.sessionID = str4;
            this.offeringID = str5;
            this.paywallRevision = i12;
            this.timestamp = j10;
            this.displayMode = str6;
            this.darkMode = z10;
            this.localeIdentifier = str7;
        }

        public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, String str, int i10, String str2, String str3, String str4, String str5, int i11, long j10, String str6, boolean z10, String str7, int i12, Object obj) {
            Paywalls paywalls2 = paywalls;
            int i13 = i12;
            return paywalls.copy((i13 & 1) != 0 ? paywalls2.f59482id : str, (i13 & 2) != 0 ? paywalls2.version : i10, (i13 & 4) != 0 ? paywalls2.type : str2, (i13 & 8) != 0 ? paywalls2.appUserID : str3, (i13 & 16) != 0 ? paywalls2.sessionID : str4, (i13 & 32) != 0 ? paywalls2.offeringID : str5, (i13 & 64) != 0 ? paywalls2.paywallRevision : i11, (i13 & 128) != 0 ? paywalls2.timestamp : j10, (i13 & 256) != 0 ? paywalls2.displayMode : str6, (i13 & 512) != 0 ? paywalls2.darkMode : z10, (i13 & 1024) != 0 ? paywalls2.localeIdentifier : str7);
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getDarkMode$annotations() {
        }

        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        public static /* synthetic */ void getLocaleIdentifier$annotations() {
        }

        public static /* synthetic */ void getOfferingID$annotations() {
        }

        public static /* synthetic */ void getPaywallRevision$annotations() {
        }

        public static /* synthetic */ void getSessionID$annotations() {
        }

        public static final /* synthetic */ void write$Self(Paywalls paywalls, d dVar, f fVar) {
            BackendEvent.write$Self(paywalls, dVar, fVar);
            dVar.t(fVar, 0, paywalls.f59482id);
            dVar.i(fVar, 1, paywalls.version);
            dVar.t(fVar, 2, paywalls.type);
            dVar.t(fVar, 3, paywalls.appUserID);
            dVar.t(fVar, 4, paywalls.sessionID);
            dVar.t(fVar, 5, paywalls.offeringID);
            dVar.i(fVar, 6, paywalls.paywallRevision);
            dVar.C(fVar, 7, paywalls.timestamp);
            dVar.t(fVar, 8, paywalls.displayMode);
            dVar.A(fVar, 9, paywalls.darkMode);
            dVar.t(fVar, 10, paywalls.localeIdentifier);
        }

        public final String component1() {
            return this.f59482id;
        }

        public final boolean component10() {
            return this.darkMode;
        }

        public final String component11() {
            return this.localeIdentifier;
        }

        public final int component2() {
            return this.version;
        }

        public final String component3() {
            return this.type;
        }

        public final String component4() {
            return this.appUserID;
        }

        public final String component5() {
            return this.sessionID;
        }

        public final String component6() {
            return this.offeringID;
        }

        public final int component7() {
            return this.paywallRevision;
        }

        public final long component8() {
            return this.timestamp;
        }

        public final String component9() {
            return this.displayMode;
        }

        public final Paywalls copy(String str, int i10, String str2, String str3, String str4, String str5, int i11, long j10, String str6, boolean z10, String str7) {
            C6496s.h(str, "id");
            String str8 = str2;
            C6496s.h(str8, "type");
            String str9 = str3;
            C6496s.h(str9, "appUserID");
            String str10 = str4;
            C6496s.h(str10, "sessionID");
            String str11 = str5;
            C6496s.h(str11, "offeringID");
            String str12 = str6;
            C6496s.h(str12, "displayMode");
            String str13 = str7;
            C6496s.h(str13, "localeIdentifier");
            return new Paywalls(str, i10, str8, str9, str10, str11, i11, j10, str12, z10, str13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paywalls)) {
                return false;
            }
            Paywalls paywalls = (Paywalls) obj;
            return C6496s.c(this.f59482id, paywalls.f59482id) && this.version == paywalls.version && C6496s.c(this.type, paywalls.type) && C6496s.c(this.appUserID, paywalls.appUserID) && C6496s.c(this.sessionID, paywalls.sessionID) && C6496s.c(this.offeringID, paywalls.offeringID) && this.paywallRevision == paywalls.paywallRevision && this.timestamp == paywalls.timestamp && C6496s.c(this.displayMode, paywalls.displayMode) && this.darkMode == paywalls.darkMode && C6496s.c(this.localeIdentifier, paywalls.localeIdentifier);
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getDisplayMode() {
            return this.displayMode;
        }

        public final String getId() {
            return this.f59482id;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final String getSessionID() {
            return this.sessionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((this.f59482id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.offeringID.hashCode()) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.displayMode.hashCode()) * 31;
            boolean z10 = this.darkMode;
            if (z10) {
                z10 = true;
            }
            return ((hashCode + (z10 ? 1 : 0)) * 31) + this.localeIdentifier.hashCode();
        }

        public String toString() {
            return "Paywalls(id=" + this.f59482id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", sessionID=" + this.sessionID + ", offeringID=" + this.offeringID + ", paywallRevision=" + this.paywallRevision + ", timestamp=" + this.timestamp + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Paywalls(String str, int i10, String str2, String str3, String str4, String str5, int i11, long j10, String str6, boolean z10, String str7) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            C6496s.h(str2, "type");
            C6496s.h(str3, "appUserID");
            C6496s.h(str4, "sessionID");
            C6496s.h(str5, "offeringID");
            C6496s.h(str6, "displayMode");
            C6496s.h(str7, "localeIdentifier");
            this.f59482id = str;
            this.version = i10;
            this.type = str2;
            this.appUserID = str3;
            this.sessionID = str4;
            this.offeringID = str5;
            this.paywallRevision = i11;
            this.timestamp = j10;
            this.displayMode = str6;
            this.darkMode = z10;
            this.localeIdentifier = str7;
        }
    }

    public /* synthetic */ BackendEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BackendEvent() {
    }

    @C6521e
    public /* synthetic */ BackendEvent(int i10, t0 t0Var) {
    }

    public static final /* synthetic */ void write$Self(BackendEvent backendEvent, d dVar, f fVar) {
    }
}
