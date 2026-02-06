package io.intercom.android.sdk.carousel;

import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import androidx.fragment.app.O;
import java.util.List;

public class CarouselScreenPagerAdapter extends O {
    private List<CarouselScreenFragment> fragments;

    public CarouselScreenPagerAdapter(J j10, List<CarouselScreenFragment> list) {
        super(j10);
        this.fragments = list;
    }

    public int getCount() {
        return this.fragments.size();
    }

    public C1769q getItem(int i10) {
        return this.fragments.get(i10);
    }
}
