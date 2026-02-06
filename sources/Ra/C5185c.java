package ra;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import za.C5298a;
import za.c;

/* renamed from: ra.c  reason: case insensitive filesystem */
public final class C5185c extends C5298a {
    public static final Parcelable.Creator<C5185c> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f61525a;

    public C5185c(PendingIntent pendingIntent) {
        this.f61525a = (PendingIntent) C4536s.l(pendingIntent);
    }

    public PendingIntent o0() {
        return this.f61525a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, o0(), i10, false);
        c.b(parcel, a10);
    }
}
