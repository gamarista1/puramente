package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: m8.d0  reason: case insensitive filesystem */
public class C3800d0 extends C3404c {
    public C3800d0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        str.hashCode();
        String str2 = null;
        float f10 = 0.0f;
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
            case 113126854:
                if (str.equals(Snapshot.WIDTH)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1530721536:
                if (str.equals("edgeMode")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1837475450:
                if (str.equals("stdDeviationX")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1837475451:
                if (str.equals("stdDeviationY")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3802e0) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 1:
                C3802e0 e0Var = (C3802e0) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                e0Var.setResult(view, str2);
                return;
            case 2:
                ((C3802e0) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 3:
                ((C3802e0) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 4:
                C3802e0 e0Var2 = (C3802e0) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                e0Var2.setIn1(view, str2);
                return;
            case 5:
                ((C3802e0) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            case 6:
                ((C3802e0) this.f41564a).setEdgeMode(view, (String) obj);
                return;
            case 7:
                C3802e0 e0Var3 = (C3802e0) this.f41564a;
                if (obj != null) {
                    f10 = ((Double) obj).floatValue();
                }
                e0Var3.setStdDeviationX(view, f10);
                return;
            case 8:
                C3802e0 e0Var4 = (C3802e0) this.f41564a;
                if (obj != null) {
                    f10 = ((Double) obj).floatValue();
                }
                e0Var4.setStdDeviationY(view, f10);
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
