package io.intercom.android.sdk.conversation;

public interface UploadProgressListener {
    void uploadNotice(byte b10);

    void uploadSmoothEnd();

    void uploadStarted();

    void uploadStopped();
}
