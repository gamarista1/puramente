package ya;

import android.content.Intent;

public abstract class k extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f62289a;

    public k(String str, Intent intent) {
        super(str);
        this.f62289a = intent;
    }

    public Intent a() {
        return new Intent(this.f62289a);
    }
}
