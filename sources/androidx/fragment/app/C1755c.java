package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
class C1755c implements Parcelable {
    public static final Parcelable.Creator<C1755c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final List f16931a;

    /* renamed from: b  reason: collision with root package name */
    final List f16932b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1755c createFromParcel(Parcel parcel) {
            return new C1755c(parcel);
        }

        /* renamed from: b */
        public C1755c[] newArray(int i10) {
            return new C1755c[i10];
        }
    }

    C1755c(Parcel parcel) {
        this.f16931a = parcel.createStringArrayList();
        this.f16932b = parcel.createTypedArrayList(C1754b.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f16931a);
        parcel.writeTypedList(this.f16932b);
    }
}
