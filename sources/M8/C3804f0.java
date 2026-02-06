package m8;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: m8.f0  reason: case insensitive filesystem */
public class C3804f0 extends C3404c {
    public C3804f0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        String str2;
        str.hashCode();
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
            case 104993457:
                if (str.equals("nodes")) {
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
        }
        switch (c10) {
            case 0:
                ((C3806g0) this.f41564a).setHeight(view, new DynamicFromObject(obj));
                return;
            case 1:
                C3806g0 g0Var = (C3806g0) this.f41564a;
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                g0Var.setResult(view, str2);
                return;
            case 2:
                ((C3806g0) this.f41564a).setX(view, new DynamicFromObject(obj));
                return;
            case 3:
                ((C3806g0) this.f41564a).setY(view, new DynamicFromObject(obj));
                return;
            case 4:
                ((C3806g0) this.f41564a).setNodes(view, (ReadableArray) obj);
                return;
            case 5:
                ((C3806g0) this.f41564a).setWidth(view, new DynamicFromObject(obj));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }
}
