package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfos;", "Landroid/os/Parcelable;", "", "", "Lcom/revenuecat/purchases/EntitlementInfo;", "all", "Lcom/revenuecat/purchases/VerificationResult;", "verification", "<init>", "(Ljava/util/Map;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/util/Map;)V", "s", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/EntitlementInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getAll", "()Ljava/util/Map;", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "()Lcom/revenuecat/purchases/VerificationResult;", "active", "getActive", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfos implements Parcelable {
    public static final Parcelable.Creator<EntitlementInfos> CREATOR = new Creator();
    private final Map<String, EntitlementInfo> active;
    private final Map<String, EntitlementInfo> all;
    private final VerificationResult verification;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EntitlementInfos> {
        public final EntitlementInfos createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new EntitlementInfos(linkedHashMap, VerificationResult.valueOf(parcel.readString()));
        }

        public final EntitlementInfos[] newArray(int i10) {
            return new EntitlementInfos[i10];
        }
    }

    public EntitlementInfos(Map<String, EntitlementInfo> map, VerificationResult verificationResult) {
        C6496s.h(map, "all");
        C6496s.h(verificationResult, "verification");
        this.all = map;
        this.verification = verificationResult;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((EntitlementInfo) next.getValue()).isActive()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(EntitlementInfos.class, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos");
        EntitlementInfos entitlementInfos = (EntitlementInfos) obj;
        if (C6496s.c(this.all, entitlementInfos.all) && C6496s.c(this.active, entitlementInfos.active) && this.verification == entitlementInfos.verification) {
            return true;
        }
        return false;
    }

    public final EntitlementInfo get(String str) {
        C6496s.h(str, "s");
        return this.all.get(str);
    }

    public final Map<String, EntitlementInfo> getActive() {
        return this.active;
    }

    public final Map<String, EntitlementInfo> getAll() {
        return this.all;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public int hashCode() {
        return (this.all.hashCode() * 31) + this.active.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        Map<String, EntitlementInfo> map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            ((EntitlementInfo) next.getValue()).writeToParcel(parcel, i10);
        }
        parcel.writeString(this.verification.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C6521e
    public EntitlementInfos(Map<String, EntitlementInfo> map) {
        this(map, VerificationResult.NOT_REQUESTED);
        C6496s.h(map, "all");
    }
}
