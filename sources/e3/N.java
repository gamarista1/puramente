package E3;

import android.view.View;
import android.view.WindowId;

class N implements O {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f1789a;

    N(View view) {
        this.f1789a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N) || !((N) obj).f1789a.equals(this.f1789a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f1789a.hashCode();
    }
}
