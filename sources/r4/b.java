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
import java.io.File;
import java.io.FileOutputStream;
import rh.F;
import rh.y;

public class b extends F {

    /* renamed from: c  reason: collision with root package name */
    String f47931c;

    /* renamed from: d  reason: collision with root package name */
    F f47932d;

    /* renamed from: e  reason: collision with root package name */
    String f47933e;

    /* renamed from: f  reason: collision with root package name */
    long f47934f = 0;

    /* renamed from: g  reason: collision with root package name */
    ReactApplicationContext f47935g;

    /* renamed from: h  reason: collision with root package name */
    FileOutputStream f47936h;

    /* renamed from: i  reason: collision with root package name */
    boolean f47937i;

    private class a implements W {
        private void a(String str, long j10, long j11) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", str);
            createMap.putString("written", String.valueOf(j10));
            createMap.putString("total", String.valueOf(j11));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) b.this.f47935g.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", createMap);
        }

        public void close() {
            b.this.f47936h.close();
        }

        public X timeout() {
            return null;
        }

        public long y1(C5404e eVar, long j10) {
            long j11;
            float f10;
            int i10 = (int) j10;
            try {
                byte[] bArr = new byte[i10];
                long read = (long) b.this.f47932d.a().read(bArr, 0, i10);
                b bVar = b.this;
                long j12 = bVar.f47934f;
                int i11 = (read > 0 ? 1 : (read == 0 ? 0 : -1));
                if (i11 > 0) {
                    j11 = read;
                } else {
                    j11 = 0;
                }
                bVar.f47934f = j12 + j11;
                if (i11 > 0) {
                    bVar.f47936h.write(bArr, 0, (int) read);
                } else if (bVar.o() == -1 && read == -1) {
                    b.this.f47937i = true;
                }
                j l10 = k.l(b.this.f47931c);
                if (b.this.o() != 0) {
                    if (b.this.o() != -1) {
                        b bVar2 = b.this;
                        f10 = (float) (bVar2.f47934f / bVar2.o());
                    } else {
                        f10 = b.this.f47937i ? 1.0f : 0.0f;
                    }
                    if (l10 != null && l10.a(f10)) {
                        if (b.this.o() != -1) {
                            b bVar3 = b.this;
                            a(bVar3.f47931c, bVar3.f47934f, bVar3.o());
                        } else {
                            b bVar4 = b.this;
                            if (!bVar4.f47937i) {
                                a(bVar4.f47931c, 0, bVar4.o());
                            } else {
                                String str = bVar4.f47931c;
                                long j13 = bVar4.f47934f;
                                a(str, j13, j13);
                            }
                        }
                    }
                }
                return read;
            } catch (Exception unused) {
                return -1;
            }
        }

        private a() {
        }
    }

    public b(ReactApplicationContext reactApplicationContext, String str, F f10, String str2, boolean z10) {
        this.f47935g = reactApplicationContext;
        this.f47931c = str;
        this.f47932d = f10;
        this.f47933e = str2;
        this.f47937i = false;
        if (str2 != null) {
            boolean z11 = !z10;
            String replace = str2.replace("?append=true", "");
            this.f47933e = replace;
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.f47936h = new FileOutputStream(new File(replace), z11);
                return;
            }
            throw new IllegalStateException("Couldn't create dir: " + parentFile);
        }
    }

    public boolean F() {
        if (this.f47934f == o() || (o() == -1 && this.f47937i)) {
            return true;
        }
        return false;
    }

    public long o() {
        return this.f47932d.o();
    }

    public y q() {
        return this.f47932d.q();
    }

    public C5406g y() {
        return H.d(new a());
    }
}
