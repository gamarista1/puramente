package io.intercom.android.sdk.m5.home.reducers;

import io.intercom.android.sdk.m5.home.data.Badge;
import io.intercom.android.sdk.m5.home.data.BadgeType;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"reduceHomeItemBadge", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "badge", "Lio/intercom/android/sdk/m5/home/data/Badge;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeItemBadgeReducerKt {
    public static final HomeItemBadge reduceHomeItemBadge(Badge badge) {
        if (badge == null) {
            return HomeItemBadge.None.INSTANCE;
        }
        if (badge.getBadgeType() == BadgeType.PASSIVE) {
            return HomeItemBadge.IconWithIndicator.INSTANCE;
        }
        if (badge.getBadgeType() != BadgeType.UNREAD || badge.getLabel() == null) {
            return HomeItemBadge.None.INSTANCE;
        }
        return new HomeItemBadge.IndicatorWithCount(Integer.parseInt(badge.getLabel()));
    }
}
