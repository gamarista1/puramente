package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class n extends l {

    /* renamed from: d  reason: collision with root package name */
    private static final UriMatcher f39149d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f39149d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream h(Uri uri, ContentResolver contentResolver) {
        int match = f39149d.match(uri);
        if (match != 1) {
            if (match == 3) {
                return i(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return i(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    private InputStream i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public Class a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public InputStream e(Uri uri, ContentResolver contentResolver) {
        InputStream h10 = h(uri, contentResolver);
        if (h10 != null) {
            return h10;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
