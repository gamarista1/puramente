package m8;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;

/* renamed from: m8.a  reason: case insensitive filesystem */
public class C3793a extends C3404c {
    public C3793a(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        Float f10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals("statusBarBackgroundColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1233873500:
                if (str.equals("drawerBackgroundColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c10 = 2;
                    break;
                }
                break;
            case 268251989:
                if (str.equals("drawerWidth")) {
                    c10 = 3;
                    break;
                }
                break;
            case 695891258:
                if (str.equals("drawerPosition")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1857208703:
                if (str.equals("drawerLockMode")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3795b) this.f41564a).setStatusBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 1:
                ((C3795b) this.f41564a).setDrawerBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 2:
                ((C3795b) this.f41564a).setKeyboardDismissMode(view, (String) obj);
                return;
            case 3:
                C3795b bVar = (C3795b) this.f41564a;
                if (obj == null) {
                    f10 = null;
                } else {
                    f10 = Float.valueOf(((Double) obj).floatValue());
                }
                bVar.setDrawerWidth(view, f10);
                return;
            case 4:
                ((C3795b) this.f41564a).setDrawerPosition(view, (String) obj);
                return;
            case 5:
                ((C3795b) this.f41564a).setDrawerLockMode(view, (String) obj);
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals(ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER)) {
            ((C3795b) this.f41564a).closeDrawer(view);
        } else if (str.equals(ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER)) {
            ((C3795b) this.f41564a).openDrawer(view);
        }
    }
}
