package m8;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

/* renamed from: m8.g  reason: case insensitive filesystem */
public class C3805g extends C3404c {
    public C3805g(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        boolean z10 = true;
        str.hashCode();
        boolean z11 = false;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3551:
                if (str.equals("on")) {
                    c10 = 3;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c10 = 4;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3807h) this.f41564a).setThumbColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 1:
                C3807h hVar = (C3807h) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                hVar.setEnabled(view, z10);
                return;
            case 2:
                ((C3807h) this.f41564a).setTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 3:
                C3807h hVar2 = (C3807h) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                hVar2.setOn(view, z11);
                return;
            case 4:
                C3807h hVar3 = (C3807h) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                hVar3.setValue(view, z11);
                return;
            case 5:
                C3807h hVar4 = (C3807h) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                hVar4.setDisabled(view, z11);
                return;
            case 6:
                ((C3807h) this.f41564a).setTrackColorForFalse(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 7:
                ((C3807h) this.f41564a).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 8:
                ((C3807h) this.f41564a).setTrackColorForTrue(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((C3807h) this.f41564a).setNativeValue(view, readableArray.getBoolean(0));
        }
    }
}
