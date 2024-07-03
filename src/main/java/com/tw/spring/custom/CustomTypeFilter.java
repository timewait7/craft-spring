package com.tw.spring.custom;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Set;

public class CustomTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        final AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        final Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        return annotationTypes.contains("org.springframework.stereotype.Controller");
    }
}
