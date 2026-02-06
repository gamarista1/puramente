package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f15968a = aVar.p(iconCompat.f15968a, 1);
        iconCompat.f15970c = aVar.j(iconCompat.f15970c, 2);
        iconCompat.f15971d = aVar.r(iconCompat.f15971d, 3);
        iconCompat.f15972e = aVar.p(iconCompat.f15972e, 4);
        iconCompat.f15973f = aVar.p(iconCompat.f15973f, 5);
        iconCompat.f15974g = (ColorStateList) aVar.r(iconCompat.f15974g, 6);
        iconCompat.f15976i = aVar.t(iconCompat.f15976i, 7);
        iconCompat.f15977j = aVar.t(iconCompat.f15977j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i10 = iconCompat.f15968a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f15970c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f15971d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f15972e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f15973f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f15974g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f15976i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f15977j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
