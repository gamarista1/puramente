package Sa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import java.util.List;
import za.C5298a;
import za.c;

public final class h extends C5298a implements k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final List f52364a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52365b;

    public h(List list, String str) {
        this.f52364a = list;
        this.f52365b = str;
    }

    public final Status getStatus() {
        if (this.f52365b != null) {
            return Status.f53907f;
        }
        return Status.f53911j;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f52364a;
        int a10 = c.a(parcel);
        c.F(parcel, 1, list, false);
        c.D(parcel, 2, this.f52365b, false);
        c.b(parcel, a10);
    }
}
