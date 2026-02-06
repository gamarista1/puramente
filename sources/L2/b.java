package L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b.f;
import f2.y;
import f2.z;
import i2.L;
import nb.C5108c;

public class b implements z.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f4149a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4150b;

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

    public b(String str, String str2) {
        this.f4149a = C5108c.f(str);
        this.f4150b = str2;
    }

    public void P(y.b bVar) {
        String str = this.f4149a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.O(this.f4150b);
                return;
            case 1:
                bVar.n0(this.f4150b);
                return;
            case 2:
                bVar.V(this.f4150b);
                return;
            case 3:
                bVar.N(this.f4150b);
                return;
            case 4:
                bVar.P(this.f4150b);
                return;
            default:
                return;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f4149a.equals(bVar.f4149a) || !this.f4150b.equals(bVar.f4150b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f4149a.hashCode()) * 31) + this.f4150b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f4149a + f.f37530b + this.f4150b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4149a);
        parcel.writeString(this.f4150b);
    }

    protected b(Parcel parcel) {
        this.f4149a = (String) L.h(parcel.readString());
        this.f4150b = (String) L.h(parcel.readString());
    }
}
