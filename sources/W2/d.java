package W2;

import android.os.Bundle;
import android.os.Parcel;
import i2.C2077b;
import java.util.ArrayList;
import java.util.List;

public final class d {
    public byte[] a(List list, long j10) {
        ArrayList b10 = C2077b.b(list, new c());
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", b10);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
