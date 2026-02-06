package I8;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static int f31778c = 4;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f31779a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f31780b;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        static final a f31781a = new a();
    }

    public static a b() {
        return b.f31781a;
    }

    public int a() {
        return this.f31780b.getAndIncrement();
    }

    public Looper c(int i10) {
        int i11 = i10 % f31778c;
        if (i11 >= this.f31779a.size()) {
            HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i11);
            handlerThread.start();
            this.f31779a.add(handlerThread);
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                return looper;
            }
            return Looper.getMainLooper();
        } else if (this.f31779a.get(i11) == null) {
            return Looper.getMainLooper();
        } else {
            Looper looper2 = ((HandlerThread) this.f31779a.get(i11)).getLooper();
            if (looper2 != null) {
                return looper2;
            }
            return Looper.getMainLooper();
        }
    }

    private a() {
        this.f31779a = new ArrayList();
        this.f31780b = new AtomicInteger(0);
    }
}
