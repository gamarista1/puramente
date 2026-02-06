package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;
import java.util.Arrays;

public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f4423b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4424c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4425d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f4426e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4427f;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4423b = i10;
        this.f4424c = i11;
        this.f4425d = i12;
        this.f4426e = iArr;
        this.f4427f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f4423b == lVar.f4423b && this.f4424c == lVar.f4424c && this.f4425d == lVar.f4425d && Arrays.equals(this.f4426e, lVar.f4426e) && Arrays.equals(this.f4427f, lVar.f4427f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f4423b) * 31) + this.f4424c) * 31) + this.f4425d) * 31) + Arrays.hashCode(this.f4426e)) * 31) + Arrays.hashCode(this.f4427f);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4423b);
        parcel.writeInt(this.f4424c);
        parcel.writeInt(this.f4425d);
        parcel.writeIntArray(this.f4426e);
        parcel.writeIntArray(this.f4427f);
    }

    l(Parcel parcel) {
        super("MLLT");
        this.f4423b = parcel.readInt();
        this.f4424c = parcel.readInt();
        this.f4425d = parcel.readInt();
        this.f4426e = (int[]) L.h(parcel.createIntArray());
        this.f4427f = (int[]) L.h(parcel.createIntArray());
    }
}
