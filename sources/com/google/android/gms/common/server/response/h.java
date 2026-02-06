package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import za.C5298a;
import za.c;

public final class h extends C5298a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    final int f54288a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f54289b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54290c;

    h(int i10, ArrayList arrayList, String str) {
        this.f54288a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f54283b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C4536s.l(fVar.f54284c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) fVar.f54284c.get(i12);
                hashMap2.put(gVar.f54286b, gVar.f54287c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f54289b = hashMap;
        this.f54290c = (String) C4536s.l(str);
        q0();
    }

    public final String o0() {
        return this.f54290c;
    }

    public final Map p0(String str) {
        return (Map) this.f54289b.get(str);
    }

    public final void q0() {
        for (String str : this.f54289b.keySet()) {
            Map map = (Map) this.f54289b.get(str);
            for (String str2 : map.keySet()) {
                ((a.C0822a) map.get(str2)).B0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f54289b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f54289b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f54288a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f54289b.keySet()) {
            arrayList.add(new f(str, (Map) this.f54289b.get(str)));
        }
        c.H(parcel, 2, arrayList, false);
        c.D(parcel, 3, this.f54290c, false);
        c.b(parcel, a10);
    }
}
