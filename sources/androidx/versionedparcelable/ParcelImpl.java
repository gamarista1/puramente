package androidx.versionedparcelable;

import G3.b;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f18481a;

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(b bVar) {
        this.f18481a = bVar;
    }

    public b a() {
        return this.f18481a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).L(this.f18481a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f18481a = new b(parcel).u();
    }
}
