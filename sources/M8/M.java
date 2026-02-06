package m8;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

public class M extends C3404c {
    public M(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    public void a(View view, String str, Object obj) {
        boolean z10 = true;
        str.hashCode();
        String str2 = null;
        boolean z11 = false;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1619312835:
                if (str.equals("hideNavigationBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1465798051:
                if (str.equals("headerIconColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c10 = 3;
                    break;
                }
                break;
            case -336520619:
                if (str.equals("barTintColor")) {
                    c10 = 4;
                    break;
                }
                break;
            case -256845969:
                if (str.equals("hintTextColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case -186579527:
                if (str.equals("hideWhenScrolling")) {
                    c10 = 6;
                    break;
                }
                break;
            case -146361959:
                if (str.equals("cancelButtonText")) {
                    c10 = 7;
                    break;
                }
                break;
            case -109380883:
                if (str.equals("disableBackButtonOverride")) {
                    c10 = 8;
                    break;
                }
                break;
            case -39414888:
                if (str.equals("shouldShowHintSearchIcon")) {
                    c10 = 9;
                    break;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1584806451:
                if (str.equals("obscureBackground")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    c10 = 13;
                    break;
                }
                break;
            case 1792938725:
                if (str.equals("placement")) {
                    c10 = 14;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                N n10 = (N) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                n10.setHideNavigationBar(view, z11);
                return;
            case 1:
                ((N) this.f41564a).setHeaderIconColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 2:
                ((N) this.f41564a).setAutoCapitalize(view, (String) obj);
                return;
            case 3:
                ((N) this.f41564a).setTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 4:
                ((N) this.f41564a).setBarTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 5:
                ((N) this.f41564a).setHintTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 6:
                N n11 = (N) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                n11.setHideWhenScrolling(view, z11);
                return;
            case 7:
                N n12 = (N) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                n12.setCancelButtonText(view, str2);
                return;
            case 8:
                N n13 = (N) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                n13.setDisableBackButtonOverride(view, z11);
                return;
            case 9:
                N n14 = (N) this.f41564a;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                n14.setShouldShowHintSearchIcon(view, z10);
                return;
            case 10:
                N n15 = (N) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                n15.setPlaceholder(view, str2);
                return;
            case 11:
                ((N) this.f41564a).setTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                return;
            case 12:
                N n16 = (N) this.f41564a;
                if (obj != null) {
                    z11 = ((Boolean) obj).booleanValue();
                }
                n16.setObscureBackground(view, z11);
                return;
            case 13:
                N n17 = (N) this.f41564a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                n17.setInputType(view, str2);
                return;
            case StdKeyDeserializer.TYPE_URL:
                ((N) this.f41564a).setPlacement(view, (String) obj);
                return;
            default:
                super.a(view, str, obj);
                return;
        }
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1833485118:
                if (str.equals("cancelSearch")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1270906598:
                if (str.equals("clearText")) {
                    c10 = 1;
                    break;
                }
                break;
            case -664358976:
                if (str.equals("toggleCancelButton")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c10 = 3;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1984984239:
                if (str.equals("setText")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((N) this.f41564a).cancelSearch(view);
                return;
            case 1:
                ((N) this.f41564a).clearText(view);
                return;
            case 2:
                ((N) this.f41564a).toggleCancelButton(view, readableArray.getBoolean(0));
                return;
            case 3:
                ((N) this.f41564a).blur(view);
                return;
            case 4:
                ((N) this.f41564a).focus(view);
                return;
            case 5:
                ((N) this.f41564a).setText(view, readableArray.getString(0));
                return;
            default:
                return;
        }
    }
}
