package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContext;", "Landroid/os/Parcelable;", "", "offeringIdentifier", "placementIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "targetingContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOfferingIdentifier", "getPlacementIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "getTargetingContext", "TargetingContext", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PresentedOfferingContext implements Parcelable {
    public static final Parcelable.Creator<PresentedOfferingContext> CREATOR = new Creator();
    private final String offeringIdentifier;
    private final String placementIdentifier;
    private final TargetingContext targetingContext;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PresentedOfferingContext> {
        public final PresentedOfferingContext createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new PresentedOfferingContext(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TargetingContext.CREATOR.createFromParcel(parcel));
        }

        public final PresentedOfferingContext[] newArray(int i10) {
            return new PresentedOfferingContext[i10];
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "Landroid/os/Parcelable;", "", "revision", "", "ruleId", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getRevision", "Ljava/lang/String;", "getRuleId", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TargetingContext implements Parcelable {
        public static final Parcelable.Creator<TargetingContext> CREATOR = new Creator();
        private final int revision;
        private final String ruleId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TargetingContext> {
            public final TargetingContext createFromParcel(Parcel parcel) {
                C6496s.h(parcel, "parcel");
                return new TargetingContext(parcel.readInt(), parcel.readString());
            }

            public final TargetingContext[] newArray(int i10) {
                return new TargetingContext[i10];
            }
        }

        public TargetingContext(int i10, String str) {
            C6496s.h(str, "ruleId");
            this.revision = i10;
            this.ruleId = str;
        }

        public static /* synthetic */ TargetingContext copy$default(TargetingContext targetingContext, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = targetingContext.revision;
            }
            if ((i11 & 2) != 0) {
                str = targetingContext.ruleId;
            }
            return targetingContext.copy(i10, str);
        }

        public final int component1() {
            return this.revision;
        }

        public final String component2() {
            return this.ruleId;
        }

        public final TargetingContext copy(int i10, String str) {
            C6496s.h(str, "ruleId");
            return new TargetingContext(i10, str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetingContext)) {
                return false;
            }
            TargetingContext targetingContext = (TargetingContext) obj;
            return this.revision == targetingContext.revision && C6496s.c(this.ruleId, targetingContext.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.revision) * 31) + this.ruleId.hashCode();
        }

        public String toString() {
            return "TargetingContext(revision=" + this.revision + ", ruleId=" + this.ruleId + ')';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            C6496s.h(parcel, "out");
            parcel.writeInt(this.revision);
            parcel.writeString(this.ruleId);
        }
    }

    public PresentedOfferingContext(String str, String str2, TargetingContext targetingContext2) {
        C6496s.h(str, "offeringIdentifier");
        this.offeringIdentifier = str;
        this.placementIdentifier = str2;
        this.targetingContext = targetingContext2;
    }

    public static /* synthetic */ PresentedOfferingContext copy$default(PresentedOfferingContext presentedOfferingContext, String str, String str2, TargetingContext targetingContext2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presentedOfferingContext.offeringIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = presentedOfferingContext.placementIdentifier;
        }
        if ((i10 & 4) != 0) {
            targetingContext2 = presentedOfferingContext.targetingContext;
        }
        return presentedOfferingContext.copy(str, str2, targetingContext2);
    }

    public final String component1() {
        return this.offeringIdentifier;
    }

    public final String component2() {
        return this.placementIdentifier;
    }

    public final TargetingContext component3() {
        return this.targetingContext;
    }

    public final PresentedOfferingContext copy(String str, String str2, TargetingContext targetingContext2) {
        C6496s.h(str, "offeringIdentifier");
        return new PresentedOfferingContext(str, str2, targetingContext2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedOfferingContext)) {
            return false;
        }
        PresentedOfferingContext presentedOfferingContext = (PresentedOfferingContext) obj;
        return C6496s.c(this.offeringIdentifier, presentedOfferingContext.offeringIdentifier) && C6496s.c(this.placementIdentifier, presentedOfferingContext.placementIdentifier) && C6496s.c(this.targetingContext, presentedOfferingContext.targetingContext);
    }

    public final String getOfferingIdentifier() {
        return this.offeringIdentifier;
    }

    public final String getPlacementIdentifier() {
        return this.placementIdentifier;
    }

    public final TargetingContext getTargetingContext() {
        return this.targetingContext;
    }

    public int hashCode() {
        int hashCode = this.offeringIdentifier.hashCode() * 31;
        String str = this.placementIdentifier;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TargetingContext targetingContext2 = this.targetingContext;
        if (targetingContext2 != null) {
            i10 = targetingContext2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "PresentedOfferingContext(offeringIdentifier=" + this.offeringIdentifier + ", placementIdentifier=" + this.placementIdentifier + ", targetingContext=" + this.targetingContext + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeString(this.offeringIdentifier);
        parcel.writeString(this.placementIdentifier);
        TargetingContext targetingContext2 = this.targetingContext;
        if (targetingContext2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        targetingContext2.writeToParcel(parcel, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresentedOfferingContext(String str) {
        this(str, (String) null, (TargetingContext) null);
        C6496s.h(str, "offeringIdentifier");
    }
}
