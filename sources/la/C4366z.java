package La;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.z  reason: case insensitive filesystem */
public enum C4366z implements Parcelable {
    PUBLIC_KEY("public-key");
    
    public static final Parcelable.Creator<C4366z> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f51687a;

    /* renamed from: La.z$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new C4334a0();
    }

    private C4366z(String str) {
        this.f51687a = "public-key";
    }

    public static C4366z a(String str) {
        for (C4366z zVar : values()) {
            if (str.equals(zVar.f51687a)) {
                return zVar;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f51687a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51687a);
    }
}
