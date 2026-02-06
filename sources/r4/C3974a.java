package r4;

import Gh.C5404e;
import Gh.C5406g;
import Gh.H;
import Gh.W;
import Gh.X;
import com.ReactNativeBlobUtil.j;
import com.ReactNativeBlobUtil.k;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import rh.F;
import rh.y;

/* renamed from: r4.a  reason: case insensitive filesystem */
public class C3974a extends F {

    /* renamed from: c  reason: collision with root package name */
    String f47924c;

    /* renamed from: d  reason: collision with root package name */
    ReactApplicationContext f47925d;

    /* renamed from: e  reason: collision with root package name */
    F f47926e;

    /* renamed from: f  reason: collision with root package name */
    boolean f47927f;

    public C3974a(ReactApplicationContext reactApplicationContext, String str, F f10, boolean z10) {
        this.f47925d = reactApplicationContext;
        this.f47924c = str;
        this.f47926e = f10;
        this.f47927f = z10;
    }

    public long o() {
        return this.f47926e.o();
    }

    public y q() {
        return this.f47926e.q();
    }

    public C5406g y() {
        return H.d(new C0722a(this.f47926e.y()));
    }

    /* renamed from: r4.a$a  reason: collision with other inner class name */
    private class C0722a implements W {

        /* renamed from: a  reason: collision with root package name */
        C5406g f47928a;

        /* renamed from: b  reason: collision with root package name */
        long f47929b = 0;

        C0722a(C5406g gVar) {
            this.f47928a = gVar;
        }

        public X timeout() {
            return null;
        }

        public long y1(C5404e eVar, long j10) {
            long j11;
            long y12 = this.f47928a.y1(eVar, j10);
            long j12 = this.f47929b;
            if (y12 > 0) {
                j11 = y12;
            } else {
                j11 = 0;
            }
            this.f47929b = j12 + j11;
            j l10 = k.l(C3974a.this.f47924c);
            long o10 = C3974a.this.o();
            if (!(l10 == null || o10 == 0 || !l10.a((float) (this.f47929b / C3974a.this.o())))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", C3974a.this.f47924c);
                createMap.putString("written", String.valueOf(this.f47929b));
                createMap.putString("total", String.valueOf(C3974a.this.o()));
                if (C3974a.this.f47927f) {
                    createMap.putString("chunk", eVar.b1(Charset.defaultCharset()));
                } else {
                    createMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) C3974a.this.f47925d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", createMap);
            }
            return y12;
        }

        public void close() {
        }
    }
}
