package Vg;

import Ug.I0;
import Zg.u;
import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a implements u {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public I0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), (String) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return 1073741823;
    }
}
