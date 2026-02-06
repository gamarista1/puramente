package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1790m;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u00072\u00020\u0001:\u0003\r\u0007\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/M;", "Landroid/app/Fragment;", "<init>", "()V", "Landroidx/lifecycle/M$a;", "listener", "Llf/M;", "b", "(Landroidx/lifecycle/M$a;)V", "d", "c", "Landroidx/lifecycle/m$a;", "event", "a", "(Landroidx/lifecycle/m$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "processListener", "e", "Landroidx/lifecycle/M$a;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class M extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final b f17152b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private a f17153a;

    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity, C1790m.a aVar) {
            C6496s.h(activity, "activity");
            C6496s.h(aVar, "event");
            if (activity instanceof C1798v) {
                C1790m lifecycle = ((C1798v) activity).getLifecycle();
                if (lifecycle instanceof C1800x) {
                    ((C1800x) lifecycle).i(aVar);
                }
            }
        }

        public final M b(Activity activity) {
            C6496s.h(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C6496s.f(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (M) findFragmentByTag;
        }

        public final void c(Activity activity) {
            C6496s.h(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new M(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(Activity activity) {
                C6496s.h(activity, "activity");
                N.a(activity, new c());
            }

            private a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            M.f17152b.a(activity, C1790m.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C6496s.h(activity, "activity");
            M.f17152b.a(activity, C1790m.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C6496s.h(activity, "activity");
            M.f17152b.a(activity, C1790m.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C6496s.h(activity, "activity");
            M.f17152b.a(activity, C1790m.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C6496s.h(activity, "activity");
            M.f17152b.a(activity, C1790m.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C6496s.h(activity, "activity");
            M.f17152b.a(activity, C1790m.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            C6496s.h(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C6496s.h(activity, "activity");
        }
    }

    private final void a(C1790m.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f17152b;
            Activity activity = getActivity();
            C6496s.g(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public final void e(a aVar) {
        this.f17153a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f17153a);
        a(C1790m.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(C1790m.a.ON_DESTROY);
        this.f17153a = null;
    }

    public void onPause() {
        super.onPause();
        a(C1790m.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f17153a);
        a(C1790m.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f17153a);
        a(C1790m.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(C1790m.a.ON_STOP);
    }
}
