package expo.modules.interfaces.taskManager;

import Dd.d;
import Pd.f;
import android.content.Context;
import android.support.v4.media.session.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import mf.C6565s;
import pf.C6632a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LZd/a;", "getTaskServiceImpl", "(Landroid/content/Context;)LZd/a;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TaskServiceProviderHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final TaskServiceProviderHelper f60418a = new TaskServiceProviderHelper();

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            Md.a aVar = Md.a.f52052a;
            return C6632a.d(Integer.valueOf(aVar.a(O.b(((f) obj2).getClass()).v())), Integer.valueOf(aVar.a(O.b(((f) obj).getClass()).v())));
        }
    }

    private TaskServiceProviderHelper() {
    }

    public final Zd.a getTaskServiceImpl(Context context) {
        List list;
        C6496s.h(context, "context");
        Method method = d.class.getMethod("getPackageList", (Class[]) null);
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke((Object) null, (Object[]) null);
        if (invoke instanceof List) {
            list = (List) invoke;
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof f) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = C6565s.U0(arrayList, new a()).iterator();
        while (it.hasNext()) {
            it.next();
        }
        c.a(C6565s.q0(arrayList2));
        return null;
    }
}
