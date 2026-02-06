package u2;

import W2.h;
import W2.l;
import X2.c;
import f2.s;
import java.util.Objects;

/* renamed from: u2.g  reason: case insensitive filesystem */
public interface C2703g {

    /* renamed from: a  reason: collision with root package name */
    public static final C2703g f26559a = new a();

    /* renamed from: u2.g$a */
    class a implements C2703g {

        /* renamed from: b  reason: collision with root package name */
        private final h f26560b = new h();

        a() {
        }

        public boolean a(s sVar) {
            String str = sVar.f20083n;
            if (this.f26560b.a(sVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708")) {
                return true;
            }
            return false;
        }

        public l b(s sVar) {
            String str = sVar.f20083n;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                        return new X2.a(str, sVar.f20064G, 16000);
                    case 2:
                        return new c(sVar.f20064G, sVar.f20086q);
                }
            }
            if (this.f26560b.a(sVar)) {
                W2.s b10 = this.f26560b.b(sVar);
                return new C2698b(b10.getClass().getSimpleName() + "Decoder", b10);
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(s sVar);

    l b(s sVar);
}
