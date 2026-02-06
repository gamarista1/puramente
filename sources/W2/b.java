package W2;

import android.os.Bundle;
import android.os.Parcel;
import i2.C2076a;
import i2.C2077b;
import java.util.ArrayList;

public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i10, i11);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new e(C2077b.a(new a(), (ArrayList) C2076a.e(readBundle.getParcelableArrayList("c"))), j10, readBundle.getLong("d"));
    }
}
