package m8;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3404c;

/* renamed from: m8.v  reason: case insensitive filesystem */
public class C3834v extends C3404c {
    public C3834v(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r4 = this;
            r6.hashCode()
            r0 = 1
            r1 = 0
            r2 = -1
            int r3 = r6.hashCode()
            switch(r3) {
                case -1955718283: goto L_0x0078;
                case -1783875055: goto L_0x006d;
                case -1439500848: goto L_0x0062;
                case -1321236988: goto L_0x0057;
                case -1151046732: goto L_0x004c;
                case -764307226: goto L_0x0041;
                case -743234512: goto L_0x0036;
                case 529588232: goto L_0x002b;
                case 1097821469: goto L_0x001d;
                case 1233251315: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0082
        L_0x000f:
            java.lang.String r3 = "initialPage"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0019
            goto L_0x0082
        L_0x0019:
            r2 = 9
            goto L_0x0082
        L_0x001d:
            java.lang.String r3 = "pageMargin"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0082
        L_0x0027:
            r2 = 8
            goto L_0x0082
        L_0x002b:
            java.lang.String r3 = "overdrag"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0034
            goto L_0x0082
        L_0x0034:
            r2 = 7
            goto L_0x0082
        L_0x0036:
            java.lang.String r3 = "useLegacy"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x003f
            goto L_0x0082
        L_0x003f:
            r2 = 6
            goto L_0x0082
        L_0x0041:
            java.lang.String r3 = "keyboardDismissMode"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x004a
            goto L_0x0082
        L_0x004a:
            r2 = 5
            goto L_0x0082
        L_0x004c:
            java.lang.String r3 = "scrollEnabled"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0055
            goto L_0x0082
        L_0x0055:
            r2 = 4
            goto L_0x0082
        L_0x0057:
            java.lang.String r3 = "overScrollMode"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            r2 = 3
            goto L_0x0082
        L_0x0062:
            java.lang.String r3 = "orientation"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x006b
            goto L_0x0082
        L_0x006b:
            r2 = 2
            goto L_0x0082
        L_0x006d:
            java.lang.String r3 = "offscreenPageLimit"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0076
            goto L_0x0082
        L_0x0076:
            r2 = r0
            goto L_0x0082
        L_0x0078:
            java.lang.String r3 = "layoutDirection"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = r1
        L_0x0082:
            switch(r2) {
                case 0: goto L_0x0110;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00da;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00ae;
                case 8: goto L_0x009c;
                case 9: goto L_0x008a;
                default: goto L_0x0085;
            }
        L_0x0085:
            super.a(r5, r6, r7)
            goto L_0x0119
        L_0x008a:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            if (r7 != 0) goto L_0x0091
            goto L_0x0097
        L_0x0091:
            java.lang.Double r7 = (java.lang.Double) r7
            int r1 = r7.intValue()
        L_0x0097:
            r6.setInitialPage(r5, r1)
            goto L_0x0119
        L_0x009c:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            if (r7 != 0) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            java.lang.Double r7 = (java.lang.Double) r7
            int r1 = r7.intValue()
        L_0x00a9:
            r6.setPageMargin(r5, r1)
            goto L_0x0119
        L_0x00ae:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            if (r7 != 0) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r1 = r7.booleanValue()
        L_0x00bb:
            r6.setOverdrag(r5, r1)
            goto L_0x0119
        L_0x00bf:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            if (r7 != 0) goto L_0x00c6
            goto L_0x00cc
        L_0x00c6:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
        L_0x00cc:
            r6.setUseLegacy(r5, r0)
            goto L_0x0119
        L_0x00d0:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            java.lang.String r7 = (java.lang.String) r7
            r6.setKeyboardDismissMode(r5, r7)
            goto L_0x0119
        L_0x00da:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            if (r7 != 0) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
        L_0x00e7:
            r6.setScrollEnabled(r5, r0)
            goto L_0x0119
        L_0x00eb:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            java.lang.String r7 = (java.lang.String) r7
            r6.setOverScrollMode(r5, r7)
            goto L_0x0119
        L_0x00f5:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            java.lang.String r7 = (java.lang.String) r7
            r6.setOrientation(r5, r7)
            goto L_0x0119
        L_0x00ff:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            if (r7 != 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            java.lang.Double r7 = (java.lang.Double) r7
            int r1 = r7.intValue()
        L_0x010c:
            r6.setOffscreenPageLimit(r5, r1)
            goto L_0x0119
        L_0x0110:
            com.facebook.react.uimanager.BaseViewManager r6 = r4.f41564a
            m8.w r6 = (m8.C3836w) r6
            java.lang.String r7 = (java.lang.String) r7
            r6.setLayoutDirection(r5, r7)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.C3834v.a(android.view.View, java.lang.String, java.lang.Object):void");
    }

    public void b(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -445763635:
                if (str.equals("setPageWithoutAnimation")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1747675147:
                if (str.equals("setScrollEnabledImperatively")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1984860689:
                if (str.equals("setPage")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((C3836w) this.f41564a).setPageWithoutAnimation(view, readableArray.getInt(0));
                return;
            case 1:
                ((C3836w) this.f41564a).setScrollEnabledImperatively(view, readableArray.getBoolean(0));
                return;
            case 2:
                ((C3836w) this.f41564a).setPage(view, readableArray.getInt(0));
                return;
            default:
                return;
        }
    }
}
