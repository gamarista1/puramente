package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected final PropertyMetadata _metadata;
    protected transient JsonFormat.Value _propertyFormat;

    protected ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : propertyMetadata;
    }

    @Deprecated
    public final JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
        JsonFormat.Value value;
        AnnotatedMember member;
        if (annotationIntrospector == null || (member = getMember()) == null) {
            value = null;
        } else {
            value = annotationIntrospector.findFormat(member);
        }
        if (value == null) {
            return BeanProperty.EMPTY_FORMAT;
        }
        return value;
    }

    public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        JsonFormat.Value value;
        AnnotatedMember member;
        JsonFormat.Value value2 = this._propertyFormat;
        if (value2 == null) {
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || (member = getMember()) == null) {
                value = null;
            } else {
                value = annotationIntrospector.findFormat(member);
            }
            if (defaultPropertyFormat == null) {
                if (value == null) {
                    value = BeanProperty.EMPTY_FORMAT;
                }
                value2 = value;
            } else {
                if (value != null) {
                    defaultPropertyFormat = defaultPropertyFormat.withOverrides(value);
                }
                value2 = defaultPropertyFormat;
            }
            this._propertyFormat = value2;
        }
        return value2;
    }

    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Value defaultPropertyInclusion = mapperConfig.getDefaultPropertyInclusion(cls);
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (annotationIntrospector == null || member == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(member)) == null) {
            return defaultPropertyInclusion;
        }
        return defaultPropertyInclusion.withOverrides(findPropertyInclusion);
    }

    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public boolean isVirtual() {
        return false;
    }

    protected ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
        this._propertyFormat = concreteBeanPropertyBase._propertyFormat;
    }
}
