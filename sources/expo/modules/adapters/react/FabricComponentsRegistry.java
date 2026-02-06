package expo.modules.adapters.react;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/adapters/react/FabricComponentsRegistry;", "", "", "Lcom/facebook/react/uimanager/ViewManager;", "viewManagerList", "<init>", "(Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "", "componentNames", "Llf/M;", "registerComponentsRegistry", "([Ljava/lang/String;)V", "finalize", "()V", "a", "Ljava/util/List;", "mHybridData", "Lcom/facebook/jni/HybridData;", "b", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FabricComponentsRegistry {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60114b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f60115c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List f60116a;
    private final HybridData mHybridData;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("expo-modules-core");
    }

    public FabricComponentsRegistry(List list) {
        C6496s.h(list, "viewManagerList");
        Iterable<ViewManager> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (ViewManager name : iterable) {
            arrayList.add(name.getName());
        }
        this.f60116a = arrayList;
        this.mHybridData = initHybrid();
        registerComponentsRegistry((String[]) arrayList.toArray(new String[0]));
    }

    private final native HybridData initHybrid();

    private final native void registerComponentsRegistry(String[] strArr);

    /* access modifiers changed from: protected */
    public final void finalize() {
        this.mHybridData.resetNative();
    }
}
