package v4;

import H4.k;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: v4.a  reason: case insensitive filesystem */
public class C4103a extends Paint {
    public C4103a() {
    }

    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((k.c(i10, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(k.c(i10, 0, 255));
    }

    public C4103a(int i10) {
        super(i10);
    }

    public C4103a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C4103a(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public void setTextLocales(LocaleList localeList) {
    }
}
