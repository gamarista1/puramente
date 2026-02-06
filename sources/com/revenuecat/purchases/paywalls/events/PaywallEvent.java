package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import java.util.UUID;
import jh.d;
import kh.C6456i0;
import kh.C6478z;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 32\u00020\u0001:\u00044356B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 ¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "creationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "data", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "type", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "component2", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "getCreationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "getData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "getType", "Companion", "$serializer", "CreationData", "Data", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalPreviewRevenueCatPurchasesAPI
public final class PaywallEvent implements FeatureEvent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, C6478z.b("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values())};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "Ljava/util/UUID;", "id", "Ljava/util/Date;", "date", "<init>", "(Ljava/util/UUID;Ljava/util/Date;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/Date;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Ljh/d;Lih/f;)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/util/Date;", "copy", "(Ljava/util/UUID;Ljava/util/Date;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getId$annotations", "()V", "Ljava/util/Date;", "getDate", "getDate$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CreationData {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Date date;

        /* renamed from: id  reason: collision with root package name */
        private final UUID f59544id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ CreationData(int i10, @C5985i(with = UUIDSerializer.class) UUID uuid, @C5985i(with = DateSerializer.class) Date date2, t0 t0Var) {
            if (3 != (i10 & 3)) {
                C6456i0.a(i10, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
            }
            this.f59544id = uuid;
            this.date = date2;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uuid = creationData.f59544id;
            }
            if ((i10 & 2) != 0) {
                date2 = creationData.date;
            }
            return creationData.copy(uuid, date2);
        }

        @C5985i(with = DateSerializer.class)
        public static /* synthetic */ void getDate$annotations() {
        }

        @C5985i(with = UUIDSerializer.class)
        public static /* synthetic */ void getId$annotations() {
        }

        public static final /* synthetic */ void write$Self(CreationData creationData, d dVar, f fVar) {
            dVar.B(fVar, 0, UUIDSerializer.INSTANCE, creationData.f59544id);
            dVar.B(fVar, 1, DateSerializer.INSTANCE, creationData.date);
        }

        public final UUID component1() {
            return this.f59544id;
        }

        public final Date component2() {
            return this.date;
        }

        public final CreationData copy(UUID uuid, Date date2) {
            C6496s.h(uuid, "id");
            C6496s.h(date2, AttributeType.DATE);
            return new CreationData(uuid, date2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return C6496s.c(this.f59544id, creationData.f59544id) && C6496s.c(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.f59544id;
        }

        public int hashCode() {
            return (this.f59544id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.f59544id + ", date=" + this.date + ')';
        }

        public CreationData(UUID uuid, Date date2) {
            C6496s.h(uuid, "id");
            C6496s.h(date2, AttributeType.DATE);
            this.f59544id = uuid;
            this.date = date2;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBU\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b3\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010#¨\u00069"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "", "offeringIdentifier", "", "paywallRevision", "Ljava/util/UUID;", "sessionIdentifier", "displayMode", "localeIdentifier", "", "darkMode", "<init>", "(Ljava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Ljh/d;Lih/f;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/UUID;", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferingIdentifier", "I", "getPaywallRevision", "Ljava/util/UUID;", "getSessionIdentifier", "getSessionIdentifier$annotations", "()V", "getDisplayMode", "getLocaleIdentifier", "Z", "getDarkMode", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Data {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final boolean darkMode;
        private final String displayMode;
        private final String localeIdentifier;
        private final String offeringIdentifier;
        private final int paywallRevision;
        private final UUID sessionIdentifier;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return PaywallEvent$Data$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ Data(int i10, String str, int i11, @C5985i(with = UUIDSerializer.class) UUID uuid, String str2, String str3, boolean z10, t0 t0Var) {
            if (63 != (i10 & 63)) {
                C6456i0.a(i10, 63, PaywallEvent$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.offeringIdentifier = str;
            this.paywallRevision = i11;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z10;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i10, UUID uuid, String str2, String str3, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.offeringIdentifier;
            }
            if ((i11 & 2) != 0) {
                i10 = data.paywallRevision;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                uuid = data.sessionIdentifier;
            }
            UUID uuid2 = uuid;
            if ((i11 & 8) != 0) {
                str2 = data.displayMode;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                str3 = data.localeIdentifier;
            }
            String str5 = str3;
            if ((i11 & 32) != 0) {
                z10 = data.darkMode;
            }
            return data.copy(str, i12, uuid2, str4, str5, z10);
        }

        @C5985i(with = UUIDSerializer.class)
        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public static final /* synthetic */ void write$Self(Data data, d dVar, f fVar) {
            dVar.t(fVar, 0, data.offeringIdentifier);
            dVar.i(fVar, 1, data.paywallRevision);
            dVar.B(fVar, 2, UUIDSerializer.INSTANCE, data.sessionIdentifier);
            dVar.t(fVar, 3, data.displayMode);
            dVar.t(fVar, 4, data.localeIdentifier);
            dVar.A(fVar, 5, data.darkMode);
        }

        public final String component1() {
            return this.offeringIdentifier;
        }

        public final int component2() {
            return this.paywallRevision;
        }

        public final UUID component3() {
            return this.sessionIdentifier;
        }

        public final String component4() {
            return this.displayMode;
        }

        public final String component5() {
            return this.localeIdentifier;
        }

        public final boolean component6() {
            return this.darkMode;
        }

        public final Data copy(String str, int i10, UUID uuid, String str2, String str3, boolean z10) {
            C6496s.h(str, "offeringIdentifier");
            C6496s.h(uuid, "sessionIdentifier");
            C6496s.h(str2, "displayMode");
            C6496s.h(str3, "localeIdentifier");
            return new Data(str, i10, uuid, str2, str3, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C6496s.c(this.offeringIdentifier, data.offeringIdentifier) && this.paywallRevision == data.paywallRevision && C6496s.c(this.sessionIdentifier, data.sessionIdentifier) && C6496s.c(this.displayMode, data.displayMode) && C6496s.c(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode;
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

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        public int hashCode() {
            int hashCode = ((((((((this.offeringIdentifier.hashCode() * 31) + Integer.hashCode(this.paywallRevision)) * 31) + this.sessionIdentifier.hashCode()) * 31) + this.displayMode.hashCode()) * 31) + this.localeIdentifier.hashCode()) * 31;
            boolean z10 = this.darkMode;
            if (z10) {
                z10 = true;
            }
            return hashCode + (z10 ? 1 : 0);
        }

        public String toString() {
            return "Data(offeringIdentifier=" + this.offeringIdentifier + ", paywallRevision=" + this.paywallRevision + ", sessionIdentifier=" + this.sessionIdentifier + ", displayMode=" + this.displayMode + ", localeIdentifier=" + this.localeIdentifier + ", darkMode=" + this.darkMode + ')';
        }

        public Data(String str, int i10, UUID uuid, String str2, String str3, boolean z10) {
            C6496s.h(str, "offeringIdentifier");
            C6496s.h(uuid, "sessionIdentifier");
            C6496s.h(str2, "displayMode");
            C6496s.h(str3, "localeIdentifier");
            this.offeringIdentifier = str;
            this.paywallRevision = i10;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z10;
        }
    }

    @C6521e
    public /* synthetic */ PaywallEvent(int i10, CreationData creationData2, Data data2, PaywallEventType paywallEventType, t0 t0Var) {
        if (7 != (i10 & 7)) {
            C6456i0.a(i10, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.creationData = creationData2;
        this.data = data2;
        this.type = paywallEventType;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData2, Data data2, PaywallEventType paywallEventType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            creationData2 = paywallEvent.creationData;
        }
        if ((i10 & 2) != 0) {
            data2 = paywallEvent.data;
        }
        if ((i10 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData2, data2, paywallEventType);
    }

    public static final /* synthetic */ void write$Self(PaywallEvent paywallEvent, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, PaywallEvent$CreationData$$serializer.INSTANCE, paywallEvent.creationData);
        dVar.B(fVar, 1, PaywallEvent$Data$$serializer.INSTANCE, paywallEvent.data);
        dVar.B(fVar, 2, bVarArr[2], paywallEvent.type);
    }

    public final CreationData component1() {
        return this.creationData;
    }

    public final Data component2() {
        return this.data;
    }

    public final PaywallEventType component3() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData2, Data data2, PaywallEventType paywallEventType) {
        C6496s.h(creationData2, "creationData");
        C6496s.h(data2, "data");
        C6496s.h(paywallEventType, "type");
        return new PaywallEvent(creationData2, data2, paywallEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) obj;
        return C6496s.c(this.creationData, paywallEvent.creationData) && C6496s.c(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.creationData.hashCode() * 31) + this.data.hashCode()) * 31) + this.type.hashCode();
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsRelease() {
        String uuid = this.data.getSessionIdentifier().toString();
        C6496s.g(uuid, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(uuid, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }

    public PaywallEvent(CreationData creationData2, Data data2, PaywallEventType paywallEventType) {
        C6496s.h(creationData2, "creationData");
        C6496s.h(data2, "data");
        C6496s.h(paywallEventType, "type");
        this.creationData = creationData2;
        this.data = data2;
        this.type = paywallEventType;
    }
}
