package com.facebook.react;

import C7.d;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.util.Map;

/* renamed from: com.facebook.react.w  reason: case insensitive filesystem */
class C3445w {

    /* renamed from: c  reason: collision with root package name */
    private static final Map f42344c = d.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(86, "stop").b(87, "next").b(88, "previous").b(19, "up").b(22, BlockAlignment.RIGHT).b(20, "down").b(21, BlockAlignment.LEFT).b(165, "info").b(82, "menu").a();

    /* renamed from: a  reason: collision with root package name */
    private int f42345a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final Z f42346b;

    C3445w(Z z10) {
        this.f42346b = z10;
    }

    private void b(String str, int i10) {
        c(str, i10, -1);
    }

    private void c(String str, int i10, int i11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i11);
        if (i10 != -1) {
            writableNativeMap.putInt("tag", i10);
        }
        this.f42346b.p("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i10 = this.f42345a;
        if (i10 != -1) {
            b("blur", i10);
        }
        this.f42345a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map map = f42344c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c((String) map.get(Integer.valueOf(keyCode)), this.f42345a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f42345a != view.getId()) {
            int i10 = this.f42345a;
            if (i10 != -1) {
                b("blur", i10);
            }
            this.f42345a = view.getId();
            b("focus", view.getId());
        }
    }
}
