package com.vonovak;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;

public class AddCalendarEventModule extends ReactContextBaseJavaModule implements ActivityEventListener, LoaderManager.LoaderCallbacks {
    public static final String ADD_EVENT_MODULE_NAME = "AddCalendarEvent";
    private static final int ADD_EVENT_REQUEST_CODE = 11;
    private static final String CANCELED = "CANCELED";
    private static final String DELETED = "DELETED";
    private static final String DONE = "DONE";
    private static final int POST_RESULT_ID = 2;
    private static final int PRIOR_RESULT_ID = 1;
    private static final String RESPONDED = "RESPONDED";
    private static final String SAVED = "SAVED";
    private static final int SHOW_EVENT_REQUEST_CODE = 12;
    private Long eventPriorId;
    private Promise promise;
    private Long shownOrEditedEventId;

    public AddCalendarEventModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        resetMembers();
    }

    private void destroyLoader(Loader loader) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.getLoaderManager().destroyLoader(loader.getId());
        } else {
            Log.d(ADD_EVENT_MODULE_NAME, "activity was null when attempting to destroy the loader");
        }
    }

    private void determineActionAndResolve(long j10, long j11) {
        boolean z10;
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        if (j11 > j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean a10 = a.a(contentResolver, j11);
        WritableMap createMap = Arguments.createMap();
        String valueOf = String.valueOf(j11);
        if (a10 && z10) {
            createMap.putString("eventIdentifier", valueOf);
            createMap.putString("calendarItemIdentifier", valueOf);
            createMap.putString("action", SAVED);
        } else if (!isEventBeingEdited() || a.a(contentResolver, this.shownOrEditedEventId.longValue())) {
            createMap.putString("action", CANCELED);
        } else {
            createMap.putString("action", DELETED);
        }
        this.promise.resolve(createMap);
    }

    private boolean isEventBeingEdited() {
        if (this.shownOrEditedEventId.longValue() != 0) {
            return true;
        }
        return false;
    }

    private void presentEventAddingActivity(ReadableMap readableMap) {
        try {
            setPriorEventId(getCurrentActivity());
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.item/event").putExtra(b.f37461S, readableMap.getString(b.f37461S));
            if (readableMap.hasKey(b.f37458P)) {
                intent.putExtra("beginTime", a.d(readableMap.getString(b.f37458P)));
            }
            if (readableMap.hasKey(b.f37481d)) {
                intent.putExtra("endTime", a.d(readableMap.getString(b.f37481d)));
            }
            if (readableMap.hasKey("location") && readableMap.getString("location") != null) {
                intent.putExtra("eventLocation", readableMap.getString("location"));
            }
            if (readableMap.hasKey("notes") && readableMap.getString("notes") != null) {
                intent.putExtra(b.f37480c, readableMap.getString("notes"));
            }
            if (readableMap.hasKey("allDay")) {
                intent.putExtra("allDay", readableMap.getBoolean("allDay"));
            }
            getReactApplicationContext().startActivityForResult(intent, 11, Bundle.EMPTY);
        } catch (Exception e10) {
            rejectPromise(e10);
        }
    }

    private void presentEventEditingActivity(ReadableMap readableMap, Intent intent) {
        String string = readableMap.getString("eventId");
        if (!a.b(getReactApplicationContext().getContentResolver(), string)) {
            rejectPromise("event with id " + string + " not found");
            return;
        }
        Long valueOf = Long.valueOf(string);
        this.shownOrEditedEventId = valueOf;
        Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, valueOf.longValue());
        setPriorEventId(getCurrentActivity());
        intent.setData(withAppendedId);
        try {
            getReactApplicationContext().startActivityForResult(intent, 12, Bundle.EMPTY);
        } catch (Exception e10) {
            rejectPromise(e10);
        }
    }

    private void rejectPromise(Exception exc) {
        rejectPromise(exc.getMessage());
    }

    private void resetMembers() {
        this.promise = null;
        this.eventPriorId = 0L;
        this.shownOrEditedEventId = 0L;
    }

    private void returnResultBackToJS(Long l10) {
        Promise promise2 = this.promise;
        if (promise2 == null) {
            Log.e(ADD_EVENT_MODULE_NAME, "promise is null");
            return;
        }
        Long l11 = this.eventPriorId;
        if (l11 == null || l10 == null) {
            promise2.reject(ADD_EVENT_MODULE_NAME, "event prior and/or post id were null, extractLastEventId probably encountered a problem");
        } else {
            determineActionAndResolve(l11.longValue(), l10.longValue());
        }
        resetMembers();
    }

    private void setPostEventId(Activity activity) {
        if (activity != null) {
            activity.getLoaderManager().initLoader(2, (Bundle) null, this);
        }
    }

    private void setPriorEventId(Activity activity) {
        if (activity != null) {
            activity.getLoaderManager().initLoader(1, (Bundle) null, this);
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(DELETED, DELETED);
        hashMap.put(SAVED, SAVED);
        hashMap.put(CANCELED, CANCELED);
        hashMap.put(DONE, DONE);
        hashMap.put(RESPONDED, RESPONDED);
        return hashMap;
    }

    public String getName() {
        return ADD_EVENT_MODULE_NAME;
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if ((i10 == 11 || i10 == 12) && this.promise != null) {
            setPostEventId(activity);
        }
    }

    public Loader onCreateLoader(int i10, Bundle bundle) {
        return new CursorLoader(getReactApplicationContext(), CalendarContract.Events.CONTENT_URI, new String[]{"MAX(_id) as max_id"}, (String) null, (String[]) null, "_id");
    }

    public void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.isClosed()) {
            Log.d(ADD_EVENT_MODULE_NAME, "cursor was closed; loader probably wasn't destroyed previously (destroyLoader() failed)");
            rejectPromise("cursor was closed");
            return;
        }
        Long c10 = a.c(cursor);
        if (loader.getId() == 1) {
            this.eventPriorId = c10;
        } else if (loader.getId() == 2) {
            returnResultBackToJS(c10);
        }
        destroyLoader(loader);
    }

    public void onLoaderReset(Loader loader) {
    }

    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void presentEventCreatingDialog(ReadableMap readableMap, Promise promise2) {
        this.promise = promise2;
        presentEventAddingActivity(readableMap);
    }

    @ReactMethod
    public void presentEventEditingDialog(ReadableMap readableMap, Promise promise2) {
        boolean z10;
        String str;
        this.promise = promise2;
        if (!readableMap.hasKey("useEditIntent") || !readableMap.getBoolean("useEditIntent")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str = "android.intent.action.EDIT";
        } else {
            str = "android.intent.action.VIEW";
        }
        presentEventEditingActivity(readableMap, new Intent(str));
    }

    @ReactMethod
    public void presentEventViewingDialog(ReadableMap readableMap, Promise promise2) {
        this.promise = promise2;
        presentEventEditingActivity(readableMap, new Intent("android.intent.action.VIEW"));
    }

    private void rejectPromise(String str) {
        Promise promise2 = this.promise;
        if (promise2 == null) {
            Log.e(ADD_EVENT_MODULE_NAME, "promise is null");
            return;
        }
        promise2.reject(ADD_EVENT_MODULE_NAME, str);
        resetMembers();
    }
}
