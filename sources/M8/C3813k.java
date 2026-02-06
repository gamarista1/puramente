package m8;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

/* renamed from: m8.k  reason: case insensitive filesystem */
public class C3813k extends C3404c {
    public C3813k(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        String str2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -896505829:
                if (str.equals("source")) {
                    c10 = 0;
                    break;
                }
                break;
            case 969258428:
                if (str.equals("defaultSource")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2049757303:
                if (str.equals("resizeMode")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3815l) this.f41564a).setSource(view, (ReadableMap) obj);
                return;
            case 1:
                C3815l lVar = (C3815l) this.f41564a;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                lVar.setDefaultSource(view, str2);
                return;
            case 2:
                ((C3815l) this.f41564a).setTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 3:
                ((C3815l) this.f41564a).setResizeMode(view, (String) obj);
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
