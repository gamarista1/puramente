package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;
import za.C5298a;
import za.c;

public final class f extends C5298a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    final int f54282a;

    /* renamed from: b  reason: collision with root package name */
    final String f54283b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f54284c;

    f(int i10, String str, ArrayList arrayList) {
        this.f54282a = i10;
        this.f54283b = str;
        this.f54284c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f54282a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.D(parcel, 2, this.f54283b, false);
        c.H(parcel, 3, this.f54284c, false);
        c.b(parcel, a10);
    }

    f(String str, Map map) {
        ArrayList arrayList;
        this.f54282a = 1;
        this.f54283b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g(str2, (a.C0822a) map.get(str2)));
            }
        }
        this.f54284c = arrayList;
    }
}
