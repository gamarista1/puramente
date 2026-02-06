package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: m8.h0  reason: case insensitive filesystem */
public class C3808h0 extends C3404c {
    public C3808h0(BaseViewManager baseViewManager) {
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
            case 3220:
                if (str.equals("dx")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    c10 = 5;
                    break;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
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
                ((C3810i0) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 1:
                C3810i0 i0Var = (C3810i0) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                i0Var.setResult(view, str2);
                return;
            case 2:
                ((C3810i0) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 3:
                ((C3810i0) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 4:
                ((C3810i0) this.f41564a).setDx(view, new DynamicFromObject(obj));
                return;
            case 5:
                ((C3810i0) this.f41564a).setDy(view, new DynamicFromObject(obj));
                return;
            case 6:
                C3810i0 i0Var2 = (C3810i0) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                i0Var2.setIn1(view, str2);
                return;
            case 7:
                ((C3810i0) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
