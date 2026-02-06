package U6;

import O6.b;
import W5.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c6.C3178a;
import c7.C3189i;
import com.facebook.imagepipeline.memory.d;
import f7.D;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c implements C3178a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34415c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f34416a;

    /* renamed from: b  reason: collision with root package name */
    private final d f34417b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final BitmapFactory.Options b(int i10, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i10;
            options.inMutable = true;
            return options;
        }

        private a() {
        }
    }

    public c(D d10) {
        C6496s.h(d10, "poolFactory");
        this.f34416a = new b(d10.h());
        d d11 = d10.d();
        C6496s.g(d11, "getFlexByteArrayPool(...)");
        this.f34417b = d11;
    }

    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        C3189i iVar;
        C6496s.h(config, "bitmapConfig");
        X5.a a10 = this.f34416a.a((short) i10, (short) i11);
        C6496s.g(a10, "generate(...)");
        X5.a aVar = null;
        try {
            iVar = new C3189i(a10);
            try {
                iVar.L0(b.f33373b);
                BitmapFactory.Options a11 = f34415c.b(iVar.I(), config);
                int size = ((h) a10.I()).size();
                Object I10 = a10.I();
                C6496s.g(I10, "get(...)");
                aVar = this.f34417b.a(size + 2);
                Object I11 = aVar.I();
                C6496s.g(I11, "get(...)");
                byte[] bArr = (byte[]) I11;
                ((h) I10).c(0, bArr, 0, size);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, a11);
                if (decodeByteArray != null) {
                    decodeByteArray.setHasAlpha(true);
                    decodeByteArray.eraseColor(0);
                    X5.a.E(aVar);
                    C3189i.f(iVar);
                    X5.a.E(a10);
                    return decodeByteArray;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Throwable th2) {
                th = th2;
                X5.a.E(aVar);
                C3189i.f(iVar);
                X5.a.E(a10);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            iVar = null;
            X5.a.E(aVar);
            C3189i.f(iVar);
            X5.a.E(a10);
            throw th;
        }
    }
}
