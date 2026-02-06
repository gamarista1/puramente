package G9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b.f;
import ja.M;
import k9.D0;

public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f31636a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31637b;

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
        this.f31636a = str;
        this.f31637b = str2;
    }

    public void E(D0.b bVar) {
        String str = this.f31636a;
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
                bVar.L(this.f31637b);
                return;
            case 1:
                bVar.i0(this.f31637b);
                return;
            case 2:
                bVar.S(this.f31637b);
                return;
            case 3:
                bVar.K(this.f31637b);
                return;
            case 4:
                bVar.M(this.f31637b);
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
        if (!this.f31636a.equals(bVar.f31636a) || !this.f31637b.equals(bVar.f31637b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f31636a.hashCode()) * 31) + this.f31637b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f31636a + f.f37530b + this.f31637b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31636a);
        parcel.writeString(this.f31637b);
    }

    protected b(Parcel parcel) {
        this.f31636a = (String) M.j(parcel.readString());
        this.f31637b = (String) M.j(parcel.readString());
    }
}
