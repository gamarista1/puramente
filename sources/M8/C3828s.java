package m8;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

/* renamed from: m8.s  reason: case insensitive filesystem */
public class C3828s extends C3404c {
    public C3828s(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            r5.hashCode()
            r0 = 0
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case -1902983847: goto L_0x0069;
                case -1808880503: goto L_0x005e;
                case -1609594047: goto L_0x0053;
                case -1329887265: goto L_0x0048;
                case -979805852: goto L_0x003d;
                case 94842723: goto L_0x0032;
                case 100526016: goto L_0x0027;
                case 1191572123: goto L_0x001c;
                case 1287124693: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0073
        L_0x000e:
            java.lang.String r2 = "backgroundColor"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0018
            goto L_0x0073
        L_0x0018:
            r1 = 8
            goto L_0x0073
        L_0x001c:
            java.lang.String r2 = "selected"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0025
            goto L_0x0073
        L_0x0025:
            r1 = 7
            goto L_0x0073
        L_0x0027:
            java.lang.String r2 = "items"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0030
            goto L_0x0073
        L_0x0030:
            r1 = 6
            goto L_0x0073
        L_0x0032:
            java.lang.String r2 = "color"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003b
            goto L_0x0073
        L_0x003b:
            r1 = 5
            goto L_0x0073
        L_0x003d:
            java.lang.String r2 = "prompt"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0046
            goto L_0x0073
        L_0x0046:
            r1 = 4
            goto L_0x0073
        L_0x0048:
            java.lang.String r2 = "numberOfLines"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0073
        L_0x0051:
            r1 = 3
            goto L_0x0073
        L_0x0053:
            java.lang.String r2 = "enabled"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x005c
            goto L_0x0073
        L_0x005c:
            r1 = 2
            goto L_0x0073
        L_0x005e:
            java.lang.String r2 = "dropdownIconRippleColor"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            r1 = 1
            goto L_0x0073
        L_0x0069:
            java.lang.String r2 = "dropdownIconColor"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = r0
        L_0x0073:
            switch(r1) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00e7;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00a7;
                case 6: goto L_0x009d;
                case 7: goto L_0x008b;
                case 8: goto L_0x007b;
                default: goto L_0x0076;
            }
        L_0x0076:
            super.a(r4, r5, r6)
            goto L_0x0108
        L_0x007b:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            if (r6 != 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            java.lang.Double r6 = (java.lang.Double) r6
            int r0 = r6.intValue()
        L_0x0086:
            r5.setBackgroundColor(r4, r0)
            goto L_0x0108
        L_0x008b:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            if (r6 != 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            java.lang.Double r6 = (java.lang.Double) r6
            int r0 = r6.intValue()
        L_0x0098:
            r5.setSelected(r4, r0)
            goto L_0x0108
        L_0x009d:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            com.facebook.react.bridge.ReadableArray r6 = (com.facebook.react.bridge.ReadableArray) r6
            r5.setItems(r4, r6)
            goto L_0x0108
        L_0x00a7:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setColor(r4, r6)
            goto L_0x0108
        L_0x00b7:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            if (r6 != 0) goto L_0x00bf
            r6 = 0
            goto L_0x00c1
        L_0x00bf:
            java.lang.String r6 = (java.lang.String) r6
        L_0x00c1:
            r5.setPrompt(r4, r6)
            goto L_0x0108
        L_0x00c5:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            if (r6 != 0) goto L_0x00cc
            goto L_0x00d2
        L_0x00cc:
            java.lang.Double r6 = (java.lang.Double) r6
            int r0 = r6.intValue()
        L_0x00d2:
            r5.setNumberOfLines(r4, r0)
            goto L_0x0108
        L_0x00d6:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            if (r6 != 0) goto L_0x00dd
            goto L_0x00e3
        L_0x00dd:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
        L_0x00e3:
            r5.setEnabled(r4, r0)
            goto L_0x0108
        L_0x00e7:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            if (r6 != 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            java.lang.Double r6 = (java.lang.Double) r6
            int r0 = r6.intValue()
        L_0x00f4:
            r5.setDropdownIconRippleColor(r4, r0)
            goto L_0x0108
        L_0x00f8:
            com.facebook.react.uimanager.BaseViewManager r5 = r3.f41564a
            m8.t r5 = (m8.C3830t) r5
            if (r6 != 0) goto L_0x00ff
            goto L_0x0105
        L_0x00ff:
            java.lang.Double r6 = (java.lang.Double) r6
            int r0 = r6.intValue()
        L_0x0105:
            r5.setDropdownIconColor(r4, r0)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.C3828s.a(android.view.View, java.lang.String, java.lang.Object):void");
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3027047:
                if (str.equals("blur")) {
                    c10 = 0;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c10 = 1;
                    break;
                }
                break;
            case 361157844:
                if (str.equals("setNativeSelected")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3830t) this.f41564a).blur(view);
                return;
            case 1:
                ((C3830t) this.f41564a).focus(view);
                return;
            case 2:
                ((C3830t) this.f41564a).setNativeSelected(view, readableArray.getInt(0));
                return;
            default:
                return;
        }
    }
}
