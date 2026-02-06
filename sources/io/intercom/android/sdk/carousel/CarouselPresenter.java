package io.intercom.android.sdk.carousel;

import android.text.TextUtils;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.BaseCallback;
import io.intercom.android.sdk.api.ErrorObject;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Iterator;
import java.util.List;

public final class CarouselPresenter {
    private final Api api;
    /* access modifiers changed from: private */
    public Carousel carousel;
    private String carouselId = null;
    /* access modifiers changed from: private */
    public String carouselSource = MetricTracker.CarouselSource.PROGRAMMATIC;
    private final IntercomDataLayer dataLayer;
    private int initialNumberOfScreens;
    /* access modifiers changed from: private */
    public final MetricTracker metricTracker;
    private final PermissionManager permissionManager;
    private UserIdentity userIdentity;
    /* access modifiers changed from: private */
    public CarouselView view = null;

    public CarouselPresenter(Api api2, UserIdentity userIdentity2, MetricTracker metricTracker2, PermissionManager permissionManager2, IntercomDataLayer intercomDataLayer) {
        Carousel carousel2 = Carousel.NULL;
        this.carousel = carousel2;
        this.api = api2;
        this.userIdentity = userIdentity2;
        this.metricTracker = metricTracker2;
        this.permissionManager = permissionManager2;
        this.dataLayer = intercomDataLayer;
        filterCarouselScreens(carousel2);
    }

    private void fetchAutomaticCarousel() {
        Carousel carousel2 = ((OverlayState) this.dataLayer.getOverlayState().getValue()).getCarousel();
        this.carousel = carousel2;
        this.initialNumberOfScreens = carousel2.getScreens().size();
        filterCarouselScreens(this.carousel);
        CarouselView carouselView = this.view;
        if (carouselView != null) {
            carouselView.showSuccess(this.carousel);
        }
    }

    private void fetchProgrammaticCarousel(final String str) {
        this.metricTracker.startedCarouselFetching(str, this.carouselSource);
        CarouselView carouselView = this.view;
        if (carouselView != null) {
            carouselView.showLoading();
        }
        this.api.fetchProgrammaticCarousel(str, new BaseCallback<CarouselResponse.Builder>() {
            /* access modifiers changed from: protected */
            public void onError(ErrorObject errorObject) {
                CarouselPresenter.this.metricTracker.failedCarousel(str, CarouselPresenter.this.carouselSource, errorObject.getStatusCode());
                if (CarouselPresenter.this.view == null) {
                    return;
                }
                if (errorObject.getStatusCode() == 404) {
                    CarouselPresenter.this.view.showNotFoundError();
                } else {
                    CarouselPresenter.this.view.showGenericError();
                }
            }

            /* access modifiers changed from: protected */
            public void onSuccess(CarouselResponse.Builder builder) {
                Carousel unused = CarouselPresenter.this.carousel = builder.build().carousel().build();
                if (CarouselPresenter.this.view != null) {
                    CarouselPresenter.this.view.showSuccess(CarouselPresenter.this.carousel);
                }
            }
        });
    }

    private boolean isTriggeredFromCode() {
        return this.carouselSource.equals(MetricTracker.CarouselSource.PROGRAMMATIC);
    }

    private boolean noUserRegistered() {
        if (!this.userIdentity.identityExists() || this.userIdentity.isSoftReset()) {
            return true;
        }
        return false;
    }

    private void setSource(String str) {
        String str2;
        if (str == null) {
            str2 = MetricTracker.CarouselSource.AUTOMATIC;
        } else {
            str2 = MetricTracker.CarouselSource.PROGRAMMATIC;
        }
        this.carouselSource = str2;
    }

    public void attachView(CarouselView carouselView) {
        this.view = carouselView;
    }

    public void detachView() {
        this.view = null;
    }

    public void fetchCarousel(String str) {
        this.carouselId = str;
        setSource(str);
        if (!MetricTracker.CarouselSource.PROGRAMMATIC.equals(this.carouselSource)) {
            fetchAutomaticCarousel();
        } else if (TextUtils.isEmpty(str)) {
            this.view.logEmptyCarouselError();
            this.view.showNotFoundError();
        } else if (noUserRegistered()) {
            this.view.logUserNotRegisteredError();
            this.view.showNotFoundError();
        } else {
            fetchProgrammaticCarousel(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void filterCarouselScreens(Carousel carousel2) {
        Iterator<CarouselScreen> it = carousel2.getScreens().iterator();
        while (it.hasNext()) {
            if (screenShouldBeRemoved(it.next())) {
                it.remove();
            }
        }
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public String getCarouselSource() {
        return this.carouselSource;
    }

    public void recordActionButtonTappedStats(String str) {
        this.api.markCarouselActionButtonTapped(getCarousel().getInstanceId(), str, isTriggeredFromCode());
    }

    public void recordDismissedOrCompletedMetric(String str, boolean z10, int i10) {
        String instanceId = getCarousel().getInstanceId();
        if (!TextUtils.isEmpty(instanceId)) {
            int size = getCarousel().getScreens().size();
            if (z10) {
                this.metricTracker.completedCarousel(str, instanceId, this.carouselSource, this.initialNumberOfScreens, size);
                return;
            }
            this.metricTracker.dismissedCarousel(str, instanceId, this.carouselSource, this.initialNumberOfScreens, size, i10);
        } else if (!TextUtils.isEmpty(this.carouselId)) {
            this.metricTracker.dismissedCarouselFetching(str, this.carouselId, this.carouselSource);
        }
    }

    public void recordDismissedOrCompletedStats(boolean z10) {
        String instanceId = getCarousel().getInstanceId();
        if (!TextUtils.isEmpty(instanceId)) {
            if (z10) {
                this.api.markCarouselAsCompleted(instanceId, isTriggeredFromCode());
            } else {
                this.api.markCarouselAsDismissed(instanceId, isTriggeredFromCode());
            }
        }
    }

    public void recordOpenMetric() {
        this.metricTracker.openedCarousel(getCarousel().getInstanceId(), this.carouselSource, this.initialNumberOfScreens, getCarousel().getScreens().size());
    }

    public void recordPermissionRequestedMetric(String str, int[] iArr, String str2) {
        String instanceId = getCarousel().getInstanceId();
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (iArr[i10] == 0) {
                this.api.markPermissionGranted(instanceId, str2, isTriggeredFromCode());
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        this.metricTracker.requestedPermission(str, instanceId, this.carouselSource, z10);
    }

    public void recordScreenSeenStats(String str) {
        this.api.markCarouselScreenViewed(getCarousel().getInstanceId(), str, isTriggeredFromCode());
    }

    public void recordSentToPermissionSettingsMetric(ScreenAction screenAction, String str) {
        String type = screenAction.getType();
        boolean permissionsGranted = this.permissionManager.permissionsGranted(screenAction.getValidPermissions(this.permissionManager));
        String instanceId = getCarousel().getInstanceId();
        if (permissionsGranted) {
            this.api.markPermissionGranted(instanceId, str, isTriggeredFromCode());
        }
        this.metricTracker.sentToPermissionSettings(type, instanceId, this.carouselSource, permissionsGranted);
    }

    public void resetPersistedCarousel() {
        this.dataLayer.clearCarousel();
    }

    public void retryFetch(String str) {
        if (TextUtils.isEmpty(str)) {
            CarouselView carouselView = this.view;
            if (carouselView != null) {
                carouselView.showNotFoundError();
                return;
            }
            return;
        }
        this.metricTracker.retriedCarouselFetching(str, this.carouselSource);
        fetchProgrammaticCarousel(str);
    }

    /* access modifiers changed from: package-private */
    public boolean screenShouldBeRemoved(CarouselScreen carouselScreen) {
        ScreenAction permissionAction = carouselScreen.getPermissionAction();
        if (ScreenAction.NULL.equals(permissionAction)) {
            return false;
        }
        List<String> validPermissions = permissionAction.getValidPermissions(this.permissionManager);
        if (validPermissions.isEmpty() || this.permissionManager.permissionsGranted(validPermissions)) {
            return true;
        }
        return false;
    }
}
