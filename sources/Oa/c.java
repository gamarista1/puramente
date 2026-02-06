package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import java.util.List;
import za.C5298a;

public class c extends C5298a {
    public static final Parcelable.Creator<c> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    final int f61157a;

    /* renamed from: b  reason: collision with root package name */
    final List f61158b;

    c(int i10, List list) {
        this.f61157a = i10;
        this.f61158b = (List) C4536s.l(list);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = za.c.a(parcel);
        za.c.t(parcel, 1, this.f61157a);
        za.c.H(parcel, 2, this.f61158b, false);
        za.c.b(parcel, a10);
    }
}
