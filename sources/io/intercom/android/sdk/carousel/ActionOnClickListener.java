package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.models.carousel.ScreenAction;

class ActionOnClickListener implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    ActionOnClickListener(ScreenAction screenAction2, CarouselListener carouselListener) {
        this.screenAction = screenAction2;
        this.listener = carouselListener;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            io.intercom.android.sdk.models.carousel.ScreenAction r5 = r4.screenAction
            boolean r5 = r5.isPermissionAction()
            if (r5 == 0) goto L_0x0010
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            io.intercom.android.sdk.models.carousel.ScreenAction r0 = r4.screenAction
            r5.requestPermissions(r0)
            return
        L_0x0010:
            io.intercom.android.sdk.models.carousel.ScreenAction r5 = r4.screenAction
            java.lang.String r5 = r5.getType()
            int r0 = r5.hashCode()
            r1 = 2
            r2 = 1
            r3 = 3
            switch(r0) {
                case -1573653227: goto L_0x0049;
                case -567202649: goto L_0x003f;
                case 3321850: goto L_0x0035;
                case 3532159: goto L_0x002b;
                case 1671672458: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0053
        L_0x0021:
            java.lang.String r0 = "dismiss"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0053
            r5 = 0
            goto L_0x0054
        L_0x002b:
            java.lang.String r0 = "skip"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0053
            r5 = r3
            goto L_0x0054
        L_0x0035:
            java.lang.String r0 = "link"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0053
            r5 = r2
            goto L_0x0054
        L_0x003f:
            java.lang.String r0 = "continue"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0053
            r5 = 4
            goto L_0x0054
        L_0x0049:
            java.lang.String r0 = "start_chat"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0053
            r5 = r1
            goto L_0x0054
        L_0x0053:
            r5 = -1
        L_0x0054:
            java.lang.String r0 = "from_cta"
            if (r5 == 0) goto L_0x0086
            if (r5 == r2) goto L_0x0075
            if (r5 == r1) goto L_0x006a
            if (r5 == r3) goto L_0x0064
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.selectNextScreen(r0)
            goto L_0x0090
        L_0x0064:
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.skipPermissionScreen()
            goto L_0x0090
        L_0x006a:
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.trackActionButtonTappedStats()
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.startChat()
            goto L_0x0090
        L_0x0075:
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.trackActionButtonTappedStats()
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            io.intercom.android.sdk.models.carousel.ScreenAction r0 = r4.screenAction
            java.lang.String r0 = r0.getUri()
            r5.openLink(r0)
            goto L_0x0090
        L_0x0086:
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.trackActionButtonTappedStats()
            io.intercom.android.sdk.carousel.CarouselListener r5 = r4.listener
            r5.dismissCarousel(r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.carousel.ActionOnClickListener.onClick(android.view.View):void");
    }
}
