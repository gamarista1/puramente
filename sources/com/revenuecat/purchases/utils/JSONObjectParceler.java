package com.revenuecat.purchases.utils;

import android.os.Parcel;
import fh.C5934a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/utils/JSONObjectParceler;", "Lfh/a;", "Lorg/json/JSONObject;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lorg/json/JSONObject;", "", "flags", "Llf/M;", "write", "(Lorg/json/JSONObject;Landroid/os/Parcel;I)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JSONObjectParceler implements C5934a {
    public static final JSONObjectParceler INSTANCE = new JSONObjectParceler();

    private JSONObjectParceler() {
    }

    public JSONObject create(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        return new JSONObject(parcel.readString());
    }

    public JSONObject[] newArray(int i10) {
        return (JSONObject[]) C5934a.C0996a.a(this, i10);
    }

    public void write(JSONObject jSONObject, Parcel parcel, int i10) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(parcel, "parcel");
        parcel.writeString(jSONObject.toString());
    }
}
