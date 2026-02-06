package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings;", "Landroid/os/Parcelable;", "", "autoSyncPurchases", "customEntitlementComputation", "<init>", "(ZZ)V", "(Z)V", "component1", "()Z", "component2$purchases_defaultsRelease", "component2", "copy", "(ZZ)Lcom/revenuecat/purchases/DangerousSettings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getAutoSyncPurchases", "getCustomEntitlementComputation$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DangerousSettings implements Parcelable {
    public static final Parcelable.Creator<DangerousSettings> CREATOR = new Creator();
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DangerousSettings> {
        public final DangerousSettings createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            boolean z10 = false;
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            return new DangerousSettings(z11, z10);
        }

        public final DangerousSettings[] newArray(int i10) {
            return new DangerousSettings[i10];
        }
    }

    public DangerousSettings() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dangerousSettings.autoSyncPurchases;
        }
        if ((i10 & 2) != 0) {
            z11 = dangerousSettings.customEntitlementComputation;
        }
        return dangerousSettings.copy(z10, z11);
    }

    public final boolean component1() {
        return this.autoSyncPurchases;
    }

    public final boolean component2$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    public final DangerousSettings copy(boolean z10, boolean z11) {
        return new DangerousSettings(z10, z11);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    public int hashCode() {
        boolean z10 = this.autoSyncPurchases;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.customEntitlementComputation;
        if (!z12) {
            z11 = z12;
        }
        return i10 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "DangerousSettings(autoSyncPurchases=" + this.autoSyncPurchases + ", customEntitlementComputation=" + this.customEntitlementComputation + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeInt(this.autoSyncPurchases ? 1 : 0);
        parcel.writeInt(this.customEntitlementComputation ? 1 : 0);
    }

    public DangerousSettings(boolean z10, boolean z11) {
        this.autoSyncPurchases = z10;
        this.customEntitlementComputation = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DangerousSettings(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
    }

    public DangerousSettings(boolean z10) {
        this(z10, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DangerousSettings(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
