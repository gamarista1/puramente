package Sa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import za.C5298a;
import za.c;

public final class b extends C5298a implements k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    final int f52361a;

    /* renamed from: b  reason: collision with root package name */
    private int f52362b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f52363c;

    b(int i10, int i11, Intent intent) {
        this.f52361a = i10;
        this.f52362b = i11;
        this.f52363c = intent;
    }

    public final Status getStatus() {
        if (this.f52362b == 0) {
            return Status.f53907f;
        }
        return Status.f53911j;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f52361a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.t(parcel, 2, this.f52362b);
        c.B(parcel, 3, this.f52363c, i10, false);
        c.b(parcel, a10);
    }
}
