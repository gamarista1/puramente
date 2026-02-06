package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f10701a;

    /* renamed from: b  reason: collision with root package name */
    public int f10702b;

    /* renamed from: c  reason: collision with root package name */
    public int f10703c;

    /* renamed from: d  reason: collision with root package name */
    public int f10704d;

    /* renamed from: e  reason: collision with root package name */
    public int f10705e;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f10701a = parcel.readInt();
        this.f10703c = parcel.readInt();
        this.f10704d = parcel.readInt();
        this.f10705e = parcel.readInt();
        this.f10702b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10701a);
        parcel.writeInt(this.f10703c);
        parcel.writeInt(this.f10704d);
        parcel.writeInt(this.f10705e);
        parcel.writeInt(this.f10702b);
    }
}
