package m8;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

public class J extends C3404c {
    public J(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        str.hashCode();
        if (!str.equals("type")) {
            super.a(view, str, obj);
        } else {
            ((K) this.f41564a).setType(view, (String) obj);
        }
    }
}
