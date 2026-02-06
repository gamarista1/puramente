package La;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.c  reason: case insensitive filesystem */
public enum C4337c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<C4337c> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f51575a;

    /* renamed from: La.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new k0();
    }

    private C4337c(String str) {
        this.f51575a = str;
    }

    public static C4337c a(String str) {
        for (C4337c cVar : values()) {
            if (str.equals(cVar.f51575a)) {
                return cVar;
            }
        }
        throw new a(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f51575a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51575a);
    }
}
