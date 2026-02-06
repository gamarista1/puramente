package k9;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.C4770v;
import ja.C3645a;
import ja.M;

/* renamed from: k9.h  reason: case insensitive filesystem */
public abstract class C3698h extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f45561a;

    static {
        int i10;
        if (M.f44981a >= 30) {
            i10 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i10 = 65536;
        }
        f45561a = i10;
    }

    public static C4770v a(IBinder iBinder) {
        int readInt;
        C4770v.a t10 = C4770v.t();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    t10.a((Bundle) C3645a.e(obtain2.readBundle()));
                    i10++;
                }
                obtain2.recycle();
                obtain.recycle();
                i11 = readInt;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                throw th2;
            }
        }
        return t10.k();
    }
}
