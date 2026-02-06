package ce;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import kotlin.jvm.internal.C6496s;

public abstract class f {
    /* access modifiers changed from: private */
    public static final String c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        String encodeToString = Base64.encodeToString(marshall, 0);
        C6496s.g(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    /* access modifiers changed from: private */
    public static final Bundle d(String str) {
        byte[] decode = Base64.decode(str, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle((ClassLoader) null);
        obtain.recycle();
        return readBundle;
    }
}
