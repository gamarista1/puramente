package c5;

import T4.i;
import T4.k;
import V4.v;
import android.os.Build;
import android.os.ParcelFileDescriptor;

public final class B implements k {

    /* renamed from: a  reason: collision with root package name */
    private final s f36421a;

    public B(s sVar) {
        this.f36421a = sVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public v b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i iVar) {
        return this.f36421a.d(parcelFileDescriptor, i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, i iVar) {
        if (!e(parcelFileDescriptor) || !this.f36421a.o(parcelFileDescriptor)) {
            return false;
        }
        return true;
    }
}
