package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;
import java.util.Arrays;

public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4428b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4429c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f4428b = str;
        this.f4429c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!L.c(this.f4428b, mVar.f4428b) || !Arrays.equals(this.f4429c, mVar.f4429c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        String str = this.f4428b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((527 + i10) * 31) + Arrays.hashCode(this.f4429c);
    }

    public String toString() {
        return this.f4418a + ": owner=" + this.f4428b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4428b);
        parcel.writeByteArray(this.f4429c);
    }

    m(Parcel parcel) {
        super("PRIV");
        this.f4428b = (String) L.h(parcel.readString());
        this.f4429c = (byte[]) L.h(parcel.createByteArray());
    }
}
