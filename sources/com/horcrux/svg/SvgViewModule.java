package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

@Q7.a(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f58841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f58842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f58843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58844d;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a  reason: collision with other inner class name */
        class C0870a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a  reason: collision with other inner class name */
            class C0871a implements Runnable {
                C0871a() {
                }

                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f58841a, aVar.f58842b, aVar.f58843c, aVar.f58844d + 1);
                }
            }

            C0870a() {
            }

            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f58841a);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new C0871a());
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f58841a, aVar.f58842b, aVar.f58843c, aVar.f58844d + 1);
            }
        }

        a(int i10, ReadableMap readableMap, Callback callback, int i11) {
            this.f58841a = i10;
            this.f58842b = readableMap;
            this.f58843c = callback;
            this.f58844d = i11;
        }

        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f58841a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f58841a, new C0870a());
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
            } else {
                ReadableMap readableMap = this.f58842b;
                if (readableMap != null) {
                    this.f58843c.invoke(svgViewByTag.toDataURL(readableMap.getInt(Snapshot.WIDTH), this.f58842b.getInt(Snapshot.HEIGHT)));
                } else {
                    this.f58843c.invoke(svgViewByTag.toDataURL());
                }
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public static void toDataURL(int i10, ReadableMap readableMap, Callback callback, int i11) {
        UiThreadUtil.runOnUiThread(new a(i10, readableMap, callback, i11));
    }

    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @ReactMethod
    public void toDataURL(Double d10, ReadableMap readableMap, Callback callback) {
        toDataURL(d10.intValue(), readableMap, callback, 0);
    }
}
