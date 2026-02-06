package U7;

import com.facebook.react.modules.core.JavaTimerManager;
import java.util.Comparator;
import yf.p;

public final /* synthetic */ class e implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f34421a;

    public /* synthetic */ e(p pVar) {
        this.f34421a = pVar;
    }

    public final int compare(Object obj, Object obj2) {
        return JavaTimerManager.C(this.f34421a, obj, obj2);
    }
}
