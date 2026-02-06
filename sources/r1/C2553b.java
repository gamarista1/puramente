package r1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.C1679b;

/* renamed from: r1.b  reason: case insensitive filesystem */
public interface C2553b extends MenuItem {
    C1679b a();

    C2553b b(C1679b bVar);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i10);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c10, int i10);

    C2553b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c10, int i10);

    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    void setShowAsAction(int i10);

    MenuItem setShowAsActionFlags(int i10);

    C2553b setTooltipText(CharSequence charSequence);
}
