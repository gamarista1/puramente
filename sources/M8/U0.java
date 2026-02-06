package m8;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

public class U0 extends C3404c {
    public U0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        String str2;
        str.hashCode();
        if (!str.equals("name")) {
            super.a(view, str, obj);
            return;
        }
        V0 v02 = (V0) this.f41564a;
        if (obj == null) {
            str2 = "";
        } else {
            str2 = (String) obj;
        }
        v02.setName(view, str2);
    }
}
