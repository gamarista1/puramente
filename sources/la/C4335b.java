package La;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.b  reason: case insensitive filesystem */
public enum C4335b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<C4335b> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f51570a;

    /* renamed from: La.b$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", new Object[]{str}));
        }
    }

    static {
        CREATOR = new C4328I();
    }

    private C4335b(String str) {
        this.f51570a = str;
    }

    public static C4335b a(String str) {
        for (C4335b bVar : values()) {
            if (str.equals(bVar.f51570a)) {
                return bVar;
            }
        }
        throw new a(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f51570a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f51570a);
    }
}
