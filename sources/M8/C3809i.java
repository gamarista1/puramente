package m8;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

/* renamed from: m8.i  reason: case insensitive filesystem */
public class C3809i extends C3404c {
    public C3809i(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        super.a(view, str, obj);
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1942063165:
                if (str.equals("clearElementsHighlights")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1326903961:
                if (str.equals("highlightTraceUpdates")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1385348555:
                if (str.equals("highlightElements")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3811j) this.f41564a).clearElementsHighlights(view);
                return;
            case 1:
                ((C3811j) this.f41564a).highlightTraceUpdates(view, readableArray.getArray(0));
                return;
            case 2:
                ((C3811j) this.f41564a).highlightElements(view, readableArray.getArray(0));
                return;
            default:
                return;
        }
    }
}
