package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

public class Z extends C3404c {
    public Z(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        str.hashCode();
        String str2 = null;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals(Snapshot.HEIGHT)) {
                    c10 = 0;
                    break;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    c10 = 1;
                    break;
                }
                break;
            case -823812830:
                if (str.equals("values")) {
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
            case 104364:
                if (str.equals("in1")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c10 = 6;
                    break;
                }
                break;
            case 113126854:
                if (str.equals(Snapshot.WIDTH)) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3794a0) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 1:
                C3794a0 a0Var = (C3794a0) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                a0Var.setResult(view, str2);
                return;
            case 2:
                ((C3794a0) this.f41564a).setValues(view, (ReadableArray) obj);
                return;
            case 3:
                ((C3794a0) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 4:
                ((C3794a0) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 5:
                C3794a0 a0Var2 = (C3794a0) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                a0Var2.setIn1(view, str2);
                return;
            case 6:
                ((C3794a0) this.f41564a).setType(view, (String) obj);
                return;
            case 7:
                ((C3794a0) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
