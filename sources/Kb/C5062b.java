package kb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: kb.b  reason: case insensitive filesystem */
public abstract class C5062b implements Parcelable {
    public static final Parcelable.Creator<C5062b> CREATOR = new f();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent a();

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
