package La;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.D  reason: case insensitive filesystem */
public enum C4323D implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<C4323D> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f51546a;

    /* renamed from: La.D$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new C4338c0();
    }

    private C4323D(String str) {
        this.f51546a = str;
    }

    public static C4323D a(String str) {
        for (C4323D d10 : values()) {
            if (str.equals(d10.f51546a)) {
                return d10;
            }
        }
        throw new a(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f51546a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51546a);
    }
}
