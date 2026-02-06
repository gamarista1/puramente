package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: m8.j0  reason: case insensitive filesystem */
public class C3812j0 extends C3404c {
    public C3812j0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        String str2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1535814968:
                if (str.equals("primitiveUnits")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals(Snapshot.HEIGHT)) {
                    c10 = 1;
                    break;
                }
                break;
            case -899348777:
                if (str.equals("filterUnits")) {
                    c10 = 2;
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c10 = 3;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c10 = 5;
                    break;
                }
                break;
            case 113126854:
                if (str.equals(Snapshot.WIDTH)) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3814k0) this.f41564a).setPrimitiveUnits(view, (String) obj);
                return;
            case 1:
                ((C3814k0) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 2:
                ((C3814k0) this.f41564a).setFilterUnits(view, (String) obj);
                return;
            case 3:
                ((C3814k0) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 4:
                ((C3814k0) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 5:
                C3814k0 k0Var = (C3814k0) this.f41564a;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                k0Var.setName(view, str2);
                return;
            case 6:
                ((C3814k0) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
