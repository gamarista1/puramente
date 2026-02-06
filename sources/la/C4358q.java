package La;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: La.q  reason: case insensitive filesystem */
public enum C4358q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<C4358q> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f51643a;

    /* renamed from: La.q$a */
    public static class a extends Exception {
        public a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", new Object[]{Integer.valueOf(i10)}));
        }
    }

    static {
        CREATOR = new G0();
    }

    private C4358q(int i10) {
        this.f51643a = i10;
    }

    public static C4358q b(int i10) {
        for (C4358q qVar : values()) {
            if (i10 == qVar.f51643a) {
                return qVar;
            }
        }
        throw new a(i10);
    }

    public int a() {
        return this.f51643a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f51643a);
    }
}
