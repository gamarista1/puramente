package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;
import java.util.Arrays;

public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4394b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f4394b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f4418a.equals(bVar.f4418a) || !Arrays.equals(this.f4394b, bVar.f4394b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f4418a.hashCode()) * 31) + Arrays.hashCode(this.f4394b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4418a);
        parcel.writeByteArray(this.f4394b);
    }

    b(Parcel parcel) {
        super((String) L.h(parcel.readString()));
        this.f4394b = (byte[]) L.h(parcel.createByteArray());
    }
}
