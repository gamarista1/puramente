package com.facebook.react.bridge.queue;

import n7.C3863a;

public class ReactQueueConfigurationSpec {
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) C3863a.c(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) C3863a.c(this.mJSQueueSpec));
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z10;
            if (this.mJSQueueSpec == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3863a.b(z10, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            boolean z10;
            if (this.mNativeModulesQueueSpec == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3863a.b(z10, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    public ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        return new ReactQueueConfigurationSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules"), MessageQueueThreadSpec.newBackgroundThreadSpec("js"));
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }
}
