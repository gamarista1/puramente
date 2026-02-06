package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;

public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31823b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31824c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f31823b = str2;
        this.f31824c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f31810a.equals(nVar.f31810a) || !M.c(this.f31823b, nVar.f31823b) || !M.c(this.f31824c, nVar.f31824c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = (527 + this.f31810a.hashCode()) * 31;
        String str = this.f31823b;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f31824c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return this.f31810a + ": url=" + this.f31824c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31810a);
        parcel.writeString(this.f31823b);
        parcel.writeString(this.f31824c);
    }

    n(Parcel parcel) {
        super((String) M.j(parcel.readString()));
        this.f31823b = parcel.readString();
        this.f31824c = (String) M.j(parcel.readString());
    }
}
