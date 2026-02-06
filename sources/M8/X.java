package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

public class X extends C3404c {
    public X(BaseViewManager baseViewManager) {
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
            case 120:
                if (str.equals("x")) {
                    c10 = 2;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    c10 = 3;
                    break;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    c10 = 4;
                    break;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
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
                ((Y) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 1:
                Y y10 = (Y) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                y10.setResult(view, str2);
                return;
            case 2:
                ((Y) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 3:
                ((Y) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 4:
                Y y11 = (Y) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                y11.setIn1(view, str2);
                return;
            case 5:
                Y y12 = (Y) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                y12.setIn2(view, str2);
                return;
            case 6:
                ((Y) this.f41564a).setMode(view, (String) obj);
                return;
            case 7:
                ((Y) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
