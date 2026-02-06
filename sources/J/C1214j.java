package J;

import B0.d;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.common.api.a;

/* renamed from: J.j  reason: case insensitive filesystem */
public final class C1214j {

    /* renamed from: a  reason: collision with root package name */
    private Integer f3372a;

    public final Integer a(KeyEvent keyEvent) {
        int c10 = d.c(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & c10) != 0) {
            this.f3372a = Integer.valueOf(c10 & a.e.API_PRIORITY_OTHER);
            return null;
        }
        Integer num2 = this.f3372a;
        if (num2 == null) {
            return Integer.valueOf(c10);
        }
        this.f3372a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), c10));
        if (valueOf.intValue() != 0) {
            num = valueOf;
        }
        if (num == null) {
            return Integer.valueOf(c10);
        }
        return num;
    }
}
