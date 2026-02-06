package M9;

import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Comparable, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f32703a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32704b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32705c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32706d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12) {
        this.f32703a = i10;
        this.f32704b = i11;
        this.f32705c = i12;
        this.f32706d = i12;
    }

    /* renamed from: a */
    public int compareTo(c cVar) {
        int i10 = this.f32703a - cVar.f32703a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f32704b - cVar.f32704b;
        if (i11 == 0) {
            return this.f32705c - cVar.f32705c;
        }
        return i11;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f32703a == cVar.f32703a && this.f32704b == cVar.f32704b && this.f32705c == cVar.f32705c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f32703a * 31) + this.f32704b) * 31) + this.f32705c;
    }

    public String toString() {
        return this.f32703a + "." + this.f32704b + "." + this.f32705c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32703a);
        parcel.writeInt(this.f32704b);
        parcel.writeInt(this.f32705c);
    }

    c(Parcel parcel) {
        this.f32703a = parcel.readInt();
        this.f32704b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f32705c = readInt;
        this.f32706d = readInt;
    }
}
