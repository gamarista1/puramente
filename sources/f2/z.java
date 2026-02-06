package f2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.h;
import f2.y;
import i2.L;
import java.util.Arrays;
import java.util.List;

public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f20391a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20392b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public z createFromParcel(Parcel parcel) {
            return new z(parcel);
        }

        /* renamed from: b */
        public z[] newArray(int i10) {
            return new z[i10];
        }
    }

    public z(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public z a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new z(this.f20392b, (b[]) L.O0(this.f20391a, bVarArr));
    }

    public z b(z zVar) {
        if (zVar == null) {
            return this;
        }
        return a(zVar.f20391a);
    }

    public z c(long j10) {
        if (this.f20392b == j10) {
            return this;
        }
        return new z(j10, this.f20391a);
    }

    public b d(int i10) {
        return this.f20391a[i10];
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f20391a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (!Arrays.equals(this.f20391a, zVar.f20391a) || this.f20392b != zVar.f20392b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f20391a) * 31) + h.b(this.f20392b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f20391a));
        if (this.f20392b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f20392b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20391a.length);
        for (b writeParcelable : this.f20391a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f20392b);
    }

    public z(long j10, b... bVarArr) {
        this.f20392b = j10;
        this.f20391a = bVarArr;
    }

    public z(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public z(long j10, List list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    z(Parcel parcel) {
        this.f20391a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f20391a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f20392b = parcel.readLong();
                return;
            }
        }
    }

    public interface b extends Parcelable {
        s m() {
            return null;
        }

        byte[] t() {
            return null;
        }

        void P(y.b bVar) {
        }
    }
}
