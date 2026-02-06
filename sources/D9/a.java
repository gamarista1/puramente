package D9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;
import java.util.List;
import k9.C3717q0;
import k9.D0;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0507a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f30613a;

    /* renamed from: D9.a$a  reason: collision with other inner class name */
    class C0507a implements Parcelable.Creator {
        C0507a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(b... bVarArr) {
        this.f30613a = bVarArr;
    }

    public a a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new a((b[]) M.G0(this.f30613a, bVarArr));
    }

    public a b(a aVar) {
        if (aVar == null) {
            return this;
        }
        return a(aVar.f30613a);
    }

    public b c(int i10) {
        return this.f30613a[i10];
    }

    public int d() {
        return this.f30613a.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f30613a, ((a) obj).f30613a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f30613a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f30613a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f30613a.length);
        for (b writeParcelable : this.f30613a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public a(List list) {
        this.f30613a = (b[]) list.toArray(new b[0]);
    }

    a(Parcel parcel) {
        this.f30613a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f30613a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }

    public interface b extends Parcelable {
        C3717q0 m() {
            return null;
        }

        byte[] t() {
            return null;
        }

        void E(D0.b bVar) {
        }
    }
}
