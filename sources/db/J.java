package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.U;
import com.google.firebase.auth.Y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import za.C5298a;
import za.c;

public final class J extends C5298a {
    public static final Parcelable.Creator<J> CREATOR = new M();

    /* renamed from: a  reason: collision with root package name */
    private final List f50456a;

    /* renamed from: b  reason: collision with root package name */
    private final List f50457b;

    J(List list, List list2) {
        this.f50456a = list == null ? new ArrayList() : list;
        this.f50457b = list2 == null ? new ArrayList() : list2;
    }

    public static J o0(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.J j10 = (com.google.firebase.auth.J) it.next();
            if (j10 instanceof U) {
                arrayList.add((U) j10);
            } else if (j10 instanceof Y) {
                arrayList2.add((Y) j10);
            }
        }
        return new J(arrayList, arrayList2);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f50456a, false);
        c.H(parcel, 2, this.f50457b, false);
        c.b(parcel, a10);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (U add : this.f50456a) {
            arrayList.add(add);
        }
        for (Y add2 : this.f50457b) {
            arrayList.add(add2);
        }
        return arrayList;
    }
}
