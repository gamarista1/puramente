package expo.modules.adapters.react;

import Md.c;
import Pd.f;
import android.content.Context;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private Collection f60123b;

    /* renamed from: c  reason: collision with root package name */
    private Collection f60124c;

    public b(List list, List list2) {
        super(list);
        this.f60124c = list2;
    }

    private Collection d(Context context) {
        Collection collection = this.f60124c;
        if (collection != null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        for (f c10 : a()) {
            arrayList.addAll(c10.c(context));
        }
        return arrayList;
    }

    public Md.b b(Context context) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        for (f fVar : a()) {
            arrayList.addAll(fVar.f(context));
            if (fVar instanceof P) {
                cVar.a((P) fVar);
            }
        }
        arrayList.add(cVar);
        return new Md.b(arrayList, d(context));
    }

    public Collection c(ReactApplicationContext reactApplicationContext) {
        Collection collection = this.f60123b;
        if (collection != null) {
            return collection;
        }
        this.f60123b = new HashSet();
        for (f fVar : a()) {
            if (fVar instanceof P) {
                this.f60123b.addAll(((P) fVar).createViewManagers(reactApplicationContext));
            }
        }
        return this.f60123b;
    }
}
