package m8;

import android.view.View;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

/* renamed from: m8.e  reason: case insensitive filesystem */
public class C3801e extends C3404c {
    public C3801e(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        float f10;
        boolean z10 = true;
        boolean z11 = false;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1354842768:
                if (str.equals(LinearGradientManager.PROP_COLORS)) {
                    c10 = 1;
                    break;
                }
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c10 = 3;
                    break;
                }
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                C3803f fVar = (C3803f) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                fVar.setEnabled(view, z10);
                return;
            case 1:
                ((C3803f) this.f41564a).setColors(view, (ReadableArray) obj);
                return;
            case 2:
                ((C3803f) this.f41564a).setProgressBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 3:
                C3803f fVar2 = (C3803f) this.f41564a;
                if (obj == null) {
                    f10 = 0.0f;
                } else {
                    f10 = ((Double) obj).floatValue();
                }
                fVar2.setProgressViewOffset(view, f10);
                return;
            case 4:
                C3803f fVar3 = (C3803f) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                fVar3.setRefreshing(view, z11);
                return;
            case 5:
                ((C3803f) this.f41564a).setSize(view, (String) obj);
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((C3803f) this.f41564a).setNativeRefreshing(view, readableArray.getBoolean(0));
        }
    }
}
