package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;

public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4433b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4434c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* renamed from: b */
        public o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f4433b = str2;
        this.f4434c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f4418a.equals(oVar.f4418a) || !L.c(this.f4433b, oVar.f4433b) || !L.c(this.f4434c, oVar.f4434c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = (527 + this.f4418a.hashCode()) * 31;
        String str = this.f4433b;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f4434c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return this.f4418a + ": url=" + this.f4434c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4418a);
        parcel.writeString(this.f4433b);
        parcel.writeString(this.f4434c);
    }

    o(Parcel parcel) {
        super((String) L.h(parcel.readString()));
        this.f4433b = parcel.readString();
        this.f4434c = (String) L.h(parcel.readString());
    }
}
