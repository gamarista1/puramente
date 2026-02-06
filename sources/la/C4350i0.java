package La;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.i0  reason: case insensitive filesystem */
public enum C4350i0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<C4350i0> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f51607a;

    static {
        CREATOR = new C4346g0();
    }

    private C4350i0(String str) {
        this.f51607a = str;
    }

    public static C4350i0 a(String str) {
        for (C4350i0 i0Var : values()) {
            if (str.equals(i0Var.f51607a)) {
                return i0Var;
            }
        }
        throw new C4348h0(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f51607a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51607a);
    }
}
