package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: m8.b0  reason: case insensitive filesystem */
public class C3796b0 extends C3404c {
    public C3796b0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        float f10;
        String str2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1960777211:
                if (str.equals("floodColor")) {
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
            case -1033006547:
                if (str.equals("floodOpacity")) {
                    c10 = 2;
                    break;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    c10 = 3;
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c10 = 4;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
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
                ((C3798c0) this.f41564a).setFloodColor(view, new DynamicFromObject(obj));
                return;
            case 1:
                ((C3798c0) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 2:
                C3798c0 c0Var = (C3798c0) this.f41564a;
                if (obj == null) {
                    f10 = 1.0f;
                } else {
                    f10 = ((Double) obj).floatValue();
                }
                c0Var.setFloodOpacity(view, f10);
                return;
            case 3:
                C3798c0 c0Var2 = (C3798c0) this.f41564a;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                c0Var2.setResult(view, str2);
                return;
            case 4:
                ((C3798c0) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 5:
                ((C3798c0) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 6:
                ((C3798c0) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
