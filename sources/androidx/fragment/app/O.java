package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1790m;
import androidx.viewpager.widget.a;
import com.revenuecat.purchases.common.Constants;

public abstract class O extends a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private T mCurTransaction;
    private C1769q mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final J mFragmentManager;

    public O(J j10) {
        this(j10, 0);
    }

    private static String a(int i10, long j10) {
        return "android:switcher:" + i10 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + j10;
    }

    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        C1769q qVar = (C1769q) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.p();
        }
        this.mCurTransaction.l(qVar);
        if (qVar.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(ViewGroup viewGroup) {
        T t10 = this.mCurTransaction;
        if (t10 != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    t10.k();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th2) {
                    this.mExecutingFinishUpdate = false;
                    throw th2;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract C1769q getItem(int i10);

    public long getItemId(int i10) {
        return (long) i10;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.p();
        }
        long itemId = getItemId(i10);
        C1769q l02 = this.mFragmentManager.l0(a(viewGroup.getId(), itemId));
        if (l02 != null) {
            this.mCurTransaction.g(l02);
        } else {
            l02 = getItem(i10);
            this.mCurTransaction.c(viewGroup.getId(), l02, a(viewGroup.getId(), itemId));
        }
        if (l02 != this.mCurrentPrimaryItem) {
            l02.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.v(l02, C1790m.b.STARTED);
            } else {
                l02.setUserVisibleHint(false);
            }
        }
        return l02;
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((C1769q) obj).getView() == view) {
            return true;
        }
        return false;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        C1769q qVar = (C1769q) obj;
        C1769q qVar2 = this.mCurrentPrimaryItem;
        if (qVar != qVar2) {
            if (qVar2 != null) {
                qVar2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.p();
                    }
                    this.mCurTransaction.v(this.mCurrentPrimaryItem, C1790m.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            qVar.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.p();
                }
                this.mCurTransaction.v(qVar, C1790m.b.RESUMED);
            } else {
                qVar.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = qVar;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public O(J j10, int i10) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = j10;
        this.mBehavior = i10;
    }
}
