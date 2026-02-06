package G6;

import G6.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

public class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f31518d = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final List f31519c = new ArrayList(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public void a(String str, Object obj) {
        C6496s.h(str, "id");
        int size = this.f31519c.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                try {
                    ((b) this.f31519c.get(i10)).a(str, obj);
                    C6514M m10 = C6514M.f71813a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in " + "onIntermediateImageSet", e10);
                }
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void b(String str, Object obj, b.a aVar) {
        C6496s.h(str, "id");
        int size = this.f31519c.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                try {
                    ((b) this.f31519c.get(i10)).b(str, obj, aVar);
                    C6514M m10 = C6514M.f71813a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in " + "onSubmit", e10);
                }
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void f(String str, Throwable th2, b.a aVar) {
        C6496s.h(str, "id");
        int size = this.f31519c.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                try {
                    ((b) this.f31519c.get(i10)).f(str, th2, aVar);
                    C6514M m10 = C6514M.f71813a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in " + "onFailure", e10);
                }
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void n(String str, Object obj, b.a aVar) {
        C6496s.h(str, "id");
        int size = this.f31519c.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                try {
                    ((b) this.f31519c.get(i10)).n(str, obj, aVar);
                    C6514M m10 = C6514M.f71813a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in " + "onFinalImageSet", e10);
                }
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void o(String str) {
        C6496s.h(str, "id");
        int size = this.f31519c.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                try {
                    ((b) this.f31519c.get(i10)).o(str);
                    C6514M m10 = C6514M.f71813a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in " + "onIntermediateImageFailed", e10);
                }
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void t(String str, b.a aVar) {
        C6496s.h(str, "id");
        int size = this.f31519c.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                try {
                    ((b) this.f31519c.get(i10)).t(str, aVar);
                    C6514M m10 = C6514M.f71813a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in " + "onRelease", e10);
                }
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void v(b bVar) {
        C6496s.h(bVar, "listener");
        this.f31519c.add(bVar);
    }

    public final synchronized void y(b bVar) {
        C6496s.h(bVar, "listener");
        this.f31519c.remove(bVar);
    }
}
