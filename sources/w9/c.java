package W9;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.C4770v;
import ja.C3645a;
import ja.C3647c;
import java.util.ArrayList;

public final class c {
    public C4770v a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C3647c.b(b.f34927s, (ArrayList) C3645a.e(readBundle.getParcelableArrayList("c")));
    }
}
