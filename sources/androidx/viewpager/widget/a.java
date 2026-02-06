package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable = new DataSetObservable();
    private DataSetObserver mViewPagerObserver;

    @Deprecated
    public void destroyItem(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract void destroyItem(ViewGroup viewGroup, int i10, Object obj);

    @Deprecated
    public void finishUpdate(View view) {
    }

    public abstract void finishUpdate(ViewGroup viewGroup);

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        return -1;
    }

    public CharSequence getPageTitle(int i10) {
        return null;
    }

    public float getPageWidth(int i10) {
        return 1.0f;
    }

    @Deprecated
    public Object instantiateItem(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract Object instantiateItem(ViewGroup viewGroup, int i10);

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.mViewPagerObserver;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public abstract void restoreState(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable saveState();

    @Deprecated
    public void setPrimaryItem(View view, int i10, Object obj) {
    }

    public abstract void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj);

    /* access modifiers changed from: package-private */
    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    @Deprecated
    public void startUpdate(View view) {
    }

    public abstract void startUpdate(ViewGroup viewGroup);

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }
}
