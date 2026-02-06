package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.J;
import java.util.ArrayList;

final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f16770a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList f16771b;

    /* renamed from: c  reason: collision with root package name */
    C1754b[] f16772c;

    /* renamed from: d  reason: collision with root package name */
    int f16773d;

    /* renamed from: e  reason: collision with root package name */
    String f16774e = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList f16775f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    ArrayList f16776g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    ArrayList f16777h;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public L createFromParcel(Parcel parcel) {
            return new L(parcel);
        }

        /* renamed from: b */
        public L[] newArray(int i10) {
            return new L[i10];
        }
    }

    public L() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f16770a);
        parcel.writeStringList(this.f16771b);
        parcel.writeTypedArray(this.f16772c, i10);
        parcel.writeInt(this.f16773d);
        parcel.writeString(this.f16774e);
        parcel.writeStringList(this.f16775f);
        parcel.writeTypedList(this.f16776g);
        parcel.writeTypedList(this.f16777h);
    }

    public L(Parcel parcel) {
        this.f16770a = parcel.createStringArrayList();
        this.f16771b = parcel.createStringArrayList();
        this.f16772c = (C1754b[]) parcel.createTypedArray(C1754b.CREATOR);
        this.f16773d = parcel.readInt();
        this.f16774e = parcel.readString();
        this.f16775f = parcel.createStringArrayList();
        this.f16776g = parcel.createTypedArrayList(C1755c.CREATOR);
        this.f16777h = parcel.createTypedArrayList(J.l.CREATOR);
    }
}
