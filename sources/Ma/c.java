package Ma;

import android.os.Parcel;
import android.os.Parcelable;

public enum c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    public static final Parcelable.Creator<c> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f52024a;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new i();
    }

    private c(String str) {
        this.f52024a = str;
    }

    public static c a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (c cVar : values()) {
            if (str.equals(cVar.f52024a)) {
                return cVar;
            }
        }
        throw new a(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f52024a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f52024a);
    }
}
