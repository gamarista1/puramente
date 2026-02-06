package za;

import Ea.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;

public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        C4536s.l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(obtain);
        obtain.recycle();
        return dVar;
    }

    public static d b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static d c(String str, Parcelable.Creator creator) {
        return a(c.a(str), creator);
    }

    public static byte[] d(d dVar) {
        Parcel obtain = Parcel.obtain();
        dVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static void e(d dVar, Intent intent, String str) {
        intent.putExtra(str, d(dVar));
    }

    public static String f(d dVar) {
        return c.d(d(dVar));
    }
}
