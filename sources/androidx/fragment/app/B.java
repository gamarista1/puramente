package androidx.fragment.app;

import S1.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class B implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final J f16687a;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f16688a;

        a(Q q10) {
            this.f16688a = q10;
        }

        public void onViewAttachedToWindow(View view) {
            C1769q k10 = this.f16688a.k();
            this.f16688a.m();
            b0.u((ViewGroup) k10.mView.getParent(), B.this.f16687a).q();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    B(J j10) {
        this.f16687a = j10;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Q q10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f16687a);
        }
        C1769q qVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f5845a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.f5846b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.f5847c, -1);
        String string = obtainStyledAttributes.getString(c.f5848d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1777z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            qVar = this.f16687a.k0(resourceId);
        }
        if (qVar == null && string != null) {
            qVar = this.f16687a.l0(string);
        }
        if (qVar == null && id2 != -1) {
            qVar = this.f16687a.k0(id2);
        }
        if (qVar == null) {
            qVar = this.f16687a.w0().a(context.getClassLoader(), attributeValue);
            qVar.mFromLayout = true;
            qVar.mFragmentId = resourceId != 0 ? resourceId : id2;
            qVar.mContainerId = id2;
            qVar.mTag = string;
            qVar.mInLayout = true;
            J j10 = this.f16687a;
            qVar.mFragmentManager = j10;
            qVar.mHost = j10.y0();
            qVar.onInflate(this.f16687a.y0().f(), attributeSet, qVar.mSavedFragmentState);
            q10 = this.f16687a.j(qVar);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Fragment " + qVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!qVar.mInLayout) {
            qVar.mInLayout = true;
            J j11 = this.f16687a;
            qVar.mFragmentManager = j11;
            qVar.mHost = j11.y0();
            qVar.onInflate(this.f16687a.y0().f(), attributeSet, qVar.mSavedFragmentState);
            q10 = this.f16687a.x(qVar);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + qVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        T1.c.g(qVar, viewGroup);
        qVar.mContainer = viewGroup;
        q10.m();
        q10.j();
        View view2 = qVar.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (qVar.mView.getTag() == null) {
                qVar.mView.setTag(string);
            }
            qVar.mView.addOnAttachStateChangeListener(new a(q10));
            return qVar.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
